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
import java.lang.NullPointerException;
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.lang.String;

public class IRFactory_transformBlock_82973297228 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2691;

    public IRFactory_transformBlock_82973297228() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2719 = new HashMap();
        HashMap term2728 = new HashMap();
        Set<Object> term21681 =  ((Map) term2728).keySet();
        HashSet term2727 = new HashSet((Collection<? extends Object>) term21681);
        Class<? extends Object> term21683 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term21682 = ((Class) term21683).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term21682).setAccessible(true);
        Object enum39 = ((Field) term21682).get((Object) null);
        HashMap term2752 = new HashMap();
        Set<Object> term22002 =  ((Map) term2752).keySet();
        HashSet term2751 = new HashSet((Collection<? extends Object>) term22002);
        HashMap term2761 = new HashMap();
        Set<Object> term22003 =  ((Map) term2761).keySet();
        HashSet term2760 = new HashSet((Collection<? extends Object>) term22003);
        term2691 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term2716 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term2750 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term2777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2784 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2787 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2790 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2794 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2800 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term2804 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term2805 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term2808 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2691, term2691.getClass(), "sourceString", "tShwQLRGNe");
        setField(term2691, term2691.getClass(), "sourceName", "LvtrsXUliU");
        setBooleanField(term2716, term2716.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term2716, term2716.getClass(), "isIdeMode", true);
        setField(term2716, term2716.getClass(), "annotationNames", term2719);
        setField(term2716, term2716.getClass(), "suppressionNames", term2727);
        setField(term2716, term2716.getClass(), "languageMode", enum39);
        setBooleanField(term2716, term2716.getClass(), "acceptConstKeyword", true);
        setField(term2691, term2691.getClass(), "config", term2716);
        setField(term2691, term2691.getClass(), "errorReporter", null);
        setField(term2750, term2750.getClass(), "this$0", null);
        setField(term2691, term2691.getClass(), "transformDispatcher", term2750);
        setField(term2691, term2691.getClass(), "ALLOWED_DIRECTIVES", term2751);
        setField(term2691, term2691.getClass(), "reservedKeywords", term2760);
        setIntField(term2777, term2777.getClass(), "type", 1632125673);
        setIntField(term2779, term2779.getClass(), "type", -1048298087);
        setIntField(term2781, term2781.getClass(), "type", 0);
        setField(term2781, term2781.getClass(), "next", null);
        setField(term2781, term2781.getClass(), "first", null);
        setField(term2781, term2781.getClass(), "last", null);
        setField(term2781, term2781.getClass(), "propListHead", null);
        setIntField(term2781, term2781.getClass(), "sourcePosition", 0);
        setField(term2781, term2781.getClass(), "jsType", null);
        setField(term2781, term2781.getClass(), "parent", null);
        setField(term2779, term2779.getClass(), "next", term2781);
        setIntField(term2784, term2784.getClass(), "type", 0);
        setField(term2784, term2784.getClass(), "next", null);
        setField(term2784, term2784.getClass(), "first", null);
        setField(term2784, term2784.getClass(), "last", null);
        setField(term2784, term2784.getClass(), "propListHead", null);
        setIntField(term2784, term2784.getClass(), "sourcePosition", 0);
        setField(term2784, term2784.getClass(), "jsType", null);
        setField(term2784, term2784.getClass(), "parent", null);
        setField(term2779, term2779.getClass(), "first", term2784);
        setIntField(term2787, term2787.getClass(), "type", 0);
        setField(term2787, term2787.getClass(), "next", null);
        setField(term2787, term2787.getClass(), "first", null);
        setField(term2787, term2787.getClass(), "last", null);
        setField(term2787, term2787.getClass(), "propListHead", null);
        setIntField(term2787, term2787.getClass(), "sourcePosition", 0);
        setField(term2787, term2787.getClass(), "jsType", null);
        setField(term2787, term2787.getClass(), "parent", null);
        setField(term2779, term2779.getClass(), "last", term2787);
        setField(term2790, term2790.getClass(), "next", null);
        setIntField(term2790, term2790.getClass(), "type", 0);
        setIntField(term2790, term2790.getClass(), "intValue", 0);
        setField(term2790, term2790.getClass(), "objectValue", null);
        setField(term2779, term2779.getClass(), "propListHead", term2790);
        setIntField(term2779, term2779.getClass(), "sourcePosition", 292681826);
        setField(term2779, term2779.getClass(), "jsType", null);
        setField(term2779, term2779.getClass(), "parent", null);
        setField(term2777, term2777.getClass(), "next", term2779);
        setIntField(term2794, term2794.getClass(), "type", 0);
        setField(term2794, term2794.getClass(), "next", null);
        setField(term2794, term2794.getClass(), "first", null);
        setField(term2794, term2794.getClass(), "last", null);
        setField(term2794, term2794.getClass(), "propListHead", null);
        setIntField(term2794, term2794.getClass(), "sourcePosition", 0);
        setField(term2794, term2794.getClass(), "jsType", null);
        setField(term2794, term2794.getClass(), "parent", null);
        setField(term2777, term2777.getClass(), "first", term2794);
        setIntField(term2797, term2797.getClass(), "type", 0);
        setField(term2797, term2797.getClass(), "next", null);
        setField(term2797, term2797.getClass(), "first", null);
        setField(term2797, term2797.getClass(), "last", null);
        setField(term2797, term2797.getClass(), "propListHead", null);
        setIntField(term2797, term2797.getClass(), "sourcePosition", 0);
        setField(term2797, term2797.getClass(), "jsType", null);
        setField(term2797, term2797.getClass(), "parent", null);
        setField(term2777, term2777.getClass(), "last", term2797);
        setField(term2800, term2800.getClass(), "next", null);
        setIntField(term2800, term2800.getClass(), "type", 0);
        setIntField(term2800, term2800.getClass(), "intValue", 0);
        setField(term2800, term2800.getClass(), "objectValue", null);
        setField(term2777, term2777.getClass(), "propListHead", term2800);
        setIntField(term2777, term2777.getClass(), "sourcePosition", 458147407);
        setField(term2777, term2777.getClass(), "jsType", null);
        setField(term2777, term2777.getClass(), "parent", null);
        setField(term2691, term2691.getClass(), "rootNodeJsDocHolder", term2777);
        setField(term2804, term2804.getClass(), "this$0", null);
        setField(term2691, term2691.getClass(), "fileLevelJsDocBuilder", term2804);
        setField(term2805, term2805.getClass(), "info", null);
        setField(term2805, term2805.getClass(), "documentation", null);
        setField(term2805, term2805.getClass(), "sourceName", null);
        setField(term2805, term2805.getClass(), "visibility", null);
        setIntField(term2805, term2805.getClass(), "bitset", 0);
        setField(term2805, term2805.getClass(), "type", null);
        setField(term2805, term2805.getClass(), "thisType", null);
        setBooleanField(term2805, term2805.getClass(), "includeDocumentation", false);
        setField(term2691, term2691.getClass(), "fileOverviewInfo", term2805);
        setIntField(term2808, term2808.getClass(), "type", 0);
        setField(term2808, term2808.getClass(), "next", null);
        setField(term2808, term2808.getClass(), "first", null);
        setField(term2808, term2808.getClass(), "last", null);
        setField(term2808, term2808.getClass(), "propListHead", null);
        setIntField(term2808, term2808.getClass(), "sourcePosition", 0);
        setField(term2808, term2808.getClass(), "jsType", null);
        setField(term2808, term2808.getClass(), "parent", null);
        setField(term2691, term2691.getClass(), "templateNode", term2808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "transformBlock", argTypes, term2691, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


