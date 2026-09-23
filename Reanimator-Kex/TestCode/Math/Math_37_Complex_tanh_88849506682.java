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

public class Complex_tanh_88849506682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210;
     Object term9586;
     Object term9576;

    public Complex_tanh_88849506682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term210, term210.getClass(), "imaginary", 0.53094494792755);
        setDoubleField(term210, term210.getClass(), "real", 0.146431486357265);
        setBooleanField(term210, term210.getClass(), "isNaN", true);
        setBooleanField(term210, term210.getClass(), "isInfinite", false);
        term9586 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term9586, term9586.getClass(), "imaginary", 0.53094494792755);
        setDoubleField(term9586, term9586.getClass(), "real", 0.146431486357265);
        setBooleanField(term9586, term9586.getClass(), "isNaN", true);
        setBooleanField(term9586, term9586.getClass(), "isInfinite", false);
        term9576 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term9576, term9576.getClass(), "imaginary", Double.NaN);
        setDoubleField(term9576, term9576.getClass(), "real", Double.NaN);
        setBooleanField(term9576, term9576.getClass(), "isNaN", true);
        setBooleanField(term9576, term9576.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "tanh", argTypes, term210, args);
        assertTrue(recursiveEquals(term210, term9586));
        assertTrue(recursiveEquals(retValue, term9576));
    }

};


