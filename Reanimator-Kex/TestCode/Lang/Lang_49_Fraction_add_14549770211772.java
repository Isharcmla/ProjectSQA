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

public class Fraction_add_14549770211772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term518877;
     Object term518957;
     Object term519464;
     Object term519465;
     Object term519461;

    public Fraction_add_14549770211772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term518877 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term518877, term518877.getClass(), "numerator", 2147483647);
        setIntField(term518877, term518877.getClass(), "denominator", 262144);
        term518957 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term518957, term518957.getClass(), "numerator", -2147483648);
        setIntField(term518957, term518957.getClass(), "denominator", 262144);
        term519464 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term519464, term519464.getClass(), "numerator", 2147483647);
        setIntField(term519464, term519464.getClass(), "denominator", 262144);
        setField(term519464, term519464.getClass(), "toString", null);
        setField(term519464, term519464.getClass(), "toProperString", null);
        term519465 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term519465, term519465.getClass(), "numerator", -2147483648);
        setIntField(term519465, term519465.getClass(), "denominator", 262144);
        setField(term519465, term519465.getClass(), "toString", null);
        setField(term519465, term519465.getClass(), "toProperString", null);
        term519461 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term519461, term519461.getClass(), "numerator", -1);
        setIntField(term519461, term519461.getClass(), "denominator", 262144);
        setField(term519461, term519461.getClass(), "toString", null);
        setField(term519461, term519461.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term518957;
        Object retValue = callMethod(klass, "add", argTypes, term518877, args);
        assertTrue(recursiveEquals(term518877, term519464));
        assertTrue(recursiveEquals(term518957, term519465));
        assertTrue(recursiveEquals(retValue, term519461));
    }

};


