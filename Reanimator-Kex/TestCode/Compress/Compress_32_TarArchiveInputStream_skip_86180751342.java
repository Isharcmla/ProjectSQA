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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.lang.Long;

public class TarArchiveInputStream_skip_86180751342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term900;
     Object term992;

    public TarArchiveInputStream_skip_86180751342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13126 = Class.forName((String) "java.io.File$PathStatus");
        Field term13125 = ((Class) term13126).getDeclaredField((String) "INVALID");
        ((Field) term13125).setAccessible(true);
        Object enum31 = ((Field) term13125).get((Object) null);
        term900 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term901 = (byte[]) newByteArray(9);
        Object term916 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term952 = newInstance(Class.forName("java.io.File"));
        byte[] term981 = (byte[]) newByteArray(9);
        setByteElement(term901, 0, (byte) 118);
        setByteElement(term901, 1, (byte) 106);
        setByteElement(term901, 2, (byte) 98);
        setByteElement(term901, 3, (byte) 67);
        setByteElement(term901, 4, (byte) 66);
        setByteElement(term901, 5, (byte) -121);
        setByteElement(term901, 6, (byte) -119);
        setByteElement(term901, 7, (byte) 71);
        setByteElement(term901, 8, (byte) 80);
        setField(term900, term900.getClass(), "SMALL_BUF", term901);
        setIntField(term900, term900.getClass(), "recordSize", -1007160944);
        setIntField(term900, term900.getClass(), "blockSize", 1135664017);
        setBooleanField(term900, term900.getClass(), "hasHitEOF", true);
        setLongField(term900, term900.getClass(), "entrySize", 2486810210675247493L);
        setLongField(term900, term900.getClass(), "entryOffset", 7009926388951271268L);
        setField(term900, term900.getClass(), "is", null);
        setField(term916, term916.getClass(), "name", "");
        setIntField(term916, term916.getClass(), "mode", 590364439);
        setLongField(term916, term916.getClass(), "userId", -7672528020740371001L);
        setLongField(term916, term916.getClass(), "groupId", -4502405999831680926L);
        setLongField(term916, term916.getClass(), "size", 1967728129628047933L);
        setLongField(term916, term916.getClass(), "modTime", 2120084523938730454L);
        setBooleanField(term916, term916.getClass(), "checkSumOK", false);
        setByteField(term916, term916.getClass(), "linkFlag", (byte) 42);
        setField(term916, term916.getClass(), "linkName", "");
        setField(term916, term916.getClass(), "magic", "ustar ");
        setField(term916, term916.getClass(), "version", "00");
        setField(term916, term916.getClass(), "userName", "root");
        setField(term916, term916.getClass(), "groupName", "");
        setIntField(term916, term916.getClass(), "devMajor", 865208305);
        setIntField(term916, term916.getClass(), "devMinor", -1275173084);
        setBooleanField(term916, term916.getClass(), "isExtended", true);
        setLongField(term916, term916.getClass(), "realSize", 6855071767938501807L);
        setField(term952, term952.getClass(), "path", "RMFIsYGgne");
        setField(term952, term952.getClass(), "status", enum31);
        setIntField(term952, term952.getClass(), "prefixLength", -244121226);
        setField(term952, term952.getClass(), "filePath", null);
        setField(term916, term916.getClass(), "file", term952);
        setField(term900, term900.getClass(), "currEntry", term916);
        setField(term900, term900.getClass(), "zipEncoding", null);
        setField(term900, term900.getClass(), "encoding", "NRdvgJlhkX");
        setByteElement(term981, 0, (byte) 72);
        setByteElement(term981, 1, (byte) 111);
        setByteElement(term981, 2, (byte) 99);
        setByteElement(term981, 3, (byte) -12);
        setByteElement(term981, 4, (byte) -61);
        setByteElement(term981, 5, (byte) -85);
        setByteElement(term981, 6, (byte) -22);
        setByteElement(term981, 7, (byte) 93);
        setByteElement(term981, 8, (byte) 69);
        setField(term900, term900.getClass(), "SINGLE", term981);
        setLongField(term900, term900.getClass(), "bytesRead", -5892135042702373494L);
        term992 = new Long(5262507301787091109L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term992;
        try {
            callMethod(klass, "skip", argTypes, term900, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


