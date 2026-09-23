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

public class FunctionType_setPrototypeNoCheck_1402626902584 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term560513;
     Object term561091;
     Object term561590;
     Object term561598;

    public FunctionType_setPrototypeNoCheck_1402626902584() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term561608 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term561607 = ((Class) term561608).getDeclaredField((String) "ORDINARY");
        ((Field) term561607).setAccessible(true);
        Object enum917 = ((Field) term561607).get((Object) null);
        term560513 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term560627 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term560731 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term560839 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term560731, term560731.getClass(), "ownerFunction", term560839);
        setField(term560627, term560627.getClass(), "type", term560731);
        setField(term560513, term560513.getClass(), "prototypeSlot", term560627);
        setField(term560513, term560513.getClass(), "source", null);
        setField(term560513, term560513.getClass(), "kind", enum917);
        setBooleanField(term560513, term560513.getClass(), "unknown", false);
        setField(term560513, term560513.getClass(), "subTypes", null);
        setBooleanField(term560513, term560513.getClass(), "nativeType", false);
        term561091 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term561091, term561091.getClass(), "ownerFunction", null);
        setBooleanField(term561091, term561091.getClass(), "unknown", false);
        setField(term561091, term561091.getClass(), "subTypes", null);
        setBooleanField(term561091, term561091.getClass(), "nativeType", true);
        Class<? extends Object> term561908 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term561907 = ((Class) term561908).getDeclaredField((String) "ORDINARY");
        ((Field) term561907).setAccessible(true);
        Object enum918 = ((Field) term561907).get((Object) null);
        term561590 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term561591 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term561594 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term561590, term561590.getClass(), "call", null);
        setField(term561591, term561591.getClass(), "name", "prototype");
        setField(term561594, term561594.getClass(), "call", null);
        setField(term561594, term561594.getClass(), "prototypeSlot", null);
        setField(term561594, term561594.getClass(), "kind", null);
        setField(term561594, term561594.getClass(), "propAccess", null);
        setField(term561594, term561594.getClass(), "typeOfThis", null);
        setField(term561594, term561594.getClass(), "source", null);
        setField(term561594, term561594.getClass(), "implementedInterfaces", null);
        setField(term561594, term561594.getClass(), "extendedInterfaces", null);
        setField(term561594, term561594.getClass(), "subTypes", null);
        setField(term561594, term561594.getClass(), "templateTypeNames", null);
        setField(term561594, term561594.getClass(), "className", null);
        setField(term561594, term561594.getClass(), "properties", null);
        setBooleanField(term561594, term561594.getClass(), "nativeType", true);
        setField(term561594, term561594.getClass(), "implicitPrototypeFallback", null);
        setField(term561594, term561594.getClass(), "ownerFunction", term561590);
        setBooleanField(term561594, term561594.getClass(), "prettyPrint", false);
        setBooleanField(term561594, term561594.getClass(), "visited", false);
        setField(term561594, term561594.getClass(), "docInfo", null);
        setBooleanField(term561594, term561594.getClass(), "unknown", true);
        setBooleanField(term561594, term561594.getClass(), "resolved", false);
        setField(term561594, term561594.getClass(), "resolveResult", null);
        setBooleanField(term561594, term561594.getClass(), "inTemplatedCheckVisit", false);
        setField(term561594, term561594.getClass(), "registry", null);
        setField(term561591, term561591.getClass(), "type", term561594);
        setBooleanField(term561591, term561591.getClass(), "inferred", true);
        setField(term561591, term561591.getClass(), "propertyNode", null);
        setField(term561591, term561591.getClass(), "docInfo", null);
        setField(term561590, term561590.getClass(), "prototypeSlot", term561591);
        setField(term561590, term561590.getClass(), "kind", enum918);
        setField(term561590, term561590.getClass(), "propAccess", null);
        setField(term561590, term561590.getClass(), "typeOfThis", null);
        setField(term561590, term561590.getClass(), "source", null);
        setField(term561590, term561590.getClass(), "implementedInterfaces", null);
        setField(term561590, term561590.getClass(), "extendedInterfaces", null);
        setField(term561590, term561590.getClass(), "subTypes", null);
        setField(term561590, term561590.getClass(), "templateTypeNames", null);
        setField(term561590, term561590.getClass(), "className", null);
        setField(term561590, term561590.getClass(), "properties", null);
        setBooleanField(term561590, term561590.getClass(), "nativeType", false);
        setField(term561590, term561590.getClass(), "implicitPrototypeFallback", null);
        setField(term561590, term561590.getClass(), "ownerFunction", null);
        setBooleanField(term561590, term561590.getClass(), "prettyPrint", false);
        setBooleanField(term561590, term561590.getClass(), "visited", false);
        setField(term561590, term561590.getClass(), "docInfo", null);
        setBooleanField(term561590, term561590.getClass(), "unknown", true);
        setBooleanField(term561590, term561590.getClass(), "resolved", false);
        setField(term561590, term561590.getClass(), "resolveResult", null);
        setBooleanField(term561590, term561590.getClass(), "inTemplatedCheckVisit", false);
        setField(term561590, term561590.getClass(), "registry", null);
        Class<? extends Object> term562208 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term562207 = ((Class) term562208).getDeclaredField((String) "ORDINARY");
        ((Field) term562207).setAccessible(true);
        Object enum919 = ((Field) term562207).get((Object) null);
        term561598 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term561599 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term561600 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term561598, term561598.getClass(), "call", null);
        setField(term561598, term561598.getClass(), "prototypeSlot", null);
        setField(term561598, term561598.getClass(), "kind", null);
        setField(term561598, term561598.getClass(), "propAccess", null);
        setField(term561598, term561598.getClass(), "typeOfThis", null);
        setField(term561598, term561598.getClass(), "source", null);
        setField(term561598, term561598.getClass(), "implementedInterfaces", null);
        setField(term561598, term561598.getClass(), "extendedInterfaces", null);
        setField(term561598, term561598.getClass(), "subTypes", null);
        setField(term561598, term561598.getClass(), "templateTypeNames", null);
        setField(term561598, term561598.getClass(), "className", null);
        setField(term561598, term561598.getClass(), "properties", null);
        setBooleanField(term561598, term561598.getClass(), "nativeType", true);
        setField(term561598, term561598.getClass(), "implicitPrototypeFallback", null);
        setField(term561599, term561599.getClass(), "call", null);
        setField(term561600, term561600.getClass(), "name", "prototype");
        setField(term561600, term561600.getClass(), "type", term561598);
        setBooleanField(term561600, term561600.getClass(), "inferred", true);
        setField(term561600, term561600.getClass(), "propertyNode", null);
        setField(term561600, term561600.getClass(), "docInfo", null);
        setField(term561599, term561599.getClass(), "prototypeSlot", term561600);
        setField(term561599, term561599.getClass(), "kind", enum919);
        setField(term561599, term561599.getClass(), "propAccess", null);
        setField(term561599, term561599.getClass(), "typeOfThis", null);
        setField(term561599, term561599.getClass(), "source", null);
        setField(term561599, term561599.getClass(), "implementedInterfaces", null);
        setField(term561599, term561599.getClass(), "extendedInterfaces", null);
        setField(term561599, term561599.getClass(), "subTypes", null);
        setField(term561599, term561599.getClass(), "templateTypeNames", null);
        setField(term561599, term561599.getClass(), "className", null);
        setField(term561599, term561599.getClass(), "properties", null);
        setBooleanField(term561599, term561599.getClass(), "nativeType", false);
        setField(term561599, term561599.getClass(), "implicitPrototypeFallback", null);
        setField(term561599, term561599.getClass(), "ownerFunction", null);
        setBooleanField(term561599, term561599.getClass(), "prettyPrint", false);
        setBooleanField(term561599, term561599.getClass(), "visited", false);
        setField(term561599, term561599.getClass(), "docInfo", null);
        setBooleanField(term561599, term561599.getClass(), "unknown", true);
        setBooleanField(term561599, term561599.getClass(), "resolved", false);
        setField(term561599, term561599.getClass(), "resolveResult", null);
        setBooleanField(term561599, term561599.getClass(), "inTemplatedCheckVisit", false);
        setField(term561599, term561599.getClass(), "registry", null);
        setField(term561598, term561598.getClass(), "ownerFunction", term561599);
        setBooleanField(term561598, term561598.getClass(), "prettyPrint", false);
        setBooleanField(term561598, term561598.getClass(), "visited", false);
        setField(term561598, term561598.getClass(), "docInfo", null);
        setBooleanField(term561598, term561598.getClass(), "unknown", true);
        setBooleanField(term561598, term561598.getClass(), "resolved", false);
        setField(term561598, term561598.getClass(), "resolveResult", null);
        setBooleanField(term561598, term561598.getClass(), "inTemplatedCheckVisit", false);
        setField(term561598, term561598.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term561091;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototypeNoCheck", argTypes, term560513, args);
        assertTrue(recursiveEquals(term560513, term561590));
        assertTrue(recursiveEquals(term561091, term561598));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


