package org.apache.commons.compress.utils;

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
import static org.apache.commons.compress.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.utils.EqualityUtils.*;
import java.lang.Object;

public class ChecksumCalculatingInputStream_read_84002013754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11700;
     Object term11539;
     Object term12126;
     Object term12129;

    public ChecksumCalculatingInputStream_read_84002013754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11700 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term11770 = newInstance(Class.forName("org.brotli.dec.BrotliInputStream"));
        Object term11818 = newInstance(Class.forName("java.util.zip.Adler32"));
        setField(term11700, term11700.getClass(), "in", term11770);
        setField(term11700, term11700.getClass(), "checksum", term11818);
        term11539 = (byte[]) newByteArray(0);
        term12126 = newInstance(Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream"));
        Object term12127 = newInstance(Class.forName("org.brotli.dec.BrotliInputStream"));
        Object term12128 = newInstance(Class.forName("java.util.zip.Adler32"));
        setField(term12127, term12127.getClass(), "buffer", null);
        setIntField(term12127, term12127.getClass(), "remainingBufferBytes", 0);
        setIntField(term12127, term12127.getClass(), "bufferOffset", 0);
        setField(term12127, term12127.getClass(), "state", null);
        setField(term12126, term12126.getClass(), "in", term12127);
        setIntField(term12128, term12128.getClass(), "adler", 0);
        setField(term12126, term12126.getClass(), "checksum", term12128);
        term12129 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.ChecksumCalculatingInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term11539;
        Object retValue = callMethod(klass, "read", argTypes, term11700, args);
        assertTrue(recursiveEquals(term11700, term12126));
        assertTrue(recursiveEquals(term11539, term12129));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


