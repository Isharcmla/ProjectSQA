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

public class FunctionType_setPrototype_1918602805261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131960;
     Object term132226;
     Object term132715;
     Object term132721;

    public FunctionType_setPrototype_1918602805261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term132725 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term132724 = ((Class) term132725).getDeclaredField((String) "INTERFACE");
        ((Field) term132724).setAccessible(true);
        Object enum253 = ((Field) term132724).get((Object) null);
        term131960 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term131960, term131960.getClass(), "kind", enum253);
        setField(term131960, term131960.getClass(), "prototype", null);
        term132226 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term132340 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term132226, term132226.getClass(), "implicitPrototype", term132340);
        Class<? extends Object> term133019 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term133018 = ((Class) term133019).getDeclaredField((String) "INTERFACE");
        ((Field) term133018).setAccessible(true);
        Object enum254 = ((Field) term133018).get((Object) null);
        term132715 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term132716 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term132717 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term132715, term132715.getClass(), "call", null);
        setField(term132716, term132716.getClass(), "ownerFunction", null);
        setField(term132716, term132716.getClass(), "className", null);
        setField(term132716, term132716.getClass(), "properties", null);
        setField(term132717, term132717.getClass(), "className", null);
        setField(term132717, term132717.getClass(), "properties", null);
        setField(term132717, term132717.getClass(), "implicitPrototype", null);
        setBooleanField(term132717, term132717.getClass(), "nativeType", false);
        setBooleanField(term132717, term132717.getClass(), "visited", false);
        setField(term132717, term132717.getClass(), "docInfo", null);
        setBooleanField(term132717, term132717.getClass(), "unknown", false);
        setBooleanField(term132717, term132717.getClass(), "resolved", false);
        setField(term132717, term132717.getClass(), "resolveResult", null);
        setField(term132717, term132717.getClass(), "registry", null);
        setField(term132716, term132716.getClass(), "implicitPrototype", term132717);
        setBooleanField(term132716, term132716.getClass(), "nativeType", false);
        setBooleanField(term132716, term132716.getClass(), "visited", false);
        setField(term132716, term132716.getClass(), "docInfo", null);
        setBooleanField(term132716, term132716.getClass(), "unknown", false);
        setBooleanField(term132716, term132716.getClass(), "resolved", false);
        setField(term132716, term132716.getClass(), "resolveResult", null);
        setField(term132716, term132716.getClass(), "registry", null);
        setField(term132715, term132715.getClass(), "prototype", term132716);
        setField(term132715, term132715.getClass(), "kind", enum254);
        setField(term132715, term132715.getClass(), "typeOfThis", null);
        setField(term132715, term132715.getClass(), "source", null);
        setField(term132715, term132715.getClass(), "implementedInterfaces", null);
        setField(term132715, term132715.getClass(), "subTypes", null);
        setField(term132715, term132715.getClass(), "templateTypeName", null);
        setField(term132715, term132715.getClass(), "className", null);
        setField(term132715, term132715.getClass(), "properties", null);
        setField(term132715, term132715.getClass(), "implicitPrototype", null);
        setBooleanField(term132715, term132715.getClass(), "nativeType", false);
        setBooleanField(term132715, term132715.getClass(), "visited", false);
        setField(term132715, term132715.getClass(), "docInfo", null);
        setBooleanField(term132715, term132715.getClass(), "unknown", false);
        setBooleanField(term132715, term132715.getClass(), "resolved", false);
        setField(term132715, term132715.getClass(), "resolveResult", null);
        setField(term132715, term132715.getClass(), "registry", null);
        term132721 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term132722 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        setField(term132721, term132721.getClass(), "ownerFunction", null);
        setField(term132721, term132721.getClass(), "className", null);
        setField(term132721, term132721.getClass(), "properties", null);
        setField(term132722, term132722.getClass(), "className", null);
        setField(term132722, term132722.getClass(), "properties", null);
        setField(term132722, term132722.getClass(), "implicitPrototype", null);
        setBooleanField(term132722, term132722.getClass(), "nativeType", false);
        setBooleanField(term132722, term132722.getClass(), "visited", false);
        setField(term132722, term132722.getClass(), "docInfo", null);
        setBooleanField(term132722, term132722.getClass(), "unknown", false);
        setBooleanField(term132722, term132722.getClass(), "resolved", false);
        setField(term132722, term132722.getClass(), "resolveResult", null);
        setField(term132722, term132722.getClass(), "registry", null);
        setField(term132721, term132721.getClass(), "implicitPrototype", term132722);
        setBooleanField(term132721, term132721.getClass(), "nativeType", false);
        setBooleanField(term132721, term132721.getClass(), "visited", false);
        setField(term132721, term132721.getClass(), "docInfo", null);
        setBooleanField(term132721, term132721.getClass(), "unknown", false);
        setBooleanField(term132721, term132721.getClass(), "resolved", false);
        setField(term132721, term132721.getClass(), "resolveResult", null);
        setField(term132721, term132721.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType");
        Object[] args = new Object[1];
        args[0] = term132226;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term131960, args);
        assertTrue(recursiveEquals(term131960, term132715));
        assertTrue(recursiveEquals(term132226, term132721));
        assertTrue(recursiveEquals(retValue, true));
    }

};


