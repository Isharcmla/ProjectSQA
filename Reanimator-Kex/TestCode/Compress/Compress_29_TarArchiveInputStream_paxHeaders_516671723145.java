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

public class TarArchiveInputStream_paxHeaders_516671723145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60485;
     Object term61248;

    public TarArchiveInputStream_paxHeaders_516671723145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60485 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term60039 = (byte[]) newByteArray(9);
        Object term60617 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setByteElement(term60039, 0, (byte) 1);
        setByteElement(term60039, 1, (byte) 1);
        setByteElement(term60039, 2, (byte) 1);
        setByteElement(term60039, 3, (byte) 1);
        setByteElement(term60039, 4, (byte) 1);
        setByteElement(term60039, 5, (byte) 1);
        setByteElement(term60039, 6, (byte) 1);
        setByteElement(term60039, 7, (byte) 1);
        setByteElement(term60039, 8, (byte) 1);
        setField(term60485, term60485.getClass(), "SINGLE", term60039);
        setBooleanField(term60485, term60485.getClass(), "hasHitEOF", false);
        setLongField(term60485, term60485.getClass(), "entryOffset", 0L);
        setLongField(term60485, term60485.getClass(), "entrySize", -9223372036854775807L);
        setField(term60485, term60485.getClass(), "currEntry", null);
        setIntField(term60485, term60485.getClass(), "recordSize", 233);
        setField(term60485, term60485.getClass(), "is", term60617);
        term61248 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term61249 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term61250 = (byte[]) newByteArray(9);
        setField(term61248, term61248.getClass(), "SMALL_BUF", null);
        setIntField(term61248, term61248.getClass(), "recordSize", 233);
        setIntField(term61248, term61248.getClass(), "blockSize", 0);
        setBooleanField(term61248, term61248.getClass(), "hasHitEOF", true);
        setLongField(term61248, term61248.getClass(), "entrySize", -9223372036854775807L);
        setLongField(term61248, term61248.getClass(), "entryOffset", 0L);
        setField(term61249, term61249.getClass(), "SMALL_BUF", null);
        setIntField(term61249, term61249.getClass(), "recordSize", 0);
        setIntField(term61249, term61249.getClass(), "blockSize", 0);
        setBooleanField(term61249, term61249.getClass(), "hasHitEOF", false);
        setLongField(term61249, term61249.getClass(), "entrySize", 0L);
        setLongField(term61249, term61249.getClass(), "entryOffset", 0L);
        setField(term61249, term61249.getClass(), "is", null);
        setField(term61249, term61249.getClass(), "currEntry", null);
        setField(term61249, term61249.getClass(), "zipEncoding", null);
        setField(term61249, term61249.getClass(), "SINGLE", null);
        setLongField(term61249, term61249.getClass(), "bytesRead", 0L);
        setField(term61248, term61248.getClass(), "is", term61249);
        setField(term61248, term61248.getClass(), "currEntry", null);
        setField(term61248, term61248.getClass(), "zipEncoding", null);
        setByteElement(term61250, 0, (byte) 1);
        setByteElement(term61250, 1, (byte) 1);
        setByteElement(term61250, 2, (byte) 1);
        setByteElement(term61250, 3, (byte) 1);
        setByteElement(term61250, 4, (byte) 1);
        setByteElement(term61250, 5, (byte) 1);
        setByteElement(term61250, 6, (byte) 1);
        setByteElement(term61250, 7, (byte) 1);
        setByteElement(term61250, 8, (byte) 1);
        setField(term61248, term61248.getClass(), "SINGLE", term61250);
        setLongField(term61248, term61248.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "paxHeaders", argTypes, term60485, args);
        assertTrue(recursiveEquals(term60485, term61248));
    }

};


