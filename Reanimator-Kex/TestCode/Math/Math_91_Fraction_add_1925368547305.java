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

public class Fraction_add_1925368547305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term102225;
     Object term102313;

    public Fraction_add_1925368547305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term102225 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term102225, term102225.getClass(), "numerator", 2048);
        setIntField(term102225, term102225.getClass(), "denominator", -139849725);
        term102313 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term102313, term102313.getClass(), "numerator", 65536);
        setIntField(term102313, term102313.getClass(), "denominator", 1455177735);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term102313;
        callMethod(klass, "add", argTypes, term102225, args);
    }

};


