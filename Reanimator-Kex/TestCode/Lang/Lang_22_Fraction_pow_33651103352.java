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
import java.lang.Integer;

public class Fraction_pow_33651103352 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term607;
     Object term634;

    public Fraction_pow_33651103352() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term607 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term607, term607.getClass(), "numerator", -817164822);
        setIntField(term607, term607.getClass(), "denominator", -1016503459);
        setField(term607, term607.getClass(), "toString", "vrQLuWIDJX");
        setField(term607, term607.getClass(), "toProperString", "flxyYxBRtu");
        term634 = new Integer(579005622);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term634;
        try {
            callMethod(klass, "pow", argTypes, term607, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


