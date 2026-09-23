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

public class Complex_atan_1415283553145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20434;
     Object term20618;
     Object term20615;

    public Complex_atan_1415283553145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20434 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term20434, term20434.getClass(), "real", 2.305843009213694E18);
        setDoubleField(term20434, term20434.getClass(), "imaginary", -8.93514166070306E18);
        term20618 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term20618, term20618.getClass(), "imaginary", -8.93514166070306E18);
        setDoubleField(term20618, term20618.getClass(), "real", 2.305843009213694E18);
        term20615 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term20615, term20615.getClass(), "imaginary", 0.0);
        setDoubleField(term20615, term20615.getClass(), "real", 1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term20434, args);
        assertTrue(recursiveEquals(term20434, term20618));
        assertTrue(recursiveEquals(retValue, term20615));
    }

};


