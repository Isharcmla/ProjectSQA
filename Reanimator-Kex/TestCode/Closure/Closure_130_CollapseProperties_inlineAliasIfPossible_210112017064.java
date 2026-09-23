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

public class CollapseProperties_inlineAliasIfPossible_210112017064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240303;
     Object term240405;
     Object term240571;
     Object term240572;

    public CollapseProperties_inlineAliasIfPossible_210112017064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term240303 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term240405 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term240475 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term240545 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term240475, term240475.getClass(), "parent", term240545);
        setField(term240405, term240405.getClass(), "node", term240475);
        term240571 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term240571, term240571.getClass(), "compiler", null);
        setField(term240571, term240571.getClass(), "globalNames", null);
        setField(term240571, term240571.getClass(), "nameMap", null);
        setBooleanField(term240571, term240571.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term240571, term240571.getClass(), "inlineAliases", false);
        term240572 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term240573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term240574 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term240573, term240573.getClass(), "type", 0);
        setField(term240573, term240573.getClass(), "next", null);
        setField(term240573, term240573.getClass(), "first", null);
        setField(term240573, term240573.getClass(), "last", null);
        setField(term240573, term240573.getClass(), "propListHead", null);
        setIntField(term240573, term240573.getClass(), "sourcePosition", 0);
        setField(term240573, term240573.getClass(), "jsType", null);
        setIntField(term240574, term240574.getClass(), "type", 0);
        setField(term240574, term240574.getClass(), "next", null);
        setField(term240574, term240574.getClass(), "first", null);
        setField(term240574, term240574.getClass(), "last", null);
        setField(term240574, term240574.getClass(), "propListHead", null);
        setIntField(term240574, term240574.getClass(), "sourcePosition", 0);
        setField(term240574, term240574.getClass(), "jsType", null);
        setField(term240574, term240574.getClass(), "parent", null);
        setField(term240573, term240573.getClass(), "parent", term240574);
        setField(term240572, term240572.getClass(), "node", term240573);
        setField(term240572, term240572.getClass(), "module", null);
        setField(term240572, term240572.getClass(), "source", null);
        setField(term240572, term240572.getClass(), "name", null);
        setField(term240572, term240572.getClass(), "type", null);
        setField(term240572, term240572.getClass(), "scope", null);
        setIntField(term240572, term240572.getClass(), "preOrderIndex", 0);
        setField(term240572, term240572.getClass(), "twin", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.GlobalNamespace");
        Object[] args = new Object[2];
        args[0] = term240405;
        args[1] = null;
        Object retValue = callMethod(klass, "inlineAliasIfPossible", argTypes, term240303, args);
        assertTrue(recursiveEquals(term240303, term240571));
        assertTrue(recursiveEquals(term240405, term240572));
        assertTrue(recursiveEquals(retValue, false));
    }

};


