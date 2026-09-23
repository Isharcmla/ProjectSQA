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

public class Normalize_process_16932396666 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27;
     Object term29;
     Object term56;

    public Normalize_process_16932396666() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term27 = newInstance(Class.forName("com.google.javascript.jscomp.Normalize"));
        setField(term27, term27.getClass(), "compiler", null);
        setBooleanField(term27, term27.getClass(), "assertOnChange", false);
        term29 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term31 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term33 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term39 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term42 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term46 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term29, term29.getClass(), "type", 391863371);
        setIntField(term31, term31.getClass(), "type", -2038273078);
        setIntField(term33, term33.getClass(), "type", 0);
        setField(term33, term33.getClass(), "next", null);
        setField(term33, term33.getClass(), "first", null);
        setField(term33, term33.getClass(), "last", null);
        setField(term33, term33.getClass(), "propListHead", null);
        setIntField(term33, term33.getClass(), "sourcePosition", 0);
        setField(term33, term33.getClass(), "jsType", null);
        setField(term33, term33.getClass(), "parent", null);
        setField(term31, term31.getClass(), "next", term33);
        setIntField(term36, term36.getClass(), "type", 0);
        setField(term36, term36.getClass(), "next", null);
        setField(term36, term36.getClass(), "first", null);
        setField(term36, term36.getClass(), "last", null);
        setField(term36, term36.getClass(), "propListHead", null);
        setIntField(term36, term36.getClass(), "sourcePosition", 0);
        setField(term36, term36.getClass(), "jsType", null);
        setField(term36, term36.getClass(), "parent", null);
        setField(term31, term31.getClass(), "first", term36);
        setIntField(term39, term39.getClass(), "type", 0);
        setField(term39, term39.getClass(), "next", null);
        setField(term39, term39.getClass(), "first", null);
        setField(term39, term39.getClass(), "last", null);
        setField(term39, term39.getClass(), "propListHead", null);
        setIntField(term39, term39.getClass(), "sourcePosition", 0);
        setField(term39, term39.getClass(), "jsType", null);
        setField(term39, term39.getClass(), "parent", null);
        setField(term31, term31.getClass(), "last", term39);
        setField(term42, term42.getClass(), "next", null);
        setIntField(term42, term42.getClass(), "type", 0);
        setIntField(term42, term42.getClass(), "intValue", 0);
        setField(term42, term42.getClass(), "objectValue", null);
        setField(term31, term31.getClass(), "propListHead", term42);
        setIntField(term31, term31.getClass(), "sourcePosition", 1725571209);
        setField(term31, term31.getClass(), "jsType", null);
        setField(term31, term31.getClass(), "parent", null);
        setField(term29, term29.getClass(), "next", term31);
        setIntField(term46, term46.getClass(), "type", 0);
        setField(term46, term46.getClass(), "next", null);
        setField(term46, term46.getClass(), "first", null);
        setField(term46, term46.getClass(), "last", null);
        setField(term46, term46.getClass(), "propListHead", null);
        setIntField(term46, term46.getClass(), "sourcePosition", 0);
        setField(term46, term46.getClass(), "jsType", null);
        setField(term46, term46.getClass(), "parent", null);
        setField(term29, term29.getClass(), "first", term46);
        setIntField(term49, term49.getClass(), "type", 0);
        setField(term49, term49.getClass(), "next", null);
        setField(term49, term49.getClass(), "first", null);
        setField(term49, term49.getClass(), "last", null);
        setField(term49, term49.getClass(), "propListHead", null);
        setIntField(term49, term49.getClass(), "sourcePosition", 0);
        setField(term49, term49.getClass(), "jsType", null);
        setField(term49, term49.getClass(), "parent", null);
        setField(term29, term29.getClass(), "last", term49);
        setField(term52, term52.getClass(), "next", null);
        setIntField(term52, term52.getClass(), "type", 0);
        setIntField(term52, term52.getClass(), "intValue", 0);
        setField(term52, term52.getClass(), "objectValue", null);
        setField(term29, term29.getClass(), "propListHead", term52);
        setIntField(term29, term29.getClass(), "sourcePosition", -522618178);
        setField(term29, term29.getClass(), "jsType", null);
        setField(term29, term29.getClass(), "parent", null);
        term56 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term60 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term63 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term66 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term69 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term73 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term79 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term56, term56.getClass(), "type", 597278769);
        setIntField(term58, term58.getClass(), "type", 1048535127);
        setIntField(term60, term60.getClass(), "type", 0);
        setField(term60, term60.getClass(), "next", null);
        setField(term60, term60.getClass(), "first", null);
        setField(term60, term60.getClass(), "last", null);
        setField(term60, term60.getClass(), "propListHead", null);
        setIntField(term60, term60.getClass(), "sourcePosition", 0);
        setField(term60, term60.getClass(), "jsType", null);
        setField(term60, term60.getClass(), "parent", null);
        setField(term58, term58.getClass(), "next", term60);
        setIntField(term63, term63.getClass(), "type", 0);
        setField(term63, term63.getClass(), "next", null);
        setField(term63, term63.getClass(), "first", null);
        setField(term63, term63.getClass(), "last", null);
        setField(term63, term63.getClass(), "propListHead", null);
        setIntField(term63, term63.getClass(), "sourcePosition", 0);
        setField(term63, term63.getClass(), "jsType", null);
        setField(term63, term63.getClass(), "parent", null);
        setField(term58, term58.getClass(), "first", term63);
        setIntField(term66, term66.getClass(), "type", 0);
        setField(term66, term66.getClass(), "next", null);
        setField(term66, term66.getClass(), "first", null);
        setField(term66, term66.getClass(), "last", null);
        setField(term66, term66.getClass(), "propListHead", null);
        setIntField(term66, term66.getClass(), "sourcePosition", 0);
        setField(term66, term66.getClass(), "jsType", null);
        setField(term66, term66.getClass(), "parent", null);
        setField(term58, term58.getClass(), "last", term66);
        setField(term69, term69.getClass(), "next", null);
        setIntField(term69, term69.getClass(), "type", 0);
        setIntField(term69, term69.getClass(), "intValue", 0);
        setField(term69, term69.getClass(), "objectValue", null);
        setField(term58, term58.getClass(), "propListHead", term69);
        setIntField(term58, term58.getClass(), "sourcePosition", -2068769794);
        setField(term58, term58.getClass(), "jsType", null);
        setField(term58, term58.getClass(), "parent", null);
        setField(term56, term56.getClass(), "next", term58);
        setIntField(term73, term73.getClass(), "type", 0);
        setField(term73, term73.getClass(), "next", null);
        setField(term73, term73.getClass(), "first", null);
        setField(term73, term73.getClass(), "last", null);
        setField(term73, term73.getClass(), "propListHead", null);
        setIntField(term73, term73.getClass(), "sourcePosition", 0);
        setField(term73, term73.getClass(), "jsType", null);
        setField(term73, term73.getClass(), "parent", null);
        setField(term56, term56.getClass(), "first", term73);
        setIntField(term76, term76.getClass(), "type", 0);
        setField(term76, term76.getClass(), "next", null);
        setField(term76, term76.getClass(), "first", null);
        setField(term76, term76.getClass(), "last", null);
        setField(term76, term76.getClass(), "propListHead", null);
        setIntField(term76, term76.getClass(), "sourcePosition", 0);
        setField(term76, term76.getClass(), "jsType", null);
        setField(term76, term76.getClass(), "parent", null);
        setField(term56, term56.getClass(), "last", term76);
        setField(term79, term79.getClass(), "next", null);
        setIntField(term79, term79.getClass(), "type", 0);
        setIntField(term79, term79.getClass(), "intValue", 0);
        setField(term79, term79.getClass(), "objectValue", null);
        setField(term56, term56.getClass(), "propListHead", term79);
        setIntField(term56, term56.getClass(), "sourcePosition", -117576464);
        setField(term56, term56.getClass(), "jsType", null);
        setField(term56, term56.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.Normalize");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term29;
        args[1] = term56;
        try {
            callMethod(klass, "process", argTypes, term27, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


