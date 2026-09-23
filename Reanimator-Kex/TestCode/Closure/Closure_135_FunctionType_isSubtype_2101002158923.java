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

public class FunctionType_isSubtype_2101002158923 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1001961;
     Object term1002421;
     Object term1003432;
     Object term1003438;

    public FunctionType_isSubtype_2101002158923() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1003445 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1003444 = ((Class) term1003445).getDeclaredField((String) "ORDINARY");
        ((Field) term1003444).setAccessible(true);
        Object enum1873 = ((Field) term1003444).get((Object) null);
        term1001961 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1002217 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1002311 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term1001961, term1001961.getClass(), "kind", enum1873);
        setField(term1001961, term1001961.getClass(), "typeOfThis", term1002217);
        setField(term1001961, term1001961.getClass(), "call", term1002311);
        Class<? extends Object> term1003736 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1003735 = ((Class) term1003736).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1003735).setAccessible(true);
        Object enum1874 = ((Field) term1003735).get((Object) null);
        term1002421 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1002675 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term1002421, term1002421.getClass(), "kind", enum1874);
        setField(term1002421, term1002421.getClass(), "typeOfThis", term1002675);
        setField(term1002421, term1002421.getClass(), "call", null);
        Class<? extends Object> term1004036 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1004035 = ((Class) term1004036).getDeclaredField((String) "ORDINARY");
        ((Field) term1004035).setAccessible(true);
        Object enum1875 = ((Field) term1004035).get((Object) null);
        term1003432 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term1003433 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term1003437 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term1003432, term1003432.getClass(), "this$0", null);
        setField(term1003433, term1003433.getClass(), "parameters", null);
        setField(term1003433, term1003433.getClass(), "returnType", null);
        setBooleanField(term1003433, term1003433.getClass(), "resolved", false);
        setField(term1003433, term1003433.getClass(), "resolveResult", null);
        setField(term1003433, term1003433.getClass(), "registry", null);
        setField(term1003432, term1003432.getClass(), "call", term1003433);
        setField(term1003432, term1003432.getClass(), "prototype", null);
        setField(term1003432, term1003432.getClass(), "kind", enum1875);
        setField(term1003437, term1003437.getClass(), "this$0", null);
        setField(term1003437, term1003437.getClass(), "call", null);
        setField(term1003437, term1003437.getClass(), "prototype", null);
        setField(term1003437, term1003437.getClass(), "kind", null);
        setField(term1003437, term1003437.getClass(), "typeOfThis", null);
        setField(term1003437, term1003437.getClass(), "source", null);
        setField(term1003437, term1003437.getClass(), "implementedInterfaces", null);
        setField(term1003437, term1003437.getClass(), "subTypes", null);
        setField(term1003437, term1003437.getClass(), "templateTypeName", null);
        setField(term1003437, term1003437.getClass(), "className", null);
        setField(term1003437, term1003437.getClass(), "properties", null);
        setField(term1003437, term1003437.getClass(), "implicitPrototype", null);
        setBooleanField(term1003437, term1003437.getClass(), "nativeType", false);
        setBooleanField(term1003437, term1003437.getClass(), "visited", false);
        setField(term1003437, term1003437.getClass(), "docInfo", null);
        setBooleanField(term1003437, term1003437.getClass(), "unknown", false);
        setBooleanField(term1003437, term1003437.getClass(), "resolved", false);
        setField(term1003437, term1003437.getClass(), "resolveResult", null);
        setField(term1003437, term1003437.getClass(), "registry", null);
        setField(term1003432, term1003432.getClass(), "typeOfThis", term1003437);
        setField(term1003432, term1003432.getClass(), "source", null);
        setField(term1003432, term1003432.getClass(), "implementedInterfaces", null);
        setField(term1003432, term1003432.getClass(), "subTypes", null);
        setField(term1003432, term1003432.getClass(), "templateTypeName", null);
        setField(term1003432, term1003432.getClass(), "className", null);
        setField(term1003432, term1003432.getClass(), "properties", null);
        setField(term1003432, term1003432.getClass(), "implicitPrototype", null);
        setBooleanField(term1003432, term1003432.getClass(), "nativeType", false);
        setBooleanField(term1003432, term1003432.getClass(), "visited", false);
        setField(term1003432, term1003432.getClass(), "docInfo", null);
        setBooleanField(term1003432, term1003432.getClass(), "unknown", false);
        setBooleanField(term1003432, term1003432.getClass(), "resolved", false);
        setField(term1003432, term1003432.getClass(), "resolveResult", null);
        setField(term1003432, term1003432.getClass(), "registry", null);
        Class<? extends Object> term1004327 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1004326 = ((Class) term1004327).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1004326).setAccessible(true);
        Object enum1876 = ((Field) term1004326).get((Object) null);
        term1003438 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term1003442 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        setField(term1003438, term1003438.getClass(), "call", null);
        setField(term1003438, term1003438.getClass(), "prototype", null);
        setField(term1003438, term1003438.getClass(), "kind", enum1876);
        setField(term1003442, term1003442.getClass(), "referencedType", null);
        setBooleanField(term1003442, term1003442.getClass(), "visited", false);
        setField(term1003442, term1003442.getClass(), "docInfo", null);
        setBooleanField(term1003442, term1003442.getClass(), "unknown", false);
        setBooleanField(term1003442, term1003442.getClass(), "resolved", false);
        setField(term1003442, term1003442.getClass(), "resolveResult", null);
        setField(term1003442, term1003442.getClass(), "registry", null);
        setField(term1003438, term1003438.getClass(), "typeOfThis", term1003442);
        setField(term1003438, term1003438.getClass(), "source", null);
        setField(term1003438, term1003438.getClass(), "implementedInterfaces", null);
        setField(term1003438, term1003438.getClass(), "subTypes", null);
        setField(term1003438, term1003438.getClass(), "templateTypeName", null);
        setField(term1003438, term1003438.getClass(), "className", null);
        setField(term1003438, term1003438.getClass(), "properties", null);
        setField(term1003438, term1003438.getClass(), "implicitPrototype", null);
        setBooleanField(term1003438, term1003438.getClass(), "nativeType", false);
        setBooleanField(term1003438, term1003438.getClass(), "visited", false);
        setField(term1003438, term1003438.getClass(), "docInfo", null);
        setBooleanField(term1003438, term1003438.getClass(), "unknown", false);
        setBooleanField(term1003438, term1003438.getClass(), "resolved", false);
        setField(term1003438, term1003438.getClass(), "resolveResult", null);
        setField(term1003438, term1003438.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1002421;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1001961, args);
        assertTrue(recursiveEquals(term1001961, term1003432));
        assertTrue(recursiveEquals(term1002421, term1003438));
        assertTrue(recursiveEquals(retValue, false));
    }

};


