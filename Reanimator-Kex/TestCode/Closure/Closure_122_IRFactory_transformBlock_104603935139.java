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

public class IRFactory_transformBlock_104603935139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2570;

    public IRFactory_transformBlock_104603935139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2598 = new HashMap();
        HashMap term2607 = new HashMap();
        Set<Object> term24831 =  ((Map) term2607).keySet();
        HashSet term2606 = new HashSet((Collection<? extends Object>) term24831);
        Class<? extends Object> term24833 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term24832 = ((Class) term24833).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term24832).setAccessible(true);
        Object enum49 = ((Field) term24832).get((Object) null);
        HashMap term2631 = new HashMap();
        Set<Object> term25152 =  ((Map) term2631).keySet();
        HashSet term2630 = new HashSet((Collection<? extends Object>) term25152);
        HashMap term2640 = new HashMap();
        Set<Object> term25153 =  ((Map) term2640).keySet();
        HashSet term2639 = new HashSet((Collection<? extends Object>) term25153);
        term2570 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term2595 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term2629 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term2656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2659 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term2660 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term2664 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2570, term2570.getClass(), "sourceString", "hxCBltsObl");
        setField(term2570, term2570.getClass(), "sourceFile", null);
        setField(term2570, term2570.getClass(), "sourceName", "BndsHwAFMv");
        setBooleanField(term2595, term2595.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term2595, term2595.getClass(), "isIdeMode", false);
        setField(term2595, term2595.getClass(), "annotationNames", term2598);
        setField(term2595, term2595.getClass(), "suppressionNames", term2606);
        setField(term2595, term2595.getClass(), "languageMode", enum49);
        setBooleanField(term2595, term2595.getClass(), "acceptConstKeyword", true);
        setField(term2570, term2570.getClass(), "config", term2595);
        setField(term2570, term2570.getClass(), "errorReporter", null);
        setField(term2629, term2629.getClass(), "this$0", null);
        setField(term2570, term2570.getClass(), "transformDispatcher", term2629);
        setField(term2570, term2570.getClass(), "reservedKeywords", term2630);
        setField(term2570, term2570.getClass(), "parsedComments", term2639);
        setIntField(term2656, term2656.getClass(), "type", 0);
        setField(term2656, term2656.getClass(), "next", null);
        setField(term2656, term2656.getClass(), "first", null);
        setField(term2656, term2656.getClass(), "last", null);
        setField(term2656, term2656.getClass(), "propListHead", null);
        setIntField(term2656, term2656.getClass(), "sourcePosition", 0);
        setField(term2656, term2656.getClass(), "jsType", null);
        setField(term2656, term2656.getClass(), "parent", null);
        setField(term2570, term2570.getClass(), "rootNodeJsDocHolder", term2656);
        setField(term2659, term2659.getClass(), "this$0", null);
        setField(term2570, term2570.getClass(), "fileLevelJsDocBuilder", term2659);
        setField(term2660, term2660.getClass(), "info", null);
        setField(term2660, term2660.getClass(), "documentation", null);
        setField(term2660, term2660.getClass(), "associatedNode", null);
        setField(term2660, term2660.getClass(), "visibility", null);
        setIntField(term2660, term2660.getClass(), "bitset", 0);
        setField(term2660, term2660.getClass(), "type", null);
        setField(term2660, term2660.getClass(), "thisType", null);
        setBooleanField(term2660, term2660.getClass(), "includeDocumentation", false);
        setIntField(term2660, term2660.getClass(), "originalCommentPosition", 0);
        setField(term2570, term2570.getClass(), "fileOverviewInfo", term2660);
        setIntField(term2664, term2664.getClass(), "type", 0);
        setField(term2664, term2664.getClass(), "next", null);
        setField(term2664, term2664.getClass(), "first", null);
        setField(term2664, term2664.getClass(), "last", null);
        setField(term2664, term2664.getClass(), "propListHead", null);
        setIntField(term2664, term2664.getClass(), "sourcePosition", 0);
        setField(term2664, term2664.getClass(), "jsType", null);
        setField(term2664, term2664.getClass(), "parent", null);
        setField(term2570, term2570.getClass(), "templateNode", term2664);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "transformBlock", argTypes, term2570, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


