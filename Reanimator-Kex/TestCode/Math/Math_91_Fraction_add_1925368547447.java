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

public class Fraction_add_1925368547447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163260;
     Object term163348;

    public Fraction_add_1925368547447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163260 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term163260, term163260.getClass(), "numerator", 16);
        setIntField(term163260, term163260.getClass(), "denominator", -260891897);
        term163348 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term163348, term163348.getClass(), "numerator", 67108864);
        setIntField(term163348, term163348.getClass(), "denominator", 944819099);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term163348;
        callMethod(klass, "add", argTypes, term163260, args);
    }

};


