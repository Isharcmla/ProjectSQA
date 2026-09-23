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

public class Complex_asin_1415968746320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68216;
     Object term69009;
     Object term69006;

    public Complex_asin_1415968746320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68216 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term68216, term68216.getClass(), "real", -9.1870617648591012E18);
        setDoubleField(term68216, term68216.getClass(), "imaginary", 5.7646295132667904E17);
        term69009 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term69009, term69009.getClass(), "imaginary", 5.7646295132667904E17);
        setDoubleField(term69009, term69009.getClass(), "real", -9.1870617648591012E18);
        term69006 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term69006, term69006.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term69006, term69006.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term68216, args);
        assertTrue(recursiveEquals(term68216, term69009));
        assertTrue(recursiveEquals(retValue, term69006));
    }

};


