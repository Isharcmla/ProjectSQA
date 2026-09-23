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

public class Complex_pow_629025138255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47182;
     Object term47257;
     Object term47258;
     Object term47254;

    public Complex_pow_629025138255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47182 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term47182, term47182.getClass(), "real", 9.2188684372274053E18);
        setDoubleField(term47182, term47182.getClass(), "imaginary", -9.2166166374137201E18);
        term47257 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term47257, term47257.getClass(), "imaginary", -9.2166166374137201E18);
        setDoubleField(term47257, term47257.getClass(), "real", 9.2188684372274053E18);
        term47258 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term47258, term47258.getClass(), "imaginary", -9.2166166374137201E18);
        setDoubleField(term47258, term47258.getClass(), "real", 9.2188684372274053E18);
        term47254 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term47254, term47254.getClass(), "imaginary", Double.NEGATIVE_INFINITY);
        setDoubleField(term47254, term47254.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term47182;
        Object retValue = callMethod(klass, "pow", argTypes, term47182, args);
        assertTrue(recursiveEquals(term47182, term47257));
        assertTrue(recursiveEquals(term47182, term47258));
        assertTrue(recursiveEquals(retValue, term47254));
    }

};


