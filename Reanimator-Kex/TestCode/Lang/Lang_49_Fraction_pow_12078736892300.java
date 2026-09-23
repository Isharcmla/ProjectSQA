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

public class Fraction_pow_12078736892300 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term681052;
     Object term681747;
     Object term681743;

    public Fraction_pow_12078736892300() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term681052 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term681052, term681052.getClass(), "numerator", 0);
        term681747 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term681747, term681747.getClass(), "numerator", 0);
        setIntField(term681747, term681747.getClass(), "denominator", 0);
        setField(term681747, term681747.getClass(), "toString", null);
        setField(term681747, term681747.getClass(), "toProperString", null);
        term681743 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term681743, term681743.getClass(), "numerator", 0);
        setIntField(term681743, term681743.getClass(), "denominator", 1);
        setField(term681743, term681743.getClass(), "toString", null);
        setField(term681743, term681743.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 1073741824;
        Object retValue = callMethod(klass, "pow", argTypes, term681052, args);
        assertTrue(recursiveEquals(term681052, term681747));
        assertTrue(recursiveEquals(retValue, term681743));
    }

};


