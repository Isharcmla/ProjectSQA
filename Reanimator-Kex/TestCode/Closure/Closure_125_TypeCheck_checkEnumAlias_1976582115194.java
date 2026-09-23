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

public class TypeCheck_checkEnumAlias_1976582115194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46470;
     Object term46550;
     Object term46569;
     Object term46570;

    public TypeCheck_checkEnumAlias_1976582115194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46470 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term46550 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        term46569 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term46569, term46569.getClass(), "compiler", null);
        setField(term46569, term46569.getClass(), "validator", null);
        setField(term46569, term46569.getClass(), "reverseInterpreter", null);
        setField(term46569, term46569.getClass(), "typeRegistry", null);
        setField(term46569, term46569.getClass(), "topScope", null);
        setField(term46569, term46569.getClass(), "scopeCreator", null);
        setField(term46569, term46569.getClass(), "reportMissingOverride", null);
        setBooleanField(term46569, term46569.getClass(), "reportUnknownTypes", false);
        setBooleanField(term46569, term46569.getClass(), "reportMissingProperties", false);
        setField(term46569, term46569.getClass(), "inferJSDocInfo", null);
        setIntField(term46569, term46569.getClass(), "typedCount", 0);
        setIntField(term46569, term46569.getClass(), "nullCount", 0);
        setIntField(term46569, term46569.getClass(), "unknownCount", 0);
        setBooleanField(term46569, term46569.getClass(), "inExterns", false);
        setIntField(term46569, term46569.getClass(), "noTypeCheckSection", 0);
        setField(term46569, term46569.getClass(), "editDistance", null);
        term46570 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term46570, term46570.getClass(), "info", null);
        setField(term46570, term46570.getClass(), "documentation", null);
        setField(term46570, term46570.getClass(), "associatedNode", null);
        setField(term46570, term46570.getClass(), "visibility", null);
        setIntField(term46570, term46570.getClass(), "bitset", 0);
        setField(term46570, term46570.getClass(), "type", null);
        setField(term46570, term46570.getClass(), "thisType", null);
        setBooleanField(term46570, term46570.getClass(), "includeDocumentation", false);
        setIntField(term46570, term46570.getClass(), "originalCommentPosition", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.JSDocInfo");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term46550;
        args[2] = null;
        callMethod(klass, "checkEnumAlias", argTypes, term46470, args);
        assertTrue(recursiveEquals(term46470, term46569));
        assertTrue(recursiveEquals(term46550, null));
    }

};


