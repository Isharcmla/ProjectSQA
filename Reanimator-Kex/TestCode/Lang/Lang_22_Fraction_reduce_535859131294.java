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

public class Fraction_reduce_535859131294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81953;
     Object term82486;
     Object term82483;

    public Fraction_reduce_535859131294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81953 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term81953, term81953.getClass(), "numerator", -264933370);
        setIntField(term81953, term81953.getClass(), "denominator", 1484675077);
        term82486 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term82486, term82486.getClass(), "numerator", -264933370);
        setIntField(term82486, term82486.getClass(), "denominator", 1484675077);
        setField(term82486, term82486.getClass(), "toString", null);
        setField(term82486, term82486.getClass(), "toProperString", null);
        term82483 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term82483, term82483.getClass(), "numerator", -264933370);
        setIntField(term82483, term82483.getClass(), "denominator", 1484675077);
        setField(term82483, term82483.getClass(), "toString", null);
        setField(term82483, term82483.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term81953, args);
        assertTrue(recursiveEquals(term81953, term82486));
        assertTrue(recursiveEquals(retValue, term82483));
    }

};


