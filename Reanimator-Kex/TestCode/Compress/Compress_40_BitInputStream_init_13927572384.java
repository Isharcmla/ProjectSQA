package org.apache.commons.compress.utils;

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
import static org.apache.commons.compress.utils.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.utils.EqualityUtils.*;
import java.lang.Object;

public class BitInputStream_init_13927572384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term120;
     Object term124;

    public BitInputStream_init_13927572384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.nio.ByteOrder"));
        setField(term1, term1.getClass(), "name", "PAEBtnZtTD");
        term120 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        Object term121 = newInstance(Class.forName("java.nio.ByteOrder"));
        setField(term120, term120.getClass(), "in", null);
        setField(term121, term121.getClass(), "name", "PAEBtnZtTD");
        setField(term120, term120.getClass(), "byteOrder", term121);
        setLongField(term120, term120.getClass(), "bitsCached", 0L);
        setIntField(term120, term120.getClass(), "bitsCachedSize", 0);
        term124 = newInstance(Class.forName("java.nio.ByteOrder"));
        setField(term124, term124.getClass(), "name", "PAEBtnZtTD");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.BitInputStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("java.nio.ByteOrder");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term1;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term120));
        assertTrue(recursiveEquals(term1, term124));
    }

};


