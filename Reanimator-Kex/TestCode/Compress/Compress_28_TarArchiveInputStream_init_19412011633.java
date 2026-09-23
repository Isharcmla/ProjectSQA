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
import java.lang.Integer;
import java.lang.Object;

public class TarArchiveInputStream_init_19412011633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term7877;

    public TarArchiveInputStream_init_19412011633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = new Integer(568599855);
        term7877 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term7878 = (byte[]) newByteArray(256);
        Object term7879 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term7882 = (byte[]) newByteArray(1);
        setField(term7877, term7877.getClass(), "SMALL_BUF", term7878);
        setIntField(term7877, term7877.getClass(), "recordSize", 512);
        setIntField(term7877, term7877.getClass(), "blockSize", 568599855);
        setBooleanField(term7877, term7877.getClass(), "hasHitEOF", false);
        setLongField(term7877, term7877.getClass(), "entrySize", 0L);
        setLongField(term7877, term7877.getClass(), "entryOffset", 0L);
        setField(term7877, term7877.getClass(), "is", null);
        setField(term7877, term7877.getClass(), "currEntry", null);
        setField(term7879, term7879.getClass(), "charsetName", "UTF8");
        setField(term7877, term7877.getClass(), "encoding", term7879);
        setField(term7877, term7877.getClass(), "SINGLE", term7882);
        setLongField(term7877, term7877.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term23;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term7877));
        assertTrue(recursiveEquals(term23, 568599855));
    }

};


