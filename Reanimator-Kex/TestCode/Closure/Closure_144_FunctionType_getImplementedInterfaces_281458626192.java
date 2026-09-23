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

public class FunctionType_getImplementedInterfaces_281458626192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96447;
     Object term98112;

    public FunctionType_getImplementedInterfaces_281458626192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term98117 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term98116 = ((Class) term98117).getDeclaredField((String) "INTERFACE");
        ((Field) term98116).setAccessible(true);
        Object enum208 = ((Field) term98116).get((Object) null);
        term96447 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term96447, term96447.getClass(), "kind", enum208);
        Class<? extends Object> term98411 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term98410 = ((Class) term98411).getDeclaredField((String) "INTERFACE");
        ((Field) term98410).setAccessible(true);
        Object enum209 = ((Field) term98410).get((Object) null);
        term98112 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term98112, term98112.getClass(), "call", null);
        setField(term98112, term98112.getClass(), "prototype", null);
        setField(term98112, term98112.getClass(), "kind", enum209);
        setField(term98112, term98112.getClass(), "typeOfThis", null);
        setField(term98112, term98112.getClass(), "source", null);
        setField(term98112, term98112.getClass(), "implementedInterfaces", null);
        setField(term98112, term98112.getClass(), "subTypes", null);
        setField(term98112, term98112.getClass(), "templateTypeName", null);
        setField(term98112, term98112.getClass(), "className", null);
        setField(term98112, term98112.getClass(), "properties", null);
        setField(term98112, term98112.getClass(), "implicitPrototype", null);
        setBooleanField(term98112, term98112.getClass(), "nativeType", false);
        setBooleanField(term98112, term98112.getClass(), "prettyPrint", false);
        setBooleanField(term98112, term98112.getClass(), "visited", false);
        setField(term98112, term98112.getClass(), "docInfo", null);
        setBooleanField(term98112, term98112.getClass(), "unknown", false);
        setBooleanField(term98112, term98112.getClass(), "resolved", false);
        setField(term98112, term98112.getClass(), "resolveResult", null);
        setField(term98112, term98112.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getImplementedInterfaces", argTypes, term96447, args);
        assertTrue(recursiveEquals(term96447, term98112));
        assertTrue(recursiveEquals(retValue, null));
    }

};


