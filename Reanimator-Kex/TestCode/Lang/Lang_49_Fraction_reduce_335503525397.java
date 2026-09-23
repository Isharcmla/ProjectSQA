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

public class Fraction_reduce_335503525397 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107954;
     Object term108449;
     Object term108446;

    public Fraction_reduce_335503525397() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107954 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term107954, term107954.getClass(), "numerator", -1338904070);
        setIntField(term107954, term107954.getClass(), "denominator", 1752725563);
        term108449 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term108449, term108449.getClass(), "numerator", -1338904070);
        setIntField(term108449, term108449.getClass(), "denominator", 1752725563);
        setField(term108449, term108449.getClass(), "toString", null);
        setField(term108449, term108449.getClass(), "toProperString", null);
        term108446 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term108446, term108446.getClass(), "numerator", -1338904070);
        setIntField(term108446, term108446.getClass(), "denominator", 1752725563);
        setField(term108446, term108446.getClass(), "toString", null);
        setField(term108446, term108446.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term107954, args);
        assertTrue(recursiveEquals(term107954, term108449));
        assertTrue(recursiveEquals(retValue, term108446));
    }

};


