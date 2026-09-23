package com.google.javascript.rhino.jstype;

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
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.rhino.jstype.EqualityUtils.*;
import java.lang.Object;

public class JSType_isSubtype_437021077609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171664;
     Object term171758;
     Object term171916;
     Object term171918;

    public JSType_isSubtype_437021077609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171664 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term171758 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term171866 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term171758, term171758.getClass(), "referencedType", term171866);
        term171916 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term171917 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term171916, term171916.getClass(), "reference", null);
        setField(term171916, term171916.getClass(), "sourceName", null);
        setIntField(term171916, term171916.getClass(), "lineno", 0);
        setIntField(term171916, term171916.getClass(), "charno", 0);
        setBooleanField(term171916, term171916.getClass(), "forgiving", false);
        setField(term171917, term171917.getClass(), "this$0", null);
        setField(term171917, term171917.getClass(), "call", null);
        setField(term171917, term171917.getClass(), "prototype", null);
        setField(term171917, term171917.getClass(), "kind", null);
        setField(term171917, term171917.getClass(), "typeOfThis", null);
        setField(term171917, term171917.getClass(), "source", null);
        setField(term171917, term171917.getClass(), "implementedInterfaces", null);
        setField(term171917, term171917.getClass(), "subTypes", null);
        setField(term171917, term171917.getClass(), "templateTypeName", null);
        setField(term171917, term171917.getClass(), "className", null);
        setField(term171917, term171917.getClass(), "properties", null);
        setField(term171917, term171917.getClass(), "implicitPrototype", null);
        setBooleanField(term171917, term171917.getClass(), "nativeType", false);
        setBooleanField(term171917, term171917.getClass(), "prettyPrint", false);
        setBooleanField(term171917, term171917.getClass(), "visited", false);
        setField(term171917, term171917.getClass(), "docInfo", null);
        setBooleanField(term171917, term171917.getClass(), "unknown", false);
        setBooleanField(term171917, term171917.getClass(), "resolved", false);
        setField(term171917, term171917.getClass(), "resolveResult", null);
        setField(term171917, term171917.getClass(), "registry", null);
        setField(term171916, term171916.getClass(), "referencedType", term171917);
        setBooleanField(term171916, term171916.getClass(), "visited", false);
        setField(term171916, term171916.getClass(), "docInfo", null);
        setBooleanField(term171916, term171916.getClass(), "unknown", false);
        setBooleanField(term171916, term171916.getClass(), "resolved", false);
        setField(term171916, term171916.getClass(), "resolveResult", null);
        setField(term171916, term171916.getClass(), "registry", null);
        term171918 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term171918, term171918.getClass(), "resolved", false);
        setField(term171918, term171918.getClass(), "resolveResult", null);
        setField(term171918, term171918.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term171664;
        args[1] = term171758;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term171664, term171916));
        assertTrue(recursiveEquals(term171758, term171918));
        assertTrue(recursiveEquals(retValue, false));
    }

};


