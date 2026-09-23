package org.apache.commons.math3.complex;

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
import static org.apache.commons.math3.complex.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class Complex_nthRoot_130689851537 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220;
     Object term225;

    public Complex_nthRoot_130689851537() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term220 = newInstance(Class.forName("org.apache.commons.math3.complex.Complex"));
        setDoubleField(term220, term220.getClass(), "imaginary", 0.5187846213101265);
        setDoubleField(term220, term220.getClass(), "real", 0.045893173090043815);
        setBooleanField(term220, term220.getClass(), "isNaN", false);
        setBooleanField(term220, term220.getClass(), "isInfinite", false);
        term225 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.complex.Complex");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term225;
        callMethod(klass, "nthRoot", argTypes, term220, args);
    }

};


