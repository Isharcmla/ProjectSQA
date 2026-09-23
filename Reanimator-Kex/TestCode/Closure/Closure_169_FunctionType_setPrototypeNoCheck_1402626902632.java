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

public class FunctionType_setPrototypeNoCheck_1402626902632 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term607079;
     Object term607553;
     Object term608130;
     Object term608137;

    public FunctionType_setPrototypeNoCheck_1402626902632() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term608146 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term608145 = ((Class) term608146).getDeclaredField((String) "ORDINARY");
        ((Field) term608145).setAccessible(true);
        Object enum987 = ((Field) term608145).get((Object) null);
        term607079 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term607193 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term607301 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term607301, term607301.getClass(), "ownerFunction", null);
        setField(term607193, term607193.getClass(), "type", term607301);
        setField(term607079, term607079.getClass(), "prototypeSlot", term607193);
        setField(term607079, term607079.getClass(), "source", null);
        setField(term607079, term607079.getClass(), "kind", enum987);
        setBooleanField(term607079, term607079.getClass(), "unknown", false);
        setField(term607079, term607079.getClass(), "subTypes", null);
        setBooleanField(term607079, term607079.getClass(), "nativeType", false);
        term607553 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term607553, term607553.getClass(), "ownerFunction", null);
        setBooleanField(term607553, term607553.getClass(), "unknown", false);
        setField(term607553, term607553.getClass(), "subTypes", null);
        setBooleanField(term607553, term607553.getClass(), "nativeType", false);
        setField(term607553, term607553.getClass(), "kind", enum987);
        Class<? extends Object> term608446 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term608445 = ((Class) term608446).getDeclaredField((String) "INTERFACE");
        ((Field) term608445).setAccessible(true);
        Object enum988 = ((Field) term608445).get((Object) null);
        term608130 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term608131 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term608134 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term608130, term608130.getClass(), "call", null);
        setField(term608131, term608131.getClass(), "name", "prototype");
        setField(term608134, term608134.getClass(), "call", null);
        setField(term608134, term608134.getClass(), "prototypeSlot", null);
        setField(term608134, term608134.getClass(), "kind", enum988);
        setField(term608134, term608134.getClass(), "propAccess", null);
        setField(term608134, term608134.getClass(), "typeOfThis", null);
        setField(term608134, term608134.getClass(), "source", null);
        setField(term608134, term608134.getClass(), "implementedInterfaces", null);
        setField(term608134, term608134.getClass(), "extendedInterfaces", null);
        setField(term608134, term608134.getClass(), "subTypes", null);
        setField(term608134, term608134.getClass(), "templateTypeNames", null);
        setField(term608134, term608134.getClass(), "className", null);
        setField(term608134, term608134.getClass(), "properties", null);
        setBooleanField(term608134, term608134.getClass(), "nativeType", false);
        setField(term608134, term608134.getClass(), "implicitPrototypeFallback", null);
        setField(term608134, term608134.getClass(), "ownerFunction", term608130);
        setBooleanField(term608134, term608134.getClass(), "prettyPrint", false);
        setBooleanField(term608134, term608134.getClass(), "visited", false);
        setField(term608134, term608134.getClass(), "docInfo", null);
        setBooleanField(term608134, term608134.getClass(), "unknown", true);
        setBooleanField(term608134, term608134.getClass(), "resolved", false);
        setField(term608134, term608134.getClass(), "resolveResult", null);
        setBooleanField(term608134, term608134.getClass(), "inTemplatedCheckVisit", false);
        setField(term608134, term608134.getClass(), "registry", null);
        setField(term608131, term608131.getClass(), "type", term608134);
        setBooleanField(term608131, term608131.getClass(), "inferred", true);
        setField(term608131, term608131.getClass(), "propertyNode", null);
        setField(term608131, term608131.getClass(), "docInfo", null);
        setField(term608130, term608130.getClass(), "prototypeSlot", term608131);
        setField(term608130, term608130.getClass(), "kind", enum988);
        setField(term608130, term608130.getClass(), "propAccess", null);
        setField(term608130, term608130.getClass(), "typeOfThis", null);
        setField(term608130, term608130.getClass(), "source", null);
        setField(term608130, term608130.getClass(), "implementedInterfaces", null);
        setField(term608130, term608130.getClass(), "extendedInterfaces", null);
        setField(term608130, term608130.getClass(), "subTypes", null);
        setField(term608130, term608130.getClass(), "templateTypeNames", null);
        setField(term608130, term608130.getClass(), "className", null);
        setField(term608130, term608130.getClass(), "properties", null);
        setBooleanField(term608130, term608130.getClass(), "nativeType", false);
        setField(term608130, term608130.getClass(), "implicitPrototypeFallback", null);
        setField(term608130, term608130.getClass(), "ownerFunction", null);
        setBooleanField(term608130, term608130.getClass(), "prettyPrint", false);
        setBooleanField(term608130, term608130.getClass(), "visited", false);
        setField(term608130, term608130.getClass(), "docInfo", null);
        setBooleanField(term608130, term608130.getClass(), "unknown", true);
        setBooleanField(term608130, term608130.getClass(), "resolved", false);
        setField(term608130, term608130.getClass(), "resolveResult", null);
        setBooleanField(term608130, term608130.getClass(), "inTemplatedCheckVisit", false);
        setField(term608130, term608130.getClass(), "registry", null);
        Class<? extends Object> term608740 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term608739 = ((Class) term608740).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term608739).setAccessible(true);
        Object enum989 = ((Field) term608739).get((Object) null);
        term608137 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term608140 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term608141 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term608137, term608137.getClass(), "call", null);
        setField(term608137, term608137.getClass(), "prototypeSlot", null);
        setField(term608137, term608137.getClass(), "kind", enum989);
        setField(term608137, term608137.getClass(), "propAccess", null);
        setField(term608137, term608137.getClass(), "typeOfThis", null);
        setField(term608137, term608137.getClass(), "source", null);
        setField(term608137, term608137.getClass(), "implementedInterfaces", null);
        setField(term608137, term608137.getClass(), "extendedInterfaces", null);
        setField(term608137, term608137.getClass(), "subTypes", null);
        setField(term608137, term608137.getClass(), "templateTypeNames", null);
        setField(term608137, term608137.getClass(), "className", null);
        setField(term608137, term608137.getClass(), "properties", null);
        setBooleanField(term608137, term608137.getClass(), "nativeType", false);
        setField(term608137, term608137.getClass(), "implicitPrototypeFallback", null);
        setField(term608140, term608140.getClass(), "call", null);
        setField(term608141, term608141.getClass(), "name", "prototype");
        setField(term608141, term608141.getClass(), "type", term608137);
        setBooleanField(term608141, term608141.getClass(), "inferred", true);
        setField(term608141, term608141.getClass(), "propertyNode", null);
        setField(term608141, term608141.getClass(), "docInfo", null);
        setField(term608140, term608140.getClass(), "prototypeSlot", term608141);
        setField(term608140, term608140.getClass(), "kind", enum989);
        setField(term608140, term608140.getClass(), "propAccess", null);
        setField(term608140, term608140.getClass(), "typeOfThis", null);
        setField(term608140, term608140.getClass(), "source", null);
        setField(term608140, term608140.getClass(), "implementedInterfaces", null);
        setField(term608140, term608140.getClass(), "extendedInterfaces", null);
        setField(term608140, term608140.getClass(), "subTypes", null);
        setField(term608140, term608140.getClass(), "templateTypeNames", null);
        setField(term608140, term608140.getClass(), "className", null);
        setField(term608140, term608140.getClass(), "properties", null);
        setBooleanField(term608140, term608140.getClass(), "nativeType", false);
        setField(term608140, term608140.getClass(), "implicitPrototypeFallback", null);
        setField(term608140, term608140.getClass(), "ownerFunction", null);
        setBooleanField(term608140, term608140.getClass(), "prettyPrint", false);
        setBooleanField(term608140, term608140.getClass(), "visited", false);
        setField(term608140, term608140.getClass(), "docInfo", null);
        setBooleanField(term608140, term608140.getClass(), "unknown", true);
        setBooleanField(term608140, term608140.getClass(), "resolved", false);
        setField(term608140, term608140.getClass(), "resolveResult", null);
        setBooleanField(term608140, term608140.getClass(), "inTemplatedCheckVisit", false);
        setField(term608140, term608140.getClass(), "registry", null);
        setField(term608137, term608137.getClass(), "ownerFunction", term608140);
        setBooleanField(term608137, term608137.getClass(), "prettyPrint", false);
        setBooleanField(term608137, term608137.getClass(), "visited", false);
        setField(term608137, term608137.getClass(), "docInfo", null);
        setBooleanField(term608137, term608137.getClass(), "unknown", true);
        setBooleanField(term608137, term608137.getClass(), "resolved", false);
        setField(term608137, term608137.getClass(), "resolveResult", null);
        setBooleanField(term608137, term608137.getClass(), "inTemplatedCheckVisit", false);
        setField(term608137, term608137.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term607553;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototypeNoCheck", argTypes, term607079, args);
        assertTrue(recursiveEquals(term607079, term608130));
        assertTrue(recursiveEquals(term607553, term608137));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


