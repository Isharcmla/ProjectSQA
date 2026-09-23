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

public class Fraction_reduce_3355035251525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term449621;
     Object term449818;
     Object term449812;

    public Fraction_reduce_3355035251525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term449621 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term449621, term449621.getClass(), "numerator", -1168763778);
        setIntField(term449621, term449621.getClass(), "denominator", 2082131065);
        term449818 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term449818, term449818.getClass(), "numerator", -1168763778);
        setIntField(term449818, term449818.getClass(), "denominator", 2082131065);
        setField(term449818, term449818.getClass(), "toString", null);
        setField(term449818, term449818.getClass(), "toProperString", null);
        term449812 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term449812, term449812.getClass(), "numerator", -166966254);
        setIntField(term449812, term449812.getClass(), "denominator", 297447295);
        setField(term449812, term449812.getClass(), "toString", null);
        setField(term449812, term449812.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term449621, args);
        assertTrue(recursiveEquals(term449621, term449818));
        assertTrue(recursiveEquals(retValue, term449812));
    }

};


