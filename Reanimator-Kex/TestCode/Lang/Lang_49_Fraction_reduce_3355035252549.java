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

public class Fraction_reduce_3355035252549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term760195;
     Object term760907;
     Object term760904;

    public Fraction_reduce_3355035252549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term760195 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term760195, term760195.getClass(), "numerator", -2046484386);
        setIntField(term760195, term760195.getClass(), "denominator", 771765913);
        term760907 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term760907, term760907.getClass(), "numerator", -2046484386);
        setIntField(term760907, term760907.getClass(), "denominator", 771765913);
        setField(term760907, term760907.getClass(), "toString", null);
        setField(term760907, term760907.getClass(), "toProperString", null);
        term760904 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term760904, term760904.getClass(), "numerator", -2046484386);
        setIntField(term760904, term760904.getClass(), "denominator", 771765913);
        setField(term760904, term760904.getClass(), "toString", null);
        setField(term760904, term760904.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term760195, args);
        assertTrue(recursiveEquals(term760195, term760907));
        assertTrue(recursiveEquals(retValue, term760904));
    }

};


