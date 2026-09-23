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

public class TypeCheck_visit_859524784612 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164342;
     Object term164412;
     Object term164569;
     Object term164570;

    public TypeCheck_visit_859524784612() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term164342 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setBooleanField(term164342, term164342.getClass(), "inExterns", false);
        term164412 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term164526 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setIntField(term164412, term164412.getClass(), "type", 148);
        setField(term164412, term164412.getClass(), "jsType", term164526);
        term164569 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        setField(term164569, term164569.getClass(), "compiler", null);
        setField(term164569, term164569.getClass(), "validator", null);
        setField(term164569, term164569.getClass(), "reverseInterpreter", null);
        setField(term164569, term164569.getClass(), "typeRegistry", null);
        setField(term164569, term164569.getClass(), "topScope", null);
        setField(term164569, term164569.getClass(), "scopeCreator", null);
        setField(term164569, term164569.getClass(), "reportMissingOverride", null);
        setBooleanField(term164569, term164569.getClass(), "reportUnknownTypes", false);
        setBooleanField(term164569, term164569.getClass(), "reportMissingProperties", false);
        setField(term164569, term164569.getClass(), "inferJSDocInfo", null);
        setIntField(term164569, term164569.getClass(), "typedCount", 1);
        setIntField(term164569, term164569.getClass(), "nullCount", 0);
        setIntField(term164569, term164569.getClass(), "unknownCount", 0);
        setBooleanField(term164569, term164569.getClass(), "inExterns", false);
        setIntField(term164569, term164569.getClass(), "noTypeCheckSection", 0);
        setField(term164569, term164569.getClass(), "editDistance", null);
        term164570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term164571 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setIntField(term164570, term164570.getClass(), "type", 148);
        setField(term164570, term164570.getClass(), "next", null);
        setField(term164570, term164570.getClass(), "first", null);
        setField(term164570, term164570.getClass(), "last", null);
        setField(term164570, term164570.getClass(), "propListHead", null);
        setIntField(term164570, term164570.getClass(), "sourcePosition", 0);
        setField(term164571, term164571.getClass(), "className", null);
        setField(term164571, term164571.getClass(), "properties", null);
        setBooleanField(term164571, term164571.getClass(), "nativeType", false);
        setField(term164571, term164571.getClass(), "implicitPrototypeFallback", null);
        setField(term164571, term164571.getClass(), "ownerFunction", null);
        setBooleanField(term164571, term164571.getClass(), "prettyPrint", false);
        setBooleanField(term164571, term164571.getClass(), "visited", false);
        setField(term164571, term164571.getClass(), "docInfo", null);
        setBooleanField(term164571, term164571.getClass(), "unknown", false);
        setBooleanField(term164571, term164571.getClass(), "resolved", false);
        setField(term164571, term164571.getClass(), "resolveResult", null);
        setField(term164571, term164571.getClass(), "templateTypeMap", null);
        setBooleanField(term164571, term164571.getClass(), "inTemplatedCheckVisit", false);
        setField(term164571, term164571.getClass(), "registry", null);
        setField(term164570, term164570.getClass(), "jsType", term164571);
        setField(term164570, term164570.getClass(), "parent", null);
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
        args[1] = term164412;
        args[2] = null;
        callMethod(klass, "visit", argTypes, term164342, args);
        assertTrue(recursiveEquals(term164342, term164569));
        assertTrue(recursiveEquals(term164412, null));
    }

};


