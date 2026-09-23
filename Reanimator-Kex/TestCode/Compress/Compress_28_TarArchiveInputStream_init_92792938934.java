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

public class TarArchiveInputStream_init_92792938934 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term8694;

    public TarArchiveInputStream_init_92792938934() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25 = new Integer(1162663216);
        term8694 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term8695 = (byte[]) newByteArray(256);
        Object term8696 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term8699 = (byte[]) newByteArray(1);
        setField(term8694, term8694.getClass(), "SMALL_BUF", term8695);
        setIntField(term8694, term8694.getClass(), "recordSize", 512);
        setIntField(term8694, term8694.getClass(), "blockSize", 1162663216);
        setBooleanField(term8694, term8694.getClass(), "hasHitEOF", false);
        setLongField(term8694, term8694.getClass(), "entrySize", 0L);
        setLongField(term8694, term8694.getClass(), "entryOffset", 0L);
        setField(term8694, term8694.getClass(), "is", null);
        setField(term8694, term8694.getClass(), "currEntry", null);
        setField(term8696, term8696.getClass(), "charsetName", "sjlJAEtRrb");
        setField(term8694, term8694.getClass(), "encoding", term8696);
        setField(term8694, term8694.getClass(), "SINGLE", term8699);
        setLongField(term8694, term8694.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term25;
        args[2] = "sjlJAEtRrb";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8694));
        assertTrue(recursiveEquals(term25, null));
    }

};


