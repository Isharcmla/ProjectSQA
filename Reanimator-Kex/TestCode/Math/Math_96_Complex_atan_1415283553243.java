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

public class Complex_atan_1415283553243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43876;
     Object term44060;
     Object term44057;

    public Complex_atan_1415283553243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43876 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term43876, term43876.getClass(), "real", -8.0698875822945075E18);
        setDoubleField(term43876, term43876.getClass(), "imaginary", 1.15292150461104128E18);
        term44060 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term44060, term44060.getClass(), "imaginary", 1.15292150461104128E18);
        setDoubleField(term44060, term44060.getClass(), "real", -8.0698875822945075E18);
        term44057 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term44057, term44057.getClass(), "imaginary", 0.0);
        setDoubleField(term44057, term44057.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term43876, args);
        assertTrue(recursiveEquals(term43876, term44060));
        assertTrue(recursiveEquals(retValue, term44057));
    }

};


