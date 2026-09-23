package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;

public class CheckAccessControls_isValidPrivateConstructorAccess_175164999893 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25669;
     Object term25822;

    public CheckAccessControls_isValidPrivateConstructorAccess_175164999893() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25669 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25669, term25669.getClass(), "type", 30);
        term25822 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term25822, term25822.getClass(), "type", 30);
        setField(term25822, term25822.getClass(), "next", null);
        setField(term25822, term25822.getClass(), "first", null);
        setField(term25822, term25822.getClass(), "last", null);
        setField(term25822, term25822.getClass(), "propListHead", null);
        setIntField(term25822, term25822.getClass(), "sourcePosition", 0);
        setField(term25822, term25822.getClass(), "jsType", null);
        setField(term25822, term25822.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term25669;
        Object retValue = callMethod(klass, "isValidPrivateConstructorAccess", argTypes, null, args);
        assertTrue(recursiveEquals(term25669, term25822));
        assertTrue(recursiveEquals(retValue, false));
    }

};


