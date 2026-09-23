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
import java.lang.Object;

public class CodeGenerator_isIndirectEval_8291314679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term592;
     Object term593;

    public CodeGenerator_isIndirectEval_8291314679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term592 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term592, term592.getClass(), "cc", null);
        setField(term592, term592.getClass(), "outputCharsetEncoder", null);
        term593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term595 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term597 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term600 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term603 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term606 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term616 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term593, term593.getClass(), "type", 865208305);
        setIntField(term595, term595.getClass(), "type", -1179120542);
        setIntField(term597, term597.getClass(), "type", 0);
        setField(term597, term597.getClass(), "next", null);
        setField(term597, term597.getClass(), "first", null);
        setField(term597, term597.getClass(), "last", null);
        setField(term597, term597.getClass(), "propListHead", null);
        setIntField(term597, term597.getClass(), "sourcePosition", 0);
        setField(term597, term597.getClass(), "jsType", null);
        setField(term597, term597.getClass(), "parent", null);
        setField(term595, term595.getClass(), "next", term597);
        setIntField(term600, term600.getClass(), "type", 0);
        setField(term600, term600.getClass(), "next", null);
        setField(term600, term600.getClass(), "first", null);
        setField(term600, term600.getClass(), "last", null);
        setField(term600, term600.getClass(), "propListHead", null);
        setIntField(term600, term600.getClass(), "sourcePosition", 0);
        setField(term600, term600.getClass(), "jsType", null);
        setField(term600, term600.getClass(), "parent", null);
        setField(term595, term595.getClass(), "first", term600);
        setIntField(term603, term603.getClass(), "type", 0);
        setField(term603, term603.getClass(), "next", null);
        setField(term603, term603.getClass(), "first", null);
        setField(term603, term603.getClass(), "last", null);
        setField(term603, term603.getClass(), "propListHead", null);
        setIntField(term603, term603.getClass(), "sourcePosition", 0);
        setField(term603, term603.getClass(), "jsType", null);
        setField(term603, term603.getClass(), "parent", null);
        setField(term595, term595.getClass(), "last", term603);
        setField(term606, term606.getClass(), "next", null);
        setIntField(term606, term606.getClass(), "type", 0);
        setIntField(term606, term606.getClass(), "intValue", 0);
        setField(term606, term606.getClass(), "objectValue", null);
        setField(term595, term595.getClass(), "propListHead", term606);
        setIntField(term595, term595.getClass(), "sourcePosition", 1193880199);
        setField(term595, term595.getClass(), "jsType", null);
        setField(term595, term595.getClass(), "parent", null);
        setField(term593, term593.getClass(), "next", term595);
        setIntField(term610, term610.getClass(), "type", 0);
        setField(term610, term610.getClass(), "next", null);
        setField(term610, term610.getClass(), "first", null);
        setField(term610, term610.getClass(), "last", null);
        setField(term610, term610.getClass(), "propListHead", null);
        setIntField(term610, term610.getClass(), "sourcePosition", 0);
        setField(term610, term610.getClass(), "jsType", null);
        setField(term610, term610.getClass(), "parent", null);
        setField(term593, term593.getClass(), "first", term610);
        setIntField(term613, term613.getClass(), "type", 0);
        setField(term613, term613.getClass(), "next", null);
        setField(term613, term613.getClass(), "first", null);
        setField(term613, term613.getClass(), "last", null);
        setField(term613, term613.getClass(), "propListHead", null);
        setIntField(term613, term613.getClass(), "sourcePosition", 0);
        setField(term613, term613.getClass(), "jsType", null);
        setField(term613, term613.getClass(), "parent", null);
        setField(term593, term593.getClass(), "last", term613);
        setField(term616, term616.getClass(), "next", null);
        setIntField(term616, term616.getClass(), "type", 0);
        setIntField(term616, term616.getClass(), "intValue", 0);
        setField(term616, term616.getClass(), "objectValue", null);
        setField(term593, term593.getClass(), "propListHead", term616);
        setIntField(term593, term593.getClass(), "sourcePosition", -1087774327);
        setField(term593, term593.getClass(), "jsType", null);
        setField(term593, term593.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term593;
        callMethod(klass, "isIndirectEval", argTypes, term592, args);
    }

};


