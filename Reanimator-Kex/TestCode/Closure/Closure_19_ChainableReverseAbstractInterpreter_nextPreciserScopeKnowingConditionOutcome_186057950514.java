package com.google.javascript.jscomp.type;

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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.type.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Boolean;

public class ChainableReverseAbstractInterpreter_nextPreciserScopeKnowingConditionOutcome_186057950514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30;
     Object term57;

    public ChainableReverseAbstractInterpreter_nextPreciserScopeKnowingConditionOutcome_186057950514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term32 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term34 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term41 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term30, term30.getClass(), "type", 1725571209);
        setIntField(term32, term32.getClass(), "type", -522618178);
        setIntField(term34, term34.getClass(), "type", 1134449235);
        setIntField(term36, term36.getClass(), "type", -883034806);
        setIntField(term38, term38.getClass(), "type", 1585847225);
        setField(term38, term38.getClass(), "next", null);
        setField(term38, term38.getClass(), "first", null);
        setField(term38, term38.getClass(), "last", null);
        setField(term38, term38.getClass(), "propListHead", null);
        setIntField(term38, term38.getClass(), "sourcePosition", 0);
        setField(term38, term38.getClass(), "jsType", null);
        setField(term38, term38.getClass(), "parent", null);
        setField(term36, term36.getClass(), "next", term38);
        setIntField(term41, term41.getClass(), "type", 597278769);
        setField(term41, term41.getClass(), "next", null);
        setField(term41, term41.getClass(), "first", null);
        setField(term41, term41.getClass(), "last", term38);
        setField(term41, term41.getClass(), "propListHead", null);
        setIntField(term41, term41.getClass(), "sourcePosition", 0);
        setField(term41, term41.getClass(), "jsType", null);
        setField(term41, term41.getClass(), "parent", null);
        setField(term36, term36.getClass(), "first", term41);
        setField(term36, term36.getClass(), "last", term34);
        setField(term36, term36.getClass(), "propListHead", null);
        setIntField(term36, term36.getClass(), "sourcePosition", 0);
        setField(term36, term36.getClass(), "jsType", null);
        setField(term36, term36.getClass(), "parent", null);
        setField(term34, term34.getClass(), "next", term36);
        setField(term34, term34.getClass(), "first", term38);
        setIntField(term45, term45.getClass(), "type", -1456670397);
        setIntField(term47, term47.getClass(), "type", 1622346318);
        setField(term47, term47.getClass(), "next", null);
        setField(term47, term47.getClass(), "first", term41);
        setField(term47, term47.getClass(), "last", term36);
        setField(term47, term47.getClass(), "propListHead", null);
        setIntField(term47, term47.getClass(), "sourcePosition", 0);
        setField(term47, term47.getClass(), "jsType", null);
        setField(term47, term47.getClass(), "parent", null);
        setField(term45, term45.getClass(), "next", term47);
        setField(term45, term45.getClass(), "first", term32);
        setField(term45, term45.getClass(), "last", term32);
        setField(term45, term45.getClass(), "propListHead", null);
        setIntField(term45, term45.getClass(), "sourcePosition", 0);
        setField(term45, term45.getClass(), "jsType", null);
        setField(term45, term45.getClass(), "parent", null);
        setField(term34, term34.getClass(), "last", term45);
        setField(term34, term34.getClass(), "propListHead", null);
        setIntField(term34, term34.getClass(), "sourcePosition", 0);
        setField(term34, term34.getClass(), "jsType", null);
        setField(term34, term34.getClass(), "parent", null);
        setField(term32, term32.getClass(), "next", term34);
        setIntField(term52, term52.getClass(), "type", 1048535127);
        setField(term52, term52.getClass(), "next", term45);
        setField(term52, term52.getClass(), "first", term47);
        setField(term52, term52.getClass(), "last", term30);
        setField(term52, term52.getClass(), "propListHead", null);
        setIntField(term52, term52.getClass(), "sourcePosition", 0);
        setField(term52, term52.getClass(), "jsType", null);
        setField(term52, term52.getClass(), "parent", null);
        setField(term32, term32.getClass(), "first", term52);
        setField(term32, term32.getClass(), "last", term52);
        setField(term32, term32.getClass(), "propListHead", null);
        setIntField(term32, term32.getClass(), "sourcePosition", 0);
        setField(term32, term32.getClass(), "jsType", null);
        setField(term32, term32.getClass(), "parent", null);
        setField(term30, term30.getClass(), "next", term32);
        setField(term30, term30.getClass(), "first", term36);
        setField(term30, term30.getClass(), "last", term38);
        setField(term30, term30.getClass(), "propListHead", null);
        setIntField(term30, term30.getClass(), "sourcePosition", 0);
        setField(term30, term30.getClass(), "jsType", null);
        setField(term30, term30.getClass(), "parent", null);
        term57 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term30;
        args[1] = null;
        args[2] = term57;
        try {
            callMethod(klass, "nextPreciserScopeKnowingConditionOutcome", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


