package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;
import java.lang.Float;

public class NumberUtils_min_15011422695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term645;
     Object term647;
     Object term649;

    public NumberUtils_min_15011422695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term645 = new Float(0.3692338F);
        term647 = new Float(0.13906479F);
        term649 = new Float(0.6076495F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = float.class;
        argTypes[1] = float.class;
        argTypes[2] = float.class;
        Object[] args = new Object[3];
        args[0] = term645;
        args[1] = term647;
        args[2] = term649;
        Object retValue = callMethod(klass, "min", argTypes, null, args);
        assertTrue(recursiveEquals(term645, 0.3692338F));
        assertTrue(recursiveEquals(term647, 0.13906479F));
        assertTrue(recursiveEquals(term649, 0.6076495F));
        assertTrue(recursiveEquals(retValue, 0.13906479F));
    }

};


