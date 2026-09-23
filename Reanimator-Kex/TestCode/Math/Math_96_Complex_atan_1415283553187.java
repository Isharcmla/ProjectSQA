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

public class Complex_atan_1415283553187 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30191;
     Object term30375;
     Object term30372;

    public Complex_atan_1415283553187() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30191 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term30191, term30191.getClass(), "real", -9.2053576383452856E18);
        setDoubleField(term30191, term30191.getClass(), "imaginary", 1.801439851053056E16);
        term30375 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term30375, term30375.getClass(), "imaginary", 1.801439851053056E16);
        setDoubleField(term30375, term30375.getClass(), "real", -9.2053576383452856E18);
        term30372 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term30372, term30372.getClass(), "imaginary", 0.0);
        setDoubleField(term30372, term30372.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term30191, args);
        assertTrue(recursiveEquals(term30191, term30375));
        assertTrue(recursiveEquals(retValue, term30372));
    }

};


