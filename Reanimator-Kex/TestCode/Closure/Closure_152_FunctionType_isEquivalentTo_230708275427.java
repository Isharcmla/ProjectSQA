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

public class FunctionType_isEquivalentTo_230708275427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343937;
     Object term344599;
     Object term345470;
     Object term345475;

    public FunctionType_isEquivalentTo_230708275427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term345482 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term345481 = ((Class) term345482).getDeclaredField((String) "ORDINARY");
        ((Field) term345481).setAccessible(true);
        Object enum587 = ((Field) term345481).get((Object) null);
        term343937 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term344489 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term343937, term343937.getClass(), "kind", enum587);
        setField(term343937, term343937.getClass(), "typeOfThis", term344489);
        Class<? extends Object> term345773 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term345772 = ((Class) term345773).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term345772).setAccessible(true);
        Object enum588 = ((Field) term345772).get((Object) null);
        term344599 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term344783 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term344599, term344599.getClass(), "kind", enum588);
        setField(term344599, term344599.getClass(), "typeOfThis", term344783);
        Class<? extends Object> term346073 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term346072 = ((Class) term346073).getDeclaredField((String) "INTERFACE");
        ((Field) term346072).setAccessible(true);
        Object enum589 = ((Field) term346072).get((Object) null);
        term345470 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term345474 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term345470, term345470.getClass(), "call", null);
        setField(term345470, term345470.getClass(), "prototype", null);
        setField(term345470, term345470.getClass(), "kind", enum589);
        setField(term345474, term345474.getClass(), "this$0", null);
        setField(term345474, term345474.getClass(), "call", null);
        setField(term345474, term345474.getClass(), "prototype", null);
        setField(term345474, term345474.getClass(), "kind", null);
        setField(term345474, term345474.getClass(), "typeOfThis", null);
        setField(term345474, term345474.getClass(), "source", null);
        setField(term345474, term345474.getClass(), "implementedInterfaces", null);
        setField(term345474, term345474.getClass(), "subTypes", null);
        setField(term345474, term345474.getClass(), "templateTypeName", null);
        setField(term345474, term345474.getClass(), "className", null);
        setField(term345474, term345474.getClass(), "properties", null);
        setBooleanField(term345474, term345474.getClass(), "nativeType", false);
        setField(term345474, term345474.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term345474, term345474.getClass(), "prettyPrint", false);
        setBooleanField(term345474, term345474.getClass(), "visited", false);
        setField(term345474, term345474.getClass(), "docInfo", null);
        setBooleanField(term345474, term345474.getClass(), "unknown", false);
        setBooleanField(term345474, term345474.getClass(), "resolved", false);
        setField(term345474, term345474.getClass(), "resolveResult", null);
        setField(term345474, term345474.getClass(), "registry", null);
        setField(term345470, term345470.getClass(), "typeOfThis", term345474);
        setField(term345470, term345470.getClass(), "source", null);
        setField(term345470, term345470.getClass(), "implementedInterfaces", null);
        setField(term345470, term345470.getClass(), "subTypes", null);
        setField(term345470, term345470.getClass(), "templateTypeName", null);
        setField(term345470, term345470.getClass(), "className", null);
        setField(term345470, term345470.getClass(), "properties", null);
        setBooleanField(term345470, term345470.getClass(), "nativeType", false);
        setField(term345470, term345470.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term345470, term345470.getClass(), "prettyPrint", false);
        setBooleanField(term345470, term345470.getClass(), "visited", false);
        setField(term345470, term345470.getClass(), "docInfo", null);
        setBooleanField(term345470, term345470.getClass(), "unknown", false);
        setBooleanField(term345470, term345470.getClass(), "resolved", false);
        setField(term345470, term345470.getClass(), "resolveResult", null);
        setField(term345470, term345470.getClass(), "registry", null);
        Class<? extends Object> term346367 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term346366 = ((Class) term346367).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term346366).setAccessible(true);
        Object enum590 = ((Field) term346366).get((Object) null);
        term345475 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term345479 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term345475, term345475.getClass(), "call", null);
        setField(term345475, term345475.getClass(), "prototype", null);
        setField(term345475, term345475.getClass(), "kind", enum590);
        setField(term345479, term345479.getClass(), "call", null);
        setField(term345479, term345479.getClass(), "prototype", null);
        setField(term345479, term345479.getClass(), "kind", null);
        setField(term345479, term345479.getClass(), "typeOfThis", null);
        setField(term345479, term345479.getClass(), "source", null);
        setField(term345479, term345479.getClass(), "implementedInterfaces", null);
        setField(term345479, term345479.getClass(), "subTypes", null);
        setField(term345479, term345479.getClass(), "templateTypeName", null);
        setField(term345479, term345479.getClass(), "className", null);
        setField(term345479, term345479.getClass(), "properties", null);
        setBooleanField(term345479, term345479.getClass(), "nativeType", false);
        setField(term345479, term345479.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term345479, term345479.getClass(), "prettyPrint", false);
        setBooleanField(term345479, term345479.getClass(), "visited", false);
        setField(term345479, term345479.getClass(), "docInfo", null);
        setBooleanField(term345479, term345479.getClass(), "unknown", false);
        setBooleanField(term345479, term345479.getClass(), "resolved", false);
        setField(term345479, term345479.getClass(), "resolveResult", null);
        setField(term345479, term345479.getClass(), "registry", null);
        setField(term345475, term345475.getClass(), "typeOfThis", term345479);
        setField(term345475, term345475.getClass(), "source", null);
        setField(term345475, term345475.getClass(), "implementedInterfaces", null);
        setField(term345475, term345475.getClass(), "subTypes", null);
        setField(term345475, term345475.getClass(), "templateTypeName", null);
        setField(term345475, term345475.getClass(), "className", null);
        setField(term345475, term345475.getClass(), "properties", null);
        setBooleanField(term345475, term345475.getClass(), "nativeType", false);
        setField(term345475, term345475.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term345475, term345475.getClass(), "prettyPrint", false);
        setBooleanField(term345475, term345475.getClass(), "visited", false);
        setField(term345475, term345475.getClass(), "docInfo", null);
        setBooleanField(term345475, term345475.getClass(), "unknown", false);
        setBooleanField(term345475, term345475.getClass(), "resolved", false);
        setField(term345475, term345475.getClass(), "resolveResult", null);
        setField(term345475, term345475.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term344599;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term343937, args);
        assertTrue(recursiveEquals(term343937, term345470));
        assertTrue(recursiveEquals(term344599, term345475));
        assertTrue(recursiveEquals(retValue, false));
    }

};


