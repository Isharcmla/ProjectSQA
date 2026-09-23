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

public class Fraction_reduce_3355035252651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term790890;
     Object term791672;
     Object term791669;

    public Fraction_reduce_3355035252651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term790890 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term790890, term790890.getClass(), "numerator", -933904818);
        setIntField(term790890, term790890.getClass(), "denominator", 318708469);
        term791672 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term791672, term791672.getClass(), "numerator", -933904818);
        setIntField(term791672, term791672.getClass(), "denominator", 318708469);
        setField(term791672, term791672.getClass(), "toString", null);
        setField(term791672, term791672.getClass(), "toProperString", null);
        term791669 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term791669, term791669.getClass(), "numerator", -933904818);
        setIntField(term791669, term791669.getClass(), "denominator", 318708469);
        setField(term791669, term791669.getClass(), "toString", null);
        setField(term791669, term791669.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term790890, args);
        assertTrue(recursiveEquals(term790890, term791672));
        assertTrue(recursiveEquals(retValue, term791669));
    }

};


