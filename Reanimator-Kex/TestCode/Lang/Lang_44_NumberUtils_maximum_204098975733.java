package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.EqualityUtils.*;
import java.lang.Integer;

public class NumberUtils_maximum_204098975733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241;
     Object term243;
     Object term245;

    public NumberUtils_maximum_204098975733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241 = new Integer(-1922583790);
        term243 = new Integer(-616727354);
        term245 = new Integer(-1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.NumberUtils");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term241;
        args[1] = term243;
        args[2] = term245;
        Object retValue = callMethod(klass, "maximum", argTypes, null, args);
        assertTrue(recursiveEquals(term241, -1922583790));
        assertTrue(recursiveEquals(term243, -616727354));
        assertTrue(recursiveEquals(term245, -1955890973));
        assertTrue(recursiveEquals(retValue, -616727354));
    }

};


