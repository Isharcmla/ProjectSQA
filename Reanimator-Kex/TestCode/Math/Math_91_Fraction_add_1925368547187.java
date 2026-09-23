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

public class Fraction_add_1925368547187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57649;
     Object term57737;

    public Fraction_add_1925368547187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57649 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term57649, term57649.getClass(), "numerator", 1073741824);
        setIntField(term57649, term57649.getClass(), "denominator", -255311217);
        term57737 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term57737, term57737.getClass(), "numerator", 1073741824);
        setIntField(term57737, term57737.getClass(), "denominator", 1864810179);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term57737;
        callMethod(klass, "add", argTypes, term57649, args);
    }

};


