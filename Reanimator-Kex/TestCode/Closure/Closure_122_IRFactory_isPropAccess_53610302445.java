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

public class IRFactory_isPropAccess_53610302445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7054;

    public IRFactory_isPropAccess_53610302445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7082 = new HashMap();
        HashMap term7091 = new HashMap();
        Set<Object> term33296 =  ((Map) term7091).keySet();
        HashSet term7090 = new HashSet((Collection<? extends Object>) term33296);
        Class<? extends Object> term33298 = Class.forName((String) "com.google.javascript.jscomp.parsing.Config$LanguageMode");
        Field term33297 = ((Class) term33298).getDeclaredField((String) "ECMASCRIPT5");
        ((Field) term33297).setAccessible(true);
        Object enum67 = ((Field) term33297).get((Object) null);
        HashMap term7115 = new HashMap();
        Set<Object> term33617 =  ((Map) term7115).keySet();
        HashSet term7114 = new HashSet((Collection<? extends Object>) term33617);
        HashMap term7132 = new HashMap();
        Set<Object> term33618 =  ((Map) term7132).keySet();
        HashSet term7131 = new HashSet((Collection<? extends Object>) term33618);
        term7054 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term7079 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term7113 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term7137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7154 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7156 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7158 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7161 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term7167 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term7168 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term7054, term7054.getClass(), "sourceString", "AZdLeSugwv");
        setField(term7054, term7054.getClass(), "sourceFile", null);
        setField(term7054, term7054.getClass(), "sourceName", "RMsXuyzKJV");
        setBooleanField(term7079, term7079.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term7079, term7079.getClass(), "isIdeMode", true);
        setField(term7079, term7079.getClass(), "annotationNames", term7082);
        setField(term7079, term7079.getClass(), "suppressionNames", term7090);
        setField(term7079, term7079.getClass(), "languageMode", enum67);
        setBooleanField(term7079, term7079.getClass(), "acceptConstKeyword", true);
        setField(term7054, term7054.getClass(), "config", term7079);
        setField(term7054, term7054.getClass(), "errorReporter", null);
        setField(term7113, term7113.getClass(), "this$0", null);
        setField(term7054, term7054.getClass(), "transformDispatcher", term7113);
        setField(term7054, term7054.getClass(), "reservedKeywords", term7114);
        setField(term7054, term7054.getClass(), "parsedComments", term7131);
        setIntField(term7137, term7137.getClass(), "type", 114754804);
        setIntField(term7139, term7139.getClass(), "type", 1687361082);
        setIntField(term7141, term7141.getClass(), "type", 584893196);
        setIntField(term7143, term7143.getClass(), "type", 497269071);
        setField(term7143, term7143.getClass(), "next", null);
        setField(term7143, term7143.getClass(), "first", term7143);
        setField(term7143, term7143.getClass(), "last", term7139);
        setField(term7143, term7143.getClass(), "propListHead", null);
        setIntField(term7143, term7143.getClass(), "sourcePosition", 0);
        setField(term7143, term7143.getClass(), "jsType", null);
        setField(term7143, term7143.getClass(), "parent", null);
        setField(term7141, term7141.getClass(), "next", term7143);
        setField(term7141, term7141.getClass(), "first", term7139);
        setIntField(term7146, term7146.getClass(), "type", 0);
        setField(term7146, term7146.getClass(), "next", null);
        setField(term7146, term7146.getClass(), "first", null);
        setField(term7146, term7146.getClass(), "last", null);
        setField(term7146, term7146.getClass(), "propListHead", null);
        setIntField(term7146, term7146.getClass(), "sourcePosition", 0);
        setField(term7146, term7146.getClass(), "jsType", null);
        setField(term7146, term7146.getClass(), "parent", null);
        setField(term7141, term7141.getClass(), "last", term7146);
        setField(term7141, term7141.getClass(), "propListHead", null);
        setIntField(term7141, term7141.getClass(), "sourcePosition", 0);
        setField(term7141, term7141.getClass(), "jsType", null);
        setField(term7141, term7141.getClass(), "parent", null);
        setField(term7139, term7139.getClass(), "next", term7141);
        setIntField(term7150, term7150.getClass(), "type", 0);
        setField(term7150, term7150.getClass(), "next", null);
        setField(term7150, term7150.getClass(), "first", null);
        setField(term7150, term7150.getClass(), "last", null);
        setField(term7150, term7150.getClass(), "propListHead", null);
        setIntField(term7150, term7150.getClass(), "sourcePosition", 0);
        setField(term7150, term7150.getClass(), "jsType", null);
        setField(term7150, term7150.getClass(), "parent", null);
        setField(term7139, term7139.getClass(), "first", term7150);
        setField(term7139, term7139.getClass(), "last", term7150);
        setField(term7139, term7139.getClass(), "propListHead", null);
        setIntField(term7139, term7139.getClass(), "sourcePosition", 0);
        setField(term7139, term7139.getClass(), "jsType", null);
        setField(term7139, term7139.getClass(), "parent", null);
        setField(term7137, term7137.getClass(), "next", term7139);
        setIntField(term7154, term7154.getClass(), "type", -1899301124);
        setIntField(term7156, term7156.getClass(), "type", -1882480155);
        setIntField(term7158, term7158.getClass(), "type", -1410220680);
        setField(term7158, term7158.getClass(), "next", term7150);
        setField(term7158, term7158.getClass(), "first", null);
        setField(term7158, term7158.getClass(), "last", term7146);
        setField(term7158, term7158.getClass(), "propListHead", null);
        setIntField(term7158, term7158.getClass(), "sourcePosition", 0);
        setField(term7158, term7158.getClass(), "jsType", null);
        setField(term7158, term7158.getClass(), "parent", null);
        setField(term7156, term7156.getClass(), "next", term7158);
        setField(term7156, term7156.getClass(), "first", term7150);
        setIntField(term7161, term7161.getClass(), "type", 0);
        setField(term7161, term7161.getClass(), "next", null);
        setField(term7161, term7161.getClass(), "first", null);
        setField(term7161, term7161.getClass(), "last", null);
        setField(term7161, term7161.getClass(), "propListHead", null);
        setIntField(term7161, term7161.getClass(), "sourcePosition", 0);
        setField(term7161, term7161.getClass(), "jsType", null);
        setField(term7161, term7161.getClass(), "parent", null);
        setField(term7156, term7156.getClass(), "last", term7161);
        setField(term7156, term7156.getClass(), "propListHead", null);
        setIntField(term7156, term7156.getClass(), "sourcePosition", 0);
        setField(term7156, term7156.getClass(), "jsType", null);
        setField(term7156, term7156.getClass(), "parent", null);
        setField(term7154, term7154.getClass(), "next", term7156);
        setField(term7154, term7154.getClass(), "first", term7137);
        setField(term7154, term7154.getClass(), "last", term7156);
        setField(term7154, term7154.getClass(), "propListHead", null);
        setIntField(term7154, term7154.getClass(), "sourcePosition", 0);
        setField(term7154, term7154.getClass(), "jsType", null);
        setField(term7154, term7154.getClass(), "parent", null);
        setField(term7137, term7137.getClass(), "first", term7154);
        setField(term7137, term7137.getClass(), "last", term7146);
        setField(term7137, term7137.getClass(), "propListHead", null);
        setIntField(term7137, term7137.getClass(), "sourcePosition", 0);
        setField(term7137, term7137.getClass(), "jsType", null);
        setField(term7137, term7137.getClass(), "parent", null);
        setField(term7054, term7054.getClass(), "rootNodeJsDocHolder", term7137);
        setField(term7167, term7167.getClass(), "this$0", null);
        setField(term7054, term7054.getClass(), "fileLevelJsDocBuilder", term7167);
        setField(term7168, term7168.getClass(), "info", null);
        setField(term7168, term7168.getClass(), "documentation", null);
        setField(term7168, term7168.getClass(), "associatedNode", null);
        setField(term7168, term7168.getClass(), "visibility", null);
        setIntField(term7168, term7168.getClass(), "bitset", 0);
        setField(term7168, term7168.getClass(), "type", null);
        setField(term7168, term7168.getClass(), "thisType", null);
        setBooleanField(term7168, term7168.getClass(), "includeDocumentation", false);
        setIntField(term7168, term7168.getClass(), "originalCommentPosition", 0);
        setField(term7054, term7054.getClass(), "fileOverviewInfo", term7168);
        setField(term7054, term7054.getClass(), "templateNode", term7150);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.head.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "isPropAccess", argTypes, term7054, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


