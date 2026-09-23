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

public class TarArchiveInputStream_markSupported_155692074343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1099;
     Object term12629;

    public TarArchiveInputStream_markSupported_155692074343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13951 = Class.forName((String) "java.io.File$PathStatus");
        Field term13950 = ((Class) term13951).getDeclaredField((String) "CHECKED");
        ((Field) term13950).setAccessible(true);
        Object enum38 = ((Field) term13950).get((Object) null);
        term1099 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term1100 = (byte[]) newByteArray(6);
        Object term1112 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term1148 = newInstance(Class.forName("java.io.File"));
        byte[] term1165 = (byte[]) newByteArray(5);
        setByteElement(term1100, 0, (byte) -74);
        setByteElement(term1100, 1, (byte) -123);
        setByteElement(term1100, 2, (byte) -23);
        setByteElement(term1100, 3, (byte) 100);
        setByteElement(term1100, 4, (byte) 106);
        setByteElement(term1100, 5, (byte) -57);
        setField(term1099, term1099.getClass(), "SMALL_BUF", term1100);
        setIntField(term1099, term1099.getClass(), "recordSize", -1145578966);
        setIntField(term1099, term1099.getClass(), "blockSize", 679763016);
        setBooleanField(term1099, term1099.getClass(), "hasHitEOF", false);
        setLongField(term1099, term1099.getClass(), "entrySize", 7009926388951271268L);
        setLongField(term1099, term1099.getClass(), "entryOffset", -7672528020740371001L);
        setField(term1099, term1099.getClass(), "is", null);
        setField(term1112, term1112.getClass(), "name", "");
        setIntField(term1112, term1112.getClass(), "mode", 1962444399);
        setIntField(term1112, term1112.getClass(), "userId", 767834723);
        setIntField(term1112, term1112.getClass(), "groupId", -602026508);
        setLongField(term1112, term1112.getClass(), "size", -4502405999831680926L);
        setLongField(term1112, term1112.getClass(), "modTime", 1967728129628047933L);
        setBooleanField(term1112, term1112.getClass(), "checkSumOK", true);
        setByteField(term1112, term1112.getClass(), "linkFlag", (byte) -103);
        setField(term1112, term1112.getClass(), "linkName", "");
        setField(term1112, term1112.getClass(), "magic", "ustar ");
        setField(term1112, term1112.getClass(), "version", "00");
        setField(term1112, term1112.getClass(), "userName", "root");
        setField(term1112, term1112.getClass(), "groupName", "");
        setIntField(term1112, term1112.getClass(), "devMajor", -157887805);
        setIntField(term1112, term1112.getClass(), "devMinor", 1876565163);
        setBooleanField(term1112, term1112.getClass(), "isExtended", false);
        setLongField(term1112, term1112.getClass(), "realSize", 2120084523938730454L);
        setField(term1148, term1148.getClass(), "path", "MjGYSRKTNF");
        setField(term1148, term1148.getClass(), "status", enum38);
        setIntField(term1148, term1148.getClass(), "prefixLength", -817164822);
        setField(term1148, term1148.getClass(), "filePath", null);
        setField(term1112, term1112.getClass(), "file", term1148);
        setField(term1099, term1099.getClass(), "currEntry", term1112);
        setField(term1099, term1099.getClass(), "zipEncoding", null);
        setByteElement(term1165, 0, (byte) 98);
        setByteElement(term1165, 1, (byte) 79);
        setByteElement(term1165, 2, (byte) 61);
        setByteElement(term1165, 3, (byte) -92);
        setByteElement(term1165, 4, (byte) -42);
        setField(term1099, term1099.getClass(), "SINGLE", term1165);
        setLongField(term1099, term1099.getClass(), "bytesRead", 6855071767938501807L);
        Class<? extends Object> term14127 = Class.forName((String) "java.io.File$PathStatus");
        Field term14126 = ((Class) term14127).getDeclaredField((String) "CHECKED");
        ((Field) term14126).setAccessible(true);
        Object enum39 = ((Field) term14126).get((Object) null);
        term12629 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term12630 = (byte[]) newByteArray(6);
        Object term12631 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term12644 = newInstance(Class.forName("java.io.File"));
        byte[] term12649 = (byte[]) newByteArray(5);
        setByteElement(term12630, 0, (byte) -74);
        setByteElement(term12630, 1, (byte) -123);
        setByteElement(term12630, 2, (byte) -23);
        setByteElement(term12630, 3, (byte) 100);
        setByteElement(term12630, 4, (byte) 106);
        setByteElement(term12630, 5, (byte) -57);
        setField(term12629, term12629.getClass(), "SMALL_BUF", term12630);
        setIntField(term12629, term12629.getClass(), "recordSize", -1145578966);
        setIntField(term12629, term12629.getClass(), "blockSize", 679763016);
        setBooleanField(term12629, term12629.getClass(), "hasHitEOF", false);
        setLongField(term12629, term12629.getClass(), "entrySize", 7009926388951271268L);
        setLongField(term12629, term12629.getClass(), "entryOffset", -7672528020740371001L);
        setField(term12629, term12629.getClass(), "is", null);
        setField(term12631, term12631.getClass(), "name", "");
        setIntField(term12631, term12631.getClass(), "mode", 1962444399);
        setIntField(term12631, term12631.getClass(), "userId", 767834723);
        setIntField(term12631, term12631.getClass(), "groupId", -602026508);
        setLongField(term12631, term12631.getClass(), "size", -4502405999831680926L);
        setLongField(term12631, term12631.getClass(), "modTime", 1967728129628047933L);
        setBooleanField(term12631, term12631.getClass(), "checkSumOK", true);
        setByteField(term12631, term12631.getClass(), "linkFlag", (byte) -103);
        setField(term12631, term12631.getClass(), "linkName", "");
        setField(term12631, term12631.getClass(), "magic", "ustar ");
        setField(term12631, term12631.getClass(), "version", "00");
        setField(term12631, term12631.getClass(), "userName", "root");
        setField(term12631, term12631.getClass(), "groupName", "");
        setIntField(term12631, term12631.getClass(), "devMajor", -157887805);
        setIntField(term12631, term12631.getClass(), "devMinor", 1876565163);
        setBooleanField(term12631, term12631.getClass(), "isExtended", false);
        setLongField(term12631, term12631.getClass(), "realSize", 2120084523938730454L);
        setField(term12644, term12644.getClass(), "path", "MjGYSRKTNF");
        setField(term12644, term12644.getClass(), "status", enum39);
        setIntField(term12644, term12644.getClass(), "prefixLength", -817164822);
        setField(term12644, term12644.getClass(), "filePath", null);
        setField(term12631, term12631.getClass(), "file", term12644);
        setField(term12629, term12629.getClass(), "currEntry", term12631);
        setField(term12629, term12629.getClass(), "zipEncoding", null);
        setByteElement(term12649, 0, (byte) 98);
        setByteElement(term12649, 1, (byte) 79);
        setByteElement(term12649, 2, (byte) 61);
        setByteElement(term12649, 3, (byte) -92);
        setByteElement(term12649, 4, (byte) -42);
        setField(term12629, term12629.getClass(), "SINGLE", term12649);
        setLongField(term12629, term12629.getClass(), "bytesRead", 6855071767938501807L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "markSupported", argTypes, term1099, args);
        assertTrue(recursiveEquals(term1099, term12629));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


