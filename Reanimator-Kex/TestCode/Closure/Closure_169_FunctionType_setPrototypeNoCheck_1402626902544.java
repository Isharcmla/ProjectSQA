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

public class FunctionType_setPrototypeNoCheck_1402626902544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term518326;
     Object term518910;
     Object term519418;
     Object term519426;

    public FunctionType_setPrototypeNoCheck_1402626902544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term519436 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term519435 = ((Class) term519436).getDeclaredField((String) "ORDINARY");
        ((Field) term519435).setAccessible(true);
        Object enum851 = ((Field) term519435).get((Object) null);
        term518326 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term518440 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term518544 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term518652 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term518544, term518544.getClass(), "ownerFunction", term518652);
        setField(term518440, term518440.getClass(), "type", term518544);
        setField(term518326, term518326.getClass(), "prototypeSlot", term518440);
        setField(term518326, term518326.getClass(), "source", null);
        setField(term518326, term518326.getClass(), "kind", enum851);
        setBooleanField(term518326, term518326.getClass(), "unknown", false);
        setField(term518326, term518326.getClass(), "subTypes", null);
        setBooleanField(term518326, term518326.getClass(), "nativeType", false);
        term518910 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term518910, term518910.getClass(), "ownerFunction", null);
        setBooleanField(term518910, term518910.getClass(), "unknown", false);
        setField(term518910, term518910.getClass(), "subTypes", null);
        setBooleanField(term518910, term518910.getClass(), "nativeType", false);
        Class<? extends Object> term519736 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term519735 = ((Class) term519736).getDeclaredField((String) "ORDINARY");
        ((Field) term519735).setAccessible(true);
        Object enum852 = ((Field) term519735).get((Object) null);
        term519418 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term519419 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term519422 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term519418, term519418.getClass(), "call", null);
        setField(term519419, term519419.getClass(), "name", "prototype");
        setField(term519422, term519422.getClass(), "call", null);
        setField(term519422, term519422.getClass(), "prototypeSlot", null);
        setField(term519422, term519422.getClass(), "kind", null);
        setField(term519422, term519422.getClass(), "propAccess", null);
        setField(term519422, term519422.getClass(), "typeOfThis", null);
        setField(term519422, term519422.getClass(), "source", null);
        setField(term519422, term519422.getClass(), "implementedInterfaces", null);
        setField(term519422, term519422.getClass(), "extendedInterfaces", null);
        setField(term519422, term519422.getClass(), "subTypes", null);
        setField(term519422, term519422.getClass(), "templateTypeNames", null);
        setField(term519422, term519422.getClass(), "className", null);
        setField(term519422, term519422.getClass(), "properties", null);
        setBooleanField(term519422, term519422.getClass(), "nativeType", false);
        setField(term519422, term519422.getClass(), "implicitPrototypeFallback", null);
        setField(term519422, term519422.getClass(), "ownerFunction", term519418);
        setBooleanField(term519422, term519422.getClass(), "prettyPrint", false);
        setBooleanField(term519422, term519422.getClass(), "visited", false);
        setField(term519422, term519422.getClass(), "docInfo", null);
        setBooleanField(term519422, term519422.getClass(), "unknown", true);
        setBooleanField(term519422, term519422.getClass(), "resolved", false);
        setField(term519422, term519422.getClass(), "resolveResult", null);
        setBooleanField(term519422, term519422.getClass(), "inTemplatedCheckVisit", false);
        setField(term519422, term519422.getClass(), "registry", null);
        setField(term519419, term519419.getClass(), "type", term519422);
        setBooleanField(term519419, term519419.getClass(), "inferred", true);
        setField(term519419, term519419.getClass(), "propertyNode", null);
        setField(term519419, term519419.getClass(), "docInfo", null);
        setField(term519418, term519418.getClass(), "prototypeSlot", term519419);
        setField(term519418, term519418.getClass(), "kind", enum852);
        setField(term519418, term519418.getClass(), "propAccess", null);
        setField(term519418, term519418.getClass(), "typeOfThis", null);
        setField(term519418, term519418.getClass(), "source", null);
        setField(term519418, term519418.getClass(), "implementedInterfaces", null);
        setField(term519418, term519418.getClass(), "extendedInterfaces", null);
        setField(term519418, term519418.getClass(), "subTypes", null);
        setField(term519418, term519418.getClass(), "templateTypeNames", null);
        setField(term519418, term519418.getClass(), "className", null);
        setField(term519418, term519418.getClass(), "properties", null);
        setBooleanField(term519418, term519418.getClass(), "nativeType", false);
        setField(term519418, term519418.getClass(), "implicitPrototypeFallback", null);
        setField(term519418, term519418.getClass(), "ownerFunction", null);
        setBooleanField(term519418, term519418.getClass(), "prettyPrint", false);
        setBooleanField(term519418, term519418.getClass(), "visited", false);
        setField(term519418, term519418.getClass(), "docInfo", null);
        setBooleanField(term519418, term519418.getClass(), "unknown", true);
        setBooleanField(term519418, term519418.getClass(), "resolved", false);
        setField(term519418, term519418.getClass(), "resolveResult", null);
        setBooleanField(term519418, term519418.getClass(), "inTemplatedCheckVisit", false);
        setField(term519418, term519418.getClass(), "registry", null);
        Class<? extends Object> term520036 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term520035 = ((Class) term520036).getDeclaredField((String) "ORDINARY");
        ((Field) term520035).setAccessible(true);
        Object enum853 = ((Field) term520035).get((Object) null);
        term519426 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term519427 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        Object term519428 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term519426, term519426.getClass(), "call", null);
        setField(term519426, term519426.getClass(), "prototypeSlot", null);
        setField(term519426, term519426.getClass(), "kind", null);
        setField(term519426, term519426.getClass(), "propAccess", null);
        setField(term519426, term519426.getClass(), "typeOfThis", null);
        setField(term519426, term519426.getClass(), "source", null);
        setField(term519426, term519426.getClass(), "implementedInterfaces", null);
        setField(term519426, term519426.getClass(), "extendedInterfaces", null);
        setField(term519426, term519426.getClass(), "subTypes", null);
        setField(term519426, term519426.getClass(), "templateTypeNames", null);
        setField(term519426, term519426.getClass(), "className", null);
        setField(term519426, term519426.getClass(), "properties", null);
        setBooleanField(term519426, term519426.getClass(), "nativeType", false);
        setField(term519426, term519426.getClass(), "implicitPrototypeFallback", null);
        setField(term519427, term519427.getClass(), "call", null);
        setField(term519428, term519428.getClass(), "name", "prototype");
        setField(term519428, term519428.getClass(), "type", term519426);
        setBooleanField(term519428, term519428.getClass(), "inferred", true);
        setField(term519428, term519428.getClass(), "propertyNode", null);
        setField(term519428, term519428.getClass(), "docInfo", null);
        setField(term519427, term519427.getClass(), "prototypeSlot", term519428);
        setField(term519427, term519427.getClass(), "kind", enum853);
        setField(term519427, term519427.getClass(), "propAccess", null);
        setField(term519427, term519427.getClass(), "typeOfThis", null);
        setField(term519427, term519427.getClass(), "source", null);
        setField(term519427, term519427.getClass(), "implementedInterfaces", null);
        setField(term519427, term519427.getClass(), "extendedInterfaces", null);
        setField(term519427, term519427.getClass(), "subTypes", null);
        setField(term519427, term519427.getClass(), "templateTypeNames", null);
        setField(term519427, term519427.getClass(), "className", null);
        setField(term519427, term519427.getClass(), "properties", null);
        setBooleanField(term519427, term519427.getClass(), "nativeType", false);
        setField(term519427, term519427.getClass(), "implicitPrototypeFallback", null);
        setField(term519427, term519427.getClass(), "ownerFunction", null);
        setBooleanField(term519427, term519427.getClass(), "prettyPrint", false);
        setBooleanField(term519427, term519427.getClass(), "visited", false);
        setField(term519427, term519427.getClass(), "docInfo", null);
        setBooleanField(term519427, term519427.getClass(), "unknown", true);
        setBooleanField(term519427, term519427.getClass(), "resolved", false);
        setField(term519427, term519427.getClass(), "resolveResult", null);
        setBooleanField(term519427, term519427.getClass(), "inTemplatedCheckVisit", false);
        setField(term519427, term519427.getClass(), "registry", null);
        setField(term519426, term519426.getClass(), "ownerFunction", term519427);
        setBooleanField(term519426, term519426.getClass(), "prettyPrint", false);
        setBooleanField(term519426, term519426.getClass(), "visited", false);
        setField(term519426, term519426.getClass(), "docInfo", null);
        setBooleanField(term519426, term519426.getClass(), "unknown", true);
        setBooleanField(term519426, term519426.getClass(), "resolved", false);
        setField(term519426, term519426.getClass(), "resolveResult", null);
        setBooleanField(term519426, term519426.getClass(), "inTemplatedCheckVisit", false);
        setField(term519426, term519426.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term518910;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototypeNoCheck", argTypes, term518326, args);
        assertTrue(recursiveEquals(term518326, term519418));
        assertTrue(recursiveEquals(term518910, term519426));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


