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

public class Fraction_add_1925368547843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317506;
     Object term317594;

    public Fraction_add_1925368547843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term317506 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term317506, term317506.getClass(), "numerator", 1073741824);
        setIntField(term317506, term317506.getClass(), "denominator", -134207839);
        term317594 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term317594, term317594.getClass(), "numerator", 2);
        setIntField(term317594, term317594.getClass(), "denominator", 1476953773);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term317594;
        callMethod(klass, "add", argTypes, term317506, args);
    }

};


