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

public class Fraction_reduce_5358591311252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term405482;
     Object term406462;
     Object term406456;

    public Fraction_reduce_5358591311252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term405482 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term405482, term405482.getClass(), "numerator", -964541430);
        setIntField(term405482, term405482.getClass(), "denominator", 1875008259);
        term406462 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term406462, term406462.getClass(), "numerator", -964541430);
        setIntField(term406462, term406462.getClass(), "denominator", 1875008259);
        setField(term406462, term406462.getClass(), "toString", null);
        setField(term406462, term406462.getClass(), "toProperString", null);
        term406456 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term406456, term406456.getClass(), "numerator", -107171270);
        setIntField(term406456, term406456.getClass(), "denominator", 208334251);
        setField(term406456, term406456.getClass(), "toString", null);
        setField(term406456, term406456.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term405482, args);
        assertTrue(recursiveEquals(term405482, term406462));
        assertTrue(recursiveEquals(retValue, term406456));
    }

};


