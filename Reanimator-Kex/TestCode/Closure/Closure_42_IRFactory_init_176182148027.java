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

public class IRFactory_init_176182148027 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13;
     Object term14118;
     Object term14171;

    public IRFactory_init_176182148027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term16 = new HashMap();
        HashMap term28 = new HashMap();
        Set<Object> term14188 =  ((Map) term28).keySet();
        HashSet term27 = new HashSet((Collection<? extends Object>) term14188);
        Class<? extends Object> term14190 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term14189 = ((Class) term14190).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term14189).setAccessible(true);
        Object enum29 = ((Field) term14189).get((Object) null);
        term13 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setBooleanField(term13, term13.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term13, term13.getClass(), "isIdeMode", false);
        setField(term13, term13.getClass(), "annotationNames", term16);
        setField(term13, term13.getClass(), "suppressionNames", term27);
        setField(term13, term13.getClass(), "languageMode", enum29);
        setBooleanField(term13, term13.getClass(), "acceptConstKeyword", false);
        HashMap term14122 = new HashMap();
        HashMap term14124 = new HashMap();
        Set<Object> term14519 =  ((Map) term14124).keySet();
        HashSet term14123 = new HashSet((Collection<? extends Object>) term14519);
        Class<? extends Object> term14521 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term14520 = ((Class) term14521).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term14520).setAccessible(true);
        Object enum30 = ((Field) term14520).get((Object) null);
        HashMap term14130 = new HashMap();
        Set<Object> term14840 =  ((Map) term14130).keySet();
        HashSet term14129 = new HashSet((Collection<? extends Object>) term14840);
        HashMap term14165 = new HashMap();
        Set<Object> term14917 =  ((Map) term14165).keySet();
        HashSet term14164 = new HashSet((Collection<? extends Object>) term14917);
        term14118 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term14121 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term14128 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term14133 = newInstance(Class.forName("com.google.common.collect.RegularImmutableSet"));
        Object[] term14134 = (Object[]) newArray("java.lang.Object", 16);
        Object[] term14149 = (Object[]) newArray("java.lang.Object", 7);
        Object term14166 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14167 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term14168 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term14118, term14118.getClass(), "sourceString", "PAEBtnZtTD");
        setField(term14118, term14118.getClass(), "sourceFile", null);
        setField(term14118, term14118.getClass(), "sourceName", null);
        setBooleanField(term14121, term14121.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term14121, term14121.getClass(), "isIdeMode", false);
        setField(term14121, term14121.getClass(), "annotationNames", term14122);
        setField(term14121, term14121.getClass(), "suppressionNames", term14123);
        setField(term14121, term14121.getClass(), "languageMode", enum30);
        setBooleanField(term14121, term14121.getClass(), "acceptConstKeyword", false);
        setField(term14118, term14118.getClass(), "config", term14121);
        setField(term14118, term14118.getClass(), "errorReporter", null);
        setField(term14128, term14128.getClass(), "this$0", term14118);
        setField(term14118, term14118.getClass(), "transformDispatcher", term14128);
        setField(term14118, term14118.getClass(), "ALLOWED_DIRECTIVES", term14129);
        setElement(term14134, 0, "super");
        setElement(term14134, 2, "export");
        setElement(term14134, 4, "const");
        setElement(term14134, 5, "extends");
        setElement(term14134, 9, "class");
        setElement(term14134, 10, "enum");
        setElement(term14134, 11, "import");
        setField(term14133, term14133.getClass(), "table", term14134);
        setIntField(term14133, term14133.getClass(), "mask", 15);
        setElement(term14149, 0, "class");
        setElement(term14149, 1, "const");
        setElement(term14149, 2, "enum");
        setElement(term14149, 3, "export");
        setElement(term14149, 4, "extends");
        setElement(term14149, 5, "import");
        setElement(term14149, 6, "super");
        setField(term14133, term14133.getClass(), "elements", term14149);
        setField(term14133, term14133.getClass(), "asList", null);
        setField(term14118, term14118.getClass(), "reservedKeywords", term14133);
        setField(term14118, term14118.getClass(), "parsedComments", term14164);
        setIntField(term14166, term14166.getClass(), "type", 132);
        setField(term14166, term14166.getClass(), "next", null);
        setField(term14166, term14166.getClass(), "first", null);
        setField(term14166, term14166.getClass(), "last", null);
        setField(term14166, term14166.getClass(), "propListHead", null);
        setIntField(term14166, term14166.getClass(), "sourcePosition", -1);
        setField(term14166, term14166.getClass(), "jsType", null);
        setField(term14166, term14166.getClass(), "parent", null);
        setField(term14118, term14118.getClass(), "rootNodeJsDocHolder", term14166);
        setField(term14167, term14167.getClass(), "this$0", term14166);
        setField(term14118, term14118.getClass(), "fileLevelJsDocBuilder", term14167);
        setField(term14118, term14118.getClass(), "fileOverviewInfo", null);
        setIntField(term14168, term14168.getClass(), "type", 132);
        setField(term14168, term14168.getClass(), "next", null);
        setField(term14168, term14168.getClass(), "first", null);
        setField(term14168, term14168.getClass(), "last", null);
        setField(term14168, term14168.getClass(), "propListHead", null);
        setIntField(term14168, term14168.getClass(), "sourcePosition", -1);
        setField(term14168, term14168.getClass(), "jsType", null);
        setField(term14168, term14168.getClass(), "parent", null);
        setField(term14118, term14118.getClass(), "templateNode", term14168);
        HashMap term14172 = new HashMap();
        HashMap term14174 = new HashMap();
        Set<Object> term14928 =  ((Map) term14174).keySet();
        HashSet term14173 = new HashSet((Collection<? extends Object>) term14928);
        Class<? extends Object> term14930 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term14929 = ((Class) term14930).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term14929).setAccessible(true);
        Object enum31 = ((Field) term14929).get((Object) null);
        term14171 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setBooleanField(term14171, term14171.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term14171, term14171.getClass(), "isIdeMode", false);
        setField(term14171, term14171.getClass(), "annotationNames", term14172);
        setField(term14171, term14171.getClass(), "suppressionNames", term14173);
        setField(term14171, term14171.getClass(), "languageMode", enum31);
        setBooleanField(term14171, term14171.getClass(), "acceptConstKeyword", false);
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
        assertTrue(recursiveEquals(instance, term14118));
        assertTrue(recursiveEquals(term13, term14171));
    }

};


