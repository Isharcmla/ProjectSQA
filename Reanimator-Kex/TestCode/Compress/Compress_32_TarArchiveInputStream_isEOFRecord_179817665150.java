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

public class TarArchiveInputStream_isEOFRecord_179817665150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3020;
     Object term3107;
     Object term17379;
     Object term17402;

    public TarArchiveInputStream_isEOFRecord_179817665150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17430 = Class.forName((String) "java.io.File$PathStatus");
        Field term17429 = ((Class) term17430).getDeclaredField((String) "INVALID");
        ((Field) term17429).setAccessible(true);
        Object enum45 = ((Field) term17429).get((Object) null);
        term3020 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term3021 = (byte[]) newByteArray(4);
        Object term3031 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term3067 = newInstance(Class.forName("java.io.File"));
        byte[] term3096 = (byte[]) newByteArray(9);
        setByteElement(term3021, 0, (byte) -84);
        setByteElement(term3021, 1, (byte) -53);
        setByteElement(term3021, 2, (byte) -93);
        setByteElement(term3021, 3, (byte) 82);
        setField(term3020, term3020.getClass(), "SMALL_BUF", term3021);
        setIntField(term3020, term3020.getClass(), "recordSize", 1265463001);
        setIntField(term3020, term3020.getClass(), "blockSize", 335112684);
        setBooleanField(term3020, term3020.getClass(), "hasHitEOF", true);
        setLongField(term3020, term3020.getClass(), "entrySize", 846579494941632714L);
        setLongField(term3020, term3020.getClass(), "entryOffset", 6689117472719450333L);
        setField(term3020, term3020.getClass(), "is", null);
        setField(term3031, term3031.getClass(), "name", "");
        setIntField(term3031, term3031.getClass(), "mode", 1551099402);
        setLongField(term3031, term3031.getClass(), "userId", 5836128569274066678L);
        setLongField(term3031, term3031.getClass(), "groupId", -2177368829816872572L);
        setLongField(term3031, term3031.getClass(), "size", -8463029266761149071L);
        setLongField(term3031, term3031.getClass(), "modTime", 3133860696238261492L);
        setBooleanField(term3031, term3031.getClass(), "checkSumOK", false);
        setByteField(term3031, term3031.getClass(), "linkFlag", (byte) -89);
        setField(term3031, term3031.getClass(), "linkName", "");
        setField(term3031, term3031.getClass(), "magic", "ustar ");
        setField(term3031, term3031.getClass(), "version", "00");
        setField(term3031, term3031.getClass(), "userName", "root");
        setField(term3031, term3031.getClass(), "groupName", "");
        setIntField(term3031, term3031.getClass(), "devMajor", -2027534003);
        setIntField(term3031, term3031.getClass(), "devMinor", 1063420942);
        setBooleanField(term3031, term3031.getClass(), "isExtended", true);
        setLongField(term3031, term3031.getClass(), "realSize", 7247160664318067468L);
        setField(term3067, term3067.getClass(), "path", "vrQLuWIDJX");
        setField(term3067, term3067.getClass(), "status", enum45);
        setIntField(term3067, term3067.getClass(), "prefixLength", 1375330971);
        setField(term3067, term3067.getClass(), "filePath", null);
        setField(term3031, term3031.getClass(), "file", term3067);
        setField(term3020, term3020.getClass(), "currEntry", term3031);
        setField(term3020, term3020.getClass(), "zipEncoding", null);
        setField(term3020, term3020.getClass(), "encoding", "flxyYxBRtu");
        setByteElement(term3096, 0, (byte) 24);
        setByteElement(term3096, 1, (byte) 123);
        setByteElement(term3096, 2, (byte) -101);
        setByteElement(term3096, 3, (byte) -102);
        setByteElement(term3096, 4, (byte) -95);
        setByteElement(term3096, 5, (byte) -2);
        setByteElement(term3096, 6, (byte) 28);
        setByteElement(term3096, 7, (byte) 84);
        setByteElement(term3096, 8, (byte) 85);
        setField(term3020, term3020.getClass(), "SINGLE", term3096);
        setLongField(term3020, term3020.getClass(), "bytesRead", 2135754395358000892L);
        term3107 = (byte[]) newByteArray(4);
        setByteElement(term3107, 0, (byte) -17);
        setByteElement(term3107, 1, (byte) -83);
        setByteElement(term3107, 2, (byte) 48);
        setByteElement(term3107, 3, (byte) -128);
        Class<? extends Object> term17622 = Class.forName((String) "java.io.File$PathStatus");
        Field term17621 = ((Class) term17622).getDeclaredField((String) "INVALID");
        ((Field) term17621).setAccessible(true);
        Object enum46 = ((Field) term17621).get((Object) null);
        term17379 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term17380 = (byte[]) newByteArray(4);
        Object term17381 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term17394 = newInstance(Class.forName("java.io.File"));
        byte[] term17401 = (byte[]) newByteArray(9);
        setByteElement(term17380, 0, (byte) -84);
        setByteElement(term17380, 1, (byte) -53);
        setByteElement(term17380, 2, (byte) -93);
        setByteElement(term17380, 3, (byte) 82);
        setField(term17379, term17379.getClass(), "SMALL_BUF", term17380);
        setIntField(term17379, term17379.getClass(), "recordSize", 1265463001);
        setIntField(term17379, term17379.getClass(), "blockSize", 335112684);
        setBooleanField(term17379, term17379.getClass(), "hasHitEOF", true);
        setLongField(term17379, term17379.getClass(), "entrySize", 846579494941632714L);
        setLongField(term17379, term17379.getClass(), "entryOffset", 6689117472719450333L);
        setField(term17379, term17379.getClass(), "is", null);
        setField(term17381, term17381.getClass(), "name", "");
        setIntField(term17381, term17381.getClass(), "mode", 1551099402);
        setLongField(term17381, term17381.getClass(), "userId", 5836128569274066678L);
        setLongField(term17381, term17381.getClass(), "groupId", -2177368829816872572L);
        setLongField(term17381, term17381.getClass(), "size", -8463029266761149071L);
        setLongField(term17381, term17381.getClass(), "modTime", 3133860696238261492L);
        setBooleanField(term17381, term17381.getClass(), "checkSumOK", false);
        setByteField(term17381, term17381.getClass(), "linkFlag", (byte) -89);
        setField(term17381, term17381.getClass(), "linkName", "");
        setField(term17381, term17381.getClass(), "magic", "ustar ");
        setField(term17381, term17381.getClass(), "version", "00");
        setField(term17381, term17381.getClass(), "userName", "root");
        setField(term17381, term17381.getClass(), "groupName", "");
        setIntField(term17381, term17381.getClass(), "devMajor", -2027534003);
        setIntField(term17381, term17381.getClass(), "devMinor", 1063420942);
        setBooleanField(term17381, term17381.getClass(), "isExtended", true);
        setLongField(term17381, term17381.getClass(), "realSize", 7247160664318067468L);
        setField(term17394, term17394.getClass(), "path", "vrQLuWIDJX");
        setField(term17394, term17394.getClass(), "status", enum46);
        setIntField(term17394, term17394.getClass(), "prefixLength", 1375330971);
        setField(term17394, term17394.getClass(), "filePath", null);
        setField(term17381, term17381.getClass(), "file", term17394);
        setField(term17379, term17379.getClass(), "currEntry", term17381);
        setField(term17379, term17379.getClass(), "zipEncoding", null);
        setField(term17379, term17379.getClass(), "encoding", "flxyYxBRtu");
        setByteElement(term17401, 0, (byte) 24);
        setByteElement(term17401, 1, (byte) 123);
        setByteElement(term17401, 2, (byte) -101);
        setByteElement(term17401, 3, (byte) -102);
        setByteElement(term17401, 4, (byte) -95);
        setByteElement(term17401, 5, (byte) -2);
        setByteElement(term17401, 6, (byte) 28);
        setByteElement(term17401, 7, (byte) 84);
        setByteElement(term17401, 8, (byte) 85);
        setField(term17379, term17379.getClass(), "SINGLE", term17401);
        setLongField(term17379, term17379.getClass(), "bytesRead", 2135754395358000892L);
        term17402 = (byte[]) newByteArray(4);
        setByteElement(term17402, 0, (byte) -17);
        setByteElement(term17402, 1, (byte) -83);
        setByteElement(term17402, 2, (byte) 48);
        setByteElement(term17402, 3, (byte) -128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term3107;
        Object retValue = callMethod(klass, "isEOFRecord", argTypes, term3020, args);
        assertTrue(recursiveEquals(term3020, term17379));
        assertTrue(recursiveEquals(term3107, term17402));
        assertTrue(recursiveEquals(retValue, false));
    }

};


