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

public class IRFactory_init_1761821480124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64362;
     Object term64674;
     Object term65705;
     Object term65748;
     Object term65752;

    public IRFactory_init_1761821480124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term64024 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term64200 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term64270 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term64024, term64024.getClass(), "parsedComments", null);
        setField(term64024, term64024.getClass(), "rootNodeJsDocHolder", null);
        setField(term64024, term64024.getClass(), "fileLevelJsDocBuilder", null);
        setField(term64024, term64024.getClass(), "fileOverviewInfo", null);
        setField(term64024, term64024.getClass(), "sourceString", "");
        setField(term64024, term64024.getClass(), "sourceFile", null);
        setField(term64024, term64024.getClass(), "sourceName", null);
        setField(term64024, term64024.getClass(), "config", null);
        setField(term64024, term64024.getClass(), "errorReporter", null);
        setField(term64024, term64024.getClass(), "transformDispatcher", term64200);
        setField(term64024, term64024.getClass(), "templateNode", term64270);
        Class<? extends Object> term65754 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term65753 = ((Class) term65754).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term65753).setAccessible(true);
        Object enum114 = ((Field) term65753).get((Object) null);
        term64362 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term64362, term64362.getClass(), "languageMode", enum114);
        term64674 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$NewRhinoNullReporter"));
        Class<? extends Object> term66074 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term66073 = ((Class) term66074).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term66073).setAccessible(true);
        Object enum115 = ((Field) term66073).get((Object) null);
        HashMap term65744 = new HashMap();
        Set<Object> term66469 =  ((Map) term65744).keySet();
        HashSet term65743 = new HashSet((Collection<? extends Object>) term66469);
        term65705 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term65706 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term65710 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$NewRhinoNullReporter"));
        Object term65711 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term65712 = newInstance(Class.forName("com.google.common.collect.RegularImmutableSet"));
        Object[] term65713 = (Object[]) newArray("java.lang.Object", 16);
        Object[] term65728 = (Object[]) newArray("java.lang.Object", 7);
        Object term65745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term65746 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term65747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term65705, term65705.getClass(), "sourceString", null);
        setField(term65705, term65705.getClass(), "sourceFile", null);
        setField(term65705, term65705.getClass(), "sourceName", null);
        setBooleanField(term65706, term65706.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term65706, term65706.getClass(), "isIdeMode", false);
        setField(term65706, term65706.getClass(), "annotationNames", null);
        setField(term65706, term65706.getClass(), "suppressionNames", null);
        setField(term65706, term65706.getClass(), "languageMode", enum115);
        setBooleanField(term65706, term65706.getClass(), "acceptConstKeyword", false);
        setField(term65705, term65705.getClass(), "config", term65706);
        setField(term65705, term65705.getClass(), "errorReporter", term65710);
        setField(term65711, term65711.getClass(), "this$0", term65705);
        setField(term65705, term65705.getClass(), "transformDispatcher", term65711);
        setElement(term65713, 0, "super");
        setElement(term65713, 2, "export");
        setElement(term65713, 6, "class");
        setElement(term65713, 7, "extends");
        setElement(term65713, 10, "enum");
        setElement(term65713, 13, "const");
        setElement(term65713, 14, "import");
        setField(term65712, term65712.getClass(), "table", term65713);
        setIntField(term65712, term65712.getClass(), "mask", 15);
        setElement(term65728, 0, "class");
        setElement(term65728, 1, "const");
        setElement(term65728, 2, "enum");
        setElement(term65728, 3, "export");
        setElement(term65728, 4, "extends");
        setElement(term65728, 5, "import");
        setElement(term65728, 6, "super");
        setField(term65712, term65712.getClass(), "elements", term65728);
        setField(term65712, term65712.getClass(), "asList", null);
        setField(term65705, term65705.getClass(), "reservedKeywords", term65712);
        setField(term65705, term65705.getClass(), "parsedComments", term65743);
        setIntField(term65745, term65745.getClass(), "type", 132);
        setField(term65745, term65745.getClass(), "next", null);
        setField(term65745, term65745.getClass(), "first", null);
        setField(term65745, term65745.getClass(), "last", null);
        setField(term65745, term65745.getClass(), "propListHead", null);
        setIntField(term65745, term65745.getClass(), "sourcePosition", -1);
        setField(term65745, term65745.getClass(), "jsType", null);
        setField(term65745, term65745.getClass(), "parent", null);
        setField(term65705, term65705.getClass(), "rootNodeJsDocHolder", term65745);
        setField(term65746, term65746.getClass(), "this$0", term65745);
        setField(term65705, term65705.getClass(), "fileLevelJsDocBuilder", term65746);
        setField(term65705, term65705.getClass(), "fileOverviewInfo", null);
        setIntField(term65747, term65747.getClass(), "type", 132);
        setField(term65747, term65747.getClass(), "next", null);
        setField(term65747, term65747.getClass(), "first", null);
        setField(term65747, term65747.getClass(), "last", null);
        setField(term65747, term65747.getClass(), "propListHead", null);
        setIntField(term65747, term65747.getClass(), "sourcePosition", -1);
        setField(term65747, term65747.getClass(), "jsType", null);
        setField(term65747, term65747.getClass(), "parent", null);
        setField(term65705, term65705.getClass(), "templateNode", term65747);
        Class<? extends Object> term66471 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term66470 = ((Class) term66471).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term66470).setAccessible(true);
        Object enum116 = ((Field) term66470).get((Object) null);
        term65748 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setBooleanField(term65748, term65748.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term65748, term65748.getClass(), "isIdeMode", false);
        setField(term65748, term65748.getClass(), "annotationNames", null);
        setField(term65748, term65748.getClass(), "suppressionNames", null);
        setField(term65748, term65748.getClass(), "languageMode", enum116);
        setBooleanField(term65748, term65748.getClass(), "acceptConstKeyword", false);
        term65752 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.NullErrorReporter$NewRhinoNullReporter"));
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
        args[2] = term64362;
        args[3] = term64674;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term65705));
        assertTrue(recursiveEquals(term64362, term65748));
        assertTrue(recursiveEquals(term64674, term65752));
    }

};


