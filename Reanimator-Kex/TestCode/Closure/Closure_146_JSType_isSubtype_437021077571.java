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

public class JSType_isSubtype_437021077571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158419;
     Object term158513;
     Object term158671;
     Object term158673;

    public JSType_isSubtype_437021077571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158419 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term158513 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term158621 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term158513, term158513.getClass(), "referencedType", term158621);
        term158671 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term158672 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term158671, term158671.getClass(), "reference", null);
        setField(term158671, term158671.getClass(), "sourceName", null);
        setIntField(term158671, term158671.getClass(), "lineno", 0);
        setIntField(term158671, term158671.getClass(), "charno", 0);
        setBooleanField(term158671, term158671.getClass(), "forgiving", false);
        setField(term158672, term158672.getClass(), "this$0", null);
        setField(term158672, term158672.getClass(), "call", null);
        setField(term158672, term158672.getClass(), "prototype", null);
        setField(term158672, term158672.getClass(), "kind", null);
        setField(term158672, term158672.getClass(), "typeOfThis", null);
        setField(term158672, term158672.getClass(), "source", null);
        setField(term158672, term158672.getClass(), "implementedInterfaces", null);
        setField(term158672, term158672.getClass(), "subTypes", null);
        setField(term158672, term158672.getClass(), "templateTypeName", null);
        setField(term158672, term158672.getClass(), "className", null);
        setField(term158672, term158672.getClass(), "properties", null);
        setField(term158672, term158672.getClass(), "implicitPrototype", null);
        setBooleanField(term158672, term158672.getClass(), "nativeType", false);
        setBooleanField(term158672, term158672.getClass(), "prettyPrint", false);
        setBooleanField(term158672, term158672.getClass(), "visited", false);
        setField(term158672, term158672.getClass(), "docInfo", null);
        setBooleanField(term158672, term158672.getClass(), "unknown", false);
        setBooleanField(term158672, term158672.getClass(), "resolved", false);
        setField(term158672, term158672.getClass(), "resolveResult", null);
        setField(term158672, term158672.getClass(), "registry", null);
        setField(term158671, term158671.getClass(), "referencedType", term158672);
        setBooleanField(term158671, term158671.getClass(), "visited", false);
        setField(term158671, term158671.getClass(), "docInfo", null);
        setBooleanField(term158671, term158671.getClass(), "unknown", false);
        setBooleanField(term158671, term158671.getClass(), "resolved", false);
        setField(term158671, term158671.getClass(), "resolveResult", null);
        setField(term158671, term158671.getClass(), "registry", null);
        term158673 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term158673, term158673.getClass(), "resolved", false);
        setField(term158673, term158673.getClass(), "resolveResult", null);
        setField(term158673, term158673.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term158419;
        args[1] = term158513;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term158419, term158671));
        assertTrue(recursiveEquals(term158513, term158673));
        assertTrue(recursiveEquals(retValue, false));
    }

};


