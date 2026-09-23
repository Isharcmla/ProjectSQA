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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayDeque;
import java.lang.Object;

public class CoalesceVariableNames_removeVarDeclaration_175124548515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term491;
     Object term497;

    public CoalesceVariableNames_removeVarDeclaration_175124548515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayDeque term492 = new ArrayDeque();
        term491 = newInstance(Class.forName("com.google.javascript.jscomp.CoalesceVariableNames"));
        setField(term491, term491.getClass(), "compiler", null);
        setField(term491, term491.getClass(), "colorings", term492);
        setBooleanField(term491, term491.getClass(), "usePseudoNames", true);
        term497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term499 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term504 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term507 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term510 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term514 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term520 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term497, term497.getClass(), "type", 1596213415);
        setIntField(term499, term499.getClass(), "type", 339854490);
        setIntField(term501, term501.getClass(), "type", 0);
        setField(term501, term501.getClass(), "next", null);
        setField(term501, term501.getClass(), "first", null);
        setField(term501, term501.getClass(), "last", null);
        setField(term501, term501.getClass(), "propListHead", null);
        setIntField(term501, term501.getClass(), "sourcePosition", 0);
        setField(term501, term501.getClass(), "jsType", null);
        setField(term501, term501.getClass(), "parent", null);
        setField(term499, term499.getClass(), "next", term501);
        setIntField(term504, term504.getClass(), "type", 0);
        setField(term504, term504.getClass(), "next", null);
        setField(term504, term504.getClass(), "first", null);
        setField(term504, term504.getClass(), "last", null);
        setField(term504, term504.getClass(), "propListHead", null);
        setIntField(term504, term504.getClass(), "sourcePosition", 0);
        setField(term504, term504.getClass(), "jsType", null);
        setField(term504, term504.getClass(), "parent", null);
        setField(term499, term499.getClass(), "first", term504);
        setIntField(term507, term507.getClass(), "type", 0);
        setField(term507, term507.getClass(), "next", null);
        setField(term507, term507.getClass(), "first", null);
        setField(term507, term507.getClass(), "last", null);
        setField(term507, term507.getClass(), "propListHead", null);
        setIntField(term507, term507.getClass(), "sourcePosition", 0);
        setField(term507, term507.getClass(), "jsType", null);
        setField(term507, term507.getClass(), "parent", null);
        setField(term499, term499.getClass(), "last", term507);
        setField(term510, term510.getClass(), "next", null);
        setIntField(term510, term510.getClass(), "type", 0);
        setIntField(term510, term510.getClass(), "intValue", 0);
        setField(term510, term510.getClass(), "objectValue", null);
        setField(term499, term499.getClass(), "propListHead", term510);
        setIntField(term499, term499.getClass(), "sourcePosition", -341962980);
        setField(term499, term499.getClass(), "jsType", null);
        setField(term499, term499.getClass(), "parent", null);
        setField(term497, term497.getClass(), "next", term499);
        setIntField(term514, term514.getClass(), "type", 0);
        setField(term514, term514.getClass(), "next", null);
        setField(term514, term514.getClass(), "first", null);
        setField(term514, term514.getClass(), "last", null);
        setField(term514, term514.getClass(), "propListHead", null);
        setIntField(term514, term514.getClass(), "sourcePosition", 0);
        setField(term514, term514.getClass(), "jsType", null);
        setField(term514, term514.getClass(), "parent", null);
        setField(term497, term497.getClass(), "first", term514);
        setIntField(term517, term517.getClass(), "type", 0);
        setField(term517, term517.getClass(), "next", null);
        setField(term517, term517.getClass(), "first", null);
        setField(term517, term517.getClass(), "last", null);
        setField(term517, term517.getClass(), "propListHead", null);
        setIntField(term517, term517.getClass(), "sourcePosition", 0);
        setField(term517, term517.getClass(), "jsType", null);
        setField(term517, term517.getClass(), "parent", null);
        setField(term497, term497.getClass(), "last", term517);
        setField(term520, term520.getClass(), "next", null);
        setIntField(term520, term520.getClass(), "type", 0);
        setIntField(term520, term520.getClass(), "intValue", 0);
        setField(term520, term520.getClass(), "objectValue", null);
        setField(term497, term497.getClass(), "propListHead", term520);
        setIntField(term497, term497.getClass(), "sourcePosition", 1532716628);
        setField(term497, term497.getClass(), "jsType", null);
        setField(term497, term497.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CoalesceVariableNames");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term497;
        try {
            callMethod(klass, "removeVarDeclaration", argTypes, term491, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


