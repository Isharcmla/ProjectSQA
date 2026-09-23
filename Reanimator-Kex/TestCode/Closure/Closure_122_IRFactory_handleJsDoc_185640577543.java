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

public class IRFactory_handleJsDoc_185640577543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5599;
     Object term5707;

    public IRFactory_handleJsDoc_185640577543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term5627 = new HashMap();
        HashMap term5636 = new HashMap();
        Set<Object> term32457 =  ((Map) term5636).keySet();
        HashSet term5635 = new HashSet((Collection<? extends Object>) term32457);
        Class<? extends Object> term32459 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term32458 = ((Class) term32459).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term32458).setAccessible(true);
        Object enum66 = ((Field) term32458).get((Object) null);
        HashMap term5659 = new HashMap();
        Set<Object> term32778 =  ((Map) term5659).keySet();
        HashSet term5658 = new HashSet((Collection<? extends Object>) term32778);
        HashMap term5682 = new HashMap();
        Set<Object> term32779 =  ((Map) term5682).keySet();
        HashSet term5681 = new HashSet((Collection<? extends Object>) term32779);
        term5599 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term5624 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term5657 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term5696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5699 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term5700 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term5704 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term5599, term5599.getClass(), "sourceString", "fWKJoSoCwE");
        setField(term5599, term5599.getClass(), "sourceFile", null);
        setField(term5599, term5599.getClass(), "sourceName", "wfaXBpWAUH");
        setBooleanField(term5624, term5624.getClass(), "parseJsDocDocumentation", true);
        setBooleanField(term5624, term5624.getClass(), "isIdeMode", true);
        setField(term5624, term5624.getClass(), "annotationNames", term5627);
        setField(term5624, term5624.getClass(), "suppressionNames", term5635);
        setField(term5624, term5624.getClass(), "languageMode", enum66);
        setBooleanField(term5624, term5624.getClass(), "acceptConstKeyword", false);
        setField(term5599, term5599.getClass(), "config", term5624);
        setField(term5599, term5599.getClass(), "errorReporter", null);
        setField(term5657, term5657.getClass(), "this$0", null);
        setField(term5599, term5599.getClass(), "transformDispatcher", term5657);
        setField(term5599, term5599.getClass(), "reservedKeywords", term5658);
        setField(term5599, term5599.getClass(), "parsedComments", term5681);
        setIntField(term5696, term5696.getClass(), "type", 0);
        setField(term5696, term5696.getClass(), "next", null);
        setField(term5696, term5696.getClass(), "first", null);
        setField(term5696, term5696.getClass(), "last", null);
        setField(term5696, term5696.getClass(), "propListHead", null);
        setIntField(term5696, term5696.getClass(), "sourcePosition", 0);
        setField(term5696, term5696.getClass(), "jsType", null);
        setField(term5696, term5696.getClass(), "parent", null);
        setField(term5599, term5599.getClass(), "rootNodeJsDocHolder", term5696);
        setField(term5699, term5699.getClass(), "this$0", null);
        setField(term5599, term5599.getClass(), "fileLevelJsDocBuilder", term5699);
        setField(term5700, term5700.getClass(), "info", null);
        setField(term5700, term5700.getClass(), "documentation", null);
        setField(term5700, term5700.getClass(), "associatedNode", null);
        setField(term5700, term5700.getClass(), "visibility", null);
        setIntField(term5700, term5700.getClass(), "bitset", 0);
        setField(term5700, term5700.getClass(), "type", null);
        setField(term5700, term5700.getClass(), "thisType", null);
        setBooleanField(term5700, term5700.getClass(), "includeDocumentation", false);
        setIntField(term5700, term5700.getClass(), "originalCommentPosition", 0);
        setField(term5599, term5599.getClass(), "fileOverviewInfo", term5700);
        setIntField(term5704, term5704.getClass(), "type", 0);
        setField(term5704, term5704.getClass(), "next", null);
        setField(term5704, term5704.getClass(), "first", null);
        setField(term5704, term5704.getClass(), "last", null);
        setField(term5704, term5704.getClass(), "propListHead", null);
        setIntField(term5704, term5704.getClass(), "sourcePosition", 0);
        setField(term5704, term5704.getClass(), "jsType", null);
        setField(term5704, term5704.getClass(), "parent", null);
        setField(term5599, term5599.getClass(), "templateNode", term5704);
        term5707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5718 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term5729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term5707, term5707.getClass(), "type", 1953277050);
        setIntField(term5709, term5709.getClass(), "type", 1283079251);
        setIntField(term5711, term5711.getClass(), "type", -523949691);
        setIntField(term5713, term5713.getClass(), "type", 1398204340);
        setIntField(term5715, term5715.getClass(), "type", 229204365);
        setField(term5715, term5715.getClass(), "next", null);
        setField(term5715, term5715.getClass(), "first", null);
        setField(term5715, term5715.getClass(), "last", null);
        setField(term5715, term5715.getClass(), "propListHead", null);
        setIntField(term5715, term5715.getClass(), "sourcePosition", 0);
        setField(term5715, term5715.getClass(), "jsType", null);
        setField(term5715, term5715.getClass(), "parent", null);
        setField(term5713, term5713.getClass(), "next", term5715);
        setIntField(term5718, term5718.getClass(), "type", -461771056);
        setField(term5718, term5718.getClass(), "next", null);
        setField(term5718, term5718.getClass(), "first", null);
        setField(term5718, term5718.getClass(), "last", term5715);
        setField(term5718, term5718.getClass(), "propListHead", null);
        setIntField(term5718, term5718.getClass(), "sourcePosition", 0);
        setField(term5718, term5718.getClass(), "jsType", null);
        setField(term5718, term5718.getClass(), "parent", null);
        setField(term5713, term5713.getClass(), "first", term5718);
        setField(term5713, term5713.getClass(), "last", term5711);
        setField(term5713, term5713.getClass(), "propListHead", null);
        setIntField(term5713, term5713.getClass(), "sourcePosition", 0);
        setField(term5713, term5713.getClass(), "jsType", null);
        setField(term5713, term5713.getClass(), "parent", null);
        setField(term5711, term5711.getClass(), "next", term5713);
        setField(term5711, term5711.getClass(), "first", term5715);
        setIntField(term5722, term5722.getClass(), "type", 1384592638);
        setIntField(term5724, term5724.getClass(), "type", -1002370457);
        setField(term5724, term5724.getClass(), "next", null);
        setField(term5724, term5724.getClass(), "first", term5718);
        setField(term5724, term5724.getClass(), "last", term5713);
        setField(term5724, term5724.getClass(), "propListHead", null);
        setIntField(term5724, term5724.getClass(), "sourcePosition", 0);
        setField(term5724, term5724.getClass(), "jsType", null);
        setField(term5724, term5724.getClass(), "parent", null);
        setField(term5722, term5722.getClass(), "next", term5724);
        setField(term5722, term5722.getClass(), "first", term5709);
        setField(term5722, term5722.getClass(), "last", term5709);
        setField(term5722, term5722.getClass(), "propListHead", null);
        setIntField(term5722, term5722.getClass(), "sourcePosition", 0);
        setField(term5722, term5722.getClass(), "jsType", null);
        setField(term5722, term5722.getClass(), "parent", null);
        setField(term5711, term5711.getClass(), "last", term5722);
        setField(term5711, term5711.getClass(), "propListHead", null);
        setIntField(term5711, term5711.getClass(), "sourcePosition", 0);
        setField(term5711, term5711.getClass(), "jsType", null);
        setField(term5711, term5711.getClass(), "parent", null);
        setField(term5709, term5709.getClass(), "next", term5711);
        setIntField(term5729, term5729.getClass(), "type", -2014576105);
        setField(term5729, term5729.getClass(), "next", term5722);
        setField(term5729, term5729.getClass(), "first", term5724);
        setField(term5729, term5729.getClass(), "last", term5707);
        setField(term5729, term5729.getClass(), "propListHead", null);
        setIntField(term5729, term5729.getClass(), "sourcePosition", 0);
        setField(term5729, term5729.getClass(), "jsType", null);
        setField(term5729, term5729.getClass(), "parent", null);
        setField(term5709, term5709.getClass(), "first", term5729);
        setField(term5709, term5709.getClass(), "last", term5729);
        setField(term5709, term5709.getClass(), "propListHead", null);
        setIntField(term5709, term5709.getClass(), "sourcePosition", 0);
        setField(term5709, term5709.getClass(), "jsType", null);
        setField(term5709, term5709.getClass(), "parent", null);
        setField(term5707, term5707.getClass(), "next", term5709);
        setField(term5707, term5707.getClass(), "first", term5713);
        setField(term5707, term5707.getClass(), "last", term5715);
        setField(term5707, term5707.getClass(), "propListHead", null);
        setIntField(term5707, term5707.getClass(), "sourcePosition", 0);
        setField(term5707, term5707.getClass(), "jsType", null);
        setField(term5707, term5707.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term5707;
        try {
            callMethod(klass, "handleJsDoc", argTypes, term5599, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


