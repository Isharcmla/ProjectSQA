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

public class CollapseProperties_flattenPrefixes_357402923103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249041;
     Object term249145;
     Object term249565;
     Object term249566;

    public CollapseProperties_flattenPrefixes_357402923103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term249041 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term249145 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term249247 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term249145, term249145.getClass(), "parent", null);
        setField(term249145, term249145.getClass(), "baseName", null);
        setField(term249145, term249145.getClass(), "declaration", term249247);
        term249565 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term249565, term249565.getClass(), "compiler", null);
        setField(term249565, term249565.getClass(), "globalNames", null);
        setField(term249565, term249565.getClass(), "nameMap", null);
        setBooleanField(term249565, term249565.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term249565, term249565.getClass(), "inlineAliases", false);
        term249566 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term249567 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        setField(term249566, term249566.getClass(), "baseName", null);
        setField(term249566, term249566.getClass(), "parent", null);
        setField(term249566, term249566.getClass(), "props", null);
        setField(term249567, term249567.getClass(), "node", null);
        setField(term249567, term249567.getClass(), "module", null);
        setField(term249567, term249567.getClass(), "source", null);
        setField(term249567, term249567.getClass(), "name", null);
        setField(term249567, term249567.getClass(), "type", null);
        setField(term249567, term249567.getClass(), "scope", null);
        setIntField(term249567, term249567.getClass(), "preOrderIndex", 0);
        setField(term249567, term249567.getClass(), "twin", null);
        setField(term249566, term249566.getClass(), "declaration", term249567);
        setField(term249566, term249566.getClass(), "refs", null);
        setField(term249566, term249566.getClass(), "type", null);
        setBooleanField(term249566, term249566.getClass(), "declaredType", false);
        setBooleanField(term249566, term249566.getClass(), "hasDeclaredTypeDescendant", false);
        setIntField(term249566, term249566.getClass(), "globalSets", 0);
        setIntField(term249566, term249566.getClass(), "localSets", 0);
        setIntField(term249566, term249566.getClass(), "aliasingGets", 0);
        setIntField(term249566, term249566.getClass(), "totalGets", 0);
        setIntField(term249566, term249566.getClass(), "callGets", 0);
        setIntField(term249566, term249566.getClass(), "deleteProps", 0);
        setBooleanField(term249566, term249566.getClass(), "inExterns", false);
        setField(term249566, term249566.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term249145;
        args[2] = 0;
        callMethod(klass, "flattenPrefixes", argTypes, term249041, args);
        assertTrue(recursiveEquals(term249041, term249565));
        assertTrue(recursiveEquals(term249145, null));
    }

};


