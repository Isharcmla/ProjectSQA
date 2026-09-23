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

public class Complex_acos_1430561531295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59252;
     Object term59671;
     Object term59668;

    public Complex_acos_1430561531295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59252 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term59252, term59252.getClass(), "real", 2.305843009213698E18);
        setDoubleField(term59252, term59252.getClass(), "imaginary", 2.305843009213694E18);
        term59671 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term59671, term59671.getClass(), "imaginary", 2.305843009213694E18);
        setDoubleField(term59671, term59671.getClass(), "real", 2.305843009213698E18);
        term59668 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term59668, term59668.getClass(), "imaginary", -43.321698784996585);
        setDoubleField(term59668, term59668.getClass(), "real", 0.7853981633974474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term59252, args);
        assertTrue(recursiveEquals(term59252, term59671));
        assertTrue(recursiveEquals(retValue, term59668));
    }

};


