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

public class FunctionType_getGreatestSubtype_679591709661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term586531;
     Object term587189;
     Object term588070;
     Object term588075;
     Object term587980;

    public FunctionType_getGreatestSubtype_679591709661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term588080 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term588079 = ((Class) term588080).getDeclaredField((String) "INTERFACE");
        ((Field) term588079).setAccessible(true);
        Object enum1086 = ((Field) term588079).get((Object) null);
        term586531 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term587081 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term586531, term586531.getClass(), "kind", enum1086);
        setField(term586531, term586531.getClass(), "typeOfThis", term587081);
        term587189 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term587189, term587189.getClass(), "kind", enum1086);
        setField(term587189, term587189.getClass(), "typeOfThis", null);
        Class<? extends Object> term588374 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term588373 = ((Class) term588374).getDeclaredField((String) "INTERFACE");
        ((Field) term588373).setAccessible(true);
        Object enum1087 = ((Field) term588373).get((Object) null);
        term588070 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term588074 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term588070, term588070.getClass(), "call", null);
        setField(term588070, term588070.getClass(), "prototype", null);
        setField(term588070, term588070.getClass(), "kind", enum1087);
        setField(term588074, term588074.getClass(), "referencedType", null);
        setBooleanField(term588074, term588074.getClass(), "visited", false);
        setField(term588074, term588074.getClass(), "docInfo", null);
        setBooleanField(term588074, term588074.getClass(), "unknown", false);
        setBooleanField(term588074, term588074.getClass(), "resolved", false);
        setField(term588074, term588074.getClass(), "resolveResult", null);
        setField(term588074, term588074.getClass(), "registry", null);
        setField(term588070, term588070.getClass(), "typeOfThis", term588074);
        setField(term588070, term588070.getClass(), "source", null);
        setField(term588070, term588070.getClass(), "implementedInterfaces", null);
        setField(term588070, term588070.getClass(), "subTypes", null);
        setField(term588070, term588070.getClass(), "templateTypeName", null);
        setField(term588070, term588070.getClass(), "className", null);
        setField(term588070, term588070.getClass(), "properties", null);
        setField(term588070, term588070.getClass(), "implicitPrototype", null);
        setBooleanField(term588070, term588070.getClass(), "nativeType", false);
        setBooleanField(term588070, term588070.getClass(), "visited", false);
        setField(term588070, term588070.getClass(), "docInfo", null);
        setBooleanField(term588070, term588070.getClass(), "unknown", false);
        setBooleanField(term588070, term588070.getClass(), "resolved", false);
        setField(term588070, term588070.getClass(), "resolveResult", null);
        setField(term588070, term588070.getClass(), "registry", null);
        Class<? extends Object> term588668 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term588667 = ((Class) term588668).getDeclaredField((String) "INTERFACE");
        ((Field) term588667).setAccessible(true);
        Object enum1088 = ((Field) term588667).get((Object) null);
        term588075 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term588075, term588075.getClass(), "this$0", null);
        setField(term588075, term588075.getClass(), "call", null);
        setField(term588075, term588075.getClass(), "prototype", null);
        setField(term588075, term588075.getClass(), "kind", enum1088);
        setField(term588075, term588075.getClass(), "typeOfThis", null);
        setField(term588075, term588075.getClass(), "source", null);
        setField(term588075, term588075.getClass(), "implementedInterfaces", null);
        setField(term588075, term588075.getClass(), "subTypes", null);
        setField(term588075, term588075.getClass(), "templateTypeName", null);
        setField(term588075, term588075.getClass(), "className", null);
        setField(term588075, term588075.getClass(), "properties", null);
        setField(term588075, term588075.getClass(), "implicitPrototype", null);
        setBooleanField(term588075, term588075.getClass(), "nativeType", false);
        setBooleanField(term588075, term588075.getClass(), "visited", false);
        setField(term588075, term588075.getClass(), "docInfo", null);
        setBooleanField(term588075, term588075.getClass(), "unknown", false);
        setBooleanField(term588075, term588075.getClass(), "resolved", false);
        setField(term588075, term588075.getClass(), "resolveResult", null);
        setField(term588075, term588075.getClass(), "registry", null);
        Class<? extends Object> term588962 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term588961 = ((Class) term588962).getDeclaredField((String) "INTERFACE");
        ((Field) term588961).setAccessible(true);
        Object enum1089 = ((Field) term588961).get((Object) null);
        term587980 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term587994 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term587980, term587980.getClass(), "call", null);
        setField(term587980, term587980.getClass(), "prototype", null);
        setField(term587980, term587980.getClass(), "kind", enum1089);
        setField(term587994, term587994.getClass(), "referencedType", null);
        setBooleanField(term587994, term587994.getClass(), "visited", false);
        setField(term587994, term587994.getClass(), "docInfo", null);
        setBooleanField(term587994, term587994.getClass(), "unknown", false);
        setBooleanField(term587994, term587994.getClass(), "resolved", false);
        setField(term587994, term587994.getClass(), "resolveResult", null);
        setField(term587994, term587994.getClass(), "registry", null);
        setField(term587980, term587980.getClass(), "typeOfThis", term587994);
        setField(term587980, term587980.getClass(), "source", null);
        setField(term587980, term587980.getClass(), "implementedInterfaces", null);
        setField(term587980, term587980.getClass(), "subTypes", null);
        setField(term587980, term587980.getClass(), "templateTypeName", null);
        setField(term587980, term587980.getClass(), "className", null);
        setField(term587980, term587980.getClass(), "properties", null);
        setField(term587980, term587980.getClass(), "implicitPrototype", null);
        setBooleanField(term587980, term587980.getClass(), "nativeType", false);
        setBooleanField(term587980, term587980.getClass(), "visited", false);
        setField(term587980, term587980.getClass(), "docInfo", null);
        setBooleanField(term587980, term587980.getClass(), "unknown", false);
        setBooleanField(term587980, term587980.getClass(), "resolved", false);
        setField(term587980, term587980.getClass(), "resolveResult", null);
        setField(term587980, term587980.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term587189;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, term586531, args);
        assertTrue(recursiveEquals(term586531, term588070));
        assertTrue(recursiveEquals(term587189, term588075));
        assertTrue(recursiveEquals(retValue, term587980));
    }

};


