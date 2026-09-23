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
import java.lang.ArithmeticException;
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_1925368547818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306990;
     Object term307078;

    public Fraction_add_1925368547818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term306990 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term306990, term306990.getClass(), "numerator", 536870912);
        setIntField(term306990, term306990.getClass(), "denominator", -1742268410);
        term307078 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term307078, term307078.getClass(), "numerator", 8388608);
        setIntField(term307078, term307078.getClass(), "denominator", 215614529);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term307078;
        try {
            callMethod(klass, "add", argTypes, term306990, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


