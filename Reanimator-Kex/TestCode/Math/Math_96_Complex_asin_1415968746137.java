package org.apache.commons.math.complex;

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
import static org.apache.commons.math.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.complex.EqualityUtils.*;

public class Complex_asin_1415968746137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18218;
     Object term18434;
     Object term18431;

    public Complex_asin_1415968746137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18218 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term18218, term18218.getClass(), "real", -9.2188684370931876E18);
        setDoubleField(term18218, term18218.getClass(), "imaginary", -9.2166166374137201E18);
        term18434 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term18434, term18434.getClass(), "imaginary", -9.2166166374137201E18);
        setDoubleField(term18434, term18434.getClass(), "real", -9.2188684370931876E18);
        term18431 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term18431, term18431.getClass(), "imaginary", -44.707382615666035);
        setDoubleField(term18431, term18431.getClass(), "real", -0.7855203082533698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term18218, args);
        assertTrue(recursiveEquals(term18218, term18434));
        assertTrue(recursiveEquals(retValue, term18431));
    }

};


