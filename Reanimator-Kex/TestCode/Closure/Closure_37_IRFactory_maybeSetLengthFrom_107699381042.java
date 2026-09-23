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
     Object term8981;
     Object term9092;

    public IRFactory_maybeSetLengthFrom_107699381042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9009 = new HashMap();
        HashMap term9018 = new HashMap();
        Set<Object> term33716 =  ((Map) term9018).keySet();
        HashSet term9017 = new HashSet((Collection<? extends Object>) term33716);
        Class<? extends Object> term33718 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term33717 = ((Class) term33718).getDeclaredField((String) "ECMASCRIPT5_STRICT");
        ((Field) term33717).setAccessible(true);
        Object enum66 = ((Field) term33717).get((Object) null);
        HashMap term9049 = new HashMap();
        Set<Object> term34058 =  ((Map) term9049).keySet();
        HashSet term9048 = new HashSet((Collection<? extends Object>) term34058);
        HashMap term9058 = new HashMap();
        Set<Object> term34059 =  ((Map) term9058).keySet();
        HashSet term9057 = new HashSet((Collection<? extends Object>) term34059);
        HashMap term9064 = new HashMap();
        Set<Object> term34060 =  ((Map) term9064).keySet();
        HashSet term9063 = new HashSet((Collection<? extends Object>) term34060);
        term8981 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term9006 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term9047 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term9082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9085 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term9086 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term9089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term8981, term8981.getClass(), "sourceString", "zaloBqlrSo");
        setField(term8981, term8981.getClass(), "sourceFile", null);
        setField(term8981, term8981.getClass(), "sourceName", "vvoLrMGCoN");
        setBooleanField(term9006, term9006.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term9006, term9006.getClass(), "isIdeMode", true);
        setField(term9006, term9006.getClass(), "annotationNames", term9009);
        setField(term9006, term9006.getClass(), "suppressionNames", term9017);
        setField(term9006, term9006.getClass(), "languageMode", enum66);
        setBooleanField(term9006, term9006.getClass(), "acceptConstKeyword", false);
        setField(term8981, term8981.getClass(), "config", term9006);
        setField(term8981, term8981.getClass(), "errorReporter", null);
        setField(term9047, term9047.getClass(), "this$0", null);
        setField(term8981, term8981.getClass(), "transformDispatcher", term9047);
        setField(term8981, term8981.getClass(), "ALLOWED_DIRECTIVES", term9048);
        setField(term8981, term8981.getClass(), "reservedKeywords", term9057);
        setField(term8981, term8981.getClass(), "parsedComments", term9063);
        setIntField(term9082, term9082.getClass(), "type", 0);
        setField(term9082, term9082.getClass(), "next", null);
        setField(term9082, term9082.getClass(), "first", null);
        setField(term9082, term9082.getClass(), "last", null);
        setField(term9082, term9082.getClass(), "propListHead", null);
        setIntField(term9082, term9082.getClass(), "sourcePosition", 0);
        setField(term9082, term9082.getClass(), "jsType", null);
        setField(term9082, term9082.getClass(), "parent", null);
        setField(term8981, term8981.getClass(), "rootNodeJsDocHolder", term9082);
        setField(term9085, term9085.getClass(), "this$0", null);
        setField(term8981, term8981.getClass(), "fileLevelJsDocBuilder", term9085);
        setField(term9086, term9086.getClass(), "info", null);
        setField(term9086, term9086.getClass(), "documentation", null);
        setField(term9086, term9086.getClass(), "associatedNode", null);
        setField(term9086, term9086.getClass(), "visibility", null);
        setIntField(term9086, term9086.getClass(), "bitset", 0);
        setField(term9086, term9086.getClass(), "type", null);
        setField(term9086, term9086.getClass(), "thisType", null);
        setBooleanField(term9086, term9086.getClass(), "includeDocumentation", false);
        setField(term8981, term8981.getClass(), "fileOverviewInfo", term9086);
        setIntField(term9089, term9089.getClass(), "type", 0);
        setField(term9089, term9089.getClass(), "next", null);
        setField(term9089, term9089.getClass(), "first", null);
        setField(term9089, term9089.getClass(), "last", null);
        setField(term9089, term9089.getClass(), "propListHead", null);
        setIntField(term9089, term9089.getClass(), "sourcePosition", 0);
        setField(term9089, term9089.getClass(), "jsType", null);
        setField(term9089, term9089.getClass(), "parent", null);
        setField(term8981, term8981.getClass(), "templateNode", term9089);
        term9092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9094 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9096 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9098 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9100 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term9092, term9092.getClass(), "type", 1901317214);
        setIntField(term9094, term9094.getClass(), "type", 1166710220);
        setIntField(term9096, term9096.getClass(), "type", -1070592289);
        setIntField(term9098, term9098.getClass(), "type", -1464172784);
        setIntField(term9100, term9100.getClass(), "type", 32185364);
        setField(term9100, term9100.getClass(), "next", null);
        setField(term9100, term9100.getClass(), "first", null);
        setField(term9100, term9100.getClass(), "last", null);
        setField(term9100, term9100.getClass(), "propListHead", null);
        setIntField(term9100, term9100.getClass(), "sourcePosition", 0);
        setField(term9100, term9100.getClass(), "jsType", null);
        setField(term9100, term9100.getClass(), "parent", null);
        setField(term9098, term9098.getClass(), "next", term9100);
        setIntField(term9103, term9103.getClass(), "type", 1768204942);
        setField(term9103, term9103.getClass(), "next", null);
        setField(term9103, term9103.getClass(), "first", null);
        setField(term9103, term9103.getClass(), "last", term9100);
        setField(term9103, term9103.getClass(), "propListHead", null);
        setIntField(term9103, term9103.getClass(), "sourcePosition", 0);
        setField(term9103, term9103.getClass(), "jsType", null);
        setField(term9103, term9103.getClass(), "parent", null);
        setField(term9098, term9098.getClass(), "first", term9103);
        setField(term9098, term9098.getClass(), "last", term9096);
        setField(term9098, term9098.getClass(), "propListHead", null);
        setIntField(term9098, term9098.getClass(), "sourcePosition", 0);
        setField(term9098, term9098.getClass(), "jsType", null);
        setField(term9098, term9098.getClass(), "parent", null);
        setField(term9096, term9096.getClass(), "next", term9098);
        setField(term9096, term9096.getClass(), "first", term9100);
        setIntField(term9107, term9107.getClass(), "type", 574481092);
        setIntField(term9109, term9109.getClass(), "type", -310528004);
        setField(term9109, term9109.getClass(), "next", null);
        setField(term9109, term9109.getClass(), "first", term9103);
        setField(term9109, term9109.getClass(), "last", term9098);
        setField(term9109, term9109.getClass(), "propListHead", null);
        setIntField(term9109, term9109.getClass(), "sourcePosition", 0);
        setField(term9109, term9109.getClass(), "jsType", null);
        setField(term9109, term9109.getClass(), "parent", null);
        setField(term9107, term9107.getClass(), "next", term9109);
        setField(term9107, term9107.getClass(), "first", term9094);
        setField(term9107, term9107.getClass(), "last", term9094);
        setField(term9107, term9107.getClass(), "propListHead", null);
        setIntField(term9107, term9107.getClass(), "sourcePosition", 0);
        setField(term9107, term9107.getClass(), "jsType", null);
        setField(term9107, term9107.getClass(), "parent", null);
        setField(term9096, term9096.getClass(), "last", term9107);
        setField(term9096, term9096.getClass(), "propListHead", null);
        setIntField(term9096, term9096.getClass(), "sourcePosition", 0);
        setField(term9096, term9096.getClass(), "jsType", null);
        setField(term9096, term9096.getClass(), "parent", null);
        setField(term9094, term9094.getClass(), "next", term9096);
        setIntField(term9114, term9114.getClass(), "type", -634976996);
        setField(term9114, term9114.getClass(), "next", term9107);
        setField(term9114, term9114.getClass(), "first", term9109);
        setField(term9114, term9114.getClass(), "last", term9092);
        setField(term9114, term9114.getClass(), "propListHead", null);
        setIntField(term9114, term9114.getClass(), "sourcePosition", 0);
        setField(term9114, term9114.getClass(), "jsType", null);
        setField(term9114, term9114.getClass(), "parent", null);
        setField(term9094, term9094.getClass(), "first", term9114);
        setField(term9094, term9094.getClass(), "last", term9114);
        setField(term9094, term9094.getClass(), "propListHead", null);
        setIntField(term9094, term9094.getClass(), "sourcePosition", 0);
        setField(term9094, term9094.getClass(), "jsType", null);
        setField(term9094, term9094.getClass(), "parent", null);
        setField(term9092, term9092.getClass(), "next", term9094);
        setField(term9092, term9092.getClass(), "first", term9098);
        setField(term9092, term9092.getClass(), "last", term9100);
        setField(term9092, term9092.getClass(), "propListHead", null);
        setIntField(term9092, term9092.getClass(), "sourcePosition", 0);
        setField(term9092, term9092.getClass(), "jsType", null);
        setField(term9092, term9092.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Object[] args = new Object[2];
        args[0] = term9092;
        args[1] = null;
        try {
            callMethod(klass, "maybeSetLengthFrom", argTypes, term8981, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


