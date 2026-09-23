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

public class Complex_atan_1415283553440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term109294;
     Object term109974;
     Object term109971;

    public Complex_atan_1415283553440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term109294 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term109294, term109294.getClass(), "real", -9.2188684372273889E18);
        setDoubleField(term109294, term109294.getClass(), "imaginary", 9.007207844675584E15);
        term109974 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term109974, term109974.getClass(), "imaginary", 9.007207844675584E15);
        setDoubleField(term109974, term109974.getClass(), "real", -9.2188684372273889E18);
        term109971 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term109971, term109971.getClass(), "imaginary", 0.0);
        setDoubleField(term109971, term109971.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term109294, args);
        assertTrue(recursiveEquals(term109294, term109974));
        assertTrue(recursiveEquals(retValue, term109971));
    }

};


