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

public class Fraction_reduce_3355035252570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term766254;
     Object term766676;
     Object term766673;

    public Fraction_reduce_3355035252570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term766254 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term766254, term766254.getClass(), "numerator", -415625902);
        setIntField(term766254, term766254.getClass(), "denominator", 914368255);
        term766676 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term766676, term766676.getClass(), "numerator", -415625902);
        setIntField(term766676, term766676.getClass(), "denominator", 914368255);
        setField(term766676, term766676.getClass(), "toString", null);
        setField(term766676, term766676.getClass(), "toProperString", null);
        term766673 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term766673, term766673.getClass(), "numerator", -415625902);
        setIntField(term766673, term766673.getClass(), "denominator", 914368255);
        setField(term766673, term766673.getClass(), "toString", null);
        setField(term766673, term766673.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term766254, args);
        assertTrue(recursiveEquals(term766254, term766676));
        assertTrue(recursiveEquals(retValue, term766673));
    }

};


