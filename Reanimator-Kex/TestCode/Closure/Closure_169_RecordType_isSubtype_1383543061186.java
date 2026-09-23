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

public class RecordType_isSubtype_1383543061186 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80854;
     Object term80962;
     Object term81137;
     Object term81138;

    public RecordType_isSubtype_1383543061186() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80854 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term80962 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term81086 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setBooleanField(term80962, term80962.getClass(), "unknown", true);
        setField(term80962, term80962.getClass(), "implicitPrototypeFallback", term81086);
        term81137 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term81137, term81137.getClass(), "properties", null);
        setBooleanField(term81137, term81137.getClass(), "declared", false);
        setBooleanField(term81137, term81137.getClass(), "isFrozen", false);
        setField(term81137, term81137.getClass(), "className", null);
        setField(term81137, term81137.getClass(), "properties", null);
        setBooleanField(term81137, term81137.getClass(), "nativeType", false);
        setField(term81137, term81137.getClass(), "implicitPrototypeFallback", null);
        setField(term81137, term81137.getClass(), "ownerFunction", null);
        setBooleanField(term81137, term81137.getClass(), "prettyPrint", false);
        setBooleanField(term81137, term81137.getClass(), "visited", false);
        setField(term81137, term81137.getClass(), "docInfo", null);
        setBooleanField(term81137, term81137.getClass(), "unknown", false);
        setBooleanField(term81137, term81137.getClass(), "resolved", false);
        setField(term81137, term81137.getClass(), "resolveResult", null);
        setBooleanField(term81137, term81137.getClass(), "inTemplatedCheckVisit", false);
        setField(term81137, term81137.getClass(), "registry", null);
        term81138 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term81139 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term81138, term81138.getClass(), "this$0", null);
        setField(term81138, term81138.getClass(), "call", null);
        setField(term81138, term81138.getClass(), "prototypeSlot", null);
        setField(term81138, term81138.getClass(), "kind", null);
        setField(term81138, term81138.getClass(), "propAccess", null);
        setField(term81138, term81138.getClass(), "typeOfThis", null);
        setField(term81138, term81138.getClass(), "source", null);
        setField(term81138, term81138.getClass(), "implementedInterfaces", null);
        setField(term81138, term81138.getClass(), "extendedInterfaces", null);
        setField(term81138, term81138.getClass(), "subTypes", null);
        setField(term81138, term81138.getClass(), "templateTypeNames", null);
        setField(term81138, term81138.getClass(), "className", null);
        setField(term81138, term81138.getClass(), "properties", null);
        setBooleanField(term81138, term81138.getClass(), "nativeType", false);
        setField(term81139, term81139.getClass(), "typeExpr", null);
        setField(term81139, term81139.getClass(), "sourceName", null);
        setBooleanField(term81139, term81139.getClass(), "isChecked", false);
        setBooleanField(term81139, term81139.getClass(), "visited", false);
        setField(term81139, term81139.getClass(), "docInfo", null);
        setBooleanField(term81139, term81139.getClass(), "unknown", false);
        setBooleanField(term81139, term81139.getClass(), "resolved", false);
        setField(term81139, term81139.getClass(), "resolveResult", null);
        setBooleanField(term81139, term81139.getClass(), "inTemplatedCheckVisit", false);
        setField(term81139, term81139.getClass(), "registry", null);
        setField(term81138, term81138.getClass(), "implicitPrototypeFallback", term81139);
        setField(term81138, term81138.getClass(), "ownerFunction", null);
        setBooleanField(term81138, term81138.getClass(), "prettyPrint", false);
        setBooleanField(term81138, term81138.getClass(), "visited", false);
        setField(term81138, term81138.getClass(), "docInfo", null);
        setBooleanField(term81138, term81138.getClass(), "unknown", true);
        setBooleanField(term81138, term81138.getClass(), "resolved", false);
        setField(term81138, term81138.getClass(), "resolveResult", null);
        setBooleanField(term81138, term81138.getClass(), "inTemplatedCheckVisit", false);
        setField(term81138, term81138.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term80962;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term80854, args);
        assertTrue(recursiveEquals(term80854, term81137));
        assertTrue(recursiveEquals(term80962, term81138));
        assertTrue(recursiveEquals(retValue, true));
    }

};


