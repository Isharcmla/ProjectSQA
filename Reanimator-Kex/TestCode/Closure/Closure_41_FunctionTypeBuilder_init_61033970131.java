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
import java.util.HashMap;

public class FunctionTypeBuilder_init_61033970131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term52;

    public FunctionTypeBuilder_init_61033970131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term28 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term30 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term35 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term13, term13.getClass(), "type", 568599855);
        setIntField(term15, term15.getClass(), "type", 1162663216);
        setIntField(term17, term17.getClass(), "type", 1484323161);
        setIntField(term19, term19.getClass(), "type", 391863371);
        setIntField(term21, term21.getClass(), "type", -1922583790);
        setField(term21, term21.getClass(), "next", null);
        setField(term21, term21.getClass(), "first", null);
        setField(term21, term21.getClass(), "last", null);
        setField(term21, term21.getClass(), "propListHead", null);
        setIntField(term21, term21.getClass(), "sourcePosition", 0);
        setField(term21, term21.getClass(), "jsType", null);
        setField(term21, term21.getClass(), "parent", null);
        setField(term19, term19.getClass(), "next", term21);
        setIntField(term24, term24.getClass(), "type", -616727354);
        setField(term24, term24.getClass(), "next", null);
        setField(term24, term24.getClass(), "first", null);
        setField(term24, term24.getClass(), "last", term21);
        setField(term24, term24.getClass(), "propListHead", null);
        setIntField(term24, term24.getClass(), "sourcePosition", 0);
        setField(term24, term24.getClass(), "jsType", null);
        setField(term24, term24.getClass(), "parent", null);
        setField(term19, term19.getClass(), "first", term24);
        setField(term19, term19.getClass(), "last", term17);
        setField(term19, term19.getClass(), "propListHead", null);
        setIntField(term19, term19.getClass(), "sourcePosition", 0);
        setField(term19, term19.getClass(), "jsType", null);
        setField(term19, term19.getClass(), "parent", null);
        setField(term17, term17.getClass(), "next", term19);
        setField(term17, term17.getClass(), "first", term21);
        setIntField(term28, term28.getClass(), "type", -2038273078);
        setIntField(term30, term30.getClass(), "type", 1227103734);
        setField(term30, term30.getClass(), "next", null);
        setField(term30, term30.getClass(), "first", term24);
        setField(term30, term30.getClass(), "last", term19);
        setField(term30, term30.getClass(), "propListHead", null);
        setIntField(term30, term30.getClass(), "sourcePosition", 0);
        setField(term30, term30.getClass(), "jsType", null);
        setField(term30, term30.getClass(), "parent", null);
        setField(term28, term28.getClass(), "next", term30);
        setField(term28, term28.getClass(), "first", term15);
        setField(term28, term28.getClass(), "last", term15);
        setField(term28, term28.getClass(), "propListHead", null);
        setIntField(term28, term28.getClass(), "sourcePosition", 0);
        setField(term28, term28.getClass(), "jsType", null);
        setField(term28, term28.getClass(), "parent", null);
        setField(term17, term17.getClass(), "last", term28);
        setField(term17, term17.getClass(), "propListHead", null);
        setIntField(term17, term17.getClass(), "sourcePosition", 0);
        setField(term17, term17.getClass(), "jsType", null);
        setField(term17, term17.getClass(), "parent", null);
        setField(term15, term15.getClass(), "next", term17);
        setIntField(term35, term35.getClass(), "type", -1339778481);
        setField(term35, term35.getClass(), "next", term28);
        setField(term35, term35.getClass(), "first", term30);
        setField(term35, term35.getClass(), "last", term13);
        setField(term35, term35.getClass(), "propListHead", null);
        setIntField(term35, term35.getClass(), "sourcePosition", 0);
        setField(term35, term35.getClass(), "jsType", null);
        setField(term35, term35.getClass(), "parent", null);
        setField(term15, term15.getClass(), "first", term35);
        setField(term15, term15.getClass(), "last", term35);
        setField(term15, term15.getClass(), "propListHead", null);
        setIntField(term15, term15.getClass(), "sourcePosition", 0);
        setField(term15, term15.getClass(), "jsType", null);
        setField(term15, term15.getClass(), "parent", null);
        setField(term13, term13.getClass(), "next", term15);
        setField(term13, term13.getClass(), "first", term19);
        setField(term13, term13.getClass(), "last", term21);
        setField(term13, term13.getClass(), "propListHead", null);
        setIntField(term13, term13.getClass(), "sourcePosition", 0);
        setField(term13, term13.getClass(), "jsType", null);
        setField(term13, term13.getClass(), "parent", null);
        HashMap term53 = new HashMap();
        term52 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term67 = newInstance(Class.forName("com.google.javascript.jscomp.Scope"));
        Object term71 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term73 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term77 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term80 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term83 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term87 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term89 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term94 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term96 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term52, term52.getClass(), "vars", term53);
        setField(term67, term67.getClass(), "vars", null);
        setField(term67, term67.getClass(), "parent", null);
        setIntField(term67, term67.getClass(), "depth", 0);
        setField(term67, term67.getClass(), "rootNode", null);
        setField(term67, term67.getClass(), "thisType", null);
        setBooleanField(term67, term67.getClass(), "isBottom", false);
        setField(term67, term67.getClass(), "arguments", null);
        setField(term52, term52.getClass(), "parent", term67);
        setIntField(term52, term52.getClass(), "depth", 1622346318);
        setIntField(term71, term71.getClass(), "type", 1585847225);
        setIntField(term73, term73.getClass(), "type", 597278769);
        setIntField(term75, term75.getClass(), "type", -1685132342);
        setIntField(term77, term77.getClass(), "type", -1456670397);
        setField(term77, term77.getClass(), "next", null);
        setField(term77, term77.getClass(), "first", null);
        setField(term77, term77.getClass(), "last", term77);
        setField(term77, term77.getClass(), "propListHead", null);
        setIntField(term77, term77.getClass(), "sourcePosition", 0);
        setField(term77, term77.getClass(), "jsType", null);
        setField(term77, term77.getClass(), "parent", null);
        setField(term75, term75.getClass(), "next", term77);
        setIntField(term80, term80.getClass(), "type", 0);
        setField(term80, term80.getClass(), "next", null);
        setField(term80, term80.getClass(), "first", null);
        setField(term80, term80.getClass(), "last", null);
        setField(term80, term80.getClass(), "propListHead", null);
        setIntField(term80, term80.getClass(), "sourcePosition", 0);
        setField(term80, term80.getClass(), "jsType", null);
        setField(term80, term80.getClass(), "parent", null);
        setField(term75, term75.getClass(), "first", term80);
        setIntField(term83, term83.getClass(), "type", 1725571209);
        setField(term83, term83.getClass(), "next", null);
        setField(term83, term83.getClass(), "first", term73);
        setField(term83, term83.getClass(), "last", null);
        setField(term83, term83.getClass(), "propListHead", null);
        setIntField(term83, term83.getClass(), "sourcePosition", 0);
        setField(term83, term83.getClass(), "jsType", null);
        setField(term83, term83.getClass(), "parent", null);
        setField(term75, term75.getClass(), "last", term83);
        setField(term75, term75.getClass(), "propListHead", null);
        setIntField(term75, term75.getClass(), "sourcePosition", 0);
        setField(term75, term75.getClass(), "jsType", null);
        setField(term75, term75.getClass(), "parent", null);
        setField(term73, term73.getClass(), "next", term75);
        setField(term73, term73.getClass(), "first", term73);
        setIntField(term87, term87.getClass(), "type", -883034806);
        setField(term87, term87.getClass(), "next", term71);
        setIntField(term89, term89.getClass(), "type", 0);
        setField(term89, term89.getClass(), "next", null);
        setField(term89, term89.getClass(), "first", null);
        setField(term89, term89.getClass(), "last", null);
        setField(term89, term89.getClass(), "propListHead", null);
        setIntField(term89, term89.getClass(), "sourcePosition", 0);
        setField(term89, term89.getClass(), "jsType", null);
        setField(term89, term89.getClass(), "parent", null);
        setField(term87, term87.getClass(), "first", term89);
        setField(term87, term87.getClass(), "last", term77);
        setField(term87, term87.getClass(), "propListHead", null);
        setIntField(term87, term87.getClass(), "sourcePosition", 0);
        setField(term87, term87.getClass(), "jsType", null);
        setField(term87, term87.getClass(), "parent", null);
        setField(term73, term73.getClass(), "last", term87);
        setField(term73, term73.getClass(), "propListHead", null);
        setIntField(term73, term73.getClass(), "sourcePosition", 0);
        setField(term73, term73.getClass(), "jsType", null);
        setField(term73, term73.getClass(), "parent", null);
        setField(term71, term71.getClass(), "next", term73);
        setIntField(term94, term94.getClass(), "type", -522618178);
        setIntField(term96, term96.getClass(), "type", 1134449235);
        setField(term96, term96.getClass(), "next", term87);
        setField(term96, term96.getClass(), "first", term77);
        setField(term96, term96.getClass(), "last", term71);
        setField(term96, term96.getClass(), "propListHead", null);
        setIntField(term96, term96.getClass(), "sourcePosition", 0);
        setField(term96, term96.getClass(), "jsType", null);
        setField(term96, term96.getClass(), "parent", null);
        setField(term94, term94.getClass(), "next", term96);
        setField(term94, term94.getClass(), "first", term89);
        setField(term94, term94.getClass(), "last", term77);
        setField(term94, term94.getClass(), "propListHead", null);
        setIntField(term94, term94.getClass(), "sourcePosition", 0);
        setField(term94, term94.getClass(), "jsType", null);
        setField(term94, term94.getClass(), "parent", null);
        setField(term71, term71.getClass(), "first", term94);
        setField(term71, term71.getClass(), "last", term94);
        setField(term71, term71.getClass(), "propListHead", null);
        setIntField(term71, term71.getClass(), "sourcePosition", 0);
        setField(term71, term71.getClass(), "jsType", null);
        setField(term71, term71.getClass(), "parent", null);
        setField(term52, term52.getClass(), "rootNode", term71);
        setField(term52, term52.getClass(), "thisType", null);
        setBooleanField(term52, term52.getClass(), "isBottom", false);
        setField(term52, term52.getClass(), "arguments", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionTypeBuilder");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("com.google.javascript.jscomp.Scope");
        Object[] args = new Object[5];
        args[0] = "PAEBtnZtTD";
        args[1] = null;
        args[2] = term13;
        args[3] = "sjlJAEtRrb";
        args[4] = term52;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


