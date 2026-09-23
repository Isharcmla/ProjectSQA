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

public class Fraction_reduce_5358591312283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term745820;
     Object term746742;
     Object term746736;

    public Fraction_reduce_5358591312283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term745820 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term745820, term745820.getClass(), "numerator", -204690546);
        setIntField(term745820, term745820.getClass(), "denominator", 975978945);
        term746742 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term746742, term746742.getClass(), "numerator", -204690546);
        setIntField(term746742, term746742.getClass(), "denominator", 975978945);
        setField(term746742, term746742.getClass(), "toString", null);
        setField(term746742, term746742.getClass(), "toProperString", null);
        term746736 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term746736, term746736.getClass(), "numerator", -22743394);
        setIntField(term746736, term746736.getClass(), "denominator", 108442105);
        setField(term746736, term746736.getClass(), "toString", null);
        setField(term746736, term746736.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term745820, args);
        assertTrue(recursiveEquals(term745820, term746742));
        assertTrue(recursiveEquals(retValue, term746736));
    }

};


