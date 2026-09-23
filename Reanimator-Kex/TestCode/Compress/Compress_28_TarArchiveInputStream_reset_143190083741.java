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

public class TarArchiveInputStream_reset_143190083741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1099;
     Object term12753;

    public TarArchiveInputStream_reset_143190083741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12802 = Class.forName((String) "java.io.File$PathStatus");
        Field term12801 = ((Class) term12802).getDeclaredField((String) "CHECKED");
        ((Field) term12801).setAccessible(true);
        Object enum31 = ((Field) term12801).get((Object) null);
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
        setField(term1148, term1148.getClass(), "status", enum31);
        setIntField(term1148, term1148.getClass(), "prefixLength", -817164822);
        setField(term1148, term1148.getClass(), "filePath", null);
        setField(term1112, term1112.getClass(), "file", term1148);
        setField(term1099, term1099.getClass(), "currEntry", term1112);
        setField(term1099, term1099.getClass(), "encoding", null);
        setByteElement(term1165, 0, (byte) 98);
        setByteElement(term1165, 1, (byte) 79);
        setByteElement(term1165, 2, (byte) 61);
        setByteElement(term1165, 3, (byte) -92);
        setByteElement(term1165, 4, (byte) -42);
        setField(term1099, term1099.getClass(), "SINGLE", term1165);
        setLongField(term1099, term1099.getClass(), "bytesRead", 6855071767938501807L);
        Class<? extends Object> term12978 = Class.forName((String) "java.io.File$PathStatus");
        Field term12977 = ((Class) term12978).getDeclaredField((String) "CHECKED");
        ((Field) term12977).setAccessible(true);
        Object enum32 = ((Field) term12977).get((Object) null);
        term12753 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term12754 = (byte[]) newByteArray(6);
        Object term12755 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term12768 = newInstance(Class.forName("java.io.File"));
        byte[] term12773 = (byte[]) newByteArray(5);
        setByteElement(term12754, 0, (byte) -74);
        setByteElement(term12754, 1, (byte) -123);
        setByteElement(term12754, 2, (byte) -23);
        setByteElement(term12754, 3, (byte) 100);
        setByteElement(term12754, 4, (byte) 106);
        setByteElement(term12754, 5, (byte) -57);
        setField(term12753, term12753.getClass(), "SMALL_BUF", term12754);
        setIntField(term12753, term12753.getClass(), "recordSize", -1145578966);
        setIntField(term12753, term12753.getClass(), "blockSize", 679763016);
        setBooleanField(term12753, term12753.getClass(), "hasHitEOF", false);
        setLongField(term12753, term12753.getClass(), "entrySize", 7009926388951271268L);
        setLongField(term12753, term12753.getClass(), "entryOffset", -7672528020740371001L);
        setField(term12753, term12753.getClass(), "is", null);
        setField(term12755, term12755.getClass(), "name", "");
        setIntField(term12755, term12755.getClass(), "mode", 1962444399);
        setIntField(term12755, term12755.getClass(), "userId", 767834723);
        setIntField(term12755, term12755.getClass(), "groupId", -602026508);
        setLongField(term12755, term12755.getClass(), "size", -4502405999831680926L);
        setLongField(term12755, term12755.getClass(), "modTime", 1967728129628047933L);
        setBooleanField(term12755, term12755.getClass(), "checkSumOK", true);
        setByteField(term12755, term12755.getClass(), "linkFlag", (byte) -103);
        setField(term12755, term12755.getClass(), "linkName", "");
        setField(term12755, term12755.getClass(), "magic", "ustar ");
        setField(term12755, term12755.getClass(), "version", "00");
        setField(term12755, term12755.getClass(), "userName", "root");
        setField(term12755, term12755.getClass(), "groupName", "");
        setIntField(term12755, term12755.getClass(), "devMajor", -157887805);
        setIntField(term12755, term12755.getClass(), "devMinor", 1876565163);
        setBooleanField(term12755, term12755.getClass(), "isExtended", false);
        setLongField(term12755, term12755.getClass(), "realSize", 2120084523938730454L);
        setField(term12768, term12768.getClass(), "path", "MjGYSRKTNF");
        setField(term12768, term12768.getClass(), "status", enum32);
        setIntField(term12768, term12768.getClass(), "prefixLength", -817164822);
        setField(term12768, term12768.getClass(), "filePath", null);
        setField(term12755, term12755.getClass(), "file", term12768);
        setField(term12753, term12753.getClass(), "currEntry", term12755);
        setField(term12753, term12753.getClass(), "encoding", null);
        setByteElement(term12773, 0, (byte) 98);
        setByteElement(term12773, 1, (byte) 79);
        setByteElement(term12773, 2, (byte) 61);
        setByteElement(term12773, 3, (byte) -92);
        setByteElement(term12773, 4, (byte) -42);
        setField(term12753, term12753.getClass(), "SINGLE", term12773);
        setLongField(term12753, term12753.getClass(), "bytesRead", 6855071767938501807L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term1099, args);
        assertTrue(recursiveEquals(term1099, term12753));
    }

};


