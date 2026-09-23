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
import java.util.HashMap;
import java.lang.Object;

public class CodeGenerator_addAllSiblings_124279642254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7275;
     Object term7288;

    public CodeGenerator_addAllSiblings_124279642254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7276 = new HashMap();
        term7275 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term7275, term7275.getClass(), "ESCAPED_JS_STRINGS", term7276);
        setField(term7275, term7275.getClass(), "cc", null);
        setField(term7275, term7275.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term7275, term7275.getClass(), "preferSingleQuotes", true);
        setBooleanField(term7275, term7275.getClass(), "trustedStrings", false);
        term7288 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7290 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7292 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7294 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7296 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7299 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7303 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7310 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7288, term7288.getClass(), "type", 568954359);
        setIntField(term7290, term7290.getClass(), "type", 53410913);
        setIntField(term7292, term7292.getClass(), "type", -375014958);
        setIntField(term7294, term7294.getClass(), "type", 1107176718);
        setIntField(term7296, term7296.getClass(), "type", 480137250);
        setField(term7296, term7296.getClass(), "next", null);
        setField(term7296, term7296.getClass(), "first", null);
        setField(term7296, term7296.getClass(), "last", null);
        setField(term7296, term7296.getClass(), "propListHead", null);
        setIntField(term7296, term7296.getClass(), "sourcePosition", 0);
        setField(term7296, term7296.getClass(), "jsType", null);
        setField(term7296, term7296.getClass(), "parent", null);
        setField(term7294, term7294.getClass(), "next", term7296);
        setIntField(term7299, term7299.getClass(), "type", -341152642);
        setField(term7299, term7299.getClass(), "next", null);
        setField(term7299, term7299.getClass(), "first", null);
        setField(term7299, term7299.getClass(), "last", term7296);
        setField(term7299, term7299.getClass(), "propListHead", null);
        setIntField(term7299, term7299.getClass(), "sourcePosition", 0);
        setField(term7299, term7299.getClass(), "jsType", null);
        setField(term7299, term7299.getClass(), "parent", null);
        setField(term7294, term7294.getClass(), "first", term7299);
        setField(term7294, term7294.getClass(), "last", term7292);
        setField(term7294, term7294.getClass(), "propListHead", null);
        setIntField(term7294, term7294.getClass(), "sourcePosition", 0);
        setField(term7294, term7294.getClass(), "jsType", null);
        setField(term7294, term7294.getClass(), "parent", null);
        setField(term7292, term7292.getClass(), "next", term7294);
        setField(term7292, term7292.getClass(), "first", term7296);
        setIntField(term7303, term7303.getClass(), "type", 538259104);
        setIntField(term7305, term7305.getClass(), "type", 96566506);
        setField(term7305, term7305.getClass(), "next", null);
        setField(term7305, term7305.getClass(), "first", term7299);
        setField(term7305, term7305.getClass(), "last", term7294);
        setField(term7305, term7305.getClass(), "propListHead", null);
        setIntField(term7305, term7305.getClass(), "sourcePosition", 0);
        setField(term7305, term7305.getClass(), "jsType", null);
        setField(term7305, term7305.getClass(), "parent", null);
        setField(term7303, term7303.getClass(), "next", term7305);
        setField(term7303, term7303.getClass(), "first", term7290);
        setField(term7303, term7303.getClass(), "last", term7290);
        setField(term7303, term7303.getClass(), "propListHead", null);
        setIntField(term7303, term7303.getClass(), "sourcePosition", 0);
        setField(term7303, term7303.getClass(), "jsType", null);
        setField(term7303, term7303.getClass(), "parent", null);
        setField(term7292, term7292.getClass(), "last", term7303);
        setField(term7292, term7292.getClass(), "propListHead", null);
        setIntField(term7292, term7292.getClass(), "sourcePosition", 0);
        setField(term7292, term7292.getClass(), "jsType", null);
        setField(term7292, term7292.getClass(), "parent", null);
        setField(term7290, term7290.getClass(), "next", term7292);
        setIntField(term7310, term7310.getClass(), "type", -343325701);
        setField(term7310, term7310.getClass(), "next", term7303);
        setField(term7310, term7310.getClass(), "first", term7305);
        setField(term7310, term7310.getClass(), "last", term7288);
        setField(term7310, term7310.getClass(), "propListHead", null);
        setIntField(term7310, term7310.getClass(), "sourcePosition", 0);
        setField(term7310, term7310.getClass(), "jsType", null);
        setField(term7310, term7310.getClass(), "parent", null);
        setField(term7290, term7290.getClass(), "first", term7310);
        setField(term7290, term7290.getClass(), "last", term7310);
        setField(term7290, term7290.getClass(), "propListHead", null);
        setIntField(term7290, term7290.getClass(), "sourcePosition", 0);
        setField(term7290, term7290.getClass(), "jsType", null);
        setField(term7290, term7290.getClass(), "parent", null);
        setField(term7288, term7288.getClass(), "next", term7290);
        setField(term7288, term7288.getClass(), "first", term7294);
        setField(term7288, term7288.getClass(), "last", term7296);
        setField(term7288, term7288.getClass(), "propListHead", null);
        setIntField(term7288, term7288.getClass(), "sourcePosition", 0);
        setField(term7288, term7288.getClass(), "jsType", null);
        setField(term7288, term7288.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term7288;
        try {
            callMethod(klass, "addAllSiblings", argTypes, term7275, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


