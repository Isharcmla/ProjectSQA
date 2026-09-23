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

public class Complex_atan_1415283553239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42559;
     Object term42743;
     Object term42740;

    public Complex_atan_1415283553239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42559 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term42559, term42559.getClass(), "real", -6.917529027573973E18);
        setDoubleField(term42559, term42559.getClass(), "imaginary", 1.44115188109410304E17);
        term42743 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term42743, term42743.getClass(), "imaginary", 1.44115188109410304E17);
        setDoubleField(term42743, term42743.getClass(), "real", -6.917529027573973E18);
        term42740 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term42740, term42740.getClass(), "imaginary", 0.0);
        setDoubleField(term42740, term42740.getClass(), "real", -1.5707963267948966);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "atan", argTypes, term42559, args);
        assertTrue(recursiveEquals(term42559, term42743));
        assertTrue(recursiveEquals(retValue, term42740));
    }

};


