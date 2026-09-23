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

public class Complex_asin_1415968746410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100723;
     Object term101710;
     Object term101707;

    public Complex_asin_1415968746410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100723 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term100723, term100723.getClass(), "real", -9.1873432395673764E18);
        setDoubleField(term100723, term100723.getClass(), "imaginary", -4.6116860184273838E18);
        term101710 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term101710, term101710.getClass(), "imaginary", -4.6116860184273838E18);
        setDoubleField(term101710, term101710.getClass(), "real", -9.1873432395673764E18);
        term101707 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term101707, term101707.getClass(), "imaginary", -44.46986266682826);
        setDoubleField(term101707, term101707.getClass(), "real", -1.1055813209468137);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term100723, args);
        assertTrue(recursiveEquals(term100723, term101710));
        assertTrue(recursiveEquals(retValue, term101707));
    }

};


