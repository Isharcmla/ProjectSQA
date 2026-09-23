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

public class TypeCheck_visitName_1546932345190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43685;
     Object term43904;
     Object term44019;
     Object term44020;
     Object term44022;

    public TypeCheck_visitName_1546932345190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43685 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term43904 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term43961 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setIntField(term43904, term43904.getClass(), "type", 0);
        setField(term43904, term43904.getClass(), "jsType", term43961);
        term44019 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term44019, term44019.getClass(), "compiler", null);
        setField(term44019, term44019.getClass(), "validator", null);
        setField(term44019, term44019.getClass(), "reverseInterpreter", null);
        setField(term44019, term44019.getClass(), "typeRegistry", null);
        setField(term44019, term44019.getClass(), "topScope", null);
        setField(term44019, term44019.getClass(), "scopeCreator", null);
        setField(term44019, term44019.getClass(), "reportMissingOverride", null);
        setField(term44019, term44019.getClass(), "reportUnknownTypes", null);
        setBooleanField(term44019, term44019.getClass(), "reportMissingProperties", false);
        setField(term44019, term44019.getClass(), "inferJSDocInfo", null);
        setIntField(term44019, term44019.getClass(), "typedCount", 0);
        setIntField(term44019, term44019.getClass(), "nullCount", 0);
        setIntField(term44019, term44019.getClass(), "unknownCount", 0);
        setBooleanField(term44019, term44019.getClass(), "inExterns", false);
        setIntField(term44019, term44019.getClass(), "noTypeCheckSection", 0);
        term44020 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44021 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setIntField(term44020, term44020.getClass(), "type", 0);
        setField(term44020, term44020.getClass(), "next", null);
        setField(term44020, term44020.getClass(), "first", null);
        setField(term44020, term44020.getClass(), "last", null);
        setField(term44020, term44020.getClass(), "propListHead", null);
        setIntField(term44020, term44020.getClass(), "sourcePosition", 0);
        setField(term44021, term44021.getClass(), "className", null);
        setField(term44021, term44021.getClass(), "properties", null);
        setBooleanField(term44021, term44021.getClass(), "nativeType", false);
        setField(term44021, term44021.getClass(), "implicitPrototypeFallback", null);
        setField(term44021, term44021.getClass(), "ownerFunction", null);
        setBooleanField(term44021, term44021.getClass(), "prettyPrint", false);
        setBooleanField(term44021, term44021.getClass(), "visited", false);
        setField(term44021, term44021.getClass(), "docInfo", null);
        setBooleanField(term44021, term44021.getClass(), "unknown", false);
        setBooleanField(term44021, term44021.getClass(), "resolved", false);
        setField(term44021, term44021.getClass(), "resolveResult", null);
        setBooleanField(term44021, term44021.getClass(), "inTemplatedCheckVisit", false);
        setField(term44021, term44021.getClass(), "registry", null);
        setField(term44020, term44020.getClass(), "jsType", term44021);
        setField(term44020, term44020.getClass(), "parent", null);
        term44022 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term44023 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setIntField(term44022, term44022.getClass(), "type", 0);
        setField(term44022, term44022.getClass(), "next", null);
        setField(term44022, term44022.getClass(), "first", null);
        setField(term44022, term44022.getClass(), "last", null);
        setField(term44022, term44022.getClass(), "propListHead", null);
        setIntField(term44022, term44022.getClass(), "sourcePosition", 0);
        setField(term44023, term44023.getClass(), "className", null);
        setField(term44023, term44023.getClass(), "properties", null);
        setBooleanField(term44023, term44023.getClass(), "nativeType", false);
        setField(term44023, term44023.getClass(), "implicitPrototypeFallback", null);
        setField(term44023, term44023.getClass(), "ownerFunction", null);
        setBooleanField(term44023, term44023.getClass(), "prettyPrint", false);
        setBooleanField(term44023, term44023.getClass(), "visited", false);
        setField(term44023, term44023.getClass(), "docInfo", null);
        setBooleanField(term44023, term44023.getClass(), "unknown", false);
        setBooleanField(term44023, term44023.getClass(), "resolved", false);
        setField(term44023, term44023.getClass(), "resolveResult", null);
        setBooleanField(term44023, term44023.getClass(), "inTemplatedCheckVisit", false);
        setField(term44023, term44023.getClass(), "registry", null);
        setField(term44022, term44022.getClass(), "jsType", term44023);
        setField(term44022, term44022.getClass(), "parent", null);
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
        args[1] = term43904;
        args[2] = term43904;
        Object retValue = callMethod(klass, "visitName", argTypes, term43685, args);
        assertTrue(recursiveEquals(term43685, term44019));
        assertTrue(recursiveEquals(term43904, term44022));
        assertTrue(recursiveEquals(term43904, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


