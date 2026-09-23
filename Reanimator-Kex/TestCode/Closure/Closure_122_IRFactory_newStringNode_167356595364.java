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

public class IRFactory_newStringNode_167356595364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16452;
     Object term49833;
     Object term49221;

    public IRFactory_newStringNode_167356595364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term16480 = new HashMap();
        HashMap term16489 = new HashMap();
        Set<Object> term49914 =  ((Map) term16489).keySet();
        HashSet term16488 = new HashSet((Collection<? extends Object>) term49914);
        Class<? extends Object> term49918 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term49916 = ((Class) term49918).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term49916).setAccessible(true);
        Object enum98 = ((Field) term49916).get((Object) null);
        HashMap term16512 = new HashMap();
        Set<Object> term50515 =  ((Map) term16512).keySet();
        HashSet term16511 = new HashSet((Collection<? extends Object>) term50515);
        HashMap term16529 = new HashMap();
        Set<Object> term50517 =  ((Map) term16529).keySet();
        HashSet term16528 = new HashSet((Collection<? extends Object>) term50517);
        term16452 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term16477 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term16510 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term16539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term16542 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term16543 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term16547 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term16452, term16452.getClass(), "sourceString", "RjNoEywJbC");
        setField(term16452, term16452.getClass(), "sourceFile", null);
        setField(term16452, term16452.getClass(), "sourceName", "RTTvrwwhou");
        setBooleanField(term16477, term16477.getClass(), "parseJsDocDocumentation", true);
        setBooleanField(term16477, term16477.getClass(), "isIdeMode", false);
        setField(term16477, term16477.getClass(), "annotationNames", term16480);
        setField(term16477, term16477.getClass(), "suppressionNames", term16488);
        setField(term16477, term16477.getClass(), "languageMode", enum98);
        setBooleanField(term16477, term16477.getClass(), "acceptConstKeyword", false);
        setField(term16452, term16452.getClass(), "config", term16477);
        setField(term16452, term16452.getClass(), "errorReporter", null);
        setField(term16510, term16510.getClass(), "this$0", null);
        setField(term16452, term16452.getClass(), "transformDispatcher", term16510);
        setField(term16452, term16452.getClass(), "reservedKeywords", term16511);
        setField(term16452, term16452.getClass(), "parsedComments", term16528);
        setIntField(term16539, term16539.getClass(), "type", 0);
        setField(term16539, term16539.getClass(), "next", null);
        setField(term16539, term16539.getClass(), "first", null);
        setField(term16539, term16539.getClass(), "last", null);
        setField(term16539, term16539.getClass(), "propListHead", null);
        setIntField(term16539, term16539.getClass(), "sourcePosition", 0);
        setField(term16539, term16539.getClass(), "jsType", null);
        setField(term16539, term16539.getClass(), "parent", null);
        setField(term16452, term16452.getClass(), "rootNodeJsDocHolder", term16539);
        setField(term16542, term16542.getClass(), "this$0", null);
        setField(term16452, term16452.getClass(), "fileLevelJsDocBuilder", term16542);
        setField(term16543, term16543.getClass(), "info", null);
        setField(term16543, term16543.getClass(), "documentation", null);
        setField(term16543, term16543.getClass(), "associatedNode", null);
        setField(term16543, term16543.getClass(), "visibility", null);
        setIntField(term16543, term16543.getClass(), "bitset", 0);
        setField(term16543, term16543.getClass(), "type", null);
        setField(term16543, term16543.getClass(), "thisType", null);
        setBooleanField(term16543, term16543.getClass(), "includeDocumentation", false);
        setIntField(term16543, term16543.getClass(), "originalCommentPosition", 0);
        setField(term16452, term16452.getClass(), "fileOverviewInfo", term16543);
        setIntField(term16547, term16547.getClass(), "type", 0);
        setField(term16547, term16547.getClass(), "next", null);
        setField(term16547, term16547.getClass(), "first", null);
        setField(term16547, term16547.getClass(), "last", null);
        setField(term16547, term16547.getClass(), "propListHead", null);
        setIntField(term16547, term16547.getClass(), "sourcePosition", 0);
        setField(term16547, term16547.getClass(), "jsType", null);
        setField(term16547, term16547.getClass(), "parent", null);
        setField(term16452, term16452.getClass(), "templateNode", term16547);
        HashMap term49843 = new HashMap();
        HashMap term49847 = new HashMap();
        Set<Object> term50579 =  ((Map) term49847).keySet();
        HashSet term49845 = new HashSet((Collection<? extends Object>) term50579);
        Class<? extends Object> term50582 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term50581 = ((Class) term50582).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term50581).setAccessible(true);
        Object enum99 = ((Field) term50581).get((Object) null);
        HashMap term49856 = new HashMap();
        Set<Object> term51207 =  ((Map) term49856).keySet();
        HashSet term49855 = new HashSet((Collection<? extends Object>) term51207);
        HashMap term49860 = new HashMap();
        Set<Object> term51209 =  ((Map) term49860).keySet();
        HashSet term49859 = new HashSet((Collection<? extends Object>) term51209);
        term49833 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term49841 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term49853 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term49863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49865 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term49867 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term49869 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term49833, term49833.getClass(), "sourceString", "RjNoEywJbC");
        setField(term49833, term49833.getClass(), "sourceFile", null);
        setField(term49833, term49833.getClass(), "sourceName", "RTTvrwwhou");
        setBooleanField(term49841, term49841.getClass(), "parseJsDocDocumentation", true);
        setBooleanField(term49841, term49841.getClass(), "isIdeMode", false);
        setField(term49841, term49841.getClass(), "annotationNames", term49843);
        setField(term49841, term49841.getClass(), "suppressionNames", term49845);
        setField(term49841, term49841.getClass(), "languageMode", enum99);
        setBooleanField(term49841, term49841.getClass(), "acceptConstKeyword", false);
        setField(term49833, term49833.getClass(), "config", term49841);
        setField(term49833, term49833.getClass(), "errorReporter", null);
        setField(term49853, term49853.getClass(), "this$0", null);
        setField(term49833, term49833.getClass(), "transformDispatcher", term49853);
        setField(term49833, term49833.getClass(), "reservedKeywords", term49855);
        setField(term49833, term49833.getClass(), "parsedComments", term49859);
        setIntField(term49863, term49863.getClass(), "type", 0);
        setField(term49863, term49863.getClass(), "next", null);
        setField(term49863, term49863.getClass(), "first", null);
        setField(term49863, term49863.getClass(), "last", null);
        setField(term49863, term49863.getClass(), "propListHead", null);
        setIntField(term49863, term49863.getClass(), "sourcePosition", 0);
        setField(term49863, term49863.getClass(), "jsType", null);
        setField(term49863, term49863.getClass(), "parent", null);
        setField(term49833, term49833.getClass(), "rootNodeJsDocHolder", term49863);
        setField(term49865, term49865.getClass(), "this$0", null);
        setField(term49833, term49833.getClass(), "fileLevelJsDocBuilder", term49865);
        setField(term49867, term49867.getClass(), "info", null);
        setField(term49867, term49867.getClass(), "documentation", null);
        setField(term49867, term49867.getClass(), "associatedNode", null);
        setField(term49867, term49867.getClass(), "visibility", null);
        setIntField(term49867, term49867.getClass(), "bitset", 0);
        setField(term49867, term49867.getClass(), "type", null);
        setField(term49867, term49867.getClass(), "thisType", null);
        setBooleanField(term49867, term49867.getClass(), "includeDocumentation", false);
        setIntField(term49867, term49867.getClass(), "originalCommentPosition", 0);
        setField(term49833, term49833.getClass(), "fileOverviewInfo", term49867);
        setIntField(term49869, term49869.getClass(), "type", 0);
        setField(term49869, term49869.getClass(), "next", null);
        setField(term49869, term49869.getClass(), "first", null);
        setField(term49869, term49869.getClass(), "last", null);
        setField(term49869, term49869.getClass(), "propListHead", null);
        setIntField(term49869, term49869.getClass(), "sourcePosition", 0);
        setField(term49869, term49869.getClass(), "jsType", null);
        setField(term49869, term49869.getClass(), "parent", null);
        setField(term49833, term49833.getClass(), "templateNode", term49869);
        term49221 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term49221, term49221.getClass(), "str", "JWodNQzjjV");
        setIntField(term49221, term49221.getClass(), "type", 40);
        setField(term49221, term49221.getClass(), "next", null);
        setField(term49221, term49221.getClass(), "first", null);
        setField(term49221, term49221.getClass(), "last", null);
        setField(term49221, term49221.getClass(), "propListHead", null);
        setIntField(term49221, term49221.getClass(), "sourcePosition", -1);
        setField(term49221, term49221.getClass(), "jsType", null);
        setField(term49221, term49221.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JWodNQzjjV";
        Object retValue = callMethod(klass, "newStringNode", argTypes, term16452, args);
        assertTrue(recursiveEquals(term16452, term49833));
        assertTrue(recursiveEquals(retValue, term49221));
    }

};


