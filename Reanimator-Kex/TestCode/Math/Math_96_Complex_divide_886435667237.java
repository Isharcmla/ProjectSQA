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

public class Complex_divide_886435667237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42012;
     Object term42096;
     Object term42135;
     Object term42136;
     Object term42132;

    public Complex_divide_886435667237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42012 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term42012, term42012.getClass(), "real", -9.2233720368505815E18);
        setDoubleField(term42012, term42012.getClass(), "imaginary", -9.2188684366905344E18);
        term42096 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term42096, term42096.getClass(), "real", -8.6908201348490834E18);
        setDoubleField(term42096, term42096.getClass(), "imaginary", 5.3255190200569242E17);
        term42135 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term42135, term42135.getClass(), "imaginary", -9.2188684366905344E18);
        setDoubleField(term42135, term42135.getClass(), "real", -9.2233720368505815E18);
        term42136 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term42136, term42136.getClass(), "imaginary", 5.3255190200569242E17);
        setDoubleField(term42136, term42136.getClass(), "real", -8.6908201348490834E18);
        term42132 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term42132, term42132.getClass(), "imaginary", 1.1215803113246132);
        setDoubleField(term42132, term42132.getClass(), "real", 0.9925498600774246);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term42096;
        Object retValue = callMethod(klass, "divide", argTypes, term42012, args);
        assertTrue(recursiveEquals(term42012, term42135));
        assertTrue(recursiveEquals(term42096, term42136));
        assertTrue(recursiveEquals(retValue, term42132));
    }

};


