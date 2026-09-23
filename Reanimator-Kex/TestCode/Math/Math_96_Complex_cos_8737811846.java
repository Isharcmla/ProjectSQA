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

public class Complex_cos_8737811846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66;
     Object term1315;
     Object term1312;

    public Complex_cos_8737811846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term66, term66.getClass(), "imaginary", 0.6588948704887806);
        setDoubleField(term66, term66.getClass(), "real", 0.6397214730945112);
        term1315 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1315, term1315.getClass(), "imaginary", 0.6588948704887806);
        setDoubleField(term1315, term1315.getClass(), "real", 0.6397214730945112);
        term1312 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term1312, term1312.getClass(), "imaginary", -0.42242709162670955);
        setDoubleField(term1312, term1312.getClass(), "real", 0.9828023769606017);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "cos", argTypes, term66, args);
        assertTrue(recursiveEquals(term66, term1315));
        assertTrue(recursiveEquals(retValue, term1312));
    }

};


