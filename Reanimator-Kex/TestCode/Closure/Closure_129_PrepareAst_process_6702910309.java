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

public class PrepareAst_process_6702910309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;
     Object term7;
     Object term34;

    public PrepareAst_process_6702910309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5 = newInstance(Class.forName("com.google.javascript.jscomp.PrepareAst"));
        setField(term5, term5.getClass(), "compiler", null);
        setBooleanField(term5, term5.getClass(), "checkOnly", false);
        term7 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term13 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term22 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term24 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term29 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7, term7.getClass(), "type", 568599855);
        setIntField(term9, term9.getClass(), "type", 1162663216);
        setIntField(term11, term11.getClass(), "type", 1484323161);
        setIntField(term13, term13.getClass(), "type", 391863371);
        setIntField(term15, term15.getClass(), "type", -1922583790);
        setField(term15, term15.getClass(), "next", null);
        setField(term15, term15.getClass(), "first", null);
        setField(term15, term15.getClass(), "last", null);
        setField(term15, term15.getClass(), "propListHead", null);
        setIntField(term15, term15.getClass(), "sourcePosition", 0);
        setField(term15, term15.getClass(), "jsType", null);
        setField(term15, term15.getClass(), "parent", null);
        setField(term13, term13.getClass(), "next", term15);
        setIntField(term18, term18.getClass(), "type", -616727354);
        setField(term18, term18.getClass(), "next", null);
        setField(term18, term18.getClass(), "first", null);
        setField(term18, term18.getClass(), "last", term15);
        setField(term18, term18.getClass(), "propListHead", null);
        setIntField(term18, term18.getClass(), "sourcePosition", 0);
        setField(term18, term18.getClass(), "jsType", null);
        setField(term18, term18.getClass(), "parent", null);
        setField(term13, term13.getClass(), "first", term18);
        setField(term13, term13.getClass(), "last", term11);
        setField(term13, term13.getClass(), "propListHead", null);
        setIntField(term13, term13.getClass(), "sourcePosition", 0);
        setField(term13, term13.getClass(), "jsType", null);
        setField(term13, term13.getClass(), "parent", null);
        setField(term11, term11.getClass(), "next", term13);
        setField(term11, term11.getClass(), "first", term15);
        setIntField(term22, term22.getClass(), "type", -2038273078);
        setIntField(term24, term24.getClass(), "type", 1227103734);
        setField(term24, term24.getClass(), "next", null);
        setField(term24, term24.getClass(), "first", term18);
        setField(term24, term24.getClass(), "last", term13);
        setField(term24, term24.getClass(), "propListHead", null);
        setIntField(term24, term24.getClass(), "sourcePosition", 0);
        setField(term24, term24.getClass(), "jsType", null);
        setField(term24, term24.getClass(), "parent", null);
        setField(term22, term22.getClass(), "next", term24);
        setField(term22, term22.getClass(), "first", term9);
        setField(term22, term22.getClass(), "last", term9);
        setField(term22, term22.getClass(), "propListHead", null);
        setIntField(term22, term22.getClass(), "sourcePosition", 0);
        setField(term22, term22.getClass(), "jsType", null);
        setField(term22, term22.getClass(), "parent", null);
        setField(term11, term11.getClass(), "last", term22);
        setField(term11, term11.getClass(), "propListHead", null);
        setIntField(term11, term11.getClass(), "sourcePosition", 0);
        setField(term11, term11.getClass(), "jsType", null);
        setField(term11, term11.getClass(), "parent", null);
        setField(term9, term9.getClass(), "next", term11);
        setIntField(term29, term29.getClass(), "type", -1339778481);
        setField(term29, term29.getClass(), "next", term22);
        setField(term29, term29.getClass(), "first", term24);
        setField(term29, term29.getClass(), "last", term7);
        setField(term29, term29.getClass(), "propListHead", null);
        setIntField(term29, term29.getClass(), "sourcePosition", 0);
        setField(term29, term29.getClass(), "jsType", null);
        setField(term29, term29.getClass(), "parent", null);
        setField(term9, term9.getClass(), "first", term29);
        setField(term9, term9.getClass(), "last", term29);
        setField(term9, term9.getClass(), "propListHead", null);
        setIntField(term9, term9.getClass(), "sourcePosition", 0);
        setField(term9, term9.getClass(), "jsType", null);
        setField(term9, term9.getClass(), "parent", null);
        setField(term7, term7.getClass(), "next", term9);
        setField(term7, term7.getClass(), "first", term13);
        setField(term7, term7.getClass(), "last", term15);
        setField(term7, term7.getClass(), "propListHead", null);
        setIntField(term7, term7.getClass(), "sourcePosition", 0);
        setField(term7, term7.getClass(), "jsType", null);
        setField(term7, term7.getClass(), "parent", null);
        term34 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term38 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term45 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term34, term34.getClass(), "type", 1725571209);
        setIntField(term36, term36.getClass(), "type", -522618178);
        setIntField(term38, term38.getClass(), "type", 1134449235);
        setIntField(term40, term40.getClass(), "type", -883034806);
        setIntField(term42, term42.getClass(), "type", 1585847225);
        setField(term42, term42.getClass(), "next", null);
        setField(term42, term42.getClass(), "first", null);
        setField(term42, term42.getClass(), "last", null);
        setField(term42, term42.getClass(), "propListHead", null);
        setIntField(term42, term42.getClass(), "sourcePosition", 0);
        setField(term42, term42.getClass(), "jsType", null);
        setField(term42, term42.getClass(), "parent", null);
        setField(term40, term40.getClass(), "next", term42);
        setIntField(term45, term45.getClass(), "type", 597278769);
        setField(term45, term45.getClass(), "next", null);
        setField(term45, term45.getClass(), "first", null);
        setField(term45, term45.getClass(), "last", term42);
        setField(term45, term45.getClass(), "propListHead", null);
        setIntField(term45, term45.getClass(), "sourcePosition", 0);
        setField(term45, term45.getClass(), "jsType", null);
        setField(term45, term45.getClass(), "parent", null);
        setField(term40, term40.getClass(), "first", term45);
        setField(term40, term40.getClass(), "last", term38);
        setField(term40, term40.getClass(), "propListHead", null);
        setIntField(term40, term40.getClass(), "sourcePosition", 0);
        setField(term40, term40.getClass(), "jsType", null);
        setField(term40, term40.getClass(), "parent", null);
        setField(term38, term38.getClass(), "next", term40);
        setField(term38, term38.getClass(), "first", term42);
        setIntField(term49, term49.getClass(), "type", -1456670397);
        setIntField(term51, term51.getClass(), "type", 1622346318);
        setField(term51, term51.getClass(), "next", null);
        setField(term51, term51.getClass(), "first", term45);
        setField(term51, term51.getClass(), "last", term40);
        setField(term51, term51.getClass(), "propListHead", null);
        setIntField(term51, term51.getClass(), "sourcePosition", 0);
        setField(term51, term51.getClass(), "jsType", null);
        setField(term51, term51.getClass(), "parent", null);
        setField(term49, term49.getClass(), "next", term51);
        setField(term49, term49.getClass(), "first", term36);
        setField(term49, term49.getClass(), "last", term36);
        setField(term49, term49.getClass(), "propListHead", null);
        setIntField(term49, term49.getClass(), "sourcePosition", 0);
        setField(term49, term49.getClass(), "jsType", null);
        setField(term49, term49.getClass(), "parent", null);
        setField(term38, term38.getClass(), "last", term49);
        setField(term38, term38.getClass(), "propListHead", null);
        setIntField(term38, term38.getClass(), "sourcePosition", 0);
        setField(term38, term38.getClass(), "jsType", null);
        setField(term38, term38.getClass(), "parent", null);
        setField(term36, term36.getClass(), "next", term38);
        setIntField(term56, term56.getClass(), "type", 1048535127);
        setField(term56, term56.getClass(), "next", term49);
        setField(term56, term56.getClass(), "first", term51);
        setField(term56, term56.getClass(), "last", term34);
        setField(term56, term56.getClass(), "propListHead", null);
        setIntField(term56, term56.getClass(), "sourcePosition", 0);
        setField(term56, term56.getClass(), "jsType", null);
        setField(term56, term56.getClass(), "parent", null);
        setField(term36, term36.getClass(), "first", term56);
        setField(term36, term36.getClass(), "last", term56);
        setField(term36, term36.getClass(), "propListHead", null);
        setIntField(term36, term36.getClass(), "sourcePosition", 0);
        setField(term36, term36.getClass(), "jsType", null);
        setField(term36, term36.getClass(), "parent", null);
        setField(term34, term34.getClass(), "next", term36);
        setField(term34, term34.getClass(), "first", term40);
        setField(term34, term34.getClass(), "last", term42);
        setField(term34, term34.getClass(), "propListHead", null);
        setIntField(term34, term34.getClass(), "sourcePosition", 0);
        setField(term34, term34.getClass(), "jsType", null);
        setField(term34, term34.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PrepareAst");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term7;
        args[1] = term34;
        try {
            callMethod(klass, "process", argTypes, term5, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


