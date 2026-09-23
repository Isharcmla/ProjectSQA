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

public class Fraction_add_2763527042585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term848046;
     Object term848128;
     Object term848215;
     Object term848216;
     Object term848212;

    public Fraction_add_2763527042585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term848046 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term848046, term848046.getClass(), "numerator", 16384);
        setIntField(term848046, term848046.getClass(), "denominator", 153372);
        term848128 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term848128, term848128.getClass(), "numerator", 128);
        setIntField(term848128, term848128.getClass(), "denominator", -229378);
        term848215 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term848215, term848215.getClass(), "numerator", 16384);
        setIntField(term848215, term848215.getClass(), "denominator", 153372);
        setField(term848215, term848215.getClass(), "toString", null);
        setField(term848215, term848215.getClass(), "toProperString", null);
        term848216 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term848216, term848216.getClass(), "numerator", 128);
        setIntField(term848216, term848216.getClass(), "denominator", -229378);
        setField(term848216, term848216.getClass(), "toString", null);
        setField(term848216, term848216.getClass(), "toProperString", null);
        term848212 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term848212, term848212.getClass(), "numerator", -934624384);
        setIntField(term848212, term848212.getClass(), "denominator", -205106062);
        setField(term848212, term848212.getClass(), "toString", null);
        setField(term848212, term848212.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term848128;
        Object retValue = callMethod(klass, "add", argTypes, term848046, args);
        assertTrue(recursiveEquals(term848046, term848215));
        assertTrue(recursiveEquals(term848128, term848216));
        assertTrue(recursiveEquals(retValue, term848212));
    }

};


