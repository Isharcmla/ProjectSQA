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

public class CollapseProperties_updateObjLitOrFunctionDeclaration_26280797360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57426;
     Object term57530;
     Object term57730;
     Object term57731;

    public CollapseProperties_updateObjLitOrFunctionDeclaration_26280797360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57426 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term57530 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        term57730 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term57730, term57730.getClass(), "compiler", null);
        setField(term57730, term57730.getClass(), "globalNames", null);
        setField(term57730, term57730.getClass(), "nameMap", null);
        setBooleanField(term57730, term57730.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term57730, term57730.getClass(), "inlineAliases", false);
        term57731 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        setField(term57731, term57731.getClass(), "name", null);
        setField(term57731, term57731.getClass(), "parent", null);
        setField(term57731, term57731.getClass(), "props", null);
        setField(term57731, term57731.getClass(), "declaration", null);
        setField(term57731, term57731.getClass(), "refs", null);
        setField(term57731, term57731.getClass(), "type", null);
        setBooleanField(term57731, term57731.getClass(), "isClassOrEnum", false);
        setBooleanField(term57731, term57731.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term57731, term57731.getClass(), "globalSets", 0);
        setIntField(term57731, term57731.getClass(), "localSets", 0);
        setIntField(term57731, term57731.getClass(), "aliasingGets", 0);
        setIntField(term57731, term57731.getClass(), "totalGets", 0);
        setIntField(term57731, term57731.getClass(), "callGets", 0);
        setBooleanField(term57731, term57731.getClass(), "inExterns", false);
        setField(term57731, term57731.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term57530;
        args[1] = null;
        callMethod(klass, "updateObjLitOrFunctionDeclaration", argTypes, term57426, args);
        assertTrue(recursiveEquals(term57426, term57730));
        assertTrue(recursiveEquals(term57530, term57731));
    }

};


