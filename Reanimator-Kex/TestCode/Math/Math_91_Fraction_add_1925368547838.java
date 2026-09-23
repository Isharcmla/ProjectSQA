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

public class Fraction_add_1925368547838 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term315704;
     Object term315792;

    public Fraction_add_1925368547838() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term315704 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term315704, term315704.getClass(), "numerator", 1073741824);
        setIntField(term315704, term315704.getClass(), "denominator", -488629753);
        term315792 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term315792, term315792.getClass(), "numerator", 1);
        setIntField(term315792, term315792.getClass(), "denominator", 1760035451);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term315792;
        callMethod(klass, "add", argTypes, term315704, args);
    }

};


