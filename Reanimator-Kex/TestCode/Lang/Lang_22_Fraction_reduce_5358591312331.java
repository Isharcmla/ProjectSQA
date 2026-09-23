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

public class Fraction_reduce_5358591312331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term761792;
     Object term762400;
     Object term762397;

    public Fraction_reduce_5358591312331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term761792 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term761792, term761792.getClass(), "numerator", -2147483122);
        setIntField(term761792, term761792.getClass(), "denominator", 2147483105);
        term762400 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term762400, term762400.getClass(), "numerator", -2147483122);
        setIntField(term762400, term762400.getClass(), "denominator", 2147483105);
        setField(term762400, term762400.getClass(), "toString", null);
        setField(term762400, term762400.getClass(), "toProperString", null);
        term762397 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term762397, term762397.getClass(), "numerator", -2147483122);
        setIntField(term762397, term762397.getClass(), "denominator", 2147483105);
        setField(term762397, term762397.getClass(), "toString", null);
        setField(term762397, term762397.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term761792, args);
        assertTrue(recursiveEquals(term761792, term762400));
        assertTrue(recursiveEquals(retValue, term762397));
    }

};


