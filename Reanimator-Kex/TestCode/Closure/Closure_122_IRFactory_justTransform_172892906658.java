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

public class IRFactory_justTransform_172892906658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14031;

    public IRFactory_justTransform_172892906658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term14059 = new HashMap();
        HashMap term14068 = new HashMap();
        Set<Object> term46118 =  ((Map) term14068).keySet();
        HashSet term14067 = new HashSet((Collection<? extends Object>) term46118);
        Class<? extends Object> term46120 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term46119 = ((Class) term46120).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term46119).setAccessible(true);
        Object enum92 = ((Field) term46119).get((Object) null);
        HashMap term14092 = new HashMap();
        Set<Object> term46439 =  ((Map) term14092).keySet();
        HashSet term14091 = new HashSet((Collection<? extends Object>) term46439);
        HashMap term14101 = new HashMap();
        Set<Object> term46440 =  ((Map) term14101).keySet();
        HashSet term14100 = new HashSet((Collection<? extends Object>) term46440);
        term14031 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term14056 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term14090 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term14106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14110 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14123 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14127 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term14136 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term14137 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term14031, term14031.getClass(), "sourceString", "KAORSSPSeV");
        setField(term14031, term14031.getClass(), "sourceFile", null);
        setField(term14031, term14031.getClass(), "sourceName", "UimMMORkzd");
        setBooleanField(term14056, term14056.getClass(), "parseJsDocDocumentation", true);
        setBooleanField(term14056, term14056.getClass(), "isIdeMode", false);
        setField(term14056, term14056.getClass(), "annotationNames", term14059);
        setField(term14056, term14056.getClass(), "suppressionNames", term14067);
        setField(term14056, term14056.getClass(), "languageMode", enum92);
        setBooleanField(term14056, term14056.getClass(), "acceptConstKeyword", false);
        setField(term14031, term14031.getClass(), "config", term14056);
        setField(term14031, term14031.getClass(), "errorReporter", null);
        setField(term14090, term14090.getClass(), "this$0", null);
        setField(term14031, term14031.getClass(), "transformDispatcher", term14090);
        setField(term14031, term14031.getClass(), "reservedKeywords", term14091);
        setField(term14031, term14031.getClass(), "parsedComments", term14100);
        setIntField(term14106, term14106.getClass(), "type", 43258317);
        setIntField(term14108, term14108.getClass(), "type", 1707220033);
        setIntField(term14110, term14110.getClass(), "type", -1792504217);
        setIntField(term14112, term14112.getClass(), "type", 1824538861);
        setField(term14112, term14112.getClass(), "next", null);
        setField(term14112, term14112.getClass(), "first", term14112);
        setField(term14112, term14112.getClass(), "last", term14108);
        setField(term14112, term14112.getClass(), "propListHead", null);
        setIntField(term14112, term14112.getClass(), "sourcePosition", 0);
        setField(term14112, term14112.getClass(), "jsType", null);
        setField(term14112, term14112.getClass(), "parent", null);
        setField(term14110, term14110.getClass(), "next", term14112);
        setField(term14110, term14110.getClass(), "first", term14108);
        setIntField(term14115, term14115.getClass(), "type", 0);
        setField(term14115, term14115.getClass(), "next", null);
        setField(term14115, term14115.getClass(), "first", null);
        setField(term14115, term14115.getClass(), "last", null);
        setField(term14115, term14115.getClass(), "propListHead", null);
        setIntField(term14115, term14115.getClass(), "sourcePosition", 0);
        setField(term14115, term14115.getClass(), "jsType", null);
        setField(term14115, term14115.getClass(), "parent", null);
        setField(term14110, term14110.getClass(), "last", term14115);
        setField(term14110, term14110.getClass(), "propListHead", null);
        setIntField(term14110, term14110.getClass(), "sourcePosition", 0);
        setField(term14110, term14110.getClass(), "jsType", null);
        setField(term14110, term14110.getClass(), "parent", null);
        setField(term14108, term14108.getClass(), "next", term14110);
        setIntField(term14119, term14119.getClass(), "type", 0);
        setField(term14119, term14119.getClass(), "next", null);
        setField(term14119, term14119.getClass(), "first", null);
        setField(term14119, term14119.getClass(), "last", null);
        setField(term14119, term14119.getClass(), "propListHead", null);
        setIntField(term14119, term14119.getClass(), "sourcePosition", 0);
        setField(term14119, term14119.getClass(), "jsType", null);
        setField(term14119, term14119.getClass(), "parent", null);
        setField(term14108, term14108.getClass(), "first", term14119);
        setField(term14108, term14108.getClass(), "last", term14119);
        setField(term14108, term14108.getClass(), "propListHead", null);
        setIntField(term14108, term14108.getClass(), "sourcePosition", 0);
        setField(term14108, term14108.getClass(), "jsType", null);
        setField(term14108, term14108.getClass(), "parent", null);
        setField(term14106, term14106.getClass(), "next", term14108);
        setIntField(term14123, term14123.getClass(), "type", 499519708);
        setIntField(term14125, term14125.getClass(), "type", 1501165033);
        setIntField(term14127, term14127.getClass(), "type", 510162332);
        setField(term14127, term14127.getClass(), "next", term14119);
        setField(term14127, term14127.getClass(), "first", null);
        setField(term14127, term14127.getClass(), "last", term14115);
        setField(term14127, term14127.getClass(), "propListHead", null);
        setIntField(term14127, term14127.getClass(), "sourcePosition", 0);
        setField(term14127, term14127.getClass(), "jsType", null);
        setField(term14127, term14127.getClass(), "parent", null);
        setField(term14125, term14125.getClass(), "next", term14127);
        setField(term14125, term14125.getClass(), "first", term14119);
        setIntField(term14130, term14130.getClass(), "type", 0);
        setField(term14130, term14130.getClass(), "next", null);
        setField(term14130, term14130.getClass(), "first", null);
        setField(term14130, term14130.getClass(), "last", null);
        setField(term14130, term14130.getClass(), "propListHead", null);
        setIntField(term14130, term14130.getClass(), "sourcePosition", 0);
        setField(term14130, term14130.getClass(), "jsType", null);
        setField(term14130, term14130.getClass(), "parent", null);
        setField(term14125, term14125.getClass(), "last", term14130);
        setField(term14125, term14125.getClass(), "propListHead", null);
        setIntField(term14125, term14125.getClass(), "sourcePosition", 0);
        setField(term14125, term14125.getClass(), "jsType", null);
        setField(term14125, term14125.getClass(), "parent", null);
        setField(term14123, term14123.getClass(), "next", term14125);
        setField(term14123, term14123.getClass(), "first", term14106);
        setField(term14123, term14123.getClass(), "last", term14125);
        setField(term14123, term14123.getClass(), "propListHead", null);
        setIntField(term14123, term14123.getClass(), "sourcePosition", 0);
        setField(term14123, term14123.getClass(), "jsType", null);
        setField(term14123, term14123.getClass(), "parent", null);
        setField(term14106, term14106.getClass(), "first", term14123);
        setField(term14106, term14106.getClass(), "last", term14115);
        setField(term14106, term14106.getClass(), "propListHead", null);
        setIntField(term14106, term14106.getClass(), "sourcePosition", 0);
        setField(term14106, term14106.getClass(), "jsType", null);
        setField(term14106, term14106.getClass(), "parent", null);
        setField(term14031, term14031.getClass(), "rootNodeJsDocHolder", term14106);
        setField(term14136, term14136.getClass(), "this$0", null);
        setField(term14031, term14031.getClass(), "fileLevelJsDocBuilder", term14136);
        setField(term14137, term14137.getClass(), "info", null);
        setField(term14137, term14137.getClass(), "documentation", null);
        setField(term14137, term14137.getClass(), "associatedNode", null);
        setField(term14137, term14137.getClass(), "visibility", null);
        setIntField(term14137, term14137.getClass(), "bitset", 0);
        setField(term14137, term14137.getClass(), "type", null);
        setField(term14137, term14137.getClass(), "thisType", null);
        setBooleanField(term14137, term14137.getClass(), "includeDocumentation", false);
        setIntField(term14137, term14137.getClass(), "originalCommentPosition", 0);
        setField(term14031, term14031.getClass(), "fileOverviewInfo", term14137);
        setField(term14031, term14031.getClass(), "templateNode", term14119);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "justTransform", argTypes, term14031, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


