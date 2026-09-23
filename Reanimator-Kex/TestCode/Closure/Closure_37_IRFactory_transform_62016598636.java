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
     Object term6110;

    public IRFactory_transform_62016598636() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term6138 = new HashMap();
        HashMap term6147 = new HashMap();
        Set<Object> term28232 =  ((Map) term6147).keySet();
        HashSet term6146 = new HashSet((Collection<? extends Object>) term28232);
        Class<? extends Object> term28234 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term28233 = ((Class) term28234).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term28233).setAccessible(true);
        Object enum56 = ((Field) term28233).get((Object) null);
        HashMap term6171 = new HashMap();
        Set<Object> term28553 =  ((Map) term6171).keySet();
        HashSet term6170 = new HashSet((Collection<? extends Object>) term28553);
        HashMap term6188 = new HashMap();
        Set<Object> term28554 =  ((Map) term6188).keySet();
        HashSet term6187 = new HashSet((Collection<? extends Object>) term28554);
        HashMap term6205 = new HashMap();
        Set<Object> term28555 =  ((Map) term6205).keySet();
        HashSet term6204 = new HashSet((Collection<? extends Object>) term28555);
        term6110 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term6135 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term6169 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term6225 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6228 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term6229 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term6232 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term6110, term6110.getClass(), "sourceString", "hMmaoREuCK");
        setField(term6110, term6110.getClass(), "sourceFile", null);
        setField(term6110, term6110.getClass(), "sourceName", "VeDtgDzGAN");
        setBooleanField(term6135, term6135.getClass(), "parseJsDocDocumentation", true);
        setBooleanField(term6135, term6135.getClass(), "isIdeMode", false);
        setField(term6135, term6135.getClass(), "annotationNames", term6138);
        setField(term6135, term6135.getClass(), "suppressionNames", term6146);
        setField(term6135, term6135.getClass(), "languageMode", enum56);
        setBooleanField(term6135, term6135.getClass(), "acceptConstKeyword", true);
        setField(term6110, term6110.getClass(), "config", term6135);
        setField(term6110, term6110.getClass(), "errorReporter", null);
        setField(term6169, term6169.getClass(), "this$0", null);
        setField(term6110, term6110.getClass(), "transformDispatcher", term6169);
        setField(term6110, term6110.getClass(), "ALLOWED_DIRECTIVES", term6170);
        setField(term6110, term6110.getClass(), "reservedKeywords", term6187);
        setField(term6110, term6110.getClass(), "parsedComments", term6204);
        setIntField(term6225, term6225.getClass(), "type", 0);
        setField(term6225, term6225.getClass(), "next", null);
        setField(term6225, term6225.getClass(), "first", null);
        setField(term6225, term6225.getClass(), "last", null);
        setField(term6225, term6225.getClass(), "propListHead", null);
        setIntField(term6225, term6225.getClass(), "sourcePosition", 0);
        setField(term6225, term6225.getClass(), "jsType", null);
        setField(term6225, term6225.getClass(), "parent", null);
        setField(term6110, term6110.getClass(), "rootNodeJsDocHolder", term6225);
        setField(term6228, term6228.getClass(), "this$0", null);
        setField(term6110, term6110.getClass(), "fileLevelJsDocBuilder", term6228);
        setField(term6229, term6229.getClass(), "info", null);
        setField(term6229, term6229.getClass(), "documentation", null);
        setField(term6229, term6229.getClass(), "associatedNode", null);
        setField(term6229, term6229.getClass(), "visibility", null);
        setIntField(term6229, term6229.getClass(), "bitset", 0);
        setField(term6229, term6229.getClass(), "type", null);
        setField(term6229, term6229.getClass(), "thisType", null);
        setBooleanField(term6229, term6229.getClass(), "includeDocumentation", false);
        setField(term6110, term6110.getClass(), "fileOverviewInfo", term6229);
        setIntField(term6232, term6232.getClass(), "type", 0);
        setField(term6232, term6232.getClass(), "next", null);
        setField(term6232, term6232.getClass(), "first", null);
        setField(term6232, term6232.getClass(), "last", null);
        setField(term6232, term6232.getClass(), "propListHead", null);
        setIntField(term6232, term6232.getClass(), "sourcePosition", 0);
        setField(term6232, term6232.getClass(), "jsType", null);
        setField(term6232, term6232.getClass(), "parent", null);
        setField(term6110, term6110.getClass(), "templateNode", term6232);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "transform", argTypes, term6110, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


