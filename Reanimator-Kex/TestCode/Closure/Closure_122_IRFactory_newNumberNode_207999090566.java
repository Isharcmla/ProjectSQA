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
import java.lang.Double;

public class IRFactory_newNumberNode_207999090566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17387;
     Object term17499;
     Object term51387;
     Object term51408;
     Object term51295;

    public IRFactory_newNumberNode_207999090566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term17415 = new HashMap();
        HashMap term17424 = new HashMap();
        Set<Object> term51429 =  ((Map) term17424).keySet();
        HashSet term17423 = new HashSet((Collection<? extends Object>) term51429);
        Class<? extends Object> term51431 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term51430 = ((Class) term51431).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term51430).setAccessible(true);
        Object enum101 = ((Field) term51430).get((Object) null);
        HashMap term17455 = new HashMap();
        Set<Object> term51771 =  ((Map) term17455).keySet();
        HashSet term17454 = new HashSet((Collection<? extends Object>) term51771);
        HashMap term17470 = new HashMap();
        Set<Object> term51772 =  ((Map) term17470).keySet();
        HashSet term17469 = new HashSet((Collection<? extends Object>) term51772);
        term17387 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term17412 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term17453 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term17488 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17491 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term17492 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term17496 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term17387, term17387.getClass(), "sourceString", "BXTjEyEZxD");
        setField(term17387, term17387.getClass(), "sourceFile", null);
        setField(term17387, term17387.getClass(), "sourceName", "oKhVzOKUFW");
        setBooleanField(term17412, term17412.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term17412, term17412.getClass(), "isIdeMode", true);
        setField(term17412, term17412.getClass(), "annotationNames", term17415);
        setField(term17412, term17412.getClass(), "suppressionNames", term17423);
        setField(term17412, term17412.getClass(), "languageMode", enum101);
        setBooleanField(term17412, term17412.getClass(), "acceptConstKeyword", true);
        setField(term17387, term17387.getClass(), "config", term17412);
        setField(term17387, term17387.getClass(), "errorReporter", null);
        setField(term17453, term17453.getClass(), "this$0", null);
        setField(term17387, term17387.getClass(), "transformDispatcher", term17453);
        setField(term17387, term17387.getClass(), "reservedKeywords", term17454);
        setField(term17387, term17387.getClass(), "parsedComments", term17469);
        setIntField(term17488, term17488.getClass(), "type", 0);
        setField(term17488, term17488.getClass(), "next", null);
        setField(term17488, term17488.getClass(), "first", null);
        setField(term17488, term17488.getClass(), "last", null);
        setField(term17488, term17488.getClass(), "propListHead", null);
        setIntField(term17488, term17488.getClass(), "sourcePosition", 0);
        setField(term17488, term17488.getClass(), "jsType", null);
        setField(term17488, term17488.getClass(), "parent", null);
        setField(term17387, term17387.getClass(), "rootNodeJsDocHolder", term17488);
        setField(term17491, term17491.getClass(), "this$0", null);
        setField(term17387, term17387.getClass(), "fileLevelJsDocBuilder", term17491);
        setField(term17492, term17492.getClass(), "info", null);
        setField(term17492, term17492.getClass(), "documentation", null);
        setField(term17492, term17492.getClass(), "associatedNode", null);
        setField(term17492, term17492.getClass(), "visibility", null);
        setIntField(term17492, term17492.getClass(), "bitset", 0);
        setField(term17492, term17492.getClass(), "type", null);
        setField(term17492, term17492.getClass(), "thisType", null);
        setBooleanField(term17492, term17492.getClass(), "includeDocumentation", false);
        setIntField(term17492, term17492.getClass(), "originalCommentPosition", 0);
        setField(term17387, term17387.getClass(), "fileOverviewInfo", term17492);
        setIntField(term17496, term17496.getClass(), "type", 0);
        setField(term17496, term17496.getClass(), "next", null);
        setField(term17496, term17496.getClass(), "first", null);
        setField(term17496, term17496.getClass(), "last", null);
        setField(term17496, term17496.getClass(), "propListHead", null);
        setIntField(term17496, term17496.getClass(), "sourcePosition", 0);
        setField(term17496, term17496.getClass(), "jsType", null);
        setField(term17496, term17496.getClass(), "parent", null);
        setField(term17387, term17387.getClass(), "templateNode", term17496);
        term17499 = new Double(0.13238746331190498);
        HashMap term51393 = new HashMap();
        HashMap term51395 = new HashMap();
        Set<Object> term51793 =  ((Map) term51395).keySet();
        HashSet term51394 = new HashSet((Collection<? extends Object>) term51793);
        Class<? extends Object> term51795 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term51794 = ((Class) term51795).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term51794).setAccessible(true);
        Object enum102 = ((Field) term51794).get((Object) null);
        HashMap term51401 = new HashMap();
        Set<Object> term52135 =  ((Map) term51401).keySet();
        HashSet term51400 = new HashSet((Collection<? extends Object>) term52135);
        HashMap term51403 = new HashMap();
        Set<Object> term52136 =  ((Map) term51403).keySet();
        HashSet term51402 = new HashSet((Collection<? extends Object>) term52136);
        term51387 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term51392 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term51399 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term51404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term51405 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term51406 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term51407 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term51387, term51387.getClass(), "sourceString", "BXTjEyEZxD");
        setField(term51387, term51387.getClass(), "sourceFile", null);
        setField(term51387, term51387.getClass(), "sourceName", "oKhVzOKUFW");
        setBooleanField(term51392, term51392.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term51392, term51392.getClass(), "isIdeMode", true);
        setField(term51392, term51392.getClass(), "annotationNames", term51393);
        setField(term51392, term51392.getClass(), "suppressionNames", term51394);
        setField(term51392, term51392.getClass(), "languageMode", enum102);
        setBooleanField(term51392, term51392.getClass(), "acceptConstKeyword", true);
        setField(term51387, term51387.getClass(), "config", term51392);
        setField(term51387, term51387.getClass(), "errorReporter", null);
        setField(term51399, term51399.getClass(), "this$0", null);
        setField(term51387, term51387.getClass(), "transformDispatcher", term51399);
        setField(term51387, term51387.getClass(), "reservedKeywords", term51400);
        setField(term51387, term51387.getClass(), "parsedComments", term51402);
        setIntField(term51404, term51404.getClass(), "type", 0);
        setField(term51404, term51404.getClass(), "next", null);
        setField(term51404, term51404.getClass(), "first", null);
        setField(term51404, term51404.getClass(), "last", null);
        setField(term51404, term51404.getClass(), "propListHead", null);
        setIntField(term51404, term51404.getClass(), "sourcePosition", 0);
        setField(term51404, term51404.getClass(), "jsType", null);
        setField(term51404, term51404.getClass(), "parent", null);
        setField(term51387, term51387.getClass(), "rootNodeJsDocHolder", term51404);
        setField(term51405, term51405.getClass(), "this$0", null);
        setField(term51387, term51387.getClass(), "fileLevelJsDocBuilder", term51405);
        setField(term51406, term51406.getClass(), "info", null);
        setField(term51406, term51406.getClass(), "documentation", null);
        setField(term51406, term51406.getClass(), "associatedNode", null);
        setField(term51406, term51406.getClass(), "visibility", null);
        setIntField(term51406, term51406.getClass(), "bitset", 0);
        setField(term51406, term51406.getClass(), "type", null);
        setField(term51406, term51406.getClass(), "thisType", null);
        setBooleanField(term51406, term51406.getClass(), "includeDocumentation", false);
        setIntField(term51406, term51406.getClass(), "originalCommentPosition", 0);
        setField(term51387, term51387.getClass(), "fileOverviewInfo", term51406);
        setIntField(term51407, term51407.getClass(), "type", 0);
        setField(term51407, term51407.getClass(), "next", null);
        setField(term51407, term51407.getClass(), "first", null);
        setField(term51407, term51407.getClass(), "last", null);
        setField(term51407, term51407.getClass(), "propListHead", null);
        setIntField(term51407, term51407.getClass(), "sourcePosition", 0);
        setField(term51407, term51407.getClass(), "jsType", null);
        setField(term51407, term51407.getClass(), "parent", null);
        setField(term51387, term51387.getClass(), "templateNode", term51407);
        term51408 = new Double(0.13238746331190498);
        term51295 = newInstance(Class.forName("com.google.javascript.rhino.Node$NumberNode"));
        setDoubleField(term51295, term51295.getClass(), "number", 0.13238746331190498);
        setIntField(term51295, term51295.getClass(), "type", 39);
        setField(term51295, term51295.getClass(), "next", null);
        setField(term51295, term51295.getClass(), "first", null);
        setField(term51295, term51295.getClass(), "last", null);
        setField(term51295, term51295.getClass(), "propListHead", null);
        setIntField(term51295, term51295.getClass(), "sourcePosition", -1);
        setField(term51295, term51295.getClass(), "jsType", null);
        setField(term51295, term51295.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Double");
        Object[] args = new Object[1];
        args[0] = term17499;
        Object retValue = callMethod(klass, "newNumberNode", argTypes, term17387, args);
        assertTrue(recursiveEquals(term17387, term51387));
        assertTrue(recursiveEquals(term17499, term51408));
        assertTrue(recursiveEquals(retValue, term51295));
    }

};


