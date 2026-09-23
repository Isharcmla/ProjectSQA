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

public class Fraction_reduce_5358591311236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term400141;
     Object term400678;
     Object term400672;

    public Fraction_reduce_5358591311236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term400141 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term400141, term400141.getClass(), "numerator", -401436258);
        setIntField(term400141, term400141.getClass(), "denominator", 274320009);
        term400678 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term400678, term400678.getClass(), "numerator", -401436258);
        setIntField(term400678, term400678.getClass(), "denominator", 274320009);
        setField(term400678, term400678.getClass(), "toString", null);
        setField(term400678, term400678.getClass(), "toProperString", null);
        term400672 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term400672, term400672.getClass(), "numerator", -133812086);
        setIntField(term400672, term400672.getClass(), "denominator", 91440003);
        setField(term400672, term400672.getClass(), "toString", null);
        setField(term400672, term400672.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term400141, args);
        assertTrue(recursiveEquals(term400141, term400678));
        assertTrue(recursiveEquals(retValue, term400672));
    }

};


