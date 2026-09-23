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

public class NodeUtil_isAssignmentOp_2079461729200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1190;
     Object term11212;

    public NodeUtil_isAssignmentOp_2079461729200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1197 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1203 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1213 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1190, term1190.getClass(), "type", 873659088);
        setIntField(term1192, term1192.getClass(), "type", -1736183862);
        setIntField(term1194, term1194.getClass(), "type", 0);
        setField(term1194, term1194.getClass(), "next", null);
        setField(term1194, term1194.getClass(), "first", null);
        setField(term1194, term1194.getClass(), "last", null);
        setField(term1194, term1194.getClass(), "propListHead", null);
        setIntField(term1194, term1194.getClass(), "sourcePosition", 0);
        setField(term1194, term1194.getClass(), "jsType", null);
        setField(term1194, term1194.getClass(), "parent", null);
        setField(term1192, term1192.getClass(), "next", term1194);
        setIntField(term1197, term1197.getClass(), "type", 0);
        setField(term1197, term1197.getClass(), "next", null);
        setField(term1197, term1197.getClass(), "first", null);
        setField(term1197, term1197.getClass(), "last", null);
        setField(term1197, term1197.getClass(), "propListHead", null);
        setIntField(term1197, term1197.getClass(), "sourcePosition", 0);
        setField(term1197, term1197.getClass(), "jsType", null);
        setField(term1197, term1197.getClass(), "parent", null);
        setField(term1192, term1192.getClass(), "first", term1197);
        setIntField(term1200, term1200.getClass(), "type", 0);
        setField(term1200, term1200.getClass(), "next", null);
        setField(term1200, term1200.getClass(), "first", null);
        setField(term1200, term1200.getClass(), "last", null);
        setField(term1200, term1200.getClass(), "propListHead", null);
        setIntField(term1200, term1200.getClass(), "sourcePosition", 0);
        setField(term1200, term1200.getClass(), "jsType", null);
        setField(term1200, term1200.getClass(), "parent", null);
        setField(term1192, term1192.getClass(), "last", term1200);
        setField(term1203, term1203.getClass(), "next", null);
        setIntField(term1203, term1203.getClass(), "type", 0);
        setIntField(term1203, term1203.getClass(), "intValue", 0);
        setField(term1203, term1203.getClass(), "objectValue", null);
        setField(term1192, term1192.getClass(), "propListHead", term1203);
        setIntField(term1192, term1192.getClass(), "sourcePosition", 1964967720);
        setField(term1192, term1192.getClass(), "jsType", null);
        setField(term1192, term1192.getClass(), "parent", null);
        setField(term1190, term1190.getClass(), "next", term1192);
        setIntField(term1207, term1207.getClass(), "type", 0);
        setField(term1207, term1207.getClass(), "next", null);
        setField(term1207, term1207.getClass(), "first", null);
        setField(term1207, term1207.getClass(), "last", null);
        setField(term1207, term1207.getClass(), "propListHead", null);
        setIntField(term1207, term1207.getClass(), "sourcePosition", 0);
        setField(term1207, term1207.getClass(), "jsType", null);
        setField(term1207, term1207.getClass(), "parent", null);
        setField(term1190, term1190.getClass(), "first", term1207);
        setIntField(term1210, term1210.getClass(), "type", 0);
        setField(term1210, term1210.getClass(), "next", null);
        setField(term1210, term1210.getClass(), "first", null);
        setField(term1210, term1210.getClass(), "last", null);
        setField(term1210, term1210.getClass(), "propListHead", null);
        setIntField(term1210, term1210.getClass(), "sourcePosition", 0);
        setField(term1210, term1210.getClass(), "jsType", null);
        setField(term1210, term1210.getClass(), "parent", null);
        setField(term1190, term1190.getClass(), "last", term1210);
        setField(term1213, term1213.getClass(), "next", null);
        setIntField(term1213, term1213.getClass(), "type", 0);
        setIntField(term1213, term1213.getClass(), "intValue", 0);
        setField(term1213, term1213.getClass(), "objectValue", null);
        setField(term1190, term1190.getClass(), "propListHead", term1213);
        setIntField(term1190, term1190.getClass(), "sourcePosition", 1351900243);
        setField(term1190, term1190.getClass(), "jsType", null);
        setField(term1190, term1190.getClass(), "parent", null);
        term11212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11213 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11217 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11218 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11220 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term11212, term11212.getClass(), "type", 873659088);
        setIntField(term11213, term11213.getClass(), "type", -1736183862);
        setIntField(term11214, term11214.getClass(), "type", 0);
        setField(term11214, term11214.getClass(), "next", null);
        setField(term11214, term11214.getClass(), "first", null);
        setField(term11214, term11214.getClass(), "last", null);
        setField(term11214, term11214.getClass(), "propListHead", null);
        setIntField(term11214, term11214.getClass(), "sourcePosition", 0);
        setField(term11214, term11214.getClass(), "jsType", null);
        setField(term11214, term11214.getClass(), "parent", null);
        setField(term11213, term11213.getClass(), "next", term11214);
        setIntField(term11215, term11215.getClass(), "type", 0);
        setField(term11215, term11215.getClass(), "next", null);
        setField(term11215, term11215.getClass(), "first", null);
        setField(term11215, term11215.getClass(), "last", null);
        setField(term11215, term11215.getClass(), "propListHead", null);
        setIntField(term11215, term11215.getClass(), "sourcePosition", 0);
        setField(term11215, term11215.getClass(), "jsType", null);
        setField(term11215, term11215.getClass(), "parent", null);
        setField(term11213, term11213.getClass(), "first", term11215);
        setIntField(term11216, term11216.getClass(), "type", 0);
        setField(term11216, term11216.getClass(), "next", null);
        setField(term11216, term11216.getClass(), "first", null);
        setField(term11216, term11216.getClass(), "last", null);
        setField(term11216, term11216.getClass(), "propListHead", null);
        setIntField(term11216, term11216.getClass(), "sourcePosition", 0);
        setField(term11216, term11216.getClass(), "jsType", null);
        setField(term11216, term11216.getClass(), "parent", null);
        setField(term11213, term11213.getClass(), "last", term11216);
        setField(term11217, term11217.getClass(), "next", null);
        setIntField(term11217, term11217.getClass(), "type", 0);
        setIntField(term11217, term11217.getClass(), "intValue", 0);
        setField(term11217, term11217.getClass(), "objectValue", null);
        setField(term11213, term11213.getClass(), "propListHead", term11217);
        setIntField(term11213, term11213.getClass(), "sourcePosition", 1964967720);
        setField(term11213, term11213.getClass(), "jsType", null);
        setField(term11213, term11213.getClass(), "parent", null);
        setField(term11212, term11212.getClass(), "next", term11213);
        setIntField(term11218, term11218.getClass(), "type", 0);
        setField(term11218, term11218.getClass(), "next", null);
        setField(term11218, term11218.getClass(), "first", null);
        setField(term11218, term11218.getClass(), "last", null);
        setField(term11218, term11218.getClass(), "propListHead", null);
        setIntField(term11218, term11218.getClass(), "sourcePosition", 0);
        setField(term11218, term11218.getClass(), "jsType", null);
        setField(term11218, term11218.getClass(), "parent", null);
        setField(term11212, term11212.getClass(), "first", term11218);
        setIntField(term11219, term11219.getClass(), "type", 0);
        setField(term11219, term11219.getClass(), "next", null);
        setField(term11219, term11219.getClass(), "first", null);
        setField(term11219, term11219.getClass(), "last", null);
        setField(term11219, term11219.getClass(), "propListHead", null);
        setIntField(term11219, term11219.getClass(), "sourcePosition", 0);
        setField(term11219, term11219.getClass(), "jsType", null);
        setField(term11219, term11219.getClass(), "parent", null);
        setField(term11212, term11212.getClass(), "last", term11219);
        setField(term11220, term11220.getClass(), "next", null);
        setIntField(term11220, term11220.getClass(), "type", 0);
        setIntField(term11220, term11220.getClass(), "intValue", 0);
        setField(term11220, term11220.getClass(), "objectValue", null);
        setField(term11212, term11212.getClass(), "propListHead", term11220);
        setIntField(term11212, term11212.getClass(), "sourcePosition", 1351900243);
        setField(term11212, term11212.getClass(), "jsType", null);
        setField(term11212, term11212.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1190;
        Object retValue = callMethod(klass, "isAssignmentOp", argTypes, null, args);
        assertTrue(recursiveEquals(term1190, term11212));
        assertTrue(recursiveEquals(retValue, false));
    }

};


