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

public class Fraction_reduce_3355035251510 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term444380;
     Object term444833;
     Object term444830;

    public Fraction_reduce_3355035251510() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term444380 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term444380, term444380.getClass(), "numerator", -85991870);
        setIntField(term444380, term444380.getClass(), "denominator", 1183772183);
        term444833 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term444833, term444833.getClass(), "numerator", -85991870);
        setIntField(term444833, term444833.getClass(), "denominator", 1183772183);
        setField(term444833, term444833.getClass(), "toString", null);
        setField(term444833, term444833.getClass(), "toProperString", null);
        term444830 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term444830, term444830.getClass(), "numerator", -85991870);
        setIntField(term444830, term444830.getClass(), "denominator", 1183772183);
        setField(term444830, term444830.getClass(), "toString", null);
        setField(term444830, term444830.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term444380, args);
        assertTrue(recursiveEquals(term444380, term444833));
        assertTrue(recursiveEquals(retValue, term444830));
    }

};


