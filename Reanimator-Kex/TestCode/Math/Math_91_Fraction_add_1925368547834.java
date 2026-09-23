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

public class Fraction_add_1925368547834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314198;
     Object term314286;

    public Fraction_add_1925368547834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term314198 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term314198, term314198.getClass(), "numerator", 2097152);
        setIntField(term314198, term314198.getClass(), "denominator", -256365305);
        term314286 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term314286, term314286.getClass(), "numerator", 2);
        setIntField(term314286, term314286.getClass(), "denominator", 811356443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term314286;
        callMethod(klass, "add", argTypes, term314198, args);
    }

};


