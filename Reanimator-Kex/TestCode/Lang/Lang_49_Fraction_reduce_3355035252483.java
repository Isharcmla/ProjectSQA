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

public class Fraction_reduce_3355035252483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term739963;
     Object term740197;
     Object term740191;

    public Fraction_reduce_3355035252483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term739963 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term739963, term739963.getClass(), "numerator", -2141910438);
        setIntField(term739963, term739963.getClass(), "denominator", 1073741824);
        term740197 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term740197, term740197.getClass(), "numerator", -2141910438);
        setIntField(term740197, term740197.getClass(), "denominator", 1073741824);
        setField(term740197, term740197.getClass(), "toString", null);
        setField(term740197, term740197.getClass(), "toProperString", null);
        term740191 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term740191, term740191.getClass(), "numerator", -1070955219);
        setIntField(term740191, term740191.getClass(), "denominator", 536870912);
        setField(term740191, term740191.getClass(), "toString", null);
        setField(term740191, term740191.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term739963, args);
        assertTrue(recursiveEquals(term739963, term740197));
        assertTrue(recursiveEquals(retValue, term740191));
    }

};


