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
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.parsing.EqualityUtils.*;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class IRFactory_createTemplateNode_44852679336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443;
     Object term19326;
     Object term19232;

    public IRFactory_createTemplateNode_44852679336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term471 = new HashMap();
        HashMap term480 = new HashMap();
        Set<Object> term19367 =  ((Map) term480).keySet();
        HashSet term479 = new HashSet((Collection<? extends Object>) term19367);
        Class<? extends Object> term19369 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term19368 = ((Class) term19369).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term19368).setAccessible(true);
        Object enum41 = ((Field) term19368).get((Object) null);
        HashMap term511 = new HashMap();
        Set<Object> term19709 =  ((Map) term511).keySet();
        HashSet term510 = new HashSet((Collection<? extends Object>) term19709);
        HashMap term524 = new HashMap();
        Set<Object> term19710 =  ((Map) term524).keySet();
        HashSet term523 = new HashSet((Collection<? extends Object>) term19710);
        term443 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term468 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term509 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term536 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term539 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term540 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term544 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term443, term443.getClass(), "sourceString", "MjGYSRKTNF");
        setField(term443, term443.getClass(), "sourceFile", null);
        setField(term443, term443.getClass(), "sourceName", "hRNSzYYIrc");
        setBooleanField(term468, term468.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term468, term468.getClass(), "isIdeMode", true);
        setField(term468, term468.getClass(), "annotationNames", term471);
        setField(term468, term468.getClass(), "suppressionNames", term479);
        setField(term468, term468.getClass(), "languageMode", enum41);
        setBooleanField(term468, term468.getClass(), "acceptConstKeyword", true);
        setField(term443, term443.getClass(), "config", term468);
        setField(term443, term443.getClass(), "errorReporter", null);
        setField(term509, term509.getClass(), "this$0", null);
        setField(term443, term443.getClass(), "transformDispatcher", term509);
        setField(term443, term443.getClass(), "reservedKeywords", term510);
        setField(term443, term443.getClass(), "parsedComments", term523);
        setIntField(term536, term536.getClass(), "type", 0);
        setField(term536, term536.getClass(), "next", null);
        setField(term536, term536.getClass(), "first", null);
        setField(term536, term536.getClass(), "last", null);
        setField(term536, term536.getClass(), "propListHead", null);
        setIntField(term536, term536.getClass(), "sourcePosition", 0);
        setField(term536, term536.getClass(), "jsType", null);
        setField(term536, term536.getClass(), "parent", null);
        setField(term443, term443.getClass(), "rootNodeJsDocHolder", term536);
        setField(term539, term539.getClass(), "this$0", null);
        setField(term443, term443.getClass(), "fileLevelJsDocBuilder", term539);
        setField(term540, term540.getClass(), "info", null);
        setField(term540, term540.getClass(), "documentation", null);
        setField(term540, term540.getClass(), "associatedNode", null);
        setField(term540, term540.getClass(), "visibility", null);
        setIntField(term540, term540.getClass(), "bitset", 0);
        setField(term540, term540.getClass(), "type", null);
        setField(term540, term540.getClass(), "thisType", null);
        setBooleanField(term540, term540.getClass(), "includeDocumentation", false);
        setIntField(term540, term540.getClass(), "originalCommentPosition", 0);
        setField(term443, term443.getClass(), "fileOverviewInfo", term540);
        setIntField(term544, term544.getClass(), "type", 0);
        setField(term544, term544.getClass(), "next", null);
        setField(term544, term544.getClass(), "first", null);
        setField(term544, term544.getClass(), "last", null);
        setField(term544, term544.getClass(), "propListHead", null);
        setIntField(term544, term544.getClass(), "sourcePosition", 0);
        setField(term544, term544.getClass(), "jsType", null);
        setField(term544, term544.getClass(), "parent", null);
        setField(term443, term443.getClass(), "templateNode", term544);
        HashMap term19332 = new HashMap();
        HashMap term19334 = new HashMap();
        Set<Object> term19731 =  ((Map) term19334).keySet();
        HashSet term19333 = new HashSet((Collection<? extends Object>) term19731);
        Class<? extends Object> term19733 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term19732 = ((Class) term19733).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term19732).setAccessible(true);
        Object enum42 = ((Field) term19732).get((Object) null);
        HashMap term19340 = new HashMap();
        Set<Object> term20073 =  ((Map) term19340).keySet();
        HashSet term19339 = new HashSet((Collection<? extends Object>) term20073);
        HashMap term19342 = new HashMap();
        Set<Object> term20074 =  ((Map) term19342).keySet();
        HashSet term19341 = new HashSet((Collection<? extends Object>) term20074);
        term19326 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term19331 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term19338 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term19343 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19344 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term19345 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term19346 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term19326, term19326.getClass(), "sourceString", "MjGYSRKTNF");
        setField(term19326, term19326.getClass(), "sourceFile", null);
        setField(term19326, term19326.getClass(), "sourceName", "hRNSzYYIrc");
        setBooleanField(term19331, term19331.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term19331, term19331.getClass(), "isIdeMode", true);
        setField(term19331, term19331.getClass(), "annotationNames", term19332);
        setField(term19331, term19331.getClass(), "suppressionNames", term19333);
        setField(term19331, term19331.getClass(), "languageMode", enum42);
        setBooleanField(term19331, term19331.getClass(), "acceptConstKeyword", true);
        setField(term19326, term19326.getClass(), "config", term19331);
        setField(term19326, term19326.getClass(), "errorReporter", null);
        setField(term19338, term19338.getClass(), "this$0", null);
        setField(term19326, term19326.getClass(), "transformDispatcher", term19338);
        setField(term19326, term19326.getClass(), "reservedKeywords", term19339);
        setField(term19326, term19326.getClass(), "parsedComments", term19341);
        setIntField(term19343, term19343.getClass(), "type", 0);
        setField(term19343, term19343.getClass(), "next", null);
        setField(term19343, term19343.getClass(), "first", null);
        setField(term19343, term19343.getClass(), "last", null);
        setField(term19343, term19343.getClass(), "propListHead", null);
        setIntField(term19343, term19343.getClass(), "sourcePosition", 0);
        setField(term19343, term19343.getClass(), "jsType", null);
        setField(term19343, term19343.getClass(), "parent", null);
        setField(term19326, term19326.getClass(), "rootNodeJsDocHolder", term19343);
        setField(term19344, term19344.getClass(), "this$0", null);
        setField(term19326, term19326.getClass(), "fileLevelJsDocBuilder", term19344);
        setField(term19345, term19345.getClass(), "info", null);
        setField(term19345, term19345.getClass(), "documentation", null);
        setField(term19345, term19345.getClass(), "associatedNode", null);
        setField(term19345, term19345.getClass(), "visibility", null);
        setIntField(term19345, term19345.getClass(), "bitset", 0);
        setField(term19345, term19345.getClass(), "type", null);
        setField(term19345, term19345.getClass(), "thisType", null);
        setBooleanField(term19345, term19345.getClass(), "includeDocumentation", false);
        setIntField(term19345, term19345.getClass(), "originalCommentPosition", 0);
        setField(term19326, term19326.getClass(), "fileOverviewInfo", term19345);
        setIntField(term19346, term19346.getClass(), "type", 0);
        setField(term19346, term19346.getClass(), "next", null);
        setField(term19346, term19346.getClass(), "first", null);
        setField(term19346, term19346.getClass(), "last", null);
        setField(term19346, term19346.getClass(), "propListHead", null);
        setIntField(term19346, term19346.getClass(), "sourcePosition", 0);
        setField(term19346, term19346.getClass(), "jsType", null);
        setField(term19346, term19346.getClass(), "parent", null);
        setField(term19326, term19326.getClass(), "templateNode", term19346);
        term19232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term19232, term19232.getClass(), "type", 132);
        setField(term19232, term19232.getClass(), "next", null);
        setField(term19232, term19232.getClass(), "first", null);
        setField(term19232, term19232.getClass(), "last", null);
        setField(term19232, term19232.getClass(), "propListHead", null);
        setIntField(term19232, term19232.getClass(), "sourcePosition", -1);
        setField(term19232, term19232.getClass(), "jsType", null);
        setField(term19232, term19232.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "createTemplateNode", argTypes, term443, args);
        assertTrue(recursiveEquals(term443, term19326));
        assertTrue(recursiveEquals(retValue, term19232));
    }

};


