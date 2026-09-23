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

public class Complex_atan_1415283553467 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116653;
     Object term116837;
     Object term116834;

    public Complex_atan_1415283553467() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116653 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term116653, term116653.getClass(), "real", -8.6469110096734454E18);
        setDoubleField(term116653, term116653.getClass(), "imaginary", 3.603099604221952E16);
        term116837 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term116837, term116837.getClass(), "imaginary", 3.603099604221952E16);
        setDoubleField(term116837, term116837.getClass(), "real", -8.6469110096734454E18);
        term116834 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term116834, term116834.getClass(), "imaginary", 0.0);
        setDoubleField(term116834, term116834.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term116653, args);
        assertTrue(recursiveEquals(term116653, term116837));
        assertTrue(recursiveEquals(retValue, term116834));
    }

};


