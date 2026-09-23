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
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class IRFactory_init_1761821480114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61868;
     Object term62420;
     Object term62431;

    public IRFactory_init_1761821480114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term61658 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term61738 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term61658, term61658.getClass(), "parsedComments", null);
        setField(term61658, term61658.getClass(), "rootNodeJsDocHolder", null);
        setField(term61658, term61658.getClass(), "fileLevelJsDocBuilder", null);
        setField(term61658, term61658.getClass(), "fileOverviewInfo", term61738);
        setField(term61658, term61658.getClass(), "sourceString", null);
        setField(term61658, term61658.getClass(), "sourceFile", null);
        setField(term61658, term61658.getClass(), "sourceName", "");
        setField(term61658, term61658.getClass(), "config", null);
        setField(term61658, term61658.getClass(), "errorReporter", null);
        setField(term61658, term61658.getClass(), "transformDispatcher", null);
        setField(term61658, term61658.getClass(), "templateNode", null);
        Class<? extends Object> term62436 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term62435 = ((Class) term62436).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term62435).setAccessible(true);
        Object enum110 = ((Field) term62435).get((Object) null);
        term61868 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term61868, term61868.getClass(), "languageMode", enum110);
        Class<? extends Object> term62756 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term62755 = ((Class) term62756).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term62755).setAccessible(true);
        Object enum111 = ((Field) term62755).get((Object) null);
        HashMap term62427 = new HashMap();
        Set<Object> term63075 =  ((Map) term62427).keySet();
        HashSet term62426 = new HashSet((Collection<? extends Object>) term63075);
        term62420 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term62421 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term62425 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term62428 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term62429 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term62430 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term62420, term62420.getClass(), "sourceString", null);
        setField(term62420, term62420.getClass(), "sourceFile", null);
        setField(term62420, term62420.getClass(), "sourceName", null);
        setBooleanField(term62421, term62421.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term62421, term62421.getClass(), "isIdeMode", false);
        setField(term62421, term62421.getClass(), "annotationNames", null);
        setField(term62421, term62421.getClass(), "suppressionNames", null);
        setField(term62421, term62421.getClass(), "languageMode", enum111);
        setBooleanField(term62421, term62421.getClass(), "acceptConstKeyword", false);
        setField(term62420, term62420.getClass(), "config", term62421);
        setField(term62420, term62420.getClass(), "errorReporter", null);
        setField(term62425, term62425.getClass(), "this$0", term62420);
        setField(term62420, term62420.getClass(), "transformDispatcher", term62425);
        setField(term62420, term62420.getClass(), "reservedKeywords", null);
        setField(term62420, term62420.getClass(), "parsedComments", term62426);
        setIntField(term62428, term62428.getClass(), "type", 132);
        setField(term62428, term62428.getClass(), "next", null);
        setField(term62428, term62428.getClass(), "first", null);
        setField(term62428, term62428.getClass(), "last", null);
        setField(term62428, term62428.getClass(), "propListHead", null);
        setIntField(term62428, term62428.getClass(), "sourcePosition", -1);
        setField(term62428, term62428.getClass(), "jsType", null);
        setField(term62428, term62428.getClass(), "parent", null);
        setField(term62420, term62420.getClass(), "rootNodeJsDocHolder", term62428);
        setField(term62429, term62429.getClass(), "this$0", term62428);
        setField(term62420, term62420.getClass(), "fileLevelJsDocBuilder", term62429);
        setField(term62420, term62420.getClass(), "fileOverviewInfo", null);
        setIntField(term62430, term62430.getClass(), "type", 132);
        setField(term62430, term62430.getClass(), "next", null);
        setField(term62430, term62430.getClass(), "first", null);
        setField(term62430, term62430.getClass(), "last", null);
        setField(term62430, term62430.getClass(), "propListHead", null);
        setIntField(term62430, term62430.getClass(), "sourcePosition", -1);
        setField(term62430, term62430.getClass(), "jsType", null);
        setField(term62430, term62430.getClass(), "parent", null);
        setField(term62420, term62420.getClass(), "templateNode", term62430);
        Class<? extends Object> term63077 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term63076 = ((Class) term63077).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term63076).setAccessible(true);
        Object enum112 = ((Field) term63076).get((Object) null);
        term62431 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setBooleanField(term62431, term62431.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term62431, term62431.getClass(), "isIdeMode", false);
        setField(term62431, term62431.getClass(), "annotationNames", null);
        setField(term62431, term62431.getClass(), "suppressionNames", null);
        setField(term62431, term62431.getClass(), "languageMode", enum112);
        setBooleanField(term62431, term62431.getClass(), "acceptConstKeyword", false);
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
        args[0] = null;
        args[1] = null;
        args[2] = term61868;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term62420));
        assertTrue(recursiveEquals(term61868, term62431));
    }

};


