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

public class Fraction_reduce_5358591312077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term676495;
     Object term677105;
     Object term677102;

    public Fraction_reduce_5358591312077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term676495 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term676495, term676495.getClass(), "numerator", -1492647934);
        setIntField(term676495, term676495.getClass(), "denominator", 787726359);
        term677105 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term677105, term677105.getClass(), "numerator", -1492647934);
        setIntField(term677105, term677105.getClass(), "denominator", 787726359);
        setField(term677105, term677105.getClass(), "toString", null);
        setField(term677105, term677105.getClass(), "toProperString", null);
        term677102 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term677102, term677102.getClass(), "numerator", -1492647934);
        setIntField(term677102, term677102.getClass(), "denominator", 787726359);
        setField(term677102, term677102.getClass(), "toString", null);
        setField(term677102, term677102.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term676495, args);
        assertTrue(recursiveEquals(term676495, term677105));
        assertTrue(recursiveEquals(retValue, term677102));
    }

};


