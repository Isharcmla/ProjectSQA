package org.apache.commons.compress.compressors.bzip2;

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
import static org.apache.commons.compress.compressors.bzip2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BZip2CompressorInputStream_init_111591153254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17899;

    public BZip2CompressorInputStream_init_111591153254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term17707 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term17811 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.CRC"));
        setLongField(term17707, term17707.getClass(), "bytesRead", 0L);
        setField(term17707, term17707.getClass(), "crc", term17811);
        setIntField(term17707, term17707.getClass(), "currentState", 0);
        setField(term17707, term17707.getClass(), "in", null);
        setBooleanField(term17707, term17707.getClass(), "decompressConcatenated", false);
        term17899 = newInstance(Class.forName("java.io.ObjectInputStream$PeekInputStream"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term17899;
        args[1] = true;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


