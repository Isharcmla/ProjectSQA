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

public class Complex_atan_1415283553110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12152;
     Object term12805;
     Object term12802;

    public Complex_atan_1415283553110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12152 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term12152, term12152.getClass(), "real", -9.2188684372274053E18);
        setDoubleField(term12152, term12152.getClass(), "imaginary", 2.8879332610513306E17);
        term12805 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term12805, term12805.getClass(), "imaginary", 2.8879332610513306E17);
        setDoubleField(term12805, term12805.getClass(), "real", -9.2188684372274053E18);
        term12802 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term12802, term12802.getClass(), "imaginary", 0.0);
        setDoubleField(term12802, term12802.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term12152, args);
        assertTrue(recursiveEquals(term12152, term12805));
        assertTrue(recursiveEquals(retValue, term12802));
    }

};


