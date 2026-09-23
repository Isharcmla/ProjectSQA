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
import java.io.IOException;
import static org.apache.commons.compress.compressors.bzip2.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class BZip2CompressorInputStream_init_741375142108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47344;

    public BZip2CompressorInputStream_init_741375142108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term47146 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream"));
        Object term47250 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.CRC"));
        setLongField(term47146, term47146.getClass(), "bytesRead", 0L);
        setField(term47146, term47146.getClass(), "crc", term47250);
        setIntField(term47146, term47146.getClass(), "currentChar", 0);
        setIntField(term47146, term47146.getClass(), "currentState", 0);
        setField(term47146, term47146.getClass(), "in", null);
        setBooleanField(term47146, term47146.getClass(), "decompressConcatenated", false);
        term47344 = newInstance(Class.forName("java.lang.ProcessImpl$ProcessPipeInputStream"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = term47344;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (IOException e) {
        }

    }

};


