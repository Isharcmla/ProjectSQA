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

public class IRFactory_init_176182148097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43998;
     Object term44606;
     Object term44621;

    public IRFactory_init_176182148097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term43770 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term43906 = newInstance(Class.forName("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(term43770, term43770.getClass(), "ALLOWED_DIRECTIVES", null);
        setField(term43770, term43770.getClass(), "parsedComments", null);
        setField(term43770, term43770.getClass(), "rootNodeJsDocHolder", null);
        setField(term43770, term43770.getClass(), "fileLevelJsDocBuilder", null);
        setField(term43770, term43770.getClass(), "fileOverviewInfo", null);
        setField(term43770, term43770.getClass(), "sourceString", "");
        setField(term43770, term43770.getClass(), "sourceFile", term43906);
        setField(term43770, term43770.getClass(), "sourceName", null);
        setField(term43770, term43770.getClass(), "config", null);
        setField(term43770, term43770.getClass(), "errorReporter", null);
        setField(term43770, term43770.getClass(), "transformDispatcher", null);
        setField(term43770, term43770.getClass(), "templateNode", null);
        Class<? extends Object> term44626 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term44625 = ((Class) term44626).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term44625).setAccessible(true);
        Object enum85 = ((Field) term44625).get((Object) null);
        term43998 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setField(term43998, term43998.getClass(), "languageMode", enum85);
        Class<? extends Object> term44946 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term44945 = ((Class) term44946).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term44945).setAccessible(true);
        Object enum86 = ((Field) term44945).get((Object) null);
        HashMap term44613 = new HashMap();
        Set<Object> term45265 =  ((Map) term44613).keySet();
        HashSet term44612 = new HashSet((Collection<? extends Object>) term45265);
        HashMap term44617 = new HashMap();
        Set<Object> term45266 =  ((Map) term44617).keySet();
        HashSet term44616 = new HashSet((Collection<? extends Object>) term45266);
        term44606 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term44607 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term44611 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term44618 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44619 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term44620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term44606, term44606.getClass(), "sourceString", null);
        setField(term44606, term44606.getClass(), "sourceFile", null);
        setField(term44606, term44606.getClass(), "sourceName", null);
        setBooleanField(term44607, term44607.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term44607, term44607.getClass(), "isIdeMode", false);
        setField(term44607, term44607.getClass(), "annotationNames", null);
        setField(term44607, term44607.getClass(), "suppressionNames", null);
        setField(term44607, term44607.getClass(), "languageMode", enum86);
        setBooleanField(term44607, term44607.getClass(), "acceptConstKeyword", false);
        setField(term44606, term44606.getClass(), "config", term44607);
        setField(term44606, term44606.getClass(), "errorReporter", null);
        setField(term44611, term44611.getClass(), "this$0", term44606);
        setField(term44606, term44606.getClass(), "transformDispatcher", term44611);
        setField(term44606, term44606.getClass(), "ALLOWED_DIRECTIVES", term44612);
        setField(term44606, term44606.getClass(), "reservedKeywords", null);
        setField(term44606, term44606.getClass(), "parsedComments", term44616);
        setIntField(term44618, term44618.getClass(), "type", 132);
        setField(term44618, term44618.getClass(), "next", null);
        setField(term44618, term44618.getClass(), "first", null);
        setField(term44618, term44618.getClass(), "last", null);
        setField(term44618, term44618.getClass(), "propListHead", null);
        setIntField(term44618, term44618.getClass(), "sourcePosition", -1);
        setField(term44618, term44618.getClass(), "jsType", null);
        setField(term44618, term44618.getClass(), "parent", null);
        setField(term44606, term44606.getClass(), "rootNodeJsDocHolder", term44618);
        setField(term44619, term44619.getClass(), "this$0", term44618);
        setField(term44606, term44606.getClass(), "fileLevelJsDocBuilder", term44619);
        setField(term44606, term44606.getClass(), "fileOverviewInfo", null);
        setIntField(term44620, term44620.getClass(), "type", 132);
        setField(term44620, term44620.getClass(), "next", null);
        setField(term44620, term44620.getClass(), "first", null);
        setField(term44620, term44620.getClass(), "last", null);
        setField(term44620, term44620.getClass(), "propListHead", null);
        setIntField(term44620, term44620.getClass(), "sourcePosition", -1);
        setField(term44620, term44620.getClass(), "jsType", null);
        setField(term44620, term44620.getClass(), "parent", null);
        setField(term44606, term44606.getClass(), "templateNode", term44620);
        Class<? extends Object> term45268 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term45267 = ((Class) term45268).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term45267).setAccessible(true);
        Object enum87 = ((Field) term45267).get((Object) null);
        term44621 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setBooleanField(term44621, term44621.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term44621, term44621.getClass(), "isIdeMode", false);
        setField(term44621, term44621.getClass(), "annotationNames", null);
        setField(term44621, term44621.getClass(), "suppressionNames", null);
        setField(term44621, term44621.getClass(), "languageMode", enum87);
        setBooleanField(term44621, term44621.getClass(), "acceptConstKeyword", false);
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
        args[2] = term43998;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term44606));
        assertTrue(recursiveEquals(term43998, term44621));
    }

};


