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

public class FunctionType_setPrototypeNoCheck_1402626902449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term412073;
     Object term412631;
     Object term413147;
     Object term413155;

    public FunctionType_setPrototypeNoCheck_1402626902449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term413165 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term413164 = ((Class) term413165).getDeclaredField((String) "ORDINARY");
        ((Field) term413164).setAccessible(true);
        Object enum679 = ((Field) term413164).get((Object) null);
        term412073 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term412187 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term412291 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term412379 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term412291, term412291.getClass(), "ownerFunction", term412379);
        setField(term412187, term412187.getClass(), "type", term412291);
        setField(term412073, term412073.getClass(), "prototypeSlot", term412187);
        setField(term412073, term412073.getClass(), "source", null);
        setField(term412073, term412073.getClass(), "kind", enum679);
        term412631 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term412631, term412631.getClass(), "ownerFunction", null);
        Class<? extends Object> term413465 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term413464 = ((Class) term413465).getDeclaredField((String) "ORDINARY");
        ((Field) term413464).setAccessible(true);
        Object enum680 = ((Field) term413464).get((Object) null);
        term413147 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term413148 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term413151 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term413147, term413147.getClass(), "call", null);
        setField(term413148, term413148.getClass(), "name", "prototype");
        setField(term413151, term413151.getClass(), "call", null);
        setField(term413151, term413151.getClass(), "prototypeSlot", null);
        setField(term413151, term413151.getClass(), "kind", null);
        setField(term413151, term413151.getClass(), "propAccess", null);
        setField(term413151, term413151.getClass(), "typeOfThis", null);
        setField(term413151, term413151.getClass(), "source", null);
        setField(term413151, term413151.getClass(), "implementedInterfaces", null);
        setField(term413151, term413151.getClass(), "extendedInterfaces", null);
        setField(term413151, term413151.getClass(), "subTypes", null);
        setField(term413151, term413151.getClass(), "templateTypeNames", null);
        setField(term413151, term413151.getClass(), "className", null);
        setField(term413151, term413151.getClass(), "properties", null);
        setBooleanField(term413151, term413151.getClass(), "nativeType", false);
        setField(term413151, term413151.getClass(), "implicitPrototypeFallback", null);
        setField(term413151, term413151.getClass(), "ownerFunction", term413147);
        setBooleanField(term413151, term413151.getClass(), "prettyPrint", false);
        setBooleanField(term413151, term413151.getClass(), "visited", false);
        setField(term413151, term413151.getClass(), "docInfo", null);
        setBooleanField(term413151, term413151.getClass(), "unknown", true);
        setBooleanField(term413151, term413151.getClass(), "resolved", false);
        setField(term413151, term413151.getClass(), "resolveResult", null);
        setBooleanField(term413151, term413151.getClass(), "inTemplatedCheckVisit", false);
        setField(term413151, term413151.getClass(), "registry", null);
        setField(term413148, term413148.getClass(), "type", term413151);
        setBooleanField(term413148, term413148.getClass(), "inferred", true);
        setField(term413148, term413148.getClass(), "propertyNode", null);
        setField(term413148, term413148.getClass(), "docInfo", null);
        setField(term413147, term413147.getClass(), "prototypeSlot", term413148);
        setField(term413147, term413147.getClass(), "kind", enum680);
        setField(term413147, term413147.getClass(), "propAccess", null);
        setField(term413147, term413147.getClass(), "typeOfThis", null);
        setField(term413147, term413147.getClass(), "source", null);
        setField(term413147, term413147.getClass(), "implementedInterfaces", null);
        setField(term413147, term413147.getClass(), "extendedInterfaces", null);
        setField(term413147, term413147.getClass(), "subTypes", null);
        setField(term413147, term413147.getClass(), "templateTypeNames", null);
        setField(term413147, term413147.getClass(), "className", null);
        setField(term413147, term413147.getClass(), "properties", null);
        setBooleanField(term413147, term413147.getClass(), "nativeType", false);
        setField(term413147, term413147.getClass(), "implicitPrototypeFallback", null);
        setField(term413147, term413147.getClass(), "ownerFunction", null);
        setBooleanField(term413147, term413147.getClass(), "prettyPrint", false);
        setBooleanField(term413147, term413147.getClass(), "visited", false);
        setField(term413147, term413147.getClass(), "docInfo", null);
        setBooleanField(term413147, term413147.getClass(), "unknown", true);
        setBooleanField(term413147, term413147.getClass(), "resolved", false);
        setField(term413147, term413147.getClass(), "resolveResult", null);
        setBooleanField(term413147, term413147.getClass(), "inTemplatedCheckVisit", false);
        setField(term413147, term413147.getClass(), "registry", null);
        Class<? extends Object> term413765 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term413764 = ((Class) term413765).getDeclaredField((String) "ORDINARY");
        ((Field) term413764).setAccessible(true);
        Object enum681 = ((Field) term413764).get((Object) null);
        term413155 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term413156 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term413157 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term413155, term413155.getClass(), "call", null);
        setField(term413155, term413155.getClass(), "prototypeSlot", null);
        setField(term413155, term413155.getClass(), "kind", null);
        setField(term413155, term413155.getClass(), "propAccess", null);
        setField(term413155, term413155.getClass(), "typeOfThis", null);
        setField(term413155, term413155.getClass(), "source", null);
        setField(term413155, term413155.getClass(), "implementedInterfaces", null);
        setField(term413155, term413155.getClass(), "extendedInterfaces", null);
        setField(term413155, term413155.getClass(), "subTypes", null);
        setField(term413155, term413155.getClass(), "templateTypeNames", null);
        setField(term413155, term413155.getClass(), "className", null);
        setField(term413155, term413155.getClass(), "properties", null);
        setBooleanField(term413155, term413155.getClass(), "nativeType", false);
        setField(term413155, term413155.getClass(), "implicitPrototypeFallback", null);
        setField(term413156, term413156.getClass(), "call", null);
        setField(term413157, term413157.getClass(), "name", "prototype");
        setField(term413157, term413157.getClass(), "type", term413155);
        setBooleanField(term413157, term413157.getClass(), "inferred", true);
        setField(term413157, term413157.getClass(), "propertyNode", null);
        setField(term413157, term413157.getClass(), "docInfo", null);
        setField(term413156, term413156.getClass(), "prototypeSlot", term413157);
        setField(term413156, term413156.getClass(), "kind", enum681);
        setField(term413156, term413156.getClass(), "propAccess", null);
        setField(term413156, term413156.getClass(), "typeOfThis", null);
        setField(term413156, term413156.getClass(), "source", null);
        setField(term413156, term413156.getClass(), "implementedInterfaces", null);
        setField(term413156, term413156.getClass(), "extendedInterfaces", null);
        setField(term413156, term413156.getClass(), "subTypes", null);
        setField(term413156, term413156.getClass(), "templateTypeNames", null);
        setField(term413156, term413156.getClass(), "className", null);
        setField(term413156, term413156.getClass(), "properties", null);
        setBooleanField(term413156, term413156.getClass(), "nativeType", false);
        setField(term413156, term413156.getClass(), "implicitPrototypeFallback", null);
        setField(term413156, term413156.getClass(), "ownerFunction", null);
        setBooleanField(term413156, term413156.getClass(), "prettyPrint", false);
        setBooleanField(term413156, term413156.getClass(), "visited", false);
        setField(term413156, term413156.getClass(), "docInfo", null);
        setBooleanField(term413156, term413156.getClass(), "unknown", true);
        setBooleanField(term413156, term413156.getClass(), "resolved", false);
        setField(term413156, term413156.getClass(), "resolveResult", null);
        setBooleanField(term413156, term413156.getClass(), "inTemplatedCheckVisit", false);
        setField(term413156, term413156.getClass(), "registry", null);
        setField(term413155, term413155.getClass(), "ownerFunction", term413156);
        setBooleanField(term413155, term413155.getClass(), "prettyPrint", false);
        setBooleanField(term413155, term413155.getClass(), "visited", false);
        setField(term413155, term413155.getClass(), "docInfo", null);
        setBooleanField(term413155, term413155.getClass(), "unknown", true);
        setBooleanField(term413155, term413155.getClass(), "resolved", false);
        setField(term413155, term413155.getClass(), "resolveResult", null);
        setBooleanField(term413155, term413155.getClass(), "inTemplatedCheckVisit", false);
        setField(term413155, term413155.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term412631;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototypeNoCheck", argTypes, term412073, args);
        assertTrue(recursiveEquals(term412073, term413147));
        assertTrue(recursiveEquals(term412631, term413155));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


