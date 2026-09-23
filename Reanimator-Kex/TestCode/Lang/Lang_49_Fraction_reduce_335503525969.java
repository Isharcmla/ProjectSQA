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

public class Fraction_reduce_335503525969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term278471;
     Object term278577;
     Object term278574;

    public Fraction_reduce_335503525969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term278471 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term278471, term278471.getClass(), "numerator", 536870942);
        setIntField(term278471, term278471.getClass(), "denominator", 1742324471);
        term278577 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term278577, term278577.getClass(), "numerator", 536870942);
        setIntField(term278577, term278577.getClass(), "denominator", 1742324471);
        setField(term278577, term278577.getClass(), "toString", null);
        setField(term278577, term278577.getClass(), "toProperString", null);
        term278574 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term278574, term278574.getClass(), "numerator", 536870942);
        setIntField(term278574, term278574.getClass(), "denominator", 1742324471);
        setField(term278574, term278574.getClass(), "toString", null);
        setField(term278574, term278574.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term278471, args);
        assertTrue(recursiveEquals(term278471, term278577));
        assertTrue(recursiveEquals(retValue, term278574));
    }

};


