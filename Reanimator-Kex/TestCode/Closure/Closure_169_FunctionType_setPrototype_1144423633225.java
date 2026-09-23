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

public class FunctionType_setPrototype_1144423633225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term233174;
     Object term233422;
     Object term233957;
     Object term233965;

    public FunctionType_setPrototype_1144423633225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term233975 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term233974 = ((Class) term233975).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term233974).setAccessible(true);
        Object enum438 = ((Field) term233974).get((Object) null);
        term233174 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term233174, term233174.getClass(), "kind", enum438);
        term233422 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Class<? extends Object> term234284 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term234283 = ((Class) term234284).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term234283).setAccessible(true);
        Object enum439 = ((Field) term234283).get((Object) null);
        term233957 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term233958 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term233961 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term233957, term233957.getClass(), "call", null);
        setField(term233958, term233958.getClass(), "name", "prototype");
        setField(term233961, term233961.getClass(), "call", null);
        setField(term233961, term233961.getClass(), "prototypeSlot", null);
        setField(term233961, term233961.getClass(), "kind", null);
        setField(term233961, term233961.getClass(), "propAccess", null);
        setField(term233961, term233961.getClass(), "typeOfThis", null);
        setField(term233961, term233961.getClass(), "source", null);
        setField(term233961, term233961.getClass(), "implementedInterfaces", null);
        setField(term233961, term233961.getClass(), "extendedInterfaces", null);
        setField(term233961, term233961.getClass(), "subTypes", null);
        setField(term233961, term233961.getClass(), "templateTypeNames", null);
        setField(term233961, term233961.getClass(), "className", null);
        setField(term233961, term233961.getClass(), "properties", null);
        setBooleanField(term233961, term233961.getClass(), "nativeType", false);
        setField(term233961, term233961.getClass(), "implicitPrototypeFallback", null);
        setField(term233961, term233961.getClass(), "ownerFunction", term233957);
        setBooleanField(term233961, term233961.getClass(), "prettyPrint", false);
        setBooleanField(term233961, term233961.getClass(), "visited", false);
        setField(term233961, term233961.getClass(), "docInfo", null);
        setBooleanField(term233961, term233961.getClass(), "unknown", false);
        setBooleanField(term233961, term233961.getClass(), "resolved", false);
        setField(term233961, term233961.getClass(), "resolveResult", null);
        setBooleanField(term233961, term233961.getClass(), "inTemplatedCheckVisit", false);
        setField(term233961, term233961.getClass(), "registry", null);
        setField(term233958, term233958.getClass(), "type", term233961);
        setBooleanField(term233958, term233958.getClass(), "inferred", true);
        setField(term233958, term233958.getClass(), "propertyNode", null);
        setField(term233958, term233958.getClass(), "docInfo", null);
        setField(term233957, term233957.getClass(), "prototypeSlot", term233958);
        setField(term233957, term233957.getClass(), "kind", enum439);
        setField(term233957, term233957.getClass(), "propAccess", null);
        setField(term233957, term233957.getClass(), "typeOfThis", null);
        setField(term233957, term233957.getClass(), "source", null);
        setField(term233957, term233957.getClass(), "implementedInterfaces", null);
        setField(term233957, term233957.getClass(), "extendedInterfaces", null);
        setField(term233957, term233957.getClass(), "subTypes", null);
        setField(term233957, term233957.getClass(), "templateTypeNames", null);
        setField(term233957, term233957.getClass(), "className", null);
        setField(term233957, term233957.getClass(), "properties", null);
        setBooleanField(term233957, term233957.getClass(), "nativeType", false);
        setField(term233957, term233957.getClass(), "implicitPrototypeFallback", null);
        setField(term233957, term233957.getClass(), "ownerFunction", null);
        setBooleanField(term233957, term233957.getClass(), "prettyPrint", false);
        setBooleanField(term233957, term233957.getClass(), "visited", false);
        setField(term233957, term233957.getClass(), "docInfo", null);
        setBooleanField(term233957, term233957.getClass(), "unknown", false);
        setBooleanField(term233957, term233957.getClass(), "resolved", false);
        setField(term233957, term233957.getClass(), "resolveResult", null);
        setBooleanField(term233957, term233957.getClass(), "inTemplatedCheckVisit", false);
        setField(term233957, term233957.getClass(), "registry", null);
        Class<? extends Object> term234593 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term234592 = ((Class) term234593).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term234592).setAccessible(true);
        Object enum440 = ((Field) term234592).get((Object) null);
        term233965 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term233966 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term233967 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term233965, term233965.getClass(), "call", null);
        setField(term233965, term233965.getClass(), "prototypeSlot", null);
        setField(term233965, term233965.getClass(), "kind", null);
        setField(term233965, term233965.getClass(), "propAccess", null);
        setField(term233965, term233965.getClass(), "typeOfThis", null);
        setField(term233965, term233965.getClass(), "source", null);
        setField(term233965, term233965.getClass(), "implementedInterfaces", null);
        setField(term233965, term233965.getClass(), "extendedInterfaces", null);
        setField(term233965, term233965.getClass(), "subTypes", null);
        setField(term233965, term233965.getClass(), "templateTypeNames", null);
        setField(term233965, term233965.getClass(), "className", null);
        setField(term233965, term233965.getClass(), "properties", null);
        setBooleanField(term233965, term233965.getClass(), "nativeType", false);
        setField(term233965, term233965.getClass(), "implicitPrototypeFallback", null);
        setField(term233966, term233966.getClass(), "call", null);
        setField(term233967, term233967.getClass(), "name", "prototype");
        setField(term233967, term233967.getClass(), "type", term233965);
        setBooleanField(term233967, term233967.getClass(), "inferred", true);
        setField(term233967, term233967.getClass(), "propertyNode", null);
        setField(term233967, term233967.getClass(), "docInfo", null);
        setField(term233966, term233966.getClass(), "prototypeSlot", term233967);
        setField(term233966, term233966.getClass(), "kind", enum440);
        setField(term233966, term233966.getClass(), "propAccess", null);
        setField(term233966, term233966.getClass(), "typeOfThis", null);
        setField(term233966, term233966.getClass(), "source", null);
        setField(term233966, term233966.getClass(), "implementedInterfaces", null);
        setField(term233966, term233966.getClass(), "extendedInterfaces", null);
        setField(term233966, term233966.getClass(), "subTypes", null);
        setField(term233966, term233966.getClass(), "templateTypeNames", null);
        setField(term233966, term233966.getClass(), "className", null);
        setField(term233966, term233966.getClass(), "properties", null);
        setBooleanField(term233966, term233966.getClass(), "nativeType", false);
        setField(term233966, term233966.getClass(), "implicitPrototypeFallback", null);
        setField(term233966, term233966.getClass(), "ownerFunction", null);
        setBooleanField(term233966, term233966.getClass(), "prettyPrint", false);
        setBooleanField(term233966, term233966.getClass(), "visited", false);
        setField(term233966, term233966.getClass(), "docInfo", null);
        setBooleanField(term233966, term233966.getClass(), "unknown", false);
        setBooleanField(term233966, term233966.getClass(), "resolved", false);
        setField(term233966, term233966.getClass(), "resolveResult", null);
        setBooleanField(term233966, term233966.getClass(), "inTemplatedCheckVisit", false);
        setField(term233966, term233966.getClass(), "registry", null);
        setField(term233965, term233965.getClass(), "ownerFunction", term233966);
        setBooleanField(term233965, term233965.getClass(), "prettyPrint", false);
        setBooleanField(term233965, term233965.getClass(), "visited", false);
        setField(term233965, term233965.getClass(), "docInfo", null);
        setBooleanField(term233965, term233965.getClass(), "unknown", false);
        setBooleanField(term233965, term233965.getClass(), "resolved", false);
        setField(term233965, term233965.getClass(), "resolveResult", null);
        setBooleanField(term233965, term233965.getClass(), "inTemplatedCheckVisit", false);
        setField(term233965, term233965.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term233422;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term233174, args);
        assertTrue(recursiveEquals(term233174, term233957));
        assertTrue(recursiveEquals(term233422, term233965));
        assertTrue(recursiveEquals(retValue, true));
    }

};


