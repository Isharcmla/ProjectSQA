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

public class Fraction_reduce_5358591311664 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term540796;
     Object term541219;
     Object term541216;

    public Fraction_reduce_5358591311664() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term540796 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term540796, term540796.getClass(), "numerator", -1505738734);
        setIntField(term540796, term540796.getClass(), "denominator", 1218453535);
        term541219 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term541219, term541219.getClass(), "numerator", -1505738734);
        setIntField(term541219, term541219.getClass(), "denominator", 1218453535);
        setField(term541219, term541219.getClass(), "toString", null);
        setField(term541219, term541219.getClass(), "toProperString", null);
        term541216 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term541216, term541216.getClass(), "numerator", -1505738734);
        setIntField(term541216, term541216.getClass(), "denominator", 1218453535);
        setField(term541216, term541216.getClass(), "toString", null);
        setField(term541216, term541216.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term540796, args);
        assertTrue(recursiveEquals(term540796, term541219));
        assertTrue(recursiveEquals(retValue, term541216));
    }

};


