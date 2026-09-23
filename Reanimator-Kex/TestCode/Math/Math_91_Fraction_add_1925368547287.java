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

public class Fraction_add_1925368547287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94787;
     Object term94875;

    public Fraction_add_1925368547287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94787 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term94787, term94787.getClass(), "numerator", 128);
        setIntField(term94787, term94787.getClass(), "denominator", -363854847);
        term94875 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term94875, term94875.getClass(), "numerator", 1048576);
        setIntField(term94875, term94875.getClass(), "denominator", 1100032013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term94875;
        try {
            callMethod(klass, "add", argTypes, term94787, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


