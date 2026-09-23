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

public class Complex_divide_886435667191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30710;
     Object term30794;
     Object term30833;
     Object term30834;
     Object term30830;

    public Complex_divide_886435667191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30710 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term30710, term30710.getClass(), "real", -9.2188684372273889E18);
        setDoubleField(term30710, term30710.getClass(), "imaginary", -9.2166166374137201E18);
        term30794 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term30794, term30794.getClass(), "real", -4.503599627370495E15);
        setDoubleField(term30794, term30794.getClass(), "imaginary", 9.2188684372274053E18);
        term30833 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term30833, term30833.getClass(), "imaginary", -9.2166166374137201E18);
        setDoubleField(term30833, term30833.getClass(), "real", -9.2188684372273889E18);
        term30834 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term30834, term30834.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term30834, term30834.getClass(), "real", -4.503599627370495E15);
        term30830 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term30830, term30830.getClass(), "imaginary", 1.0004881616911785);
        setDoubleField(term30830, term30830.getClass(), "real", -0.9992669818457787);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term30794;
        Object retValue = callMethod(klass, "divide", argTypes, term30710, args);
        assertTrue(recursiveEquals(term30710, term30833));
        assertTrue(recursiveEquals(term30794, term30834));
        assertTrue(recursiveEquals(retValue, term30830));
    }

};


