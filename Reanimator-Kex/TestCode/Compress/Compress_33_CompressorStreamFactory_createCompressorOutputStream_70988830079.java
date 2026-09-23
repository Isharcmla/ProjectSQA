package org.apache.commons.compress.compressors;

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
import org.apache.commons.compress.compressors.CompressorException;
import static org.apache.commons.compress.compressors.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CompressorStreamFactory_createCompressorOutputStream_70988830079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28423;
     Object term28613;

    public CompressorStreamFactory_createCompressorOutputStream_70988830079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28423 = newInstance(Class.forName("org.apache.commons.compress.compressors.CompressorStreamFactory"));
        term28613 = newInstance(Class.forName("org.apache.commons.compress.compressors.bzip2.BZip2CompressorOutputStream"));
        Object term28707 = newInstance(Class.forName("org.tukaani.xz.UncompressedLZMA2OutputStream"));
        setField(term28613, term28613.getClass(), "out", term28707);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.CompressorStreamFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.io.OutputStream");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term28613;
        try {
            callMethod(klass, "createCompressorOutputStream", argTypes, term28423, args);
            assertTrue(false);
        }
        catch (CompressorException e) {
        }

    }

};


