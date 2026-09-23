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

public class IRFactory_transformBlock_82973297224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1018;

    public IRFactory_transformBlock_82973297224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1046 = new HashMap();
        HashMap term1055 = new HashMap();
        Set<Object> term9499 =  ((Map) term1055).keySet();
        HashSet term1054 = new HashSet((Collection<? extends Object>) term9499);
        HashMap term1065 = new HashMap();
        Set<Object> term9500 =  ((Map) term1065).keySet();
        HashSet term1064 = new HashSet((Collection<? extends Object>) term9500);
        term1018 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory"));
        Object term1043 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.Config"));
        Object term1063 = newInstance(Class.forName("com.google.javascript.jscomp.parsing.IRFactory$TransformDispatcher"));
        Object term1070 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1072 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1074 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1080 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1083 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1087 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1090 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1093 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1097 = newInstance(Class.forName("com.google.javascript.rhino.Node$FileLevelJsDocBuilder"));
        Object term1098 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        Object term1101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term1018, term1018.getClass(), "sourceString", "nyiiPDVjAc");
        setField(term1018, term1018.getClass(), "sourceName", "aKnKipADSo");
        setBooleanField(term1043, term1043.getClass(), "parseJsDocDocumentation", false);
        setBooleanField(term1043, term1043.getClass(), "isIdeMode", false);
        setField(term1043, term1043.getClass(), "annotationNames", term1046);
        setField(term1043, term1043.getClass(), "suppressionNames", term1054);
        setBooleanField(term1043, term1043.getClass(), "acceptES5", false);
        setBooleanField(term1043, term1043.getClass(), "acceptConstKeyword", true);
        setField(term1018, term1018.getClass(), "config", term1043);
        setField(term1018, term1018.getClass(), "errorReporter", null);
        setField(term1063, term1063.getClass(), "this$0", null);
        setField(term1018, term1018.getClass(), "transformDispatcher", term1063);
        setField(term1018, term1018.getClass(), "ALLOWED_DIRECTIVES", term1064);
        setIntField(term1070, term1070.getClass(), "type", -1786399638);
        setIntField(term1072, term1072.getClass(), "type", 458147407);
        setIntField(term1074, term1074.getClass(), "type", 0);
        setField(term1074, term1074.getClass(), "next", null);
        setField(term1074, term1074.getClass(), "first", null);
        setField(term1074, term1074.getClass(), "last", null);
        setField(term1074, term1074.getClass(), "propListHead", null);
        setIntField(term1074, term1074.getClass(), "sourcePosition", 0);
        setField(term1074, term1074.getClass(), "jsType", null);
        setField(term1074, term1074.getClass(), "parent", null);
        setField(term1072, term1072.getClass(), "next", term1074);
        setIntField(term1077, term1077.getClass(), "type", 0);
        setField(term1077, term1077.getClass(), "next", null);
        setField(term1077, term1077.getClass(), "first", null);
        setField(term1077, term1077.getClass(), "last", null);
        setField(term1077, term1077.getClass(), "propListHead", null);
        setIntField(term1077, term1077.getClass(), "sourcePosition", 0);
        setField(term1077, term1077.getClass(), "jsType", null);
        setField(term1077, term1077.getClass(), "parent", null);
        setField(term1072, term1072.getClass(), "first", term1077);
        setIntField(term1080, term1080.getClass(), "type", 0);
        setField(term1080, term1080.getClass(), "next", null);
        setField(term1080, term1080.getClass(), "first", null);
        setField(term1080, term1080.getClass(), "last", null);
        setField(term1080, term1080.getClass(), "propListHead", null);
        setIntField(term1080, term1080.getClass(), "sourcePosition", 0);
        setField(term1080, term1080.getClass(), "jsType", null);
        setField(term1080, term1080.getClass(), "parent", null);
        setField(term1072, term1072.getClass(), "last", term1080);
        setField(term1083, term1083.getClass(), "next", null);
        setIntField(term1083, term1083.getClass(), "type", 0);
        setIntField(term1083, term1083.getClass(), "intValue", 0);
        setField(term1083, term1083.getClass(), "objectValue", null);
        setField(term1072, term1072.getClass(), "propListHead", term1083);
        setIntField(term1072, term1072.getClass(), "sourcePosition", -184153539);
        setField(term1072, term1072.getClass(), "jsType", null);
        setField(term1072, term1072.getClass(), "parent", null);
        setField(term1070, term1070.getClass(), "next", term1072);
        setIntField(term1087, term1087.getClass(), "type", 0);
        setField(term1087, term1087.getClass(), "next", null);
        setField(term1087, term1087.getClass(), "first", null);
        setField(term1087, term1087.getClass(), "last", null);
        setField(term1087, term1087.getClass(), "propListHead", null);
        setIntField(term1087, term1087.getClass(), "sourcePosition", 0);
        setField(term1087, term1087.getClass(), "jsType", null);
        setField(term1087, term1087.getClass(), "parent", null);
        setField(term1070, term1070.getClass(), "first", term1087);
        setIntField(term1090, term1090.getClass(), "type", 0);
        setField(term1090, term1090.getClass(), "next", null);
        setField(term1090, term1090.getClass(), "first", null);
        setField(term1090, term1090.getClass(), "last", null);
        setField(term1090, term1090.getClass(), "propListHead", null);
        setIntField(term1090, term1090.getClass(), "sourcePosition", 0);
        setField(term1090, term1090.getClass(), "jsType", null);
        setField(term1090, term1090.getClass(), "parent", null);
        setField(term1070, term1070.getClass(), "last", term1090);
        setField(term1093, term1093.getClass(), "next", null);
        setIntField(term1093, term1093.getClass(), "type", 0);
        setIntField(term1093, term1093.getClass(), "intValue", 0);
        setField(term1093, term1093.getClass(), "objectValue", null);
        setField(term1070, term1070.getClass(), "propListHead", term1093);
        setIntField(term1070, term1070.getClass(), "sourcePosition", 493620644);
        setField(term1070, term1070.getClass(), "jsType", null);
        setField(term1070, term1070.getClass(), "parent", null);
        setField(term1018, term1018.getClass(), "rootNodeJsDocHolder", term1070);
        setField(term1097, term1097.getClass(), "this$0", null);
        setField(term1018, term1018.getClass(), "fileLevelJsDocBuilder", term1097);
        setField(term1098, term1098.getClass(), "info", null);
        setField(term1098, term1098.getClass(), "documentation", null);
        setField(term1098, term1098.getClass(), "sourceName", null);
        setField(term1098, term1098.getClass(), "visibility", null);
        setIntField(term1098, term1098.getClass(), "bitset", 0);
        setField(term1098, term1098.getClass(), "type", null);
        setField(term1098, term1098.getClass(), "thisType", null);
        setBooleanField(term1098, term1098.getClass(), "includeDocumentation", false);
        setField(term1018, term1018.getClass(), "fileOverviewInfo", term1098);
        setIntField(term1101, term1101.getClass(), "type", 0);
        setField(term1101, term1101.getClass(), "next", null);
        setField(term1101, term1101.getClass(), "first", null);
        setField(term1101, term1101.getClass(), "last", null);
        setField(term1101, term1101.getClass(), "propListHead", null);
        setIntField(term1101, term1101.getClass(), "sourcePosition", 0);
        setField(term1101, term1101.getClass(), "jsType", null);
        setField(term1101, term1101.getClass(), "parent", null);
        setField(term1018, term1018.getClass(), "templateNode", term1101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.parsing.IRFactory");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.mozilla.rhino.ast.AstNode");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "transformBlock", argTypes, term1018, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


