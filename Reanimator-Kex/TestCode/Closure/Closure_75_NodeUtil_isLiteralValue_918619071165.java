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
import java.lang.Boolean;

public class NodeUtil_isLiteralValue_918619071165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290;
     Object term317;
     Object term7147;

    public NodeUtil_isLiteralValue_918619071165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term297 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term300 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term303 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term313 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term290, term290.getClass(), "type", -1801760683);
        setIntField(term292, term292.getClass(), "type", -893623680);
        setIntField(term294, term294.getClass(), "type", 0);
        setField(term294, term294.getClass(), "next", null);
        setField(term294, term294.getClass(), "first", null);
        setField(term294, term294.getClass(), "last", null);
        setField(term294, term294.getClass(), "propListHead", null);
        setIntField(term294, term294.getClass(), "sourcePosition", 0);
        setField(term294, term294.getClass(), "jsType", null);
        setField(term294, term294.getClass(), "parent", null);
        setField(term292, term292.getClass(), "next", term294);
        setIntField(term297, term297.getClass(), "type", 0);
        setField(term297, term297.getClass(), "next", null);
        setField(term297, term297.getClass(), "first", null);
        setField(term297, term297.getClass(), "last", null);
        setField(term297, term297.getClass(), "propListHead", null);
        setIntField(term297, term297.getClass(), "sourcePosition", 0);
        setField(term297, term297.getClass(), "jsType", null);
        setField(term297, term297.getClass(), "parent", null);
        setField(term292, term292.getClass(), "first", term297);
        setIntField(term300, term300.getClass(), "type", 0);
        setField(term300, term300.getClass(), "next", null);
        setField(term300, term300.getClass(), "first", null);
        setField(term300, term300.getClass(), "last", null);
        setField(term300, term300.getClass(), "propListHead", null);
        setIntField(term300, term300.getClass(), "sourcePosition", 0);
        setField(term300, term300.getClass(), "jsType", null);
        setField(term300, term300.getClass(), "parent", null);
        setField(term292, term292.getClass(), "last", term300);
        setField(term303, term303.getClass(), "next", null);
        setIntField(term303, term303.getClass(), "type", 0);
        setIntField(term303, term303.getClass(), "intValue", 0);
        setField(term303, term303.getClass(), "objectValue", null);
        setField(term292, term292.getClass(), "propListHead", term303);
        setIntField(term292, term292.getClass(), "sourcePosition", 1045657203);
        setField(term292, term292.getClass(), "jsType", null);
        setField(term292, term292.getClass(), "parent", null);
        setField(term290, term290.getClass(), "next", term292);
        setIntField(term307, term307.getClass(), "type", 0);
        setField(term307, term307.getClass(), "next", null);
        setField(term307, term307.getClass(), "first", null);
        setField(term307, term307.getClass(), "last", null);
        setField(term307, term307.getClass(), "propListHead", null);
        setIntField(term307, term307.getClass(), "sourcePosition", 0);
        setField(term307, term307.getClass(), "jsType", null);
        setField(term307, term307.getClass(), "parent", null);
        setField(term290, term290.getClass(), "first", term307);
        setIntField(term310, term310.getClass(), "type", 0);
        setField(term310, term310.getClass(), "next", null);
        setField(term310, term310.getClass(), "first", null);
        setField(term310, term310.getClass(), "last", null);
        setField(term310, term310.getClass(), "propListHead", null);
        setIntField(term310, term310.getClass(), "sourcePosition", 0);
        setField(term310, term310.getClass(), "jsType", null);
        setField(term310, term310.getClass(), "parent", null);
        setField(term290, term290.getClass(), "last", term310);
        setField(term313, term313.getClass(), "next", null);
        setIntField(term313, term313.getClass(), "type", 0);
        setIntField(term313, term313.getClass(), "intValue", 0);
        setField(term313, term313.getClass(), "objectValue", null);
        setField(term290, term290.getClass(), "propListHead", term313);
        setIntField(term290, term290.getClass(), "sourcePosition", 1386130016);
        setField(term290, term290.getClass(), "jsType", null);
        setField(term290, term290.getClass(), "parent", null);
        term317 = new Boolean(false);
        term7147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7152 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7155 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7147, term7147.getClass(), "type", -1801760683);
        setIntField(term7148, term7148.getClass(), "type", -893623680);
        setIntField(term7149, term7149.getClass(), "type", 0);
        setField(term7149, term7149.getClass(), "next", null);
        setField(term7149, term7149.getClass(), "first", null);
        setField(term7149, term7149.getClass(), "last", null);
        setField(term7149, term7149.getClass(), "propListHead", null);
        setIntField(term7149, term7149.getClass(), "sourcePosition", 0);
        setField(term7149, term7149.getClass(), "jsType", null);
        setField(term7149, term7149.getClass(), "parent", null);
        setField(term7148, term7148.getClass(), "next", term7149);
        setIntField(term7150, term7150.getClass(), "type", 0);
        setField(term7150, term7150.getClass(), "next", null);
        setField(term7150, term7150.getClass(), "first", null);
        setField(term7150, term7150.getClass(), "last", null);
        setField(term7150, term7150.getClass(), "propListHead", null);
        setIntField(term7150, term7150.getClass(), "sourcePosition", 0);
        setField(term7150, term7150.getClass(), "jsType", null);
        setField(term7150, term7150.getClass(), "parent", null);
        setField(term7148, term7148.getClass(), "first", term7150);
        setIntField(term7151, term7151.getClass(), "type", 0);
        setField(term7151, term7151.getClass(), "next", null);
        setField(term7151, term7151.getClass(), "first", null);
        setField(term7151, term7151.getClass(), "last", null);
        setField(term7151, term7151.getClass(), "propListHead", null);
        setIntField(term7151, term7151.getClass(), "sourcePosition", 0);
        setField(term7151, term7151.getClass(), "jsType", null);
        setField(term7151, term7151.getClass(), "parent", null);
        setField(term7148, term7148.getClass(), "last", term7151);
        setField(term7152, term7152.getClass(), "next", null);
        setIntField(term7152, term7152.getClass(), "type", 0);
        setIntField(term7152, term7152.getClass(), "intValue", 0);
        setField(term7152, term7152.getClass(), "objectValue", null);
        setField(term7148, term7148.getClass(), "propListHead", term7152);
        setIntField(term7148, term7148.getClass(), "sourcePosition", 1045657203);
        setField(term7148, term7148.getClass(), "jsType", null);
        setField(term7148, term7148.getClass(), "parent", null);
        setField(term7147, term7147.getClass(), "next", term7148);
        setIntField(term7153, term7153.getClass(), "type", 0);
        setField(term7153, term7153.getClass(), "next", null);
        setField(term7153, term7153.getClass(), "first", null);
        setField(term7153, term7153.getClass(), "last", null);
        setField(term7153, term7153.getClass(), "propListHead", null);
        setIntField(term7153, term7153.getClass(), "sourcePosition", 0);
        setField(term7153, term7153.getClass(), "jsType", null);
        setField(term7153, term7153.getClass(), "parent", null);
        setField(term7147, term7147.getClass(), "first", term7153);
        setIntField(term7154, term7154.getClass(), "type", 0);
        setField(term7154, term7154.getClass(), "next", null);
        setField(term7154, term7154.getClass(), "first", null);
        setField(term7154, term7154.getClass(), "last", null);
        setField(term7154, term7154.getClass(), "propListHead", null);
        setIntField(term7154, term7154.getClass(), "sourcePosition", 0);
        setField(term7154, term7154.getClass(), "jsType", null);
        setField(term7154, term7154.getClass(), "parent", null);
        setField(term7147, term7147.getClass(), "last", term7154);
        setField(term7155, term7155.getClass(), "next", null);
        setIntField(term7155, term7155.getClass(), "type", 0);
        setIntField(term7155, term7155.getClass(), "intValue", 0);
        setField(term7155, term7155.getClass(), "objectValue", null);
        setField(term7147, term7147.getClass(), "propListHead", term7155);
        setIntField(term7147, term7147.getClass(), "sourcePosition", 1386130016);
        setField(term7147, term7147.getClass(), "jsType", null);
        setField(term7147, term7147.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term290;
        args[1] = term317;
        Object retValue = callMethod(klass, "isLiteralValue", argTypes, null, args);
        assertTrue(recursiveEquals(term290, term7147));
        assertTrue(recursiveEquals(term317, false));
        assertTrue(recursiveEquals(retValue, false));
    }

};


