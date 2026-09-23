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

public class Fraction_addSub_635379901137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28183;
     Object term28713;
     Object term28714;
     Object term28709;

    public Fraction_addSub_635379901137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28183 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term28183, term28183.getClass(), "numerator", 0);
        term28713 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term28713, term28713.getClass(), "numerator", 0);
        setIntField(term28713, term28713.getClass(), "denominator", 0);
        setField(term28713, term28713.getClass(), "toString", null);
        setField(term28713, term28713.getClass(), "toProperString", null);
        term28714 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term28714, term28714.getClass(), "numerator", 0);
        setIntField(term28714, term28714.getClass(), "denominator", 0);
        setField(term28714, term28714.getClass(), "toString", null);
        setField(term28714, term28714.getClass(), "toProperString", null);
        term28709 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term28709, term28709.getClass(), "numerator", 0);
        setIntField(term28709, term28709.getClass(), "denominator", 0);
        setField(term28709, term28709.getClass(), "toString", null);
        setField(term28709, term28709.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term28183;
        args[1] = false;
        Object retValue = callMethod(klass, "addSub", argTypes, term28183, args);
        assertTrue(recursiveEquals(term28183, term28713));
        assertTrue(recursiveEquals(term28183, term28714));
        assertTrue(recursiveEquals(retValue, term28709));
    }

};


