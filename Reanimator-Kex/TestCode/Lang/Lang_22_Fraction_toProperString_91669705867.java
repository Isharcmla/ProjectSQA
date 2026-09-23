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

public class Fraction_toProperString_91669705867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1384;
     Object term7427;

    public Fraction_toProperString_91669705867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1384 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term1384, term1384.getClass(), "numerator", -268815336);
        setIntField(term1384, term1384.getClass(), "denominator", -1210583429);
        setField(term1384, term1384.getClass(), "toString", "MLqYREekMl");
        setField(term1384, term1384.getClass(), "toProperString", "ytSBIKXogI");
        term7427 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term7427, term7427.getClass(), "numerator", -268815336);
        setIntField(term7427, term7427.getClass(), "denominator", -1210583429);
        setField(term7427, term7427.getClass(), "toString", "MLqYREekMl");
        setField(term7427, term7427.getClass(), "toProperString", "ytSBIKXogI");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toProperString", argTypes, term1384, args);
        assertTrue(recursiveEquals(term1384, term7427));
        assertTrue(recursiveEquals(retValue, "ytSBIKXogI"));
    }

};


