package org.apache.commons.math3.linear;

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
import static org.apache.commons.math3.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class OpenMapRealVector_ebeMultiply_204420873990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80781;
     Object term80885;

    public OpenMapRealVector_ebeMultiply_204420873990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80781 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        term80885 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.RealVector");
        Object[] args = new Object[1];
        args[0] = term80885;
        callMethod(klass, "ebeMultiply", argTypes, term80781, args);
    }

};


