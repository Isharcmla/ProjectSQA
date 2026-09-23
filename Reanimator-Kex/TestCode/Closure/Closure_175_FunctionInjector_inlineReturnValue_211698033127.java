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
import java.lang.IllegalArgumentException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.HashMap;
import java.util.Map;
import java.lang.Object;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FunctionInjector_inlineReturnValue_211698033127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1074;
     Object term1097;
     Object term1124;

    public FunctionInjector_inlineReturnValue_211698033127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1077 = new HashMap();
        Set<Object> term4511 =  ((Map) term1077).keySet();
        HashSet term1076 = new HashSet((Collection<? extends Object>) term4511);
        term1074 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionInjector"));
        setField(term1074, term1074.getClass(), "compiler", null);
        setBooleanField(term1074, term1074.getClass(), "allowDecomposition", true);
        setField(term1074, term1074.getClass(), "knownConstants", term1076);
        setBooleanField(term1074, term1074.getClass(), "assumeStrictThis", false);
        setBooleanField(term1074, term1074.getClass(), "assumeMinimumCapture", false);
        setField(term1074, term1074.getClass(), "safeNameIdSupplier", null);
        term1097 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1099 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1101 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1103 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1108 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1114 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1119 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1097, term1097.getClass(), "type", -93135961);
        setIntField(term1099, term1099.getClass(), "type", -112921587);
        setIntField(term1101, term1101.getClass(), "type", 933028652);
        setIntField(term1103, term1103.getClass(), "type", 287287233);
        setIntField(term1105, term1105.getClass(), "type", 962840079);
        setField(term1105, term1105.getClass(), "next", null);
        setField(term1105, term1105.getClass(), "first", null);
        setField(term1105, term1105.getClass(), "last", null);
        setField(term1105, term1105.getClass(), "propListHead", null);
        setIntField(term1105, term1105.getClass(), "sourcePosition", 0);
        setField(term1105, term1105.getClass(), "jsType", null);
        setField(term1105, term1105.getClass(), "parent", null);
        setField(term1103, term1103.getClass(), "next", term1105);
        setIntField(term1108, term1108.getClass(), "type", 1540719661);
        setField(term1108, term1108.getClass(), "next", null);
        setField(term1108, term1108.getClass(), "first", null);
        setField(term1108, term1108.getClass(), "last", term1105);
        setField(term1108, term1108.getClass(), "propListHead", null);
        setIntField(term1108, term1108.getClass(), "sourcePosition", 0);
        setField(term1108, term1108.getClass(), "jsType", null);
        setField(term1108, term1108.getClass(), "parent", null);
        setField(term1103, term1103.getClass(), "first", term1108);
        setField(term1103, term1103.getClass(), "last", term1101);
        setField(term1103, term1103.getClass(), "propListHead", null);
        setIntField(term1103, term1103.getClass(), "sourcePosition", 0);
        setField(term1103, term1103.getClass(), "jsType", null);
        setField(term1103, term1103.getClass(), "parent", null);
        setField(term1101, term1101.getClass(), "next", term1103);
        setField(term1101, term1101.getClass(), "first", term1105);
        setIntField(term1112, term1112.getClass(), "type", 335112684);
        setIntField(term1114, term1114.getClass(), "type", 1551099402);
        setField(term1114, term1114.getClass(), "next", null);
        setField(term1114, term1114.getClass(), "first", term1108);
        setField(term1114, term1114.getClass(), "last", term1103);
        setField(term1114, term1114.getClass(), "propListHead", null);
        setIntField(term1114, term1114.getClass(), "sourcePosition", 0);
        setField(term1114, term1114.getClass(), "jsType", null);
        setField(term1114, term1114.getClass(), "parent", null);
        setField(term1112, term1112.getClass(), "next", term1114);
        setField(term1112, term1112.getClass(), "first", term1099);
        setField(term1112, term1112.getClass(), "last", term1099);
        setField(term1112, term1112.getClass(), "propListHead", null);
        setIntField(term1112, term1112.getClass(), "sourcePosition", 0);
        setField(term1112, term1112.getClass(), "jsType", null);
        setField(term1112, term1112.getClass(), "parent", null);
        setField(term1101, term1101.getClass(), "last", term1112);
        setField(term1101, term1101.getClass(), "propListHead", null);
        setIntField(term1101, term1101.getClass(), "sourcePosition", 0);
        setField(term1101, term1101.getClass(), "jsType", null);
        setField(term1101, term1101.getClass(), "parent", null);
        setField(term1099, term1099.getClass(), "next", term1101);
        setIntField(term1119, term1119.getClass(), "type", -2027534003);
        setField(term1119, term1119.getClass(), "next", term1112);
        setField(term1119, term1119.getClass(), "first", term1114);
        setField(term1119, term1119.getClass(), "last", term1097);
        setField(term1119, term1119.getClass(), "propListHead", null);
        setIntField(term1119, term1119.getClass(), "sourcePosition", 0);
        setField(term1119, term1119.getClass(), "jsType", null);
        setField(term1119, term1119.getClass(), "parent", null);
        setField(term1099, term1099.getClass(), "first", term1119);
        setField(term1099, term1099.getClass(), "last", term1119);
        setField(term1099, term1099.getClass(), "propListHead", null);
        setIntField(term1099, term1099.getClass(), "sourcePosition", 0);
        setField(term1099, term1099.getClass(), "jsType", null);
        setField(term1099, term1099.getClass(), "parent", null);
        setField(term1097, term1097.getClass(), "next", term1099);
        setField(term1097, term1097.getClass(), "first", term1103);
        setField(term1097, term1097.getClass(), "last", term1105);
        setField(term1097, term1097.getClass(), "propListHead", null);
        setIntField(term1097, term1097.getClass(), "sourcePosition", 0);
        setField(term1097, term1097.getClass(), "jsType", null);
        setField(term1097, term1097.getClass(), "parent", null);
        term1124 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1128 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1132 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1139 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1141 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1124, term1124.getClass(), "type", 1063420942);
        setIntField(term1126, term1126.getClass(), "type", 1375330971);
        setIntField(term1128, term1128.getClass(), "type", -478195677);
        setIntField(term1130, term1130.getClass(), "type", 972867650);
        setIntField(term1132, term1132.getClass(), "type", 1655935355);
        setField(term1132, term1132.getClass(), "next", null);
        setField(term1132, term1132.getClass(), "first", null);
        setField(term1132, term1132.getClass(), "last", null);
        setField(term1132, term1132.getClass(), "propListHead", null);
        setIntField(term1132, term1132.getClass(), "sourcePosition", 0);
        setField(term1132, term1132.getClass(), "jsType", null);
        setField(term1132, term1132.getClass(), "parent", null);
        setField(term1130, term1130.getClass(), "next", term1132);
        setIntField(term1135, term1135.getClass(), "type", -481533957);
        setField(term1135, term1135.getClass(), "next", null);
        setField(term1135, term1135.getClass(), "first", null);
        setField(term1135, term1135.getClass(), "last", term1132);
        setField(term1135, term1135.getClass(), "propListHead", null);
        setIntField(term1135, term1135.getClass(), "sourcePosition", 0);
        setField(term1135, term1135.getClass(), "jsType", null);
        setField(term1135, term1135.getClass(), "parent", null);
        setField(term1130, term1130.getClass(), "first", term1135);
        setField(term1130, term1130.getClass(), "last", term1128);
        setField(term1130, term1130.getClass(), "propListHead", null);
        setIntField(term1130, term1130.getClass(), "sourcePosition", 0);
        setField(term1130, term1130.getClass(), "jsType", null);
        setField(term1130, term1130.getClass(), "parent", null);
        setField(term1128, term1128.getClass(), "next", term1130);
        setField(term1128, term1128.getClass(), "first", term1132);
        setIntField(term1139, term1139.getClass(), "type", -1465035361);
        setIntField(term1141, term1141.getClass(), "type", 1090617576);
        setField(term1141, term1141.getClass(), "next", null);
        setField(term1141, term1141.getClass(), "first", term1135);
        setField(term1141, term1141.getClass(), "last", term1130);
        setField(term1141, term1141.getClass(), "propListHead", null);
        setIntField(term1141, term1141.getClass(), "sourcePosition", 0);
        setField(term1141, term1141.getClass(), "jsType", null);
        setField(term1141, term1141.getClass(), "parent", null);
        setField(term1139, term1139.getClass(), "next", term1141);
        setField(term1139, term1139.getClass(), "first", term1126);
        setField(term1139, term1139.getClass(), "last", term1126);
        setField(term1139, term1139.getClass(), "propListHead", null);
        setIntField(term1139, term1139.getClass(), "sourcePosition", 0);
        setField(term1139, term1139.getClass(), "jsType", null);
        setField(term1139, term1139.getClass(), "parent", null);
        setField(term1128, term1128.getClass(), "last", term1139);
        setField(term1128, term1128.getClass(), "propListHead", null);
        setIntField(term1128, term1128.getClass(), "sourcePosition", 0);
        setField(term1128, term1128.getClass(), "jsType", null);
        setField(term1128, term1128.getClass(), "parent", null);
        setField(term1126, term1126.getClass(), "next", term1128);
        setIntField(term1146, term1146.getClass(), "type", -1547384488);
        setField(term1146, term1146.getClass(), "next", term1139);
        setField(term1146, term1146.getClass(), "first", term1141);
        setField(term1146, term1146.getClass(), "last", term1124);
        setField(term1146, term1146.getClass(), "propListHead", null);
        setIntField(term1146, term1146.getClass(), "sourcePosition", 0);
        setField(term1146, term1146.getClass(), "jsType", null);
        setField(term1146, term1146.getClass(), "parent", null);
        setField(term1126, term1126.getClass(), "first", term1146);
        setField(term1126, term1126.getClass(), "last", term1146);
        setField(term1126, term1126.getClass(), "propListHead", null);
        setIntField(term1126, term1126.getClass(), "sourcePosition", 0);
        setField(term1126, term1126.getClass(), "jsType", null);
        setField(term1126, term1126.getClass(), "parent", null);
        setField(term1124, term1124.getClass(), "next", term1126);
        setField(term1124, term1124.getClass(), "first", term1130);
        setField(term1124, term1124.getClass(), "last", term1132);
        setField(term1124, term1124.getClass(), "propListHead", null);
        setIntField(term1124, term1124.getClass(), "sourcePosition", 0);
        setField(term1124, term1124.getClass(), "jsType", null);
        setField(term1124, term1124.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionInjector");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term1097;
        args[1] = term1124;
        try {
            callMethod(klass, "inlineReturnValue", argTypes, term1074, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


