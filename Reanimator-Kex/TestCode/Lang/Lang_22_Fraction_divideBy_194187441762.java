package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_divideBy_194187441762 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1054;
     Object term1081;

    public Fraction_divideBy_194187441762() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1054 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term1054, term1054.getClass(), "numerator", 1240914516);
        setIntField(term1054, term1054.getClass(), "denominator", -1465035361);
        setField(term1054, term1054.getClass(), "toString", "hxCBltsObl");
        setField(term1054, term1054.getClass(), "toProperString", "BndsHwAFMv");
        term1081 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term1081, term1081.getClass(), "numerator", -1547384488);
        setIntField(term1081, term1081.getClass(), "denominator", 1442160736);
        setField(term1081, term1081.getClass(), "toString", "GzFkzHGYFt");
        setField(term1081, term1081.getClass(), "toProperString", "tShwQLRGNe");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term1081;
        try {
            callMethod(klass, "divideBy", argTypes, term1054, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


