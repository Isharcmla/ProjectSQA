package com.google.javascript.jscomp.parsing;

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
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class IRFactory_transformParameter_193342430149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9425;

    public IRFactory_transformParameter_193342430149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9453 = new HashMap();
        HashMap term9462 = new HashMap();
        Set<Object> term35321 =  ((Map) term9462).keySet();
        HashSet term9461 = new HashSet((Collection<? extends Object>) term35321);
        Class<? extends Object> term35323 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term35322 = ((Class) term35323).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term35322).setAccessible(true);
        Object enum70 = ((Field) term35322).get((Object) null);
        HashMap term9493 = new HashMap();
        Set<Object> term35663 =  ((Map) term9493).keySet();
        HashSet term9492 = new HashSet((Collection<? extends Object>) term35663);
        HashMap term9502 = new HashMap();
        Set<Object> term35664 =  ((Map) term9502).keySet();
        HashSet term9501 = new HashSet((Collection<? extends Object>) term35664);
        term9425 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term9450 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term9491 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term9516 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9519 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term9520 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term9524 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term9425, term9425.getClass(), "sourceString", "PXdVZyoJyC");
        setField(term9425, term9425.getClass(), "sourceFile", null);
        setField(term9425, term9425.getClass(), "sourceName", "vLerpqavFM");
        setBooleanField(term9450, term9450.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term9450, term9450.getClass(), "isIdeMode", true);
        setField(term9450, term9450.getClass(), "annotationNames", term9453);
        setField(term9450, term9450.getClass(), "suppressionNames", term9461);
        setField(term9450, term9450.getClass(), "languageMode", enum70);
        setBooleanField(term9450, term9450.getClass(), "acceptConstKeyword", false);
        setField(term9425, term9425.getClass(), "config", term9450);
        setField(term9425, term9425.getClass(), "errorReporter", null);
        setField(term9491, term9491.getClass(), "this$0", null);
        setField(term9425, term9425.getClass(), "transformDispatcher", term9491);
        setField(term9425, term9425.getClass(), "reservedKeywords", term9492);
        setField(term9425, term9425.getClass(), "parsedComments", term9501);
        setIntField(term9516, term9516.getClass(), "type", 0);
        setField(term9516, term9516.getClass(), "next", null);
        setField(term9516, term9516.getClass(), "first", null);
        setField(term9516, term9516.getClass(), "last", null);
        setField(term9516, term9516.getClass(), "propListHead", null);
        setIntField(term9516, term9516.getClass(), "sourcePosition", 0);
        setField(term9516, term9516.getClass(), "jsType", null);
        setField(term9516, term9516.getClass(), "parent", null);
        setField(term9425, term9425.getClass(), "rootNodeJsDocHolder", term9516);
        setField(term9519, term9519.getClass(), "this$0", null);
        setField(term9425, term9425.getClass(), "fileLevelJsDocBuilder", term9519);
        setField(term9520, term9520.getClass(), "info", null);
        setField(term9520, term9520.getClass(), "documentation", null);
        setField(term9520, term9520.getClass(), "associatedNode", null);
        setField(term9520, term9520.getClass(), "visibility", null);
        setIntField(term9520, term9520.getClass(), "bitset", 0);
        setField(term9520, term9520.getClass(), "type", null);
        setField(term9520, term9520.getClass(), "thisType", null);
        setBooleanField(term9520, term9520.getClass(), "includeDocumentation", false);
        setIntField(term9520, term9520.getClass(), "originalCommentPosition", 0);
        setField(term9425, term9425.getClass(), "fileOverviewInfo", term9520);
        setIntField(term9524, term9524.getClass(), "type", 0);
        setField(term9524, term9524.getClass(), "next", null);
        setField(term9524, term9524.getClass(), "first", null);
        setField(term9524, term9524.getClass(), "last", null);
        setField(term9524, term9524.getClass(), "propListHead", null);
        setIntField(term9524, term9524.getClass(), "sourcePosition", 0);
        setField(term9524, term9524.getClass(), "jsType", null);
        setField(term9524, term9524.getClass(), "parent", null);
        setField(term9425, term9425.getClass(), "templateNode", term9524);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "transformParameter", argTypes, term9425, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


