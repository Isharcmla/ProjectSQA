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

public class Complex_asin_1415968746257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47744;
     Object term47955;
     Object term47952;

    public Complex_asin_1415968746257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47744 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term47744, term47744.getClass(), "real", 1.1540474045136896E18);
        setDoubleField(term47744, term47744.getClass(), "imaginary", -9.1850914400221266E18);
        term47955 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term47955, term47955.getClass(), "imaginary", -9.1850914400221266E18);
        setDoubleField(term47955, term47955.getClass(), "real", 1.1540474045136896E18);
        term47952 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term47952, term47952.getClass(), "imaginary", -44.36509202421714);
        setDoubleField(term47952, term47952.getClass(), "real", 0.12498858374526958);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term47744, args);
        assertTrue(recursiveEquals(term47744, term47955));
        assertTrue(recursiveEquals(retValue, term47952));
    }

};


