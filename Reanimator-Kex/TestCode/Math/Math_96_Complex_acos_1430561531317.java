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

public class Complex_acos_1430561531317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67422;
     Object term67625;
     Object term67622;

    public Complex_acos_1430561531317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67422 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term67422, term67422.getClass(), "real", -8.6468409158071747E18);
        setDoubleField(term67422, term67422.getClass(), "imaginary", -9.2053576361978102E18);
        term67625 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term67625, term67625.getClass(), "imaginary", -9.2053576361978102E18);
        setDoubleField(term67625, term67625.getClass(), "real", -8.6468409158071747E18);
        term67622 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term67622, term67622.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term67622, term67622.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term67422, args);
        assertTrue(recursiveEquals(term67422, term67625));
        assertTrue(recursiveEquals(retValue, term67622));
    }

};


