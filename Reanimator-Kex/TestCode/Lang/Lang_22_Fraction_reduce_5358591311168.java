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

public class Fraction_reduce_5358591311168 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term377135;
     Object term377979;
     Object term377976;

    public Fraction_reduce_5358591311168() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term377135 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term377135, term377135.getClass(), "numerator", 436207202);
        setIntField(term377135, term377135.getClass(), "denominator", 1660944585);
        term377979 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term377979, term377979.getClass(), "numerator", 436207202);
        setIntField(term377979, term377979.getClass(), "denominator", 1660944585);
        setField(term377979, term377979.getClass(), "toString", null);
        setField(term377979, term377979.getClass(), "toProperString", null);
        term377976 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term377976, term377976.getClass(), "numerator", 436207202);
        setIntField(term377976, term377976.getClass(), "denominator", 1660944585);
        setField(term377976, term377976.getClass(), "toString", null);
        setField(term377976, term377976.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term377135, args);
        assertTrue(recursiveEquals(term377135, term377979));
        assertTrue(recursiveEquals(retValue, term377976));
    }

};


