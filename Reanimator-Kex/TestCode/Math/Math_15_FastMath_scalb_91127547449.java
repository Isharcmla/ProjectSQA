package org.apache.commons.math3.util;

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
import static org.apache.commons.math3.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Float;
import java.lang.Integer;

public class FastMath_scalb_91127547449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155;
     Object term157;

    public FastMath_scalb_91127547449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155 = new Float(0.5523636F);
        term157 = new Integer(391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.util.FastMath");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = float.class;
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term155;
        args[1] = term157;
        callMethod(klass, "scalb", argTypes, null, args);
    }

};


