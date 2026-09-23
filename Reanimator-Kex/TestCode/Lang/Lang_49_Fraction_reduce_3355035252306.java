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

public class Fraction_reduce_3355035252306 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term683152;
     Object term683594;
     Object term683588;

    public Fraction_reduce_3355035252306() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term683152 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term683152, term683152.getClass(), "numerator", -11985006);
        setIntField(term683152, term683152.getClass(), "denominator", 5988399);
        term683594 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term683594, term683594.getClass(), "numerator", -11985006);
        setIntField(term683594, term683594.getClass(), "denominator", 5988399);
        setField(term683594, term683594.getClass(), "toString", null);
        setField(term683594, term683594.getClass(), "toProperString", null);
        term683588 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term683588, term683588.getClass(), "numerator", -3995002);
        setIntField(term683588, term683588.getClass(), "denominator", 1996133);
        setField(term683588, term683588.getClass(), "toString", null);
        setField(term683588, term683588.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term683152, args);
        assertTrue(recursiveEquals(term683152, term683594));
        assertTrue(recursiveEquals(retValue, term683588));
    }

};


