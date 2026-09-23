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

public class Fraction_reduce_5358591312361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term772337;
     Object term772809;
     Object term772806;

    public Fraction_reduce_5358591312361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term772337 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term772337, term772337.getClass(), "numerator", -989790046);
        setIntField(term772337, term772337.getClass(), "denominator", 1786810327);
        term772809 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term772809, term772809.getClass(), "numerator", -989790046);
        setIntField(term772809, term772809.getClass(), "denominator", 1786810327);
        setField(term772809, term772809.getClass(), "toString", null);
        setField(term772809, term772809.getClass(), "toProperString", null);
        term772806 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term772806, term772806.getClass(), "numerator", -989790046);
        setIntField(term772806, term772806.getClass(), "denominator", 1786810327);
        setField(term772806, term772806.getClass(), "toString", null);
        setField(term772806, term772806.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term772337, args);
        assertTrue(recursiveEquals(term772337, term772809));
        assertTrue(recursiveEquals(retValue, term772806));
    }

};


