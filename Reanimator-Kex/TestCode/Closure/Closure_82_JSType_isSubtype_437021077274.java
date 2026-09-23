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

public class JSType_isSubtype_437021077274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49092;
     Object term49210;
     Object term49579;
     Object term49580;

    public JSType_isSubtype_437021077274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49092 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        term49210 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setBooleanField(term49210, term49210.getClass(), "unknown", false);
        term49579 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term49579, term49579.getClass(), "ownerFunction", null);
        setField(term49579, term49579.getClass(), "className", null);
        setField(term49579, term49579.getClass(), "properties", null);
        setBooleanField(term49579, term49579.getClass(), "nativeType", false);
        setField(term49579, term49579.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term49579, term49579.getClass(), "prettyPrint", false);
        setBooleanField(term49579, term49579.getClass(), "visited", false);
        setField(term49579, term49579.getClass(), "docInfo", null);
        setBooleanField(term49579, term49579.getClass(), "unknown", false);
        setBooleanField(term49579, term49579.getClass(), "resolved", false);
        setField(term49579, term49579.getClass(), "resolveResult", null);
        setField(term49579, term49579.getClass(), "registry", null);
        term49580 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term49580, term49580.getClass(), "ownerFunction", null);
        setField(term49580, term49580.getClass(), "className", null);
        setField(term49580, term49580.getClass(), "properties", null);
        setBooleanField(term49580, term49580.getClass(), "nativeType", false);
        setField(term49580, term49580.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term49580, term49580.getClass(), "prettyPrint", false);
        setBooleanField(term49580, term49580.getClass(), "visited", false);
        setField(term49580, term49580.getClass(), "docInfo", null);
        setBooleanField(term49580, term49580.getClass(), "unknown", false);
        setBooleanField(term49580, term49580.getClass(), "resolved", false);
        setField(term49580, term49580.getClass(), "resolveResult", null);
        setField(term49580, term49580.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term49092;
        args[1] = term49210;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term49092, term49579));
        assertTrue(recursiveEquals(term49210, term49580));
        assertTrue(recursiveEquals(retValue, false));
    }

};


