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
import java.lang.Object;

public class NodeUtil_getAssignedValue_425769613212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1410;

    public NodeUtil_getAssignedValue_425769613212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1410 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1414 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1418 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1421 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1425 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1432 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1410, term1410.getClass(), "type", 723812297);
        setIntField(term1412, term1412.getClass(), "type", 1639448749);
        setIntField(term1414, term1414.getClass(), "type", 873659088);
        setIntField(term1416, term1416.getClass(), "type", -975748721);
        setIntField(term1418, term1418.getClass(), "type", 433248783);
        setField(term1418, term1418.getClass(), "next", null);
        setField(term1418, term1418.getClass(), "first", null);
        setField(term1418, term1418.getClass(), "last", null);
        setField(term1418, term1418.getClass(), "propListHead", null);
        setIntField(term1418, term1418.getClass(), "sourcePosition", 0);
        setField(term1418, term1418.getClass(), "jsType", null);
        setField(term1418, term1418.getClass(), "parent", null);
        setField(term1416, term1416.getClass(), "next", term1418);
        setIntField(term1421, term1421.getClass(), "type", -507944154);
        setField(term1421, term1421.getClass(), "next", null);
        setField(term1421, term1421.getClass(), "first", null);
        setField(term1421, term1421.getClass(), "last", term1418);
        setField(term1421, term1421.getClass(), "propListHead", null);
        setIntField(term1421, term1421.getClass(), "sourcePosition", 0);
        setField(term1421, term1421.getClass(), "jsType", null);
        setField(term1421, term1421.getClass(), "parent", null);
        setField(term1416, term1416.getClass(), "first", term1421);
        setField(term1416, term1416.getClass(), "last", term1414);
        setField(term1416, term1416.getClass(), "propListHead", null);
        setIntField(term1416, term1416.getClass(), "sourcePosition", 0);
        setField(term1416, term1416.getClass(), "jsType", null);
        setField(term1416, term1416.getClass(), "parent", null);
        setField(term1414, term1414.getClass(), "next", term1416);
        setField(term1414, term1414.getClass(), "first", term1418);
        setIntField(term1425, term1425.getClass(), "type", 897010381);
        setIntField(term1427, term1427.getClass(), "type", -15712667);
        setField(term1427, term1427.getClass(), "next", null);
        setField(term1427, term1427.getClass(), "first", term1421);
        setField(term1427, term1427.getClass(), "last", term1416);
        setField(term1427, term1427.getClass(), "propListHead", null);
        setIntField(term1427, term1427.getClass(), "sourcePosition", 0);
        setField(term1427, term1427.getClass(), "jsType", null);
        setField(term1427, term1427.getClass(), "parent", null);
        setField(term1425, term1425.getClass(), "next", term1427);
        setField(term1425, term1425.getClass(), "first", term1412);
        setField(term1425, term1425.getClass(), "last", term1412);
        setField(term1425, term1425.getClass(), "propListHead", null);
        setIntField(term1425, term1425.getClass(), "sourcePosition", 0);
        setField(term1425, term1425.getClass(), "jsType", null);
        setField(term1425, term1425.getClass(), "parent", null);
        setField(term1414, term1414.getClass(), "last", term1425);
        setField(term1414, term1414.getClass(), "propListHead", null);
        setIntField(term1414, term1414.getClass(), "sourcePosition", 0);
        setField(term1414, term1414.getClass(), "jsType", null);
        setField(term1414, term1414.getClass(), "parent", null);
        setField(term1412, term1412.getClass(), "next", term1414);
        setIntField(term1432, term1432.getClass(), "type", 1964967720);
        setField(term1432, term1432.getClass(), "next", term1425);
        setField(term1432, term1432.getClass(), "first", term1427);
        setField(term1432, term1432.getClass(), "last", term1410);
        setField(term1432, term1432.getClass(), "propListHead", null);
        setIntField(term1432, term1432.getClass(), "sourcePosition", 0);
        setField(term1432, term1432.getClass(), "jsType", null);
        setField(term1432, term1432.getClass(), "parent", null);
        setField(term1412, term1412.getClass(), "first", term1432);
        setField(term1412, term1412.getClass(), "last", term1432);
        setField(term1412, term1412.getClass(), "propListHead", null);
        setIntField(term1412, term1412.getClass(), "sourcePosition", 0);
        setField(term1412, term1412.getClass(), "jsType", null);
        setField(term1412, term1412.getClass(), "parent", null);
        setField(term1410, term1410.getClass(), "next", term1412);
        setField(term1410, term1410.getClass(), "first", term1416);
        setField(term1410, term1410.getClass(), "last", term1418);
        setField(term1410, term1410.getClass(), "propListHead", null);
        setIntField(term1410, term1410.getClass(), "sourcePosition", 0);
        setField(term1410, term1410.getClass(), "jsType", null);
        setField(term1410, term1410.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1410;
        try {
            callMethod(klass, "getAssignedValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


