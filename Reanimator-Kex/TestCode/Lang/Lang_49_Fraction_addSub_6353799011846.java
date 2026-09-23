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

public class Fraction_addSub_6353799011846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term541047;
     Object term541127;
     Object term541587;
     Object term541588;
     Object term541577;

    public Fraction_addSub_6353799011846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term541047 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term541047, term541047.getClass(), "numerator", 8388608);
        setIntField(term541047, term541047.getClass(), "denominator", 8192);
        term541127 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term541127, term541127.getClass(), "numerator", 33554432);
        setIntField(term541127, term541127.getClass(), "denominator", 1073741824);
        term541587 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term541587, term541587.getClass(), "numerator", 8388608);
        setIntField(term541587, term541587.getClass(), "denominator", 8192);
        setField(term541587, term541587.getClass(), "toString", null);
        setField(term541587, term541587.getClass(), "toProperString", null);
        term541588 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term541588, term541588.getClass(), "numerator", 33554432);
        setIntField(term541588, term541588.getClass(), "denominator", 1073741824);
        setField(term541588, term541588.getClass(), "toString", null);
        setField(term541588, term541588.getClass(), "toProperString", null);
        term541577 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term541577, term541577.getClass(), "numerator", 134213632);
        setIntField(term541577, term541577.getClass(), "denominator", 131072);
        setField(term541577, term541577.getClass(), "toString", null);
        setField(term541577, term541577.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term541127;
        args[1] = false;
        Object retValue = callMethod(klass, "addSub", argTypes, term541047, args);
        assertTrue(recursiveEquals(term541047, term541587));
        assertTrue(recursiveEquals(term541127, term541588));
        assertTrue(recursiveEquals(retValue, term541577));
    }

};


