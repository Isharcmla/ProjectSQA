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
import static org.apache.commons.compress.compressors.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.compressors.EqualityUtils.*;

public class CompressorStreamFactory_setDecompressConcatenated_84440853320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1888;
     Object term2909;

    public CompressorStreamFactory_setDecompressConcatenated_84440853320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1888 = newInstance(Class.forName("org.apache.commons.compress.compressors.CompressorStreamFactory"));
        setField(term1888, term1888.getClass(), "decompressUntilEOF", null);
        term2909 = newInstance(Class.forName("org.apache.commons.compress.compressors.CompressorStreamFactory"));
        setField(term2909, term2909.getClass(), "decompressUntilEOF", null);
        setBooleanField(term2909, term2909.getClass(), "decompressConcatenated", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.CompressorStreamFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        callMethod(klass, "setDecompressConcatenated", argTypes, term1888, args);
        assertTrue(recursiveEquals(term1888, term2909));
    }

};


