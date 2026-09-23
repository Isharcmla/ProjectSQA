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

public class IRFactory_transform_125560633732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7075;

    public IRFactory_transform_125560633732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7103 = new HashMap();
        HashMap term7112 = new HashMap();
        Set<Object> term26626 =  ((Map) term7112).keySet();
        HashSet term7111 = new HashSet((Collection<? extends Object>) term26626);
        Class<? extends Object> term26628 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term26627 = ((Class) term26628).getDeclaredField((String) "ECMASCRIPT3");
        ((Field) term26627).setAccessible(true);
        Object enum47 = ((Field) term26627).get((Object) null);
        HashMap term7136 = new HashMap();
        Set<Object> term26947 =  ((Map) term7136).keySet();
        HashSet term7135 = new HashSet((Collection<? extends Object>) term26947);
        HashMap term7153 = new HashMap();
        Set<Object> term26948 =  ((Map) term7153).keySet();
        HashSet term7152 = new HashSet((Collection<? extends Object>) term26948);
        term7075 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term7100 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term7134 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term7173 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7175 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7177 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7180 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7183 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7186 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7190 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7193 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7196 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term7200 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term7201 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term7204 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term7075, term7075.getClass(), "sourceString", "XJJNClzHRf");
        setField(term7075, term7075.getClass(), "sourceName", "HDaezxQfQR");
        setBooleanField(term7100, term7100.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term7100, term7100.getClass(), "isIdeMode", true);
        setField(term7100, term7100.getClass(), "annotationNames", term7103);
        setField(term7100, term7100.getClass(), "suppressionNames", term7111);
        setField(term7100, term7100.getClass(), "languageMode", enum47);
        setBooleanField(term7100, term7100.getClass(), "acceptConstKeyword", true);
        setField(term7075, term7075.getClass(), "config", term7100);
        setField(term7075, term7075.getClass(), "errorReporter", null);
        setField(term7134, term7134.getClass(), "this$0", null);
        setField(term7075, term7075.getClass(), "transformDispatcher", term7134);
        setField(term7075, term7075.getClass(), "ALLOWED_DIRECTIVES", term7135);
        setField(term7075, term7075.getClass(), "reservedKeywords", term7152);
        setIntField(term7173, term7173.getClass(), "type", 71190297);
        setIntField(term7175, term7175.getClass(), "type", -1222006000);
        setIntField(term7177, term7177.getClass(), "type", 0);
        setField(term7177, term7177.getClass(), "next", null);
        setField(term7177, term7177.getClass(), "first", null);
        setField(term7177, term7177.getClass(), "last", null);
        setField(term7177, term7177.getClass(), "propListHead", null);
        setIntField(term7177, term7177.getClass(), "sourcePosition", 0);
        setField(term7177, term7177.getClass(), "jsType", null);
        setField(term7177, term7177.getClass(), "parent", null);
        setField(term7175, term7175.getClass(), "next", term7177);
        setIntField(term7180, term7180.getClass(), "type", 0);
        setField(term7180, term7180.getClass(), "next", null);
        setField(term7180, term7180.getClass(), "first", null);
        setField(term7180, term7180.getClass(), "last", null);
        setField(term7180, term7180.getClass(), "propListHead", null);
        setIntField(term7180, term7180.getClass(), "sourcePosition", 0);
        setField(term7180, term7180.getClass(), "jsType", null);
        setField(term7180, term7180.getClass(), "parent", null);
        setField(term7175, term7175.getClass(), "first", term7180);
        setIntField(term7183, term7183.getClass(), "type", 0);
        setField(term7183, term7183.getClass(), "next", null);
        setField(term7183, term7183.getClass(), "first", null);
        setField(term7183, term7183.getClass(), "last", null);
        setField(term7183, term7183.getClass(), "propListHead", null);
        setIntField(term7183, term7183.getClass(), "sourcePosition", 0);
        setField(term7183, term7183.getClass(), "jsType", null);
        setField(term7183, term7183.getClass(), "parent", null);
        setField(term7175, term7175.getClass(), "last", term7183);
        setField(term7186, term7186.getClass(), "next", null);
        setIntField(term7186, term7186.getClass(), "type", 0);
        setIntField(term7186, term7186.getClass(), "intValue", 0);
        setField(term7186, term7186.getClass(), "objectValue", null);
        setField(term7175, term7175.getClass(), "propListHead", term7186);
        setIntField(term7175, term7175.getClass(), "sourcePosition", 2095798786);
        setField(term7175, term7175.getClass(), "jsType", null);
        setField(term7175, term7175.getClass(), "parent", null);
        setField(term7173, term7173.getClass(), "next", term7175);
        setIntField(term7190, term7190.getClass(), "type", 0);
        setField(term7190, term7190.getClass(), "next", null);
        setField(term7190, term7190.getClass(), "first", null);
        setField(term7190, term7190.getClass(), "last", null);
        setField(term7190, term7190.getClass(), "propListHead", null);
        setIntField(term7190, term7190.getClass(), "sourcePosition", 0);
        setField(term7190, term7190.getClass(), "jsType", null);
        setField(term7190, term7190.getClass(), "parent", null);
        setField(term7173, term7173.getClass(), "first", term7190);
        setIntField(term7193, term7193.getClass(), "type", 0);
        setField(term7193, term7193.getClass(), "next", null);
        setField(term7193, term7193.getClass(), "first", null);
        setField(term7193, term7193.getClass(), "last", null);
        setField(term7193, term7193.getClass(), "propListHead", null);
        setIntField(term7193, term7193.getClass(), "sourcePosition", 0);
        setField(term7193, term7193.getClass(), "jsType", null);
        setField(term7193, term7193.getClass(), "parent", null);
        setField(term7173, term7173.getClass(), "last", term7193);
        setField(term7196, term7196.getClass(), "next", null);
        setIntField(term7196, term7196.getClass(), "type", 0);
        setIntField(term7196, term7196.getClass(), "intValue", 0);
        setField(term7196, term7196.getClass(), "objectValue", null);
        setField(term7173, term7173.getClass(), "propListHead", term7196);
        setIntField(term7173, term7173.getClass(), "sourcePosition", -1565502840);
        setField(term7173, term7173.getClass(), "jsType", null);
        setField(term7173, term7173.getClass(), "parent", null);
        setField(term7075, term7075.getClass(), "rootNodeJsDocHolder", term7173);
        setField(term7200, term7200.getClass(), "this$0", null);
        setField(term7075, term7075.getClass(), "fileLevelJsDocBuilder", term7200);
        setField(term7201, term7201.getClass(), "info", null);
        setField(term7201, term7201.getClass(), "documentation", null);
        setField(term7201, term7201.getClass(), "sourceName", null);
        setField(term7201, term7201.getClass(), "visibility", null);
        setIntField(term7201, term7201.getClass(), "bitset", 0);
        setField(term7201, term7201.getClass(), "type", null);
        setField(term7201, term7201.getClass(), "thisType", null);
        setBooleanField(term7201, term7201.getClass(), "includeDocumentation", false);
        setField(term7075, term7075.getClass(), "fileOverviewInfo", term7201);
        setIntField(term7204, term7204.getClass(), "type", 0);
        setField(term7204, term7204.getClass(), "next", null);
        setField(term7204, term7204.getClass(), "first", null);
        setField(term7204, term7204.getClass(), "last", null);
        setField(term7204, term7204.getClass(), "propListHead", null);
        setIntField(term7204, term7204.getClass(), "sourcePosition", 0);
        setField(term7204, term7204.getClass(), "jsType", null);
        setField(term7204, term7204.getClass(), "parent", null);
        setField(term7075, term7075.getClass(), "templateNode", term7204);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "transform", argTypes, term7075, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


