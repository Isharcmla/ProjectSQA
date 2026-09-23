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

public class Complex_sqrt1z_866612664166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16082;
     Object term16251;
     Object term16245;

    public Complex_sqrt1z_866612664166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16082 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term16082, term16082.getClass(), "isNaN", false);
        setDoubleField(term16082, term16082.getClass(), "real", 9.2188684372274053E18);
        term16251 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term16251, term16251.getClass(), "imaginary", 0.0);
        setDoubleField(term16251, term16251.getClass(), "real", 9.2188684372274053E18);
        setBooleanField(term16251, term16251.getClass(), "isNaN", false);
        setBooleanField(term16251, term16251.getClass(), "isInfinite", false);
        setBooleanField(term16251, term16251.getClass(), "isZero", false);
        term16245 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term16245, term16245.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term16245, term16245.getClass(), "real", 0.0);
        setBooleanField(term16245, term16245.getClass(), "isNaN", false);
        setBooleanField(term16245, term16245.getClass(), "isInfinite", false);
        setBooleanField(term16245, term16245.getClass(), "isZero", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt1z", argTypes, term16082, args);
        assertTrue(recursiveEquals(term16082, term16251));
        assertTrue(recursiveEquals(retValue, term16245));
    }

};


