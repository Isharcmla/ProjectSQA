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
import java.lang.Boolean;

public class Fraction_addSub_63537990160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term864;
     Object term891;
     Object term918;

    public Fraction_addSub_63537990160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term864 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term864, term864.getClass(), "numerator", 962840079);
        setIntField(term864, term864.getClass(), "denominator", 1540719661);
        setField(term864, term864.getClass(), "toString", "Ghbwtircqb");
        setField(term864, term864.getClass(), "toProperString", "xrwlQZdwCp");
        term891 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term891, term891.getClass(), "numerator", 335112684);
        setIntField(term891, term891.getClass(), "denominator", 1551099402);
        setField(term891, term891.getClass(), "toString", "IDCWpPLRkE");
        setField(term891, term891.getClass(), "toProperString", "nyiiPDVjAc");
        term918 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term891;
        args[1] = term918;
        try {
            callMethod(klass, "addSub", argTypes, term864, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


