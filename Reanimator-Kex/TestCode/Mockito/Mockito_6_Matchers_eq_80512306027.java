package org.mockito;

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
import static org.mockito.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Float;

public class Matchers_eq_80512306027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9;

    public Matchers_eq_80512306027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9 = new Float(0.13238746F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.Matchers");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = float.class;
        Object[] args = new Object[1];
        args[0] = term9;
        callMethod(klass, "eq", argTypes, null, args);
    }

};


