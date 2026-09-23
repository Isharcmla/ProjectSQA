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

public class IRFactory_justTransform_172892906644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9942;

    public IRFactory_justTransform_172892906644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9970 = new HashMap();
        HashMap term9979 = new HashMap();
        Set<Object> term36640 =  ((Map) term9979).keySet();
        HashSet term9978 = new HashSet((Collection<? extends Object>) term36640);
        Class<? extends Object> term36642 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term36641 = ((Class) term36642).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term36641).setAccessible(true);
        Object enum72 = ((Field) term36641).get((Object) null);
        HashMap term10003 = new HashMap();
        Set<Object> term36961 =  ((Map) term10003).keySet();
        HashSet term10002 = new HashSet((Collection<? extends Object>) term36961);
        HashMap term10020 = new HashMap();
        Set<Object> term36962 =  ((Map) term10020).keySet();
        HashSet term10019 = new HashSet((Collection<? extends Object>) term36962);
        HashMap term10041 = new HashMap();
        Set<Object> term36963 =  ((Map) term10041).keySet();
        HashSet term10040 = new HashSet((Collection<? extends Object>) term36963);
        term9942 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term9967 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term10001 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term10046 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10050 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10052 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10063 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10076 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term10077 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term9942, term9942.getClass(), "sourceString", "PXdVZyoJyC");
        setField(term9942, term9942.getClass(), "sourceFile", null);
        setField(term9942, term9942.getClass(), "sourceName", "vLerpqavFM");
        setBooleanField(term9967, term9967.getClass(), "parseJsDocDocumentation", true);
        setBooleanField(term9967, term9967.getClass(), "isIdeMode", false);
        setField(term9967, term9967.getClass(), "annotationNames", term9970);
        setField(term9967, term9967.getClass(), "suppressionNames", term9978);
        setField(term9967, term9967.getClass(), "languageMode", enum72);
        setBooleanField(term9967, term9967.getClass(), "acceptConstKeyword", false);
        setField(term9942, term9942.getClass(), "config", term9967);
        setField(term9942, term9942.getClass(), "errorReporter", null);
        setField(term10001, term10001.getClass(), "this$0", null);
        setField(term9942, term9942.getClass(), "transformDispatcher", term10001);
        setField(term9942, term9942.getClass(), "ALLOWED_DIRECTIVES", term10002);
        setField(term9942, term9942.getClass(), "reservedKeywords", term10019);
        setField(term9942, term9942.getClass(), "parsedComments", term10040);
        setIntField(term10046, term10046.getClass(), "type", 579006268);
        setIntField(term10048, term10048.getClass(), "type", -1694747156);
        setIntField(term10050, term10050.getClass(), "type", 1466373988);
        setIntField(term10052, term10052.getClass(), "type", -358526505);
        setField(term10052, term10052.getClass(), "next", null);
        setField(term10052, term10052.getClass(), "first", term10052);
        setField(term10052, term10052.getClass(), "last", term10048);
        setField(term10052, term10052.getClass(), "propListHead", null);
        setIntField(term10052, term10052.getClass(), "sourcePosition", 0);
        setField(term10052, term10052.getClass(), "jsType", null);
        setField(term10052, term10052.getClass(), "parent", null);
        setField(term10050, term10050.getClass(), "next", term10052);
        setField(term10050, term10050.getClass(), "first", term10048);
        setIntField(term10055, term10055.getClass(), "type", 0);
        setField(term10055, term10055.getClass(), "next", null);
        setField(term10055, term10055.getClass(), "first", null);
        setField(term10055, term10055.getClass(), "last", null);
        setField(term10055, term10055.getClass(), "propListHead", null);
        setIntField(term10055, term10055.getClass(), "sourcePosition", 0);
        setField(term10055, term10055.getClass(), "jsType", null);
        setField(term10055, term10055.getClass(), "parent", null);
        setField(term10050, term10050.getClass(), "last", term10055);
        setField(term10050, term10050.getClass(), "propListHead", null);
        setIntField(term10050, term10050.getClass(), "sourcePosition", 0);
        setField(term10050, term10050.getClass(), "jsType", null);
        setField(term10050, term10050.getClass(), "parent", null);
        setField(term10048, term10048.getClass(), "next", term10050);
        setIntField(term10059, term10059.getClass(), "type", 0);
        setField(term10059, term10059.getClass(), "next", null);
        setField(term10059, term10059.getClass(), "first", null);
        setField(term10059, term10059.getClass(), "last", null);
        setField(term10059, term10059.getClass(), "propListHead", null);
        setIntField(term10059, term10059.getClass(), "sourcePosition", 0);
        setField(term10059, term10059.getClass(), "jsType", null);
        setField(term10059, term10059.getClass(), "parent", null);
        setField(term10048, term10048.getClass(), "first", term10059);
        setField(term10048, term10048.getClass(), "last", term10059);
        setField(term10048, term10048.getClass(), "propListHead", null);
        setIntField(term10048, term10048.getClass(), "sourcePosition", 0);
        setField(term10048, term10048.getClass(), "jsType", null);
        setField(term10048, term10048.getClass(), "parent", null);
        setField(term10046, term10046.getClass(), "next", term10048);
        setIntField(term10063, term10063.getClass(), "type", 1843268026);
        setIntField(term10065, term10065.getClass(), "type", 954660603);
        setIntField(term10067, term10067.getClass(), "type", -1351605385);
        setField(term10067, term10067.getClass(), "next", term10059);
        setField(term10067, term10067.getClass(), "first", null);
        setField(term10067, term10067.getClass(), "last", term10055);
        setField(term10067, term10067.getClass(), "propListHead", null);
        setIntField(term10067, term10067.getClass(), "sourcePosition", 0);
        setField(term10067, term10067.getClass(), "jsType", null);
        setField(term10067, term10067.getClass(), "parent", null);
        setField(term10065, term10065.getClass(), "next", term10067);
        setField(term10065, term10065.getClass(), "first", term10059);
        setIntField(term10070, term10070.getClass(), "type", 0);
        setField(term10070, term10070.getClass(), "next", null);
        setField(term10070, term10070.getClass(), "first", null);
        setField(term10070, term10070.getClass(), "last", null);
        setField(term10070, term10070.getClass(), "propListHead", null);
        setIntField(term10070, term10070.getClass(), "sourcePosition", 0);
        setField(term10070, term10070.getClass(), "jsType", null);
        setField(term10070, term10070.getClass(), "parent", null);
        setField(term10065, term10065.getClass(), "last", term10070);
        setField(term10065, term10065.getClass(), "propListHead", null);
        setIntField(term10065, term10065.getClass(), "sourcePosition", 0);
        setField(term10065, term10065.getClass(), "jsType", null);
        setField(term10065, term10065.getClass(), "parent", null);
        setField(term10063, term10063.getClass(), "next", term10065);
        setField(term10063, term10063.getClass(), "first", term10046);
        setField(term10063, term10063.getClass(), "last", term10065);
        setField(term10063, term10063.getClass(), "propListHead", null);
        setIntField(term10063, term10063.getClass(), "sourcePosition", 0);
        setField(term10063, term10063.getClass(), "jsType", null);
        setField(term10063, term10063.getClass(), "parent", null);
        setField(term10046, term10046.getClass(), "first", term10063);
        setField(term10046, term10046.getClass(), "last", term10055);
        setField(term10046, term10046.getClass(), "propListHead", null);
        setIntField(term10046, term10046.getClass(), "sourcePosition", 0);
        setField(term10046, term10046.getClass(), "jsType", null);
        setField(term10046, term10046.getClass(), "parent", null);
        setField(term9942, term9942.getClass(), "rootNodeJsDocHolder", term10046);
        setField(term10076, term10076.getClass(), "this$0", null);
        setField(term9942, term9942.getClass(), "fileLevelJsDocBuilder", term10076);
        setField(term10077, term10077.getClass(), "info", null);
        setField(term10077, term10077.getClass(), "documentation", null);
        setField(term10077, term10077.getClass(), "associatedNode", null);
        setField(term10077, term10077.getClass(), "visibility", null);
        setIntField(term10077, term10077.getClass(), "bitset", 0);
        setField(term10077, term10077.getClass(), "type", null);
        setField(term10077, term10077.getClass(), "thisType", null);
        setBooleanField(term10077, term10077.getClass(), "includeDocumentation", false);
        setField(term9942, term9942.getClass(), "fileOverviewInfo", term10077);
        setField(term9942, term9942.getClass(), "templateNode", term10059);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "justTransform", argTypes, term9942, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


