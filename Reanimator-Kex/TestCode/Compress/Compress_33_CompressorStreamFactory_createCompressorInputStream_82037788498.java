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
import java.lang.NullPointerException;
import static org.apache.commons.compress.compressors.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CompressorStreamFactory_createCompressorInputStream_82037788498 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39164;
     Object term39322;

    public CompressorStreamFactory_createCompressorInputStream_82037788498() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39164 = newInstance(Class.forName("org.apache.commons.compress.compressors.CompressorStreamFactory"));
        term39322 = newInstance(Class.forName("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream"));
        Object term39478 = newInstance(Class.forName("org.apache.commons.compress.compressors.pack200.TempFileCachingStreamBridge"));
        setField(term39322, term39322.getClass(), "streamBridge", term39478);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.CompressorStreamFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.InputStream");
        Object[] args = new Object[1];
        args[0] = term39322;
        try {
            callMethod(klass, "createCompressorInputStream", argTypes, term39164, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


