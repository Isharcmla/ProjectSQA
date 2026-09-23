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
import java.lang.Object;

public class CodeGenerator_addArrayList_133911242752 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7195;
     Object term7208;

    public CodeGenerator_addArrayList_133911242752() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7196 = new HashMap();
        term7195 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term7195, term7195.getClass(), "ESCAPED_JS_STRINGS", term7196);
        setField(term7195, term7195.getClass(), "cc", null);
        setField(term7195, term7195.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term7195, term7195.getClass(), "preferSingleQuotes", true);
        setBooleanField(term7195, term7195.getClass(), "trustedStrings", true);
        term7208 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7210 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7212 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7214 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7216 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7219 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7223 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7230 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7208, term7208.getClass(), "type", -268815336);
        setIntField(term7210, term7210.getClass(), "type", -1210583429);
        setIntField(term7212, term7212.getClass(), "type", -663691365);
        setIntField(term7214, term7214.getClass(), "type", 339854490);
        setIntField(term7216, term7216.getClass(), "type", -615654495);
        setField(term7216, term7216.getClass(), "next", null);
        setField(term7216, term7216.getClass(), "first", null);
        setField(term7216, term7216.getClass(), "last", null);
        setField(term7216, term7216.getClass(), "propListHead", null);
        setIntField(term7216, term7216.getClass(), "sourcePosition", 0);
        setField(term7216, term7216.getClass(), "jsType", null);
        setField(term7216, term7216.getClass(), "parent", null);
        setField(term7214, term7214.getClass(), "next", term7216);
        setIntField(term7219, term7219.getClass(), "type", -1476117762);
        setField(term7219, term7219.getClass(), "next", null);
        setField(term7219, term7219.getClass(), "first", null);
        setField(term7219, term7219.getClass(), "last", term7216);
        setField(term7219, term7219.getClass(), "propListHead", null);
        setIntField(term7219, term7219.getClass(), "sourcePosition", 0);
        setField(term7219, term7219.getClass(), "jsType", null);
        setField(term7219, term7219.getClass(), "parent", null);
        setField(term7214, term7214.getClass(), "first", term7219);
        setField(term7214, term7214.getClass(), "last", term7212);
        setField(term7214, term7214.getClass(), "propListHead", null);
        setIntField(term7214, term7214.getClass(), "sourcePosition", 0);
        setField(term7214, term7214.getClass(), "jsType", null);
        setField(term7214, term7214.getClass(), "parent", null);
        setField(term7212, term7212.getClass(), "next", term7214);
        setField(term7212, term7212.getClass(), "first", term7216);
        setIntField(term7223, term7223.getClass(), "type", 1532716628);
        setIntField(term7225, term7225.getClass(), "type", -1801760683);
        setField(term7225, term7225.getClass(), "next", null);
        setField(term7225, term7225.getClass(), "first", term7219);
        setField(term7225, term7225.getClass(), "last", term7214);
        setField(term7225, term7225.getClass(), "propListHead", null);
        setIntField(term7225, term7225.getClass(), "sourcePosition", 0);
        setField(term7225, term7225.getClass(), "jsType", null);
        setField(term7225, term7225.getClass(), "parent", null);
        setField(term7223, term7223.getClass(), "next", term7225);
        setField(term7223, term7223.getClass(), "first", term7210);
        setField(term7223, term7223.getClass(), "last", term7210);
        setField(term7223, term7223.getClass(), "propListHead", null);
        setIntField(term7223, term7223.getClass(), "sourcePosition", 0);
        setField(term7223, term7223.getClass(), "jsType", null);
        setField(term7223, term7223.getClass(), "parent", null);
        setField(term7212, term7212.getClass(), "last", term7223);
        setField(term7212, term7212.getClass(), "propListHead", null);
        setIntField(term7212, term7212.getClass(), "sourcePosition", 0);
        setField(term7212, term7212.getClass(), "jsType", null);
        setField(term7212, term7212.getClass(), "parent", null);
        setField(term7210, term7210.getClass(), "next", term7212);
        setIntField(term7230, term7230.getClass(), "type", 1141317871);
        setField(term7230, term7230.getClass(), "next", term7223);
        setField(term7230, term7230.getClass(), "first", term7225);
        setField(term7230, term7230.getClass(), "last", term7208);
        setField(term7230, term7230.getClass(), "propListHead", null);
        setIntField(term7230, term7230.getClass(), "sourcePosition", 0);
        setField(term7230, term7230.getClass(), "jsType", null);
        setField(term7230, term7230.getClass(), "parent", null);
        setField(term7210, term7210.getClass(), "first", term7230);
        setField(term7210, term7210.getClass(), "last", term7230);
        setField(term7210, term7210.getClass(), "propListHead", null);
        setIntField(term7210, term7210.getClass(), "sourcePosition", 0);
        setField(term7210, term7210.getClass(), "jsType", null);
        setField(term7210, term7210.getClass(), "parent", null);
        setField(term7208, term7208.getClass(), "next", term7210);
        setField(term7208, term7208.getClass(), "first", term7214);
        setField(term7208, term7208.getClass(), "last", term7216);
        setField(term7208, term7208.getClass(), "propListHead", null);
        setIntField(term7208, term7208.getClass(), "sourcePosition", 0);
        setField(term7208, term7208.getClass(), "jsType", null);
        setField(term7208, term7208.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term7208;
        try {
            callMethod(klass, "addArrayList", argTypes, term7195, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


