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

public class Complex_asin_1415968746223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38482;
     Object term38685;
     Object term38682;

    public Complex_asin_1415968746223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38482 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term38482, term38482.getClass(), "real", 2.3080948090273792E18);
        setDoubleField(term38482, term38482.getClass(), "imaginary", 4.6116862933052948E18);
        term38685 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term38685, term38685.getClass(), "imaginary", 4.6116862933052948E18);
        setDoubleField(term38685, term38685.getClass(), "real", 2.3080948090273792E18);
        term38682 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term38682, term38682.getClass(), "imaginary", Double.POSITIVE_INFINITY);
        setDoubleField(term38682, term38682.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term38482, args);
        assertTrue(recursiveEquals(term38482, term38685));
        assertTrue(recursiveEquals(retValue, term38682));
    }

};


