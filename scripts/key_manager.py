#!/usr/bin/env python3
"""
key_manager.py
=========================================================
ระบบจัดการและสลับ KKU IntelSphere API Keys อัตโนมัติ (Key Rotation)
สำหรับ ProjectSQA AI Benchmark Runner

คุณสมบัติ:
1. โหลด Key จาก .env (KKU_API_KEY_1, KKU_API_KEY_2, ... หรือ KKU_API_KEY)
2. ติดตามการใช้งาน Token แยกตาม Key และแยกตาม Model (Gemini / Claude)
3. สลับ Key ถัดไปอัตโนมัติเมื่อ Quota ประจำวันของ Key ปัจจุบันหมด
4. บันทึกและกู้คืนสถานะการใช้งานลง logs/key_usage_state.json
5. ตรวจสอบการรีเซ็ต Quota ข้ามวัน (Daily Reset) อัตโนมัติ
=========================================================
"""

import json
import os
import re
import sys
from datetime import datetime
from pathlib import Path
from typing import Dict, List, Optional, Tuple, Any

if hasattr(sys.stdout, "reconfigure"):
    try:
        sys.stdout.reconfigure(encoding="utf-8", errors="replace")
        sys.stderr.reconfigure(encoding="utf-8", errors="replace")
    except Exception:
        pass


try:
    from dotenv import load_dotenv
    _DOTENV_AVAILABLE = True
except ImportError:
    _DOTENV_AVAILABLE = False


REPO_DIR = Path(__file__).resolve().parent
if REPO_DIR.name == "scripts":
    REPO_DIR = REPO_DIR.parent

STATE_FILE = REPO_DIR / "logs" / "key_usage_state.json"


def mask_key(key: str) -> str:
    """ซ่อนบางส่วนของ API key เพื่อความปลอดภัยใน log"""
    if not key:
        return "<empty>"
    if len(key) <= 8:
        return f"{key[:2]}...{key[-2:]}"
    return f"{key[:4]}...{key[-4:]}"


def normalize_model_family(model_name: str) -> str:
    """แปลงชื่อโมเดลเป็น family: 'gemini' หรือ 'claude'"""
    m = model_name.lower()
    if "gemini" in m:
        return "gemini"
    elif "claude" in m:
        return "claude"
    return m


class KeyInfo:
    """ข้อมูลประจำแต่ละ API Key"""
    def __init__(self, key_id: str, api_key: str):
        self.key_id: str = key_id            # เช่น "KEY_1", "KEY_2"
        self.api_key: str = api_key          # API token จริง
        # สถานะต่อ model family: "active", "exhausted", "error"
        self.status: Dict[str, str] = {
            "gemini": "active",
            "claude": "active",
        }
        # token ที่ใช้ไปในวันนี้
        self.tokens_used: Dict[str, int] = {
            "gemini": 0,
            "claude": 0,
        }
        # token คงเหลือที่ API รายงานล่าสุด (None = ยังไม่มีข้อมูล)
        self.tokens_remaining: Dict[str, Optional[int]] = {
            "gemini": None,
            "claude": None,
        }
        # จำนวน request ที่สำเร็จ
        self.request_count: Dict[str, int] = {
            "gemini": 0,
            "claude": 0,
        }
        # เหตุผลกรณี exhausted หรือ error
        self.exhausted_reason: Dict[str, str] = {
            "gemini": "",
            "claude": "",
        }

    def is_available(self, model_family: str) -> bool:
        return self.status.get(model_family, "active") == "active"

    def to_dict(self) -> Dict[str, Any]:
        return {
            "key_id": self.key_id,
            "masked_key": mask_key(self.api_key),
            "status": self.status,
            "tokens_used": self.tokens_used,
            "tokens_remaining": self.tokens_remaining,
            "request_count": self.request_count,
            "exhausted_reason": self.exhausted_reason,
        }


