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
import java.lang.IllegalArgumentException;
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class ProperFractionFormat_format_114076134724 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9322;
     Object term9410;
     Object term9498;

    public ProperFractionFormat_format_114076134724() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9322 = newInstance(Class.forName("org.apache.commons.math.fraction.ProperFractionFormat"));
        term9410 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term9410, term9410.getClass(), "numerator", 0);
        setIntField(term9410, term9410.getClass(), "denominator", 1);
        term9498 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.ProperFractionFormat");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        argTypes[1] = Class.forName("java.lang.StringBuffer");
        argTypes[2] = Class.forName("java.text.FieldPosition");
        Object[] args = new Object[3];
        args[0] = term9410;
        args[1] = null;
        args[2] = term9498;
        try {
            callMethod(klass, "format", argTypes, term9322, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


