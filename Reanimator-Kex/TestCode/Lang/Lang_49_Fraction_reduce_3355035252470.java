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

public class Fraction_reduce_3355035252470 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term734914;
     Object term735829;
     Object term735826;

    public Fraction_reduce_3355035252470() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term734914 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term734914, term734914.getClass(), "numerator", -275087314);
        setIntField(term734914, term734914.getClass(), "denominator", 2114539623);
        term735829 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term735829, term735829.getClass(), "numerator", -275087314);
        setIntField(term735829, term735829.getClass(), "denominator", 2114539623);
        setField(term735829, term735829.getClass(), "toString", null);
        setField(term735829, term735829.getClass(), "toProperString", null);
        term735826 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term735826, term735826.getClass(), "numerator", -275087314);
        setIntField(term735826, term735826.getClass(), "denominator", 2114539623);
        setField(term735826, term735826.getClass(), "toString", null);
        setField(term735826, term735826.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term734914, args);
        assertTrue(recursiveEquals(term734914, term735829));
        assertTrue(recursiveEquals(retValue, term735826));
    }

};


