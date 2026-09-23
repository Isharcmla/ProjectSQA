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

public class Fraction_reduce_335503525689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term190687;
     Object term191457;
     Object term191454;

    public Fraction_reduce_335503525689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term190687 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term190687, term190687.getClass(), "numerator", -1488279678);
        setIntField(term190687, term190687.getClass(), "denominator", 643476479);
        term191457 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term191457, term191457.getClass(), "numerator", -1488279678);
        setIntField(term191457, term191457.getClass(), "denominator", 643476479);
        setField(term191457, term191457.getClass(), "toString", null);
        setField(term191457, term191457.getClass(), "toProperString", null);
        term191454 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term191454, term191454.getClass(), "numerator", -1488279678);
        setIntField(term191454, term191454.getClass(), "denominator", 643476479);
        setField(term191454, term191454.getClass(), "toString", null);
        setField(term191454, term191454.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term190687, args);
        assertTrue(recursiveEquals(term190687, term191457));
        assertTrue(recursiveEquals(retValue, term191454));
    }

};


