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

public class IRFactory_transform_62016598647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7959;

    public IRFactory_transform_62016598647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7987 = new HashMap();
        HashMap term7996 = new HashMap();
        Set<Object> term34480 =  ((Map) term7996).keySet();
        HashSet term7995 = new HashSet((Collection<? extends Object>) term34480);
        Class<? extends Object> term34482 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term34481 = ((Class) term34482).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term34481).setAccessible(true);
        Object enum69 = ((Field) term34481).get((Object) null);
        HashMap term8020 = new HashMap();
        Set<Object> term34801 =  ((Map) term8020).keySet();
        HashSet term8019 = new HashSet((Collection<? extends Object>) term34801);
        HashMap term8039 = new HashMap();
        Set<Object> term34802 =  ((Map) term8039).keySet();
        HashSet term8038 = new HashSet((Collection<? extends Object>) term34802);
        term7959 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term7984 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term8018 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term8057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term8060 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term8061 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term8065 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term7959, term7959.getClass(), "sourceString", "xvkbvaEGYd");
        setField(term7959, term7959.getClass(), "sourceFile", null);
        setField(term7959, term7959.getClass(), "sourceName", "HBGNxdNURv");
        setBooleanField(term7984, term7984.getClass(), "parseJsDocDocumentation", true);
        setBooleanField(term7984, term7984.getClass(), "isIdeMode", false);
        setField(term7984, term7984.getClass(), "annotationNames", term7987);
        setField(term7984, term7984.getClass(), "suppressionNames", term7995);
        setField(term7984, term7984.getClass(), "languageMode", enum69);
        setBooleanField(term7984, term7984.getClass(), "acceptConstKeyword", true);
        setField(term7959, term7959.getClass(), "config", term7984);
        setField(term7959, term7959.getClass(), "errorReporter", null);
        setField(term8018, term8018.getClass(), "this$0", null);
        setField(term7959, term7959.getClass(), "transformDispatcher", term8018);
        setField(term7959, term7959.getClass(), "reservedKeywords", term8019);
        setField(term7959, term7959.getClass(), "parsedComments", term8038);
        setIntField(term8057, term8057.getClass(), "type", 0);
        setField(term8057, term8057.getClass(), "next", null);
        setField(term8057, term8057.getClass(), "first", null);
        setField(term8057, term8057.getClass(), "last", null);
        setField(term8057, term8057.getClass(), "propListHead", null);
        setIntField(term8057, term8057.getClass(), "sourcePosition", 0);
        setField(term8057, term8057.getClass(), "jsType", null);
        setField(term8057, term8057.getClass(), "parent", null);
        setField(term7959, term7959.getClass(), "rootNodeJsDocHolder", term8057);
        setField(term8060, term8060.getClass(), "this$0", null);
        setField(term7959, term7959.getClass(), "fileLevelJsDocBuilder", term8060);
        setField(term8061, term8061.getClass(), "info", null);
        setField(term8061, term8061.getClass(), "documentation", null);
        setField(term8061, term8061.getClass(), "associatedNode", null);
        setField(term8061, term8061.getClass(), "visibility", null);
        setIntField(term8061, term8061.getClass(), "bitset", 0);
        setField(term8061, term8061.getClass(), "type", null);
        setField(term8061, term8061.getClass(), "thisType", null);
        setBooleanField(term8061, term8061.getClass(), "includeDocumentation", false);
        setIntField(term8061, term8061.getClass(), "originalCommentPosition", 0);
        setField(term7959, term7959.getClass(), "fileOverviewInfo", term8061);
        setIntField(term8065, term8065.getClass(), "type", 0);
        setField(term8065, term8065.getClass(), "next", null);
        setField(term8065, term8065.getClass(), "first", null);
        setField(term8065, term8065.getClass(), "last", null);
        setField(term8065, term8065.getClass(), "propListHead", null);
        setIntField(term8065, term8065.getClass(), "sourcePosition", 0);
        setField(term8065, term8065.getClass(), "jsType", null);
        setField(term8065, term8065.getClass(), "parent", null);
        setField(term7959, term7959.getClass(), "templateNode", term8065);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "transform", argTypes, term7959, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


