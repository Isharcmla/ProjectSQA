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

public class IRFactory_newStringNode_167356595350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12429;
     Object term40260;
     Object term39840;

    public IRFactory_newStringNode_167356595350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term12457 = new HashMap();
        HashMap term12466 = new HashMap();
        Set<Object> term40305 =  ((Map) term12466).keySet();
        HashSet term12465 = new HashSet((Collection<? extends Object>) term40305);
        Class<? extends Object> term40307 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term40306 = ((Class) term40307).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term40306).setAccessible(true);
        Object enum78 = ((Field) term40306).get((Object) null);
        HashMap term12490 = new HashMap();
        Set<Object> term40626 =  ((Map) term12490).keySet();
        HashSet term12489 = new HashSet((Collection<? extends Object>) term40626);
        HashMap term12509 = new HashMap();
        Set<Object> term40627 =  ((Map) term12509).keySet();
        HashSet term12508 = new HashSet((Collection<? extends Object>) term40627);
        HashMap term12522 = new HashMap();
        Set<Object> term40628 =  ((Map) term12522).keySet();
        HashSet term12521 = new HashSet((Collection<? extends Object>) term40628);
        term12429 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term12454 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term12488 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term12534 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12537 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term12538 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term12541 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term12429, term12429.getClass(), "sourceString", "WXcZEtUKlI");
        setField(term12429, term12429.getClass(), "sourceFile", null);
        setField(term12429, term12429.getClass(), "sourceName", "IkpjUOuWQU");
        setBooleanField(term12454, term12454.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term12454, term12454.getClass(), "isIdeMode", false);
        setField(term12454, term12454.getClass(), "annotationNames", term12457);
        setField(term12454, term12454.getClass(), "suppressionNames", term12465);
        setField(term12454, term12454.getClass(), "languageMode", enum78);
        setBooleanField(term12454, term12454.getClass(), "acceptConstKeyword", false);
        setField(term12429, term12429.getClass(), "config", term12454);
        setField(term12429, term12429.getClass(), "errorReporter", null);
        setField(term12488, term12488.getClass(), "this$0", null);
        setField(term12429, term12429.getClass(), "transformDispatcher", term12488);
        setField(term12429, term12429.getClass(), "ALLOWED_DIRECTIVES", term12489);
        setField(term12429, term12429.getClass(), "reservedKeywords", term12508);
        setField(term12429, term12429.getClass(), "parsedComments", term12521);
        setIntField(term12534, term12534.getClass(), "type", 0);
        setField(term12534, term12534.getClass(), "next", null);
        setField(term12534, term12534.getClass(), "first", null);
        setField(term12534, term12534.getClass(), "last", null);
        setField(term12534, term12534.getClass(), "propListHead", null);
        setIntField(term12534, term12534.getClass(), "sourcePosition", 0);
        setField(term12534, term12534.getClass(), "jsType", null);
        setField(term12534, term12534.getClass(), "parent", null);
        setField(term12429, term12429.getClass(), "rootNodeJsDocHolder", term12534);
        setField(term12537, term12537.getClass(), "this$0", null);
        setField(term12429, term12429.getClass(), "fileLevelJsDocBuilder", term12537);
        setField(term12538, term12538.getClass(), "info", null);
        setField(term12538, term12538.getClass(), "documentation", null);
        setField(term12538, term12538.getClass(), "associatedNode", null);
        setField(term12538, term12538.getClass(), "visibility", null);
        setIntField(term12538, term12538.getClass(), "bitset", 0);
        setField(term12538, term12538.getClass(), "type", null);
        setField(term12538, term12538.getClass(), "thisType", null);
        setBooleanField(term12538, term12538.getClass(), "includeDocumentation", false);
        setField(term12429, term12429.getClass(), "fileOverviewInfo", term12538);
        setIntField(term12541, term12541.getClass(), "type", 0);
        setField(term12541, term12541.getClass(), "next", null);
        setField(term12541, term12541.getClass(), "first", null);
        setField(term12541, term12541.getClass(), "last", null);
        setField(term12541, term12541.getClass(), "propListHead", null);
        setIntField(term12541, term12541.getClass(), "sourcePosition", 0);
        setField(term12541, term12541.getClass(), "jsType", null);
        setField(term12541, term12541.getClass(), "parent", null);
        setField(term12429, term12429.getClass(), "templateNode", term12541);
        HashMap term40266 = new HashMap();
        HashMap term40268 = new HashMap();
        Set<Object> term40659 =  ((Map) term40268).keySet();
        HashSet term40267 = new HashSet((Collection<? extends Object>) term40659);
        Class<? extends Object> term40661 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term40660 = ((Class) term40661).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term40660).setAccessible(true);
        Object enum79 = ((Field) term40660).get((Object) null);
        HashMap term40274 = new HashMap();
        Set<Object> term40980 =  ((Map) term40274).keySet();
        HashSet term40273 = new HashSet((Collection<? extends Object>) term40980);
        HashMap term40276 = new HashMap();
        Set<Object> term40981 =  ((Map) term40276).keySet();
        HashSet term40275 = new HashSet((Collection<? extends Object>) term40981);
        HashMap term40278 = new HashMap();
        Set<Object> term40982 =  ((Map) term40278).keySet();
        HashSet term40277 = new HashSet((Collection<? extends Object>) term40982);
        term40260 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term40265 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term40272 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term40279 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term40280 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term40281 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term40282 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term40260, term40260.getClass(), "sourceString", "WXcZEtUKlI");
        setField(term40260, term40260.getClass(), "sourceFile", null);
        setField(term40260, term40260.getClass(), "sourceName", "IkpjUOuWQU");
        setBooleanField(term40265, term40265.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term40265, term40265.getClass(), "isIdeMode", false);
        setField(term40265, term40265.getClass(), "annotationNames", term40266);
        setField(term40265, term40265.getClass(), "suppressionNames", term40267);
        setField(term40265, term40265.getClass(), "languageMode", enum79);
        setBooleanField(term40265, term40265.getClass(), "acceptConstKeyword", false);
        setField(term40260, term40260.getClass(), "config", term40265);
        setField(term40260, term40260.getClass(), "errorReporter", null);
        setField(term40272, term40272.getClass(), "this$0", null);
        setField(term40260, term40260.getClass(), "transformDispatcher", term40272);
        setField(term40260, term40260.getClass(), "ALLOWED_DIRECTIVES", term40273);
        setField(term40260, term40260.getClass(), "reservedKeywords", term40275);
        setField(term40260, term40260.getClass(), "parsedComments", term40277);
        setIntField(term40279, term40279.getClass(), "type", 0);
        setField(term40279, term40279.getClass(), "next", null);
        setField(term40279, term40279.getClass(), "first", null);
        setField(term40279, term40279.getClass(), "last", null);
        setField(term40279, term40279.getClass(), "propListHead", null);
        setIntField(term40279, term40279.getClass(), "sourcePosition", 0);
        setField(term40279, term40279.getClass(), "jsType", null);
        setField(term40279, term40279.getClass(), "parent", null);
        setField(term40260, term40260.getClass(), "rootNodeJsDocHolder", term40279);
        setField(term40280, term40280.getClass(), "this$0", null);
        setField(term40260, term40260.getClass(), "fileLevelJsDocBuilder", term40280);
        setField(term40281, term40281.getClass(), "info", null);
        setField(term40281, term40281.getClass(), "documentation", null);
        setField(term40281, term40281.getClass(), "associatedNode", null);
        setField(term40281, term40281.getClass(), "visibility", null);
        setIntField(term40281, term40281.getClass(), "bitset", 0);
        setField(term40281, term40281.getClass(), "type", null);
        setField(term40281, term40281.getClass(), "thisType", null);
        setBooleanField(term40281, term40281.getClass(), "includeDocumentation", false);
        setField(term40260, term40260.getClass(), "fileOverviewInfo", term40281);
        setIntField(term40282, term40282.getClass(), "type", 0);
        setField(term40282, term40282.getClass(), "next", null);
        setField(term40282, term40282.getClass(), "first", null);
        setField(term40282, term40282.getClass(), "last", null);
        setField(term40282, term40282.getClass(), "propListHead", null);
        setIntField(term40282, term40282.getClass(), "sourcePosition", 0);
        setField(term40282, term40282.getClass(), "jsType", null);
        setField(term40282, term40282.getClass(), "parent", null);
        setField(term40260, term40260.getClass(), "templateNode", term40282);
        term39840 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term39840, term39840.getClass(), "str", "KAORSSPSeV");
        setIntField(term39840, term39840.getClass(), "type", 40);
        setField(term39840, term39840.getClass(), "next", null);
        setField(term39840, term39840.getClass(), "first", null);
        setField(term39840, term39840.getClass(), "last", null);
        setField(term39840, term39840.getClass(), "propListHead", null);
        setIntField(term39840, term39840.getClass(), "sourcePosition", -1);
        setField(term39840, term39840.getClass(), "jsType", null);
        setField(term39840, term39840.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "KAORSSPSeV";
        Object retValue = callMethod(klass, "newStringNode", argTypes, term12429, args);
        assertTrue(recursiveEquals(term12429, term40260));
        assertTrue(recursiveEquals(retValue, term39840));
    }

};


