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

public class Complex_asin_1415968746358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82037;
     Object term82706;
     Object term82703;

    public Complex_asin_1415968746358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82037 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term82037, term82037.getClass(), "real", 1.80319906955264E16);
        setDoubleField(term82037, term82037.getClass(), "imaginary", -6.9175290276408197E18);
        term82706 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term82706, term82706.getClass(), "imaginary", -6.9175290276408197E18);
        setDoubleField(term82706, term82706.getClass(), "real", 1.80319906955264E16);
        term82703 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term82703, term82703.getClass(), "imaginary", -44.07374088084112);
        setDoubleField(term82703, term82703.getClass(), "real", 0.002606703894059194);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term82037, args);
        assertTrue(recursiveEquals(term82037, term82706));
        assertTrue(recursiveEquals(retValue, term82703));
    }

};


