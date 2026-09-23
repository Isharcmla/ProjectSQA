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

public class CollapseProperties_updateObjLitOrFunctionDeclaration_262807973230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128854;
     Object term128958;
     Object term129239;
     Object term129240;

    public CollapseProperties_updateObjLitOrFunctionDeclaration_262807973230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term128854 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        term128958 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term129060 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term129130 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129200 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term129060, term129060.getClass(), "twin", null);
        setField(term129130, term129130.getClass(), "parent", term129200);
        setField(term129060, term129060.getClass(), "node", term129130);
        setField(term128958, term128958.getClass(), "declaration", term129060);
        term129239 = newInstance(Class.forName("com.google.javascript.jscomp.CollapseProperties"));
        setField(term129239, term129239.getClass(), "compiler", null);
        setField(term129239, term129239.getClass(), "globalNames", null);
        setField(term129239, term129239.getClass(), "nameMap", null);
        setBooleanField(term129239, term129239.getClass(), "collapsePropertiesOnExternTypes", false);
        setBooleanField(term129239, term129239.getClass(), "inlineAliases", false);
        term129240 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name"));
        Object term129241 = newInstance(Class.forName("com.google.javascript.jscomp.GlobalNamespace$Ref"));
        Object term129242 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term129243 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term129240, term129240.getClass(), "name", null);
        setField(term129240, term129240.getClass(), "parent", null);
        setField(term129240, term129240.getClass(), "props", null);
        setIntField(term129242, term129242.getClass(), "type", 0);
        setField(term129242, term129242.getClass(), "next", null);
        setField(term129242, term129242.getClass(), "first", null);
        setField(term129242, term129242.getClass(), "last", null);
        setField(term129242, term129242.getClass(), "propListHead", null);
        setIntField(term129242, term129242.getClass(), "sourcePosition", 0);
        setField(term129242, term129242.getClass(), "jsType", null);
        setIntField(term129243, term129243.getClass(), "type", 0);
        setField(term129243, term129243.getClass(), "next", null);
        setField(term129243, term129243.getClass(), "first", null);
        setField(term129243, term129243.getClass(), "last", null);
        setField(term129243, term129243.getClass(), "propListHead", null);
        setIntField(term129243, term129243.getClass(), "sourcePosition", 0);
        setField(term129243, term129243.getClass(), "jsType", null);
        setField(term129243, term129243.getClass(), "parent", null);
        setField(term129242, term129242.getClass(), "parent", term129243);
        setField(term129241, term129241.getClass(), "node", term129242);
        setField(term129241, term129241.getClass(), "type", null);
        setField(term129241, term129241.getClass(), "sourceName", null);
        setField(term129241, term129241.getClass(), "scope", null);
        setField(term129241, term129241.getClass(), "module", null);
        setField(term129241, term129241.getClass(), "twin", null);
        setField(term129240, term129240.getClass(), "declaration", term129241);
        setField(term129240, term129240.getClass(), "refs", null);
        setField(term129240, term129240.getClass(), "type", null);
        setBooleanField(term129240, term129240.getClass(), "isClassOrEnum", false);
        setBooleanField(term129240, term129240.getClass(), "hasClassOrEnumDescendant", false);
        setIntField(term129240, term129240.getClass(), "globalSets", 0);
        setIntField(term129240, term129240.getClass(), "localSets", 0);
        setIntField(term129240, term129240.getClass(), "aliasingGets", 0);
        setIntField(term129240, term129240.getClass(), "totalGets", 0);
        setIntField(term129240, term129240.getClass(), "callGets", 0);
        setBooleanField(term129240, term129240.getClass(), "inExterns", false);
        setField(term129240, term129240.getClass(), "docInfo", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CollapseProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.GlobalNamespace$Name");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term128958;
        args[1] = null;
        callMethod(klass, "updateObjLitOrFunctionDeclaration", argTypes, term128854, args);
        assertTrue(recursiveEquals(term128854, term129239));
        assertTrue(recursiveEquals(term128958, term129240));
    }

};


