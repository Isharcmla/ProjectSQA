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
import java.lang.Object;

public class IR_returnNode_200560824585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term299;

    public IR_returnNode_200560824585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term301 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term314 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term321 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term299, term299.getClass(), "type", -341962980);
        setIntField(term301, term301.getClass(), "type", 1532716628);
        setIntField(term303, term303.getClass(), "type", -1801760683);
        setIntField(term305, term305.getClass(), "type", 1141317871);
        setIntField(term307, term307.getClass(), "type", 890669485);
        setField(term307, term307.getClass(), "next", null);
        setField(term307, term307.getClass(), "first", null);
        setField(term307, term307.getClass(), "last", null);
        setField(term307, term307.getClass(), "propListHead", null);
        setIntField(term307, term307.getClass(), "sourcePosition", 0);
        setField(term307, term307.getClass(), "jsType", null);
        setField(term307, term307.getClass(), "parent", null);
        setField(term305, term305.getClass(), "next", term307);
        setIntField(term310, term310.getClass(), "type", 691577392);
        setField(term310, term310.getClass(), "next", null);
        setField(term310, term310.getClass(), "first", null);
        setField(term310, term310.getClass(), "last", term307);
        setField(term310, term310.getClass(), "propListHead", null);
        setIntField(term310, term310.getClass(), "sourcePosition", 0);
        setField(term310, term310.getClass(), "jsType", null);
        setField(term310, term310.getClass(), "parent", null);
        setField(term305, term305.getClass(), "first", term310);
        setField(term305, term305.getClass(), "last", term303);
        setField(term305, term305.getClass(), "propListHead", null);
        setIntField(term305, term305.getClass(), "sourcePosition", 0);
        setField(term305, term305.getClass(), "jsType", null);
        setField(term305, term305.getClass(), "parent", null);
        setField(term303, term303.getClass(), "next", term305);
        setField(term303, term303.getClass(), "first", term307);
        setIntField(term314, term314.getClass(), "type", -1963434938);
        setIntField(term316, term316.getClass(), "type", 906181092);
        setField(term316, term316.getClass(), "next", null);
        setField(term316, term316.getClass(), "first", term310);
        setField(term316, term316.getClass(), "last", term305);
        setField(term316, term316.getClass(), "propListHead", null);
        setIntField(term316, term316.getClass(), "sourcePosition", 0);
        setField(term316, term316.getClass(), "jsType", null);
        setField(term316, term316.getClass(), "parent", null);
        setField(term314, term314.getClass(), "next", term316);
        setField(term314, term314.getClass(), "first", term301);
        setField(term314, term314.getClass(), "last", term301);
        setField(term314, term314.getClass(), "propListHead", null);
        setIntField(term314, term314.getClass(), "sourcePosition", 0);
        setField(term314, term314.getClass(), "jsType", null);
        setField(term314, term314.getClass(), "parent", null);
        setField(term303, term303.getClass(), "last", term314);
        setField(term303, term303.getClass(), "propListHead", null);
        setIntField(term303, term303.getClass(), "sourcePosition", 0);
        setField(term303, term303.getClass(), "jsType", null);
        setField(term303, term303.getClass(), "parent", null);
        setField(term301, term301.getClass(), "next", term303);
        setIntField(term321, term321.getClass(), "type", 1045657203);
        setField(term321, term321.getClass(), "next", term314);
        setField(term321, term321.getClass(), "first", term316);
        setField(term321, term321.getClass(), "last", term299);
        setField(term321, term321.getClass(), "propListHead", null);
        setIntField(term321, term321.getClass(), "sourcePosition", 0);
        setField(term321, term321.getClass(), "jsType", null);
        setField(term321, term321.getClass(), "parent", null);
        setField(term301, term301.getClass(), "first", term321);
        setField(term301, term301.getClass(), "last", term321);
        setField(term301, term301.getClass(), "propListHead", null);
        setIntField(term301, term301.getClass(), "sourcePosition", 0);
        setField(term301, term301.getClass(), "jsType", null);
        setField(term301, term301.getClass(), "parent", null);
        setField(term299, term299.getClass(), "next", term301);
        setField(term299, term299.getClass(), "first", term305);
        setField(term299, term299.getClass(), "last", term307);
        setField(term299, term299.getClass(), "propListHead", null);
        setIntField(term299, term299.getClass(), "sourcePosition", 0);
        setField(term299, term299.getClass(), "jsType", null);
        setField(term299, term299.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.IR");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term299;
        try {
            callMethod(klass, "returnNode", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


