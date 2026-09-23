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

public class TarArchiveInputStream_init_34637516134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8316;

    public TarArchiveInputStream_init_34637516134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8316 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term8317 = (byte[]) newByteArray(256);
        Object term8318 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term8323 = (byte[]) newByteArray(1);
        setField(term8316, term8316.getClass(), "SMALL_BUF", term8317);
        setIntField(term8316, term8316.getClass(), "recordSize", 512);
        setIntField(term8316, term8316.getClass(), "blockSize", 10240);
        setBooleanField(term8316, term8316.getClass(), "hasHitEOF", false);
        setLongField(term8316, term8316.getClass(), "entrySize", 0L);
        setLongField(term8316, term8316.getClass(), "entryOffset", 0L);
        setField(term8316, term8316.getClass(), "is", null);
        setField(term8316, term8316.getClass(), "currEntry", null);
        setField(term8318, term8318.getClass(), "charsetName", "PAEBtnZtTD");
        setField(term8316, term8316.getClass(), "zipEncoding", term8318);
        setField(term8316, term8316.getClass(), "encoding", "PAEBtnZtTD");
        setField(term8316, term8316.getClass(), "SINGLE", term8323);
        setLongField(term8316, term8316.getClass(), "bytesRead", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8316));
    }

};


