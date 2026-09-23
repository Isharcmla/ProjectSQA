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

public class Fraction_reduce_3355035252190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term646292;
     Object term646783;
     Object term646780;

    public Fraction_reduce_3355035252190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term646292 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term646292, term646292.getClass(), "numerator", -222613782);
        setIntField(term646292, term646292.getClass(), "denominator", 1161298723);
        term646783 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term646783, term646783.getClass(), "numerator", -222613782);
        setIntField(term646783, term646783.getClass(), "denominator", 1161298723);
        setField(term646783, term646783.getClass(), "toString", null);
        setField(term646783, term646783.getClass(), "toProperString", null);
        term646780 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term646780, term646780.getClass(), "numerator", -222613782);
        setIntField(term646780, term646780.getClass(), "denominator", 1161298723);
        setField(term646780, term646780.getClass(), "toString", null);
        setField(term646780, term646780.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term646292, args);
        assertTrue(recursiveEquals(term646292, term646783));
        assertTrue(recursiveEquals(retValue, term646780));
    }

};


