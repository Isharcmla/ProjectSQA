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

public class FunctionType_getSuperClassConstructor_1927670470259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term254150;
     Object term254872;

    public FunctionType_getSuperClassConstructor_1927670470259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term254879 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term254878 = ((Class) term254879).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term254878).setAccessible(true);
        Object enum462 = ((Field) term254878).get((Object) null);
        term254150 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term254412 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term254518 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term254150, term254150.getClass(), "kind", enum462);
        setField(term254412, term254412.getClass(), "type", term254518);
        setField(term254150, term254150.getClass(), "prototypeSlot", term254412);
        Class<? extends Object> term255179 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term255178 = ((Class) term255179).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term255178).setAccessible(true);
        Object enum463 = ((Field) term255178).get((Object) null);
        term254872 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term254873 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term254874 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term254872, term254872.getClass(), "call", null);
        setField(term254873, term254873.getClass(), "name", null);
        setField(term254874, term254874.getClass(), "primitiveType", null);
        setField(term254874, term254874.getClass(), "primitiveObjectType", null);
        setField(term254874, term254874.getClass(), "name", null);
        setBooleanField(term254874, term254874.getClass(), "visited", false);
        setField(term254874, term254874.getClass(), "docInfo", null);
        setBooleanField(term254874, term254874.getClass(), "unknown", false);
        setBooleanField(term254874, term254874.getClass(), "resolved", false);
        setField(term254874, term254874.getClass(), "resolveResult", null);
        setBooleanField(term254874, term254874.getClass(), "inTemplatedCheckVisit", false);
        setField(term254874, term254874.getClass(), "registry", null);
        setField(term254873, term254873.getClass(), "type", term254874);
        setBooleanField(term254873, term254873.getClass(), "inferred", false);
        setField(term254873, term254873.getClass(), "propertyNode", null);
        setField(term254873, term254873.getClass(), "docInfo", null);
        setField(term254872, term254872.getClass(), "prototypeSlot", term254873);
        setField(term254872, term254872.getClass(), "kind", enum463);
        setField(term254872, term254872.getClass(), "propAccess", null);
        setField(term254872, term254872.getClass(), "typeOfThis", null);
        setField(term254872, term254872.getClass(), "source", null);
        setField(term254872, term254872.getClass(), "implementedInterfaces", null);
        setField(term254872, term254872.getClass(), "extendedInterfaces", null);
        setField(term254872, term254872.getClass(), "subTypes", null);
        setField(term254872, term254872.getClass(), "templateTypeNames", null);
        setField(term254872, term254872.getClass(), "className", null);
        setField(term254872, term254872.getClass(), "properties", null);
        setBooleanField(term254872, term254872.getClass(), "nativeType", false);
        setField(term254872, term254872.getClass(), "implicitPrototypeFallback", null);
        setField(term254872, term254872.getClass(), "ownerFunction", null);
        setBooleanField(term254872, term254872.getClass(), "prettyPrint", false);
        setBooleanField(term254872, term254872.getClass(), "visited", false);
        setField(term254872, term254872.getClass(), "docInfo", null);
        setBooleanField(term254872, term254872.getClass(), "unknown", false);
        setBooleanField(term254872, term254872.getClass(), "resolved", false);
        setField(term254872, term254872.getClass(), "resolveResult", null);
        setBooleanField(term254872, term254872.getClass(), "inTemplatedCheckVisit", false);
        setField(term254872, term254872.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSuperClassConstructor", argTypes, term254150, args);
        assertTrue(recursiveEquals(term254150, term254872));
        assertTrue(recursiveEquals(retValue, null));
    }

};


