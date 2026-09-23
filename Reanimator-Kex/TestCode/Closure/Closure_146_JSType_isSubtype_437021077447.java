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

public class JSType_isSubtype_437021077447 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114338;
     Object term114432;
     Object term114598;
     Object term114600;

    public JSType_isSubtype_437021077447() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114338 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        term114432 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term114540 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setBooleanField(term114540, term114540.getClass(), "unknown", false);
        setField(term114432, term114432.getClass(), "referencedType", term114540);
        term114598 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term114599 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term114598, term114598.getClass(), "reference", null);
        setField(term114598, term114598.getClass(), "sourceName", null);
        setIntField(term114598, term114598.getClass(), "lineno", 0);
        setIntField(term114598, term114598.getClass(), "charno", 0);
        setBooleanField(term114598, term114598.getClass(), "forgiving", false);
        setField(term114599, term114599.getClass(), "this$0", null);
        setField(term114599, term114599.getClass(), "call", null);
        setField(term114599, term114599.getClass(), "prototype", null);
        setField(term114599, term114599.getClass(), "kind", null);
        setField(term114599, term114599.getClass(), "typeOfThis", null);
        setField(term114599, term114599.getClass(), "source", null);
        setField(term114599, term114599.getClass(), "implementedInterfaces", null);
        setField(term114599, term114599.getClass(), "subTypes", null);
        setField(term114599, term114599.getClass(), "templateTypeName", null);
        setField(term114599, term114599.getClass(), "className", null);
        setField(term114599, term114599.getClass(), "properties", null);
        setField(term114599, term114599.getClass(), "implicitPrototype", null);
        setBooleanField(term114599, term114599.getClass(), "nativeType", false);
        setBooleanField(term114599, term114599.getClass(), "prettyPrint", false);
        setBooleanField(term114599, term114599.getClass(), "visited", false);
        setField(term114599, term114599.getClass(), "docInfo", null);
        setBooleanField(term114599, term114599.getClass(), "unknown", false);
        setBooleanField(term114599, term114599.getClass(), "resolved", false);
        setField(term114599, term114599.getClass(), "resolveResult", null);
        setField(term114599, term114599.getClass(), "registry", null);
        setField(term114598, term114598.getClass(), "referencedType", term114599);
        setBooleanField(term114598, term114598.getClass(), "visited", false);
        setField(term114598, term114598.getClass(), "docInfo", null);
        setBooleanField(term114598, term114598.getClass(), "unknown", false);
        setBooleanField(term114598, term114598.getClass(), "resolved", false);
        setField(term114598, term114598.getClass(), "resolveResult", null);
        setField(term114598, term114598.getClass(), "registry", null);
        term114600 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setBooleanField(term114600, term114600.getClass(), "resolved", false);
        setField(term114600, term114600.getClass(), "resolveResult", null);
        setField(term114600, term114600.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term114338;
        args[1] = term114432;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term114338, term114598));
        assertTrue(recursiveEquals(term114432, term114600));
        assertTrue(recursiveEquals(retValue, false));
    }

};


