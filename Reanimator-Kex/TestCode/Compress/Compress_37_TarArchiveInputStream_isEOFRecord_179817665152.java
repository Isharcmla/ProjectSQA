package org.apache.commons.compress.archivers.tar;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.tar.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class TarArchiveInputStream_isEOFRecord_179817665152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3163;
     Object term3263;
     Object term18412;
     Object term18436;

    public TarArchiveInputStream_isEOFRecord_179817665152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18464 = Class.forName((String) "java.io.File$PathStatus");
        Field term18463 = ((Class) term18464).getDeclaredField((String) "CHECKED");
        ((Field) term18463).setAccessible(true);
        Object enum49 = ((Field) term18463).get((Object) null);
        HashMap term3242 = new HashMap();
        term3163 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term3164 = (byte[]) newByteArray(4);
        Object term3174 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term3213 = newInstance(Class.forName("java.io.File"));
        byte[] term3252 = (byte[]) newByteArray(9);
        setByteElement(term3164, 0, (byte) -84);
        setByteElement(term3164, 1, (byte) -53);
        setByteElement(term3164, 2, (byte) -93);
        setByteElement(term3164, 3, (byte) 82);
        setField(term3163, term3163.getClass(), "SMALL_BUF", term3164);
        setIntField(term3163, term3163.getClass(), "recordSize", 1265463001);
        setIntField(term3163, term3163.getClass(), "blockSize", 335112684);
        setBooleanField(term3163, term3163.getClass(), "hasHitEOF", true);
        setLongField(term3163, term3163.getClass(), "entrySize", 846579494941632714L);
        setLongField(term3163, term3163.getClass(), "entryOffset", 6689117472719450333L);
        setField(term3163, term3163.getClass(), "is", null);
        setField(term3174, term3174.getClass(), "name", "");
        setBooleanField(term3174, term3174.getClass(), "preserveLeadingSlashes", true);
        setIntField(term3174, term3174.getClass(), "mode", 1551099402);
        setLongField(term3174, term3174.getClass(), "userId", 5836128569274066678L);
        setLongField(term3174, term3174.getClass(), "groupId", -2177368829816872572L);
        setLongField(term3174, term3174.getClass(), "size", -8463029266761149071L);
        setLongField(term3174, term3174.getClass(), "modTime", 3133860696238261492L);
        setBooleanField(term3174, term3174.getClass(), "checkSumOK", true);
        setByteField(term3174, term3174.getClass(), "linkFlag", (byte) -89);
        setField(term3174, term3174.getClass(), "linkName", "");
        setField(term3174, term3174.getClass(), "magic", "ustar ");
        setField(term3174, term3174.getClass(), "version", "00");
        setField(term3174, term3174.getClass(), "userName", "root");
        setField(term3174, term3174.getClass(), "groupName", "");
        setIntField(term3174, term3174.getClass(), "devMajor", -2027534003);
        setIntField(term3174, term3174.getClass(), "devMinor", 1063420942);
        setBooleanField(term3174, term3174.getClass(), "isExtended", false);
        setLongField(term3174, term3174.getClass(), "realSize", 7247160664318067468L);
        setBooleanField(term3174, term3174.getClass(), "paxGNUSparse", false);
        setBooleanField(term3174, term3174.getClass(), "starSparse", false);
        setField(term3213, term3213.getClass(), "path", "LvtrsXUliU");
        setField(term3213, term3213.getClass(), "status", enum49);
        setIntField(term3213, term3213.getClass(), "prefixLength", 1375330971);
        setField(term3213, term3213.getClass(), "filePath", null);
        setField(term3174, term3174.getClass(), "file", term3213);
        setField(term3163, term3163.getClass(), "currEntry", term3174);
        setField(term3163, term3163.getClass(), "zipEncoding", null);
        setField(term3163, term3163.getClass(), "encoding", "xLbjWUgOIL");
        setField(term3163, term3163.getClass(), "globalPaxHeaders", term3242);
        setByteElement(term3252, 0, (byte) 24);
        setByteElement(term3252, 1, (byte) 123);
        setByteElement(term3252, 2, (byte) -101);
        setByteElement(term3252, 3, (byte) -102);
        setByteElement(term3252, 4, (byte) -95);
        setByteElement(term3252, 5, (byte) -2);
        setByteElement(term3252, 6, (byte) 28);
        setByteElement(term3252, 7, (byte) 84);
        setByteElement(term3252, 8, (byte) 85);
        setField(term3163, term3163.getClass(), "SINGLE", term3252);
        setLongField(term3163, term3163.getClass(), "bytesRead", 2135754395358000892L);
        term3263 = (byte[]) newByteArray(4);
        setByteElement(term3263, 0, (byte) -17);
        setByteElement(term3263, 1, (byte) -83);
        setByteElement(term3263, 2, (byte) 48);
        setByteElement(term3263, 3, (byte) -128);
        Class<? extends Object> term18656 = Class.forName((String) "java.io.File$PathStatus");
        Field term18655 = ((Class) term18656).getDeclaredField((String) "CHECKED");
        ((Field) term18655).setAccessible(true);
        Object enum50 = ((Field) term18655).get((Object) null);
        HashMap term18434 = new HashMap();
        term18412 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term18413 = (byte[]) newByteArray(4);
        Object term18414 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term18427 = newInstance(Class.forName("java.io.File"));
        byte[] term18435 = (byte[]) newByteArray(9);
        setByteElement(term18413, 0, (byte) -84);
        setByteElement(term18413, 1, (byte) -53);
        setByteElement(term18413, 2, (byte) -93);
        setByteElement(term18413, 3, (byte) 82);
        setField(term18412, term18412.getClass(), "SMALL_BUF", term18413);
        setIntField(term18412, term18412.getClass(), "recordSize", 1265463001);
        setIntField(term18412, term18412.getClass(), "blockSize", 335112684);
        setBooleanField(term18412, term18412.getClass(), "hasHitEOF", true);
        setLongField(term18412, term18412.getClass(), "entrySize", 846579494941632714L);
        setLongField(term18412, term18412.getClass(), "entryOffset", 6689117472719450333L);
        setField(term18412, term18412.getClass(), "is", null);
        setField(term18414, term18414.getClass(), "name", "");
        setBooleanField(term18414, term18414.getClass(), "preserveLeadingSlashes", true);
        setIntField(term18414, term18414.getClass(), "mode", 1551099402);
        setLongField(term18414, term18414.getClass(), "userId", 5836128569274066678L);
        setLongField(term18414, term18414.getClass(), "groupId", -2177368829816872572L);
        setLongField(term18414, term18414.getClass(), "size", -8463029266761149071L);
        setLongField(term18414, term18414.getClass(), "modTime", 3133860696238261492L);
        setBooleanField(term18414, term18414.getClass(), "checkSumOK", true);
        setByteField(term18414, term18414.getClass(), "linkFlag", (byte) -89);
        setField(term18414, term18414.getClass(), "linkName", "");
        setField(term18414, term18414.getClass(), "magic", "ustar ");
        setField(term18414, term18414.getClass(), "version", "00");
        setField(term18414, term18414.getClass(), "userName", "root");
        setField(term18414, term18414.getClass(), "groupName", "");
        setIntField(term18414, term18414.getClass(), "devMajor", -2027534003);
        setIntField(term18414, term18414.getClass(), "devMinor", 1063420942);
        setBooleanField(term18414, term18414.getClass(), "isExtended", false);
        setLongField(term18414, term18414.getClass(), "realSize", 7247160664318067468L);
        setBooleanField(term18414, term18414.getClass(), "paxGNUSparse", false);
        setBooleanField(term18414, term18414.getClass(), "starSparse", false);
        setField(term18427, term18427.getClass(), "path", "LvtrsXUliU");
        setField(term18427, term18427.getClass(), "status", enum50);
        setIntField(term18427, term18427.getClass(), "prefixLength", 1375330971);
        setField(term18427, term18427.getClass(), "filePath", null);
        setField(term18414, term18414.getClass(), "file", term18427);
        setField(term18412, term18412.getClass(), "currEntry", term18414);
        setField(term18412, term18412.getClass(), "zipEncoding", null);
        setField(term18412, term18412.getClass(), "encoding", "xLbjWUgOIL");
        setField(term18412, term18412.getClass(), "globalPaxHeaders", term18434);
        setByteElement(term18435, 0, (byte) 24);
        setByteElement(term18435, 1, (byte) 123);
        setByteElement(term18435, 2, (byte) -101);
        setByteElement(term18435, 3, (byte) -102);
        setByteElement(term18435, 4, (byte) -95);
        setByteElement(term18435, 5, (byte) -2);
        setByteElement(term18435, 6, (byte) 28);
        setByteElement(term18435, 7, (byte) 84);
        setByteElement(term18435, 8, (byte) 85);
        setField(term18412, term18412.getClass(), "SINGLE", term18435);
        setLongField(term18412, term18412.getClass(), "bytesRead", 2135754395358000892L);
        term18436 = (byte[]) newByteArray(4);
        setByteElement(term18436, 0, (byte) -17);
        setByteElement(term18436, 1, (byte) -83);
        setByteElement(term18436, 2, (byte) 48);
        setByteElement(term18436, 3, (byte) -128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3263;
        Object retValue = callMethod(klass, "isEOFRecord", argTypes, term3163, args);
        assertTrue(recursiveEquals(term3163, term18412));
        assertTrue(recursiveEquals(term3263, term18436));
        assertTrue(recursiveEquals(retValue, false));
    }

};


