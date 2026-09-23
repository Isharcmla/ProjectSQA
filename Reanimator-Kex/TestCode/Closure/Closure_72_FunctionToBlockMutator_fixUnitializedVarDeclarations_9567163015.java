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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.lang.Object;

public class FunctionToBlockMutator_fixUnitializedVarDeclarations_9567163015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104;
     Object term105;
     Object term1145;
     Object term1146;

    public FunctionToBlockMutator_fixUnitializedVarDeclarations_9567163015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator"));
        setField(term104, term104.getClass(), "compiler", null);
        setField(term104, term104.getClass(), "safeNameIdSupplier", null);
        term105 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term107 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term109 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term112 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term118 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term122 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term125 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term128 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term105, term105.getClass(), "type", 865208305);
        setIntField(term107, term107.getClass(), "type", -1179120542);
        setIntField(term109, term109.getClass(), "type", 0);
        setField(term109, term109.getClass(), "next", null);
        setField(term109, term109.getClass(), "first", null);
        setField(term109, term109.getClass(), "last", null);
        setField(term109, term109.getClass(), "propListHead", null);
        setIntField(term109, term109.getClass(), "sourcePosition", 0);
        setField(term109, term109.getClass(), "jsType", null);
        setField(term109, term109.getClass(), "parent", null);
        setField(term107, term107.getClass(), "next", term109);
        setIntField(term112, term112.getClass(), "type", 0);
        setField(term112, term112.getClass(), "next", null);
        setField(term112, term112.getClass(), "first", null);
        setField(term112, term112.getClass(), "last", null);
        setField(term112, term112.getClass(), "propListHead", null);
        setIntField(term112, term112.getClass(), "sourcePosition", 0);
        setField(term112, term112.getClass(), "jsType", null);
        setField(term112, term112.getClass(), "parent", null);
        setField(term107, term107.getClass(), "first", term112);
        setIntField(term115, term115.getClass(), "type", 0);
        setField(term115, term115.getClass(), "next", null);
        setField(term115, term115.getClass(), "first", null);
        setField(term115, term115.getClass(), "last", null);
        setField(term115, term115.getClass(), "propListHead", null);
        setIntField(term115, term115.getClass(), "sourcePosition", 0);
        setField(term115, term115.getClass(), "jsType", null);
        setField(term115, term115.getClass(), "parent", null);
        setField(term107, term107.getClass(), "last", term115);
        setField(term118, term118.getClass(), "next", null);
        setIntField(term118, term118.getClass(), "type", 0);
        setIntField(term118, term118.getClass(), "intValue", 0);
        setField(term118, term118.getClass(), "objectValue", null);
        setField(term107, term107.getClass(), "propListHead", term118);
        setIntField(term107, term107.getClass(), "sourcePosition", 1193880199);
        setField(term107, term107.getClass(), "jsType", null);
        setField(term107, term107.getClass(), "parent", null);
        setField(term105, term105.getClass(), "next", term107);
        setIntField(term122, term122.getClass(), "type", 0);
        setField(term122, term122.getClass(), "next", null);
        setField(term122, term122.getClass(), "first", null);
        setField(term122, term122.getClass(), "last", null);
        setField(term122, term122.getClass(), "propListHead", null);
        setIntField(term122, term122.getClass(), "sourcePosition", 0);
        setField(term122, term122.getClass(), "jsType", null);
        setField(term122, term122.getClass(), "parent", null);
        setField(term105, term105.getClass(), "first", term122);
        setIntField(term125, term125.getClass(), "type", 0);
        setField(term125, term125.getClass(), "next", null);
        setField(term125, term125.getClass(), "first", null);
        setField(term125, term125.getClass(), "last", null);
        setField(term125, term125.getClass(), "propListHead", null);
        setIntField(term125, term125.getClass(), "sourcePosition", 0);
        setField(term125, term125.getClass(), "jsType", null);
        setField(term125, term125.getClass(), "parent", null);
        setField(term105, term105.getClass(), "last", term125);
        setField(term128, term128.getClass(), "next", null);
        setIntField(term128, term128.getClass(), "type", 0);
        setIntField(term128, term128.getClass(), "intValue", 0);
        setField(term128, term128.getClass(), "objectValue", null);
        setField(term105, term105.getClass(), "propListHead", term128);
        setIntField(term105, term105.getClass(), "sourcePosition", -1087774327);
        setField(term105, term105.getClass(), "jsType", null);
        setField(term105, term105.getClass(), "parent", null);
        term1145 = newInstance(Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator"));
        setField(term1145, term1145.getClass(), "compiler", null);
        setField(term1145, term1145.getClass(), "safeNameIdSupplier", null);
        term1146 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1148 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1149 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1151 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term1152 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1154 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term1146, term1146.getClass(), "type", 865208305);
        setIntField(term1147, term1147.getClass(), "type", -1179120542);
        setIntField(term1148, term1148.getClass(), "type", 0);
        setField(term1148, term1148.getClass(), "next", null);
        setField(term1148, term1148.getClass(), "first", null);
        setField(term1148, term1148.getClass(), "last", null);
        setField(term1148, term1148.getClass(), "propListHead", null);
        setIntField(term1148, term1148.getClass(), "sourcePosition", 0);
        setField(term1148, term1148.getClass(), "jsType", null);
        setField(term1148, term1148.getClass(), "parent", null);
        setField(term1147, term1147.getClass(), "next", term1148);
        setIntField(term1149, term1149.getClass(), "type", 0);
        setField(term1149, term1149.getClass(), "next", null);
        setField(term1149, term1149.getClass(), "first", null);
        setField(term1149, term1149.getClass(), "last", null);
        setField(term1149, term1149.getClass(), "propListHead", null);
        setIntField(term1149, term1149.getClass(), "sourcePosition", 0);
        setField(term1149, term1149.getClass(), "jsType", null);
        setField(term1149, term1149.getClass(), "parent", null);
        setField(term1147, term1147.getClass(), "first", term1149);
        setIntField(term1150, term1150.getClass(), "type", 0);
        setField(term1150, term1150.getClass(), "next", null);
        setField(term1150, term1150.getClass(), "first", null);
        setField(term1150, term1150.getClass(), "last", null);
        setField(term1150, term1150.getClass(), "propListHead", null);
        setIntField(term1150, term1150.getClass(), "sourcePosition", 0);
        setField(term1150, term1150.getClass(), "jsType", null);
        setField(term1150, term1150.getClass(), "parent", null);
        setField(term1147, term1147.getClass(), "last", term1150);
        setField(term1151, term1151.getClass(), "next", null);
        setIntField(term1151, term1151.getClass(), "type", 0);
        setIntField(term1151, term1151.getClass(), "intValue", 0);
        setField(term1151, term1151.getClass(), "objectValue", null);
        setField(term1147, term1147.getClass(), "propListHead", term1151);
        setIntField(term1147, term1147.getClass(), "sourcePosition", 1193880199);
        setField(term1147, term1147.getClass(), "jsType", null);
        setField(term1147, term1147.getClass(), "parent", null);
        setField(term1146, term1146.getClass(), "next", term1147);
        setIntField(term1152, term1152.getClass(), "type", 0);
        setField(term1152, term1152.getClass(), "next", null);
        setField(term1152, term1152.getClass(), "first", null);
        setField(term1152, term1152.getClass(), "last", null);
        setField(term1152, term1152.getClass(), "propListHead", null);
        setIntField(term1152, term1152.getClass(), "sourcePosition", 0);
        setField(term1152, term1152.getClass(), "jsType", null);
        setField(term1152, term1152.getClass(), "parent", null);
        setField(term1146, term1146.getClass(), "first", term1152);
        setIntField(term1153, term1153.getClass(), "type", 0);
        setField(term1153, term1153.getClass(), "next", null);
        setField(term1153, term1153.getClass(), "first", null);
        setField(term1153, term1153.getClass(), "last", null);
        setField(term1153, term1153.getClass(), "propListHead", null);
        setIntField(term1153, term1153.getClass(), "sourcePosition", 0);
        setField(term1153, term1153.getClass(), "jsType", null);
        setField(term1153, term1153.getClass(), "parent", null);
        setField(term1146, term1146.getClass(), "last", term1153);
        setField(term1154, term1154.getClass(), "next", null);
        setIntField(term1154, term1154.getClass(), "type", 0);
        setIntField(term1154, term1154.getClass(), "intValue", 0);
        setField(term1154, term1154.getClass(), "objectValue", null);
        setField(term1146, term1146.getClass(), "propListHead", term1154);
        setIntField(term1146, term1146.getClass(), "sourcePosition", -1087774327);
        setField(term1146, term1146.getClass(), "jsType", null);
        setField(term1146, term1146.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.FunctionToBlockMutator");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term105;
        callMethod(klass, "fixUnitializedVarDeclarations", argTypes, term104, args);
        assertTrue(recursiveEquals(term104, term1145));
        assertTrue(recursiveEquals(term105, term1146));
    }

};


