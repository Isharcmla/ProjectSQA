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

public class CodeGenerator_add_29631458234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47;
     Object term48;

    public CodeGenerator_add_29631458234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term47, term47.getClass(), "cc", null);
        setField(term47, term47.getClass(), "outputCharsetEncoder", null);
        term48 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term52 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term58 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term61 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term65 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term68 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term71 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term48, term48.getClass(), "type", 391863371);
        setIntField(term50, term50.getClass(), "type", -2038273078);
        setIntField(term52, term52.getClass(), "type", 0);
        setField(term52, term52.getClass(), "next", null);
        setField(term52, term52.getClass(), "first", null);
        setField(term52, term52.getClass(), "last", null);
        setField(term52, term52.getClass(), "propListHead", null);
        setIntField(term52, term52.getClass(), "sourcePosition", 0);
        setField(term52, term52.getClass(), "jsType", null);
        setField(term52, term52.getClass(), "parent", null);
        setField(term50, term50.getClass(), "next", term52);
        setIntField(term55, term55.getClass(), "type", 0);
        setField(term55, term55.getClass(), "next", null);
        setField(term55, term55.getClass(), "first", null);
        setField(term55, term55.getClass(), "last", null);
        setField(term55, term55.getClass(), "propListHead", null);
        setIntField(term55, term55.getClass(), "sourcePosition", 0);
        setField(term55, term55.getClass(), "jsType", null);
        setField(term55, term55.getClass(), "parent", null);
        setField(term50, term50.getClass(), "first", term55);
        setIntField(term58, term58.getClass(), "type", 0);
        setField(term58, term58.getClass(), "next", null);
        setField(term58, term58.getClass(), "first", null);
        setField(term58, term58.getClass(), "last", null);
        setField(term58, term58.getClass(), "propListHead", null);
        setIntField(term58, term58.getClass(), "sourcePosition", 0);
        setField(term58, term58.getClass(), "jsType", null);
        setField(term58, term58.getClass(), "parent", null);
        setField(term50, term50.getClass(), "last", term58);
        setField(term61, term61.getClass(), "next", null);
        setIntField(term61, term61.getClass(), "type", 0);
        setIntField(term61, term61.getClass(), "intValue", 0);
        setField(term61, term61.getClass(), "objectValue", null);
        setField(term50, term50.getClass(), "propListHead", term61);
        setIntField(term50, term50.getClass(), "sourcePosition", 1725571209);
        setField(term50, term50.getClass(), "jsType", null);
        setField(term50, term50.getClass(), "parent", null);
        setField(term48, term48.getClass(), "next", term50);
        setIntField(term65, term65.getClass(), "type", 0);
        setField(term65, term65.getClass(), "next", null);
        setField(term65, term65.getClass(), "first", null);
        setField(term65, term65.getClass(), "last", null);
        setField(term65, term65.getClass(), "propListHead", null);
        setIntField(term65, term65.getClass(), "sourcePosition", 0);
        setField(term65, term65.getClass(), "jsType", null);
        setField(term65, term65.getClass(), "parent", null);
        setField(term48, term48.getClass(), "first", term65);
        setIntField(term68, term68.getClass(), "type", 0);
        setField(term68, term68.getClass(), "next", null);
        setField(term68, term68.getClass(), "first", null);
        setField(term68, term68.getClass(), "last", null);
        setField(term68, term68.getClass(), "propListHead", null);
        setIntField(term68, term68.getClass(), "sourcePosition", 0);
        setField(term68, term68.getClass(), "jsType", null);
        setField(term68, term68.getClass(), "parent", null);
        setField(term48, term48.getClass(), "last", term68);
        setField(term71, term71.getClass(), "next", null);
        setIntField(term71, term71.getClass(), "type", 0);
        setIntField(term71, term71.getClass(), "intValue", 0);
        setField(term71, term71.getClass(), "objectValue", null);
        setField(term48, term48.getClass(), "propListHead", term71);
        setIntField(term48, term48.getClass(), "sourcePosition", -522618178);
        setField(term48, term48.getClass(), "jsType", null);
        setField(term48, term48.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term48;
        try {
            callMethod(klass, "add", argTypes, term47, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


