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

public class TypeCheck_isReference_170084483876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7974;
     Object term23208;

    public TypeCheck_isReference_170084483876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7974 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7976 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7978 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7981 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7984 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7987 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7991 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7994 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7997 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term7974, term7974.getClass(), "type", 1053773809);
        setIntField(term7976, term7976.getClass(), "type", -271094506);
        setIntField(term7978, term7978.getClass(), "type", 0);
        setField(term7978, term7978.getClass(), "next", null);
        setField(term7978, term7978.getClass(), "first", null);
        setField(term7978, term7978.getClass(), "last", null);
        setField(term7978, term7978.getClass(), "propListHead", null);
        setIntField(term7978, term7978.getClass(), "sourcePosition", 0);
        setField(term7978, term7978.getClass(), "jsType", null);
        setField(term7978, term7978.getClass(), "parent", null);
        setField(term7976, term7976.getClass(), "next", term7978);
        setIntField(term7981, term7981.getClass(), "type", 0);
        setField(term7981, term7981.getClass(), "next", null);
        setField(term7981, term7981.getClass(), "first", null);
        setField(term7981, term7981.getClass(), "last", null);
        setField(term7981, term7981.getClass(), "propListHead", null);
        setIntField(term7981, term7981.getClass(), "sourcePosition", 0);
        setField(term7981, term7981.getClass(), "jsType", null);
        setField(term7981, term7981.getClass(), "parent", null);
        setField(term7976, term7976.getClass(), "first", term7981);
        setIntField(term7984, term7984.getClass(), "type", 0);
        setField(term7984, term7984.getClass(), "next", null);
        setField(term7984, term7984.getClass(), "first", null);
        setField(term7984, term7984.getClass(), "last", null);
        setField(term7984, term7984.getClass(), "propListHead", null);
        setIntField(term7984, term7984.getClass(), "sourcePosition", 0);
        setField(term7984, term7984.getClass(), "jsType", null);
        setField(term7984, term7984.getClass(), "parent", null);
        setField(term7976, term7976.getClass(), "last", term7984);
        setField(term7987, term7987.getClass(), "next", null);
        setIntField(term7987, term7987.getClass(), "type", 0);
        setIntField(term7987, term7987.getClass(), "intValue", 0);
        setField(term7987, term7987.getClass(), "objectValue", null);
        setField(term7976, term7976.getClass(), "propListHead", term7987);
        setIntField(term7976, term7976.getClass(), "sourcePosition", -431440129);
        setField(term7976, term7976.getClass(), "jsType", null);
        setField(term7976, term7976.getClass(), "parent", null);
        setField(term7974, term7974.getClass(), "next", term7976);
        setIntField(term7991, term7991.getClass(), "type", 0);
        setField(term7991, term7991.getClass(), "next", null);
        setField(term7991, term7991.getClass(), "first", null);
        setField(term7991, term7991.getClass(), "last", null);
        setField(term7991, term7991.getClass(), "propListHead", null);
        setIntField(term7991, term7991.getClass(), "sourcePosition", 0);
        setField(term7991, term7991.getClass(), "jsType", null);
        setField(term7991, term7991.getClass(), "parent", null);
        setField(term7974, term7974.getClass(), "first", term7991);
        setIntField(term7994, term7994.getClass(), "type", 0);
        setField(term7994, term7994.getClass(), "next", null);
        setField(term7994, term7994.getClass(), "first", null);
        setField(term7994, term7994.getClass(), "last", null);
        setField(term7994, term7994.getClass(), "propListHead", null);
        setIntField(term7994, term7994.getClass(), "sourcePosition", 0);
        setField(term7994, term7994.getClass(), "jsType", null);
        setField(term7994, term7994.getClass(), "parent", null);
        setField(term7974, term7974.getClass(), "last", term7994);
        setField(term7997, term7997.getClass(), "next", null);
        setIntField(term7997, term7997.getClass(), "type", 0);
        setIntField(term7997, term7997.getClass(), "intValue", 0);
        setField(term7997, term7997.getClass(), "objectValue", null);
        setField(term7974, term7974.getClass(), "propListHead", term7997);
        setIntField(term7974, term7974.getClass(), "sourcePosition", -763576148);
        setField(term7974, term7974.getClass(), "jsType", null);
        setField(term7974, term7974.getClass(), "parent", null);
        term23208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23209 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23211 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23213 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term23214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23215 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23216 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term23208, term23208.getClass(), "type", 1053773809);
        setIntField(term23209, term23209.getClass(), "type", -271094506);
        setIntField(term23210, term23210.getClass(), "type", 0);
        setField(term23210, term23210.getClass(), "next", null);
        setField(term23210, term23210.getClass(), "first", null);
        setField(term23210, term23210.getClass(), "last", null);
        setField(term23210, term23210.getClass(), "propListHead", null);
        setIntField(term23210, term23210.getClass(), "sourcePosition", 0);
        setField(term23210, term23210.getClass(), "jsType", null);
        setField(term23210, term23210.getClass(), "parent", null);
        setField(term23209, term23209.getClass(), "next", term23210);
        setIntField(term23211, term23211.getClass(), "type", 0);
        setField(term23211, term23211.getClass(), "next", null);
        setField(term23211, term23211.getClass(), "first", null);
        setField(term23211, term23211.getClass(), "last", null);
        setField(term23211, term23211.getClass(), "propListHead", null);
        setIntField(term23211, term23211.getClass(), "sourcePosition", 0);
        setField(term23211, term23211.getClass(), "jsType", null);
        setField(term23211, term23211.getClass(), "parent", null);
        setField(term23209, term23209.getClass(), "first", term23211);
        setIntField(term23212, term23212.getClass(), "type", 0);
        setField(term23212, term23212.getClass(), "next", null);
        setField(term23212, term23212.getClass(), "first", null);
        setField(term23212, term23212.getClass(), "last", null);
        setField(term23212, term23212.getClass(), "propListHead", null);
        setIntField(term23212, term23212.getClass(), "sourcePosition", 0);
        setField(term23212, term23212.getClass(), "jsType", null);
        setField(term23212, term23212.getClass(), "parent", null);
        setField(term23209, term23209.getClass(), "last", term23212);
        setField(term23213, term23213.getClass(), "next", null);
        setIntField(term23213, term23213.getClass(), "type", 0);
        setIntField(term23213, term23213.getClass(), "intValue", 0);
        setField(term23213, term23213.getClass(), "objectValue", null);
        setField(term23209, term23209.getClass(), "propListHead", term23213);
        setIntField(term23209, term23209.getClass(), "sourcePosition", -431440129);
        setField(term23209, term23209.getClass(), "jsType", null);
        setField(term23209, term23209.getClass(), "parent", null);
        setField(term23208, term23208.getClass(), "next", term23209);
        setIntField(term23214, term23214.getClass(), "type", 0);
        setField(term23214, term23214.getClass(), "next", null);
        setField(term23214, term23214.getClass(), "first", null);
        setField(term23214, term23214.getClass(), "last", null);
        setField(term23214, term23214.getClass(), "propListHead", null);
        setIntField(term23214, term23214.getClass(), "sourcePosition", 0);
        setField(term23214, term23214.getClass(), "jsType", null);
        setField(term23214, term23214.getClass(), "parent", null);
        setField(term23208, term23208.getClass(), "first", term23214);
        setIntField(term23215, term23215.getClass(), "type", 0);
        setField(term23215, term23215.getClass(), "next", null);
        setField(term23215, term23215.getClass(), "first", null);
        setField(term23215, term23215.getClass(), "last", null);
        setField(term23215, term23215.getClass(), "propListHead", null);
        setIntField(term23215, term23215.getClass(), "sourcePosition", 0);
        setField(term23215, term23215.getClass(), "jsType", null);
        setField(term23215, term23215.getClass(), "parent", null);
        setField(term23208, term23208.getClass(), "last", term23215);
        setField(term23216, term23216.getClass(), "next", null);
        setIntField(term23216, term23216.getClass(), "type", 0);
        setIntField(term23216, term23216.getClass(), "intValue", 0);
        setField(term23216, term23216.getClass(), "objectValue", null);
        setField(term23208, term23208.getClass(), "propListHead", term23216);
        setIntField(term23208, term23208.getClass(), "sourcePosition", -763576148);
        setField(term23208, term23208.getClass(), "jsType", null);
        setField(term23208, term23208.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term7974;
        Object retValue = callMethod(klass, "isReference", argTypes, null, args);
        assertTrue(recursiveEquals(term7974, term23208));
        assertTrue(recursiveEquals(retValue, false));
    }

};


