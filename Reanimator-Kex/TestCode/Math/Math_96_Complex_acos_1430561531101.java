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

public class Complex_acos_1430561531101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10107;
     Object term10318;
     Object term10315;

    public Complex_acos_1430561531101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10107 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10107, term10107.getClass(), "real", 1.45241087982698496E17);
        setDoubleField(term10107, term10107.getClass(), "imaginary", 5.7871255211710874E17);
        term10318 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10318, term10318.getClass(), "imaginary", 5.7871255211710874E17);
        setDoubleField(term10318, term10318.getClass(), "real", 1.45241087982698496E17);
        term10315 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term10315, term10315.getClass(), "imaginary", -41.62327106297478);
        setDoubleField(term10315, term10315.getClass(), "real", 1.3249023321158835);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term10107, args);
        assertTrue(recursiveEquals(term10107, term10318));
        assertTrue(recursiveEquals(retValue, term10315));
    }

};


