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

public class Fraction_reduce_3355035251569 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term460325;
     Object term460797;
     Object term460794;

    public Fraction_reduce_3355035251569() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term460325 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term460325, term460325.getClass(), "numerator", 300919830);
        setIntField(term460325, term460325.getClass(), "denominator", 2030344147);
        term460797 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term460797, term460797.getClass(), "numerator", 300919830);
        setIntField(term460797, term460797.getClass(), "denominator", 2030344147);
        setField(term460797, term460797.getClass(), "toString", null);
        setField(term460797, term460797.getClass(), "toProperString", null);
        term460794 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term460794, term460794.getClass(), "numerator", 300919830);
        setIntField(term460794, term460794.getClass(), "denominator", 2030344147);
        setField(term460794, term460794.getClass(), "toString", null);
        setField(term460794, term460794.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term460325, args);
        assertTrue(recursiveEquals(term460325, term460797));
        assertTrue(recursiveEquals(retValue, term460794));
    }

};


