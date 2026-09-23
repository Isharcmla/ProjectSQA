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

public class Fraction_add_1925368547270 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89313;
     Object term89401;

    public Fraction_add_1925368547270() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89313 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term89313, term89313.getClass(), "numerator", 262144);
        setIntField(term89313, term89313.getClass(), "denominator", -268435458);
        term89401 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term89401, term89401.getClass(), "numerator", 1024);
        setIntField(term89401, term89401.getClass(), "denominator", 134217717);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term89401;
        callMethod(klass, "add", argTypes, term89313, args);
    }

};


