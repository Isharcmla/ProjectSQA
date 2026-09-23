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

public class Complex_acos_1430561531519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132554;
     Object term132770;
     Object term132767;

    public Complex_acos_1430561531519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term132554 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term132554, term132554.getClass(), "real", -8.935141660703062E18);
        setDoubleField(term132554, term132554.getClass(), "imaginary", 8.589934592E9);
        term132770 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term132770, term132770.getClass(), "imaginary", 8.589934592E9);
        setDoubleField(term132770, term132770.getClass(), "real", -8.935141660703062E18);
        term132767 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term132767, term132767.getClass(), "imaginary", -44.32967085752192);
        setDoubleField(term132767, term132767.getClass(), "real", 3.141592652628428);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term132554, args);
        assertTrue(recursiveEquals(term132554, term132770));
        assertTrue(recursiveEquals(retValue, term132767));
    }

};


