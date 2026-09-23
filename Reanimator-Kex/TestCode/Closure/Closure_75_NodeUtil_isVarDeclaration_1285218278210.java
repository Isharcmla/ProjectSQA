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

public class NodeUtil_isVarDeclaration_1285218278210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1460;
     Object term12079;

    public NodeUtil_isVarDeclaration_1285218278210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1460 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1462 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1464 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1470 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1473 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1477 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1480 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1483 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1460, term1460.getClass(), "type", -706253892);
        setIntField(term1462, term1462.getClass(), "type", -1244386281);
        setIntField(term1464, term1464.getClass(), "type", 0);
        setField(term1464, term1464.getClass(), "next", null);
        setField(term1464, term1464.getClass(), "first", null);
        setField(term1464, term1464.getClass(), "last", null);
        setField(term1464, term1464.getClass(), "propListHead", null);
        setIntField(term1464, term1464.getClass(), "sourcePosition", 0);
        setField(term1464, term1464.getClass(), "jsType", null);
        setField(term1464, term1464.getClass(), "parent", null);
        setField(term1462, term1462.getClass(), "next", term1464);
        setIntField(term1467, term1467.getClass(), "type", 0);
        setField(term1467, term1467.getClass(), "next", null);
        setField(term1467, term1467.getClass(), "first", null);
        setField(term1467, term1467.getClass(), "last", null);
        setField(term1467, term1467.getClass(), "propListHead", null);
        setIntField(term1467, term1467.getClass(), "sourcePosition", 0);
        setField(term1467, term1467.getClass(), "jsType", null);
        setField(term1467, term1467.getClass(), "parent", null);
        setField(term1462, term1462.getClass(), "first", term1467);
        setIntField(term1470, term1470.getClass(), "type", 0);
        setField(term1470, term1470.getClass(), "next", null);
        setField(term1470, term1470.getClass(), "first", null);
        setField(term1470, term1470.getClass(), "last", null);
        setField(term1470, term1470.getClass(), "propListHead", null);
        setIntField(term1470, term1470.getClass(), "sourcePosition", 0);
        setField(term1470, term1470.getClass(), "jsType", null);
        setField(term1470, term1470.getClass(), "parent", null);
        setField(term1462, term1462.getClass(), "last", term1470);
        setField(term1473, term1473.getClass(), "next", null);
        setIntField(term1473, term1473.getClass(), "type", 0);
        setIntField(term1473, term1473.getClass(), "intValue", 0);
        setField(term1473, term1473.getClass(), "objectValue", null);
        setField(term1462, term1462.getClass(), "propListHead", term1473);
        setIntField(term1462, term1462.getClass(), "sourcePosition", -1551355284);
        setField(term1462, term1462.getClass(), "jsType", null);
        setField(term1462, term1462.getClass(), "parent", null);
        setField(term1460, term1460.getClass(), "next", term1462);
        setIntField(term1477, term1477.getClass(), "type", 0);
        setField(term1477, term1477.getClass(), "next", null);
        setField(term1477, term1477.getClass(), "first", null);
        setField(term1477, term1477.getClass(), "last", null);
        setField(term1477, term1477.getClass(), "propListHead", null);
        setIntField(term1477, term1477.getClass(), "sourcePosition", 0);
        setField(term1477, term1477.getClass(), "jsType", null);
        setField(term1477, term1477.getClass(), "parent", null);
        setField(term1460, term1460.getClass(), "first", term1477);
        setIntField(term1480, term1480.getClass(), "type", 0);
        setField(term1480, term1480.getClass(), "next", null);
        setField(term1480, term1480.getClass(), "first", null);
        setField(term1480, term1480.getClass(), "last", null);
        setField(term1480, term1480.getClass(), "propListHead", null);
        setIntField(term1480, term1480.getClass(), "sourcePosition", 0);
        setField(term1480, term1480.getClass(), "jsType", null);
        setField(term1480, term1480.getClass(), "parent", null);
        setField(term1460, term1460.getClass(), "last", term1480);
        setField(term1483, term1483.getClass(), "next", null);
        setIntField(term1483, term1483.getClass(), "type", 0);
        setIntField(term1483, term1483.getClass(), "intValue", 0);
        setField(term1483, term1483.getClass(), "objectValue", null);
        setField(term1460, term1460.getClass(), "propListHead", term1483);
        setIntField(term1460, term1460.getClass(), "sourcePosition", -1381970335);
        setField(term1460, term1460.getClass(), "jsType", null);
        setField(term1460, term1460.getClass(), "parent", null);
        term12079 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12083 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12084 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12085 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12087 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term12079, term12079.getClass(), "type", -706253892);
        setIntField(term12080, term12080.getClass(), "type", -1244386281);
        setIntField(term12081, term12081.getClass(), "type", 0);
        setField(term12081, term12081.getClass(), "next", null);
        setField(term12081, term12081.getClass(), "first", null);
        setField(term12081, term12081.getClass(), "last", null);
        setField(term12081, term12081.getClass(), "propListHead", null);
        setIntField(term12081, term12081.getClass(), "sourcePosition", 0);
        setField(term12081, term12081.getClass(), "jsType", null);
        setField(term12081, term12081.getClass(), "parent", null);
        setField(term12080, term12080.getClass(), "next", term12081);
        setIntField(term12082, term12082.getClass(), "type", 0);
        setField(term12082, term12082.getClass(), "next", null);
        setField(term12082, term12082.getClass(), "first", null);
        setField(term12082, term12082.getClass(), "last", null);
        setField(term12082, term12082.getClass(), "propListHead", null);
        setIntField(term12082, term12082.getClass(), "sourcePosition", 0);
        setField(term12082, term12082.getClass(), "jsType", null);
        setField(term12082, term12082.getClass(), "parent", null);
        setField(term12080, term12080.getClass(), "first", term12082);
        setIntField(term12083, term12083.getClass(), "type", 0);
        setField(term12083, term12083.getClass(), "next", null);
        setField(term12083, term12083.getClass(), "first", null);
        setField(term12083, term12083.getClass(), "last", null);
        setField(term12083, term12083.getClass(), "propListHead", null);
        setIntField(term12083, term12083.getClass(), "sourcePosition", 0);
        setField(term12083, term12083.getClass(), "jsType", null);
        setField(term12083, term12083.getClass(), "parent", null);
        setField(term12080, term12080.getClass(), "last", term12083);
        setField(term12084, term12084.getClass(), "next", null);
        setIntField(term12084, term12084.getClass(), "type", 0);
        setIntField(term12084, term12084.getClass(), "intValue", 0);
        setField(term12084, term12084.getClass(), "objectValue", null);
        setField(term12080, term12080.getClass(), "propListHead", term12084);
        setIntField(term12080, term12080.getClass(), "sourcePosition", -1551355284);
        setField(term12080, term12080.getClass(), "jsType", null);
        setField(term12080, term12080.getClass(), "parent", null);
        setField(term12079, term12079.getClass(), "next", term12080);
        setIntField(term12085, term12085.getClass(), "type", 0);
        setField(term12085, term12085.getClass(), "next", null);
        setField(term12085, term12085.getClass(), "first", null);
        setField(term12085, term12085.getClass(), "last", null);
        setField(term12085, term12085.getClass(), "propListHead", null);
        setIntField(term12085, term12085.getClass(), "sourcePosition", 0);
        setField(term12085, term12085.getClass(), "jsType", null);
        setField(term12085, term12085.getClass(), "parent", null);
        setField(term12079, term12079.getClass(), "first", term12085);
        setIntField(term12086, term12086.getClass(), "type", 0);
        setField(term12086, term12086.getClass(), "next", null);
        setField(term12086, term12086.getClass(), "first", null);
        setField(term12086, term12086.getClass(), "last", null);
        setField(term12086, term12086.getClass(), "propListHead", null);
        setIntField(term12086, term12086.getClass(), "sourcePosition", 0);
        setField(term12086, term12086.getClass(), "jsType", null);
        setField(term12086, term12086.getClass(), "parent", null);
        setField(term12079, term12079.getClass(), "last", term12086);
        setField(term12087, term12087.getClass(), "next", null);
        setIntField(term12087, term12087.getClass(), "type", 0);
        setIntField(term12087, term12087.getClass(), "intValue", 0);
        setField(term12087, term12087.getClass(), "objectValue", null);
        setField(term12079, term12079.getClass(), "propListHead", term12087);
        setIntField(term12079, term12079.getClass(), "sourcePosition", -1381970335);
        setField(term12079, term12079.getClass(), "jsType", null);
        setField(term12079, term12079.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1460;
        Object retValue = callMethod(klass, "isVarDeclaration", argTypes, null, args);
        assertTrue(recursiveEquals(term1460, term12079));
        assertTrue(recursiveEquals(retValue, false));
    }

};


