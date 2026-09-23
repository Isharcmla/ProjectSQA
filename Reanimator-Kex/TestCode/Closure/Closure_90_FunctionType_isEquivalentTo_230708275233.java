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

public class FunctionType_isEquivalentTo_230708275233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term128087;
     Object term128641;
     Object term130387;
     Object term130391;

    public FunctionType_isEquivalentTo_230708275233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term130397 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term130396 = ((Class) term130397).getDeclaredField((String) "INTERFACE");
        ((Field) term130396).setAccessible(true);
        Object enum248 = ((Field) term130396).get((Object) null);
        term128087 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term128087, term128087.getClass(), "kind", enum248);
        Class<? extends Object> term130691 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term130690 = ((Class) term130691).getDeclaredField((String) "INTERFACE");
        ((Field) term130690).setAccessible(true);
        Object enum249 = ((Field) term130690).get((Object) null);
        term128641 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term128641, term128641.getClass(), "kind", enum249);
        Class<? extends Object> term130985 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term130984 = ((Class) term130985).getDeclaredField((String) "ORDINARY");
        ((Field) term130984).setAccessible(true);
        Object enum250 = ((Field) term130984).get((Object) null);
        term130387 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term130387, term130387.getClass(), "call", null);
        setField(term130387, term130387.getClass(), "prototype", null);
        setField(term130387, term130387.getClass(), "kind", enum250);
        setField(term130387, term130387.getClass(), "typeOfThis", null);
        setField(term130387, term130387.getClass(), "source", null);
        setField(term130387, term130387.getClass(), "implementedInterfaces", null);
        setField(term130387, term130387.getClass(), "subTypes", null);
        setField(term130387, term130387.getClass(), "templateTypeName", null);
        setField(term130387, term130387.getClass(), "className", null);
        setField(term130387, term130387.getClass(), "properties", null);
        setBooleanField(term130387, term130387.getClass(), "nativeType", false);
        setField(term130387, term130387.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term130387, term130387.getClass(), "prettyPrint", false);
        setBooleanField(term130387, term130387.getClass(), "visited", false);
        setField(term130387, term130387.getClass(), "docInfo", null);
        setBooleanField(term130387, term130387.getClass(), "unknown", false);
        setBooleanField(term130387, term130387.getClass(), "resolved", false);
        setField(term130387, term130387.getClass(), "resolveResult", null);
        setField(term130387, term130387.getClass(), "registry", null);
        Class<? extends Object> term131276 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term131275 = ((Class) term131276).getDeclaredField((String) "INTERFACE");
        ((Field) term131275).setAccessible(true);
        Object enum251 = ((Field) term131275).get((Object) null);
        term130391 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term130391, term130391.getClass(), "call", null);
        setField(term130391, term130391.getClass(), "prototype", null);
        setField(term130391, term130391.getClass(), "kind", enum251);
        setField(term130391, term130391.getClass(), "typeOfThis", null);
        setField(term130391, term130391.getClass(), "source", null);
        setField(term130391, term130391.getClass(), "implementedInterfaces", null);
        setField(term130391, term130391.getClass(), "subTypes", null);
        setField(term130391, term130391.getClass(), "templateTypeName", null);
        setField(term130391, term130391.getClass(), "className", null);
        setField(term130391, term130391.getClass(), "properties", null);
        setBooleanField(term130391, term130391.getClass(), "nativeType", false);
        setField(term130391, term130391.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term130391, term130391.getClass(), "prettyPrint", false);
        setBooleanField(term130391, term130391.getClass(), "visited", false);
        setField(term130391, term130391.getClass(), "docInfo", null);
        setBooleanField(term130391, term130391.getClass(), "unknown", false);
        setBooleanField(term130391, term130391.getClass(), "resolved", false);
        setField(term130391, term130391.getClass(), "resolveResult", null);
        setField(term130391, term130391.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term128641;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term128087, args);
        assertTrue(recursiveEquals(term128087, term130387));
        assertTrue(recursiveEquals(term128641, term130391));
        assertTrue(recursiveEquals(retValue, false));
    }

};


