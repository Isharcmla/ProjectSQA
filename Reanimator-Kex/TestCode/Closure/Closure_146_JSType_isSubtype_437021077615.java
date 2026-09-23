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

public class JSType_isSubtype_437021077615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173405;
     Object term173346;
     Object term173983;
     Object term173985;

    public JSType_isSubtype_437021077615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173405 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setBooleanField(term173405, term173405.getClass(), "unknown", false);
        term173346 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term173346, term173346.getClass(), "referencedType", term173405);
        term173983 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term173984 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term173983, term173983.getClass(), "reference", null);
        setField(term173983, term173983.getClass(), "sourceName", null);
        setIntField(term173983, term173983.getClass(), "lineno", 0);
        setIntField(term173983, term173983.getClass(), "charno", 0);
        setBooleanField(term173983, term173983.getClass(), "forgiving", false);
        setField(term173984, term173984.getClass(), "ownerFunction", null);
        setField(term173984, term173984.getClass(), "className", null);
        setField(term173984, term173984.getClass(), "properties", null);
        setField(term173984, term173984.getClass(), "implicitPrototype", null);
        setBooleanField(term173984, term173984.getClass(), "nativeType", false);
        setBooleanField(term173984, term173984.getClass(), "prettyPrint", false);
        setBooleanField(term173984, term173984.getClass(), "visited", false);
        setField(term173984, term173984.getClass(), "docInfo", null);
        setBooleanField(term173984, term173984.getClass(), "unknown", false);
        setBooleanField(term173984, term173984.getClass(), "resolved", false);
        setField(term173984, term173984.getClass(), "resolveResult", null);
        setField(term173984, term173984.getClass(), "registry", null);
        setField(term173983, term173983.getClass(), "referencedType", term173984);
        setBooleanField(term173983, term173983.getClass(), "visited", false);
        setField(term173983, term173983.getClass(), "docInfo", null);
        setBooleanField(term173983, term173983.getClass(), "unknown", false);
        setBooleanField(term173983, term173983.getClass(), "resolved", false);
        setField(term173983, term173983.getClass(), "resolveResult", null);
        setField(term173983, term173983.getClass(), "registry", null);
        term173985 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term173985, term173985.getClass(), "ownerFunction", null);
        setField(term173985, term173985.getClass(), "className", null);
        setField(term173985, term173985.getClass(), "properties", null);
        setField(term173985, term173985.getClass(), "implicitPrototype", null);
        setBooleanField(term173985, term173985.getClass(), "nativeType", false);
        setBooleanField(term173985, term173985.getClass(), "prettyPrint", false);
        setBooleanField(term173985, term173985.getClass(), "visited", false);
        setField(term173985, term173985.getClass(), "docInfo", null);
        setBooleanField(term173985, term173985.getClass(), "unknown", false);
        setBooleanField(term173985, term173985.getClass(), "resolved", false);
        setField(term173985, term173985.getClass(), "resolveResult", null);
        setField(term173985, term173985.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term173405;
        args[1] = term173346;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term173405, term173983));
        assertTrue(recursiveEquals(term173346, term173985));
        assertTrue(recursiveEquals(retValue, true));
    }

};


