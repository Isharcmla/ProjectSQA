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

public class IRFactory_maybeSetLengthFrom_107699381042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8975;
     Object term9084;

    public IRFactory_maybeSetLengthFrom_107699381042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9003 = new HashMap();
        HashMap term9012 = new HashMap();
        Set<Object> term33697 =  ((Map) term9012).keySet();
        HashSet term9011 = new HashSet((Collection<? extends Object>) term33697);
        Class<? extends Object> term33699 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term33698 = ((Class) term33699).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term33698).setAccessible(true);
        Object enum66 = ((Field) term33698).get((Object) null);
        HashMap term9043 = new HashMap();
        Set<Object> term34039 =  ((Map) term9043).keySet();
        HashSet term9042 = new HashSet((Collection<? extends Object>) term34039);
        HashMap term9052 = new HashMap();
        Set<Object> term34040 =  ((Map) term9052).keySet();
        HashSet term9051 = new HashSet((Collection<? extends Object>) term34040);
        HashMap term9058 = new HashMap();
        Set<Object> term34041 =  ((Map) term9058).keySet();
        HashSet term9057 = new HashSet((Collection<? extends Object>) term34041);
        term8975 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term9000 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term9041 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term9074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9077 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term9078 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term9081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term8975, term8975.getClass(), "sourceString", "zaloBqlrSo");
        setField(term8975, term8975.getClass(), "sourceFile", null);
        setField(term8975, term8975.getClass(), "sourceName", "vvoLrMGCoN");
        setBooleanField(term9000, term9000.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term9000, term9000.getClass(), "isIdeMode", true);
        setField(term9000, term9000.getClass(), "annotationNames", term9003);
        setField(term9000, term9000.getClass(), "suppressionNames", term9011);
        setField(term9000, term9000.getClass(), "languageMode", enum66);
        setBooleanField(term9000, term9000.getClass(), "acceptConstKeyword", false);
        setField(term8975, term8975.getClass(), "config", term9000);
        setField(term8975, term8975.getClass(), "errorReporter", null);
        setField(term9041, term9041.getClass(), "this$0", null);
        setField(term8975, term8975.getClass(), "transformDispatcher", term9041);
        setField(term8975, term8975.getClass(), "ALLOWED_DIRECTIVES", term9042);
        setField(term8975, term8975.getClass(), "reservedKeywords", term9051);
        setField(term8975, term8975.getClass(), "parsedComments", term9057);
        setIntField(term9074, term9074.getClass(), "type", 0);
        setField(term9074, term9074.getClass(), "next", null);
        setField(term9074, term9074.getClass(), "first", null);
        setField(term9074, term9074.getClass(), "last", null);
        setField(term9074, term9074.getClass(), "propListHead", null);
        setIntField(term9074, term9074.getClass(), "sourcePosition", 0);
        setField(term9074, term9074.getClass(), "jsType", null);
        setField(term9074, term9074.getClass(), "parent", null);
        setField(term8975, term8975.getClass(), "rootNodeJsDocHolder", term9074);
        setField(term9077, term9077.getClass(), "this$0", null);
        setField(term8975, term8975.getClass(), "fileLevelJsDocBuilder", term9077);
        setField(term9078, term9078.getClass(), "info", null);
        setField(term9078, term9078.getClass(), "documentation", null);
        setField(term9078, term9078.getClass(), "associatedNode", null);
        setField(term9078, term9078.getClass(), "visibility", null);
        setIntField(term9078, term9078.getClass(), "bitset", 0);
        setField(term9078, term9078.getClass(), "type", null);
        setField(term9078, term9078.getClass(), "thisType", null);
        setBooleanField(term9078, term9078.getClass(), "includeDocumentation", false);
        setField(term8975, term8975.getClass(), "fileOverviewInfo", term9078);
        setIntField(term9081, term9081.getClass(), "type", 0);
        setField(term9081, term9081.getClass(), "next", null);
        setField(term9081, term9081.getClass(), "first", null);
        setField(term9081, term9081.getClass(), "last", null);
        setField(term9081, term9081.getClass(), "propListHead", null);
        setIntField(term9081, term9081.getClass(), "sourcePosition", 0);
        setField(term9081, term9081.getClass(), "jsType", null);
        setField(term9081, term9081.getClass(), "parent", null);
        setField(term8975, term8975.getClass(), "templateNode", term9081);
        term9084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9088 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9095 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9084, term9084.getClass(), "type", 1901317214);
        setIntField(term9086, term9086.getClass(), "type", 1166710220);
        setIntField(term9088, term9088.getClass(), "type", -1070592289);
        setIntField(term9090, term9090.getClass(), "type", -1464172784);
        setIntField(term9092, term9092.getClass(), "type", 32185364);
        setField(term9092, term9092.getClass(), "next", null);
        setField(term9092, term9092.getClass(), "first", null);
        setField(term9092, term9092.getClass(), "last", null);
        setField(term9092, term9092.getClass(), "propListHead", null);
        setIntField(term9092, term9092.getClass(), "sourcePosition", 0);
        setField(term9092, term9092.getClass(), "jsType", null);
        setField(term9092, term9092.getClass(), "parent", null);
        setField(term9090, term9090.getClass(), "next", term9092);
        setIntField(term9095, term9095.getClass(), "type", 1768204942);
        setField(term9095, term9095.getClass(), "next", null);
        setField(term9095, term9095.getClass(), "first", null);
        setField(term9095, term9095.getClass(), "last", term9092);
        setField(term9095, term9095.getClass(), "propListHead", null);
        setIntField(term9095, term9095.getClass(), "sourcePosition", 0);
        setField(term9095, term9095.getClass(), "jsType", null);
        setField(term9095, term9095.getClass(), "parent", null);
        setField(term9090, term9090.getClass(), "first", term9095);
        setField(term9090, term9090.getClass(), "last", term9088);
        setField(term9090, term9090.getClass(), "propListHead", null);
        setIntField(term9090, term9090.getClass(), "sourcePosition", 0);
        setField(term9090, term9090.getClass(), "jsType", null);
        setField(term9090, term9090.getClass(), "parent", null);
        setField(term9088, term9088.getClass(), "next", term9090);
        setField(term9088, term9088.getClass(), "first", term9092);
        setIntField(term9099, term9099.getClass(), "type", 574481092);
        setIntField(term9101, term9101.getClass(), "type", -310528004);
        setField(term9101, term9101.getClass(), "next", null);
        setField(term9101, term9101.getClass(), "first", term9095);
        setField(term9101, term9101.getClass(), "last", term9090);
        setField(term9101, term9101.getClass(), "propListHead", null);
        setIntField(term9101, term9101.getClass(), "sourcePosition", 0);
        setField(term9101, term9101.getClass(), "jsType", null);
        setField(term9101, term9101.getClass(), "parent", null);
        setField(term9099, term9099.getClass(), "next", term9101);
        setField(term9099, term9099.getClass(), "first", term9086);
        setField(term9099, term9099.getClass(), "last", term9086);
        setField(term9099, term9099.getClass(), "propListHead", null);
        setIntField(term9099, term9099.getClass(), "sourcePosition", 0);
        setField(term9099, term9099.getClass(), "jsType", null);
        setField(term9099, term9099.getClass(), "parent", null);
        setField(term9088, term9088.getClass(), "last", term9099);
        setField(term9088, term9088.getClass(), "propListHead", null);
        setIntField(term9088, term9088.getClass(), "sourcePosition", 0);
        setField(term9088, term9088.getClass(), "jsType", null);
        setField(term9088, term9088.getClass(), "parent", null);
        setField(term9086, term9086.getClass(), "next", term9088);
        setIntField(term9106, term9106.getClass(), "type", -634976996);
        setField(term9106, term9106.getClass(), "next", term9099);
        setField(term9106, term9106.getClass(), "first", term9101);
        setField(term9106, term9106.getClass(), "last", term9084);
        setField(term9106, term9106.getClass(), "propListHead", null);
        setIntField(term9106, term9106.getClass(), "sourcePosition", 0);
        setField(term9106, term9106.getClass(), "jsType", null);
        setField(term9106, term9106.getClass(), "parent", null);
        setField(term9086, term9086.getClass(), "first", term9106);
        setField(term9086, term9086.getClass(), "last", term9106);
        setField(term9086, term9086.getClass(), "propListHead", null);
        setIntField(term9086, term9086.getClass(), "sourcePosition", 0);
        setField(term9086, term9086.getClass(), "jsType", null);
        setField(term9086, term9086.getClass(), "parent", null);
        setField(term9084, term9084.getClass(), "next", term9086);
        setField(term9084, term9084.getClass(), "first", term9090);
        setField(term9084, term9084.getClass(), "last", term9092);
        setField(term9084, term9084.getClass(), "propListHead", null);
        setIntField(term9084, term9084.getClass(), "sourcePosition", 0);
        setField(term9084, term9084.getClass(), "jsType", null);
        setField(term9084, term9084.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Object[] args = new Object[2];
        args[0] = term9084;
        args[1] = null;
        try {
            callMethod(klass, "maybeSetLengthFrom", argTypes, term8975, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


