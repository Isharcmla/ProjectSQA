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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;
import java.lang.Integer;

public class IRFactory_newNode_156626018861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14932;
     Object term15031;
     Object term15033;

    public IRFactory_newNode_156626018861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14960 = new HashMap();
        HashMap term14969 = new HashMap();
        Set<Object> term47870 =  ((Map) term14969).keySet();
        HashSet term14968 = new HashSet((Collection<? extends Object>) term47870);
        Class<? extends Object> term47872 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term47871 = ((Class) term47872).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term47871).setAccessible(true);
        Object enum95 = ((Field) term47871).get((Object) null);
        HashMap term14993 = new HashMap();
        Set<Object> term48191 =  ((Map) term14993).keySet();
        HashSet term14992 = new HashSet((Collection<? extends Object>) term48191);
        HashMap term15004 = new HashMap();
        Set<Object> term48192 =  ((Map) term15004).keySet();
        HashSet term15003 = new HashSet((Collection<? extends Object>) term48192);
        term14932 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term14957 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term14991 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term15020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15023 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term15024 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term15028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term14932, term14932.getClass(), "sourceString", "YsUtbngnRO");
        setField(term14932, term14932.getClass(), "sourceFile", null);
        setField(term14932, term14932.getClass(), "sourceName", "JisaWUxcNb");
        setBooleanField(term14957, term14957.getClass(), "parseJsDocDocumentation", true);
        setBooleanField(term14957, term14957.getClass(), "isIdeMode", true);
        setField(term14957, term14957.getClass(), "annotationNames", term14960);
        setField(term14957, term14957.getClass(), "suppressionNames", term14968);
        setField(term14957, term14957.getClass(), "languageMode", enum95);
        setBooleanField(term14957, term14957.getClass(), "acceptConstKeyword", false);
        setField(term14932, term14932.getClass(), "config", term14957);
        setField(term14932, term14932.getClass(), "errorReporter", null);
        setField(term14991, term14991.getClass(), "this$0", null);
        setField(term14932, term14932.getClass(), "transformDispatcher", term14991);
        setField(term14932, term14932.getClass(), "reservedKeywords", term14992);
        setField(term14932, term14932.getClass(), "parsedComments", term15003);
        setIntField(term15020, term15020.getClass(), "type", 0);
        setField(term15020, term15020.getClass(), "next", null);
        setField(term15020, term15020.getClass(), "first", null);
        setField(term15020, term15020.getClass(), "last", null);
        setField(term15020, term15020.getClass(), "propListHead", null);
        setIntField(term15020, term15020.getClass(), "sourcePosition", 0);
        setField(term15020, term15020.getClass(), "jsType", null);
        setField(term15020, term15020.getClass(), "parent", null);
        setField(term14932, term14932.getClass(), "rootNodeJsDocHolder", term15020);
        setField(term15023, term15023.getClass(), "this$0", null);
        setField(term14932, term14932.getClass(), "fileLevelJsDocBuilder", term15023);
        setField(term15024, term15024.getClass(), "info", null);
        setField(term15024, term15024.getClass(), "documentation", null);
        setField(term15024, term15024.getClass(), "associatedNode", null);
        setField(term15024, term15024.getClass(), "visibility", null);
        setIntField(term15024, term15024.getClass(), "bitset", 0);
        setField(term15024, term15024.getClass(), "type", null);
        setField(term15024, term15024.getClass(), "thisType", null);
        setBooleanField(term15024, term15024.getClass(), "includeDocumentation", false);
        setIntField(term15024, term15024.getClass(), "originalCommentPosition", 0);
        setField(term14932, term14932.getClass(), "fileOverviewInfo", term15024);
        setIntField(term15028, term15028.getClass(), "type", 0);
        setField(term15028, term15028.getClass(), "next", null);
        setField(term15028, term15028.getClass(), "first", null);
        setField(term15028, term15028.getClass(), "last", null);
        setField(term15028, term15028.getClass(), "propListHead", null);
        setIntField(term15028, term15028.getClass(), "sourcePosition", 0);
        setField(term15028, term15028.getClass(), "jsType", null);
        setField(term15028, term15028.getClass(), "parent", null);
        setField(term14932, term14932.getClass(), "templateNode", term15028);
        term15031 = new Integer(952869601);
        term15033 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15037 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15041 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term15033, term15033.getClass(), "type", 91958879);
        setIntField(term15035, term15035.getClass(), "type", -645429025);
        setIntField(term15037, term15037.getClass(), "type", -688213483);
        setIntField(term15039, term15039.getClass(), "type", 644154104);
        setIntField(term15041, term15041.getClass(), "type", 76650923);
        setField(term15041, term15041.getClass(), "next", null);
        setField(term15041, term15041.getClass(), "first", null);
        setField(term15041, term15041.getClass(), "last", null);
        setField(term15041, term15041.getClass(), "propListHead", null);
        setIntField(term15041, term15041.getClass(), "sourcePosition", 0);
        setField(term15041, term15041.getClass(), "jsType", null);
        setField(term15041, term15041.getClass(), "parent", null);
        setField(term15039, term15039.getClass(), "next", term15041);
        setIntField(term15044, term15044.getClass(), "type", 1003743923);
        setField(term15044, term15044.getClass(), "next", null);
        setField(term15044, term15044.getClass(), "first", null);
        setField(term15044, term15044.getClass(), "last", term15041);
        setField(term15044, term15044.getClass(), "propListHead", null);
        setIntField(term15044, term15044.getClass(), "sourcePosition", 0);
        setField(term15044, term15044.getClass(), "jsType", null);
        setField(term15044, term15044.getClass(), "parent", null);
        setField(term15039, term15039.getClass(), "first", term15044);
        setField(term15039, term15039.getClass(), "last", term15037);
        setField(term15039, term15039.getClass(), "propListHead", null);
        setIntField(term15039, term15039.getClass(), "sourcePosition", 0);
        setField(term15039, term15039.getClass(), "jsType", null);
        setField(term15039, term15039.getClass(), "parent", null);
        setField(term15037, term15037.getClass(), "next", term15039);
        setField(term15037, term15037.getClass(), "first", term15041);
        setIntField(term15048, term15048.getClass(), "type", 354196060);
        setIntField(term15050, term15050.getClass(), "type", -1840305774);
        setField(term15050, term15050.getClass(), "next", null);
        setField(term15050, term15050.getClass(), "first", term15044);
        setField(term15050, term15050.getClass(), "last", term15039);
        setField(term15050, term15050.getClass(), "propListHead", null);
        setIntField(term15050, term15050.getClass(), "sourcePosition", 0);
        setField(term15050, term15050.getClass(), "jsType", null);
        setField(term15050, term15050.getClass(), "parent", null);
        setField(term15048, term15048.getClass(), "next", term15050);
        setField(term15048, term15048.getClass(), "first", term15035);
        setField(term15048, term15048.getClass(), "last", term15035);
        setField(term15048, term15048.getClass(), "propListHead", null);
        setIntField(term15048, term15048.getClass(), "sourcePosition", 0);
        setField(term15048, term15048.getClass(), "jsType", null);
        setField(term15048, term15048.getClass(), "parent", null);
        setField(term15037, term15037.getClass(), "last", term15048);
        setField(term15037, term15037.getClass(), "propListHead", null);
        setIntField(term15037, term15037.getClass(), "sourcePosition", 0);
        setField(term15037, term15037.getClass(), "jsType", null);
        setField(term15037, term15037.getClass(), "parent", null);
        setField(term15035, term15035.getClass(), "next", term15037);
        setIntField(term15055, term15055.getClass(), "type", 1365087144);
        setField(term15055, term15055.getClass(), "next", term15048);
        setField(term15055, term15055.getClass(), "first", term15050);
        setField(term15055, term15055.getClass(), "last", term15033);
        setField(term15055, term15055.getClass(), "propListHead", null);
        setIntField(term15055, term15055.getClass(), "sourcePosition", 0);
        setField(term15055, term15055.getClass(), "jsType", null);
        setField(term15055, term15055.getClass(), "parent", null);
        setField(term15035, term15035.getClass(), "first", term15055);
        setField(term15035, term15035.getClass(), "last", term15055);
        setField(term15035, term15035.getClass(), "propListHead", null);
        setIntField(term15035, term15035.getClass(), "sourcePosition", 0);
        setField(term15035, term15035.getClass(), "jsType", null);
        setField(term15035, term15035.getClass(), "parent", null);
        setField(term15033, term15033.getClass(), "next", term15035);
        setField(term15033, term15033.getClass(), "first", term15039);
        setField(term15033, term15033.getClass(), "last", term15041);
        setField(term15033, term15033.getClass(), "propListHead", null);
        setIntField(term15033, term15033.getClass(), "sourcePosition", 0);
        setField(term15033, term15033.getClass(), "jsType", null);
        setField(term15033, term15033.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term15031;
        args[1] = term15033;
        try {
            callMethod(klass, "newNode", argTypes, term14932, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


