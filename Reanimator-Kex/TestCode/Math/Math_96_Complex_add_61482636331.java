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

public class Complex_add_61482636331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8;
     Object term11;
     Object term152;
     Object term153;
     Object term149;

    public Complex_add_61482636331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term8, term8.getClass(), "imaginary", 0.28570734989730284);
        setDoubleField(term8, term8.getClass(), "real", 0.40176586625454525);
        term11 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term11, term11.getClass(), "imaginary", 0.2641345529914265);
        setDoubleField(term11, term11.getClass(), "real", 0.36923381893433327);
        term152 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term152, term152.getClass(), "imaginary", 0.28570734989730284);
        setDoubleField(term152, term152.getClass(), "real", 0.40176586625454525);
        term153 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term153, term153.getClass(), "imaginary", 0.2641345529914265);
        setDoubleField(term153, term153.getClass(), "real", 0.36923381893433327);
        term149 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term149, term149.getClass(), "imaginary", 0.5498419028887294);
        setDoubleField(term149, term149.getClass(), "real", 0.7709996851888785);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term11;
        Object retValue = callMethod(klass, "add", argTypes, term8, args);
        assertTrue(recursiveEquals(term8, term152));
        assertTrue(recursiveEquals(term11, term153));
        assertTrue(recursiveEquals(retValue, term149));
    }

};


