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

public class TypeCheck_visitName_1546932345475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131881;
     Object term131951;
     Object term132337;
     Object term132403;
     Object term132404;
     Object term132405;

    public TypeCheck_visitName_1546932345475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131881 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term131951 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term132075 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        Object term132171 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term132267 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term131951, term131951.getClass(), "jsType", term132075);
        setIntField(term131951, term131951.getClass(), "type", 72164);
        setIntField(term132171, term132171.getClass(), "type", -30);
        setIntField(term132267, term132267.getClass(), "type", 29);
        setField(term132171, term132171.getClass(), "next", term132267);
        setField(term131951, term131951.getClass(), "propListHead", term132171);
        term132337 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term132337, term132337.getClass(), "type", -5855719);
        term132403 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term132403, term132403.getClass(), "compiler", null);
        setField(term132403, term132403.getClass(), "validator", null);
        setField(term132403, term132403.getClass(), "reverseInterpreter", null);
        setField(term132403, term132403.getClass(), "typeRegistry", null);
        setField(term132403, term132403.getClass(), "topScope", null);
        setField(term132403, term132403.getClass(), "scopeCreator", null);
        setField(term132403, term132403.getClass(), "reportMissingOverride", null);
        setField(term132403, term132403.getClass(), "reportUnknownTypes", null);
        setBooleanField(term132403, term132403.getClass(), "reportMissingProperties", false);
        setField(term132403, term132403.getClass(), "inferJSDocInfo", null);
        setIntField(term132403, term132403.getClass(), "typedCount", 0);
        setIntField(term132403, term132403.getClass(), "nullCount", 0);
        setIntField(term132403, term132403.getClass(), "unknownCount", 0);
        setBooleanField(term132403, term132403.getClass(), "inExterns", false);
        setIntField(term132403, term132403.getClass(), "noTypeCheckSection", 0);
        term132404 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term132404, term132404.getClass(), "type", -5855719);
        setField(term132404, term132404.getClass(), "next", null);
        setField(term132404, term132404.getClass(), "first", null);
        setField(term132404, term132404.getClass(), "last", null);
        setField(term132404, term132404.getClass(), "propListHead", null);
        setIntField(term132404, term132404.getClass(), "sourcePosition", 0);
        setField(term132404, term132404.getClass(), "jsType", null);
        setField(term132404, term132404.getClass(), "parent", null);
        term132405 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term132406 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term132407 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term132408 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setIntField(term132405, term132405.getClass(), "type", 72164);
        setField(term132405, term132405.getClass(), "next", null);
        setField(term132405, term132405.getClass(), "first", null);
        setField(term132405, term132405.getClass(), "last", null);
        setField(term132407, term132407.getClass(), "next", null);
        setIntField(term132407, term132407.getClass(), "type", 29);
        setIntField(term132407, term132407.getClass(), "intValue", 0);
        setField(term132407, term132407.getClass(), "objectValue", null);
        setField(term132406, term132406.getClass(), "next", term132407);
        setIntField(term132406, term132406.getClass(), "type", -30);
        setIntField(term132406, term132406.getClass(), "intValue", 0);
        setField(term132406, term132406.getClass(), "objectValue", null);
        setField(term132405, term132405.getClass(), "propListHead", term132406);
        setIntField(term132405, term132405.getClass(), "sourcePosition", 0);
        setField(term132408, term132408.getClass(), "typeExpr", null);
        setField(term132408, term132408.getClass(), "sourceName", null);
        setBooleanField(term132408, term132408.getClass(), "forgiving", false);
        setBooleanField(term132408, term132408.getClass(), "isChecked", false);
        setBooleanField(term132408, term132408.getClass(), "visited", false);
        setField(term132408, term132408.getClass(), "docInfo", null);
        setBooleanField(term132408, term132408.getClass(), "unknown", false);
        setBooleanField(term132408, term132408.getClass(), "resolved", false);
        setField(term132408, term132408.getClass(), "resolveResult", null);
        setField(term132408, term132408.getClass(), "registry", null);
        setField(term132405, term132405.getClass(), "jsType", term132408);
        setField(term132405, term132405.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term131951;
        args[2] = term132337;
        Object retValue = callMethod(klass, "visitName", argTypes, term131881, args);
        assertTrue(recursiveEquals(term131881, term132403));
        assertTrue(recursiveEquals(term131951, term132405));
        assertTrue(recursiveEquals(term132337, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


