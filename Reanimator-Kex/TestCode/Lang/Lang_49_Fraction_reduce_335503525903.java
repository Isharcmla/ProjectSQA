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

public class Fraction_reduce_335503525903 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258169;
     Object term258722;
     Object term258716;

    public Fraction_reduce_335503525903() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258169 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term258169, term258169.getClass(), "numerator", -1744801238);
        setIntField(term258169, term258169.getClass(), "denominator", 1073741824);
        term258722 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term258722, term258722.getClass(), "numerator", -1744801238);
        setIntField(term258722, term258722.getClass(), "denominator", 1073741824);
        setField(term258722, term258722.getClass(), "toString", null);
        setField(term258722, term258722.getClass(), "toProperString", null);
        term258716 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term258716, term258716.getClass(), "numerator", -872400619);
        setIntField(term258716, term258716.getClass(), "denominator", 536870912);
        setField(term258716, term258716.getClass(), "toString", null);
        setField(term258716, term258716.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term258169, args);
        assertTrue(recursiveEquals(term258169, term258722));
        assertTrue(recursiveEquals(retValue, term258716));
    }

};


