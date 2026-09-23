package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_145497702158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term676;
     Object term703;

    public Fraction_add_145497702158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term676 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term676, term676.getClass(), "numerator", 1328271830);
        setIntField(term676, term676.getClass(), "denominator", 1596070772);
        setField(term676, term676.getClass(), "toString", "OclPbYPkcH");
        setField(term676, term676.getClass(), "toProperString", "IoAlmYsBwc");
        term703 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term703, term703.getClass(), "numerator", -1371869594);
        setIntField(term703, term703.getClass(), "denominator", -2095575670);
        setField(term703, term703.getClass(), "toString", "TEParAifyi");
        setField(term703, term703.getClass(), "toProperString", "OWDIEULEFu");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term703;
        try {
            callMethod(klass, "add", argTypes, term676, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


