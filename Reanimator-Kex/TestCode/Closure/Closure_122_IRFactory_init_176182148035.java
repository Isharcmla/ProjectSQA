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
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class IRFactory_init_176182148035 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term18106;
     Object term18155;

    public IRFactory_init_176182148035() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term16 = new HashMap();
        HashMap term28 = new HashMap();
        Set<Object> term18172 =  ((Map) term28).keySet();
        HashSet term27 = new HashSet((Collection<? extends Object>) term18172);
        Class<? extends Object> term18174 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term18173 = ((Class) term18174).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term18173).setAccessible(true);
        Object enum38 = ((Field) term18173).get((Object) null);
        term13 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setBooleanField(term13, term13.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term13, term13.getClass(), "isIdeMode", false);
        setField(term13, term13.getClass(), "annotationNames", term16);
        setField(term13, term13.getClass(), "suppressionNames", term27);
        setField(term13, term13.getClass(), "languageMode", enum38);
        setBooleanField(term13, term13.getClass(), "acceptConstKeyword", false);
        HashMap term18110 = new HashMap();
        HashMap term18112 = new HashMap();
        Set<Object> term18503 =  ((Map) term18112).keySet();
        HashSet term18111 = new HashSet((Collection<? extends Object>) term18503);
        Class<? extends Object> term18505 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term18504 = ((Class) term18505).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term18504).setAccessible(true);
        Object enum39 = ((Field) term18504).get((Object) null);
        HashMap term18149 = new HashMap();
        Set<Object> term18900 =  ((Map) term18149).keySet();
        HashSet term18148 = new HashSet((Collection<? extends Object>) term18900);
        term18106 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term18109 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term18116 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term18117 = newInstance(Class.forName("com.google.common.collect.RegularImmutableSet"));
        Object[] term18118 = (Object[]) newArray("java.lang.Object", 16);
        Object[] term18133 = (Object[]) newArray("java.lang.Object", 7);
        Object term18150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term18151 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term18152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term18106, term18106.getClass(), "sourceString", "PAEBtnZtTD");
        setField(term18106, term18106.getClass(), "sourceFile", null);
        setField(term18106, term18106.getClass(), "sourceName", null);
        setBooleanField(term18109, term18109.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term18109, term18109.getClass(), "isIdeMode", false);
        setField(term18109, term18109.getClass(), "annotationNames", term18110);
        setField(term18109, term18109.getClass(), "suppressionNames", term18111);
        setField(term18109, term18109.getClass(), "languageMode", enum39);
        setBooleanField(term18109, term18109.getClass(), "acceptConstKeyword", false);
        setField(term18106, term18106.getClass(), "config", term18109);
        setField(term18106, term18106.getClass(), "errorReporter", null);
        setField(term18116, term18116.getClass(), "this$0", term18106);
        setField(term18106, term18106.getClass(), "transformDispatcher", term18116);
        setElement(term18118, 0, "super");
        setElement(term18118, 2, "export");
        setElement(term18118, 6, "class");
        setElement(term18118, 7, "extends");
        setElement(term18118, 10, "enum");
        setElement(term18118, 13, "const");
        setElement(term18118, 14, "import");
        setField(term18117, term18117.getClass(), "table", term18118);
        setIntField(term18117, term18117.getClass(), "mask", 15);
        setElement(term18133, 0, "class");
        setElement(term18133, 1, "const");
        setElement(term18133, 2, "enum");
        setElement(term18133, 3, "export");
        setElement(term18133, 4, "extends");
        setElement(term18133, 5, "import");
        setElement(term18133, 6, "super");
        setField(term18117, term18117.getClass(), "elements", term18133);
        setField(term18117, term18117.getClass(), "asList", null);
        setField(term18106, term18106.getClass(), "reservedKeywords", term18117);
        setField(term18106, term18106.getClass(), "parsedComments", term18148);
        setIntField(term18150, term18150.getClass(), "type", 132);
        setField(term18150, term18150.getClass(), "next", null);
        setField(term18150, term18150.getClass(), "first", null);
        setField(term18150, term18150.getClass(), "last", null);
        setField(term18150, term18150.getClass(), "propListHead", null);
        setIntField(term18150, term18150.getClass(), "sourcePosition", -1);
        setField(term18150, term18150.getClass(), "jsType", null);
        setField(term18150, term18150.getClass(), "parent", null);
        setField(term18106, term18106.getClass(), "rootNodeJsDocHolder", term18150);
        setField(term18151, term18151.getClass(), "this$0", term18150);
        setField(term18106, term18106.getClass(), "fileLevelJsDocBuilder", term18151);
        setField(term18106, term18106.getClass(), "fileOverviewInfo", null);
        setIntField(term18152, term18152.getClass(), "type", 132);
        setField(term18152, term18152.getClass(), "next", null);
        setField(term18152, term18152.getClass(), "first", null);
        setField(term18152, term18152.getClass(), "last", null);
        setField(term18152, term18152.getClass(), "propListHead", null);
        setIntField(term18152, term18152.getClass(), "sourcePosition", -1);
        setField(term18152, term18152.getClass(), "jsType", null);
        setField(term18152, term18152.getClass(), "parent", null);
        setField(term18106, term18106.getClass(), "templateNode", term18152);
        HashMap term18156 = new HashMap();
        HashMap term18158 = new HashMap();
        Set<Object> term18911 =  ((Map) term18158).keySet();
        HashSet term18157 = new HashSet((Collection<? extends Object>) term18911);
        Class<? extends Object> term18913 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term18912 = ((Class) term18913).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term18912).setAccessible(true);
        Object enum40 = ((Field) term18912).get((Object) null);
        term18155 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setBooleanField(term18155, term18155.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term18155, term18155.getClass(), "isIdeMode", false);
        setField(term18155, term18155.getClass(), "annotationNames", term18156);
        setField(term18155, term18155.getClass(), "suppressionNames", term18157);
        setField(term18155, term18155.getClass(), "languageMode", enum40);
        setBooleanField(term18155, term18155.getClass(), "acceptConstKeyword", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticSourceFile");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.parsing.Config");
        argTypes[3] = Class.forName("com.google.javascript.rhino.head.ErrorReporter");
        Object[] args = new Object[4];
        args[0] = "PAEBtnZtTD";
        args[1] = null;
        args[2] = term13;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term18106));
        assertTrue(recursiveEquals(term13, term18155));
    }

};


