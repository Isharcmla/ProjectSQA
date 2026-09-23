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

public class Fraction_compareTo_50426397131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1243;
     Object term1270;

    public Fraction_compareTo_50426397131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1243 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term1243, term1243.getClass(), "numerator", 444029505);
        setIntField(term1243, term1243.getClass(), "denominator", -1034506028);
        setField(term1243, term1243.getClass(), "toString", "UiUYnPrcCi");
        setField(term1243, term1243.getClass(), "toProperString", "UoYtihxVaS");
        term1270 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term1270, term1270.getClass(), "numerator", -894662986);
        setIntField(term1270, term1270.getClass(), "denominator", 304775596);
        setField(term1270, term1270.getClass(), "toString", "JDswTTCZHV");
        setField(term1270, term1270.getClass(), "toProperString", "onpbIeEKoi");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term1270;
        callMethod(klass, "compareTo", argTypes, term1243, args);
    }

};


