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

public class Complex_abs_703710117437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term108589;
     Object term108794;

    public Complex_abs_703710117437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term108589 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term108589, term108589.getClass(), "real", 0.0);
        setDoubleField(term108589, term108589.getClass(), "imaginary", 0.0);
        term108794 = newInstance(Class.forName("org.apache.commons.math.complex.Complex"));
        setDoubleField(term108794, term108794.getClass(), "imaginary", 0.0);
        setDoubleField(term108794, term108794.getClass(), "real", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.complex.Complex");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "abs", argTypes, term108589, args);
        assertTrue(recursiveEquals(term108589, term108794));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


