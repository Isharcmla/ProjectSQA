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

public class Complex_pow_629025138475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118775;
     Object term118859;
     Object term118937;
     Object term118938;
     Object term118934;

    public Complex_pow_629025138475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118775 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term118775, term118775.getClass(), "real", -8.0659469324810926E18);
        setDoubleField(term118775, term118775.getClass(), "imaginary", -8.6469112844170015E18);
        term118859 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term118859, term118859.getClass(), "real", 9.2188684372274053E18);
        setDoubleField(term118859, term118859.getClass(), "imaginary", -9.218868432932438E18);
        term118937 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term118937, term118937.getClass(), "imaginary", -8.6469112844170015E18);
        setDoubleField(term118937, term118937.getClass(), "real", -8.0659469324810926E18);
        term118938 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term118938, term118938.getClass(), "imaginary", -9.218868432932438E18);
        setDoubleField(term118938, term118938.getClass(), "real", 9.2188684372274053E18);
        term118934 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term118934, term118934.getClass(), "imaginary", Double.NEGATIVE_INFINITY);
        setDoubleField(term118934, term118934.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term118859;
        Object retValue = callMethod(klass, "pow", argTypes, term118775, args);
        assertTrue(recursiveEquals(term118775, term118937));
        assertTrue(recursiveEquals(term118859, term118938));
        assertTrue(recursiveEquals(retValue, term118934));
    }

};


