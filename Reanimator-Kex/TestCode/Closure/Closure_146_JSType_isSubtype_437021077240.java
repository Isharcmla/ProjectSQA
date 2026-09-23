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

public class JSType_isSubtype_437021077240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40470;
     Object term40570;
     Object term42323;
     Object term42324;

    public JSType_isSubtype_437021077240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40470 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        term40570 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term40570, term40570.getClass(), "unknown", false);
        term42323 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term42323, term42323.getClass(), "call", null);
        setField(term42323, term42323.getClass(), "prototype", null);
        setField(term42323, term42323.getClass(), "kind", null);
        setField(term42323, term42323.getClass(), "typeOfThis", null);
        setField(term42323, term42323.getClass(), "source", null);
        setField(term42323, term42323.getClass(), "implementedInterfaces", null);
        setField(term42323, term42323.getClass(), "subTypes", null);
        setField(term42323, term42323.getClass(), "templateTypeName", null);
        setField(term42323, term42323.getClass(), "className", null);
        setField(term42323, term42323.getClass(), "properties", null);
        setField(term42323, term42323.getClass(), "implicitPrototype", null);
        setBooleanField(term42323, term42323.getClass(), "nativeType", false);
        setBooleanField(term42323, term42323.getClass(), "prettyPrint", false);
        setBooleanField(term42323, term42323.getClass(), "visited", false);
        setField(term42323, term42323.getClass(), "docInfo", null);
        setBooleanField(term42323, term42323.getClass(), "unknown", false);
        setBooleanField(term42323, term42323.getClass(), "resolved", false);
        setField(term42323, term42323.getClass(), "resolveResult", null);
        setField(term42323, term42323.getClass(), "registry", null);
        term42324 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term42324, term42324.getClass(), "typeExpr", null);
        setField(term42324, term42324.getClass(), "sourceName", null);
        setBooleanField(term42324, term42324.getClass(), "forgiving", false);
        setBooleanField(term42324, term42324.getClass(), "isChecked", false);
        setBooleanField(term42324, term42324.getClass(), "visited", false);
        setField(term42324, term42324.getClass(), "docInfo", null);
        setBooleanField(term42324, term42324.getClass(), "unknown", false);
        setBooleanField(term42324, term42324.getClass(), "resolved", false);
        setField(term42324, term42324.getClass(), "resolveResult", null);
        setField(term42324, term42324.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term40470;
        args[1] = term40570;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term40470, term42323));
        assertTrue(recursiveEquals(term40570, term42324));
        assertTrue(recursiveEquals(retValue, false));
    }

};


