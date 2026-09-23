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

public class Fraction_reduce_5358591312181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term710404;
     Object term710628;
     Object term710622;

    public Fraction_reduce_5358591312181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term710404 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term710404, term710404.getClass(), "numerator", -2119511154);
        setIntField(term710404, term710404.getClass(), "denominator", 1525106865);
        term710628 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term710628, term710628.getClass(), "numerator", -2119511154);
        setIntField(term710628, term710628.getClass(), "denominator", 1525106865);
        setField(term710628, term710628.getClass(), "toString", null);
        setField(term710628, term710628.getClass(), "toProperString", null);
        term710622 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term710622, term710622.getClass(), "numerator", -706503718);
        setIntField(term710622, term710622.getClass(), "denominator", 508368955);
        setField(term710622, term710622.getClass(), "toString", null);
        setField(term710622, term710622.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term710404, args);
        assertTrue(recursiveEquals(term710404, term710628));
        assertTrue(recursiveEquals(retValue, term710622));
    }

};


