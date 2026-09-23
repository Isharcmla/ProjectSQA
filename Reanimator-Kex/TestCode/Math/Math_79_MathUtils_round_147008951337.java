package org.apache.commons.math.util;

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
import static org.apache.commons.math.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Float;
import java.lang.Integer;

public class MathUtils_round_147008951337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179;
     Object term181;
     Object term183;

    public MathUtils_round_147008951337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179 = new Float(0.3455959F);
        term181 = new Integer(590364439);
        term183 = new Integer(865208305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.util.MathUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = float.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term179;
        args[1] = term181;
        args[2] = term183;
        callMethod(klass, "round", argTypes, null, args);
    }

};


