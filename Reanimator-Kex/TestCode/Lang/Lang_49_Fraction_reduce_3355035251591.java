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

public class Fraction_reduce_3355035251591 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term467547;
     Object term468052;
     Object term468049;

    public Fraction_reduce_3355035251591() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term467547 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term467547, term467547.getClass(), "numerator", 183829122);
        setIntField(term467547, term467547.getClass(), "denominator", 1884842521);
        term468052 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term468052, term468052.getClass(), "numerator", 183829122);
        setIntField(term468052, term468052.getClass(), "denominator", 1884842521);
        setField(term468052, term468052.getClass(), "toString", null);
        setField(term468052, term468052.getClass(), "toProperString", null);
        term468049 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term468049, term468049.getClass(), "numerator", 183829122);
        setIntField(term468049, term468049.getClass(), "denominator", 1884842521);
        setField(term468049, term468049.getClass(), "toString", null);
        setField(term468049, term468049.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term467547, args);
        assertTrue(recursiveEquals(term467547, term468052));
        assertTrue(recursiveEquals(retValue, term468049));
    }

};


