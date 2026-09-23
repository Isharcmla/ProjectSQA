package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;
import java.lang.Float;

public class NumberUtils_min_120694930185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term595;
     Object term597;
     Object term599;

    public NumberUtils_min_120694930185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term595 = new Float(0.26413453F);
        term597 = new Float(0.7944024F);
        term599 = new Float(0.3692338F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = float.class;
        argTypes[1] = float.class;
        argTypes[2] = float.class;
        Object[] args = new Object[3];
        args[0] = term595;
        args[1] = term597;
        args[2] = term599;
        Object retValue = callMethod(klass, "min", argTypes, null, args);
        assertTrue(recursiveEquals(term595, 0.26413453F));
        assertTrue(recursiveEquals(term597, 0.7944024F));
        assertTrue(recursiveEquals(term599, 0.3692338F));
        assertTrue(recursiveEquals(retValue, 0.26413453F));
    }

};


