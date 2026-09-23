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

public class Fraction_reduce_5358591311078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346507;
     Object term347077;
     Object term347071;

    public Fraction_reduce_5358591311078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term346507 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term346507, term346507.getClass(), "numerator", -64487286);
        setIntField(term346507, term346507.getClass(), "denominator", 2085380643);
        term347077 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term347077, term347077.getClass(), "numerator", -64487286);
        setIntField(term347077, term347077.getClass(), "denominator", 2085380643);
        setField(term347077, term347077.getClass(), "toString", null);
        setField(term347077, term347077.getClass(), "toProperString", null);
        term347071 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term347071, term347071.getClass(), "numerator", -21495762);
        setIntField(term347071, term347071.getClass(), "denominator", 695126881);
        setField(term347071, term347071.getClass(), "toString", null);
        setField(term347071, term347071.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term346507, args);
        assertTrue(recursiveEquals(term346507, term347077));
        assertTrue(recursiveEquals(retValue, term347071));
    }

};


