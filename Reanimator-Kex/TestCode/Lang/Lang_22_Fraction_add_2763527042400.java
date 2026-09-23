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

public class Fraction_add_2763527042400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term784827;
     Object term784909;
     Object term785295;
     Object term785296;
     Object term785292;

    public Fraction_add_2763527042400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term784827 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term784827, term784827.getClass(), "numerator", 8192);
        setIntField(term784827, term784827.getClass(), "denominator", 908);
        term784909 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term784909, term784909.getClass(), "numerator", 2);
        setIntField(term784909, term784909.getClass(), "denominator", -1402);
        term785295 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term785295, term785295.getClass(), "numerator", 8192);
        setIntField(term785295, term785295.getClass(), "denominator", 908);
        setField(term785295, term785295.getClass(), "toString", null);
        setField(term785295, term785295.getClass(), "toProperString", null);
        term785296 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term785296, term785296.getClass(), "numerator", 2);
        setIntField(term785296, term785296.getClass(), "denominator", -1402);
        setField(term785296, term785296.getClass(), "toString", null);
        setField(term785296, term785296.getClass(), "toProperString", null);
        term785292 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term785292, term785292.getClass(), "numerator", -2870842);
        setIntField(term785292, term785292.getClass(), "denominator", -318254);
        setField(term785292, term785292.getClass(), "toString", null);
        setField(term785292, term785292.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term784909;
        Object retValue = callMethod(klass, "add", argTypes, term784827, args);
        assertTrue(recursiveEquals(term784827, term785295));
        assertTrue(recursiveEquals(term784909, term785296));
        assertTrue(recursiveEquals(retValue, term785292));
    }

};


