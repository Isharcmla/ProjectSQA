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

public class Fraction_multiplyBy_4574221382029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term660287;
     Object term660369;
     Object term661120;
     Object term661121;
     Object term661111;

    public Fraction_multiplyBy_4574221382029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term660287 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term660287, term660287.getClass(), "numerator", 536871442);
        setIntField(term660287, term660287.getClass(), "denominator", -2);
        term660369 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term660369, term660369.getClass(), "numerator", 3);
        setIntField(term660369, term660369.getClass(), "denominator", 1610612749);
        term661120 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term661120, term661120.getClass(), "numerator", 536871442);
        setIntField(term661120, term661120.getClass(), "denominator", -2);
        setField(term661120, term661120.getClass(), "toString", null);
        setField(term661120, term661120.getClass(), "toProperString", null);
        term661121 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term661121, term661121.getClass(), "numerator", 3);
        setIntField(term661121, term661121.getClass(), "denominator", 1610612749);
        setField(term661121, term661121.getClass(), "toString", null);
        setField(term661121, term661121.getClass(), "toProperString", null);
        term661111 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term661111, term661111.getClass(), "numerator", 805307163);
        setIntField(term661111, term661111.getClass(), "denominator", 536870899);
        setField(term661111, term661111.getClass(), "toString", null);
        setField(term661111, term661111.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term660369;
        Object retValue = callMethod(klass, "multiplyBy", argTypes, term660287, args);
        assertTrue(recursiveEquals(term660287, term661120));
        assertTrue(recursiveEquals(term660369, term661121));
        assertTrue(recursiveEquals(retValue, term661111));
    }

};


