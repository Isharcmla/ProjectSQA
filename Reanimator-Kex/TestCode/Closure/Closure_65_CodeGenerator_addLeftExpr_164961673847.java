package com.google.javascript.jscomp;

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
import java.lang.Error;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;

public class CodeGenerator_addLeftExpr_164961673847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1071;
     Object term1082;
     Object term1109;
     Object enum10;

    public CodeGenerator_addLeftExpr_164961673847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1072 = new HashMap();
        term1071 = newInstance(Class.forName("com.google.javascript.jscomp.CodeGenerator"));
        setField(term1071, term1071.getClass(), "ESCAPED_JS_STRINGS", term1072);
        setField(term1071, term1071.getClass(), "cc", null);
        setField(term1071, term1071.getClass(), "outputCharsetEncoder", null);
        term1082 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1084 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1086 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1089 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1092 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1095 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1102 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1105 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1082, term1082.getClass(), "type", -2095575670);
        setIntField(term1084, term1084.getClass(), "type", -93135961);
        setIntField(term1086, term1086.getClass(), "type", 0);
        setField(term1086, term1086.getClass(), "next", null);
        setField(term1086, term1086.getClass(), "first", null);
        setField(term1086, term1086.getClass(), "last", null);
        setField(term1086, term1086.getClass(), "propListHead", null);
        setIntField(term1086, term1086.getClass(), "sourcePosition", 0);
        setField(term1086, term1086.getClass(), "jsType", null);
        setField(term1086, term1086.getClass(), "parent", null);
        setField(term1084, term1084.getClass(), "next", term1086);
        setIntField(term1089, term1089.getClass(), "type", 0);
        setField(term1089, term1089.getClass(), "next", null);
        setField(term1089, term1089.getClass(), "first", null);
        setField(term1089, term1089.getClass(), "last", null);
        setField(term1089, term1089.getClass(), "propListHead", null);
        setIntField(term1089, term1089.getClass(), "sourcePosition", 0);
        setField(term1089, term1089.getClass(), "jsType", null);
        setField(term1089, term1089.getClass(), "parent", null);
        setField(term1084, term1084.getClass(), "first", term1089);
        setIntField(term1092, term1092.getClass(), "type", 0);
        setField(term1092, term1092.getClass(), "next", null);
        setField(term1092, term1092.getClass(), "first", null);
        setField(term1092, term1092.getClass(), "last", null);
        setField(term1092, term1092.getClass(), "propListHead", null);
        setIntField(term1092, term1092.getClass(), "sourcePosition", 0);
        setField(term1092, term1092.getClass(), "jsType", null);
        setField(term1092, term1092.getClass(), "parent", null);
        setField(term1084, term1084.getClass(), "last", term1092);
        setField(term1095, term1095.getClass(), "next", null);
        setIntField(term1095, term1095.getClass(), "type", 0);
        setIntField(term1095, term1095.getClass(), "intValue", 0);
        setField(term1095, term1095.getClass(), "objectValue", null);
        setField(term1084, term1084.getClass(), "propListHead", term1095);
        setIntField(term1084, term1084.getClass(), "sourcePosition", 287287233);
        setField(term1084, term1084.getClass(), "jsType", null);
        setField(term1084, term1084.getClass(), "parent", null);
        setField(term1082, term1082.getClass(), "next", term1084);
        setIntField(term1099, term1099.getClass(), "type", 0);
        setField(term1099, term1099.getClass(), "next", null);
        setField(term1099, term1099.getClass(), "first", null);
        setField(term1099, term1099.getClass(), "last", null);
        setField(term1099, term1099.getClass(), "propListHead", null);
        setIntField(term1099, term1099.getClass(), "sourcePosition", 0);
        setField(term1099, term1099.getClass(), "jsType", null);
        setField(term1099, term1099.getClass(), "parent", null);
        setField(term1082, term1082.getClass(), "first", term1099);
        setIntField(term1102, term1102.getClass(), "type", 0);
        setField(term1102, term1102.getClass(), "next", null);
        setField(term1102, term1102.getClass(), "first", null);
        setField(term1102, term1102.getClass(), "last", null);
        setField(term1102, term1102.getClass(), "propListHead", null);
        setIntField(term1102, term1102.getClass(), "sourcePosition", 0);
        setField(term1102, term1102.getClass(), "jsType", null);
        setField(term1102, term1102.getClass(), "parent", null);
        setField(term1082, term1082.getClass(), "last", term1102);
        setField(term1105, term1105.getClass(), "next", null);
        setIntField(term1105, term1105.getClass(), "type", 0);
        setIntField(term1105, term1105.getClass(), "intValue", 0);
        setField(term1105, term1105.getClass(), "objectValue", null);
        setField(term1082, term1082.getClass(), "propListHead", term1105);
        setIntField(term1082, term1082.getClass(), "sourcePosition", 962840079);
        setField(term1082, term1082.getClass(), "jsType", null);
        setField(term1082, term1082.getClass(), "parent", null);
        term1109 = new Integer(1540719661);
        Class<? extends Object> term6391 = Class.forName((String) "com.google.javascript.jscomp.CodeGenerator$Context");
        Field term6390 = ((Class) term6391).getDeclaredField((String) "IN_FOR_INIT_CLAUSE");
        ((Field) term6390).setAccessible(true);
        enum10 = ((Field) term6390).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CodeGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("com.google.javascript.jscomp.CodeGenerator$Context");
        Object[] args = new Object[3];
        args[0] = term1082;
        args[1] = term1109;
        args[2] = enum10;
        try {
            callMethod(klass, "addLeftExpr", argTypes, term1071, args);
            assertTrue(false);
        }
        catch (Error e) {
        }

    }

};


