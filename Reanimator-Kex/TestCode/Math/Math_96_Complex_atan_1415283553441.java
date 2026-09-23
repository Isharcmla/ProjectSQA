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

public class Complex_atan_1415283553441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109790;
     Object term110158;
     Object term110155;

    public Complex_atan_1415283553441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109790 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term109790, term109790.getClass(), "real", -9.2187980684832276E18);
        setDoubleField(term109790, term109790.getClass(), "imaginary", -9.2188684372274053E18);
        term110158 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term110158, term110158.getClass(), "imaginary", -9.2188684372274053E18);
        setDoubleField(term110158, term110158.getClass(), "real", -9.2187980684832276E18);
        term110155 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term110155, term110155.getClass(), "imaginary", 0.0);
        setDoubleField(term110155, term110155.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term109790, args);
        assertTrue(recursiveEquals(term109790, term110158));
        assertTrue(recursiveEquals(retValue, term110155));
    }

};


