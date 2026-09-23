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

public class TypeCheck_isReference_170084483875 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8305;
     Object term23519;

    public TypeCheck_isReference_170084483875() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8305 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8309 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8312 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8315 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8318 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term8322 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8325 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8328 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term8305, term8305.getClass(), "type", 1431951992);
        setIntField(term8307, term8307.getClass(), "type", -1212399479);
        setIntField(term8309, term8309.getClass(), "type", 0);
        setField(term8309, term8309.getClass(), "next", null);
        setField(term8309, term8309.getClass(), "first", null);
        setField(term8309, term8309.getClass(), "last", null);
        setField(term8309, term8309.getClass(), "propListHead", null);
        setIntField(term8309, term8309.getClass(), "sourcePosition", 0);
        setField(term8309, term8309.getClass(), "jsType", null);
        setField(term8309, term8309.getClass(), "parent", null);
        setField(term8307, term8307.getClass(), "next", term8309);
        setIntField(term8312, term8312.getClass(), "type", 0);
        setField(term8312, term8312.getClass(), "next", null);
        setField(term8312, term8312.getClass(), "first", null);
        setField(term8312, term8312.getClass(), "last", null);
        setField(term8312, term8312.getClass(), "propListHead", null);
        setIntField(term8312, term8312.getClass(), "sourcePosition", 0);
        setField(term8312, term8312.getClass(), "jsType", null);
        setField(term8312, term8312.getClass(), "parent", null);
        setField(term8307, term8307.getClass(), "first", term8312);
        setIntField(term8315, term8315.getClass(), "type", 0);
        setField(term8315, term8315.getClass(), "next", null);
        setField(term8315, term8315.getClass(), "first", null);
        setField(term8315, term8315.getClass(), "last", null);
        setField(term8315, term8315.getClass(), "propListHead", null);
        setIntField(term8315, term8315.getClass(), "sourcePosition", 0);
        setField(term8315, term8315.getClass(), "jsType", null);
        setField(term8315, term8315.getClass(), "parent", null);
        setField(term8307, term8307.getClass(), "last", term8315);
        setField(term8318, term8318.getClass(), "next", null);
        setIntField(term8318, term8318.getClass(), "type", 0);
        setIntField(term8318, term8318.getClass(), "intValue", 0);
        setField(term8318, term8318.getClass(), "objectValue", null);
        setField(term8307, term8307.getClass(), "propListHead", term8318);
        setIntField(term8307, term8307.getClass(), "sourcePosition", -1281083262);
        setField(term8307, term8307.getClass(), "jsType", null);
        setField(term8307, term8307.getClass(), "parent", null);
        setField(term8305, term8305.getClass(), "next", term8307);
        setIntField(term8322, term8322.getClass(), "type", 0);
        setField(term8322, term8322.getClass(), "next", null);
        setField(term8322, term8322.getClass(), "first", null);
        setField(term8322, term8322.getClass(), "last", null);
        setField(term8322, term8322.getClass(), "propListHead", null);
        setIntField(term8322, term8322.getClass(), "sourcePosition", 0);
        setField(term8322, term8322.getClass(), "jsType", null);
        setField(term8322, term8322.getClass(), "parent", null);
        setField(term8305, term8305.getClass(), "first", term8322);
        setIntField(term8325, term8325.getClass(), "type", 0);
        setField(term8325, term8325.getClass(), "next", null);
        setField(term8325, term8325.getClass(), "first", null);
        setField(term8325, term8325.getClass(), "last", null);
        setField(term8325, term8325.getClass(), "propListHead", null);
        setIntField(term8325, term8325.getClass(), "sourcePosition", 0);
        setField(term8325, term8325.getClass(), "jsType", null);
        setField(term8325, term8325.getClass(), "parent", null);
        setField(term8305, term8305.getClass(), "last", term8325);
        setField(term8328, term8328.getClass(), "next", null);
        setIntField(term8328, term8328.getClass(), "type", 0);
        setIntField(term8328, term8328.getClass(), "intValue", 0);
        setField(term8328, term8328.getClass(), "objectValue", null);
        setField(term8305, term8305.getClass(), "propListHead", term8328);
        setIntField(term8305, term8305.getClass(), "sourcePosition", 1059930704);
        setField(term8305, term8305.getClass(), "jsType", null);
        setField(term8305, term8305.getClass(), "parent", null);
        term23519 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23522 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23523 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23524 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term23525 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23526 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23527 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term23519, term23519.getClass(), "type", 1431951992);
        setIntField(term23520, term23520.getClass(), "type", -1212399479);
        setIntField(term23521, term23521.getClass(), "type", 0);
        setField(term23521, term23521.getClass(), "next", null);
        setField(term23521, term23521.getClass(), "first", null);
        setField(term23521, term23521.getClass(), "last", null);
        setField(term23521, term23521.getClass(), "propListHead", null);
        setIntField(term23521, term23521.getClass(), "sourcePosition", 0);
        setField(term23521, term23521.getClass(), "jsType", null);
        setField(term23521, term23521.getClass(), "parent", null);
        setField(term23520, term23520.getClass(), "next", term23521);
        setIntField(term23522, term23522.getClass(), "type", 0);
        setField(term23522, term23522.getClass(), "next", null);
        setField(term23522, term23522.getClass(), "first", null);
        setField(term23522, term23522.getClass(), "last", null);
        setField(term23522, term23522.getClass(), "propListHead", null);
        setIntField(term23522, term23522.getClass(), "sourcePosition", 0);
        setField(term23522, term23522.getClass(), "jsType", null);
        setField(term23522, term23522.getClass(), "parent", null);
        setField(term23520, term23520.getClass(), "first", term23522);
        setIntField(term23523, term23523.getClass(), "type", 0);
        setField(term23523, term23523.getClass(), "next", null);
        setField(term23523, term23523.getClass(), "first", null);
        setField(term23523, term23523.getClass(), "last", null);
        setField(term23523, term23523.getClass(), "propListHead", null);
        setIntField(term23523, term23523.getClass(), "sourcePosition", 0);
        setField(term23523, term23523.getClass(), "jsType", null);
        setField(term23523, term23523.getClass(), "parent", null);
        setField(term23520, term23520.getClass(), "last", term23523);
        setField(term23524, term23524.getClass(), "next", null);
        setIntField(term23524, term23524.getClass(), "type", 0);
        setIntField(term23524, term23524.getClass(), "intValue", 0);
        setField(term23524, term23524.getClass(), "objectValue", null);
        setField(term23520, term23520.getClass(), "propListHead", term23524);
        setIntField(term23520, term23520.getClass(), "sourcePosition", -1281083262);
        setField(term23520, term23520.getClass(), "jsType", null);
        setField(term23520, term23520.getClass(), "parent", null);
        setField(term23519, term23519.getClass(), "next", term23520);
        setIntField(term23525, term23525.getClass(), "type", 0);
        setField(term23525, term23525.getClass(), "next", null);
        setField(term23525, term23525.getClass(), "first", null);
        setField(term23525, term23525.getClass(), "last", null);
        setField(term23525, term23525.getClass(), "propListHead", null);
        setIntField(term23525, term23525.getClass(), "sourcePosition", 0);
        setField(term23525, term23525.getClass(), "jsType", null);
        setField(term23525, term23525.getClass(), "parent", null);
        setField(term23519, term23519.getClass(), "first", term23525);
        setIntField(term23526, term23526.getClass(), "type", 0);
        setField(term23526, term23526.getClass(), "next", null);
        setField(term23526, term23526.getClass(), "first", null);
        setField(term23526, term23526.getClass(), "last", null);
        setField(term23526, term23526.getClass(), "propListHead", null);
        setIntField(term23526, term23526.getClass(), "sourcePosition", 0);
        setField(term23526, term23526.getClass(), "jsType", null);
        setField(term23526, term23526.getClass(), "parent", null);
        setField(term23519, term23519.getClass(), "last", term23526);
        setField(term23527, term23527.getClass(), "next", null);
        setIntField(term23527, term23527.getClass(), "type", 0);
        setIntField(term23527, term23527.getClass(), "intValue", 0);
        setField(term23527, term23527.getClass(), "objectValue", null);
        setField(term23519, term23519.getClass(), "propListHead", term23527);
        setIntField(term23519, term23519.getClass(), "sourcePosition", 1059930704);
        setField(term23519, term23519.getClass(), "jsType", null);
        setField(term23519, term23519.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term8305;
        Object retValue = callMethod(klass, "isReference", argTypes, null, args);
        assertTrue(recursiveEquals(term8305, term23519));
        assertTrue(recursiveEquals(retValue, false));
    }

};


