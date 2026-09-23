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

public class TarArchiveInputStream_paxHeaders_516671723165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71972;
     Object term72437;

    public TarArchiveInputStream_paxHeaders_516671723165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71972 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term71526 = (byte[]) newByteArray(9);
        Object term72104 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setByteElement(term71526, 0, (byte) 1);
        setByteElement(term71526, 1, (byte) 1);
        setByteElement(term71526, 2, (byte) 1);
        setByteElement(term71526, 3, (byte) 1);
        setByteElement(term71526, 4, (byte) 1);
        setByteElement(term71526, 5, (byte) 1);
        setByteElement(term71526, 6, (byte) 1);
        setByteElement(term71526, 7, (byte) 1);
        setByteElement(term71526, 8, (byte) 1);
        setField(term71972, term71972.getClass(), "SINGLE", term71526);
        setBooleanField(term71972, term71972.getClass(), "hasHitEOF", false);
        setLongField(term71972, term71972.getClass(), "entryOffset", 0L);
        setLongField(term71972, term71972.getClass(), "entrySize", -9223372036854775807L);
        setField(term71972, term71972.getClass(), "currEntry", null);
        setIntField(term71972, term71972.getClass(), "recordSize", 233);
        setField(term71972, term71972.getClass(), "is", term72104);
        term72437 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term72438 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term72439 = (byte[]) newByteArray(9);
        setField(term72437, term72437.getClass(), "SMALL_BUF", null);
        setIntField(term72437, term72437.getClass(), "recordSize", 233);
        setIntField(term72437, term72437.getClass(), "blockSize", 0);
        setBooleanField(term72437, term72437.getClass(), "hasHitEOF", true);
        setLongField(term72437, term72437.getClass(), "entrySize", -9223372036854775807L);
        setLongField(term72437, term72437.getClass(), "entryOffset", 0L);
        setField(term72438, term72438.getClass(), "SMALL_BUF", null);
        setIntField(term72438, term72438.getClass(), "recordSize", 0);
        setIntField(term72438, term72438.getClass(), "blockSize", 0);
        setBooleanField(term72438, term72438.getClass(), "hasHitEOF", false);
        setLongField(term72438, term72438.getClass(), "entrySize", 0L);
        setLongField(term72438, term72438.getClass(), "entryOffset", 0L);
        setField(term72438, term72438.getClass(), "is", null);
        setField(term72438, term72438.getClass(), "currEntry", null);
        setField(term72438, term72438.getClass(), "zipEncoding", null);
        setField(term72438, term72438.getClass(), "encoding", null);
        setField(term72438, term72438.getClass(), "SINGLE", null);
        setLongField(term72438, term72438.getClass(), "bytesRead", 0L);
        setField(term72437, term72437.getClass(), "is", term72438);
        setField(term72437, term72437.getClass(), "currEntry", null);
        setField(term72437, term72437.getClass(), "zipEncoding", null);
        setField(term72437, term72437.getClass(), "encoding", null);
        setByteElement(term72439, 0, (byte) 1);
        setByteElement(term72439, 1, (byte) 1);
        setByteElement(term72439, 2, (byte) 1);
        setByteElement(term72439, 3, (byte) 1);
        setByteElement(term72439, 4, (byte) 1);
        setByteElement(term72439, 5, (byte) 1);
        setByteElement(term72439, 6, (byte) 1);
        setByteElement(term72439, 7, (byte) 1);
        setByteElement(term72439, 8, (byte) 1);
        setField(term72437, term72437.getClass(), "SINGLE", term72439);
        setLongField(term72437, term72437.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paxHeaders", argTypes, term71972, args);
        assertTrue(recursiveEquals(term71972, term72437));
    }

};


