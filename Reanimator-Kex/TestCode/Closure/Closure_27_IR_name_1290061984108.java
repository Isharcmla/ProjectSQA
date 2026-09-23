package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.EqualityUtils.*;

public class IR_name_1290061984108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10809;

    public IR_name_1290061984108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10809 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term10809, term10809.getClass(), "str", "sjlJAEtRrb");
        setIntField(term10809, term10809.getClass(), "type", 38);
        setField(term10809, term10809.getClass(), "next", null);
        setField(term10809, term10809.getClass(), "first", null);
        setField(term10809, term10809.getClass(), "last", null);
        setField(term10809, term10809.getClass(), "propListHead", null);
        setIntField(term10809, term10809.getClass(), "sourcePosition", -1);
        setField(term10809, term10809.getClass(), "jsType", null);
        setField(term10809, term10809.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sjlJAEtRrb";
        Object retValue = callMethod(klass, "name", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term10809));
    }

};


