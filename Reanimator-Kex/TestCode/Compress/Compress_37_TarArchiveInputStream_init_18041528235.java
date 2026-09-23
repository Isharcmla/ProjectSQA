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
import java.util.HashMap;

public class TarArchiveInputStream_init_18041528235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8631;

    public TarArchiveInputStream_init_18041528235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8636 = new HashMap();
        term8631 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term8632 = (byte[]) newByteArray(256);
        Object term8633 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term8637 = (byte[]) newByteArray(1);
        setField(term8631, term8631.getClass(), "SMALL_BUF", term8632);
        setIntField(term8631, term8631.getClass(), "recordSize", 512);
        setIntField(term8631, term8631.getClass(), "blockSize", 10240);
        setBooleanField(term8631, term8631.getClass(), "hasHitEOF", false);
        setLongField(term8631, term8631.getClass(), "entrySize", 0L);
        setLongField(term8631, term8631.getClass(), "entryOffset", 0L);
        setField(term8631, term8631.getClass(), "is", null);
        setField(term8631, term8631.getClass(), "currEntry", null);
        setField(term8633, term8633.getClass(), "charsetName", "UTF8");
        setField(term8631, term8631.getClass(), "zipEncoding", term8633);
        setField(term8631, term8631.getClass(), "encoding", null);
        setField(term8631, term8631.getClass(), "globalPaxHeaders", term8636);
        setField(term8631, term8631.getClass(), "SINGLE", term8637);
        setLongField(term8631, term8631.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8631));
    }

};


