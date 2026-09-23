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

public class Complex_atan_1415283553455 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113353;
     Object term113721;
     Object term113718;

    public Complex_atan_1415283553455() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term113353 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term113353, term113353.getClass(), "real", 9.00719925474304E15);
        setDoubleField(term113353, term113353.getClass(), "imaginary", -9.2143648376000338E18);
        term113721 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term113721, term113721.getClass(), "imaginary", -9.2143648376000338E18);
        setDoubleField(term113721, term113721.getClass(), "real", 9.00719925474304E15);
        term113718 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term113718, term113718.getClass(), "imaginary", 0.0);
        setDoubleField(term113718, term113718.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term113353, args);
        assertTrue(recursiveEquals(term113353, term113721));
        assertTrue(recursiveEquals(retValue, term113718));
    }

};


