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
import java.lang.Integer;
import java.lang.String;
import java.lang.Object;

public class NodeUtil_isStrWhiteSpaceChar_1466731879161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207;
     Object enum2;

    public NodeUtil_isStrWhiteSpaceChar_1466731879161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207 = new Integer(1540719661);
        Class<? extends Object> term6044 = Class.forName((String) "com.google.javascript.rhino.jstype.TernaryValue");
        Field term6043 = ((Class) term6044).getDeclaredField((String) "FALSE");
        ((Field) term6043).setAccessible(true);
        enum2 = ((Field) term6043).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term207;
        Object retValue = callMethod(klass, "isStrWhiteSpaceChar", argTypes, null, args);
        assertTrue(recursiveEquals(term207, 1540719661));
        assertTrue(recursiveEquals(retValue, enum2));
    }

};


