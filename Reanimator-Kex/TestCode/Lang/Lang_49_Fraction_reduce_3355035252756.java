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

public class Fraction_reduce_3355035252756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term822753;
     Object term823315;
     Object term823309;

    public Fraction_reduce_3355035252756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term822753 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term822753, term822753.getClass(), "numerator", -1478160462);
        setIntField(term822753, term822753.getClass(), "denominator", 66063999);
        term823315 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term823315, term823315.getClass(), "numerator", -1478160462);
        setIntField(term823315, term823315.getClass(), "denominator", 66063999);
        setField(term823315, term823315.getClass(), "toString", null);
        setField(term823315, term823315.getClass(), "toProperString", null);
        term823309 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term823309, term823309.getClass(), "numerator", -492720154);
        setIntField(term823309, term823309.getClass(), "denominator", 22021333);
        setField(term823309, term823309.getClass(), "toString", null);
        setField(term823309, term823309.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term822753, args);
        assertTrue(recursiveEquals(term822753, term823315));
        assertTrue(recursiveEquals(retValue, term823309));
    }

};


