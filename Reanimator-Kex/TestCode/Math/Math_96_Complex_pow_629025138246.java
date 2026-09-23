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

public class Complex_pow_629025138246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44305;
     Object term44389;
     Object term44974;
     Object term44975;
     Object term44971;

    public Complex_pow_629025138246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44305 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term44305, term44305.getClass(), "real", 2.8823037615171174E17);
        setDoubleField(term44305, term44305.getClass(), "imaginary", 4.611686018427519E18);
        term44389 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term44389, term44389.getClass(), "real", 9.2188684372274053E18);
        setDoubleField(term44389, term44389.getClass(), "imaginary", -9.2188684372273725E18);
        term44974 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term44974, term44974.getClass(), "imaginary", 4.611686018427519E18);
        setDoubleField(term44974, term44974.getClass(), "real", 2.8823037615171174E17);
        term44975 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term44975, term44975.getClass(), "imaginary", -9.2188684372273725E18);
        setDoubleField(term44975, term44975.getClass(), "real", 9.2188684372274053E18);
        term44971 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term44971, term44971.getClass(), "imaginary", Double.NEGATIVE_INFINITY);
        setDoubleField(term44971, term44971.getClass(), "real", Double.POSITIVE_INFINITY);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.complex.Complex");
        Object[] args = new Object[1];
        args[0] = term44389;
        Object retValue = callMethod(klass, "pow", argTypes, term44305, args);
        assertTrue(recursiveEquals(term44305, term44974));
        assertTrue(recursiveEquals(term44389, term44975));
        assertTrue(recursiveEquals(retValue, term44971));
    }

};


