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

public class CompressorStreamFactory_createCompressorInputStream_39549836761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21281;
     Object term21477;

    public CompressorStreamFactory_createCompressorInputStream_39549836761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21281 = newInstance(Class.forName("org.apache.commons.compress.compressors.CompressorStreamFactory"));
        setBooleanField(term21281, term21281.getClass(), "decompressConcatenated", false);
        term21477 = newInstance(Class.forName("org.apache.commons.compress.compressors.pack200.Pack200CompressorInputStream"));
        Object term21633 = newInstance(Class.forName("org.apache.commons.compress.compressors.pack200.TempFileCachingStreamBridge"));
        setField(term21477, term21477.getClass(), "streamBridge", term21633);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.CompressorStreamFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.io.InputStream");
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = term21477;
        try {
            callMethod(klass, "createCompressorInputStream", argTypes, term21281, args);
            assertTrue(false);
        }
        catch (CompressorException e) {
        }

    }

};


