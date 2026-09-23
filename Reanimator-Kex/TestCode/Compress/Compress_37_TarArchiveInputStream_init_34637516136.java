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

public class TarArchiveInputStream_init_34637516136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9466;

    public TarArchiveInputStream_init_34637516136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9473 = new HashMap();
        term9466 = newInstance(Class.forName("org.apache.commons.compress.archivers.tar.TarArchiveInputStream"));
        byte[] term9467 = (byte[]) newByteArray(256);
        Object term9468 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.FallbackZipEncoding"));
        byte[] term9474 = (byte[]) newByteArray(1);
        setField(term9466, term9466.getClass(), "SMALL_BUF", term9467);
        setIntField(term9466, term9466.getClass(), "recordSize", 512);
        setIntField(term9466, term9466.getClass(), "blockSize", 10240);
        setBooleanField(term9466, term9466.getClass(), "hasHitEOF", false);
        setLongField(term9466, term9466.getClass(), "entrySize", 0L);
        setLongField(term9466, term9466.getClass(), "entryOffset", 0L);
        setField(term9466, term9466.getClass(), "is", null);
        setField(term9466, term9466.getClass(), "currEntry", null);
        setField(term9468, term9468.getClass(), "charsetName", "PAEBtnZtTD");
        setField(term9466, term9466.getClass(), "zipEncoding", term9468);
        setField(term9466, term9466.getClass(), "encoding", "PAEBtnZtTD");
        setField(term9466, term9466.getClass(), "globalPaxHeaders", term9473);
        setField(term9466, term9466.getClass(), "SINGLE", term9474);
        setLongField(term9466, term9466.getClass(), "bytesRead", 0L);
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
        assertTrue(recursiveEquals(instance, term9466));
    }

};


