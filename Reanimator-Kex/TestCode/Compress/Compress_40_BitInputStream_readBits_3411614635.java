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

public class BitInputStream_readBits_3411614635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6110;
     Object term6488;

    public BitInputStream_readBits_3411614635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6110 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        Object term6220 = newInstance(Class.forName("org.apache.commons.compress.utils.BoundedInputStream"));
        setIntField(term6110, term6110.getClass(), "bitsCachedSize", -1);
        setField(term6110, term6110.getClass(), "in", term6220);
        term6488 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        Object term6489 = newInstance(Class.forName("org.apache.commons.compress.utils.BoundedInputStream"));
        setField(term6489, term6489.getClass(), "in", null);
        setLongField(term6489, term6489.getClass(), "bytesRemaining", 0L);
        setField(term6488, term6488.getClass(), "in", term6489);
        setField(term6488, term6488.getClass(), "byteOrder", null);
        setLongField(term6488, term6488.getClass(), "bitsCached", 0L);
        setIntField(term6488, term6488.getClass(), "bitsCachedSize", -1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.BitInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "readBits", argTypes, term6110, args);
        assertTrue(recursiveEquals(term6110, term6488));
        assertTrue(recursiveEquals(retValue, -1L));
    }

};


