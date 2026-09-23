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
     Object term9934;

    public IRFactory_justTransform_172892906644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9962 = new HashMap();
        HashMap term9971 = new HashMap();
        Set<Object> term35119 =  ((Map) term9971).keySet();
        HashSet term9970 = new HashSet((Collection<? extends Object>) term35119);
        Class<? extends Object> term35121 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term35120 = ((Class) term35121).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term35120).setAccessible(true);
        Object enum69 = ((Field) term35120).get((Object) null);
        HashMap term9995 = new HashMap();
        Set<Object> term35440 =  ((Map) term9995).keySet();
        HashSet term9994 = new HashSet((Collection<? extends Object>) term35440);
        HashMap term10012 = new HashMap();
        Set<Object> term35441 =  ((Map) term10012).keySet();
        HashSet term10011 = new HashSet((Collection<? extends Object>) term35441);
        HashMap term10033 = new HashMap();
        Set<Object> term35442 =  ((Map) term10033).keySet();
        HashSet term10032 = new HashSet((Collection<? extends Object>) term35442);
        term9934 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term9959 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term9993 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term10038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10040 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10042 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10044 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10051 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10055 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10057 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10059 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10062 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term10068 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term10069 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term9934, term9934.getClass(), "sourceString", "PXdVZyoJyC");
        setField(term9934, term9934.getClass(), "sourceFile", null);
        setField(term9934, term9934.getClass(), "sourceName", "vLerpqavFM");
        setBooleanField(term9959, term9959.getClass(), "parseJsDocDocumentation", true);
        setBooleanField(term9959, term9959.getClass(), "isIdeMode", false);
        setField(term9959, term9959.getClass(), "annotationNames", term9962);
        setField(term9959, term9959.getClass(), "suppressionNames", term9970);
        setField(term9959, term9959.getClass(), "languageMode", enum69);
        setBooleanField(term9959, term9959.getClass(), "acceptConstKeyword", false);
        setField(term9934, term9934.getClass(), "config", term9959);
        setField(term9934, term9934.getClass(), "errorReporter", null);
        setField(term9993, term9993.getClass(), "this$0", null);
        setField(term9934, term9934.getClass(), "transformDispatcher", term9993);
        setField(term9934, term9934.getClass(), "ALLOWED_DIRECTIVES", term9994);
        setField(term9934, term9934.getClass(), "reservedKeywords", term10011);
        setField(term9934, term9934.getClass(), "parsedComments", term10032);
        setIntField(term10038, term10038.getClass(), "type", 579006268);
        setIntField(term10040, term10040.getClass(), "type", -1694747156);
        setIntField(term10042, term10042.getClass(), "type", 1466373988);
        setIntField(term10044, term10044.getClass(), "type", -358526505);
        setField(term10044, term10044.getClass(), "next", null);
        setField(term10044, term10044.getClass(), "first", term10044);
        setField(term10044, term10044.getClass(), "last", term10040);
        setField(term10044, term10044.getClass(), "propListHead", null);
        setIntField(term10044, term10044.getClass(), "sourcePosition", 0);
        setField(term10044, term10044.getClass(), "jsType", null);
        setField(term10044, term10044.getClass(), "parent", null);
        setField(term10042, term10042.getClass(), "next", term10044);
        setField(term10042, term10042.getClass(), "first", term10040);
        setIntField(term10047, term10047.getClass(), "type", 0);
        setField(term10047, term10047.getClass(), "next", null);
        setField(term10047, term10047.getClass(), "first", null);
        setField(term10047, term10047.getClass(), "last", null);
        setField(term10047, term10047.getClass(), "propListHead", null);
        setIntField(term10047, term10047.getClass(), "sourcePosition", 0);
        setField(term10047, term10047.getClass(), "jsType", null);
        setField(term10047, term10047.getClass(), "parent", null);
        setField(term10042, term10042.getClass(), "last", term10047);
        setField(term10042, term10042.getClass(), "propListHead", null);
        setIntField(term10042, term10042.getClass(), "sourcePosition", 0);
        setField(term10042, term10042.getClass(), "jsType", null);
        setField(term10042, term10042.getClass(), "parent", null);
        setField(term10040, term10040.getClass(), "next", term10042);
        setIntField(term10051, term10051.getClass(), "type", 0);
        setField(term10051, term10051.getClass(), "next", null);
        setField(term10051, term10051.getClass(), "first", null);
        setField(term10051, term10051.getClass(), "last", null);
        setField(term10051, term10051.getClass(), "propListHead", null);
        setIntField(term10051, term10051.getClass(), "sourcePosition", 0);
        setField(term10051, term10051.getClass(), "jsType", null);
        setField(term10051, term10051.getClass(), "parent", null);
        setField(term10040, term10040.getClass(), "first", term10051);
        setField(term10040, term10040.getClass(), "last", term10051);
        setField(term10040, term10040.getClass(), "propListHead", null);
        setIntField(term10040, term10040.getClass(), "sourcePosition", 0);
        setField(term10040, term10040.getClass(), "jsType", null);
        setField(term10040, term10040.getClass(), "parent", null);
        setField(term10038, term10038.getClass(), "next", term10040);
        setIntField(term10055, term10055.getClass(), "type", 1843268026);
        setIntField(term10057, term10057.getClass(), "type", 954660603);
        setIntField(term10059, term10059.getClass(), "type", -1351605385);
        setField(term10059, term10059.getClass(), "next", term10051);
        setField(term10059, term10059.getClass(), "first", null);
        setField(term10059, term10059.getClass(), "last", term10047);
        setField(term10059, term10059.getClass(), "propListHead", null);
        setIntField(term10059, term10059.getClass(), "sourcePosition", 0);
        setField(term10059, term10059.getClass(), "jsType", null);
        setField(term10059, term10059.getClass(), "parent", null);
        setField(term10057, term10057.getClass(), "next", term10059);
        setField(term10057, term10057.getClass(), "first", term10051);
        setIntField(term10062, term10062.getClass(), "type", 0);
        setField(term10062, term10062.getClass(), "next", null);
        setField(term10062, term10062.getClass(), "first", null);
        setField(term10062, term10062.getClass(), "last", null);
        setField(term10062, term10062.getClass(), "propListHead", null);
        setIntField(term10062, term10062.getClass(), "sourcePosition", 0);
        setField(term10062, term10062.getClass(), "jsType", null);
        setField(term10062, term10062.getClass(), "parent", null);
        setField(term10057, term10057.getClass(), "last", term10062);
        setField(term10057, term10057.getClass(), "propListHead", null);
        setIntField(term10057, term10057.getClass(), "sourcePosition", 0);
        setField(term10057, term10057.getClass(), "jsType", null);
        setField(term10057, term10057.getClass(), "parent", null);
        setField(term10055, term10055.getClass(), "next", term10057);
        setField(term10055, term10055.getClass(), "first", term10038);
        setField(term10055, term10055.getClass(), "last", term10057);
        setField(term10055, term10055.getClass(), "propListHead", null);
        setIntField(term10055, term10055.getClass(), "sourcePosition", 0);
        setField(term10055, term10055.getClass(), "jsType", null);
        setField(term10055, term10055.getClass(), "parent", null);
        setField(term10038, term10038.getClass(), "first", term10055);
        setField(term10038, term10038.getClass(), "last", term10047);
        setField(term10038, term10038.getClass(), "propListHead", null);
        setIntField(term10038, term10038.getClass(), "sourcePosition", 0);
        setField(term10038, term10038.getClass(), "jsType", null);
        setField(term10038, term10038.getClass(), "parent", null);
        setField(term9934, term9934.getClass(), "rootNodeJsDocHolder", term10038);
        setField(term10068, term10068.getClass(), "this$0", null);
        setField(term9934, term9934.getClass(), "fileLevelJsDocBuilder", term10068);
        setField(term10069, term10069.getClass(), "info", null);
        setField(term10069, term10069.getClass(), "documentation", null);
        setField(term10069, term10069.getClass(), "associatedNode", null);
        setField(term10069, term10069.getClass(), "visibility", null);
        setIntField(term10069, term10069.getClass(), "bitset", 0);
        setField(term10069, term10069.getClass(), "type", null);
        setField(term10069, term10069.getClass(), "thisType", null);
        setBooleanField(term10069, term10069.getClass(), "includeDocumentation", false);
        setField(term9934, term9934.getClass(), "fileOverviewInfo", term10069);
        setField(term9934, term9934.getClass(), "templateNode", term10051);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "justTransform", argTypes, term9934, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


