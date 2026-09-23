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

public class JSType_isSubtype_437021077379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90647;
     Object term90829;
     Object term90981;
     Object term90983;

    public JSType_isSubtype_437021077379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90647 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term90735 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term90647, term90647.getClass(), "referencedType", term90735);
        term90829 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term90917 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term90917, term90917.getClass(), "unknown", false);
        setField(term90829, term90829.getClass(), "referencedType", term90917);
        term90981 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term90982 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term90981, term90981.getClass(), "reference", null);
        setField(term90981, term90981.getClass(), "sourceName", null);
        setIntField(term90981, term90981.getClass(), "lineno", 0);
        setIntField(term90981, term90981.getClass(), "charno", 0);
        setBooleanField(term90981, term90981.getClass(), "forgiving", false);
        setField(term90982, term90982.getClass(), "leastSupertypeVisitor", null);
        setField(term90982, term90982.getClass(), "greatestSubtypeVisitor", null);
        setField(term90982, term90982.getClass(), "call", null);
        setField(term90982, term90982.getClass(), "prototype", null);
        setField(term90982, term90982.getClass(), "kind", null);
        setField(term90982, term90982.getClass(), "typeOfThis", null);
        setField(term90982, term90982.getClass(), "source", null);
        setField(term90982, term90982.getClass(), "implementedInterfaces", null);
        setField(term90982, term90982.getClass(), "subTypes", null);
        setField(term90982, term90982.getClass(), "templateTypeName", null);
        setField(term90982, term90982.getClass(), "className", null);
        setField(term90982, term90982.getClass(), "properties", null);
        setField(term90982, term90982.getClass(), "implicitPrototype", null);
        setBooleanField(term90982, term90982.getClass(), "nativeType", false);
        setBooleanField(term90982, term90982.getClass(), "prettyPrint", false);
        setBooleanField(term90982, term90982.getClass(), "visited", false);
        setField(term90982, term90982.getClass(), "docInfo", null);
        setBooleanField(term90982, term90982.getClass(), "unknown", false);
        setBooleanField(term90982, term90982.getClass(), "resolved", false);
        setField(term90982, term90982.getClass(), "resolveResult", null);
        setField(term90982, term90982.getClass(), "registry", null);
        setField(term90981, term90981.getClass(), "referencedType", term90982);
        setBooleanField(term90981, term90981.getClass(), "visited", false);
        setField(term90981, term90981.getClass(), "docInfo", null);
        setBooleanField(term90981, term90981.getClass(), "unknown", false);
        setBooleanField(term90981, term90981.getClass(), "resolved", false);
        setField(term90981, term90981.getClass(), "resolveResult", null);
        setField(term90981, term90981.getClass(), "registry", null);
        term90983 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ParameterizedType"));
        Object term90984 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term90983, term90983.getClass(), "parameterType", null);
        setField(term90984, term90984.getClass(), "leastSupertypeVisitor", null);
        setField(term90984, term90984.getClass(), "greatestSubtypeVisitor", null);
        setField(term90984, term90984.getClass(), "call", null);
        setField(term90984, term90984.getClass(), "prototype", null);
        setField(term90984, term90984.getClass(), "kind", null);
        setField(term90984, term90984.getClass(), "typeOfThis", null);
        setField(term90984, term90984.getClass(), "source", null);
        setField(term90984, term90984.getClass(), "implementedInterfaces", null);
        setField(term90984, term90984.getClass(), "subTypes", null);
        setField(term90984, term90984.getClass(), "templateTypeName", null);
        setField(term90984, term90984.getClass(), "className", null);
        setField(term90984, term90984.getClass(), "properties", null);
        setField(term90984, term90984.getClass(), "implicitPrototype", null);
        setBooleanField(term90984, term90984.getClass(), "nativeType", false);
        setBooleanField(term90984, term90984.getClass(), "prettyPrint", false);
        setBooleanField(term90984, term90984.getClass(), "visited", false);
        setField(term90984, term90984.getClass(), "docInfo", null);
        setBooleanField(term90984, term90984.getClass(), "unknown", false);
        setBooleanField(term90984, term90984.getClass(), "resolved", false);
        setField(term90984, term90984.getClass(), "resolveResult", null);
        setField(term90984, term90984.getClass(), "registry", null);
        setField(term90983, term90983.getClass(), "referencedType", term90984);
        setBooleanField(term90983, term90983.getClass(), "visited", false);
        setField(term90983, term90983.getClass(), "docInfo", null);
        setBooleanField(term90983, term90983.getClass(), "unknown", false);
        setBooleanField(term90983, term90983.getClass(), "resolved", false);
        setField(term90983, term90983.getClass(), "resolveResult", null);
        setField(term90983, term90983.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term90647;
        args[1] = term90829;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term90647, term90981));
        assertTrue(recursiveEquals(term90829, term90983));
        assertTrue(recursiveEquals(retValue, true));
    }

};


