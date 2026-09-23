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

public class Fraction_reduce_3355035252065 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term607425;
     Object term608370;
     Object term608367;

    public Fraction_reduce_3355035252065() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term607425 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term607425, term607425.getClass(), "numerator", 30);
        setIntField(term607425, term607425.getClass(), "denominator", 1073741831);
        term608370 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term608370, term608370.getClass(), "numerator", 30);
        setIntField(term608370, term608370.getClass(), "denominator", 1073741831);
        setField(term608370, term608370.getClass(), "toString", null);
        setField(term608370, term608370.getClass(), "toProperString", null);
        term608367 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term608367, term608367.getClass(), "numerator", 30);
        setIntField(term608367, term608367.getClass(), "denominator", 1073741831);
        setField(term608367, term608367.getClass(), "toString", null);
        setField(term608367, term608367.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term607425, args);
        assertTrue(recursiveEquals(term607425, term608370));
        assertTrue(recursiveEquals(retValue, term608367));
    }

};


