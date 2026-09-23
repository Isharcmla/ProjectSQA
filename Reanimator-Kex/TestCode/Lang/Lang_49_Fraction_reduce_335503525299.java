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

public class Fraction_reduce_335503525299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77819;
     Object term78588;
     Object term78582;

    public Fraction_reduce_335503525299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77819 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term77819, term77819.getClass(), "numerator", 931573506);
        setIntField(term77819, term77819.getClass(), "denominator", 1955025993);
        term78588 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term78588, term78588.getClass(), "numerator", 931573506);
        setIntField(term78588, term78588.getClass(), "denominator", 1955025993);
        setField(term78588, term78588.getClass(), "toString", null);
        setField(term78588, term78588.getClass(), "toProperString", null);
        term78582 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term78582, term78582.getClass(), "numerator", 310524502);
        setIntField(term78582, term78582.getClass(), "denominator", 651675331);
        setField(term78582, term78582.getClass(), "toString", null);
        setField(term78582, term78582.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term77819, args);
        assertTrue(recursiveEquals(term77819, term78588));
        assertTrue(recursiveEquals(retValue, term78582));
    }

};


