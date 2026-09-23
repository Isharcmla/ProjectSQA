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

public class Fraction_pow_3365110331907 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term622267;
     Object term622846;
     Object term622842;

    public Fraction_pow_3365110331907() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term622267 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term622267, term622267.getClass(), "numerator", -2);
        setIntField(term622267, term622267.getClass(), "denominator", -9);
        term622846 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term622846, term622846.getClass(), "numerator", -2);
        setIntField(term622846, term622846.getClass(), "denominator", -9);
        setField(term622846, term622846.getClass(), "toString", null);
        setField(term622846, term622846.getClass(), "toProperString", null);
        term622842 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term622842, term622842.getClass(), "numerator", 4);
        setIntField(term622842, term622842.getClass(), "denominator", 81);
        setField(term622842, term622842.getClass(), "toString", null);
        setField(term622842, term622842.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 2;
        Object retValue = callMethod(klass, "pow", argTypes, term622267, args);
        assertTrue(recursiveEquals(term622267, term622846));
        assertTrue(recursiveEquals(retValue, term622842));
    }

};


