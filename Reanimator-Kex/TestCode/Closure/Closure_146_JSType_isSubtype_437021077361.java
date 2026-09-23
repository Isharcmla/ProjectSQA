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

public class JSType_isSubtype_437021077361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77410;
     Object term77504;
     Object term77673;
     Object term77675;

    public JSType_isSubtype_437021077361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77410 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        term77504 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term77610 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setBooleanField(term77610, term77610.getClass(), "unknown", false);
        setField(term77504, term77504.getClass(), "referencedType", term77610);
        term77673 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term77674 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term77673, term77673.getClass(), "reference", null);
        setField(term77673, term77673.getClass(), "sourceName", null);
        setIntField(term77673, term77673.getClass(), "lineno", 0);
        setIntField(term77673, term77673.getClass(), "charno", 0);
        setBooleanField(term77673, term77673.getClass(), "forgiving", false);
        setField(term77674, term77674.getClass(), "primitiveType", null);
        setField(term77674, term77674.getClass(), "primitiveObjectType", null);
        setField(term77674, term77674.getClass(), "name", null);
        setBooleanField(term77674, term77674.getClass(), "visited", false);
        setField(term77674, term77674.getClass(), "docInfo", null);
        setBooleanField(term77674, term77674.getClass(), "unknown", false);
        setBooleanField(term77674, term77674.getClass(), "resolved", false);
        setField(term77674, term77674.getClass(), "resolveResult", null);
        setField(term77674, term77674.getClass(), "registry", null);
        setField(term77673, term77673.getClass(), "referencedType", term77674);
        setBooleanField(term77673, term77673.getClass(), "visited", false);
        setField(term77673, term77673.getClass(), "docInfo", null);
        setBooleanField(term77673, term77673.getClass(), "unknown", false);
        setBooleanField(term77673, term77673.getClass(), "resolved", false);
        setField(term77673, term77673.getClass(), "resolveResult", null);
        setField(term77673, term77673.getClass(), "registry", null);
        term77675 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term77675, term77675.getClass(), "typeExpr", null);
        setField(term77675, term77675.getClass(), "sourceName", null);
        setBooleanField(term77675, term77675.getClass(), "forgiving", false);
        setBooleanField(term77675, term77675.getClass(), "isChecked", false);
        setBooleanField(term77675, term77675.getClass(), "visited", false);
        setField(term77675, term77675.getClass(), "docInfo", null);
        setBooleanField(term77675, term77675.getClass(), "unknown", false);
        setBooleanField(term77675, term77675.getClass(), "resolved", false);
        setField(term77675, term77675.getClass(), "resolveResult", null);
        setField(term77675, term77675.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term77410;
        args[1] = term77504;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term77410, term77673));
        assertTrue(recursiveEquals(term77504, term77675));
        assertTrue(recursiveEquals(retValue, true));
    }

};


