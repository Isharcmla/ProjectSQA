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

public class IRFactory_init_176182148090 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47183;
     Object term47794;
     Object term47809;

    public IRFactory_init_176182148090() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term46689 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term46883 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$NewRhinoNullReporter"));
        Object term47021 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term47091 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term46689, term46689.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term46689, term46689.getClass(), "parsedComments", null);
        setField(term46689, term46689.getClass(), "rootNodeJsDocHolder", null);
        setField(term46689, term46689.getClass(), "fileLevelJsDocBuilder", null);
        setField(term46689, term46689.getClass(), "fileOverviewInfo", null);
        setField(term46689, term46689.getClass(), "sourceString", "");
        setField(term46689, term46689.getClass(), "sourceFile", null);
        setField(term46689, term46689.getClass(), "sourceName", null);
        setField(term46689, term46689.getClass(), "config", null);
        setField(term46689, term46689.getClass(), "errorReporter", term46883);
        setField(term46689, term46689.getClass(), "transformDispatcher", term47021);
        setField(term46689, term46689.getClass(), "templateNode", term47091);
        Class<? extends Object> term47814 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term47813 = ((Class) term47814).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term47813).setAccessible(true);
        Object enum85 = ((Field) term47813).get((Object) null);
        term47183 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term47183, term47183.getClass(), "languageMode", enum85);
        Class<? extends Object> term48134 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term48133 = ((Class) term48134).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term48133).setAccessible(true);
        Object enum86 = ((Field) term48133).get((Object) null);
        HashMap term47801 = new HashMap();
        Set<Object> term48453 =  ((Map) term47801).keySet();
        HashSet term47800 = new HashSet((Collection<? extends Object>) term48453);
        HashMap term47805 = new HashMap();
        Set<Object> term48454 =  ((Map) term47805).keySet();
        HashSet term47804 = new HashSet((Collection<? extends Object>) term48454);
        term47794 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term47795 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term47799 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term47806 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term47807 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term47808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term47794, term47794.getClass(), "sourceString", null);
        setField(term47794, term47794.getClass(), "sourceFile", null);
        setField(term47794, term47794.getClass(), "sourceName", null);
        setBooleanField(term47795, term47795.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term47795, term47795.getClass(), "isIdeMode", false);
        setField(term47795, term47795.getClass(), "annotationNames", null);
        setField(term47795, term47795.getClass(), "suppressionNames", null);
        setField(term47795, term47795.getClass(), "languageMode", enum86);
        setBooleanField(term47795, term47795.getClass(), "acceptConstKeyword", false);
        setField(term47794, term47794.getClass(), "config", term47795);
        setField(term47794, term47794.getClass(), "errorReporter", null);
        setField(term47799, term47799.getClass(), "this$0", term47794);
        setField(term47794, term47794.getClass(), "transformDispatcher", term47799);
        setField(term47794, term47794.getClass(), "ALLOWED_DIRECTIVES", term47800);
        setField(term47794, term47794.getClass(), "reservedKeywords", null);
        setField(term47794, term47794.getClass(), "parsedComments", term47804);
        setIntField(term47806, term47806.getClass(), "type", 132);
        setField(term47806, term47806.getClass(), "next", null);
        setField(term47806, term47806.getClass(), "first", null);
        setField(term47806, term47806.getClass(), "last", null);
        setField(term47806, term47806.getClass(), "propListHead", null);
        setIntField(term47806, term47806.getClass(), "sourcePosition", -1);
        setField(term47806, term47806.getClass(), "jsType", null);
        setField(term47806, term47806.getClass(), "parent", null);
        setField(term47794, term47794.getClass(), "rootNodeJsDocHolder", term47806);
        setField(term47807, term47807.getClass(), "this$0", term47806);
        setField(term47794, term47794.getClass(), "fileLevelJsDocBuilder", term47807);
        setField(term47794, term47794.getClass(), "fileOverviewInfo", null);
        setIntField(term47808, term47808.getClass(), "type", 132);
        setField(term47808, term47808.getClass(), "next", null);
        setField(term47808, term47808.getClass(), "first", null);
        setField(term47808, term47808.getClass(), "last", null);
        setField(term47808, term47808.getClass(), "propListHead", null);
        setIntField(term47808, term47808.getClass(), "sourcePosition", -1);
        setField(term47808, term47808.getClass(), "jsType", null);
        setField(term47808, term47808.getClass(), "parent", null);
        setField(term47794, term47794.getClass(), "templateNode", term47808);
        Class<? extends Object> term48456 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term48455 = ((Class) term48456).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term48455).setAccessible(true);
        Object enum87 = ((Field) term48455).get((Object) null);
        term47809 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setBooleanField(term47809, term47809.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term47809, term47809.getClass(), "isIdeMode", false);
        setField(term47809, term47809.getClass(), "annotationNames", null);
        setField(term47809, term47809.getClass(), "suppressionNames", null);
        setField(term47809, term47809.getClass(), "languageMode", enum87);
        setBooleanField(term47809, term47809.getClass(), "acceptConstKeyword", false);
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
        args[2] = term47183;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term47794));
        assertTrue(recursiveEquals(term47183, term47809));
    }

};


