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

public class Complex_divide_886435667261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term48485;
     Object term48569;
     Object term48610;
     Object term48611;
     Object term48607;

    public Complex_divide_886435667261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term48485 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term48485, term48485.getClass(), "real", -9.2188684372273889E18);
        setDoubleField(term48485, term48485.getClass(), "imaginary", -9.2166166374137201E18);
        term48569 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term48569, term48569.getClass(), "real", 0.0);
        setDoubleField(term48569, term48569.getClass(), "imaginary", 9.2188684372274053E18);
        term48610 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term48610, term48610.getClass(), "imaginary", -9.2166166374137201E18);
        setDoubleField(term48610, term48610.getClass(), "real", -9.2188684372273889E18);
        term48611 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term48611, term48611.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term48611, term48611.getClass(), "real", 0.0);
        term48607 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term48607, term48607.getClass(), "imaginary", 0.9999999999999982);
        setDoubleField(term48607, term48607.getClass(), "real", -0.9997557401074744);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term48569;
        Object retValue = callMethod(klass, "divide", argTypes, term48485, args);
        assertTrue(recursiveEquals(term48485, term48610));
        assertTrue(recursiveEquals(term48569, term48611));
        assertTrue(recursiveEquals(retValue, term48607));
    }

};


