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
import java.lang.Object;

public class DevirtualizePrototypeMethods_isCall_137261513513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56;

    public DevirtualizePrototypeMethods_isCall_137261513513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56 = newInstance(Class.forName("com.google.javascript.jscomp.UseSite"));
        Object term57 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term59 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term64 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term67 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term70 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term74 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term84 = newInstance(Class.forName("com.google.javascript.jscomp.JSModule"));
        setIntField(term57, term57.getClass(), "type", 865208305);
        setIntField(term59, term59.getClass(), "type", -1179120542);
        setIntField(term61, term61.getClass(), "type", 0);
        setField(term61, term61.getClass(), "next", null);
        setField(term61, term61.getClass(), "first", null);
        setField(term61, term61.getClass(), "last", null);
        setField(term61, term61.getClass(), "propListHead", null);
        setIntField(term61, term61.getClass(), "sourcePosition", 0);
        setField(term61, term61.getClass(), "jsType", null);
        setField(term61, term61.getClass(), "parent", null);
        setField(term59, term59.getClass(), "next", term61);
        setIntField(term64, term64.getClass(), "type", 0);
        setField(term64, term64.getClass(), "next", null);
        setField(term64, term64.getClass(), "first", null);
        setField(term64, term64.getClass(), "last", null);
        setField(term64, term64.getClass(), "propListHead", null);
        setIntField(term64, term64.getClass(), "sourcePosition", 0);
        setField(term64, term64.getClass(), "jsType", null);
        setField(term64, term64.getClass(), "parent", null);
        setField(term59, term59.getClass(), "first", term64);
        setIntField(term67, term67.getClass(), "type", 0);
        setField(term67, term67.getClass(), "next", null);
        setField(term67, term67.getClass(), "first", null);
        setField(term67, term67.getClass(), "last", null);
        setField(term67, term67.getClass(), "propListHead", null);
        setIntField(term67, term67.getClass(), "sourcePosition", 0);
        setField(term67, term67.getClass(), "jsType", null);
        setField(term67, term67.getClass(), "parent", null);
        setField(term59, term59.getClass(), "last", term67);
        setField(term70, term70.getClass(), "next", null);
        setIntField(term70, term70.getClass(), "type", 0);
        setIntField(term70, term70.getClass(), "intValue", 0);
        setField(term70, term70.getClass(), "objectValue", null);
        setField(term59, term59.getClass(), "propListHead", term70);
        setIntField(term59, term59.getClass(), "sourcePosition", -226514366);
        setField(term59, term59.getClass(), "jsType", null);
        setField(term59, term59.getClass(), "parent", null);
        setField(term57, term57.getClass(), "next", term59);
        setIntField(term74, term74.getClass(), "type", 0);
        setField(term74, term74.getClass(), "next", null);
        setField(term74, term74.getClass(), "first", null);
        setField(term74, term74.getClass(), "last", null);
        setField(term74, term74.getClass(), "propListHead", null);
        setIntField(term74, term74.getClass(), "sourcePosition", 0);
        setField(term74, term74.getClass(), "jsType", null);
        setField(term74, term74.getClass(), "parent", null);
        setField(term57, term57.getClass(), "first", term74);
        setIntField(term77, term77.getClass(), "type", 0);
        setField(term77, term77.getClass(), "next", null);
        setField(term77, term77.getClass(), "first", null);
        setField(term77, term77.getClass(), "last", null);
        setField(term77, term77.getClass(), "propListHead", null);
        setIntField(term77, term77.getClass(), "sourcePosition", 0);
        setField(term77, term77.getClass(), "jsType", null);
        setField(term77, term77.getClass(), "parent", null);
        setField(term57, term57.getClass(), "last", term77);
        setField(term80, term80.getClass(), "next", null);
        setIntField(term80, term80.getClass(), "type", 0);
        setIntField(term80, term80.getClass(), "intValue", 0);
        setField(term80, term80.getClass(), "objectValue", null);
        setField(term57, term57.getClass(), "propListHead", term80);
        setIntField(term57, term57.getClass(), "sourcePosition", 1193880199);
        setField(term57, term57.getClass(), "jsType", null);
        setField(term57, term57.getClass(), "parent", null);
        setField(term56, term56.getClass(), "node", term57);
        setField(term84, term84.getClass(), "name", null);
        setField(term84, term84.getClass(), "inputs", null);
        setField(term84, term84.getClass(), "deps", null);
        setField(term56, term56.getClass(), "module", term84);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.UseSite");
        Object[] args = new Object[1];
        args[0] = term56;
        try {
            callMethod(klass, "isCall", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


