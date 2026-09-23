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
import java.lang.Boolean;

public class CompressorStreamFactory_getDecompressConcatenated_210865137313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65;
     Object term1276;

    public CompressorStreamFactory_getDecompressConcatenated_210865137313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Boolean term66 = new Boolean(true);
        term65 = newInstance(Class.forName("org.apache.commons.compress.compressors.CompressorStreamFactory"));
        setField(term65, term65.getClass(), "decompressUntilEOF", term66);
        setBooleanField(term65, term65.getClass(), "decompressConcatenated", true);
        Boolean term1277 = new Boolean(true);
        term1276 = newInstance(Class.forName("org.apache.commons.compress.compressors.CompressorStreamFactory"));
        setField(term1276, term1276.getClass(), "decompressUntilEOF", term1277);
        setBooleanField(term1276, term1276.getClass(), "decompressConcatenated", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.compressors.CompressorStreamFactory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDecompressConcatenated", argTypes, term65, args);
        assertTrue(recursiveEquals(term65, term1276));
    }

};


