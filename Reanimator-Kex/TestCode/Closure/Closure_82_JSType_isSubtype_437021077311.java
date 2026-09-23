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

public class JSType_isSubtype_437021077311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61128;
     Object term61143;
     Object term61144;

    public JSType_isSubtype_437021077311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61128 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setBooleanField(term61128, term61128.getClass(), "unknown", false);
        term61143 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term61143, term61143.getClass(), "ownerFunction", null);
        setField(term61143, term61143.getClass(), "className", null);
        setField(term61143, term61143.getClass(), "properties", null);
        setBooleanField(term61143, term61143.getClass(), "nativeType", false);
        setField(term61143, term61143.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term61143, term61143.getClass(), "prettyPrint", false);
        setBooleanField(term61143, term61143.getClass(), "visited", false);
        setField(term61143, term61143.getClass(), "docInfo", null);
        setBooleanField(term61143, term61143.getClass(), "unknown", false);
        setBooleanField(term61143, term61143.getClass(), "resolved", false);
        setField(term61143, term61143.getClass(), "resolveResult", null);
        setField(term61143, term61143.getClass(), "registry", null);
        term61144 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term61144, term61144.getClass(), "ownerFunction", null);
        setField(term61144, term61144.getClass(), "className", null);
        setField(term61144, term61144.getClass(), "properties", null);
        setBooleanField(term61144, term61144.getClass(), "nativeType", false);
        setField(term61144, term61144.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term61144, term61144.getClass(), "prettyPrint", false);
        setBooleanField(term61144, term61144.getClass(), "visited", false);
        setField(term61144, term61144.getClass(), "docInfo", null);
        setBooleanField(term61144, term61144.getClass(), "unknown", false);
        setBooleanField(term61144, term61144.getClass(), "resolved", false);
        setField(term61144, term61144.getClass(), "resolveResult", null);
        setField(term61144, term61144.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term61128;
        args[1] = term61128;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term61128, term61143));
        assertTrue(recursiveEquals(term61128, term61144));
        assertTrue(recursiveEquals(retValue, true));
    }

};


