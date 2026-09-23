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

public class Complex_sqrt_902217185152 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21220;
     Object term21587;
     Object term21584;

    public Complex_sqrt_902217185152() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21220 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term21220, term21220.getClass(), "real", 0.0);
        setDoubleField(term21220, term21220.getClass(), "imaginary", 9.2188684372274053E18);
        term21587 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term21587, term21587.getClass(), "imaginary", 9.2188684372274053E18);
        setDoubleField(term21587, term21587.getClass(), "real", 0.0);
        term21584 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term21584, term21584.getClass(), "imaginary", 2.1469592959843702E9);
        setDoubleField(term21584, term21584.getClass(), "real", 2.1469592959843702E9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "sqrt", argTypes, term21220, args);
        assertTrue(recursiveEquals(term21220, term21587));
        assertTrue(recursiveEquals(retValue, term21584));
    }

};


