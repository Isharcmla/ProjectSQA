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
import static com.google.javascript.jscomp.parsing.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.parsing.EqualityUtils.*;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class IRFactory_init_62075634020 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25;
     Object term6097;
     Object term6121;

    public IRFactory_init_62075634020() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term28 = new HashMap();
        HashMap term40 = new HashMap();
        Set<Object> term6145 =  ((Map) term40).keySet();
        HashSet term39 = new HashSet((Collection<? extends Object>) term6145);
        term25 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setBooleanField(term25, term25.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term25, term25.getClass(), "isIdeMode", false);
        setField(term25, term25.getClass(), "annotationNames", term28);
        setField(term25, term25.getClass(), "suppressionNames", term39);
        setBooleanField(term25, term25.getClass(), "acceptES5", false);
        setBooleanField(term25, term25.getClass(), "acceptConstKeyword", false);
        HashMap term6103 = new HashMap();
        HashMap term6105 = new HashMap();
        Set<Object> term6166 =  ((Map) term6105).keySet();
        HashSet term6104 = new HashSet((Collection<? extends Object>) term6166);
        HashMap term6108 = new HashMap();
        Set<Object> term6167 =  ((Map) term6108).keySet();
        HashSet term6107 = new HashSet((Collection<? extends Object>) term6167);
        term6097 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term6102 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term6106 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term6111 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6112 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term6113 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6114 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term6097, term6097.getClass(), "sourceString", "PAEBtnZtTD");
        setField(term6097, term6097.getClass(), "sourceName", "sjlJAEtRrb");
        setBooleanField(term6102, term6102.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term6102, term6102.getClass(), "isIdeMode", false);
        setField(term6102, term6102.getClass(), "annotationNames", term6103);
        setField(term6102, term6102.getClass(), "suppressionNames", term6104);
        setBooleanField(term6102, term6102.getClass(), "acceptES5", false);
        setBooleanField(term6102, term6102.getClass(), "acceptConstKeyword", false);
        setField(term6097, term6097.getClass(), "config", term6102);
        setField(term6097, term6097.getClass(), "errorReporter", null);
        setField(term6106, term6106.getClass(), "this$0", term6097);
        setField(term6097, term6097.getClass(), "transformDispatcher", term6106);
        setField(term6097, term6097.getClass(), "ALLOWED_DIRECTIVES", term6107);
        setIntField(term6111, term6111.getClass(), "type", 132);
        setField(term6111, term6111.getClass(), "next", null);
        setField(term6111, term6111.getClass(), "first", null);
        setField(term6111, term6111.getClass(), "last", null);
        setField(term6111, term6111.getClass(), "propListHead", null);
        setIntField(term6111, term6111.getClass(), "sourcePosition", -1);
        setField(term6111, term6111.getClass(), "jsType", null);
        setField(term6111, term6111.getClass(), "parent", null);
        setField(term6097, term6097.getClass(), "rootNodeJsDocHolder", term6111);
        setField(term6112, term6112.getClass(), "this$0", term6111);
        setField(term6097, term6097.getClass(), "fileLevelJsDocBuilder", term6112);
        setField(term6097, term6097.getClass(), "fileOverviewInfo", null);
        setIntField(term6113, term6113.getClass(), "type", 132);
        setField(term6113, term6113.getClass(), "next", null);
        setField(term6113, term6113.getClass(), "first", null);
        setField(term6113, term6113.getClass(), "last", null);
        setField(term6114, term6114.getClass(), "next", null);
        setIntField(term6114, term6114.getClass(), "type", 16);
        setIntField(term6114, term6114.getClass(), "intValue", 0);
        setField(term6114, term6114.getClass(), "objectValue", "sjlJAEtRrb");
        setField(term6113, term6113.getClass(), "propListHead", term6114);
        setIntField(term6113, term6113.getClass(), "sourcePosition", -1);
        setField(term6113, term6113.getClass(), "jsType", null);
        setField(term6113, term6113.getClass(), "parent", null);
        setField(term6097, term6097.getClass(), "templateNode", term6113);
        HashMap term6122 = new HashMap();
        HashMap term6124 = new HashMap();
        Set<Object> term6198 =  ((Map) term6124).keySet();
        HashSet term6123 = new HashSet((Collection<? extends Object>) term6198);
        term6121 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        setBooleanField(term6121, term6121.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term6121, term6121.getClass(), "isIdeMode", false);
        setField(term6121, term6121.getClass(), "annotationNames", term6122);
        setField(term6121, term6121.getClass(), "suppressionNames", term6123);
        setBooleanField(term6121, term6121.getClass(), "acceptES5", false);
        setBooleanField(term6121, term6121.getClass(), "acceptConstKeyword", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.jscomp.parsing.Config");
        argTypes[3] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ErrorReporter");
        Object[] args = new Object[4];
        args[0] = "PAEBtnZtTD";
        args[1] = "sjlJAEtRrb";
        args[2] = term25;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term6097));
        assertTrue(recursiveEquals(term25, term6121));
    }

};


