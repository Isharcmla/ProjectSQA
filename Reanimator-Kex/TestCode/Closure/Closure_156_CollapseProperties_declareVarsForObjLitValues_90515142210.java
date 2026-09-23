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
import java.lang.String;
import java.lang.Object;

public class CollapseProperties_declareVarsForObjLitValues_90515142210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115400;
     Object term115504;
     Object term115726;
     Object term116515;
     Object term116516;
     Object term116520;

    public CollapseProperties_declareVarsForObjLitValues_90515142210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115400 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        Class<? extends Object> term116523 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term116522 = ((Class) term116523).getDeclaredField((String) "SET");
        ((Field) term116522).setAccessible(true);
        Object enum191 = ((Field) term116522).get((Object) null);
        term115504 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term115504, term115504.getClass(), "type", enum191);
        term115726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term115796 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term115796, term115796.getClass(), "first", null);
        setField(term115796, term115796.getClass(), "next", null);
        setIntField(term115796, term115796.getClass(), "type", 147);
        setField(term115726, term115726.getClass(), "first", term115796);
        term116515 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term116515, term116515.getClass(), "compiler", null);
        setField(term116515, term116515.getClass(), "globalNames", null);
        setField(term116515, term116515.getClass(), "nameMap", null);
        setBooleanField(term116515, term116515.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term116515, term116515.getClass(), "inlineAliases", false);
        Class<? extends Object> term116809 = Class.forName((String) "com.google.javascript.jscomp.GlobalNamespace$Name$Type");
        Field term116808 = ((Class) term116809).getDeclaredField((String) "SET");
        ((Field) term116808).setAccessible(true);
        Object enum192 = ((Field) term116808).get((Object) null);
        term116516 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term116516, term116516.getClass(), "name", null);
        setField(term116516, term116516.getClass(), "parent", null);
        setField(term116516, term116516.getClass(), "props", null);
        setField(term116516, term116516.getClass(), "declaration", null);
        setField(term116516, term116516.getClass(), "refs", null);
        setField(term116516, term116516.getClass(), "type", enum192);
        setBooleanField(term116516, term116516.getClass(), "isClassOrEnum", false);
        setBooleanField(term116516, term116516.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term116516, term116516.getClass(), "globalSets", 0);
        setIntField(term116516, term116516.getClass(), "localSets", 0);
        setIntField(term116516, term116516.getClass(), "aliasingGets", 0);
        setIntField(term116516, term116516.getClass(), "totalGets", 0);
        setIntField(term116516, term116516.getClass(), "callGets", 0);
        setBooleanField(term116516, term116516.getClass(), "inExterns", false);
        setField(term116516, term116516.getClass(), "docInfo", null);
        term116520 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term116521 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term116520, term116520.getClass(), "type", 0);
        setField(term116520, term116520.getClass(), "next", null);
        setIntField(term116521, term116521.getClass(), "type", 147);
        setField(term116521, term116521.getClass(), "next", null);
        setField(term116521, term116521.getClass(), "first", null);
        setField(term116521, term116521.getClass(), "last", null);
        setField(term116521, term116521.getClass(), "propListHead", null);
        setIntField(term116521, term116521.getClass(), "sourcePosition", 0);
        setField(term116521, term116521.getClass(), "jsType", null);
        setField(term116521, term116521.getClass(), "parent", null);
        setField(term116520, term116520.getClass(), "first", term116521);
        setField(term116520, term116520.getClass(), "last", null);
        setField(term116520, term116520.getClass(), "propListHead", null);
        setIntField(term116520, term116520.getClass(), "sourcePosition", 0);
        setField(term116520, term116520.getClass(), "jsType", null);
        setField(term116520, term116520.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[3] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[4] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[5] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[6];
        args[0] = term115504;
        args[1] = null;
        args[2] = term115726;
        args[3] = null;
        args[4] = null;
        args[5] = null;
        callMethod(klass, "declareVarsForObjLitValues", argTypes, term115400, args);
        assertTrue(recursiveEquals(term115400, term116515));
        assertTrue(recursiveEquals(term115504, term116516));
        assertTrue(recursiveEquals(term115726, null));
    }

};


