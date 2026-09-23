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
        Set<Object> term20892 =  ((Map) term2564).keySet();
        HashSet term2563 = new HashSet((Collection<? extends Object>) term20892);
        Class<? extends Object> term20894 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term20893 = ((Class) term20894).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term20893).setAccessible(true);
        Object enum40 = ((Field) term20893).get((Object) null);
        HashMap term2588 = new HashMap();
        Set<Object> term21213 =  ((Map) term2588).keySet();
        HashSet term2587 = new HashSet((Collection<? extends Object>) term21213);
        HashMap term2605 = new HashMap();
        Set<Object> term21214 =  ((Map) term2605).keySet();
        HashSet term2604 = new HashSet((Collection<? extends Object>) term21214);
        HashMap term2622 = new HashMap();
        Set<Object> term21215 =  ((Map) term2622).keySet();
        HashSet term2621 = new HashSet((Collection<? extends Object>) term21215);
        term2527 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term2552 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term2586 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term2634 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term2637 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term2638 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term2641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
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
        setIntField(term2634, term2634.getClass(), "type", 0);
        setField(term2634, term2634.getClass(), "next", null);
        setField(term2634, term2634.getClass(), "first", null);
        setField(term2634, term2634.getClass(), "last", null);
        setField(term2634, term2634.getClass(), "propListHead", null);
        setIntField(term2634, term2634.getClass(), "sourcePosition", 0);
        setField(term2634, term2634.getClass(), "jsType", null);
        setField(term2634, term2634.getClass(), "parent", null);
        setField(term2527, term2527.getClass(), "rootNodeJsDocHolder", term2634);
        setField(term2637, term2637.getClass(), "this$0", null);
        setField(term2527, term2527.getClass(), "fileLevelJsDocBuilder", term2637);
        setField(term2638, term2638.getClass(), "info", null);
        setField(term2638, term2638.getClass(), "documentation", null);
        setField(term2638, term2638.getClass(), "associatedNode", null);
        setField(term2638, term2638.getClass(), "visibility", null);
        setIntField(term2638, term2638.getClass(), "bitset", 0);
        setField(term2638, term2638.getClass(), "type", null);
        setField(term2638, term2638.getClass(), "thisType", null);
        setBooleanField(term2638, term2638.getClass(), "includeDocumentation", false);
        setField(term2527, term2527.getClass(), "fileOverviewInfo", term2638);
        setIntField(term2641, term2641.getClass(), "type", 0);
        setField(term2641, term2641.getClass(), "next", null);
        setField(term2641, term2641.getClass(), "first", null);
        setField(term2641, term2641.getClass(), "last", null);
        setField(term2641, term2641.getClass(), "propListHead", null);
        setIntField(term2641, term2641.getClass(), "sourcePosition", 0);
        setField(term2641, term2641.getClass(), "jsType", null);
        setField(term2641, term2641.getClass(), "parent", null);
        setField(term2527, term2527.getClass(), "templateNode", term2641);
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


