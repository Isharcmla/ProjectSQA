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
import java.lang.Boolean;

public class CollapseProperties_updateObjLitOrFunctionDeclarationAtVarNode_51886917457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29524;
     Object term29527;
     Object term238710;

    public CollapseProperties_updateObjLitOrFunctionDeclarationAtVarNode_51886917457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29524 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term29524, term29524.getClass(), "compiler", null);
        setField(term29524, term29524.getClass(), "globalNames", null);
        setField(term29524, term29524.getClass(), "nameMap", null);
        setBooleanField(term29524, term29524.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term29524, term29524.getClass(), "inlineAliases", false);
        term29527 = new Boolean(false);
        term238710 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term238710, term238710.getClass(), "compiler", null);
        setField(term238710, term238710.getClass(), "globalNames", null);
        setField(term238710, term238710.getClass(), "nameMap", null);
        setBooleanField(term238710, term238710.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term238710, term238710.getClass(), "inlineAliases", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term29527;
        callMethod(klass, "updateObjLitOrFunctionDeclarationAtVarNode", argTypes, term29524, args);
        assertTrue(recursiveEquals(term29524, term238710));
        assertTrue(recursiveEquals(term29527, false));
    }

};


