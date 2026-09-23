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

public class JSType_isSubtype_437021077561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155845;
     Object term155939;
     Object term156413;
     Object term156415;

    public JSType_isSubtype_437021077561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155845 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        term155939 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term156027 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setBooleanField(term156027, term156027.getClass(), "unknown", false);
        setField(term155939, term155939.getClass(), "referencedType", term156027);
        term156413 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term156414 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term156413, term156413.getClass(), "reference", null);
        setField(term156413, term156413.getClass(), "sourceName", null);
        setIntField(term156413, term156413.getClass(), "lineno", 0);
        setIntField(term156413, term156413.getClass(), "charno", 0);
        setBooleanField(term156413, term156413.getClass(), "forgiving", false);
        setField(term156414, term156414.getClass(), "leastSupertypeVisitor", null);
        setField(term156414, term156414.getClass(), "greatestSubtypeVisitor", null);
        setField(term156414, term156414.getClass(), "call", null);
        setField(term156414, term156414.getClass(), "prototype", null);
        setField(term156414, term156414.getClass(), "kind", null);
        setField(term156414, term156414.getClass(), "typeOfThis", null);
        setField(term156414, term156414.getClass(), "source", null);
        setField(term156414, term156414.getClass(), "implementedInterfaces", null);
        setField(term156414, term156414.getClass(), "subTypes", null);
        setField(term156414, term156414.getClass(), "templateTypeName", null);
        setField(term156414, term156414.getClass(), "className", null);
        setField(term156414, term156414.getClass(), "properties", null);
        setField(term156414, term156414.getClass(), "implicitPrototype", null);
        setBooleanField(term156414, term156414.getClass(), "nativeType", false);
        setBooleanField(term156414, term156414.getClass(), "prettyPrint", false);
        setBooleanField(term156414, term156414.getClass(), "visited", false);
        setField(term156414, term156414.getClass(), "docInfo", null);
        setBooleanField(term156414, term156414.getClass(), "unknown", false);
        setBooleanField(term156414, term156414.getClass(), "resolved", false);
        setField(term156414, term156414.getClass(), "resolveResult", null);
        setField(term156414, term156414.getClass(), "registry", null);
        setField(term156413, term156413.getClass(), "referencedType", term156414);
        setBooleanField(term156413, term156413.getClass(), "visited", false);
        setField(term156413, term156413.getClass(), "docInfo", null);
        setBooleanField(term156413, term156413.getClass(), "unknown", false);
        setBooleanField(term156413, term156413.getClass(), "resolved", false);
        setField(term156413, term156413.getClass(), "resolveResult", null);
        setField(term156413, term156413.getClass(), "registry", null);
        term156415 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term156415, term156415.getClass(), "typeExpr", null);
        setField(term156415, term156415.getClass(), "sourceName", null);
        setBooleanField(term156415, term156415.getClass(), "forgiving", false);
        setBooleanField(term156415, term156415.getClass(), "isChecked", false);
        setBooleanField(term156415, term156415.getClass(), "visited", false);
        setField(term156415, term156415.getClass(), "docInfo", null);
        setBooleanField(term156415, term156415.getClass(), "unknown", false);
        setBooleanField(term156415, term156415.getClass(), "resolved", false);
        setField(term156415, term156415.getClass(), "resolveResult", null);
        setField(term156415, term156415.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term155845;
        args[1] = term155939;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term155845, term156413));
        assertTrue(recursiveEquals(term155939, term156415));
        assertTrue(recursiveEquals(retValue, true));
    }

};


