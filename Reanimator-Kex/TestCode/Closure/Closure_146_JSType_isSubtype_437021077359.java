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

public class JSType_isSubtype_437021077359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76962;
     Object term77186;
     Object term77223;
     Object term77224;

    public JSType_isSubtype_437021077359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76962 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term77086 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term76962, term76962.getClass(), "referencedType", term77086);
        term77186 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term77186, term77186.getClass(), "unknown", false);
        term77223 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term77223, term77223.getClass(), "call", null);
        setField(term77223, term77223.getClass(), "prototype", null);
        setField(term77223, term77223.getClass(), "kind", null);
        setField(term77223, term77223.getClass(), "typeOfThis", null);
        setField(term77223, term77223.getClass(), "source", null);
        setField(term77223, term77223.getClass(), "implementedInterfaces", null);
        setField(term77223, term77223.getClass(), "subTypes", null);
        setField(term77223, term77223.getClass(), "templateTypeName", null);
        setField(term77223, term77223.getClass(), "className", null);
        setField(term77223, term77223.getClass(), "properties", null);
        setField(term77223, term77223.getClass(), "implicitPrototype", null);
        setBooleanField(term77223, term77223.getClass(), "nativeType", false);
        setBooleanField(term77223, term77223.getClass(), "prettyPrint", false);
        setBooleanField(term77223, term77223.getClass(), "visited", false);
        setField(term77223, term77223.getClass(), "docInfo", null);
        setBooleanField(term77223, term77223.getClass(), "unknown", false);
        setBooleanField(term77223, term77223.getClass(), "resolved", false);
        setField(term77223, term77223.getClass(), "resolveResult", null);
        setField(term77223, term77223.getClass(), "registry", null);
        term77224 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term77225 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term77224, term77224.getClass(), "parameterType", null);
        setField(term77225, term77225.getClass(), "typeExpr", null);
        setField(term77225, term77225.getClass(), "sourceName", null);
        setBooleanField(term77225, term77225.getClass(), "forgiving", false);
        setBooleanField(term77225, term77225.getClass(), "isChecked", false);
        setBooleanField(term77225, term77225.getClass(), "visited", false);
        setField(term77225, term77225.getClass(), "docInfo", null);
        setBooleanField(term77225, term77225.getClass(), "unknown", false);
        setBooleanField(term77225, term77225.getClass(), "resolved", false);
        setField(term77225, term77225.getClass(), "resolveResult", null);
        setField(term77225, term77225.getClass(), "registry", null);
        setField(term77224, term77224.getClass(), "referencedType", term77225);
        setBooleanField(term77224, term77224.getClass(), "visited", false);
        setField(term77224, term77224.getClass(), "docInfo", null);
        setBooleanField(term77224, term77224.getClass(), "unknown", false);
        setBooleanField(term77224, term77224.getClass(), "resolved", false);
        setField(term77224, term77224.getClass(), "resolveResult", null);
        setField(term77224, term77224.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term76962;
        args[1] = term77186;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term76962, term77223));
        assertTrue(recursiveEquals(term77186, term77224));
        assertTrue(recursiveEquals(retValue, false));
    }

};


