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

public class FunctionType_isSubtype_21010021581291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1617745;
     Object term1618405;
     Object term1619310;
     Object term1619315;

    public FunctionType_isSubtype_21010021581291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term1619322 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1619321 = ((Class) term1619322).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1619321).setAccessible(true);
        Object enum3014 = ((Field) term1619321).get((Object) null);
        term1617745 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1618297 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1617745, term1617745.getClass(), "kind", enum3014);
        setField(term1617745, term1617745.getClass(), "typeOfThis", term1618297);
        Class<? extends Object> term1619622 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1619621 = ((Class) term1619622).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1619621).setAccessible(true);
        Object enum3015 = ((Field) term1619621).get((Object) null);
        term1618405 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1618589 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1618405, term1618405.getClass(), "kind", enum3015);
        setField(term1618405, term1618405.getClass(), "typeOfThis", term1618589);
        Class<? extends Object> term1619922 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1619921 = ((Class) term1619922).getDeclaredField((String) "INTERFACE");
        ((Field) term1619921).setAccessible(true);
        Object enum3016 = ((Field) term1619921).get((Object) null);
        term1619310 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1619314 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term1619310, term1619310.getClass(), "this$0", null);
        setField(term1619310, term1619310.getClass(), "call", null);
        setField(term1619310, term1619310.getClass(), "prototype", null);
        setField(term1619310, term1619310.getClass(), "kind", enum3016);
        setField(term1619314, term1619314.getClass(), "this$0", null);
        setField(term1619314, term1619314.getClass(), "call", null);
        setField(term1619314, term1619314.getClass(), "prototype", null);
        setField(term1619314, term1619314.getClass(), "kind", null);
        setField(term1619314, term1619314.getClass(), "typeOfThis", null);
        setField(term1619314, term1619314.getClass(), "source", null);
        setField(term1619314, term1619314.getClass(), "implementedInterfaces", null);
        setField(term1619314, term1619314.getClass(), "subTypes", null);
        setField(term1619314, term1619314.getClass(), "templateTypeName", null);
        setField(term1619314, term1619314.getClass(), "className", null);
        setField(term1619314, term1619314.getClass(), "properties", null);
        setField(term1619314, term1619314.getClass(), "implicitPrototype", null);
        setBooleanField(term1619314, term1619314.getClass(), "nativeType", false);
        setBooleanField(term1619314, term1619314.getClass(), "visited", false);
        setField(term1619314, term1619314.getClass(), "docInfo", null);
        setBooleanField(term1619314, term1619314.getClass(), "unknown", false);
        setBooleanField(term1619314, term1619314.getClass(), "resolved", false);
        setField(term1619314, term1619314.getClass(), "resolveResult", null);
        setField(term1619314, term1619314.getClass(), "registry", null);
        setField(term1619310, term1619310.getClass(), "typeOfThis", term1619314);
        setField(term1619310, term1619310.getClass(), "source", null);
        setField(term1619310, term1619310.getClass(), "implementedInterfaces", null);
        setField(term1619310, term1619310.getClass(), "subTypes", null);
        setField(term1619310, term1619310.getClass(), "templateTypeName", null);
        setField(term1619310, term1619310.getClass(), "className", null);
        setField(term1619310, term1619310.getClass(), "properties", null);
        setField(term1619310, term1619310.getClass(), "implicitPrototype", null);
        setBooleanField(term1619310, term1619310.getClass(), "nativeType", false);
        setBooleanField(term1619310, term1619310.getClass(), "visited", false);
        setField(term1619310, term1619310.getClass(), "docInfo", null);
        setBooleanField(term1619310, term1619310.getClass(), "unknown", false);
        setBooleanField(term1619310, term1619310.getClass(), "resolved", false);
        setField(term1619310, term1619310.getClass(), "resolveResult", null);
        setField(term1619310, term1619310.getClass(), "registry", null);
        Class<? extends Object> term1620216 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term1620215 = ((Class) term1620216).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term1620215).setAccessible(true);
        Object enum3017 = ((Field) term1620215).get((Object) null);
        term1619315 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$2"));
        Object term1619319 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term1619315, term1619315.getClass(), "this$0", null);
        setField(term1619315, term1619315.getClass(), "call", null);
        setField(term1619315, term1619315.getClass(), "prototype", null);
        setField(term1619315, term1619315.getClass(), "kind", enum3017);
        setField(term1619319, term1619319.getClass(), "call", null);
        setField(term1619319, term1619319.getClass(), "prototype", null);
        setField(term1619319, term1619319.getClass(), "kind", null);
        setField(term1619319, term1619319.getClass(), "typeOfThis", null);
        setField(term1619319, term1619319.getClass(), "source", null);
        setField(term1619319, term1619319.getClass(), "implementedInterfaces", null);
        setField(term1619319, term1619319.getClass(), "subTypes", null);
        setField(term1619319, term1619319.getClass(), "templateTypeName", null);
        setField(term1619319, term1619319.getClass(), "className", null);
        setField(term1619319, term1619319.getClass(), "properties", null);
        setField(term1619319, term1619319.getClass(), "implicitPrototype", null);
        setBooleanField(term1619319, term1619319.getClass(), "nativeType", false);
        setBooleanField(term1619319, term1619319.getClass(), "visited", false);
        setField(term1619319, term1619319.getClass(), "docInfo", null);
        setBooleanField(term1619319, term1619319.getClass(), "unknown", false);
        setBooleanField(term1619319, term1619319.getClass(), "resolved", false);
        setField(term1619319, term1619319.getClass(), "resolveResult", null);
        setField(term1619319, term1619319.getClass(), "registry", null);
        setField(term1619315, term1619315.getClass(), "typeOfThis", term1619319);
        setField(term1619315, term1619315.getClass(), "source", null);
        setField(term1619315, term1619315.getClass(), "implementedInterfaces", null);
        setField(term1619315, term1619315.getClass(), "subTypes", null);
        setField(term1619315, term1619315.getClass(), "templateTypeName", null);
        setField(term1619315, term1619315.getClass(), "className", null);
        setField(term1619315, term1619315.getClass(), "properties", null);
        setField(term1619315, term1619315.getClass(), "implicitPrototype", null);
        setBooleanField(term1619315, term1619315.getClass(), "nativeType", false);
        setBooleanField(term1619315, term1619315.getClass(), "visited", false);
        setField(term1619315, term1619315.getClass(), "docInfo", null);
        setBooleanField(term1619315, term1619315.getClass(), "unknown", false);
        setBooleanField(term1619315, term1619315.getClass(), "resolved", false);
        setField(term1619315, term1619315.getClass(), "resolveResult", null);
        setField(term1619315, term1619315.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term1618405;
        Object retValue = callMethod(klass, "isSubtype", argTypes, term1617745, args);
        assertTrue(recursiveEquals(term1617745, term1619310));
        assertTrue(recursiveEquals(term1618405, term1619315));
        assertTrue(recursiveEquals(retValue, false));
    }

};


