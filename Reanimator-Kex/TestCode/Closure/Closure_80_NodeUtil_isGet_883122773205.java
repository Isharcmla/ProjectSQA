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
import java.lang.Object;

public class NodeUtil_isGet_883122773205 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1325;
     Object term11585;

    public NodeUtil_isGet_883122773205() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1332 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1335 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1338 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1342 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1345 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1348 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1325, term1325.getClass(), "type", -1220630391);
        setIntField(term1327, term1327.getClass(), "type", 40571662);
        setIntField(term1329, term1329.getClass(), "type", 0);
        setField(term1329, term1329.getClass(), "next", null);
        setField(term1329, term1329.getClass(), "first", null);
        setField(term1329, term1329.getClass(), "last", null);
        setField(term1329, term1329.getClass(), "propListHead", null);
        setIntField(term1329, term1329.getClass(), "sourcePosition", 0);
        setField(term1329, term1329.getClass(), "jsType", null);
        setField(term1329, term1329.getClass(), "parent", null);
        setField(term1327, term1327.getClass(), "next", term1329);
        setIntField(term1332, term1332.getClass(), "type", 0);
        setField(term1332, term1332.getClass(), "next", null);
        setField(term1332, term1332.getClass(), "first", null);
        setField(term1332, term1332.getClass(), "last", null);
        setField(term1332, term1332.getClass(), "propListHead", null);
        setIntField(term1332, term1332.getClass(), "sourcePosition", 0);
        setField(term1332, term1332.getClass(), "jsType", null);
        setField(term1332, term1332.getClass(), "parent", null);
        setField(term1327, term1327.getClass(), "first", term1332);
        setIntField(term1335, term1335.getClass(), "type", 0);
        setField(term1335, term1335.getClass(), "next", null);
        setField(term1335, term1335.getClass(), "first", null);
        setField(term1335, term1335.getClass(), "last", null);
        setField(term1335, term1335.getClass(), "propListHead", null);
        setIntField(term1335, term1335.getClass(), "sourcePosition", 0);
        setField(term1335, term1335.getClass(), "jsType", null);
        setField(term1335, term1335.getClass(), "parent", null);
        setField(term1327, term1327.getClass(), "last", term1335);
        setField(term1338, term1338.getClass(), "next", null);
        setIntField(term1338, term1338.getClass(), "type", 0);
        setIntField(term1338, term1338.getClass(), "intValue", 0);
        setField(term1338, term1338.getClass(), "objectValue", null);
        setField(term1327, term1327.getClass(), "propListHead", term1338);
        setIntField(term1327, term1327.getClass(), "sourcePosition", 279384872);
        setField(term1327, term1327.getClass(), "jsType", null);
        setField(term1327, term1327.getClass(), "parent", null);
        setField(term1325, term1325.getClass(), "next", term1327);
        setIntField(term1342, term1342.getClass(), "type", 0);
        setField(term1342, term1342.getClass(), "next", null);
        setField(term1342, term1342.getClass(), "first", null);
        setField(term1342, term1342.getClass(), "last", null);
        setField(term1342, term1342.getClass(), "propListHead", null);
        setIntField(term1342, term1342.getClass(), "sourcePosition", 0);
        setField(term1342, term1342.getClass(), "jsType", null);
        setField(term1342, term1342.getClass(), "parent", null);
        setField(term1325, term1325.getClass(), "first", term1342);
        setIntField(term1345, term1345.getClass(), "type", 0);
        setField(term1345, term1345.getClass(), "next", null);
        setField(term1345, term1345.getClass(), "first", null);
        setField(term1345, term1345.getClass(), "last", null);
        setField(term1345, term1345.getClass(), "propListHead", null);
        setIntField(term1345, term1345.getClass(), "sourcePosition", 0);
        setField(term1345, term1345.getClass(), "jsType", null);
        setField(term1345, term1345.getClass(), "parent", null);
        setField(term1325, term1325.getClass(), "last", term1345);
        setField(term1348, term1348.getClass(), "next", null);
        setIntField(term1348, term1348.getClass(), "type", 0);
        setIntField(term1348, term1348.getClass(), "intValue", 0);
        setField(term1348, term1348.getClass(), "objectValue", null);
        setField(term1325, term1325.getClass(), "propListHead", term1348);
        setIntField(term1325, term1325.getClass(), "sourcePosition", 1427305953);
        setField(term1325, term1325.getClass(), "jsType", null);
        setField(term1325, term1325.getClass(), "parent", null);
        term11585 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11588 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11590 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11591 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11592 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11593 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11585, term11585.getClass(), "type", -1220630391);
        setIntField(term11586, term11586.getClass(), "type", 40571662);
        setIntField(term11587, term11587.getClass(), "type", 0);
        setField(term11587, term11587.getClass(), "next", null);
        setField(term11587, term11587.getClass(), "first", null);
        setField(term11587, term11587.getClass(), "last", null);
        setField(term11587, term11587.getClass(), "propListHead", null);
        setIntField(term11587, term11587.getClass(), "sourcePosition", 0);
        setField(term11587, term11587.getClass(), "jsType", null);
        setField(term11587, term11587.getClass(), "parent", null);
        setField(term11586, term11586.getClass(), "next", term11587);
        setIntField(term11588, term11588.getClass(), "type", 0);
        setField(term11588, term11588.getClass(), "next", null);
        setField(term11588, term11588.getClass(), "first", null);
        setField(term11588, term11588.getClass(), "last", null);
        setField(term11588, term11588.getClass(), "propListHead", null);
        setIntField(term11588, term11588.getClass(), "sourcePosition", 0);
        setField(term11588, term11588.getClass(), "jsType", null);
        setField(term11588, term11588.getClass(), "parent", null);
        setField(term11586, term11586.getClass(), "first", term11588);
        setIntField(term11589, term11589.getClass(), "type", 0);
        setField(term11589, term11589.getClass(), "next", null);
        setField(term11589, term11589.getClass(), "first", null);
        setField(term11589, term11589.getClass(), "last", null);
        setField(term11589, term11589.getClass(), "propListHead", null);
        setIntField(term11589, term11589.getClass(), "sourcePosition", 0);
        setField(term11589, term11589.getClass(), "jsType", null);
        setField(term11589, term11589.getClass(), "parent", null);
        setField(term11586, term11586.getClass(), "last", term11589);
        setField(term11590, term11590.getClass(), "next", null);
        setIntField(term11590, term11590.getClass(), "type", 0);
        setIntField(term11590, term11590.getClass(), "intValue", 0);
        setField(term11590, term11590.getClass(), "objectValue", null);
        setField(term11586, term11586.getClass(), "propListHead", term11590);
        setIntField(term11586, term11586.getClass(), "sourcePosition", 279384872);
        setField(term11586, term11586.getClass(), "jsType", null);
        setField(term11586, term11586.getClass(), "parent", null);
        setField(term11585, term11585.getClass(), "next", term11586);
        setIntField(term11591, term11591.getClass(), "type", 0);
        setField(term11591, term11591.getClass(), "next", null);
        setField(term11591, term11591.getClass(), "first", null);
        setField(term11591, term11591.getClass(), "last", null);
        setField(term11591, term11591.getClass(), "propListHead", null);
        setIntField(term11591, term11591.getClass(), "sourcePosition", 0);
        setField(term11591, term11591.getClass(), "jsType", null);
        setField(term11591, term11591.getClass(), "parent", null);
        setField(term11585, term11585.getClass(), "first", term11591);
        setIntField(term11592, term11592.getClass(), "type", 0);
        setField(term11592, term11592.getClass(), "next", null);
        setField(term11592, term11592.getClass(), "first", null);
        setField(term11592, term11592.getClass(), "last", null);
        setField(term11592, term11592.getClass(), "propListHead", null);
        setIntField(term11592, term11592.getClass(), "sourcePosition", 0);
        setField(term11592, term11592.getClass(), "jsType", null);
        setField(term11592, term11592.getClass(), "parent", null);
        setField(term11585, term11585.getClass(), "last", term11592);
        setField(term11593, term11593.getClass(), "next", null);
        setIntField(term11593, term11593.getClass(), "type", 0);
        setIntField(term11593, term11593.getClass(), "intValue", 0);
        setField(term11593, term11593.getClass(), "objectValue", null);
        setField(term11585, term11585.getClass(), "propListHead", term11593);
        setIntField(term11585, term11585.getClass(), "sourcePosition", 1427305953);
        setField(term11585, term11585.getClass(), "jsType", null);
        setField(term11585, term11585.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1325;
        Object retValue = callMethod(klass, "isGet", argTypes, null, args);
        assertTrue(recursiveEquals(term1325, term11585));
        assertTrue(recursiveEquals(retValue, false));
    }

};


