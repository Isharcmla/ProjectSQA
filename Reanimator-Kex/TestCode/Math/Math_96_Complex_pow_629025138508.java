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

public class Complex_pow_629025138508 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128761;
     Object term128845;
     Object term129016;
     Object term129017;
     Object term129013;

    public Complex_pow_629025138508() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128761 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term128761, term128761.getClass(), "real", -8.6469112845429637E18);
        setDoubleField(term128761, term128761.getClass(), "imaginary", 0.0);
        term128845 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term128845, term128845.getClass(), "real", -9.2188684372274053E18);
        setDoubleField(term128845, term128845.getClass(), "imaginary", -9.2188640391808942E18);
        term129016 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term129016, term129016.getClass(), "imaginary", 0.0);
        setDoubleField(term129016, term129016.getClass(), "real", -8.6469112845429637E18);
        term129017 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term129017, term129017.getClass(), "imaginary", -9.2188640391808942E18);
        setDoubleField(term129017, term129017.getClass(), "real", -9.2188684372274053E18);
        term129013 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term129013, term129013.getClass(), "imaginary", 0.0);
        setDoubleField(term129013, term129013.getClass(), "real", -0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term128845;
        Object retValue = callMethod(klass, "pow", argTypes, term128761, args);
        assertTrue(recursiveEquals(term128761, term129016));
        assertTrue(recursiveEquals(term128845, term129017));
        assertTrue(recursiveEquals(retValue, term129013));
    }

};


