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

public class Complex_divide_886435667150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20979;
     Object term21063;
     Object term21244;
     Object term21245;
     Object term21241;

    public Complex_divide_886435667150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20979 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term20979, term20979.getClass(), "real", -9.2188684372273889E18);
        setDoubleField(term20979, term20979.getClass(), "imaginary", -9.2166166374137201E18);
        term21063 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term21063, term21063.getClass(), "real", 0.0);
        setDoubleField(term21063, term21063.getClass(), "imaginary", 0.0);
        term21244 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term21244, term21244.getClass(), "imaginary", -9.2166166374137201E18);
        setDoubleField(term21244, term21244.getClass(), "real", -9.2188684372273889E18);
        term21245 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term21245, term21245.getClass(), "imaginary", 0.0);
        setDoubleField(term21245, term21245.getClass(), "real", 0.0);
        term21241 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term21241, term21241.getClass(), "imaginary", Double.NaN);
        setDoubleField(term21241, term21241.getClass(), "real", Double.NaN);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term21063;
        Object retValue = callMethod(klass, "divide", argTypes, term20979, args);
        assertTrue(recursiveEquals(term20979, term21244));
        assertTrue(recursiveEquals(term21063, term21245));
        assertTrue(recursiveEquals(retValue, term21241));
    }

};


