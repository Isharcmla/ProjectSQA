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
import java.lang.Error;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CodeGenerator_addList_71041360044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2027;
     Object term2028;
     Object term2055;

    public CodeGenerator_addList_71041360044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2027 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term2027, term2027.getClass(), "cc", null);
        setField(term2027, term2027.getClass(), "outputCharsetEncoder", null);
        term2028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2041 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2051 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term2028, term2028.getClass(), "type", -375014958);
        setIntField(term2030, term2030.getClass(), "type", -2015854073);
        setIntField(term2032, term2032.getClass(), "type", 0);
        setField(term2032, term2032.getClass(), "next", null);
        setField(term2032, term2032.getClass(), "first", null);
        setField(term2032, term2032.getClass(), "last", null);
        setField(term2032, term2032.getClass(), "propListHead", null);
        setIntField(term2032, term2032.getClass(), "sourcePosition", 0);
        setField(term2032, term2032.getClass(), "jsType", null);
        setField(term2032, term2032.getClass(), "parent", null);
        setField(term2030, term2030.getClass(), "next", term2032);
        setIntField(term2035, term2035.getClass(), "type", 0);
        setField(term2035, term2035.getClass(), "next", null);
        setField(term2035, term2035.getClass(), "first", null);
        setField(term2035, term2035.getClass(), "last", null);
        setField(term2035, term2035.getClass(), "propListHead", null);
        setIntField(term2035, term2035.getClass(), "sourcePosition", 0);
        setField(term2035, term2035.getClass(), "jsType", null);
        setField(term2035, term2035.getClass(), "parent", null);
        setField(term2030, term2030.getClass(), "first", term2035);
        setIntField(term2038, term2038.getClass(), "type", 0);
        setField(term2038, term2038.getClass(), "next", null);
        setField(term2038, term2038.getClass(), "first", null);
        setField(term2038, term2038.getClass(), "last", null);
        setField(term2038, term2038.getClass(), "propListHead", null);
        setIntField(term2038, term2038.getClass(), "sourcePosition", 0);
        setField(term2038, term2038.getClass(), "jsType", null);
        setField(term2038, term2038.getClass(), "parent", null);
        setField(term2030, term2030.getClass(), "last", term2038);
        setField(term2041, term2041.getClass(), "next", null);
        setIntField(term2041, term2041.getClass(), "type", 0);
        setIntField(term2041, term2041.getClass(), "intValue", 0);
        setField(term2041, term2041.getClass(), "objectValue", null);
        setField(term2030, term2030.getClass(), "propListHead", term2041);
        setIntField(term2030, term2030.getClass(), "sourcePosition", -343325701);
        setField(term2030, term2030.getClass(), "jsType", null);
        setField(term2030, term2030.getClass(), "parent", null);
        setField(term2028, term2028.getClass(), "next", term2030);
        setIntField(term2045, term2045.getClass(), "type", 0);
        setField(term2045, term2045.getClass(), "next", null);
        setField(term2045, term2045.getClass(), "first", null);
        setField(term2045, term2045.getClass(), "last", null);
        setField(term2045, term2045.getClass(), "propListHead", null);
        setIntField(term2045, term2045.getClass(), "sourcePosition", 0);
        setField(term2045, term2045.getClass(), "jsType", null);
        setField(term2045, term2045.getClass(), "parent", null);
        setField(term2028, term2028.getClass(), "first", term2045);
        setIntField(term2048, term2048.getClass(), "type", 0);
        setField(term2048, term2048.getClass(), "next", null);
        setField(term2048, term2048.getClass(), "first", null);
        setField(term2048, term2048.getClass(), "last", null);
        setField(term2048, term2048.getClass(), "propListHead", null);
        setIntField(term2048, term2048.getClass(), "sourcePosition", 0);
        setField(term2048, term2048.getClass(), "jsType", null);
        setField(term2048, term2048.getClass(), "parent", null);
        setField(term2028, term2028.getClass(), "last", term2048);
        setField(term2051, term2051.getClass(), "next", null);
        setIntField(term2051, term2051.getClass(), "type", 0);
        setIntField(term2051, term2051.getClass(), "intValue", 0);
        setField(term2051, term2051.getClass(), "objectValue", null);
        setField(term2028, term2028.getClass(), "propListHead", term2051);
        setIntField(term2028, term2028.getClass(), "sourcePosition", 107945604);
        setField(term2028, term2028.getClass(), "jsType", null);
        setField(term2028, term2028.getClass(), "parent", null);
        term2055 = (int[]) newIntArray(5);
        setIntElement(term2055, 0, -1963464809);
        setIntElement(term2055, 1, 71190297);
        setIntElement(term2055, 2, 1202361360);
        setIntElement(term2055, 3, -2015048153);
        setIntElement(term2055, 4, -2063457669);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Array.newInstance(int.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term2028;
        args[1] = term2055;
        try {
            callMethod(klass, "addList", argTypes, term2027, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


