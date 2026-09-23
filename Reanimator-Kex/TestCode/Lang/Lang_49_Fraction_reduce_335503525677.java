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

public class Fraction_reduce_335503525677 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term187522;
     Object term187723;
     Object term187720;

    public Fraction_reduce_335503525677() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term187522 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term187522, term187522.getClass(), "numerator", -2065879982);
        setIntField(term187522, term187522.getClass(), "denominator", 672077007);
        term187723 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term187723, term187723.getClass(), "numerator", -2065879982);
        setIntField(term187723, term187723.getClass(), "denominator", 672077007);
        setField(term187723, term187723.getClass(), "toString", null);
        setField(term187723, term187723.getClass(), "toProperString", null);
        term187720 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term187720, term187720.getClass(), "numerator", -2065879982);
        setIntField(term187720, term187720.getClass(), "denominator", 672077007);
        setField(term187720, term187720.getClass(), "toString", null);
        setField(term187720, term187720.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term187522, args);
        assertTrue(recursiveEquals(term187522, term187723));
        assertTrue(recursiveEquals(retValue, term187720));
    }

};


