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
     Object term14128;
     Object term14181;

    public IRFactory_init_176182148027() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term16 = new HashMap();
        HashMap term28 = new HashMap();
        Set<Object> term14198 =  ((Map) term28).keySet();
        HashSet term27 = new HashSet((Collection<? extends Object>) term14198);
        Class<? extends Object> term14200 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term14199 = ((Class) term14200).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term14199).setAccessible(true);
        Object enum29 = ((Field) term14199).get((Object) null);
        term13 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setBooleanField(term13, term13.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term13, term13.getClass(), "isIdeMode", false);
        setField(term13, term13.getClass(), "annotationNames", term16);
        setField(term13, term13.getClass(), "suppressionNames", term27);
        setField(term13, term13.getClass(), "languageMode", enum29);
        setBooleanField(term13, term13.getClass(), "acceptConstKeyword", false);
        HashMap term14132 = new HashMap();
        HashMap term14134 = new HashMap();
        Set<Object> term14529 =  ((Map) term14134).keySet();
        HashSet term14133 = new HashSet((Collection<? extends Object>) term14529);
        Class<? extends Object> term14531 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term14530 = ((Class) term14531).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term14530).setAccessible(true);
        Object enum30 = ((Field) term14530).get((Object) null);
        HashMap term14140 = new HashMap();
        Set<Object> term14850 =  ((Map) term14140).keySet();
        HashSet term14139 = new HashSet((Collection<? extends Object>) term14850);
        HashMap term14175 = new HashMap();
        Set<Object> term14927 =  ((Map) term14175).keySet();
        HashSet term14174 = new HashSet((Collection<? extends Object>) term14927);
        term14128 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term14131 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term14138 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term14143 = newInstance(Class.forName("com.google.common.collect.RegularImmutableSet"));
        Object[] term14144 = (Object[]) newArray("java.lang.Object", 16);
        Object[] term14159 = (Object[]) newArray("java.lang.Object", 7);
        Object term14176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14177 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term14178 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term14128, term14128.getClass(), "sourceString", "PAEBtnZtTD");
        setField(term14128, term14128.getClass(), "sourceFile", null);
        setField(term14128, term14128.getClass(), "sourceName", null);
        setBooleanField(term14131, term14131.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term14131, term14131.getClass(), "isIdeMode", false);
        setField(term14131, term14131.getClass(), "annotationNames", term14132);
        setField(term14131, term14131.getClass(), "suppressionNames", term14133);
        setField(term14131, term14131.getClass(), "languageMode", enum30);
        setBooleanField(term14131, term14131.getClass(), "acceptConstKeyword", false);
        setField(term14128, term14128.getClass(), "config", term14131);
        setField(term14128, term14128.getClass(), "errorReporter", null);
        setField(term14138, term14138.getClass(), "this$0", term14128);
        setField(term14128, term14128.getClass(), "transformDispatcher", term14138);
        setField(term14128, term14128.getClass(), "ALLOWED_DIRECTIVES", term14139);
        setElement(term14144, 0, "super");
        setElement(term14144, 2, "export");
        setElement(term14144, 4, "const");
        setElement(term14144, 5, "extends");
        setElement(term14144, 9, "class");
        setElement(term14144, 10, "enum");
        setElement(term14144, 11, "import");
        setField(term14143, term14143.getClass(), "table", term14144);
        setIntField(term14143, term14143.getClass(), "mask", 15);
        setElement(term14159, 0, "class");
        setElement(term14159, 1, "const");
        setElement(term14159, 2, "enum");
        setElement(term14159, 3, "export");
        setElement(term14159, 4, "extends");
        setElement(term14159, 5, "import");
        setElement(term14159, 6, "super");
        setField(term14143, term14143.getClass(), "elements", term14159);
        setField(term14143, term14143.getClass(), "asList", null);
        setField(term14128, term14128.getClass(), "reservedKeywords", term14143);
        setField(term14128, term14128.getClass(), "parsedComments", term14174);
        setIntField(term14176, term14176.getClass(), "type", 132);
        setField(term14176, term14176.getClass(), "next", null);
        setField(term14176, term14176.getClass(), "first", null);
        setField(term14176, term14176.getClass(), "last", null);
        setField(term14176, term14176.getClass(), "propListHead", null);
        setIntField(term14176, term14176.getClass(), "sourcePosition", -1);
        setField(term14176, term14176.getClass(), "jsType", null);
        setField(term14176, term14176.getClass(), "parent", null);
        setField(term14128, term14128.getClass(), "rootNodeJsDocHolder", term14176);
        setField(term14177, term14177.getClass(), "this$0", term14176);
        setField(term14128, term14128.getClass(), "fileLevelJsDocBuilder", term14177);
        setField(term14128, term14128.getClass(), "fileOverviewInfo", null);
        setIntField(term14178, term14178.getClass(), "type", 132);
        setField(term14178, term14178.getClass(), "next", null);
        setField(term14178, term14178.getClass(), "first", null);
        setField(term14178, term14178.getClass(), "last", null);
        setField(term14178, term14178.getClass(), "propListHead", null);
        setIntField(term14178, term14178.getClass(), "sourcePosition", -1);
        setField(term14178, term14178.getClass(), "jsType", null);
        setField(term14178, term14178.getClass(), "parent", null);
        setField(term14128, term14128.getClass(), "templateNode", term14178);
        HashMap term14182 = new HashMap();
        HashMap term14184 = new HashMap();
        Set<Object> term14938 =  ((Map) term14184).keySet();
        HashSet term14183 = new HashSet((Collection<? extends Object>) term14938);
        Class<? extends Object> term14940 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term14939 = ((Class) term14940).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term14939).setAccessible(true);
        Object enum31 = ((Field) term14939).get((Object) null);
        term14181 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setBooleanField(term14181, term14181.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term14181, term14181.getClass(), "isIdeMode", false);
        setField(term14181, term14181.getClass(), "annotationNames", term14182);
        setField(term14181, term14181.getClass(), "suppressionNames", term14183);
        setField(term14181, term14181.getClass(), "languageMode", enum31);
        setBooleanField(term14181, term14181.getClass(), "acceptConstKeyword", false);
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
        assertTrue(recursiveEquals(instance, term14128));
        assertTrue(recursiveEquals(term13, term14181));
    }

};


