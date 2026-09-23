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

public class TarArchiveInputStream_reset_143190083745 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1711;
     Object term14293;

    public TarArchiveInputStream_reset_143190083745() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14339 = Class.forName((String) "java.io.File$PathStatus");
        Field term14338 = ((Class) term14339).getDeclaredField((String) "INVALID");
        ((Field) term14338).setAccessible(true);
        Object enum36 = ((Field) term14338).get((Object) null);
        term1711 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term1712 = (byte[]) newByteArray(1);
        Object term1719 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term1755 = newInstance(Class.forName("java.io.File"));
        byte[] term1784 = (byte[]) newByteArray(0);
        setByteElement(term1712, 0, (byte) 102);
        setField(term1711, term1711.getClass(), "SMALL_BUF", term1712);
        setIntField(term1711, term1711.getClass(), "recordSize", -157887805);
        setIntField(term1711, term1711.getClass(), "blockSize", 1876565163);
        setBooleanField(term1711, term1711.getClass(), "hasHitEOF", false);
        setLongField(term1711, term1711.getClass(), "entrySize", -3842548265506930260L);
        setLongField(term1711, term1711.getClass(), "entryOffset", -5788180182343976541L);
        setField(term1711, term1711.getClass(), "is", null);
        setField(term1719, term1719.getClass(), "name", "");
        setIntField(term1719, term1719.getClass(), "mode", -817164822);
        setLongField(term1719, term1719.getClass(), "userId", 2936323121573284007L);
        setLongField(term1719, term1719.getClass(), "groupId", -1154553077993834885L);
        setLongField(term1719, term1719.getClass(), "size", -2850532706972744550L);
        setLongField(term1719, term1719.getClass(), "modTime", -2644215923136513282L);
        setBooleanField(term1719, term1719.getClass(), "checkSumOK", false);
        setByteField(term1719, term1719.getClass(), "linkFlag", (byte) -118);
        setField(term1719, term1719.getClass(), "linkName", "");
        setField(term1719, term1719.getClass(), "magic", "ustar ");
        setField(term1719, term1719.getClass(), "version", "00");
        setField(term1719, term1719.getClass(), "userName", "root");
        setField(term1719, term1719.getClass(), "groupName", "");
        setIntField(term1719, term1719.getClass(), "devMajor", -1016503459);
        setIntField(term1719, term1719.getClass(), "devMinor", -1968847291);
        setBooleanField(term1719, term1719.getClass(), "isExtended", true);
        setLongField(term1719, term1719.getClass(), "realSize", -1468719814009985452L);
        setField(term1755, term1755.getClass(), "path", "aJlieCFVtF");
        setField(term1755, term1755.getClass(), "status", enum36);
        setIntField(term1755, term1755.getClass(), "prefixLength", 579005622);
        setField(term1755, term1755.getClass(), "filePath", null);
        setField(term1719, term1719.getClass(), "file", term1755);
        setField(term1711, term1711.getClass(), "currEntry", term1719);
        setField(term1711, term1711.getClass(), "zipEncoding", null);
        setField(term1711, term1711.getClass(), "encoding", "ZiaGIbnzTs");
        setField(term1711, term1711.getClass(), "SINGLE", term1784);
        setLongField(term1711, term1711.getClass(), "bytesRead", -7738503207562305297L);
        Class<? extends Object> term14516 = Class.forName((String) "java.io.File$PathStatus");
        Field term14515 = ((Class) term14516).getDeclaredField((String) "INVALID");
        ((Field) term14515).setAccessible(true);
        Object enum37 = ((Field) term14515).get((Object) null);
        term14293 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term14294 = (byte[]) newByteArray(1);
        Object term14295 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term14308 = newInstance(Class.forName("java.io.File"));
        byte[] term14315 = (byte[]) newByteArray(0);
        setByteElement(term14294, 0, (byte) 102);
        setField(term14293, term14293.getClass(), "SMALL_BUF", term14294);
        setIntField(term14293, term14293.getClass(), "recordSize", -157887805);
        setIntField(term14293, term14293.getClass(), "blockSize", 1876565163);
        setBooleanField(term14293, term14293.getClass(), "hasHitEOF", false);
        setLongField(term14293, term14293.getClass(), "entrySize", -3842548265506930260L);
        setLongField(term14293, term14293.getClass(), "entryOffset", -5788180182343976541L);
        setField(term14293, term14293.getClass(), "is", null);
        setField(term14295, term14295.getClass(), "name", "");
        setIntField(term14295, term14295.getClass(), "mode", -817164822);
        setLongField(term14295, term14295.getClass(), "userId", 2936323121573284007L);
        setLongField(term14295, term14295.getClass(), "groupId", -1154553077993834885L);
        setLongField(term14295, term14295.getClass(), "size", -2850532706972744550L);
        setLongField(term14295, term14295.getClass(), "modTime", -2644215923136513282L);
        setBooleanField(term14295, term14295.getClass(), "checkSumOK", false);
        setByteField(term14295, term14295.getClass(), "linkFlag", (byte) -118);
        setField(term14295, term14295.getClass(), "linkName", "");
        setField(term14295, term14295.getClass(), "magic", "ustar ");
        setField(term14295, term14295.getClass(), "version", "00");
        setField(term14295, term14295.getClass(), "userName", "root");
        setField(term14295, term14295.getClass(), "groupName", "");
        setIntField(term14295, term14295.getClass(), "devMajor", -1016503459);
        setIntField(term14295, term14295.getClass(), "devMinor", -1968847291);
        setBooleanField(term14295, term14295.getClass(), "isExtended", true);
        setLongField(term14295, term14295.getClass(), "realSize", -1468719814009985452L);
        setField(term14308, term14308.getClass(), "path", "aJlieCFVtF");
        setField(term14308, term14308.getClass(), "status", enum37);
        setIntField(term14308, term14308.getClass(), "prefixLength", 579005622);
        setField(term14308, term14308.getClass(), "filePath", null);
        setField(term14295, term14295.getClass(), "file", term14308);
        setField(term14293, term14293.getClass(), "currEntry", term14295);
        setField(term14293, term14293.getClass(), "zipEncoding", null);
        setField(term14293, term14293.getClass(), "encoding", "ZiaGIbnzTs");
        setField(term14293, term14293.getClass(), "SINGLE", term14315);
        setLongField(term14293, term14293.getClass(), "bytesRead", -7738503207562305297L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term1711, args);
        assertTrue(recursiveEquals(term1711, term14293));
    }

};


