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

public class IRFactory_transformBlock_104603935131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2527;

    public IRFactory_transformBlock_104603935131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2555 = new HashMap();
        HashMap term2564 = new HashMap();
        Set<Object> term20873 =  ((Map) term2564).keySet();
        HashSet term2563 = new HashSet((Collection<? extends Object>) term20873);
        Class<? extends Object> term20875 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term20874 = ((Class) term20875).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term20874).setAccessible(true);
        Object enum40 = ((Field) term20874).get((Object) null);
        HashMap term2588 = new HashMap();
        Set<Object> term21194 =  ((Map) term2588).keySet();
        HashSet term2587 = new HashSet((Collection<? extends Object>) term21194);
        HashMap term2605 = new HashMap();
        Set<Object> term21195 =  ((Map) term2605).keySet();
        HashSet term2604 = new HashSet((Collection<? extends Object>) term21195);
        HashMap term2622 = new HashMap();
        Set<Object> term21196 =  ((Map) term2622).keySet();
        HashSet term2621 = new HashSet((Collection<? extends Object>) term21196);
        term2527 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term2552 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term2586 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term2636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2639 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term2640 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term2643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term2527, term2527.getClass(), "sourceString", "jDtqGUpnZN");
        setField(term2527, term2527.getClass(), "sourceFile", null);
        setField(term2527, term2527.getClass(), "sourceName", "nGKItKLYNC");
        setBooleanField(term2552, term2552.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term2552, term2552.getClass(), "isIdeMode", false);
        setField(term2552, term2552.getClass(), "annotationNames", term2555);
        setField(term2552, term2552.getClass(), "suppressionNames", term2563);
        setField(term2552, term2552.getClass(), "languageMode", enum40);
        setBooleanField(term2552, term2552.getClass(), "acceptConstKeyword", true);
        setField(term2527, term2527.getClass(), "config", term2552);
        setField(term2527, term2527.getClass(), "errorReporter", null);
        setField(term2586, term2586.getClass(), "this$0", null);
        setField(term2527, term2527.getClass(), "transformDispatcher", term2586);
        setField(term2527, term2527.getClass(), "ALLOWED_DIRECTIVES", term2587);
        setField(term2527, term2527.getClass(), "reservedKeywords", term2604);
        setField(term2527, term2527.getClass(), "parsedComments", term2621);
        setIntField(term2636, term2636.getClass(), "type", 0);
        setField(term2636, term2636.getClass(), "next", null);
        setField(term2636, term2636.getClass(), "first", null);
        setField(term2636, term2636.getClass(), "last", null);
        setField(term2636, term2636.getClass(), "propListHead", null);
        setIntField(term2636, term2636.getClass(), "sourcePosition", 0);
        setField(term2636, term2636.getClass(), "jsType", null);
        setField(term2636, term2636.getClass(), "parent", null);
        setField(term2527, term2527.getClass(), "rootNodeJsDocHolder", term2636);
        setField(term2639, term2639.getClass(), "this$0", null);
        setField(term2527, term2527.getClass(), "fileLevelJsDocBuilder", term2639);
        setField(term2640, term2640.getClass(), "info", null);
        setField(term2640, term2640.getClass(), "documentation", null);
        setField(term2640, term2640.getClass(), "associatedNode", null);
        setField(term2640, term2640.getClass(), "visibility", null);
        setIntField(term2640, term2640.getClass(), "bitset", 0);
        setField(term2640, term2640.getClass(), "type", null);
        setField(term2640, term2640.getClass(), "thisType", null);
        setBooleanField(term2640, term2640.getClass(), "includeDocumentation", false);
        setField(term2527, term2527.getClass(), "fileOverviewInfo", term2640);
        setIntField(term2643, term2643.getClass(), "type", 0);
        setField(term2643, term2643.getClass(), "next", null);
        setField(term2643, term2643.getClass(), "first", null);
        setField(term2643, term2643.getClass(), "last", null);
        setField(term2643, term2643.getClass(), "propListHead", null);
        setIntField(term2643, term2643.getClass(), "sourcePosition", 0);
        setField(term2643, term2643.getClass(), "jsType", null);
        setField(term2643, term2643.getClass(), "parent", null);
        setField(term2527, term2527.getClass(), "templateNode", term2643);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "transformBlock", argTypes, term2527, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


