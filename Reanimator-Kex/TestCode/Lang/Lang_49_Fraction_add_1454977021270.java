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

public class Fraction_add_1454977021270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67078;
     Object term67699;
     Object term67700;
     Object term67696;

    public Fraction_add_1454977021270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67078 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term67078, term67078.getClass(), "numerator", -2147483648);
        setIntField(term67078, term67078.getClass(), "denominator", 1073741824);
        term67699 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term67699, term67699.getClass(), "numerator", -2147483648);
        setIntField(term67699, term67699.getClass(), "denominator", 1073741824);
        setField(term67699, term67699.getClass(), "toString", null);
        setField(term67699, term67699.getClass(), "toProperString", null);
        term67700 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term67700, term67700.getClass(), "numerator", -2147483648);
        setIntField(term67700, term67700.getClass(), "denominator", 1073741824);
        setField(term67700, term67700.getClass(), "toString", null);
        setField(term67700, term67700.getClass(), "toProperString", null);
        term67696 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term67696, term67696.getClass(), "numerator", -4);
        setIntField(term67696, term67696.getClass(), "denominator", 1);
        setField(term67696, term67696.getClass(), "toString", null);
        setField(term67696, term67696.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term67078;
        Object retValue = callMethod(klass, "add", argTypes, term67078, args);
        assertTrue(recursiveEquals(term67078, term67699));
        assertTrue(recursiveEquals(term67078, term67700));
        assertTrue(recursiveEquals(retValue, term67696));
    }

};


