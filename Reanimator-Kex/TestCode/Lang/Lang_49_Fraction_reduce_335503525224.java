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

public class Fraction_reduce_335503525224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54994;
     Object term55422;
     Object term55416;

    public Fraction_reduce_335503525224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54994 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term54994, term54994.getClass(), "numerator", 2146344678);
        setIntField(term54994, term54994.getClass(), "denominator", 933675);
        term55422 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term55422, term55422.getClass(), "numerator", 2146344678);
        setIntField(term55422, term55422.getClass(), "denominator", 933675);
        setField(term55422, term55422.getClass(), "toString", null);
        setField(term55422, term55422.getClass(), "toProperString", null);
        term55416 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term55416, term55416.getClass(), "numerator", 715448226);
        setIntField(term55416, term55416.getClass(), "denominator", 311225);
        setField(term55416, term55416.getClass(), "toString", null);
        setField(term55416, term55416.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term54994, args);
        assertTrue(recursiveEquals(term54994, term55422));
        assertTrue(recursiveEquals(retValue, term55416));
    }

};


