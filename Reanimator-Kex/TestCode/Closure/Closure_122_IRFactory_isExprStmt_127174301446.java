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

public class IRFactory_isExprStmt_127174301446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7515;

    public IRFactory_isExprStmt_127174301446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7543 = new HashMap();
        HashMap term7552 = new HashMap();
        Set<Object> term33887 =  ((Map) term7552).keySet();
        HashSet term7551 = new HashSet((Collection<? extends Object>) term33887);
        Class<? extends Object> term33889 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term33888 = ((Class) term33889).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term33888).setAccessible(true);
        Object enum68 = ((Field) term33888).get((Object) null);
        HashMap term7576 = new HashMap();
        Set<Object> term34208 =  ((Map) term7576).keySet();
        HashSet term7575 = new HashSet((Collection<? extends Object>) term34208);
        HashMap term7595 = new HashMap();
        Set<Object> term34209 =  ((Map) term7595).keySet();
        HashSet term7594 = new HashSet((Collection<? extends Object>) term34209);
        term7515 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term7540 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term7574 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term7605 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7608 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term7609 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term7613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term7515, term7515.getClass(), "sourceString", "GrqozDKFOk");
        setField(term7515, term7515.getClass(), "sourceFile", null);
        setField(term7515, term7515.getClass(), "sourceName", "CFyoseFGLF");
        setBooleanField(term7540, term7540.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term7540, term7540.getClass(), "isIdeMode", true);
        setField(term7540, term7540.getClass(), "annotationNames", term7543);
        setField(term7540, term7540.getClass(), "suppressionNames", term7551);
        setField(term7540, term7540.getClass(), "languageMode", enum68);
        setBooleanField(term7540, term7540.getClass(), "acceptConstKeyword", true);
        setField(term7515, term7515.getClass(), "config", term7540);
        setField(term7515, term7515.getClass(), "errorReporter", null);
        setField(term7574, term7574.getClass(), "this$0", null);
        setField(term7515, term7515.getClass(), "transformDispatcher", term7574);
        setField(term7515, term7515.getClass(), "reservedKeywords", term7575);
        setField(term7515, term7515.getClass(), "parsedComments", term7594);
        setIntField(term7605, term7605.getClass(), "type", 0);
        setField(term7605, term7605.getClass(), "next", null);
        setField(term7605, term7605.getClass(), "first", null);
        setField(term7605, term7605.getClass(), "last", null);
        setField(term7605, term7605.getClass(), "propListHead", null);
        setIntField(term7605, term7605.getClass(), "sourcePosition", 0);
        setField(term7605, term7605.getClass(), "jsType", null);
        setField(term7605, term7605.getClass(), "parent", null);
        setField(term7515, term7515.getClass(), "rootNodeJsDocHolder", term7605);
        setField(term7608, term7608.getClass(), "this$0", null);
        setField(term7515, term7515.getClass(), "fileLevelJsDocBuilder", term7608);
        setField(term7609, term7609.getClass(), "info", null);
        setField(term7609, term7609.getClass(), "documentation", null);
        setField(term7609, term7609.getClass(), "associatedNode", null);
        setField(term7609, term7609.getClass(), "visibility", null);
        setIntField(term7609, term7609.getClass(), "bitset", 0);
        setField(term7609, term7609.getClass(), "type", null);
        setField(term7609, term7609.getClass(), "thisType", null);
        setBooleanField(term7609, term7609.getClass(), "includeDocumentation", false);
        setIntField(term7609, term7609.getClass(), "originalCommentPosition", 0);
        setField(term7515, term7515.getClass(), "fileOverviewInfo", term7609);
        setIntField(term7613, term7613.getClass(), "type", 0);
        setField(term7613, term7613.getClass(), "next", null);
        setField(term7613, term7613.getClass(), "first", null);
        setField(term7613, term7613.getClass(), "last", null);
        setField(term7613, term7613.getClass(), "propListHead", null);
        setIntField(term7613, term7613.getClass(), "sourcePosition", 0);
        setField(term7613, term7613.getClass(), "jsType", null);
        setField(term7613, term7613.getClass(), "parent", null);
        setField(term7515, term7515.getClass(), "templateNode", term7613);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "isExprStmt", argTypes, term7515, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


