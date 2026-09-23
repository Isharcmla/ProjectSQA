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

public class NumberUtils_equals_178104400776 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term477;
     Object term485;
     Object term5714;
     Object term5715;

    public NumberUtils_equals_178104400776() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term477 = (float[]) newFloatArray(7);
        setFloatElement(term477, 0, 0.2707036F);
        setFloatElement(term477, 1, 0.3455959F);
        setFloatElement(term477, 2, 0.09123778F);
        setFloatElement(term477, 3, 0.5523636F);
        setFloatElement(term477, 4, 0.8564069F);
        setFloatElement(term477, 5, 0.5446086F);
        setFloatElement(term477, 6, 0.5254275F);
        term485 = (float[]) newFloatArray(1);
        setFloatElement(term485, 0, 0.2857073F);
        term5714 = (float[]) newFloatArray(7);
        setFloatElement(term5714, 0, 0.2707036F);
        setFloatElement(term5714, 1, 0.3455959F);
        setFloatElement(term5714, 2, 0.09123778F);
        setFloatElement(term5714, 3, 0.5523636F);
        setFloatElement(term5714, 4, 0.8564069F);
        setFloatElement(term5714, 5, 0.5446086F);
        setFloatElement(term5714, 6, 0.5254275F);
        term5715 = (float[]) newFloatArray(1);
        setFloatElement(term5715, 0, 0.2857073F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(float.class, 0).getClass();
        argTypes[1] = Array.newInstance(float.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term477;
        args[1] = term485;
        Object retValue = callMethod(klass, "equals", argTypes, null, args);
        assertTrue(recursiveEquals(term477, term5714));
        assertTrue(recursiveEquals(term485, term5715));
        assertTrue(recursiveEquals(retValue, false));
    }

};


