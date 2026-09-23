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

public class FunctionType_isSubtype_2101002158309 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168385;
     Object term168843;
     Object term169845;
     Object term169851;

    public FunctionType_isSubtype_2101002158309() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term169858 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term169857 = ((Class) term169858).getDeclaredField((String) "ORDINARY");
        ((Field) term169857).setAccessible(true);
        Object enum308 = ((Field) term169857).get((Object) null);
        term168385 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term168641 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        Object term168735 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        setField(term168385, term168385.getClass(), "kind", enum308);
        setField(term168385, term168385.getClass(), "typeOfThis", term168641);
        setField(term168385, term168385.getClass(), "call", term168735);
        Class<? extends Object> term170149 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term170148 = ((Class) term170149).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term170148).setAccessible(true);
        Object enum309 = ((Field) term170148).get((Object) null);
        term168843 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term169083 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term168843, term168843.getClass(), "kind", enum309);
        setField(term168843, term168843.getClass(), "typeOfThis", term169083);
        setField(term168843, term168843.getClass(), "call", null);
        Class<? extends Object> term170449 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term170448 = ((Class) term170449).getDeclaredField((String) "ORDINARY");
        ((Field) term170448).setAccessible(true);
        Object enum310 = ((Field) term170448).get((Object) null);
        term169845 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term169846 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term169850 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term169846, term169846.getClass(), "parameters", null);
        setField(term169846, term169846.getClass(), "returnType", null);
        setBooleanField(term169846, term169846.getClass(), "resolved", false);
        setField(term169846, term169846.getClass(), "resolveResult", null);
        setField(term169846, term169846.getClass(), "registry", null);
        setField(term169845, term169845.getClass(), "call", term169846);
        setField(term169845, term169845.getClass(), "prototype", null);
        setField(term169845, term169845.getClass(), "kind", enum310);
        setField(term169850, term169850.getClass(), "this$0", null);
        setField(term169850, term169850.getClass(), "call", null);
        setField(term169850, term169850.getClass(), "prototype", null);
        setField(term169850, term169850.getClass(), "kind", null);
        setField(term169850, term169850.getClass(), "typeOfThis", null);
        setField(term169850, term169850.getClass(), "source", null);
        setField(term169850, term169850.getClass(), "implementedInterfaces", null);
        setField(term169850, term169850.getClass(), "subTypes", null);
        setField(term169850, term169850.getClass(), "templateTypeName", null);
        setField(term169850, term169850.getClass(), "className", null);
        setField(term169850, term169850.getClass(), "properties", null);
        setField(term169850, term169850.getClass(), "implicitPrototype", null);
        setBooleanField(term169850, term169850.getClass(), "nativeType", false);
        setBooleanField(term169850, term169850.getClass(), "visited", false);
        setField(term169850, term169850.getClass(), "docInfo", null);
        setBooleanField(term169850, term169850.getClass(), "unknown", false);
        setBooleanField(term169850, term169850.getClass(), "resolved", false);
        setField(term169850, term169850.getClass(), "resolveResult", null);
        setField(term169850, term169850.getClass(), "registry", null);
        setField(term169845, term169845.getClass(), "typeOfThis", term169850);
        setField(term169845, term169845.getClass(), "source", null);
        setField(term169845, term169845.getClass(), "implementedInterfaces", null);
        setField(term169845, term169845.getClass(), "subTypes", null);
        setField(term169845, term169845.getClass(), "templateTypeName", null);
        setField(term169845, term169845.getClass(), "className", null);
        setField(term169845, term169845.getClass(), "properties", null);
        setField(term169845, term169845.getClass(), "implicitPrototype", null);
        setBooleanField(term169845, term169845.getClass(), "nativeType", false);
        setBooleanField(term169845, term169845.getClass(), "visited", false);
        setField(term169845, term169845.getClass(), "docInfo", null);
        setBooleanField(term169845, term169845.getClass(), "unknown", false);
        setBooleanField(term169845, term169845.getClass(), "resolved", false);
        setField(term169845, term169845.getClass(), "resolveResult", null);
        setField(term169845, term169845.getClass(), "registry", null);
        Class<? extends Object> term170740 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term170739 = ((Class) term170740).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term170739).setAccessible(true);
        Object enum311 = ((Field) term170739).get((Object) null);
        term169851 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object term169855 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumType"));
        setField(term169851, term169851.getClass(), "this$0", null);
        setField(term169851, term169851.getClass(), "call", null);
        setField(term169851, term169851.getClass(), "prototype", null);
        setField(term169851, term169851.getClass(), "kind", enum311);
        setField(term169855, term169855.getClass(), "elementsType", null);
        setField(term169855, term169855.getClass(), "elements", null);
        setField(term169855, term169855.getClass(), "className", null);
        setField(term169855, term169855.getClass(), "properties", null);
        setField(term169855, term169855.getClass(), "implicitPrototype", null);
        setBooleanField(term169855, term169855.getClass(), "nativeType", false);
        setBooleanField(term169855, term169855.getClass(), "visited", false);
        setField(term169855, term169855.getClass(), "docInfo", null);
        setBooleanField(term169855, term169855.getClass(), "unknown", false);
        setBooleanField(term169855, term169855.getClass(), "resolved", false);
        setField(term169855, term169855.getClass(), "resolveResult", null);
        setField(term169855, term169855.getClass(), "registry", null);
        setField(term169851, term169851.getClass(), "typeOfThis", term169855);
        setField(term169851, term169851.getClass(), "source", null);
        setField(term169851, term169851.getClass(), "implementedInterfaces", null);
        setField(term169851, term169851.getClass(), "subTypes", null);
        setField(term169851, term169851.getClass(), "templateTypeName", null);
        setField(term169851, term169851.getClass(), "className", null);
        setField(term169851, term169851.getClass(), "properties", null);
        setField(term169851, term169851.getClass(), "implicitPrototype", null);
        setBooleanField(term169851, term169851.getClass(), "nativeType", false);
        setBooleanField(term169851, term169851.getClass(), "visited", false);
        setField(term169851, term169851.getClass(), "docInfo", null);
        setBooleanField(term169851, term169851.getClass(), "unknown", false);
        setBooleanField(term169851, term169851.getClass(), "resolved", false);
        setField(term169851, term169851.getClass(), "resolveResult", null);
        setField(term169851, term169851.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term168843;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term168385, args);
        assertTrue(recursiveEquals(term168385, term169845));
        assertTrue(recursiveEquals(term168843, term169851));
        assertTrue(recursiveEquals(retValue, false));
    }

};


