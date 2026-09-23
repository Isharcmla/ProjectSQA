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

public class TypeCheck_visitName_1546932345195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54493;
     Object term54563;
     Object term54833;
     Object term55169;
     Object term55170;
     Object term55171;

    public TypeCheck_visitName_1546932345195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54493 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term54563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term54667 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term54763 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        setField(term54563, term54563.getClass(), "jsType", term54667);
        setIntField(term54563, term54563.getClass(), "type", 16);
        setField(term54563, term54563.getClass(), "propListHead", term54763);
        term54833 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term54833, term54833.getClass(), "type", 16);
        term55169 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term55169, term55169.getClass(), "compiler", null);
        setField(term55169, term55169.getClass(), "validator", null);
        setField(term55169, term55169.getClass(), "reverseInterpreter", null);
        setField(term55169, term55169.getClass(), "typeRegistry", null);
        setField(term55169, term55169.getClass(), "topScope", null);
        setField(term55169, term55169.getClass(), "scopeCreator", null);
        setField(term55169, term55169.getClass(), "reportMissingOverride", null);
        setField(term55169, term55169.getClass(), "reportUnknownTypes", null);
        setBooleanField(term55169, term55169.getClass(), "reportMissingProperties", false);
        setField(term55169, term55169.getClass(), "inferJSDocInfo", null);
        setIntField(term55169, term55169.getClass(), "typedCount", 0);
        setIntField(term55169, term55169.getClass(), "nullCount", 0);
        setIntField(term55169, term55169.getClass(), "unknownCount", 0);
        setBooleanField(term55169, term55169.getClass(), "inExterns", false);
        setIntField(term55169, term55169.getClass(), "noTypeCheckSection", 0);
        term55170 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term55170, term55170.getClass(), "type", 16);
        setField(term55170, term55170.getClass(), "next", null);
        setField(term55170, term55170.getClass(), "first", null);
        setField(term55170, term55170.getClass(), "last", null);
        setField(term55170, term55170.getClass(), "propListHead", null);
        setIntField(term55170, term55170.getClass(), "sourcePosition", 0);
        setField(term55170, term55170.getClass(), "jsType", null);
        setField(term55170, term55170.getClass(), "parent", null);
        term55171 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term55172 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term55173 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setIntField(term55171, term55171.getClass(), "type", 16);
        setField(term55171, term55171.getClass(), "next", null);
        setField(term55171, term55171.getClass(), "first", null);
        setField(term55171, term55171.getClass(), "last", null);
        setField(term55172, term55172.getClass(), "next", null);
        setIntField(term55172, term55172.getClass(), "type", 0);
        setIntField(term55172, term55172.getClass(), "intValue", 0);
        setField(term55172, term55172.getClass(), "objectValue", null);
        setField(term55171, term55171.getClass(), "propListHead", term55172);
        setIntField(term55171, term55171.getClass(), "sourcePosition", 0);
        setField(term55173, term55173.getClass(), "call", null);
        setField(term55173, term55173.getClass(), "prototype", null);
        setField(term55173, term55173.getClass(), "kind", null);
        setField(term55173, term55173.getClass(), "typeOfThis", null);
        setField(term55173, term55173.getClass(), "source", null);
        setField(term55173, term55173.getClass(), "implementedInterfaces", null);
        setField(term55173, term55173.getClass(), "subTypes", null);
        setField(term55173, term55173.getClass(), "templateTypeName", null);
        setField(term55173, term55173.getClass(), "className", null);
        setField(term55173, term55173.getClass(), "properties", null);
        setBooleanField(term55173, term55173.getClass(), "nativeType", false);
        setField(term55173, term55173.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term55173, term55173.getClass(), "prettyPrint", false);
        setBooleanField(term55173, term55173.getClass(), "visited", false);
        setField(term55173, term55173.getClass(), "docInfo", null);
        setBooleanField(term55173, term55173.getClass(), "unknown", false);
        setBooleanField(term55173, term55173.getClass(), "resolved", false);
        setField(term55173, term55173.getClass(), "resolveResult", null);
        setField(term55173, term55173.getClass(), "registry", null);
        setField(term55171, term55171.getClass(), "jsType", term55173);
        setField(term55171, term55171.getClass(), "parent", null);
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
        args[1] = term54563;
        args[2] = term54833;
        Object retValue = callMethod(klass, "visitName", argTypes, term54493, args);
        assertTrue(recursiveEquals(term54493, term55169));
        assertTrue(recursiveEquals(term54563, term55171));
        assertTrue(recursiveEquals(term54833, null));
        assertTrue(recursiveEquals(retValue, true));
    }

};