class KeyManager:
    """จัดการรายการ API keys และการหมุนเวียน (Rotation)"""

    def __init__(self, env_path: Optional[Path] = None, state_file: Optional[Path] = None):
        self.env_path = env_path or (REPO_DIR / ".env")
        self.state_file = state_file or STATE_FILE
        self.today: str = datetime.now().strftime("%Y-%m-%d")
        self.keys: List[KeyInfo] = []
        self.current_index: Dict[str, int] = {
            "gemini": 0,
            "claude": 0,
        }

        self.load_keys()
        self.load_state()

    def _manual_load_env(self, path: Path):
        """โหลดไฟล์ .env แบบ fallback กรณีไม่มี python-dotenv"""
        if not path.exists():
            return
        for line in path.read_text(encoding="utf-8").splitlines():
            line = line.strip()
            if not line or line.startswith("#"):
                continue
            if "=" in line:
                k, v = line.split("=", 1)
                k = k.strip()
                v = v.strip().strip("'\"")
                if k and v and k not in os.environ:
                    os.environ[k] = v

    def load_keys(self):
        """โหลด API keys จากไฟล์ .env และ Environment Variables"""
        if _DOTENV_AVAILABLE and self.env_path.exists():
            load_dotenv(dotenv_path=self.env_path, override=False)
        elif self.env_path.exists():
            self._manual_load_env(self.env_path)

        # 1. ค้นหาคีย์ที่มีเลขกำกับ เช่น KKU_API_KEY_1 .. KKU_API_KEY_99
        numbered_keys: List[Tuple[int, str, str]] = []
        pattern = re.compile(r"^KKU_API_KEY_(\d+)$", re.IGNORECASE)

        for env_k, env_v in os.environ.items():
            val = env_v.strip()
            if not val:
                continue
            m = pattern.match(env_k)
            if m:
                idx = int(m.group(1))
                numbered_keys.append((idx, f"KEY_{idx}", val))

        numbered_keys.sort(key=lambda x: x[0])

        keys_list: List[KeyInfo] = [KeyInfo(key_id=k_id, api_key=val) for _, k_id, val in numbered_keys]

        # 2. ถ้าไม่มีคีย์แบบมีตัวเลข หรือมี KKU_API_KEY เดี่ยวๆ ที่ยังไม่ถูกใส่
        single_key = os.environ.get("KKU_API_KEY", "").strip()
        if single_key and not any(k.api_key == single_key for k in keys_list):
            keys_list.insert(0, KeyInfo(key_id="DEFAULT_KEY", api_key=single_key))

        self.keys = keys_list

    @property
    def total_keys(self) -> int:
        return len(self.keys)

    def load_state(self):
        """โหลด state ล่าสุดจากไฟล์ JSON เพื่อรันต่อจากจุดเดิมได้"""
        if not self.state_file.exists():
            return

        try:
            data = json.loads(self.state_file.read_text(encoding="utf-8"))
            saved_date = data.get("date")

            # หากข้ามวันแล้ว ให้เริ่มนับ Quota ใหม่ ไม่ restore exhausted status
            if saved_date != self.today:
                print(f"[KeyManager] วันที่เปลี่ยน ({saved_date} -> {self.today}) รีเซ็ต Quota ทุก Key เป็น active")
                return

            saved_keys = data.get("keys", {})
            for key_info in self.keys:
                if key_info.key_id in saved_keys:
                    s = saved_keys[key_info.key_id]
                    key_info.status = s.get("status", key_info.status)
                    key_info.tokens_used = s.get("tokens_used", key_info.tokens_used)
                    key_info.tokens_remaining = s.get("tokens_remaining", key_info.tokens_remaining)
                    key_info.request_count = s.get("request_count", key_info.request_count)
                    key_info.exhausted_reason = s.get("exhausted_reason", key_info.exhausted_reason)

            # โหลด current_index
            self.current_index = data.get("current_index", self.current_index)

        except Exception as e:
            print(f"[KeyManager] คำเตือน: ไม่สามารถโหลด state จาก {self.state_file}: {e}")

    def save_state(self):
        """บันทึก state ปัจจุบันลงไฟล์ JSON"""
        try:
            self.state_file.parent.mkdir(parents=True, exist_ok=True)
            data = {
                "date": self.today,
                "updated_at": datetime.now().isoformat(),
                "total_keys": len(self.keys),
                "current_index": self.current_index,
                "keys": {k.key_id: k.to_dict() for k in self.keys},
            }
            self.state_file.write_text(
                json.dumps(data, indent=2, ensure_ascii=False) + "\n",
                encoding="utf-8"
            )
        except Exception as e:
            print(f"[KeyManager] คำเตือน: ไม่สามารถบันทึก state ลง {self.state_file}: {e}")

    def check_daily_reset(self):
        """ตรวจสอบว่าวันเปลี่ยนหรือไม่ หากเปลี่ยนวันจะรีเซ็ตสถานะทั้งหมด"""
        now_date = datetime.now().strftime("%Y-%m-%d")
        if now_date != self.today:
            print(f"\n[KeyManager] ตรวจพบวันใหม่ ({now_date}) รีเซ็ต Quota การใช้งานของทุก Key")
            self.today = now_date
            for k in self.keys:
                k.status = {"gemini": "active", "claude": "active"}
                k.tokens_used = {"gemini": 0, "claude": 0}
                k.tokens_remaining = {"gemini": None, "claude": None}
                k.request_count = {"gemini": 0, "claude": 0}
                k.exhausted_reason = {"gemini": "", "claude": ""}
            self.current_index = {"gemini": 0, "claude": 0}
            self.save_state()

    def get_current_key(self, model: str) -> Optional[str]:
        """คืนค่า API key ที่ active และพร้อมใช้งานสำหรับ model ที่ระบุ"""
        info = self.get_current_key_info(model)
        return info.api_key if info else None

    def get_current_key_info(self, model: str) -> Optional[KeyInfo]:
        """ค้นหา KeyInfo ที่ active สำหรับ model ที่ระบุ เริ่มจาก current_index"""
        self.check_daily_reset()
        if not self.keys:
            return None

        family = normalize_model_family(model)
        start_idx = self.current_index.get(family, 0)
        n = len(self.keys)

        # วนหา key ที่ยัง active เริ่มจาก index ปัจจุบัน
        for i in range(n):
            idx = (start_idx + i) % n
            key = self.keys[idx]
            if key.is_available(family):
                self.current_index[family] = idx
                return key

        # ทุก key หมด quota สำหรับ model นี้
        return None

    def mark_exhausted(self, key_str: str, model: str, reason: str = "Quota limit reached") -> Optional[str]:
        """ระบุว่า key ปัจจุบันหมด quota สำหรับ model นี้ และหมุนไปยัง key ถัดไป"""
        family = normalize_model_family(model)
        for k in self.keys:
            if k.api_key == key_str:
                k.status[family] = "exhausted"
                k.exhausted_reason[family] = reason
                print(f"[KeyManager] {k.key_id} ({mask_key(k.api_key)}) หมด Quota สำหรับ {family.upper()}! (เหตุผล: {reason})")
                break

        self.save_state()

        # หมุนไปยัง key ถัดไป
        next_info = self.get_current_key_info(model)
        if next_info:
            print(f"[KeyManager] สลับไปใช้ {next_info.key_id} ({mask_key(next_info.api_key)}) สำหรับ {family.upper()}")
            return next_info.api_key
        else:
            print(f"[KeyManager] [คำเตือน] ทุก Key ({len(self.keys)} keys) หมด Quota สำหรับ {family.upper()} ในวันนี้แล้ว!")
            return None

    def record_usage(self, key_str: str, model: str, tokens_used: int, quota_info: Optional[Dict] = None):
        """บันทึกการใช้ token หลัง API call สำเร็จ"""
        family = normalize_model_family(model)
        for k in self.keys:
            if k.api_key == key_str:
                k.tokens_used[family] += tokens_used
                k.request_count[family] += 1
                if quota_info:
                    rem = quota_info.get("daily_remaining_tokens")
                    if rem is not None:
                        k.tokens_remaining[family] = rem
                        # หาก API รายงานว่า token เหลือ 0 ให้มาร์คว่า exhausted ทันที
                        if rem <= 0:
                            self.mark_exhausted(key_str, model, reason="daily_remaining_tokens <= 0")
                break
        self.save_state()

    def is_all_exhausted(self, model: str) -> bool:
        """ตรวจสอบว่าคีย์ทั้งหมดหมด quota สำหรับ model นี้แล้วหรือไม่"""
        family = normalize_model_family(model)
        return self.get_current_key_info(family) is None

    def get_status_summary(self) -> str:
        """แสดงรายงานสรุปสถานะของทุก Key ในปัจจุบัน"""
        self.check_daily_reset()
        lines = [
            f"=" * 70,
            f"KKU IntelSphere Key Status Summary (Date: {self.today})",
            f"Total Keys Registered: {len(self.keys)}",
            f"=" * 70,
        ]

        if not self.keys:
            lines.append("  [!] ไม่พบคีย์ใด ๆ ใน .env หรือ Environment Variables")
            lines.append(f"=" * 70)
            return "\n".join(lines)

        for k in self.keys:
            g_rem = f"{k.tokens_remaining['gemini']:,}" if k.tokens_remaining['gemini'] is not None else "?"
            c_rem = f"{k.tokens_remaining['claude']:,}" if k.tokens_remaining['claude'] is not None else "?"
            lines.append(
                f"  [{k.key_id}] {mask_key(k.api_key):16} | "
                f"GEMINI: {k.status['gemini'].upper():9} (used: {k.tokens_used['gemini']:,}, rem: {g_rem}) | "
                f"CLAUDE: {k.status['claude'].upper():9} (used: {k.tokens_used['claude']:,}, rem: {c_rem})"
            )
        lines.append(f"=" * 70)
        return "\n".join(lines)


if __name__ == "__main__":
    km = KeyManager()
    print(km.get_status_summary())
