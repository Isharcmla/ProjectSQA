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

public class Fraction_reduce_535859131943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term301733;
     Object term302254;
     Object term302251;

    public Fraction_reduce_535859131943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term301733 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term301733, term301733.getClass(), "numerator", -1073731250);
        setIntField(term301733, term301733.getClass(), "denominator", 1644180673);
        term302254 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term302254, term302254.getClass(), "numerator", -1073731250);
        setIntField(term302254, term302254.getClass(), "denominator", 1644180673);
        setField(term302254, term302254.getClass(), "toString", null);
        setField(term302254, term302254.getClass(), "toProperString", null);
        term302251 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term302251, term302251.getClass(), "numerator", -1073731250);
        setIntField(term302251, term302251.getClass(), "denominator", 1644180673);
        setField(term302251, term302251.getClass(), "toString", null);
        setField(term302251, term302251.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term301733, args);
        assertTrue(recursiveEquals(term301733, term302254));
        assertTrue(recursiveEquals(retValue, term302251));
    }

};


