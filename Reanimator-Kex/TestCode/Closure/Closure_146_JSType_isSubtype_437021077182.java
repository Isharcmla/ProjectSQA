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

public class JSType_isSubtype_437021077182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23876;
     Object term23974;
     Object term24368;
     Object term24369;

    public JSType_isSubtype_437021077182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23876 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        term23974 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        term24368 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setBooleanField(term24368, term24368.getClass(), "resolved", false);
        setField(term24368, term24368.getClass(), "resolveResult", null);
        setField(term24368, term24368.getClass(), "registry", null);
        term24369 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term24369, term24369.getClass(), "className", null);
        setField(term24369, term24369.getClass(), "properties", null);
        setField(term24369, term24369.getClass(), "implicitPrototype", null);
        setBooleanField(term24369, term24369.getClass(), "nativeType", false);
        setBooleanField(term24369, term24369.getClass(), "prettyPrint", false);
        setBooleanField(term24369, term24369.getClass(), "visited", false);
        setField(term24369, term24369.getClass(), "docInfo", null);
        setBooleanField(term24369, term24369.getClass(), "unknown", false);
        setBooleanField(term24369, term24369.getClass(), "resolved", false);
        setField(term24369, term24369.getClass(), "resolveResult", null);
        setField(term24369, term24369.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term23876;
        args[1] = term23974;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term23876, term24368));
        assertTrue(recursiveEquals(term23974, term24369));
        assertTrue(recursiveEquals(retValue, false));
    }

};


