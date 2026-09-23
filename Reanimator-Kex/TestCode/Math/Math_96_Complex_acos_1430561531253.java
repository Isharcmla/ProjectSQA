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

public class Complex_acos_1430561531253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46785;
     Object term47001;
     Object term46998;

    public Complex_acos_1430561531253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46785 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term46785, term46785.getClass(), "real", -8.646348334597931E18);
        setDoubleField(term46785, term46785.getClass(), "imaginary", -8.0704505322458317E18);
        term47001 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term47001, term47001.getClass(), "imaginary", -8.0704505322458317E18);
        setDoubleField(term47001, term47001.getClass(), "real", -8.646348334597931E18);
        term46998 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term46998, term46998.getClass(), "imaginary", -7.278045395879426);
        setDoubleField(term46998, term46998.getClass(), "real", -0.7853981633974483);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "acos", argTypes, term46785, args);
        assertTrue(recursiveEquals(term46785, term47001));
        assertTrue(recursiveEquals(retValue, term46998));
    }

};


