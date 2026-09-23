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

public class IRFactory_init_62075634024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term14311;
     Object term14369;

    public IRFactory_init_62075634024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term28 = new HashMap();
        HashMap term40 = new HashMap();
        Set<Object> term14396 =  ((Map) term40).keySet();
        HashSet term39 = new HashSet((Collection<? extends Object>) term14396);
        Class<? extends Object> term14398 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term14397 = ((Class) term14398).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term14397).setAccessible(true);
        Object enum28 = ((Field) term14397).get((Object) null);
        term25 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setBooleanField(term25, term25.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term25, term25.getClass(), "isIdeMode", false);
        setField(term25, term25.getClass(), "annotationNames", term28);
        setField(term25, term25.getClass(), "suppressionNames", term39);
        setField(term25, term25.getClass(), "languageMode", enum28);
        setBooleanField(term25, term25.getClass(), "acceptConstKeyword", false);
        HashMap term14317 = new HashMap();
        HashMap term14319 = new HashMap();
        Set<Object> term14737 =  ((Map) term14319).keySet();
        HashSet term14318 = new HashSet((Collection<? extends Object>) term14737);
        Class<? extends Object> term14739 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term14738 = ((Class) term14739).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term14738).setAccessible(true);
        Object enum29 = ((Field) term14738).get((Object) null);
        HashMap term14325 = new HashMap();
        Set<Object> term15058 =  ((Map) term14325).keySet();
        HashSet term14324 = new HashSet((Collection<? extends Object>) term15058);
        term14311 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term14316 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term14323 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term14328 = newInstance(Class.forName("com.google.common.collect.RegularImmutableSet"));
        Object[] term14329 = (Object[]) newArray("java.lang.Object", 16);
        Object[] term14344 = (Object[]) newArray("java.lang.Object", 7);
        Object term14359 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14360 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term14361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14362 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term14311, term14311.getClass(), "sourceString", "PAEBtnZtTD");
        setField(term14311, term14311.getClass(), "sourceName", "sjlJAEtRrb");
        setBooleanField(term14316, term14316.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term14316, term14316.getClass(), "isIdeMode", false);
        setField(term14316, term14316.getClass(), "annotationNames", term14317);
        setField(term14316, term14316.getClass(), "suppressionNames", term14318);
        setField(term14316, term14316.getClass(), "languageMode", enum29);
        setBooleanField(term14316, term14316.getClass(), "acceptConstKeyword", false);
        setField(term14311, term14311.getClass(), "config", term14316);
        setField(term14311, term14311.getClass(), "errorReporter", null);
        setField(term14323, term14323.getClass(), "this$0", term14311);
        setField(term14311, term14311.getClass(), "transformDispatcher", term14323);
        setField(term14311, term14311.getClass(), "ALLOWED_DIRECTIVES", term14324);
        setElement(term14329, 0, "super");
        setElement(term14329, 2, "export");
        setElement(term14329, 4, "const");
        setElement(term14329, 5, "extends");
        setElement(term14329, 9, "class");
        setElement(term14329, 10, "enum");
        setElement(term14329, 11, "import");
        setField(term14328, term14328.getClass(), "table", term14329);
        setIntField(term14328, term14328.getClass(), "mask", 15);
        setElement(term14344, 0, "class");
        setElement(term14344, 1, "const");
        setElement(term14344, 2, "enum");
        setElement(term14344, 3, "export");
        setElement(term14344, 4, "extends");
        setElement(term14344, 5, "import");
        setElement(term14344, 6, "super");
        setField(term14328, term14328.getClass(), "elements", term14344);
        setField(term14328, term14328.getClass(), "asList", null);
        setField(term14311, term14311.getClass(), "reservedKeywords", term14328);
        setIntField(term14359, term14359.getClass(), "type", 132);
        setField(term14359, term14359.getClass(), "next", null);
        setField(term14359, term14359.getClass(), "first", null);
        setField(term14359, term14359.getClass(), "last", null);
        setField(term14359, term14359.getClass(), "propListHead", null);
        setIntField(term14359, term14359.getClass(), "sourcePosition", -1);
        setField(term14359, term14359.getClass(), "jsType", null);
        setField(term14359, term14359.getClass(), "parent", null);
        setField(term14311, term14311.getClass(), "rootNodeJsDocHolder", term14359);
        setField(term14360, term14360.getClass(), "this$0", term14359);
        setField(term14311, term14311.getClass(), "fileLevelJsDocBuilder", term14360);
        setField(term14311, term14311.getClass(), "fileOverviewInfo", null);
        setIntField(term14361, term14361.getClass(), "type", 132);
        setField(term14361, term14361.getClass(), "next", null);
        setField(term14361, term14361.getClass(), "first", null);
        setField(term14361, term14361.getClass(), "last", null);
        setField(term14362, term14362.getClass(), "next", null);
        setIntField(term14362, term14362.getClass(), "type", 16);
        setIntField(term14362, term14362.getClass(), "intValue", 0);
        setField(term14362, term14362.getClass(), "objectValue", "sjlJAEtRrb");
        setField(term14361, term14361.getClass(), "propListHead", term14362);
        setIntField(term14361, term14361.getClass(), "sourcePosition", -1);
        setField(term14361, term14361.getClass(), "jsType", null);
        setField(term14361, term14361.getClass(), "parent", null);
        setField(term14311, term14311.getClass(), "templateNode", term14361);
        HashMap term14370 = new HashMap();
        HashMap term14372 = new HashMap();
        Set<Object> term15165 =  ((Map) term14372).keySet();
        HashSet term14371 = new HashSet((Collection<? extends Object>) term15165);
        Class<? extends Object> term15167 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term15166 = ((Class) term15167).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term15166).setAccessible(true);
        Object enum30 = ((Field) term15166).get((Object) null);
        term14369 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setBooleanField(term14369, term14369.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term14369, term14369.getClass(), "isIdeMode", false);
        setField(term14369, term14369.getClass(), "annotationNames", term14370);
        setField(term14369, term14369.getClass(), "suppressionNames", term14371);
        setField(term14369, term14369.getClass(), "languageMode", enum30);
        setBooleanField(term14369, term14369.getClass(), "acceptConstKeyword", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.parsing.Config");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ErrorReporter");
        Object[] args = new Object[4];
        args[0] = "PAEBtnZtTD";
        args[1] = "sjlJAEtRrb";
        args[2] = term25;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term14311));
        assertTrue(recursiveEquals(term25, term14369));
    }

};


