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

public class Fraction_reduce_5358591311884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term615450;
     Object term616115;
     Object term616112;

    public Fraction_reduce_5358591311884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term615450 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term615450, term615450.getClass(), "numerator", 521385682);
        setIntField(term615450, term615450.getClass(), "denominator", 1601681105);
        term616115 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term616115, term616115.getClass(), "numerator", 521385682);
        setIntField(term616115, term616115.getClass(), "denominator", 1601681105);
        setField(term616115, term616115.getClass(), "toString", null);
        setField(term616115, term616115.getClass(), "toProperString", null);
        term616112 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term616112, term616112.getClass(), "numerator", 521385682);
        setIntField(term616112, term616112.getClass(), "denominator", 1601681105);
        setField(term616112, term616112.getClass(), "toString", null);
        setField(term616112, term616112.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term615450, args);
        assertTrue(recursiveEquals(term615450, term616115));
        assertTrue(recursiveEquals(retValue, term616112));
    }

};


