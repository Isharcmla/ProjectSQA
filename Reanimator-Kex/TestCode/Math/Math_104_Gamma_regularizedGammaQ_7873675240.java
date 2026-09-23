package org.apache.commons.math.special;

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
import static org.apache.commons.math.special.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Gamma_regularizedGammaQ_7873675240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);

    public Gamma_regularizedGammaQ_7873675240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.special.Gamma");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = 8.988739980515021E307;
        args[1] = 2.762403523917329E-270;
        args[2] = -1.4555120322492105E230;
        args[3] = 13727588;
        callMethod(klass, "regularizedGammaQ", argTypes, null, args);
    }

};


