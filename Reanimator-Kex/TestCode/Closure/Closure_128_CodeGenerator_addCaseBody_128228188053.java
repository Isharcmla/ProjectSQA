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
import java.util.HashMap;
import java.lang.Object;

public class CodeGenerator_addCaseBody_128228188053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7235;
     Object term7248;

    public CodeGenerator_addCaseBody_128228188053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7236 = new HashMap();
        term7235 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term7235, term7235.getClass(), "ESCAPED_JS_STRINGS", term7236);
        setField(term7235, term7235.getClass(), "cc", null);
        setField(term7235, term7235.getClass(), "outputCharsetEncoder", null);
        setBooleanField(term7235, term7235.getClass(), "preferSingleQuotes", true);
        setBooleanField(term7235, term7235.getClass(), "trustedStrings", false);
        term7248 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7250 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7252 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7254 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7256 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7259 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7263 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7265 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term7248, term7248.getClass(), "type", 890669485);
        setIntField(term7250, term7250.getClass(), "type", 691577392);
        setIntField(term7252, term7252.getClass(), "type", -893623680);
        setIntField(term7254, term7254.getClass(), "type", -1963434938);
        setIntField(term7256, term7256.getClass(), "type", 906181092);
        setField(term7256, term7256.getClass(), "next", null);
        setField(term7256, term7256.getClass(), "first", null);
        setField(term7256, term7256.getClass(), "last", null);
        setField(term7256, term7256.getClass(), "propListHead", null);
        setIntField(term7256, term7256.getClass(), "sourcePosition", 0);
        setField(term7256, term7256.getClass(), "jsType", null);
        setField(term7256, term7256.getClass(), "parent", null);
        setField(term7254, term7254.getClass(), "next", term7256);
        setIntField(term7259, term7259.getClass(), "type", 1045657203);
        setField(term7259, term7259.getClass(), "next", null);
        setField(term7259, term7259.getClass(), "first", null);
        setField(term7259, term7259.getClass(), "last", term7256);
        setField(term7259, term7259.getClass(), "propListHead", null);
        setIntField(term7259, term7259.getClass(), "sourcePosition", 0);
        setField(term7259, term7259.getClass(), "jsType", null);
        setField(term7259, term7259.getClass(), "parent", null);
        setField(term7254, term7254.getClass(), "first", term7259);
        setField(term7254, term7254.getClass(), "last", term7252);
        setField(term7254, term7254.getClass(), "propListHead", null);
        setIntField(term7254, term7254.getClass(), "sourcePosition", 0);
        setField(term7254, term7254.getClass(), "jsType", null);
        setField(term7254, term7254.getClass(), "parent", null);
        setField(term7252, term7252.getClass(), "next", term7254);
        setField(term7252, term7252.getClass(), "first", term7256);
        setIntField(term7263, term7263.getClass(), "type", 1072005683);
        setIntField(term7265, term7265.getClass(), "type", 1861318859);
        setField(term7265, term7265.getClass(), "next", null);
        setField(term7265, term7265.getClass(), "first", term7259);
        setField(term7265, term7265.getClass(), "last", term7254);
        setField(term7265, term7265.getClass(), "propListHead", null);
        setIntField(term7265, term7265.getClass(), "sourcePosition", 0);
        setField(term7265, term7265.getClass(), "jsType", null);
        setField(term7265, term7265.getClass(), "parent", null);
        setField(term7263, term7263.getClass(), "next", term7265);
        setField(term7263, term7263.getClass(), "first", term7250);
        setField(term7263, term7263.getClass(), "last", term7250);
        setField(term7263, term7263.getClass(), "propListHead", null);
        setIntField(term7263, term7263.getClass(), "sourcePosition", 0);
        setField(term7263, term7263.getClass(), "jsType", null);
        setField(term7263, term7263.getClass(), "parent", null);
        setField(term7252, term7252.getClass(), "last", term7263);
        setField(term7252, term7252.getClass(), "propListHead", null);
        setIntField(term7252, term7252.getClass(), "sourcePosition", 0);
        setField(term7252, term7252.getClass(), "jsType", null);
        setField(term7252, term7252.getClass(), "parent", null);
        setField(term7250, term7250.getClass(), "next", term7252);
        setIntField(term7270, term7270.getClass(), "type", 1474524152);
        setField(term7270, term7270.getClass(), "next", term7263);
        setField(term7270, term7270.getClass(), "first", term7265);
        setField(term7270, term7270.getClass(), "last", term7248);
        setField(term7270, term7270.getClass(), "propListHead", null);
        setIntField(term7270, term7270.getClass(), "sourcePosition", 0);
        setField(term7270, term7270.getClass(), "jsType", null);
        setField(term7270, term7270.getClass(), "parent", null);
        setField(term7250, term7250.getClass(), "first", term7270);
        setField(term7250, term7250.getClass(), "last", term7270);
        setField(term7250, term7250.getClass(), "propListHead", null);
        setIntField(term7250, term7250.getClass(), "sourcePosition", 0);
        setField(term7250, term7250.getClass(), "jsType", null);
        setField(term7250, term7250.getClass(), "parent", null);
        setField(term7248, term7248.getClass(), "next", term7250);
        setField(term7248, term7248.getClass(), "first", term7254);
        setField(term7248, term7248.getClass(), "last", term7256);
        setField(term7248, term7248.getClass(), "propListHead", null);
        setIntField(term7248, term7248.getClass(), "sourcePosition", 0);
        setField(term7248, term7248.getClass(), "jsType", null);
        setField(term7248, term7248.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term7248;
        try {
            callMethod(klass, "addCaseBody", argTypes, term7235, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


