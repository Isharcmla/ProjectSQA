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

public class BitInputStream_readBits_3411614672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16846;
     Object term17925;

    public BitInputStream_readBits_3411614672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16846 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        Object term16992 = newInstance(Class.forName("org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream"));
        Object term17054 = newInstance(Class.forName("java.io.ByteArrayInputStream"));
        setIntField(term16846, term16846.getClass(), "bitsCachedSize", -1);
        setField(term16992, term16992.getClass(), "in", term17054);
        setField(term16846, term16846.getClass(), "in", term16992);
        term17925 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        Object term17926 = newInstance(Class.forName("org.apache.commons.compress.compressors.lzma.LZMACompressorInputStream"));
        Object term17927 = newInstance(Class.forName("java.io.ByteArrayInputStream"));
        setField(term17927, term17927.getClass(), "buf", null);
        setIntField(term17927, term17927.getClass(), "pos", 0);
        setIntField(term17927, term17927.getClass(), "mark", 0);
        setIntField(term17927, term17927.getClass(), "count", 0);
        setField(term17926, term17926.getClass(), "in", term17927);
        setLongField(term17926, term17926.getClass(), "bytesRead", 0L);
        setField(term17925, term17925.getClass(), "in", term17926);
        setField(term17925, term17925.getClass(), "byteOrder", null);
        setLongField(term17925, term17925.getClass(), "bitsCached", 0L);
        setIntField(term17925, term17925.getClass(), "bitsCachedSize", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.BitInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "readBits", argTypes, term16846, args);
        assertTrue(recursiveEquals(term16846, term17925));
        assertTrue(recursiveEquals(retValue, -1L));
    }

};


