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

public class NumberUtils_max_120717801991 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term631;
     Object term633;
     Object term635;

    public NumberUtils_max_120717801991() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term631 = new Float(0.13906479F);
        term633 = new Float(0.6076495F);
        term635 = new Float(0.6608425F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = float.class;
        argTypes[1] = float.class;
        argTypes[2] = float.class;
        Object[] args = new Object[3];
        args[0] = term631;
        args[1] = term633;
        args[2] = term635;
        Object retValue = callMethod(klass, "max", argTypes, null, args);
        assertTrue(recursiveEquals(term631, 0.13906479F));
        assertTrue(recursiveEquals(term633, 0.6076495F));
        assertTrue(recursiveEquals(term635, 0.6608425F));
        assertTrue(recursiveEquals(retValue, 0.6608425F));
    }

};


