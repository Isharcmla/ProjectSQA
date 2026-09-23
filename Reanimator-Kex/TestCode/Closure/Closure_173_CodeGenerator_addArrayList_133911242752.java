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
import java.util.HashMap;
import java.lang.String;
import java.lang.Object;

public class CodeGenerator_addArrayList_133911242752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12153;
     Object term12188;

    public CodeGenerator_addArrayList_133911242752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12154 = new HashMap();
        Class<? extends Object> term35570 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term35569 = ((Class) term35570).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term35569).setAccessible(true);
        Object enum93 = ((Field) term35569).get((Object) null);
        term12153 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term12153, term12153.getClass(), "escapedJsStrings", term12154);
        setField(term12153, term12153.getClass(), "cc", null);
        setField(term12153, term12153.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term12153, term12153.getClass(), "preferSingleQuotes", false);
        setBooleanField(term12153, term12153.getClass(), "trustedStrings", true);
        setField(term12153, term12153.getClass(), "languageMode", enum93);
        term12188 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12192 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12194 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12199 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12203 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12205 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12188, term12188.getClass(), "type", -268815336);
        setIntField(term12190, term12190.getClass(), "type", -1210583429);
        setIntField(term12192, term12192.getClass(), "type", -663691365);
        setIntField(term12194, term12194.getClass(), "type", 339854490);
        setIntField(term12196, term12196.getClass(), "type", -615654495);
        setField(term12196, term12196.getClass(), "next", null);
        setField(term12196, term12196.getClass(), "first", null);
        setField(term12196, term12196.getClass(), "last", null);
        setField(term12196, term12196.getClass(), "propListHead", null);
        setIntField(term12196, term12196.getClass(), "sourcePosition", 0);
        setField(term12196, term12196.getClass(), "jsType", null);
        setField(term12196, term12196.getClass(), "parent", null);
        setField(term12194, term12194.getClass(), "next", term12196);
        setIntField(term12199, term12199.getClass(), "type", -1476117762);
        setField(term12199, term12199.getClass(), "next", null);
        setField(term12199, term12199.getClass(), "first", null);
        setField(term12199, term12199.getClass(), "last", term12196);
        setField(term12199, term12199.getClass(), "propListHead", null);
        setIntField(term12199, term12199.getClass(), "sourcePosition", 0);
        setField(term12199, term12199.getClass(), "jsType", null);
        setField(term12199, term12199.getClass(), "parent", null);
        setField(term12194, term12194.getClass(), "first", term12199);
        setField(term12194, term12194.getClass(), "last", term12192);
        setField(term12194, term12194.getClass(), "propListHead", null);
        setIntField(term12194, term12194.getClass(), "sourcePosition", 0);
        setField(term12194, term12194.getClass(), "jsType", null);
        setField(term12194, term12194.getClass(), "parent", null);
        setField(term12192, term12192.getClass(), "next", term12194);
        setField(term12192, term12192.getClass(), "first", term12196);
        setIntField(term12203, term12203.getClass(), "type", 1532716628);
        setIntField(term12205, term12205.getClass(), "type", -1801760683);
        setField(term12205, term12205.getClass(), "next", null);
        setField(term12205, term12205.getClass(), "first", term12199);
        setField(term12205, term12205.getClass(), "last", term12194);
        setField(term12205, term12205.getClass(), "propListHead", null);
        setIntField(term12205, term12205.getClass(), "sourcePosition", 0);
        setField(term12205, term12205.getClass(), "jsType", null);
        setField(term12205, term12205.getClass(), "parent", null);
        setField(term12203, term12203.getClass(), "next", term12205);
        setField(term12203, term12203.getClass(), "first", term12190);
        setField(term12203, term12203.getClass(), "last", term12190);
        setField(term12203, term12203.getClass(), "propListHead", null);
        setIntField(term12203, term12203.getClass(), "sourcePosition", 0);
        setField(term12203, term12203.getClass(), "jsType", null);
        setField(term12203, term12203.getClass(), "parent", null);
        setField(term12192, term12192.getClass(), "last", term12203);
        setField(term12192, term12192.getClass(), "propListHead", null);
        setIntField(term12192, term12192.getClass(), "sourcePosition", 0);
        setField(term12192, term12192.getClass(), "jsType", null);
        setField(term12192, term12192.getClass(), "parent", null);
        setField(term12190, term12190.getClass(), "next", term12192);
        setIntField(term12210, term12210.getClass(), "type", 1141317871);
        setField(term12210, term12210.getClass(), "next", term12203);
        setField(term12210, term12210.getClass(), "first", term12205);
        setField(term12210, term12210.getClass(), "last", term12188);
        setField(term12210, term12210.getClass(), "propListHead", null);
        setIntField(term12210, term12210.getClass(), "sourcePosition", 0);
        setField(term12210, term12210.getClass(), "jsType", null);
        setField(term12210, term12210.getClass(), "parent", null);
        setField(term12190, term12190.getClass(), "first", term12210);
        setField(term12190, term12190.getClass(), "last", term12210);
        setField(term12190, term12190.getClass(), "propListHead", null);
        setIntField(term12190, term12190.getClass(), "sourcePosition", 0);
        setField(term12190, term12190.getClass(), "jsType", null);
        setField(term12190, term12190.getClass(), "parent", null);
        setField(term12188, term12188.getClass(), "next", term12190);
        setField(term12188, term12188.getClass(), "first", term12194);
        setField(term12188, term12188.getClass(), "last", term12196);
        setField(term12188, term12188.getClass(), "propListHead", null);
        setIntField(term12188, term12188.getClass(), "sourcePosition", 0);
        setField(term12188, term12188.getClass(), "jsType", null);
        setField(term12188, term12188.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term12188;
        try {
            callMethod(klass, "addArrayList", argTypes, term12153, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


