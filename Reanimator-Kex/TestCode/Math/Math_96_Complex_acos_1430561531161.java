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

public class Complex_acos_1430561531161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23493;
     Object term23704;
     Object term23701;

    public Complex_acos_1430561531161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23493 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term23493, term23493.getClass(), "real", -9.2188684372274053E18);
        setDoubleField(term23493, term23493.getClass(), "imaginary", 9.2188684372274053E18);
        term23704 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term23704, term23704.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term23704, term23704.getClass(), "real", -9.2188684372274053E18);
        term23701 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term23701, term23701.getClass(), "imaginary", -44.707504745618365);
        setDoubleField(term23701, term23701.getClass(), "real", 2.356194490192345);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term23493, args);
        assertTrue(recursiveEquals(term23493, term23704));
        assertTrue(recursiveEquals(retValue, term23701));
    }

};


