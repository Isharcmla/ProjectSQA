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

public class Fraction_reduce_3355035251212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353925;
     Object term354450;
     Object term354447;

    public Fraction_reduce_3355035251212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term353925 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term353925, term353925.getClass(), "numerator", 874017510);
        setIntField(term353925, term353925.getClass(), "denominator", 1677067291);
        term354450 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term354450, term354450.getClass(), "numerator", 874017510);
        setIntField(term354450, term354450.getClass(), "denominator", 1677067291);
        setField(term354450, term354450.getClass(), "toString", null);
        setField(term354450, term354450.getClass(), "toProperString", null);
        term354447 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term354447, term354447.getClass(), "numerator", 874017510);
        setIntField(term354447, term354447.getClass(), "denominator", 1677067291);
        setField(term354447, term354447.getClass(), "toString", null);
        setField(term354447, term354447.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term353925, args);
        assertTrue(recursiveEquals(term353925, term354450));
        assertTrue(recursiveEquals(retValue, term354447));
    }

};


