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

public class Complex_atan_1415283553428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107002;
     Object term107608;
     Object term107605;

    public Complex_atan_1415283553428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107002 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term107002, term107002.getClass(), "real", -8.6446594847376671E18);
        setDoubleField(term107002, term107002.getClass(), "imaginary", 1.8014398509744128E16);
        term107608 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term107608, term107608.getClass(), "imaginary", 1.8014398509744128E16);
        setDoubleField(term107608, term107608.getClass(), "real", -8.6446594847376671E18);
        term107605 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term107605, term107605.getClass(), "imaginary", 0.0);
        setDoubleField(term107605, term107605.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term107002, args);
        assertTrue(recursiveEquals(term107002, term107608));
        assertTrue(recursiveEquals(retValue, term107605));
    }

};


