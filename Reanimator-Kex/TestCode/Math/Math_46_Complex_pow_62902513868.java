package org.apache.commons.math.complex;

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
import static org.apache.commons.math.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.complex.EqualityUtils.*;
import java.lang.Double;

public class Complex_pow_62902513868 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184;
     Object term190;
     Object term2822;
     Object term2823;
     Object term2816;

    public Complex_pow_62902513868() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term184, term184.getClass(), "imaginary", 0.9126850255993704);
        setDoubleField(term184, term184.getClass(), "real", 0.11179067076100713);
        setBooleanField(term184, term184.getClass(), "isNaN", true);
        setBooleanField(term184, term184.getClass(), "isInfinite", false);
        setBooleanField(term184, term184.getClass(), "isZero", true);
        term190 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term190, term190.getClass(), "imaginary", 0.5306473989087822);
        setDoubleField(term190, term190.getClass(), "real", 0.022483645678509023);
        setBooleanField(term190, term190.getClass(), "isNaN", false);
        setBooleanField(term190, term190.getClass(), "isInfinite", false);
        setBooleanField(term190, term190.getClass(), "isZero", true);
        term2822 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2822, term2822.getClass(), "imaginary", 0.9126850255993704);
        setDoubleField(term2822, term2822.getClass(), "real", 0.11179067076100713);
        setBooleanField(term2822, term2822.getClass(), "isNaN", true);
        setBooleanField(term2822, term2822.getClass(), "isInfinite", false);
        setBooleanField(term2822, term2822.getClass(), "isZero", true);
        term2823 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2823, term2823.getClass(), "imaginary", 0.5306473989087822);
        setDoubleField(term2823, term2823.getClass(), "real", 0.022483645678509023);
        setBooleanField(term2823, term2823.getClass(), "isNaN", false);
        setBooleanField(term2823, term2823.getClass(), "isInfinite", false);
        setBooleanField(term2823, term2823.getClass(), "isZero", true);
        term2816 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term2816, term2816.getClass(), "imaginary", Double.NaN);
        setDoubleField(term2816, term2816.getClass(), "real", Double.NaN);
        setBooleanField(term2816, term2816.getClass(), "isNaN", true);
        setBooleanField(term2816, term2816.getClass(), "isInfinite", false);
        setBooleanField(term2816, term2816.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term190;
        Object retValue = callMethod(klass, "pow", argTypes, term184, args);
        assertTrue(recursiveEquals(term184, term2822));
        assertTrue(recursiveEquals(term190, term2823));
        assertTrue(recursiveEquals(retValue, term2816));
    }

};


