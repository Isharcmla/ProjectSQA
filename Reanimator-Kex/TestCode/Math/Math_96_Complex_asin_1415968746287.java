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

public class Complex_asin_1415968746287 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56756;
     Object term57188;
     Object term57185;

    public Complex_asin_1415968746287() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56756 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term56756, term56756.getClass(), "real", -8.9351416564080968E18);
        setDoubleField(term56756, term56756.getClass(), "imaginary", -8.935137262656553E18);
        term57188 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term57188, term57188.getClass(), "imaginary", -8.935137262656553E18);
        setDoubleField(term57188, term57188.getClass(), "real", -8.9351416564080968E18);
        term57185 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term57185, term57185.getClass(), "imaginary", -44.67624420145205);
        setDoubleField(term57185, term57185.getClass(), "real", -0.7853984092666686);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "asin", argTypes, term56756, args);
        assertTrue(recursiveEquals(term56756, term57188));
        assertTrue(recursiveEquals(retValue, term57185));
    }

};


