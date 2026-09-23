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

public class CompressorStreamFactory_createCompressorOutputStream_70988830085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33212;
     Object term33320;

    public CompressorStreamFactory_createCompressorOutputStream_70988830085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33212 = newInstance(Class.forName("org.apache.commons.compress.compressors.CompressorStreamFactory"));
        term33320 = newInstance(Class.forName("org.tukaani.xz.DeltaOutputStream"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.CompressorStreamFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.io.OutputStream");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term33320;
        try {
            callMethod(klass, "createCompressorOutputStream", argTypes, term33212, args);
            assertTrue(false);
        }
        catch (CompressorException e) {
        }

    }

};


