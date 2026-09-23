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

public class Fraction_subtract_1443627440124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23802;
     Object term23882;
     Object term24580;
     Object term24581;
     Object term24577;

    public Fraction_subtract_1443627440124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23802 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term23802, term23802.getClass(), "numerator", 16);
        setIntField(term23802, term23802.getClass(), "denominator", -1074382136);
        term23882 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term23882, term23882.getClass(), "numerator", 4);
        setIntField(term23882, term23882.getClass(), "denominator", 804433028);
        term24580 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term24580, term24580.getClass(), "numerator", 16);
        setIntField(term24580, term24580.getClass(), "denominator", -1074382136);
        setField(term24580, term24580.getClass(), "toString", null);
        setField(term24580, term24580.getClass(), "toProperString", null);
        term24581 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term24581, term24581.getClass(), "numerator", 4);
        setIntField(term24581, term24581.getClass(), "denominator", 804433028);
        setField(term24581, term24581.getClass(), "toString", null);
        setField(term24581, term24581.getClass(), "toProperString", null);
        term24577 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term24577, term24577.getClass(), "numerator", 1073028562);
        setIntField(term24577, term24577.getClass(), "denominator", 1798851314);
        setField(term24577, term24577.getClass(), "toString", null);
        setField(term24577, term24577.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term23882;
        Object retValue = callMethod(klass, "subtract", argTypes, term23802, args);
        assertTrue(recursiveEquals(term23802, term24580));
        assertTrue(recursiveEquals(term23882, term24581));
        assertTrue(recursiveEquals(retValue, term24577));
    }

};


