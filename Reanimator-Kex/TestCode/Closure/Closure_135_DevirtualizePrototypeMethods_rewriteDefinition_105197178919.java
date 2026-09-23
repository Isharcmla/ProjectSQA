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

public class DevirtualizePrototypeMethods_rewriteDefinition_105197178919 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265;
     Object term266;

    public DevirtualizePrototypeMethods_rewriteDefinition_105197178919() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265 = newInstance(Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods"));
        setField(term265, term265.getClass(), "compiler", null);
        term266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term268 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term273 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term276 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term279 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term283 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term286 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term289 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term266, term266.getClass(), "type", 683666002);
        setIntField(term268, term268.getClass(), "type", -663691365);
        setIntField(term270, term270.getClass(), "type", 0);
        setField(term270, term270.getClass(), "next", null);
        setField(term270, term270.getClass(), "first", null);
        setField(term270, term270.getClass(), "last", null);
        setField(term270, term270.getClass(), "propListHead", null);
        setIntField(term270, term270.getClass(), "sourcePosition", 0);
        setField(term270, term270.getClass(), "jsType", null);
        setField(term270, term270.getClass(), "parent", null);
        setField(term268, term268.getClass(), "next", term270);
        setIntField(term273, term273.getClass(), "type", 0);
        setField(term273, term273.getClass(), "next", null);
        setField(term273, term273.getClass(), "first", null);
        setField(term273, term273.getClass(), "last", null);
        setField(term273, term273.getClass(), "propListHead", null);
        setIntField(term273, term273.getClass(), "sourcePosition", 0);
        setField(term273, term273.getClass(), "jsType", null);
        setField(term273, term273.getClass(), "parent", null);
        setField(term268, term268.getClass(), "first", term273);
        setIntField(term276, term276.getClass(), "type", 0);
        setField(term276, term276.getClass(), "next", null);
        setField(term276, term276.getClass(), "first", null);
        setField(term276, term276.getClass(), "last", null);
        setField(term276, term276.getClass(), "propListHead", null);
        setIntField(term276, term276.getClass(), "sourcePosition", 0);
        setField(term276, term276.getClass(), "jsType", null);
        setField(term276, term276.getClass(), "parent", null);
        setField(term268, term268.getClass(), "last", term276);
        setField(term279, term279.getClass(), "next", null);
        setIntField(term279, term279.getClass(), "type", 0);
        setIntField(term279, term279.getClass(), "intValue", 0);
        setField(term279, term279.getClass(), "objectValue", null);
        setField(term268, term268.getClass(), "propListHead", term279);
        setIntField(term268, term268.getClass(), "sourcePosition", -1476117762);
        setField(term268, term268.getClass(), "jsType", null);
        setField(term268, term268.getClass(), "parent", null);
        setField(term266, term266.getClass(), "next", term268);
        setIntField(term283, term283.getClass(), "type", 0);
        setField(term283, term283.getClass(), "next", null);
        setField(term283, term283.getClass(), "first", null);
        setField(term283, term283.getClass(), "last", null);
        setField(term283, term283.getClass(), "propListHead", null);
        setIntField(term283, term283.getClass(), "sourcePosition", 0);
        setField(term283, term283.getClass(), "jsType", null);
        setField(term283, term283.getClass(), "parent", null);
        setField(term266, term266.getClass(), "first", term283);
        setIntField(term286, term286.getClass(), "type", 0);
        setField(term286, term286.getClass(), "next", null);
        setField(term286, term286.getClass(), "first", null);
        setField(term286, term286.getClass(), "last", null);
        setField(term286, term286.getClass(), "propListHead", null);
        setIntField(term286, term286.getClass(), "sourcePosition", 0);
        setField(term286, term286.getClass(), "jsType", null);
        setField(term286, term286.getClass(), "parent", null);
        setField(term266, term266.getClass(), "last", term286);
        setField(term289, term289.getClass(), "next", null);
        setIntField(term289, term289.getClass(), "type", 0);
        setIntField(term289, term289.getClass(), "intValue", 0);
        setField(term289, term289.getClass(), "objectValue", null);
        setField(term266, term266.getClass(), "propListHead", term289);
        setIntField(term266, term266.getClass(), "sourcePosition", -341962980);
        setField(term266, term266.getClass(), "jsType", null);
        setField(term266, term266.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.DevirtualizePrototypeMethods");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term266;
        args[1] = "MuLcgQHgqz";
        try {
            callMethod(klass, "rewriteDefinition", argTypes, term265, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


