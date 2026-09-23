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
import java.lang.String;

public class FunctionType_setPrototypeNoCheck_1402626902373 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term340701;
     Object term341281;
     Object term341789;
     Object term341797;

    public FunctionType_setPrototypeNoCheck_1402626902373() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term341807 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term341806 = ((Class) term341807).getDeclaredField((String) "ORDINARY");
        ((Field) term341806).setAccessible(true);
        Object enum589 = ((Field) term341806).get((Object) null);
        term340701 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term340815 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term340915 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term341023 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term340915, term340915.getClass(), "ownerFunction", term341023);
        setField(term340815, term340815.getClass(), "type", term340915);
        setField(term340701, term340701.getClass(), "prototypeSlot", term340815);
        setField(term340701, term340701.getClass(), "source", null);
        setField(term340701, term340701.getClass(), "kind", enum589);
        setBooleanField(term340701, term340701.getClass(), "unknown", false);
        setField(term340701, term340701.getClass(), "subTypes", null);
        setBooleanField(term340701, term340701.getClass(), "nativeType", false);
        term341281 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term341281, term341281.getClass(), "ownerFunction", null);
        Class<? extends Object> term342107 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term342106 = ((Class) term342107).getDeclaredField((String) "ORDINARY");
        ((Field) term342106).setAccessible(true);
        Object enum590 = ((Field) term342106).get((Object) null);
        term341789 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term341790 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term341793 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term341789, term341789.getClass(), "call", null);
        setField(term341790, term341790.getClass(), "name", "prototype");
        setField(term341793, term341793.getClass(), "call", null);
        setField(term341793, term341793.getClass(), "prototypeSlot", null);
        setField(term341793, term341793.getClass(), "kind", null);
        setField(term341793, term341793.getClass(), "propAccess", null);
        setField(term341793, term341793.getClass(), "typeOfThis", null);
        setField(term341793, term341793.getClass(), "source", null);
        setField(term341793, term341793.getClass(), "implementedInterfaces", null);
        setField(term341793, term341793.getClass(), "extendedInterfaces", null);
        setField(term341793, term341793.getClass(), "subTypes", null);
        setField(term341793, term341793.getClass(), "templateTypeNames", null);
        setField(term341793, term341793.getClass(), "className", null);
        setField(term341793, term341793.getClass(), "properties", null);
        setBooleanField(term341793, term341793.getClass(), "nativeType", false);
        setField(term341793, term341793.getClass(), "implicitPrototypeFallback", null);
        setField(term341793, term341793.getClass(), "ownerFunction", term341789);
        setBooleanField(term341793, term341793.getClass(), "prettyPrint", false);
        setBooleanField(term341793, term341793.getClass(), "visited", false);
        setField(term341793, term341793.getClass(), "docInfo", null);
        setBooleanField(term341793, term341793.getClass(), "unknown", true);
        setBooleanField(term341793, term341793.getClass(), "resolved", false);
        setField(term341793, term341793.getClass(), "resolveResult", null);
        setBooleanField(term341793, term341793.getClass(), "inTemplatedCheckVisit", false);
        setField(term341793, term341793.getClass(), "registry", null);
        setField(term341790, term341790.getClass(), "type", term341793);
        setBooleanField(term341790, term341790.getClass(), "inferred", true);
        setField(term341790, term341790.getClass(), "propertyNode", null);
        setField(term341790, term341790.getClass(), "docInfo", null);
        setField(term341789, term341789.getClass(), "prototypeSlot", term341790);
        setField(term341789, term341789.getClass(), "kind", enum590);
        setField(term341789, term341789.getClass(), "propAccess", null);
        setField(term341789, term341789.getClass(), "typeOfThis", null);
        setField(term341789, term341789.getClass(), "source", null);
        setField(term341789, term341789.getClass(), "implementedInterfaces", null);
        setField(term341789, term341789.getClass(), "extendedInterfaces", null);
        setField(term341789, term341789.getClass(), "subTypes", null);
        setField(term341789, term341789.getClass(), "templateTypeNames", null);
        setField(term341789, term341789.getClass(), "className", null);
        setField(term341789, term341789.getClass(), "properties", null);
        setBooleanField(term341789, term341789.getClass(), "nativeType", false);
        setField(term341789, term341789.getClass(), "implicitPrototypeFallback", null);
        setField(term341789, term341789.getClass(), "ownerFunction", null);
        setBooleanField(term341789, term341789.getClass(), "prettyPrint", false);
        setBooleanField(term341789, term341789.getClass(), "visited", false);
        setField(term341789, term341789.getClass(), "docInfo", null);
        setBooleanField(term341789, term341789.getClass(), "unknown", true);
        setBooleanField(term341789, term341789.getClass(), "resolved", false);
        setField(term341789, term341789.getClass(), "resolveResult", null);
        setBooleanField(term341789, term341789.getClass(), "inTemplatedCheckVisit", false);
        setField(term341789, term341789.getClass(), "registry", null);
        Class<? extends Object> term342407 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term342406 = ((Class) term342407).getDeclaredField((String) "ORDINARY");
        ((Field) term342406).setAccessible(true);
        Object enum591 = ((Field) term342406).get((Object) null);
        term341797 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term341798 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term341799 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term341797, term341797.getClass(), "call", null);
        setField(term341797, term341797.getClass(), "prototypeSlot", null);
        setField(term341797, term341797.getClass(), "kind", null);
        setField(term341797, term341797.getClass(), "propAccess", null);
        setField(term341797, term341797.getClass(), "typeOfThis", null);
        setField(term341797, term341797.getClass(), "source", null);
        setField(term341797, term341797.getClass(), "implementedInterfaces", null);
        setField(term341797, term341797.getClass(), "extendedInterfaces", null);
        setField(term341797, term341797.getClass(), "subTypes", null);
        setField(term341797, term341797.getClass(), "templateTypeNames", null);
        setField(term341797, term341797.getClass(), "className", null);
        setField(term341797, term341797.getClass(), "properties", null);
        setBooleanField(term341797, term341797.getClass(), "nativeType", false);
        setField(term341797, term341797.getClass(), "implicitPrototypeFallback", null);
        setField(term341798, term341798.getClass(), "call", null);
        setField(term341799, term341799.getClass(), "name", "prototype");
        setField(term341799, term341799.getClass(), "type", term341797);
        setBooleanField(term341799, term341799.getClass(), "inferred", true);
        setField(term341799, term341799.getClass(), "propertyNode", null);
        setField(term341799, term341799.getClass(), "docInfo", null);
        setField(term341798, term341798.getClass(), "prototypeSlot", term341799);
        setField(term341798, term341798.getClass(), "kind", enum591);
        setField(term341798, term341798.getClass(), "propAccess", null);
        setField(term341798, term341798.getClass(), "typeOfThis", null);
        setField(term341798, term341798.getClass(), "source", null);
        setField(term341798, term341798.getClass(), "implementedInterfaces", null);
        setField(term341798, term341798.getClass(), "extendedInterfaces", null);
        setField(term341798, term341798.getClass(), "subTypes", null);
        setField(term341798, term341798.getClass(), "templateTypeNames", null);
        setField(term341798, term341798.getClass(), "className", null);
        setField(term341798, term341798.getClass(), "properties", null);
        setBooleanField(term341798, term341798.getClass(), "nativeType", false);
        setField(term341798, term341798.getClass(), "implicitPrototypeFallback", null);
        setField(term341798, term341798.getClass(), "ownerFunction", null);
        setBooleanField(term341798, term341798.getClass(), "prettyPrint", false);
        setBooleanField(term341798, term341798.getClass(), "visited", false);
        setField(term341798, term341798.getClass(), "docInfo", null);
        setBooleanField(term341798, term341798.getClass(), "unknown", true);
        setBooleanField(term341798, term341798.getClass(), "resolved", false);
        setField(term341798, term341798.getClass(), "resolveResult", null);
        setBooleanField(term341798, term341798.getClass(), "inTemplatedCheckVisit", false);
        setField(term341798, term341798.getClass(), "registry", null);
        setField(term341797, term341797.getClass(), "ownerFunction", term341798);
        setBooleanField(term341797, term341797.getClass(), "prettyPrint", false);
        setBooleanField(term341797, term341797.getClass(), "visited", false);
        setField(term341797, term341797.getClass(), "docInfo", null);
        setBooleanField(term341797, term341797.getClass(), "unknown", true);
        setBooleanField(term341797, term341797.getClass(), "resolved", false);
        setField(term341797, term341797.getClass(), "resolveResult", null);
        setBooleanField(term341797, term341797.getClass(), "inTemplatedCheckVisit", false);
        setField(term341797, term341797.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term341281;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototypeNoCheck", argTypes, term340701, args);
        assertTrue(recursiveEquals(term340701, term341789));
        assertTrue(recursiveEquals(term341281, term341797));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


