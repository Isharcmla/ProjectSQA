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

public class Complex_sin_10197090377 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185;
     Object term8986;
     Object term8976;

    public Complex_sin_10197090377() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term185, term185.getClass(), "imaginary", 0.03699061125289671);
        setDoubleField(term185, term185.getClass(), "real", 0.6047137830113202);
        setBooleanField(term185, term185.getClass(), "isNaN", true);
        setBooleanField(term185, term185.getClass(), "isInfinite", true);
        term8986 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term8986, term8986.getClass(), "imaginary", 0.03699061125289671);
        setDoubleField(term8986, term8986.getClass(), "real", 0.6047137830113202);
        setBooleanField(term8986, term8986.getClass(), "isNaN", true);
        setBooleanField(term8986, term8986.getClass(), "isInfinite", true);
        term8976 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term8976, term8976.getClass(), "imaginary", Double.NaN);
        setDoubleField(term8976, term8976.getClass(), "real", Double.NaN);
        setBooleanField(term8976, term8976.getClass(), "isNaN", true);
        setBooleanField(term8976, term8976.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sin", argTypes, term185, args);
        assertTrue(recursiveEquals(term185, term8986));
        assertTrue(recursiveEquals(retValue, term8976));
    }

};


