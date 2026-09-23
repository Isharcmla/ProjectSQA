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

public class NodeUtil_isVar_896854502212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1141;
     Object term10788;

    public NodeUtil_isVar_896854502212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1145 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1155 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1141, term1141.getClass(), "type", 1065595802);
        setIntField(term1143, term1143.getClass(), "type", -1097563716);
        setIntField(term1145, term1145.getClass(), "type", 0);
        setField(term1145, term1145.getClass(), "next", null);
        setField(term1145, term1145.getClass(), "first", null);
        setField(term1145, term1145.getClass(), "last", null);
        setField(term1145, term1145.getClass(), "propListHead", null);
        setIntField(term1145, term1145.getClass(), "sourcePosition", 0);
        setField(term1145, term1145.getClass(), "jsType", null);
        setField(term1145, term1145.getClass(), "parent", null);
        setField(term1143, term1143.getClass(), "next", term1145);
        setIntField(term1148, term1148.getClass(), "type", 0);
        setField(term1148, term1148.getClass(), "next", null);
        setField(term1148, term1148.getClass(), "first", null);
        setField(term1148, term1148.getClass(), "last", null);
        setField(term1148, term1148.getClass(), "propListHead", null);
        setIntField(term1148, term1148.getClass(), "sourcePosition", 0);
        setField(term1148, term1148.getClass(), "jsType", null);
        setField(term1148, term1148.getClass(), "parent", null);
        setField(term1143, term1143.getClass(), "first", term1148);
        setIntField(term1151, term1151.getClass(), "type", 0);
        setField(term1151, term1151.getClass(), "next", null);
        setField(term1151, term1151.getClass(), "first", null);
        setField(term1151, term1151.getClass(), "last", null);
        setField(term1151, term1151.getClass(), "propListHead", null);
        setIntField(term1151, term1151.getClass(), "sourcePosition", 0);
        setField(term1151, term1151.getClass(), "jsType", null);
        setField(term1151, term1151.getClass(), "parent", null);
        setField(term1143, term1143.getClass(), "last", term1151);
        setField(term1143, term1143.getClass(), "propListHead", null);
        setIntField(term1143, term1143.getClass(), "sourcePosition", 0);
        setField(term1143, term1143.getClass(), "jsType", null);
        setField(term1143, term1143.getClass(), "parent", null);
        setField(term1141, term1141.getClass(), "next", term1143);
        setIntField(term1155, term1155.getClass(), "type", 0);
        setField(term1155, term1155.getClass(), "next", null);
        setField(term1155, term1155.getClass(), "first", null);
        setField(term1155, term1155.getClass(), "last", null);
        setField(term1155, term1155.getClass(), "propListHead", null);
        setIntField(term1155, term1155.getClass(), "sourcePosition", 0);
        setField(term1155, term1155.getClass(), "jsType", null);
        setField(term1155, term1155.getClass(), "parent", null);
        setField(term1141, term1141.getClass(), "first", term1155);
        setIntField(term1158, term1158.getClass(), "type", 0);
        setField(term1158, term1158.getClass(), "next", null);
        setField(term1158, term1158.getClass(), "first", null);
        setField(term1158, term1158.getClass(), "last", null);
        setField(term1158, term1158.getClass(), "propListHead", null);
        setIntField(term1158, term1158.getClass(), "sourcePosition", 0);
        setField(term1158, term1158.getClass(), "jsType", null);
        setField(term1158, term1158.getClass(), "parent", null);
        setField(term1141, term1141.getClass(), "last", term1158);
        setField(term1141, term1141.getClass(), "propListHead", null);
        setIntField(term1141, term1141.getClass(), "sourcePosition", 0);
        setField(term1141, term1141.getClass(), "jsType", null);
        setField(term1141, term1141.getClass(), "parent", null);
        term10788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10789 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10790 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10791 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10792 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10793 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term10788, term10788.getClass(), "type", 1065595802);
        setIntField(term10789, term10789.getClass(), "type", -1097563716);
        setIntField(term10790, term10790.getClass(), "type", 0);
        setField(term10790, term10790.getClass(), "next", null);
        setField(term10790, term10790.getClass(), "first", null);
        setField(term10790, term10790.getClass(), "last", null);
        setField(term10790, term10790.getClass(), "propListHead", null);
        setIntField(term10790, term10790.getClass(), "sourcePosition", 0);
        setField(term10790, term10790.getClass(), "jsType", null);
        setField(term10790, term10790.getClass(), "parent", null);
        setField(term10789, term10789.getClass(), "next", term10790);
        setIntField(term10791, term10791.getClass(), "type", 0);
        setField(term10791, term10791.getClass(), "next", null);
        setField(term10791, term10791.getClass(), "first", null);
        setField(term10791, term10791.getClass(), "last", null);
        setField(term10791, term10791.getClass(), "propListHead", null);
        setIntField(term10791, term10791.getClass(), "sourcePosition", 0);
        setField(term10791, term10791.getClass(), "jsType", null);
        setField(term10791, term10791.getClass(), "parent", null);
        setField(term10789, term10789.getClass(), "first", term10791);
        setIntField(term10792, term10792.getClass(), "type", 0);
        setField(term10792, term10792.getClass(), "next", null);
        setField(term10792, term10792.getClass(), "first", null);
        setField(term10792, term10792.getClass(), "last", null);
        setField(term10792, term10792.getClass(), "propListHead", null);
        setIntField(term10792, term10792.getClass(), "sourcePosition", 0);
        setField(term10792, term10792.getClass(), "jsType", null);
        setField(term10792, term10792.getClass(), "parent", null);
        setField(term10789, term10789.getClass(), "last", term10792);
        setField(term10789, term10789.getClass(), "propListHead", null);
        setIntField(term10789, term10789.getClass(), "sourcePosition", 0);
        setField(term10789, term10789.getClass(), "jsType", null);
        setField(term10789, term10789.getClass(), "parent", null);
        setField(term10788, term10788.getClass(), "next", term10789);
        setIntField(term10793, term10793.getClass(), "type", 0);
        setField(term10793, term10793.getClass(), "next", null);
        setField(term10793, term10793.getClass(), "first", null);
        setField(term10793, term10793.getClass(), "last", null);
        setField(term10793, term10793.getClass(), "propListHead", null);
        setIntField(term10793, term10793.getClass(), "sourcePosition", 0);
        setField(term10793, term10793.getClass(), "jsType", null);
        setField(term10793, term10793.getClass(), "parent", null);
        setField(term10788, term10788.getClass(), "first", term10793);
        setIntField(term10794, term10794.getClass(), "type", 0);
        setField(term10794, term10794.getClass(), "next", null);
        setField(term10794, term10794.getClass(), "first", null);
        setField(term10794, term10794.getClass(), "last", null);
        setField(term10794, term10794.getClass(), "propListHead", null);
        setIntField(term10794, term10794.getClass(), "sourcePosition", 0);
        setField(term10794, term10794.getClass(), "jsType", null);
        setField(term10794, term10794.getClass(), "parent", null);
        setField(term10788, term10788.getClass(), "last", term10794);
        setField(term10788, term10788.getClass(), "propListHead", null);
        setIntField(term10788, term10788.getClass(), "sourcePosition", 0);
        setField(term10788, term10788.getClass(), "jsType", null);
        setField(term10788, term10788.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term1141;
        Object retValue = callMethod(klass, "isVar", argTypes, null, args);
        assertTrue(recursiveEquals(term1141, term10788));
        assertTrue(recursiveEquals(retValue, false));
    }

};


