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

public class Complex_conjugate_294888631101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12744;
     Object term12768;
     Object term12763;

    public Complex_conjugate_294888631101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12744 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setBooleanField(term12744, term12744.getClass(), "isNaN", false);
        setDoubleField(term12744, term12744.getClass(), "real", -9.2166166374137201E18);
        setDoubleField(term12744, term12744.getClass(), "imaginary", -4.503599627370496E15);
        term12768 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term12768, term12768.getClass(), "imaginary", -4.503599627370496E15);
        setDoubleField(term12768, term12768.getClass(), "real", -9.2166166374137201E18);
        setBooleanField(term12768, term12768.getClass(), "isNaN", false);
        setBooleanField(term12768, term12768.getClass(), "isInfinite", false);
        term12763 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term12763, term12763.getClass(), "imaginary", 4.503599627370496E15);
        setDoubleField(term12763, term12763.getClass(), "real", -9.2166166374137201E18);
        setBooleanField(term12763, term12763.getClass(), "isNaN", false);
        setBooleanField(term12763, term12763.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "conjugate", argTypes, term12744, args);
        assertTrue(recursiveEquals(term12744, term12768));
        assertTrue(recursiveEquals(retValue, term12763));
    }

};


