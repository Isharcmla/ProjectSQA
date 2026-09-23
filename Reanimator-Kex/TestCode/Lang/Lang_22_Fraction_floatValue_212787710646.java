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

public class Fraction_floatValue_212787710646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term325;
     Object term2979;

    public Fraction_floatValue_212787710646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term325 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term325, term325.getClass(), "numerator", 865208305);
        setIntField(term325, term325.getClass(), "denominator", -1275173084);
        setField(term325, term325.getClass(), "toString", "LQFpaHEwXR");
        setField(term325, term325.getClass(), "toProperString", "oVcInYnLWB");
        term2979 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term2979, term2979.getClass(), "numerator", 865208305);
        setIntField(term2979, term2979.getClass(), "denominator", -1275173084);
        setField(term2979, term2979.getClass(), "toString", "LQFpaHEwXR");
        setField(term2979, term2979.getClass(), "toProperString", "oVcInYnLWB");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "floatValue", argTypes, term325, args);
        assertTrue(recursiveEquals(term325, term2979));
        assertTrue(recursiveEquals(retValue, -0.6785026F));
    }

};


