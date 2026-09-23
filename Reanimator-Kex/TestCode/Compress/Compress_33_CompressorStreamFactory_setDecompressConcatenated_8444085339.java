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
import java.lang.Boolean;

public class CompressorStreamFactory_setDecompressConcatenated_8444085339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term7;

    public CompressorStreamFactory_setDecompressConcatenated_8444085339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term4 = new Boolean(false);
        term3 = newInstance(Class.forName("org.apache.commons.compress.compressors.CompressorStreamFactory"));
        setField(term3, term3.getClass(), "decompressUntilEOF", term4);
        setBooleanField(term3, term3.getClass(), "decompressConcatenated", false);
        term7 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.CompressorStreamFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term7;
        try {
            callMethod(klass, "setDecompressConcatenated", argTypes, term3, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


