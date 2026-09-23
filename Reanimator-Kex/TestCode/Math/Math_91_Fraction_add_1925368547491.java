package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_1925368547491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180004;
     Object term180092;

    public Fraction_add_1925368547491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180004 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term180004, term180004.getClass(), "numerator", 64);
        setIntField(term180004, term180004.getClass(), "denominator", -823197057);
        term180092 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term180092, term180092.getClass(), "numerator", -2147483648);
        setIntField(term180092, term180092.getClass(), "denominator", 755563617);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term180092;
        callMethod(klass, "add", argTypes, term180004, args);
    }

};


