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

public class BitInputStream_readBits_3411614612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term984;
     Object term1489;

    public BitInputStream_readBits_3411614612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term984 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        term1489 = newInstance(Class.forName("org.apache.commons.compress.utils.BitInputStream"));
        setField(term1489, term1489.getClass(), "in", null);
        setField(term1489, term1489.getClass(), "byteOrder", null);
        setLongField(term1489, term1489.getClass(), "bitsCached", 0L);
        setIntField(term1489, term1489.getClass(), "bitsCachedSize", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.utils.BitInputStream");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "readBits", argTypes, term984, args);
        assertTrue(recursiveEquals(term984, term1489));
        assertTrue(recursiveEquals(retValue, 0L));
    }

};


