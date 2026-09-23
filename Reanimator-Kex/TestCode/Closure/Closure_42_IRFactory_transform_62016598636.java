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

public class IRFactory_transform_62016598636 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6108;

    public IRFactory_transform_62016598636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6136 = new HashMap();
        HashMap term6145 = new HashMap();
        Set<Object> term28213 =  ((Map) term6145).keySet();
        HashSet term6144 = new HashSet((Collection<? extends Object>) term28213);
        Class<? extends Object> term28215 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term28214 = ((Class) term28215).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term28214).setAccessible(true);
        Object enum56 = ((Field) term28214).get((Object) null);
        HashMap term6169 = new HashMap();
        Set<Object> term28534 =  ((Map) term6169).keySet();
        HashSet term6168 = new HashSet((Collection<? extends Object>) term28534);
        HashMap term6186 = new HashMap();
        Set<Object> term28535 =  ((Map) term6186).keySet();
        HashSet term6185 = new HashSet((Collection<? extends Object>) term28535);
        HashMap term6203 = new HashMap();
        Set<Object> term28536 =  ((Map) term6203).keySet();
        HashSet term6202 = new HashSet((Collection<? extends Object>) term28536);
        term6108 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term6133 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term6167 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term6227 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6230 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term6231 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term6234 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term6108, term6108.getClass(), "sourceString", "hMmaoREuCK");
        setField(term6108, term6108.getClass(), "sourceFile", null);
        setField(term6108, term6108.getClass(), "sourceName", "VeDtgDzGAN");
        setBooleanField(term6133, term6133.getClass(), "parseJsDocDocumentation", true);
        setBooleanField(term6133, term6133.getClass(), "isIdeMode", false);
        setField(term6133, term6133.getClass(), "annotationNames", term6136);
        setField(term6133, term6133.getClass(), "suppressionNames", term6144);
        setField(term6133, term6133.getClass(), "languageMode", enum56);
        setBooleanField(term6133, term6133.getClass(), "acceptConstKeyword", true);
        setField(term6108, term6108.getClass(), "config", term6133);
        setField(term6108, term6108.getClass(), "errorReporter", null);
        setField(term6167, term6167.getClass(), "this$0", null);
        setField(term6108, term6108.getClass(), "transformDispatcher", term6167);
        setField(term6108, term6108.getClass(), "ALLOWED_DIRECTIVES", term6168);
        setField(term6108, term6108.getClass(), "reservedKeywords", term6185);
        setField(term6108, term6108.getClass(), "parsedComments", term6202);
        setIntField(term6227, term6227.getClass(), "type", 0);
        setField(term6227, term6227.getClass(), "next", null);
        setField(term6227, term6227.getClass(), "first", null);
        setField(term6227, term6227.getClass(), "last", null);
        setField(term6227, term6227.getClass(), "propListHead", null);
        setIntField(term6227, term6227.getClass(), "sourcePosition", 0);
        setField(term6227, term6227.getClass(), "jsType", null);
        setField(term6227, term6227.getClass(), "parent", null);
        setField(term6108, term6108.getClass(), "rootNodeJsDocHolder", term6227);
        setField(term6230, term6230.getClass(), "this$0", null);
        setField(term6108, term6108.getClass(), "fileLevelJsDocBuilder", term6230);
        setField(term6231, term6231.getClass(), "info", null);
        setField(term6231, term6231.getClass(), "documentation", null);
        setField(term6231, term6231.getClass(), "associatedNode", null);
        setField(term6231, term6231.getClass(), "visibility", null);
        setIntField(term6231, term6231.getClass(), "bitset", 0);
        setField(term6231, term6231.getClass(), "type", null);
        setField(term6231, term6231.getClass(), "thisType", null);
        setBooleanField(term6231, term6231.getClass(), "includeDocumentation", false);
        setField(term6108, term6108.getClass(), "fileOverviewInfo", term6231);
        setIntField(term6234, term6234.getClass(), "type", 0);
        setField(term6234, term6234.getClass(), "next", null);
        setField(term6234, term6234.getClass(), "first", null);
        setField(term6234, term6234.getClass(), "last", null);
        setField(term6234, term6234.getClass(), "propListHead", null);
        setIntField(term6234, term6234.getClass(), "sourcePosition", 0);
        setField(term6234, term6234.getClass(), "jsType", null);
        setField(term6234, term6234.getClass(), "parent", null);
        setField(term6108, term6108.getClass(), "templateNode", term6234);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "transform", argTypes, term6108, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


