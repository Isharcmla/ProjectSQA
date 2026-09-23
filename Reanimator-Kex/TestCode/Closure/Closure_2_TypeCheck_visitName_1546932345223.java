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

public class TypeCheck_visitName_1546932345223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56483;
     Object term56553;
     Object term57013;
     Object term57014;

    public TypeCheck_visitName_1546932345223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56483 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term56553 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56553, term56553.getClass(), "type", 105);
        term57013 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term57013, term57013.getClass(), "compiler", null);
        setField(term57013, term57013.getClass(), "validator", null);
        setField(term57013, term57013.getClass(), "reverseInterpreter", null);
        setField(term57013, term57013.getClass(), "typeRegistry", null);
        setField(term57013, term57013.getClass(), "topScope", null);
        setField(term57013, term57013.getClass(), "scopeCreator", null);
        setField(term57013, term57013.getClass(), "reportMissingOverride", null);
        setField(term57013, term57013.getClass(), "reportUnknownTypes", null);
        setBooleanField(term57013, term57013.getClass(), "reportMissingProperties", false);
        setField(term57013, term57013.getClass(), "inferJSDocInfo", null);
        setIntField(term57013, term57013.getClass(), "typedCount", 0);
        setIntField(term57013, term57013.getClass(), "nullCount", 0);
        setIntField(term57013, term57013.getClass(), "unknownCount", 0);
        setBooleanField(term57013, term57013.getClass(), "inExterns", false);
        setIntField(term57013, term57013.getClass(), "noTypeCheckSection", 0);
        term57014 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term57014, term57014.getClass(), "type", 105);
        setField(term57014, term57014.getClass(), "next", null);
        setField(term57014, term57014.getClass(), "first", null);
        setField(term57014, term57014.getClass(), "last", null);
        setField(term57014, term57014.getClass(), "propListHead", null);
        setIntField(term57014, term57014.getClass(), "sourcePosition", 0);
        setField(term57014, term57014.getClass(), "jsType", null);
        setField(term57014, term57014.getClass(), "parent", null);
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
        args[1] = null;
        args[2] = term56553;
        Object retValue = callMethod(klass, "visitName", argTypes, term56483, args);
        assertTrue(recursiveEquals(term56483, term57013));
        assertTrue(recursiveEquals(term56553, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


