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

public class CollapseProperties_updateObjLitOrFunctionDeclaration_161779027394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245460;
     Object term245564;
     Object term246266;
     Object term246267;

    public CollapseProperties_updateObjLitOrFunctionDeclaration_161779027394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245460 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term245564 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        term246266 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term246266, term246266.getClass(), "compiler", null);
        setField(term246266, term246266.getClass(), "globalNames", null);
        setField(term246266, term246266.getClass(), "nameMap", null);
        setBooleanField(term246266, term246266.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term246266, term246266.getClass(), "inlineAliases", false);
        term246267 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term246267, term246267.getClass(), "baseName", null);
        setField(term246267, term246267.getClass(), "parent", null);
        setField(term246267, term246267.getClass(), "props", null);
        setField(term246267, term246267.getClass(), "declaration", null);
        setField(term246267, term246267.getClass(), "refs", null);
        setField(term246267, term246267.getClass(), "type", null);
        setBooleanField(term246267, term246267.getClass(), "declaredType", false);
        setBooleanField(term246267, term246267.getClass(), "hasDeclaredTypeDescendant", false);
        setIntField(term246267, term246267.getClass(), "globalSets", 0);
        setIntField(term246267, term246267.getClass(), "localSets", 0);
        setIntField(term246267, term246267.getClass(), "aliasingGets", 0);
        setIntField(term246267, term246267.getClass(), "totalGets", 0);
        setIntField(term246267, term246267.getClass(), "callGets", 0);
        setIntField(term246267, term246267.getClass(), "deleteProps", 0);
        setBooleanField(term246267, term246267.getClass(), "inExterns", false);
        setField(term246267, term246267.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term245564;
        args[1] = null;
        args[2] = false;
        callMethod(klass, "updateObjLitOrFunctionDeclaration", argTypes, term245460, args);
        assertTrue(recursiveEquals(term245460, term246266));
        assertTrue(recursiveEquals(term245564, term246267));
    }

};


