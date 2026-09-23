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
     Object term12150;
     Object term12185;

    public CodeGenerator_addArrayList_133911242752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12151 = new HashMap();
        Class<? extends Object> term35545 = Class.forName((String) "com.google.javascript.jscomp.CompilerOptions$LanguageMode");
        Field term35544 = ((Class) term35545).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term35544).setAccessible(true);
        Object enum93 = ((Field) term35544).get((Object) null);
        term12150 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term12150, term12150.getClass(), "escapedJsStrings", term12151);
        setField(term12150, term12150.getClass(), "cc", null);
        setField(term12150, term12150.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term12150, term12150.getClass(), "preferSingleQuotes", false);
        setBooleanField(term12150, term12150.getClass(), "trustedStrings", false);
        setField(term12150, term12150.getClass(), "languageMode", enum93);
        term12185 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12189 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12191 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12202 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term12185, term12185.getClass(), "type", -268815336);
        setIntField(term12187, term12187.getClass(), "type", -1210583429);
        setIntField(term12189, term12189.getClass(), "type", -663691365);
        setIntField(term12191, term12191.getClass(), "type", 339854490);
        setIntField(term12193, term12193.getClass(), "type", -615654495);
        setField(term12193, term12193.getClass(), "next", null);
        setField(term12193, term12193.getClass(), "first", null);
        setField(term12193, term12193.getClass(), "last", null);
        setField(term12193, term12193.getClass(), "propListHead", null);
        setIntField(term12193, term12193.getClass(), "sourcePosition", 0);
        setField(term12193, term12193.getClass(), "jsType", null);
        setField(term12193, term12193.getClass(), "parent", null);
        setField(term12191, term12191.getClass(), "next", term12193);
        setIntField(term12196, term12196.getClass(), "type", -1476117762);
        setField(term12196, term12196.getClass(), "next", null);
        setField(term12196, term12196.getClass(), "first", null);
        setField(term12196, term12196.getClass(), "last", term12193);
        setField(term12196, term12196.getClass(), "propListHead", null);
        setIntField(term12196, term12196.getClass(), "sourcePosition", 0);
        setField(term12196, term12196.getClass(), "jsType", null);
        setField(term12196, term12196.getClass(), "parent", null);
        setField(term12191, term12191.getClass(), "first", term12196);
        setField(term12191, term12191.getClass(), "last", term12189);
        setField(term12191, term12191.getClass(), "propListHead", null);
        setIntField(term12191, term12191.getClass(), "sourcePosition", 0);
        setField(term12191, term12191.getClass(), "jsType", null);
        setField(term12191, term12191.getClass(), "parent", null);
        setField(term12189, term12189.getClass(), "next", term12191);
        setField(term12189, term12189.getClass(), "first", term12193);
        setIntField(term12200, term12200.getClass(), "type", 1532716628);
        setIntField(term12202, term12202.getClass(), "type", -1801760683);
        setField(term12202, term12202.getClass(), "next", null);
        setField(term12202, term12202.getClass(), "first", term12196);
        setField(term12202, term12202.getClass(), "last", term12191);
        setField(term12202, term12202.getClass(), "propListHead", null);
        setIntField(term12202, term12202.getClass(), "sourcePosition", 0);
        setField(term12202, term12202.getClass(), "jsType", null);
        setField(term12202, term12202.getClass(), "parent", null);
        setField(term12200, term12200.getClass(), "next", term12202);
        setField(term12200, term12200.getClass(), "first", term12187);
        setField(term12200, term12200.getClass(), "last", term12187);
        setField(term12200, term12200.getClass(), "propListHead", null);
        setIntField(term12200, term12200.getClass(), "sourcePosition", 0);
        setField(term12200, term12200.getClass(), "jsType", null);
        setField(term12200, term12200.getClass(), "parent", null);
        setField(term12189, term12189.getClass(), "last", term12200);
        setField(term12189, term12189.getClass(), "propListHead", null);
        setIntField(term12189, term12189.getClass(), "sourcePosition", 0);
        setField(term12189, term12189.getClass(), "jsType", null);
        setField(term12189, term12189.getClass(), "parent", null);
        setField(term12187, term12187.getClass(), "next", term12189);
        setIntField(term12207, term12207.getClass(), "type", 1141317871);
        setField(term12207, term12207.getClass(), "next", term12200);
        setField(term12207, term12207.getClass(), "first", term12202);
        setField(term12207, term12207.getClass(), "last", term12185);
        setField(term12207, term12207.getClass(), "propListHead", null);
        setIntField(term12207, term12207.getClass(), "sourcePosition", 0);
        setField(term12207, term12207.getClass(), "jsType", null);
        setField(term12207, term12207.getClass(), "parent", null);
        setField(term12187, term12187.getClass(), "first", term12207);
        setField(term12187, term12187.getClass(), "last", term12207);
        setField(term12187, term12187.getClass(), "propListHead", null);
        setIntField(term12187, term12187.getClass(), "sourcePosition", 0);
        setField(term12187, term12187.getClass(), "jsType", null);
        setField(term12187, term12187.getClass(), "parent", null);
        setField(term12185, term12185.getClass(), "next", term12187);
        setField(term12185, term12185.getClass(), "first", term12191);
        setField(term12185, term12185.getClass(), "last", term12193);
        setField(term12185, term12185.getClass(), "propListHead", null);
        setIntField(term12185, term12185.getClass(), "sourcePosition", 0);
        setField(term12185, term12185.getClass(), "jsType", null);
        setField(term12185, term12185.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term12185;
        try {
            callMethod(klass, "addArrayList", argTypes, term12150, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


