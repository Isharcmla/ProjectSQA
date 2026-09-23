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

public class FunctionType_isSubtype_21010021581550 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2055647;
     Object term2056307;
     Object term2058745;
     Object term2058750;

    public FunctionType_isSubtype_21010021581550() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term2058758 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2058757 = ((Class) term2058758).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term2058757).setAccessible(true);
        Object enum3833 = ((Field) term2058757).get((Object) null);
        term2055647 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2056199 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2055647, term2055647.getClass(), "kind", enum3833);
        setField(term2056199, term2056199.getClass(), "kind", enum3833);
        setField(term2056199, term2056199.getClass(), "typeOfThis", term2055647);
        setField(term2055647, term2055647.getClass(), "typeOfThis", term2056199);
        Class<? extends Object> term2059058 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2059057 = ((Class) term2059058).getDeclaredField((String) "INTERFACE");
        ((Field) term2059057).setAccessible(true);
        Object enum3834 = ((Field) term2059057).get((Object) null);
        term2056307 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2056637 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2056737 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term2056307, term2056307.getClass(), "kind", enum3833);
        setField(term2056637, term2056637.getClass(), "kind", enum3834);
        setField(term2056637, term2056637.getClass(), "typeOfThis", term2056737);
        setField(term2056307, term2056307.getClass(), "typeOfThis", term2056637);
        Class<? extends Object> term2059352 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2059351 = ((Class) term2059352).getDeclaredField((String) "INTERFACE");
        ((Field) term2059351).setAccessible(true);
        Object enum3835 = ((Field) term2059351).get((Object) null);
        term2058745 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2058749 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term2058745, term2058745.getClass(), "call", null);
        setField(term2058745, term2058745.getClass(), "prototype", null);
        setField(term2058745, term2058745.getClass(), "kind", enum3835);
        setField(term2058749, term2058749.getClass(), "this$0", null);
        setField(term2058749, term2058749.getClass(), "call", null);
        setField(term2058749, term2058749.getClass(), "prototype", null);
        setField(term2058749, term2058749.getClass(), "kind", enum3835);
        setField(term2058749, term2058749.getClass(), "typeOfThis", term2058745);
        setField(term2058749, term2058749.getClass(), "source", null);
        setField(term2058749, term2058749.getClass(), "implementedInterfaces", null);
        setField(term2058749, term2058749.getClass(), "subTypes", null);
        setField(term2058749, term2058749.getClass(), "templateTypeName", null);
        setField(term2058749, term2058749.getClass(), "className", null);
        setField(term2058749, term2058749.getClass(), "properties", null);
        setField(term2058749, term2058749.getClass(), "implicitPrototype", null);
        setBooleanField(term2058749, term2058749.getClass(), "nativeType", false);
        setBooleanField(term2058749, term2058749.getClass(), "visited", false);
        setField(term2058749, term2058749.getClass(), "docInfo", null);
        setBooleanField(term2058749, term2058749.getClass(), "unknown", false);
        setBooleanField(term2058749, term2058749.getClass(), "resolved", false);
        setField(term2058749, term2058749.getClass(), "resolveResult", null);
        setField(term2058749, term2058749.getClass(), "registry", null);
        setField(term2058745, term2058745.getClass(), "typeOfThis", term2058749);
        setField(term2058745, term2058745.getClass(), "source", null);
        setField(term2058745, term2058745.getClass(), "implementedInterfaces", null);
        setField(term2058745, term2058745.getClass(), "subTypes", null);
        setField(term2058745, term2058745.getClass(), "templateTypeName", null);
        setField(term2058745, term2058745.getClass(), "className", null);
        setField(term2058745, term2058745.getClass(), "properties", null);
        setField(term2058745, term2058745.getClass(), "implicitPrototype", null);
        setBooleanField(term2058745, term2058745.getClass(), "nativeType", false);
        setBooleanField(term2058745, term2058745.getClass(), "visited", false);
        setField(term2058745, term2058745.getClass(), "docInfo", null);
        setBooleanField(term2058745, term2058745.getClass(), "unknown", false);
        setBooleanField(term2058745, term2058745.getClass(), "resolved", false);
        setField(term2058745, term2058745.getClass(), "resolveResult", null);
        setField(term2058745, term2058745.getClass(), "registry", null);
        Class<? extends Object> term2059646 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term2059645 = ((Class) term2059646).getDeclaredField((String) "INTERFACE");
        ((Field) term2059645).setAccessible(true);
        Object enum3836 = ((Field) term2059645).get((Object) null);
        term2058750 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term2058754 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term2058755 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term2058750, term2058750.getClass(), "this$0", null);
        setField(term2058750, term2058750.getClass(), "call", null);
        setField(term2058750, term2058750.getClass(), "prototype", null);
        setField(term2058750, term2058750.getClass(), "kind", enum3836);
        setField(term2058754, term2058754.getClass(), "this$0", null);
        setField(term2058754, term2058754.getClass(), "call", null);
        setField(term2058754, term2058754.getClass(), "prototype", null);
        setField(term2058754, term2058754.getClass(), "kind", enum3836);
        setField(term2058755, term2058755.getClass(), "leastSupertypeVisitor", null);
        setField(term2058755, term2058755.getClass(), "greatestSubtypeVisitor", null);
        setField(term2058755, term2058755.getClass(), "call", null);
        setField(term2058755, term2058755.getClass(), "prototype", null);
        setField(term2058755, term2058755.getClass(), "kind", null);
        setField(term2058755, term2058755.getClass(), "typeOfThis", null);
        setField(term2058755, term2058755.getClass(), "source", null);
        setField(term2058755, term2058755.getClass(), "implementedInterfaces", null);
        setField(term2058755, term2058755.getClass(), "subTypes", null);
        setField(term2058755, term2058755.getClass(), "templateTypeName", null);
        setField(term2058755, term2058755.getClass(), "className", null);
        setField(term2058755, term2058755.getClass(), "properties", null);
        setField(term2058755, term2058755.getClass(), "implicitPrototype", null);
        setBooleanField(term2058755, term2058755.getClass(), "nativeType", false);
        setBooleanField(term2058755, term2058755.getClass(), "visited", false);
        setField(term2058755, term2058755.getClass(), "docInfo", null);
        setBooleanField(term2058755, term2058755.getClass(), "unknown", false);
        setBooleanField(term2058755, term2058755.getClass(), "resolved", false);
        setField(term2058755, term2058755.getClass(), "resolveResult", null);
        setField(term2058755, term2058755.getClass(), "registry", null);
        setField(term2058754, term2058754.getClass(), "typeOfThis", term2058755);
        setField(term2058754, term2058754.getClass(), "source", null);
        setField(term2058754, term2058754.getClass(), "implementedInterfaces", null);
        setField(term2058754, term2058754.getClass(), "subTypes", null);
        setField(term2058754, term2058754.getClass(), "templateTypeName", null);
        setField(term2058754, term2058754.getClass(), "className", null);
        setField(term2058754, term2058754.getClass(), "properties", null);
        setField(term2058754, term2058754.getClass(), "implicitPrototype", null);
        setBooleanField(term2058754, term2058754.getClass(), "nativeType", false);
        setBooleanField(term2058754, term2058754.getClass(), "visited", false);
        setField(term2058754, term2058754.getClass(), "docInfo", null);
        setBooleanField(term2058754, term2058754.getClass(), "unknown", false);
        setBooleanField(term2058754, term2058754.getClass(), "resolved", false);
        setField(term2058754, term2058754.getClass(), "resolveResult", null);
        setField(term2058754, term2058754.getClass(), "registry", null);
        setField(term2058750, term2058750.getClass(), "typeOfThis", term2058754);
        setField(term2058750, term2058750.getClass(), "source", null);
        setField(term2058750, term2058750.getClass(), "implementedInterfaces", null);
        setField(term2058750, term2058750.getClass(), "subTypes", null);
        setField(term2058750, term2058750.getClass(), "templateTypeName", null);
        setField(term2058750, term2058750.getClass(), "className", null);
        setField(term2058750, term2058750.getClass(), "properties", null);
        setField(term2058750, term2058750.getClass(), "implicitPrototype", null);
        setBooleanField(term2058750, term2058750.getClass(), "nativeType", false);
        setBooleanField(term2058750, term2058750.getClass(), "visited", false);
        setField(term2058750, term2058750.getClass(), "docInfo", null);
        setBooleanField(term2058750, term2058750.getClass(), "unknown", false);
        setBooleanField(term2058750, term2058750.getClass(), "resolved", false);
        setField(term2058750, term2058750.getClass(), "resolveResult", null);
        setField(term2058750, term2058750.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term2056307;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term2055647, args);
        assertTrue(recursiveEquals(term2055647, term2058745));
        assertTrue(recursiveEquals(term2056307, term2058750));
        assertTrue(recursiveEquals(retValue, true));
    }

};


