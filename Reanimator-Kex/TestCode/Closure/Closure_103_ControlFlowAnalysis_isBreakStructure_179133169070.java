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
import java.lang.Boolean;

public class ControlFlowAnalysis_isBreakStructure_179133169070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3133;
     Object term3160;
     Object term21773;

    public ControlFlowAnalysis_isBreakStructure_179133169070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3133 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3135 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3140 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3143 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3146 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term3150 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3153 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term3156 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term3133, term3133.getClass(), "type", -1763480506);
        setIntField(term3135, term3135.getClass(), "type", -460657407);
        setIntField(term3137, term3137.getClass(), "type", 0);
        setField(term3137, term3137.getClass(), "next", null);
        setField(term3137, term3137.getClass(), "first", null);
        setField(term3137, term3137.getClass(), "last", null);
        setField(term3137, term3137.getClass(), "propListHead", null);
        setIntField(term3137, term3137.getClass(), "sourcePosition", 0);
        setField(term3137, term3137.getClass(), "jsType", null);
        setField(term3137, term3137.getClass(), "parent", null);
        setField(term3135, term3135.getClass(), "next", term3137);
        setIntField(term3140, term3140.getClass(), "type", 0);
        setField(term3140, term3140.getClass(), "next", null);
        setField(term3140, term3140.getClass(), "first", null);
        setField(term3140, term3140.getClass(), "last", null);
        setField(term3140, term3140.getClass(), "propListHead", null);
        setIntField(term3140, term3140.getClass(), "sourcePosition", 0);
        setField(term3140, term3140.getClass(), "jsType", null);
        setField(term3140, term3140.getClass(), "parent", null);
        setField(term3135, term3135.getClass(), "first", term3140);
        setIntField(term3143, term3143.getClass(), "type", 0);
        setField(term3143, term3143.getClass(), "next", null);
        setField(term3143, term3143.getClass(), "first", null);
        setField(term3143, term3143.getClass(), "last", null);
        setField(term3143, term3143.getClass(), "propListHead", null);
        setIntField(term3143, term3143.getClass(), "sourcePosition", 0);
        setField(term3143, term3143.getClass(), "jsType", null);
        setField(term3143, term3143.getClass(), "parent", null);
        setField(term3135, term3135.getClass(), "last", term3143);
        setField(term3146, term3146.getClass(), "next", null);
        setIntField(term3146, term3146.getClass(), "type", 0);
        setIntField(term3146, term3146.getClass(), "intValue", 0);
        setField(term3146, term3146.getClass(), "objectValue", null);
        setField(term3135, term3135.getClass(), "propListHead", term3146);
        setIntField(term3135, term3135.getClass(), "sourcePosition", 413214164);
        setField(term3135, term3135.getClass(), "jsType", null);
        setField(term3135, term3135.getClass(), "parent", null);
        setField(term3133, term3133.getClass(), "next", term3135);
        setIntField(term3150, term3150.getClass(), "type", 0);
        setField(term3150, term3150.getClass(), "next", null);
        setField(term3150, term3150.getClass(), "first", null);
        setField(term3150, term3150.getClass(), "last", null);
        setField(term3150, term3150.getClass(), "propListHead", null);
        setIntField(term3150, term3150.getClass(), "sourcePosition", 0);
        setField(term3150, term3150.getClass(), "jsType", null);
        setField(term3150, term3150.getClass(), "parent", null);
        setField(term3133, term3133.getClass(), "first", term3150);
        setIntField(term3153, term3153.getClass(), "type", 0);
        setField(term3153, term3153.getClass(), "next", null);
        setField(term3153, term3153.getClass(), "first", null);
        setField(term3153, term3153.getClass(), "last", null);
        setField(term3153, term3153.getClass(), "propListHead", null);
        setIntField(term3153, term3153.getClass(), "sourcePosition", 0);
        setField(term3153, term3153.getClass(), "jsType", null);
        setField(term3153, term3153.getClass(), "parent", null);
        setField(term3133, term3133.getClass(), "last", term3153);
        setField(term3156, term3156.getClass(), "next", null);
        setIntField(term3156, term3156.getClass(), "type", 0);
        setIntField(term3156, term3156.getClass(), "intValue", 0);
        setField(term3156, term3156.getClass(), "objectValue", null);
        setField(term3133, term3133.getClass(), "propListHead", term3156);
        setIntField(term3133, term3133.getClass(), "sourcePosition", 355911655);
        setField(term3133, term3133.getClass(), "jsType", null);
        setField(term3133, term3133.getClass(), "parent", null);
        term3160 = new Boolean(false);
        term21773 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21775 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21783 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term21785 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21788 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term21789 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setIntField(term21773, term21773.getClass(), "type", -1763480506);
        setIntField(term21775, term21775.getClass(), "type", -460657407);
        setIntField(term21777, term21777.getClass(), "type", 0);
        setField(term21777, term21777.getClass(), "next", null);
        setField(term21777, term21777.getClass(), "first", null);
        setField(term21777, term21777.getClass(), "last", null);
        setField(term21777, term21777.getClass(), "propListHead", null);
        setIntField(term21777, term21777.getClass(), "sourcePosition", 0);
        setField(term21777, term21777.getClass(), "jsType", null);
        setField(term21777, term21777.getClass(), "parent", null);
        setField(term21775, term21775.getClass(), "next", term21777);
        setIntField(term21779, term21779.getClass(), "type", 0);
        setField(term21779, term21779.getClass(), "next", null);
        setField(term21779, term21779.getClass(), "first", null);
        setField(term21779, term21779.getClass(), "last", null);
        setField(term21779, term21779.getClass(), "propListHead", null);
        setIntField(term21779, term21779.getClass(), "sourcePosition", 0);
        setField(term21779, term21779.getClass(), "jsType", null);
        setField(term21779, term21779.getClass(), "parent", null);
        setField(term21775, term21775.getClass(), "first", term21779);
        setIntField(term21781, term21781.getClass(), "type", 0);
        setField(term21781, term21781.getClass(), "next", null);
        setField(term21781, term21781.getClass(), "first", null);
        setField(term21781, term21781.getClass(), "last", null);
        setField(term21781, term21781.getClass(), "propListHead", null);
        setIntField(term21781, term21781.getClass(), "sourcePosition", 0);
        setField(term21781, term21781.getClass(), "jsType", null);
        setField(term21781, term21781.getClass(), "parent", null);
        setField(term21775, term21775.getClass(), "last", term21781);
        setField(term21783, term21783.getClass(), "next", null);
        setIntField(term21783, term21783.getClass(), "type", 0);
        setIntField(term21783, term21783.getClass(), "intValue", 0);
        setField(term21783, term21783.getClass(), "objectValue", null);
        setField(term21775, term21775.getClass(), "propListHead", term21783);
        setIntField(term21775, term21775.getClass(), "sourcePosition", 413214164);
        setField(term21775, term21775.getClass(), "jsType", null);
        setField(term21775, term21775.getClass(), "parent", null);
        setField(term21773, term21773.getClass(), "next", term21775);
        setIntField(term21785, term21785.getClass(), "type", 0);
        setField(term21785, term21785.getClass(), "next", null);
        setField(term21785, term21785.getClass(), "first", null);
        setField(term21785, term21785.getClass(), "last", null);
        setField(term21785, term21785.getClass(), "propListHead", null);
        setIntField(term21785, term21785.getClass(), "sourcePosition", 0);
        setField(term21785, term21785.getClass(), "jsType", null);
        setField(term21785, term21785.getClass(), "parent", null);
        setField(term21773, term21773.getClass(), "first", term21785);
        setIntField(term21788, term21788.getClass(), "type", 0);
        setField(term21788, term21788.getClass(), "next", null);
        setField(term21788, term21788.getClass(), "first", null);
        setField(term21788, term21788.getClass(), "last", null);
        setField(term21788, term21788.getClass(), "propListHead", null);
        setIntField(term21788, term21788.getClass(), "sourcePosition", 0);
        setField(term21788, term21788.getClass(), "jsType", null);
        setField(term21788, term21788.getClass(), "parent", null);
        setField(term21773, term21773.getClass(), "last", term21788);
        setField(term21789, term21789.getClass(), "next", null);
        setIntField(term21789, term21789.getClass(), "type", 0);
        setIntField(term21789, term21789.getClass(), "intValue", 0);
        setField(term21789, term21789.getClass(), "objectValue", null);
        setField(term21773, term21773.getClass(), "propListHead", term21789);
        setIntField(term21773, term21773.getClass(), "sourcePosition", 355911655);
        setField(term21773, term21773.getClass(), "jsType", null);
        setField(term21773, term21773.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.ControlFlowAnalysis");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term3133;
        args[1] = term3160;
        Object retValue = callMethod(klass, "isBreakStructure", argTypes, null, args);
        assertTrue(recursiveEquals(term3133, term21773));
        assertTrue(recursiveEquals(term3160, false));
        assertTrue(recursiveEquals(retValue, false));
    }

};


