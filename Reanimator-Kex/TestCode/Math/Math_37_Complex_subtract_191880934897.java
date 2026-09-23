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

public class Complex_subtract_191880934897 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10855;
     Object term10881;
     Object term10875;

    public Complex_subtract_191880934897() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10855 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setBooleanField(term10855, term10855.getClass(), "isNaN", false);
        setDoubleField(term10855, term10855.getClass(), "real", 9.2188684372274053E18);
        setDoubleField(term10855, term10855.getClass(), "imaginary", -9.2166166374137201E18);
        term10881 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10881, term10881.getClass(), "imaginary", -9.2166166374137201E18);
        setDoubleField(term10881, term10881.getClass(), "real", 9.2188684372274053E18);
        setBooleanField(term10881, term10881.getClass(), "isNaN", false);
        setBooleanField(term10881, term10881.getClass(), "isInfinite", false);
        term10875 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10875, term10875.getClass(), "imaginary", -9.2166166374137201E18);
        setDoubleField(term10875, term10875.getClass(), "real", 9.2188684372274053E18);
        setBooleanField(term10875, term10875.getClass(), "isNaN", false);
        setBooleanField(term10875, term10875.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = -0.0;
        Object retValue = callMethod(klass, "subtract", argTypes, term10855, args);
        assertTrue(recursiveEquals(term10855, term10881));
        assertTrue(recursiveEquals(retValue, term10875));
    }

};


