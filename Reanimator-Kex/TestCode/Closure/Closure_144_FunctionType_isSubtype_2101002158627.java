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

public class FunctionType_isSubtype_2101002158627 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term619688;
     Object term620138;
     Object term621032;
     Object term621038;

    public FunctionType_isSubtype_2101002158627() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term621044 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term621043 = ((Class) term621044).getDeclaredField((String) "ORDINARY");
        ((Field) term621043).setAccessible(true);
        Object enum1122 = ((Field) term621043).get((Object) null);
        term619688 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term619936 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term620030 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term619688, term619688.getClass(), "kind", enum1122);
        setField(term619688, term619688.getClass(), "typeOfThis", term619936);
        setField(term619688, term619688.getClass(), "call", term620030);
        Class<? extends Object> term621335 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term621334 = ((Class) term621335).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term621334).setAccessible(true);
        Object enum1123 = ((Field) term621334).get((Object) null);
        term620138 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term620138, term620138.getClass(), "kind", enum1123);
        setField(term620138, term620138.getClass(), "typeOfThis", null);
        setField(term620138, term620138.getClass(), "call", null);
        Class<? extends Object> term621635 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term621634 = ((Class) term621635).getDeclaredField((String) "ORDINARY");
        ((Field) term621634).setAccessible(true);
        Object enum1124 = ((Field) term621634).get((Object) null);
        term621032 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term621033 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term621037 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term621032, term621032.getClass(), "this$0", null);
        setField(term621033, term621033.getClass(), "parameters", null);
        setField(term621033, term621033.getClass(), "returnType", null);
        setBooleanField(term621033, term621033.getClass(), "returnTypeInferred", false);
        setBooleanField(term621033, term621033.getClass(), "resolved", false);
        setField(term621033, term621033.getClass(), "resolveResult", null);
        setField(term621033, term621033.getClass(), "registry", null);
        setField(term621032, term621032.getClass(), "call", term621033);
        setField(term621032, term621032.getClass(), "prototype", null);
        setField(term621032, term621032.getClass(), "kind", enum1124);
        setField(term621037, term621037.getClass(), "leastSupertypeVisitor", null);
        setField(term621037, term621037.getClass(), "greatestSubtypeVisitor", null);
        setField(term621037, term621037.getClass(), "call", null);
        setField(term621037, term621037.getClass(), "prototype", null);
        setField(term621037, term621037.getClass(), "kind", null);
        setField(term621037, term621037.getClass(), "typeOfThis", null);
        setField(term621037, term621037.getClass(), "source", null);
        setField(term621037, term621037.getClass(), "implementedInterfaces", null);
        setField(term621037, term621037.getClass(), "subTypes", null);
        setField(term621037, term621037.getClass(), "templateTypeName", null);
        setField(term621037, term621037.getClass(), "className", null);
        setField(term621037, term621037.getClass(), "properties", null);
        setField(term621037, term621037.getClass(), "implicitPrototype", null);
        setBooleanField(term621037, term621037.getClass(), "nativeType", false);
        setBooleanField(term621037, term621037.getClass(), "prettyPrint", false);
        setBooleanField(term621037, term621037.getClass(), "visited", false);
        setField(term621037, term621037.getClass(), "docInfo", null);
        setBooleanField(term621037, term621037.getClass(), "unknown", false);
        setBooleanField(term621037, term621037.getClass(), "resolved", false);
        setField(term621037, term621037.getClass(), "resolveResult", null);
        setField(term621037, term621037.getClass(), "registry", null);
        setField(term621032, term621032.getClass(), "typeOfThis", term621037);
        setField(term621032, term621032.getClass(), "source", null);
        setField(term621032, term621032.getClass(), "implementedInterfaces", null);
        setField(term621032, term621032.getClass(), "subTypes", null);
        setField(term621032, term621032.getClass(), "templateTypeName", null);
        setField(term621032, term621032.getClass(), "className", null);
        setField(term621032, term621032.getClass(), "properties", null);
        setField(term621032, term621032.getClass(), "implicitPrototype", null);
        setBooleanField(term621032, term621032.getClass(), "nativeType", false);
        setBooleanField(term621032, term621032.getClass(), "prettyPrint", false);
        setBooleanField(term621032, term621032.getClass(), "visited", false);
        setField(term621032, term621032.getClass(), "docInfo", null);
        setBooleanField(term621032, term621032.getClass(), "unknown", false);
        setBooleanField(term621032, term621032.getClass(), "resolved", false);
        setField(term621032, term621032.getClass(), "resolveResult", null);
        setField(term621032, term621032.getClass(), "registry", null);
        Class<? extends Object> term621926 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term621925 = ((Class) term621926).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term621925).setAccessible(true);
        Object enum1125 = ((Field) term621925).get((Object) null);
        term621038 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term621038, term621038.getClass(), "this$0", null);
        setField(term621038, term621038.getClass(), "call", null);
        setField(term621038, term621038.getClass(), "prototype", null);
        setField(term621038, term621038.getClass(), "kind", enum1125);
        setField(term621038, term621038.getClass(), "typeOfThis", null);
        setField(term621038, term621038.getClass(), "source", null);
        setField(term621038, term621038.getClass(), "implementedInterfaces", null);
        setField(term621038, term621038.getClass(), "subTypes", null);
        setField(term621038, term621038.getClass(), "templateTypeName", null);
        setField(term621038, term621038.getClass(), "className", null);
        setField(term621038, term621038.getClass(), "properties", null);
        setField(term621038, term621038.getClass(), "implicitPrototype", null);
        setBooleanField(term621038, term621038.getClass(), "nativeType", false);
        setBooleanField(term621038, term621038.getClass(), "prettyPrint", false);
        setBooleanField(term621038, term621038.getClass(), "visited", false);
        setField(term621038, term621038.getClass(), "docInfo", null);
        setBooleanField(term621038, term621038.getClass(), "unknown", false);
        setBooleanField(term621038, term621038.getClass(), "resolved", false);
        setField(term621038, term621038.getClass(), "resolveResult", null);
        setField(term621038, term621038.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term620138;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term619688, args);
        assertTrue(recursiveEquals(term619688, term621032));
        assertTrue(recursiveEquals(term620138, term621038));
        assertTrue(recursiveEquals(retValue, false));
    }

};


