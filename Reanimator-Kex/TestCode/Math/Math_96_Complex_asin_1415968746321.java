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

public class Complex_asin_1415968746321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68801;
     Object term69217;
     Object term69214;

    public Complex_asin_1415968746321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68801 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term68801, term68801.getClass(), "real", -9.2166166374137201E18);
        setDoubleField(term68801, term68801.getClass(), "imaginary", 7.205759403819008E16);
        term69217 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term69217, term69217.getClass(), "imaginary", 7.205759403819008E16);
        setDoubleField(term69217, term69217.getClass(), "real", -9.2166166374137201E18);
        term69214 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term69214, term69214.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term69214, term69214.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term68801, args);
        assertTrue(recursiveEquals(term68801, term69217));
        assertTrue(recursiveEquals(retValue, term69214));
    }

};


