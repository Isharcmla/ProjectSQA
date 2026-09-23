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

public class FunctionType_isSubtype_2101002158727 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term787025;
     Object term787679;
     Object term788576;
     Object term788581;

    public FunctionType_isSubtype_2101002158727() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term788588 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term788587 = ((Class) term788588).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term788587).setAccessible(true);
        Object enum1420 = ((Field) term788587).get((Object) null);
        term787025 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term787569 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term787025, term787025.getClass(), "kind", enum1420);
        setField(term787025, term787025.getClass(), "typeOfThis", term787569);
        Class<? extends Object> term788888 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term788887 = ((Class) term788888).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term788887).setAccessible(true);
        Object enum1421 = ((Field) term788887).get((Object) null);
        term787679 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term787853 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term787679, term787679.getClass(), "kind", enum1421);
        setField(term787679, term787679.getClass(), "typeOfThis", term787853);
        Class<? extends Object> term789188 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term789187 = ((Class) term789188).getDeclaredField((String) "INTERFACE");
        ((Field) term789187).setAccessible(true);
        Object enum1422 = ((Field) term789187).get((Object) null);
        term788576 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term788580 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term788576, term788576.getClass(), "this$0", null);
        setField(term788576, term788576.getClass(), "call", null);
        setField(term788576, term788576.getClass(), "prototype", null);
        setField(term788576, term788576.getClass(), "kind", enum1422);
        setField(term788580, term788580.getClass(), "call", null);
        setField(term788580, term788580.getClass(), "prototype", null);
        setField(term788580, term788580.getClass(), "kind", null);
        setField(term788580, term788580.getClass(), "typeOfThis", null);
        setField(term788580, term788580.getClass(), "source", null);
        setField(term788580, term788580.getClass(), "implementedInterfaces", null);
        setField(term788580, term788580.getClass(), "subTypes", null);
        setField(term788580, term788580.getClass(), "templateTypeName", null);
        setField(term788580, term788580.getClass(), "className", null);
        setField(term788580, term788580.getClass(), "properties", null);
        setField(term788580, term788580.getClass(), "implicitPrototype", null);
        setBooleanField(term788580, term788580.getClass(), "nativeType", false);
        setBooleanField(term788580, term788580.getClass(), "prettyPrint", false);
        setBooleanField(term788580, term788580.getClass(), "visited", false);
        setField(term788580, term788580.getClass(), "docInfo", null);
        setBooleanField(term788580, term788580.getClass(), "unknown", false);
        setBooleanField(term788580, term788580.getClass(), "resolved", false);
        setField(term788580, term788580.getClass(), "resolveResult", null);
        setField(term788580, term788580.getClass(), "registry", null);
        setField(term788576, term788576.getClass(), "typeOfThis", term788580);
        setField(term788576, term788576.getClass(), "source", null);
        setField(term788576, term788576.getClass(), "implementedInterfaces", null);
        setField(term788576, term788576.getClass(), "subTypes", null);
        setField(term788576, term788576.getClass(), "templateTypeName", null);
        setField(term788576, term788576.getClass(), "className", null);
        setField(term788576, term788576.getClass(), "properties", null);
        setField(term788576, term788576.getClass(), "implicitPrototype", null);
        setBooleanField(term788576, term788576.getClass(), "nativeType", false);
        setBooleanField(term788576, term788576.getClass(), "prettyPrint", false);
        setBooleanField(term788576, term788576.getClass(), "visited", false);
        setField(term788576, term788576.getClass(), "docInfo", null);
        setBooleanField(term788576, term788576.getClass(), "unknown", false);
        setBooleanField(term788576, term788576.getClass(), "resolved", false);
        setField(term788576, term788576.getClass(), "resolveResult", null);
        setField(term788576, term788576.getClass(), "registry", null);
        Class<? extends Object> term789482 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term789481 = ((Class) term789482).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term789481).setAccessible(true);
        Object enum1423 = ((Field) term789481).get((Object) null);
        term788581 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term788585 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(term788581, term788581.getClass(), "call", null);
        setField(term788581, term788581.getClass(), "prototype", null);
        setField(term788581, term788581.getClass(), "kind", enum1423);
        setField(term788585, term788585.getClass(), "leastSupertypeVisitor", null);
        setField(term788585, term788585.getClass(), "greatestSubtypeVisitor", null);
        setField(term788585, term788585.getClass(), "call", null);
        setField(term788585, term788585.getClass(), "prototype", null);
        setField(term788585, term788585.getClass(), "kind", null);
        setField(term788585, term788585.getClass(), "typeOfThis", null);
        setField(term788585, term788585.getClass(), "source", null);
        setField(term788585, term788585.getClass(), "implementedInterfaces", null);
        setField(term788585, term788585.getClass(), "subTypes", null);
        setField(term788585, term788585.getClass(), "templateTypeName", null);
        setField(term788585, term788585.getClass(), "className", null);
        setField(term788585, term788585.getClass(), "properties", null);
        setField(term788585, term788585.getClass(), "implicitPrototype", null);
        setBooleanField(term788585, term788585.getClass(), "nativeType", false);
        setBooleanField(term788585, term788585.getClass(), "prettyPrint", false);
        setBooleanField(term788585, term788585.getClass(), "visited", false);
        setField(term788585, term788585.getClass(), "docInfo", null);
        setBooleanField(term788585, term788585.getClass(), "unknown", false);
        setBooleanField(term788585, term788585.getClass(), "resolved", false);
        setField(term788585, term788585.getClass(), "resolveResult", null);
        setField(term788585, term788585.getClass(), "registry", null);
        setField(term788581, term788581.getClass(), "typeOfThis", term788585);
        setField(term788581, term788581.getClass(), "source", null);
        setField(term788581, term788581.getClass(), "implementedInterfaces", null);
        setField(term788581, term788581.getClass(), "subTypes", null);
        setField(term788581, term788581.getClass(), "templateTypeName", null);
        setField(term788581, term788581.getClass(), "className", null);
        setField(term788581, term788581.getClass(), "properties", null);
        setField(term788581, term788581.getClass(), "implicitPrototype", null);
        setBooleanField(term788581, term788581.getClass(), "nativeType", false);
        setBooleanField(term788581, term788581.getClass(), "prettyPrint", false);
        setBooleanField(term788581, term788581.getClass(), "visited", false);
        setField(term788581, term788581.getClass(), "docInfo", null);
        setBooleanField(term788581, term788581.getClass(), "unknown", false);
        setBooleanField(term788581, term788581.getClass(), "resolved", false);
        setField(term788581, term788581.getClass(), "resolveResult", null);
        setField(term788581, term788581.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term787679;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term787025, args);
        assertTrue(recursiveEquals(term787025, term788576));
        assertTrue(recursiveEquals(term787679, term788581));
        assertTrue(recursiveEquals(retValue, false));
    }

};


