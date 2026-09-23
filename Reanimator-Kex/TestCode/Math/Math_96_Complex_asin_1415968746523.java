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

public class Complex_asin_1415968746523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134161;
     Object term134372;
     Object term134369;

    public Complex_asin_1415968746523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134161 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term134161, term134161.getClass(), "real", 1.4636698788954112E17);
        setDoubleField(term134161, term134161.getClass(), "imaginary", -9.2233717619768689E18);
        term134372 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term134372, term134372.getClass(), "imaginary", -9.2233717619768689E18);
        setDoubleField(term134372, term134372.getClass(), "real", 1.4636698788954112E17);
        term134369 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term134369, term134369.getClass(), "imaginary", -44.36154542500189);
        setDoubleField(term134369, term134369.getClass(), "real", 0.015867809192487134);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term134161, args);
        assertTrue(recursiveEquals(term134161, term134372));
        assertTrue(recursiveEquals(retValue, term134369));
    }

};


