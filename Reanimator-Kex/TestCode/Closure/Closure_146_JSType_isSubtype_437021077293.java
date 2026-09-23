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

public class JSType_isSubtype_437021077293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55822;
     Object term55916;
     Object term56047;
     Object term56049;

    public JSType_isSubtype_437021077293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55822 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        term55916 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term56004 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term56004, term56004.getClass(), "unknown", false);
        setField(term55916, term55916.getClass(), "referencedType", term56004);
        term56047 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term56048 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term56047, term56047.getClass(), "reference", null);
        setField(term56047, term56047.getClass(), "sourceName", null);
        setIntField(term56047, term56047.getClass(), "lineno", 0);
        setIntField(term56047, term56047.getClass(), "charno", 0);
        setBooleanField(term56047, term56047.getClass(), "forgiving", false);
        setField(term56048, term56048.getClass(), "leastSupertypeVisitor", null);
        setField(term56048, term56048.getClass(), "greatestSubtypeVisitor", null);
        setField(term56048, term56048.getClass(), "call", null);
        setField(term56048, term56048.getClass(), "prototype", null);
        setField(term56048, term56048.getClass(), "kind", null);
        setField(term56048, term56048.getClass(), "typeOfThis", null);
        setField(term56048, term56048.getClass(), "source", null);
        setField(term56048, term56048.getClass(), "implementedInterfaces", null);
        setField(term56048, term56048.getClass(), "subTypes", null);
        setField(term56048, term56048.getClass(), "templateTypeName", null);
        setField(term56048, term56048.getClass(), "className", null);
        setField(term56048, term56048.getClass(), "properties", null);
        setField(term56048, term56048.getClass(), "implicitPrototype", null);
        setBooleanField(term56048, term56048.getClass(), "nativeType", false);
        setBooleanField(term56048, term56048.getClass(), "prettyPrint", false);
        setBooleanField(term56048, term56048.getClass(), "visited", false);
        setField(term56048, term56048.getClass(), "docInfo", null);
        setBooleanField(term56048, term56048.getClass(), "unknown", false);
        setBooleanField(term56048, term56048.getClass(), "resolved", false);
        setField(term56048, term56048.getClass(), "resolveResult", null);
        setField(term56048, term56048.getClass(), "registry", null);
        setField(term56047, term56047.getClass(), "referencedType", term56048);
        setBooleanField(term56047, term56047.getClass(), "visited", false);
        setField(term56047, term56047.getClass(), "docInfo", null);
        setBooleanField(term56047, term56047.getClass(), "unknown", false);
        setBooleanField(term56047, term56047.getClass(), "resolved", false);
        setField(term56047, term56047.getClass(), "resolveResult", null);
        setField(term56047, term56047.getClass(), "registry", null);
        term56049 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term56049, term56049.getClass(), "parameters", null);
        setField(term56049, term56049.getClass(), "returnType", null);
        setBooleanField(term56049, term56049.getClass(), "returnTypeInferred", false);
        setBooleanField(term56049, term56049.getClass(), "resolved", false);
        setField(term56049, term56049.getClass(), "resolveResult", null);
        setField(term56049, term56049.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term55822;
        args[1] = term55916;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term55822, term56047));
        assertTrue(recursiveEquals(term55916, term56049));
        assertTrue(recursiveEquals(retValue, false));
    }

};


