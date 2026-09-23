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

public class Complex_add_61482636337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10;
     Object term15;
     Object term286;
     Object term287;
     Object term281;

    public Complex_add_61482636337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10, term10.getClass(), "imaginary", 0.28570734989730284);
        setDoubleField(term10, term10.getClass(), "real", 0.40176586625454525);
        setBooleanField(term10, term10.getClass(), "isNaN", false);
        setBooleanField(term10, term10.getClass(), "isInfinite", false);
        term15 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term15, term15.getClass(), "imaginary", 0.2641345529914265);
        setDoubleField(term15, term15.getClass(), "real", 0.36923381893433327);
        setBooleanField(term15, term15.getClass(), "isNaN", true);
        setBooleanField(term15, term15.getClass(), "isInfinite", true);
        term286 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term286, term286.getClass(), "imaginary", 0.28570734989730284);
        setDoubleField(term286, term286.getClass(), "real", 0.40176586625454525);
        setBooleanField(term286, term286.getClass(), "isNaN", false);
        setBooleanField(term286, term286.getClass(), "isInfinite", false);
        term287 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term287, term287.getClass(), "imaginary", 0.2641345529914265);
        setDoubleField(term287, term287.getClass(), "real", 0.36923381893433327);
        setBooleanField(term287, term287.getClass(), "isNaN", true);
        setBooleanField(term287, term287.getClass(), "isInfinite", true);
        term281 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term281, term281.getClass(), "imaginary", 0.5498419028887294);
        setDoubleField(term281, term281.getClass(), "real", 0.7709996851888785);
        setBooleanField(term281, term281.getClass(), "isNaN", false);
        setBooleanField(term281, term281.getClass(), "isInfinite", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term15;
        Object retValue = callMethod(klass, "add", argTypes, term10, args);
        assertTrue(recursiveEquals(term10, term286));
        assertTrue(recursiveEquals(term15, term287));
        assertTrue(recursiveEquals(retValue, term281));
    }

};


