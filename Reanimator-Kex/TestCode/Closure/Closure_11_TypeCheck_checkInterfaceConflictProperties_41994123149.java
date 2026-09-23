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

public class TypeCheck_checkInterfaceConflictProperties_41994123149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33688;
     Object term33798;
     Object term34285;
     Object term34286;

    public TypeCheck_checkInterfaceConflictProperties_41994123149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33688 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term33798 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        term34285 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term34285, term34285.getClass(), "compiler", null);
        setField(term34285, term34285.getClass(), "validator", null);
        setField(term34285, term34285.getClass(), "reverseInterpreter", null);
        setField(term34285, term34285.getClass(), "typeRegistry", null);
        setField(term34285, term34285.getClass(), "topScope", null);
        setField(term34285, term34285.getClass(), "scopeCreator", null);
        setField(term34285, term34285.getClass(), "reportMissingOverride", null);
        setField(term34285, term34285.getClass(), "reportUnknownTypes", null);
        setBooleanField(term34285, term34285.getClass(), "reportMissingProperties", false);
        setField(term34285, term34285.getClass(), "inferJSDocInfo", null);
        setIntField(term34285, term34285.getClass(), "typedCount", 0);
        setIntField(term34285, term34285.getClass(), "nullCount", 0);
        setIntField(term34285, term34285.getClass(), "unknownCount", 0);
        setBooleanField(term34285, term34285.getClass(), "inExterns", false);
        setIntField(term34285, term34285.getClass(), "noTypeCheckSection", 0);
        term34286 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(term34286, term34286.getClass(), "parameterType", null);
        setField(term34286, term34286.getClass(), "referencedType", null);
        setField(term34286, term34286.getClass(), "referencedObjType", null);
        setBooleanField(term34286, term34286.getClass(), "visited", false);
        setField(term34286, term34286.getClass(), "docInfo", null);
        setBooleanField(term34286, term34286.getClass(), "unknown", false);
        setBooleanField(term34286, term34286.getClass(), "resolved", false);
        setField(term34286, term34286.getClass(), "resolveResult", null);
        setBooleanField(term34286, term34286.getClass(), "inTemplatedCheckVisit", false);
        setField(term34286, term34286.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.util.HashMap");
        argTypes[4] = Class.forName("java.util.HashMap");
        argTypes[5] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = term33798;
        callMethod(klass, "checkInterfaceConflictProperties", argTypes, term33688, args);
        assertTrue(recursiveEquals(term33688, term34285));
        assertTrue(recursiveEquals(term33798, null));
    }

};


