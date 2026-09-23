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

public class Complex_atan_1415283553157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22651;
     Object term22835;
     Object term22832;

    public Complex_atan_1415283553157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22651 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term22651, term22651.getClass(), "real", 7.2057594037928448E16);
        setDoubleField(term22651, term22651.getClass(), "imaginary", -9.1513144428168479E18);
        term22835 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term22835, term22835.getClass(), "imaginary", -9.1513144428168479E18);
        setDoubleField(term22835, term22835.getClass(), "real", 7.2057594037928448E16);
        term22832 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term22832, term22832.getClass(), "imaginary", 0.0);
        setDoubleField(term22832, term22832.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term22651, args);
        assertTrue(recursiveEquals(term22651, term22835));
        assertTrue(recursiveEquals(retValue, term22832));
    }

};


