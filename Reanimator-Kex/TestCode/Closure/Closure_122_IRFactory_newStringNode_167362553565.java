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
import java.lang.Integer;

public class IRFactory_newStringNode_167362553565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16915;
     Object term17020;
     Object term49833;
     Object term49396;

    public IRFactory_newStringNode_167362553565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term16943 = new HashMap();
        HashMap term16952 = new HashMap();
        Set<Object> term49915 =  ((Map) term16952).keySet();
        HashSet term16951 = new HashSet((Collection<? extends Object>) term49915);
        Class<? extends Object> term49919 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term49917 = ((Class) term49919).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term49917).setAccessible(true);
        Object enum98 = ((Field) term49917).get((Object) null);
        HashMap term16976 = new HashMap();
        Set<Object> term50516 =  ((Map) term16976).keySet();
        HashSet term16975 = new HashSet((Collection<? extends Object>) term50516);
        HashMap term16993 = new HashMap();
        Set<Object> term50518 =  ((Map) term16993).keySet();
        HashSet term16992 = new HashSet((Collection<? extends Object>) term50518);
        term16915 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term16940 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term16974 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term17009 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17012 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term17013 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term17017 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term16915, term16915.getClass(), "sourceString", "CAgxWjhxNf");
        setField(term16915, term16915.getClass(), "sourceFile", null);
        setField(term16915, term16915.getClass(), "sourceName", "goAoCMhKBu");
        setBooleanField(term16940, term16940.getClass(), "parseJsDocDocumentation", true);
        setBooleanField(term16940, term16940.getClass(), "isIdeMode", true);
        setField(term16940, term16940.getClass(), "annotationNames", term16943);
        setField(term16940, term16940.getClass(), "suppressionNames", term16951);
        setField(term16940, term16940.getClass(), "languageMode", enum98);
        setBooleanField(term16940, term16940.getClass(), "acceptConstKeyword", true);
        setField(term16915, term16915.getClass(), "config", term16940);
        setField(term16915, term16915.getClass(), "errorReporter", null);
        setField(term16974, term16974.getClass(), "this$0", null);
        setField(term16915, term16915.getClass(), "transformDispatcher", term16974);
        setField(term16915, term16915.getClass(), "reservedKeywords", term16975);
        setField(term16915, term16915.getClass(), "parsedComments", term16992);
        setIntField(term17009, term17009.getClass(), "type", 0);
        setField(term17009, term17009.getClass(), "next", null);
        setField(term17009, term17009.getClass(), "first", null);
        setField(term17009, term17009.getClass(), "last", null);
        setField(term17009, term17009.getClass(), "propListHead", null);
        setIntField(term17009, term17009.getClass(), "sourcePosition", 0);
        setField(term17009, term17009.getClass(), "jsType", null);
        setField(term17009, term17009.getClass(), "parent", null);
        setField(term16915, term16915.getClass(), "rootNodeJsDocHolder", term17009);
        setField(term17012, term17012.getClass(), "this$0", null);
        setField(term16915, term16915.getClass(), "fileLevelJsDocBuilder", term17012);
        setField(term17013, term17013.getClass(), "info", null);
        setField(term17013, term17013.getClass(), "documentation", null);
        setField(term17013, term17013.getClass(), "associatedNode", null);
        setField(term17013, term17013.getClass(), "visibility", null);
        setIntField(term17013, term17013.getClass(), "bitset", 0);
        setField(term17013, term17013.getClass(), "type", null);
        setField(term17013, term17013.getClass(), "thisType", null);
        setBooleanField(term17013, term17013.getClass(), "includeDocumentation", false);
        setIntField(term17013, term17013.getClass(), "originalCommentPosition", 0);
        setField(term16915, term16915.getClass(), "fileOverviewInfo", term17013);
        setIntField(term17017, term17017.getClass(), "type", 0);
        setField(term17017, term17017.getClass(), "next", null);
        setField(term17017, term17017.getClass(), "first", null);
        setField(term17017, term17017.getClass(), "last", null);
        setField(term17017, term17017.getClass(), "propListHead", null);
        setIntField(term17017, term17017.getClass(), "sourcePosition", 0);
        setField(term17017, term17017.getClass(), "jsType", null);
        setField(term17017, term17017.getClass(), "parent", null);
        setField(term16915, term16915.getClass(), "templateNode", term17017);
        term17020 = new Integer(279384872);
        HashMap term49842 = new HashMap();
        HashMap term49846 = new HashMap();
        Set<Object> term50580 =  ((Map) term49846).keySet();
        HashSet term49844 = new HashSet((Collection<? extends Object>) term50580);
        Class<? extends Object> term50643 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term50642 = ((Class) term50643).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term50642).setAccessible(true);
        Object enum100 = ((Field) term50642).get((Object) null);
        HashMap term49858 = new HashMap();
        Set<Object> term51208 =  ((Map) term49858).keySet();
        HashSet term49857 = new HashSet((Collection<? extends Object>) term51208);
        HashMap term49862 = new HashMap();
        Set<Object> term51211 =  ((Map) term49862).keySet();
        HashSet term49861 = new HashSet((Collection<? extends Object>) term51211);
        term49833 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term49840 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term49854 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term49864 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49866 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term49868 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term49870 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term49833, term49833.getClass(), "sourceString", "CAgxWjhxNf");
        setField(term49833, term49833.getClass(), "sourceFile", null);
        setField(term49833, term49833.getClass(), "sourceName", "goAoCMhKBu");
        setBooleanField(term49840, term49840.getClass(), "parseJsDocDocumentation", true);
        setBooleanField(term49840, term49840.getClass(), "isIdeMode", true);
        setField(term49840, term49840.getClass(), "annotationNames", term49842);
        setField(term49840, term49840.getClass(), "suppressionNames", term49844);
        setField(term49840, term49840.getClass(), "languageMode", enum100);
        setBooleanField(term49840, term49840.getClass(), "acceptConstKeyword", true);
        setField(term49833, term49833.getClass(), "config", term49840);
        setField(term49833, term49833.getClass(), "errorReporter", null);
        setField(term49854, term49854.getClass(), "this$0", null);
        setField(term49833, term49833.getClass(), "transformDispatcher", term49854);
        setField(term49833, term49833.getClass(), "reservedKeywords", term49857);
        setField(term49833, term49833.getClass(), "parsedComments", term49861);
        setIntField(term49864, term49864.getClass(), "type", 0);
        setField(term49864, term49864.getClass(), "next", null);
        setField(term49864, term49864.getClass(), "first", null);
        setField(term49864, term49864.getClass(), "last", null);
        setField(term49864, term49864.getClass(), "propListHead", null);
        setIntField(term49864, term49864.getClass(), "sourcePosition", 0);
        setField(term49864, term49864.getClass(), "jsType", null);
        setField(term49864, term49864.getClass(), "parent", null);
        setField(term49833, term49833.getClass(), "rootNodeJsDocHolder", term49864);
        setField(term49866, term49866.getClass(), "this$0", null);
        setField(term49833, term49833.getClass(), "fileLevelJsDocBuilder", term49866);
        setField(term49868, term49868.getClass(), "info", null);
        setField(term49868, term49868.getClass(), "documentation", null);
        setField(term49868, term49868.getClass(), "associatedNode", null);
        setField(term49868, term49868.getClass(), "visibility", null);
        setIntField(term49868, term49868.getClass(), "bitset", 0);
        setField(term49868, term49868.getClass(), "type", null);
        setField(term49868, term49868.getClass(), "thisType", null);
        setBooleanField(term49868, term49868.getClass(), "includeDocumentation", false);
        setIntField(term49868, term49868.getClass(), "originalCommentPosition", 0);
        setField(term49833, term49833.getClass(), "fileOverviewInfo", term49868);
        setIntField(term49870, term49870.getClass(), "type", 0);
        setField(term49870, term49870.getClass(), "next", null);
        setField(term49870, term49870.getClass(), "first", null);
        setField(term49870, term49870.getClass(), "last", null);
        setField(term49870, term49870.getClass(), "propListHead", null);
        setIntField(term49870, term49870.getClass(), "sourcePosition", 0);
        setField(term49870, term49870.getClass(), "jsType", null);
        setField(term49870, term49870.getClass(), "parent", null);
        setField(term49833, term49833.getClass(), "templateNode", term49870);
        term49396 = newInstance(Class.forName("com.google.javascript.rhino.Node$StringNode"));
        setField(term49396, term49396.getClass(), "str", "vLTbaoAxBm");
        setIntField(term49396, term49396.getClass(), "type", 279384872);
        setField(term49396, term49396.getClass(), "next", null);
        setField(term49396, term49396.getClass(), "first", null);
        setField(term49396, term49396.getClass(), "last", null);
        setField(term49396, term49396.getClass(), "propListHead", null);
        setIntField(term49396, term49396.getClass(), "sourcePosition", -1);
        setField(term49396, term49396.getClass(), "jsType", null);
        setField(term49396, term49396.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term17020;
        args[1] = "vLTbaoAxBm";
        Object retValue = callMethod(klass, "newStringNode", argTypes, term16915, args);
        assertTrue(recursiveEquals(term16915, term49833));
        assertTrue(recursiveEquals(term17020, 279384872));
        assertTrue(recursiveEquals(retValue, term49396));
    }

};


