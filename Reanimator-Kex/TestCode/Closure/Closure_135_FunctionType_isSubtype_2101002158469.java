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

public class FunctionType_isSubtype_2101002158469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term326050;
     Object term326602;
     Object term327352;
     Object term327356;

    public FunctionType_isSubtype_2101002158469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term327362 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term327361 = ((Class) term327362).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term327361).setAccessible(true);
        Object enum597 = ((Field) term327361).get((Object) null);
        term326050 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term326050, term326050.getClass(), "kind", enum597);
        Class<? extends Object> term327662 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term327661 = ((Class) term327662).getDeclaredField((String) "INTERFACE");
        ((Field) term327661).setAccessible(true);
        Object enum598 = ((Field) term327661).get((Object) null);
        term326602 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term326602, term326602.getClass(), "kind", enum598);
        Class<? extends Object> term327956 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term327955 = ((Class) term327956).getDeclaredField((String) "ORDINARY");
        ((Field) term327955).setAccessible(true);
        Object enum599 = ((Field) term327955).get((Object) null);
        term327352 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$3"));
        setField(term327352, term327352.getClass(), "this$0", null);
        setField(term327352, term327352.getClass(), "call", null);
        setField(term327352, term327352.getClass(), "prototype", null);
        setField(term327352, term327352.getClass(), "kind", enum599);
        setField(term327352, term327352.getClass(), "typeOfThis", null);
        setField(term327352, term327352.getClass(), "source", null);
        setField(term327352, term327352.getClass(), "implementedInterfaces", null);
        setField(term327352, term327352.getClass(), "subTypes", null);
        setField(term327352, term327352.getClass(), "templateTypeName", null);
        setField(term327352, term327352.getClass(), "className", null);
        setField(term327352, term327352.getClass(), "properties", null);
        setField(term327352, term327352.getClass(), "implicitPrototype", null);
        setBooleanField(term327352, term327352.getClass(), "nativeType", false);
        setBooleanField(term327352, term327352.getClass(), "visited", false);
        setField(term327352, term327352.getClass(), "docInfo", null);
        setBooleanField(term327352, term327352.getClass(), "unknown", false);
        setBooleanField(term327352, term327352.getClass(), "resolved", false);
        setField(term327352, term327352.getClass(), "resolveResult", null);
        setField(term327352, term327352.getClass(), "registry", null);
        Class<? extends Object> term328247 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term328246 = ((Class) term328247).getDeclaredField((String) "INTERFACE");
        ((Field) term328246).setAccessible(true);
        Object enum600 = ((Field) term328246).get((Object) null);
        term327356 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term327356, term327356.getClass(), "this$0", null);
        setField(term327356, term327356.getClass(), "call", null);
        setField(term327356, term327356.getClass(), "prototype", null);
        setField(term327356, term327356.getClass(), "kind", enum600);
        setField(term327356, term327356.getClass(), "typeOfThis", null);
        setField(term327356, term327356.getClass(), "source", null);
        setField(term327356, term327356.getClass(), "implementedInterfaces", null);
        setField(term327356, term327356.getClass(), "subTypes", null);
        setField(term327356, term327356.getClass(), "templateTypeName", null);
        setField(term327356, term327356.getClass(), "className", null);
        setField(term327356, term327356.getClass(), "properties", null);
        setField(term327356, term327356.getClass(), "implicitPrototype", null);
        setBooleanField(term327356, term327356.getClass(), "nativeType", false);
        setBooleanField(term327356, term327356.getClass(), "visited", false);
        setField(term327356, term327356.getClass(), "docInfo", null);
        setBooleanField(term327356, term327356.getClass(), "unknown", false);
        setBooleanField(term327356, term327356.getClass(), "resolved", false);
        setField(term327356, term327356.getClass(), "resolveResult", null);
        setField(term327356, term327356.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term326602;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term326050, args);
        assertTrue(recursiveEquals(term326050, term327352));
        assertTrue(recursiveEquals(term326602, term327356));
        assertTrue(recursiveEquals(retValue, true));
    }

};


