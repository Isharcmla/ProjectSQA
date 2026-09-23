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
import java.lang.String;
import java.lang.Object;

public class FunctionType_makesDicts_1455599566275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264635;
     Object term265974;

    public FunctionType_makesDicts_1455599566275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term265986 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term265985 = ((Class) term265986).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term265985).setAccessible(true);
        Object enum478 = ((Field) term265985).get((Object) null);
        Class<? extends Object> term266286 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term266285 = ((Class) term266286).getDeclaredField((String) "STRUCT");
        ((Field) term266285).setAccessible(true);
        Object enum479 = ((Field) term266285).get((Object) null);
        term264635 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term265057 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term265145 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term265253 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term264635, term264635.getClass(), "kind", enum478);
        setField(term264635, term264635.getClass(), "propAccess", enum479);
        setField(term265145, term265145.getClass(), "implicitPrototypeFallback", term265253);
        setField(term265057, term265057.getClass(), "type", term265145);
        setField(term264635, term264635.getClass(), "prototypeSlot", term265057);
        Class<? extends Object> term266601 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term266600 = ((Class) term266601).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term266600).setAccessible(true);
        Object enum480 = ((Field) term266600).get((Object) null);
        Class<? extends Object> term266901 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term266900 = ((Class) term266901).getDeclaredField((String) "STRUCT");
        ((Field) term266900).setAccessible(true);
        Object enum481 = ((Field) term266900).get((Object) null);
        term265974 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term265975 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term265976 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term265977 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term265974, term265974.getClass(), "call", null);
        setField(term265975, term265975.getClass(), "name", null);
        setField(term265976, term265976.getClass(), "call", null);
        setField(term265976, term265976.getClass(), "prototypeSlot", null);
        setField(term265976, term265976.getClass(), "kind", null);
        setField(term265976, term265976.getClass(), "propAccess", null);
        setField(term265976, term265976.getClass(), "typeOfThis", null);
        setField(term265976, term265976.getClass(), "source", null);
        setField(term265976, term265976.getClass(), "implementedInterfaces", null);
        setField(term265976, term265976.getClass(), "extendedInterfaces", null);
        setField(term265976, term265976.getClass(), "subTypes", null);
        setField(term265976, term265976.getClass(), "templateTypeNames", null);
        setField(term265976, term265976.getClass(), "className", null);
        setField(term265976, term265976.getClass(), "properties", null);
        setBooleanField(term265976, term265976.getClass(), "nativeType", false);
        setField(term265977, term265977.getClass(), "this$0", null);
        setField(term265977, term265977.getClass(), "call", null);
        setField(term265977, term265977.getClass(), "prototypeSlot", null);
        setField(term265977, term265977.getClass(), "kind", null);
        setField(term265977, term265977.getClass(), "propAccess", null);
        setField(term265977, term265977.getClass(), "typeOfThis", null);
        setField(term265977, term265977.getClass(), "source", null);
        setField(term265977, term265977.getClass(), "implementedInterfaces", null);
        setField(term265977, term265977.getClass(), "extendedInterfaces", null);
        setField(term265977, term265977.getClass(), "subTypes", null);
        setField(term265977, term265977.getClass(), "templateTypeNames", null);
        setField(term265977, term265977.getClass(), "className", null);
        setField(term265977, term265977.getClass(), "properties", null);
        setBooleanField(term265977, term265977.getClass(), "nativeType", false);
        setField(term265977, term265977.getClass(), "implicitPrototypeFallback", null);
        setField(term265977, term265977.getClass(), "ownerFunction", null);
        setBooleanField(term265977, term265977.getClass(), "prettyPrint", false);
        setBooleanField(term265977, term265977.getClass(), "visited", false);
        setField(term265977, term265977.getClass(), "docInfo", null);
        setBooleanField(term265977, term265977.getClass(), "unknown", false);
        setBooleanField(term265977, term265977.getClass(), "resolved", false);
        setField(term265977, term265977.getClass(), "resolveResult", null);
        setBooleanField(term265977, term265977.getClass(), "inTemplatedCheckVisit", false);
        setField(term265977, term265977.getClass(), "registry", null);
        setField(term265976, term265976.getClass(), "implicitPrototypeFallback", term265977);
        setField(term265976, term265976.getClass(), "ownerFunction", null);
        setBooleanField(term265976, term265976.getClass(), "prettyPrint", false);
        setBooleanField(term265976, term265976.getClass(), "visited", false);
        setField(term265976, term265976.getClass(), "docInfo", null);
        setBooleanField(term265976, term265976.getClass(), "unknown", false);
        setBooleanField(term265976, term265976.getClass(), "resolved", false);
        setField(term265976, term265976.getClass(), "resolveResult", null);
        setBooleanField(term265976, term265976.getClass(), "inTemplatedCheckVisit", false);
        setField(term265976, term265976.getClass(), "registry", null);
        setField(term265975, term265975.getClass(), "type", term265976);
        setBooleanField(term265975, term265975.getClass(), "inferred", false);
        setField(term265975, term265975.getClass(), "propertyNode", null);
        setField(term265975, term265975.getClass(), "docInfo", null);
        setField(term265974, term265974.getClass(), "prototypeSlot", term265975);
        setField(term265974, term265974.getClass(), "kind", enum480);
        setField(term265974, term265974.getClass(), "propAccess", enum481);
        setField(term265974, term265974.getClass(), "typeOfThis", null);
        setField(term265974, term265974.getClass(), "source", null);
        setField(term265974, term265974.getClass(), "implementedInterfaces", null);
        setField(term265974, term265974.getClass(), "extendedInterfaces", null);
        setField(term265974, term265974.getClass(), "subTypes", null);
        setField(term265974, term265974.getClass(), "templateTypeNames", null);
        setField(term265974, term265974.getClass(), "className", null);
        setField(term265974, term265974.getClass(), "properties", null);
        setBooleanField(term265974, term265974.getClass(), "nativeType", false);
        setField(term265974, term265974.getClass(), "implicitPrototypeFallback", null);
        setField(term265974, term265974.getClass(), "ownerFunction", null);
        setBooleanField(term265974, term265974.getClass(), "prettyPrint", false);
        setBooleanField(term265974, term265974.getClass(), "visited", false);
        setField(term265974, term265974.getClass(), "docInfo", null);
        setBooleanField(term265974, term265974.getClass(), "unknown", false);
        setBooleanField(term265974, term265974.getClass(), "resolved", false);
        setField(term265974, term265974.getClass(), "resolveResult", null);
        setBooleanField(term265974, term265974.getClass(), "inTemplatedCheckVisit", false);
        setField(term265974, term265974.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "makesDicts", argTypes, term264635, args);
        assertTrue(recursiveEquals(term264635, term265974));
        assertTrue(recursiveEquals(retValue, false));
    }

};


