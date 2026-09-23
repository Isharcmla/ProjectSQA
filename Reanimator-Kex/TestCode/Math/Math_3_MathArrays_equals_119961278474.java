package org.apache.commons.math3.util;

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
import static org.apache.commons.math3.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.util.EqualityUtils.*;

public class MathArrays_equals_119961278474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2251;
     Object term2259;
     Object term19504;
     Object term19505;

    public MathArrays_equals_119961278474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2251 = (float[]) newFloatArray(7);
        setFloatElement(term2251, 0, 0.13238746F);
        setFloatElement(term2251, 1, 0.2707036F);
        setFloatElement(term2251, 2, 0.3455959F);
        setFloatElement(term2251, 3, 0.09123778F);
        setFloatElement(term2251, 4, 0.5523636F);
        setFloatElement(term2251, 5, 0.8564069F);
        setFloatElement(term2251, 6, 0.5446086F);
        term2259 = (float[]) newFloatArray(6);
        setFloatElement(term2259, 0, 0.5254275F);
        setFloatElement(term2259, 1, 0.2857073F);
        setFloatElement(term2259, 2, 0.6880585F);
        setFloatElement(term2259, 3, 0.40176582F);
        setFloatElement(term2259, 4, 0.8783184F);
        setFloatElement(term2259, 5, 0.26413453F);
        term19504 = (float[]) newFloatArray(7);
        setFloatElement(term19504, 0, 0.13238746F);
        setFloatElement(term19504, 1, 0.2707036F);
        setFloatElement(term19504, 2, 0.3455959F);
        setFloatElement(term19504, 3, 0.09123778F);
        setFloatElement(term19504, 4, 0.5523636F);
        setFloatElement(term19504, 5, 0.8564069F);
        setFloatElement(term19504, 6, 0.5446086F);
        term19505 = (float[]) newFloatArray(6);
        setFloatElement(term19505, 0, 0.5254275F);
        setFloatElement(term19505, 1, 0.2857073F);
        setFloatElement(term19505, 2, 0.6880585F);
        setFloatElement(term19505, 3, 0.40176582F);
        setFloatElement(term19505, 4, 0.8783184F);
        setFloatElement(term19505, 5, 0.26413453F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.MathArrays");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(float.class, 0).getClass();
        argTypes[1] = Array.newInstance(float.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term2251;
        args[1] = term2259;
        Object retValue = callMethod(klass, "equals", argTypes, null, args);
        assertTrue(recursiveEquals(term2251, term19504));
        assertTrue(recursiveEquals(term2259, term19505));
        assertTrue(recursiveEquals(retValue, false));
    }

};


