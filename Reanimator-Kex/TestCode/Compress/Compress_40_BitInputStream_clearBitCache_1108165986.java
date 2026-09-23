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

public class BitInputStream_clearBitCache_1108165986 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50;
     Object term431;

    public BitInputStream_clearBitCache_1108165986() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        Object term51 = newInstance(Class.forName("java.nio.ByteOrder"));
        setField(term50, term50.getClass(), "in", null);
        setField(term51, term51.getClass(), "name", "MuLcgQHgqz");
        setField(term50, term50.getClass(), "byteOrder", term51);
        setLongField(term50, term50.getClass(), "bitsCached", 6375119433582206027L);
        setIntField(term50, term50.getClass(), "bitsCachedSize", 1162663216);
        term431 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        Object term432 = newInstance(Class.forName("java.nio.ByteOrder"));
        setField(term431, term431.getClass(), "in", null);
        setField(term432, term432.getClass(), "name", "MuLcgQHgqz");
        setField(term431, term431.getClass(), "byteOrder", term432);
        setLongField(term431, term431.getClass(), "bitsCached", 0L);
        setIntField(term431, term431.getClass(), "bitsCachedSize", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.BitInputStream");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearBitCache", argTypes, term50, args);
        assertTrue(recursiveEquals(term50, term431));
    }

};


