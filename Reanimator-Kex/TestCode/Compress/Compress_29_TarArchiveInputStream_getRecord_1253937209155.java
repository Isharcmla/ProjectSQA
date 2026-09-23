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

public class TarArchiveInputStream_getRecord_1253937209155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65569;
     Object term66516;

    public TarArchiveInputStream_getRecord_1253937209155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65569 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term65701 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setIntField(term65569, term65569.getClass(), "recordSize", 512);
        setField(term65569, term65569.getClass(), "is", term65701);
        term66516 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        Object term66517 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        setField(term66516, term66516.getClass(), "SMALL_BUF", null);
        setIntField(term66516, term66516.getClass(), "recordSize", 512);
        setIntField(term66516, term66516.getClass(), "blockSize", 0);
        setBooleanField(term66516, term66516.getClass(), "hasHitEOF", true);
        setLongField(term66516, term66516.getClass(), "entrySize", 0L);
        setLongField(term66516, term66516.getClass(), "entryOffset", 0L);
        setField(term66517, term66517.getClass(), "SMALL_BUF", null);
        setIntField(term66517, term66517.getClass(), "recordSize", 0);
        setIntField(term66517, term66517.getClass(), "blockSize", 0);
        setBooleanField(term66517, term66517.getClass(), "hasHitEOF", false);
        setLongField(term66517, term66517.getClass(), "entrySize", 0L);
        setLongField(term66517, term66517.getClass(), "entryOffset", 0L);
        setField(term66517, term66517.getClass(), "is", null);
        setField(term66517, term66517.getClass(), "currEntry", null);
        setField(term66517, term66517.getClass(), "zipEncoding", null);
        setField(term66517, term66517.getClass(), "SINGLE", null);
        setLongField(term66517, term66517.getClass(), "bytesRead", 0L);
        setField(term66516, term66516.getClass(), "is", term66517);
        setField(term66516, term66516.getClass(), "currEntry", null);
        setField(term66516, term66516.getClass(), "zipEncoding", null);
        setField(term66516, term66516.getClass(), "SINGLE", null);
        setLongField(term66516, term66516.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRecord", argTypes, term65569, args);
        assertTrue(recursiveEquals(term65569, term66516));
        assertTrue(recursiveEquals(retValue, null));
    }

};


