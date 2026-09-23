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
import java.lang.NegativeArraySizeException;
import static org.apache.commons.compress.archivers.tar.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class TarArchiveInputStream_readRecord_48391935351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3304;

    public TarArchiveInputStream_readRecord_48391935351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18075 = Class.forName((String) "java.io.File$PathStatus");
        Field term18074 = ((Class) term18075).getDeclaredField((String) "INVALID");
        ((Field) term18074).setAccessible(true);
        Object enum47 = ((Field) term18074).get((Object) null);
        term3304 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term3305 = (byte[]) newByteArray(6);
        Object term3317 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveEntry"));
        Object term3353 = newInstance(Class.forName("java.io.File"));
        byte[] term3382 = (byte[]) newByteArray(2);
        setByteElement(term3305, 0, (byte) 70);
        setByteElement(term3305, 1, (byte) -28);
        setByteElement(term3305, 2, (byte) 115);
        setByteElement(term3305, 3, (byte) 96);
        setByteElement(term3305, 4, (byte) 51);
        setByteElement(term3305, 5, (byte) -53);
        setField(term3304, term3304.getClass(), "SMALL_BUF", term3305);
        setIntField(term3304, term3304.getClass(), "recordSize", -478195677);
        setIntField(term3304, term3304.getClass(), "blockSize", 972867650);
        setBooleanField(term3304, term3304.getClass(), "hasHitEOF", true);
        setLongField(term3304, term3304.getClass(), "entrySize", -8085190702504231560L);
        setLongField(term3304, term3304.getClass(), "entryOffset", 1672578078364590450L);
        setField(term3304, term3304.getClass(), "is", null);
        setField(term3317, term3317.getClass(), "name", "");
        setIntField(term3317, term3317.getClass(), "mode", 1655935355);
        setLongField(term3317, term3317.getClass(), "userId", 4949335493504695457L);
        setLongField(term3317, term3317.getClass(), "groupId", -5216789073301458893L);
        setLongField(term3317, term3317.getClass(), "size", -1832940336320585644L);
        setLongField(term3317, term3317.getClass(), "modTime", -8033714905181142681L);
        setBooleanField(term3317, term3317.getClass(), "checkSumOK", true);
        setByteField(term3317, term3317.getClass(), "linkFlag", (byte) -8);
        setField(term3317, term3317.getClass(), "linkName", "");
        setField(term3317, term3317.getClass(), "magic", "ustar ");
        setField(term3317, term3317.getClass(), "version", "00");
        setField(term3317, term3317.getClass(), "userName", "root");
        setField(term3317, term3317.getClass(), "groupName", "");
        setIntField(term3317, term3317.getClass(), "devMajor", -481533957);
        setIntField(term3317, term3317.getClass(), "devMinor", 1240914516);
        setBooleanField(term3317, term3317.getClass(), "isExtended", true);
        setLongField(term3317, term3317.getClass(), "realSize", -9040825890007374809L);
        setField(term3353, term3353.getClass(), "path", "OclPbYPkcH");
        setField(term3353, term3353.getClass(), "status", enum47);
        setIntField(term3353, term3353.getClass(), "prefixLength", -1465035361);
        setField(term3353, term3353.getClass(), "filePath", null);
        setField(term3317, term3317.getClass(), "file", term3353);
        setField(term3304, term3304.getClass(), "currEntry", term3317);
        setField(term3304, term3304.getClass(), "zipEncoding", null);
        setField(term3304, term3304.getClass(), "encoding", "IoAlmYsBwc");
        setByteElement(term3382, 0, (byte) -9);
        setByteElement(term3382, 1, (byte) 97);
        setField(term3304, term3304.getClass(), "SINGLE", term3382);
        setLongField(term3304, term3304.getClass(), "bytesRead", 1368340889161782793L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "readRecord", argTypes, term3304, args);
            assertTrue(false);
        }
        catch (NegativeArraySizeException e) {
        }

    }

};


