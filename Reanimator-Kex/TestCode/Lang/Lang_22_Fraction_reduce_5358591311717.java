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

public class Fraction_reduce_5358591311717 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term556728;
     Object term557246;
     Object term557243;

    public Fraction_reduce_5358591311717() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term556728 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term556728, term556728.getClass(), "numerator", 1342177234);
        setIntField(term556728, term556728.getClass(), "denominator", 1879048193);
        term557246 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term557246, term557246.getClass(), "numerator", 1342177234);
        setIntField(term557246, term557246.getClass(), "denominator", 1879048193);
        setField(term557246, term557246.getClass(), "toString", null);
        setField(term557246, term557246.getClass(), "toProperString", null);
        term557243 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term557243, term557243.getClass(), "numerator", 1342177234);
        setIntField(term557243, term557243.getClass(), "denominator", 1879048193);
        setField(term557243, term557243.getClass(), "toString", null);
        setField(term557243, term557243.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term556728, args);
        assertTrue(recursiveEquals(term556728, term557246));
        assertTrue(recursiveEquals(retValue, term557243));
    }

};


