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

public class Fraction_reduce_5358591311661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term540379;
     Object term540588;
     Object term540582;

    public Fraction_reduce_5358591311661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term540379 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term540379, term540379.getClass(), "numerator", 753536586);
        setIntField(term540379, term540379.getClass(), "denominator", 2131043853);
        term540588 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term540588, term540588.getClass(), "numerator", 753536586);
        setIntField(term540588, term540588.getClass(), "denominator", 2131043853);
        setField(term540588, term540588.getClass(), "toString", null);
        setField(term540588, term540588.getClass(), "toProperString", null);
        term540582 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term540582, term540582.getClass(), "numerator", 251178862);
        setIntField(term540582, term540582.getClass(), "denominator", 710347951);
        setField(term540582, term540582.getClass(), "toString", null);
        setField(term540582, term540582.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term540379, args);
        assertTrue(recursiveEquals(term540379, term540588));
        assertTrue(recursiveEquals(retValue, term540582));
    }

};


