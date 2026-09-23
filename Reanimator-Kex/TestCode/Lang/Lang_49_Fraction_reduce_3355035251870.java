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

public class Fraction_reduce_3355035251870 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term548207;
     Object term549170;
     Object term549167;

    public Fraction_reduce_3355035251870() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term548207 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term548207, term548207.getClass(), "numerator", -981519194);
        setIntField(term548207, term548207.getClass(), "denominator", 37772801);
        term549170 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term549170, term549170.getClass(), "numerator", -981519194);
        setIntField(term549170, term549170.getClass(), "denominator", 37772801);
        setField(term549170, term549170.getClass(), "toString", null);
        setField(term549170, term549170.getClass(), "toProperString", null);
        term549167 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term549167, term549167.getClass(), "numerator", -981519194);
        setIntField(term549167, term549167.getClass(), "denominator", 37772801);
        setField(term549167, term549167.getClass(), "toString", null);
        setField(term549167, term549167.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term548207, args);
        assertTrue(recursiveEquals(term548207, term549170));
        assertTrue(recursiveEquals(retValue, term549167));
    }

};


