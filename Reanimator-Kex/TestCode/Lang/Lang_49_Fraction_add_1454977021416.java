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

public class Fraction_add_1454977021416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113815;
     Object term113895;
     Object term114252;
     Object term114253;
     Object term114249;

    public Fraction_add_1454977021416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113815 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term113815, term113815.getClass(), "numerator", -2147483648);
        setIntField(term113815, term113815.getClass(), "denominator", 2048);
        term113895 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term113895, term113895.getClass(), "numerator", -2147483648);
        setIntField(term113895, term113895.getClass(), "denominator", 512);
        term114252 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term114252, term114252.getClass(), "numerator", -2147483648);
        setIntField(term114252, term114252.getClass(), "denominator", 2048);
        setField(term114252, term114252.getClass(), "toString", null);
        setField(term114252, term114252.getClass(), "toProperString", null);
        term114253 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term114253, term114253.getClass(), "numerator", -2147483648);
        setIntField(term114253, term114253.getClass(), "denominator", 512);
        setField(term114253, term114253.getClass(), "toString", null);
        setField(term114253, term114253.getClass(), "toProperString", null);
        term114249 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term114249, term114249.getClass(), "numerator", -20971520);
        setIntField(term114249, term114249.getClass(), "denominator", 4);
        setField(term114249, term114249.getClass(), "toString", null);
        setField(term114249, term114249.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term113895;
        Object retValue = callMethod(klass, "add", argTypes, term113815, args);
        assertTrue(recursiveEquals(term113815, term114252));
        assertTrue(recursiveEquals(term113895, term114253));
        assertTrue(recursiveEquals(retValue, term114249));
    }

};


