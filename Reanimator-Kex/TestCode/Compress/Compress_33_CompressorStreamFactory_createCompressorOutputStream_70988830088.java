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

public class CompressorStreamFactory_createCompressorOutputStream_70988830088 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34043;
     Object term34135;

    public CompressorStreamFactory_createCompressorOutputStream_70988830088() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34043 = newInstance(Class.forName("org.apache.commons.compress.compressors.CompressorStreamFactory"));
        term34135 = newInstance(Class.forName("java.io.FileOutputStream"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.CompressorStreamFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.io.OutputStream");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term34135;
        try {
            callMethod(klass, "createCompressorOutputStream", argTypes, term34043, args);
            assertTrue(false);
        }
        catch (CompressorException e) {
        }

    }

};


