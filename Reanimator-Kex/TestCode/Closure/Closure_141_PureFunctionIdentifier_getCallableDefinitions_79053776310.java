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

public class PureFunctionIdentifier_getCallableDefinitions_79053776310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137;
     Object term1133;

    public PureFunctionIdentifier_getCallableDefinitions_79053776310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term144 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term150 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term157 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term160 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term137, term137.getClass(), "type", -157887805);
        setIntField(term139, term139.getClass(), "type", -1968847291);
        setIntField(term141, term141.getClass(), "type", 0);
        setField(term141, term141.getClass(), "next", null);
        setField(term141, term141.getClass(), "first", null);
        setField(term141, term141.getClass(), "last", null);
        setField(term141, term141.getClass(), "propListHead", null);
        setIntField(term141, term141.getClass(), "sourcePosition", 0);
        setField(term141, term141.getClass(), "jsType", null);
        setField(term141, term141.getClass(), "parent", null);
        setField(term139, term139.getClass(), "next", term141);
        setIntField(term144, term144.getClass(), "type", 0);
        setField(term144, term144.getClass(), "next", null);
        setField(term144, term144.getClass(), "first", null);
        setField(term144, term144.getClass(), "last", null);
        setField(term144, term144.getClass(), "propListHead", null);
        setIntField(term144, term144.getClass(), "sourcePosition", 0);
        setField(term144, term144.getClass(), "jsType", null);
        setField(term144, term144.getClass(), "parent", null);
        setField(term139, term139.getClass(), "first", term144);
        setIntField(term147, term147.getClass(), "type", 0);
        setField(term147, term147.getClass(), "next", null);
        setField(term147, term147.getClass(), "first", null);
        setField(term147, term147.getClass(), "last", null);
        setField(term147, term147.getClass(), "propListHead", null);
        setIntField(term147, term147.getClass(), "sourcePosition", 0);
        setField(term147, term147.getClass(), "jsType", null);
        setField(term147, term147.getClass(), "parent", null);
        setField(term139, term139.getClass(), "last", term147);
        setField(term150, term150.getClass(), "next", null);
        setIntField(term150, term150.getClass(), "type", 0);
        setIntField(term150, term150.getClass(), "intValue", 0);
        setField(term150, term150.getClass(), "objectValue", null);
        setField(term139, term139.getClass(), "propListHead", term150);
        setIntField(term139, term139.getClass(), "sourcePosition", 1632125673);
        setField(term139, term139.getClass(), "jsType", null);
        setField(term139, term139.getClass(), "parent", null);
        setField(term137, term137.getClass(), "next", term139);
        setIntField(term154, term154.getClass(), "type", 0);
        setField(term154, term154.getClass(), "next", null);
        setField(term154, term154.getClass(), "first", null);
        setField(term154, term154.getClass(), "last", null);
        setField(term154, term154.getClass(), "propListHead", null);
        setIntField(term154, term154.getClass(), "sourcePosition", 0);
        setField(term154, term154.getClass(), "jsType", null);
        setField(term154, term154.getClass(), "parent", null);
        setField(term137, term137.getClass(), "first", term154);
        setIntField(term157, term157.getClass(), "type", 0);
        setField(term157, term157.getClass(), "next", null);
        setField(term157, term157.getClass(), "first", null);
        setField(term157, term157.getClass(), "last", null);
        setField(term157, term157.getClass(), "propListHead", null);
        setIntField(term157, term157.getClass(), "sourcePosition", 0);
        setField(term157, term157.getClass(), "jsType", null);
        setField(term157, term157.getClass(), "parent", null);
        setField(term137, term137.getClass(), "last", term157);
        setField(term160, term160.getClass(), "next", null);
        setIntField(term160, term160.getClass(), "type", 0);
        setIntField(term160, term160.getClass(), "intValue", 0);
        setField(term160, term160.getClass(), "objectValue", null);
        setField(term137, term137.getClass(), "propListHead", term160);
        setIntField(term137, term137.getClass(), "sourcePosition", 454281060);
        setField(term137, term137.getClass(), "jsType", null);
        setField(term137, term137.getClass(), "parent", null);
        term1133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1134 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1138 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1141 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1133, term1133.getClass(), "type", -157887805);
        setIntField(term1134, term1134.getClass(), "type", -1968847291);
        setIntField(term1135, term1135.getClass(), "type", 0);
        setField(term1135, term1135.getClass(), "next", null);
        setField(term1135, term1135.getClass(), "first", null);
        setField(term1135, term1135.getClass(), "last", null);
        setField(term1135, term1135.getClass(), "propListHead", null);
        setIntField(term1135, term1135.getClass(), "sourcePosition", 0);
        setField(term1135, term1135.getClass(), "jsType", null);
        setField(term1135, term1135.getClass(), "parent", null);
        setField(term1134, term1134.getClass(), "next", term1135);
        setIntField(term1136, term1136.getClass(), "type", 0);
        setField(term1136, term1136.getClass(), "next", null);
        setField(term1136, term1136.getClass(), "first", null);
        setField(term1136, term1136.getClass(), "last", null);
        setField(term1136, term1136.getClass(), "propListHead", null);
        setIntField(term1136, term1136.getClass(), "sourcePosition", 0);
        setField(term1136, term1136.getClass(), "jsType", null);
        setField(term1136, term1136.getClass(), "parent", null);
        setField(term1134, term1134.getClass(), "first", term1136);
        setIntField(term1137, term1137.getClass(), "type", 0);
        setField(term1137, term1137.getClass(), "next", null);
        setField(term1137, term1137.getClass(), "first", null);
        setField(term1137, term1137.getClass(), "last", null);
        setField(term1137, term1137.getClass(), "propListHead", null);
        setIntField(term1137, term1137.getClass(), "sourcePosition", 0);
        setField(term1137, term1137.getClass(), "jsType", null);
        setField(term1137, term1137.getClass(), "parent", null);
        setField(term1134, term1134.getClass(), "last", term1137);
        setField(term1138, term1138.getClass(), "next", null);
        setIntField(term1138, term1138.getClass(), "type", 0);
        setIntField(term1138, term1138.getClass(), "intValue", 0);
        setField(term1138, term1138.getClass(), "objectValue", null);
        setField(term1134, term1134.getClass(), "propListHead", term1138);
        setIntField(term1134, term1134.getClass(), "sourcePosition", 1632125673);
        setField(term1134, term1134.getClass(), "jsType", null);
        setField(term1134, term1134.getClass(), "parent", null);
        setField(term1133, term1133.getClass(), "next", term1134);
        setIntField(term1139, term1139.getClass(), "type", 0);
        setField(term1139, term1139.getClass(), "next", null);
        setField(term1139, term1139.getClass(), "first", null);
        setField(term1139, term1139.getClass(), "last", null);
        setField(term1139, term1139.getClass(), "propListHead", null);
        setIntField(term1139, term1139.getClass(), "sourcePosition", 0);
        setField(term1139, term1139.getClass(), "jsType", null);
        setField(term1139, term1139.getClass(), "parent", null);
        setField(term1133, term1133.getClass(), "first", term1139);
        setIntField(term1140, term1140.getClass(), "type", 0);
        setField(term1140, term1140.getClass(), "next", null);
        setField(term1140, term1140.getClass(), "first", null);
        setField(term1140, term1140.getClass(), "last", null);
        setField(term1140, term1140.getClass(), "propListHead", null);
        setIntField(term1140, term1140.getClass(), "sourcePosition", 0);
        setField(term1140, term1140.getClass(), "jsType", null);
        setField(term1140, term1140.getClass(), "parent", null);
        setField(term1133, term1133.getClass(), "last", term1140);
        setField(term1141, term1141.getClass(), "next", null);
        setIntField(term1141, term1141.getClass(), "type", 0);
        setIntField(term1141, term1141.getClass(), "intValue", 0);
        setField(term1141, term1141.getClass(), "objectValue", null);
        setField(term1133, term1133.getClass(), "propListHead", term1141);
        setIntField(term1133, term1133.getClass(), "sourcePosition", 454281060);
        setField(term1133, term1133.getClass(), "jsType", null);
        setField(term1133, term1133.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PureFunctionIdentifier");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.DefinitionProvider");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term137;
        Object retValue = callMethod(klass, "getCallableDefinitions", argTypes, null, args);
        assertTrue(recursiveEquals(term137, null));
        assertTrue(recursiveEquals(retValue, null));
    }

};


