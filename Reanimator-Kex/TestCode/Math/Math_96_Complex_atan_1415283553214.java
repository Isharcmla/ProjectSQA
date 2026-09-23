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

public class Complex_atan_1415283553214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35587;
     Object term36370;
     Object term36367;

    public Complex_atan_1415283553214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35587 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term35587, term35587.getClass(), "real", 9.00723361447936E15);
        setDoubleField(term35587, term35587.getClass(), "imaginary", -9.1513144428168151E18);
        term36370 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term36370, term36370.getClass(), "imaginary", -9.1513144428168151E18);
        setDoubleField(term36370, term36370.getClass(), "real", 9.00723361447936E15);
        term36367 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term36367, term36367.getClass(), "imaginary", 0.0);
        setDoubleField(term36367, term36367.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term35587, args);
        assertTrue(recursiveEquals(term35587, term36370));
        assertTrue(recursiveEquals(retValue, term36367));
    }

};


