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

public class Fraction_add_1454977021879 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249809;
     Object term250030;
     Object term250031;
     Object term250027;

    public Fraction_add_1454977021879() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term249809 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term249809, term249809.getClass(), "numerator", -2147483648);
        setIntField(term249809, term249809.getClass(), "denominator", 33554432);
        term250030 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term250030, term250030.getClass(), "numerator", -2147483648);
        setIntField(term250030, term250030.getClass(), "denominator", 33554432);
        setField(term250030, term250030.getClass(), "toString", null);
        setField(term250030, term250030.getClass(), "toProperString", null);
        term250031 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term250031, term250031.getClass(), "numerator", -2147483648);
        setIntField(term250031, term250031.getClass(), "denominator", 33554432);
        setField(term250031, term250031.getClass(), "toString", null);
        setField(term250031, term250031.getClass(), "toProperString", null);
        term250027 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term250027, term250027.getClass(), "numerator", -128);
        setIntField(term250027, term250027.getClass(), "denominator", 1);
        setField(term250027, term250027.getClass(), "toString", null);
        setField(term250027, term250027.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term249809;
        Object retValue = callMethod(klass, "add", argTypes, term249809, args);
        assertTrue(recursiveEquals(term249809, term250030));
        assertTrue(recursiveEquals(term249809, term250031));
        assertTrue(recursiveEquals(retValue, term250027));
    }

};


