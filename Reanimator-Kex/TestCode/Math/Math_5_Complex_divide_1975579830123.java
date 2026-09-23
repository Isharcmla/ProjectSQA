package org.apache.commons.math3.complex;

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
import static org.apache.commons.math3.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.complex.EqualityUtils.*;

public class Complex_divide_1975579830123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17035;
     Object term17121;
     Object term17172;
     Object term17173;
     Object term17167;

    public Complex_divide_1975579830123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17035 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setBooleanField(term17035, term17035.getClass(), "isNaN", false);
        setBooleanField(term17035, term17035.getClass(), "isInfinite", true);
        term17121 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setBooleanField(term17121, term17121.getClass(), "isNaN", false);
        setDoubleField(term17121, term17121.getClass(), "real", -9.2188684372274053E18);
        setDoubleField(term17121, term17121.getClass(), "imaginary", 0.0);
        setBooleanField(term17121, term17121.getClass(), "isInfinite", true);
        term17172 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term17172, term17172.getClass(), "imaginary", 0.0);
        setDoubleField(term17172, term17172.getClass(), "real", 0.0);
        setBooleanField(term17172, term17172.getClass(), "isNaN", false);
        setBooleanField(term17172, term17172.getClass(), "isInfinite", true);
        term17173 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term17173, term17173.getClass(), "imaginary", 0.0);
        setDoubleField(term17173, term17173.getClass(), "real", -9.2188684372274053E18);
        setBooleanField(term17173, term17173.getClass(), "isNaN", false);
        setBooleanField(term17173, term17173.getClass(), "isInfinite", true);
        term17167 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term17167, term17167.getClass(), "imaginary", -0.0);
        setDoubleField(term17167, term17167.getClass(), "real", -0.0);
        setBooleanField(term17167, term17167.getClass(), "isNaN", false);
        setBooleanField(term17167, term17167.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term17121;
        Object retValue = callMethod(klass, "divide", argTypes, term17035, args);
        assertTrue(recursiveEquals(term17035, term17172));
        assertTrue(recursiveEquals(term17121, term17173));
        assertTrue(recursiveEquals(retValue, term17167));
    }

};


