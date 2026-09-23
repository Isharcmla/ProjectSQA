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
import java.lang.Object;

public class FunctionType_setPrototypeBasedOn_1012666130142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69155;
     Object term69255;
     Object term69551;
     Object term69556;

    public FunctionType_setPrototypeBasedOn_1012666130142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69155 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term69255 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        term69551 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term69552 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term69553 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setField(term69551, term69551.getClass(), "call", null);
        setField(term69552, term69552.getClass(), "call", null);
        setField(term69552, term69552.getClass(), "prototype", null);
        setField(term69552, term69552.getClass(), "prototypeSlot", null);
        setField(term69552, term69552.getClass(), "kind", null);
        setField(term69552, term69552.getClass(), "typeOfThis", null);
        setField(term69552, term69552.getClass(), "source", null);
        setField(term69552, term69552.getClass(), "implementedInterfaces", null);
        setField(term69552, term69552.getClass(), "extendedInterfaces", null);
        setField(term69552, term69552.getClass(), "subTypes", null);
        setField(term69552, term69552.getClass(), "templateTypeName", null);
        setField(term69552, term69552.getClass(), "className", null);
        setField(term69552, term69552.getClass(), "properties", null);
        setBooleanField(term69552, term69552.getClass(), "nativeType", false);
        setField(term69552, term69552.getClass(), "implicitPrototypeFallback", null);
        setField(term69552, term69552.getClass(), "ownerFunction", term69551);
        setBooleanField(term69552, term69552.getClass(), "prettyPrint", false);
        setBooleanField(term69552, term69552.getClass(), "visited", false);
        setField(term69552, term69552.getClass(), "docInfo", null);
        setBooleanField(term69552, term69552.getClass(), "unknown", true);
        setBooleanField(term69552, term69552.getClass(), "resolved", false);
        setField(term69552, term69552.getClass(), "resolveResult", null);
        setField(term69552, term69552.getClass(), "registry", null);
        setField(term69551, term69551.getClass(), "prototype", term69552);
        setField(term69553, term69553.getClass(), "name", "prototype");
        setField(term69553, term69553.getClass(), "type", term69552);
        setBooleanField(term69553, term69553.getClass(), "inferred", true);
        setField(term69551, term69551.getClass(), "prototypeSlot", term69553);
        setField(term69551, term69551.getClass(), "kind", null);
        setField(term69551, term69551.getClass(), "typeOfThis", null);
        setField(term69551, term69551.getClass(), "source", null);
        setField(term69551, term69551.getClass(), "implementedInterfaces", null);
        setField(term69551, term69551.getClass(), "extendedInterfaces", null);
        setField(term69551, term69551.getClass(), "subTypes", null);
        setField(term69551, term69551.getClass(), "templateTypeName", null);
        setField(term69551, term69551.getClass(), "className", null);
        setField(term69551, term69551.getClass(), "properties", null);
        setBooleanField(term69551, term69551.getClass(), "nativeType", false);
        setField(term69551, term69551.getClass(), "implicitPrototypeFallback", null);
        setField(term69551, term69551.getClass(), "ownerFunction", null);
        setBooleanField(term69551, term69551.getClass(), "prettyPrint", false);
        setBooleanField(term69551, term69551.getClass(), "visited", false);
        setField(term69551, term69551.getClass(), "docInfo", null);
        setBooleanField(term69551, term69551.getClass(), "unknown", true);
        setBooleanField(term69551, term69551.getClass(), "resolved", false);
        setField(term69551, term69551.getClass(), "resolveResult", null);
        setField(term69551, term69551.getClass(), "registry", null);
        term69556 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term69557 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term69558 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setField(term69556, term69556.getClass(), "call", null);
        setField(term69556, term69556.getClass(), "prototype", null);
        setField(term69556, term69556.getClass(), "prototypeSlot", null);
        setField(term69556, term69556.getClass(), "kind", null);
        setField(term69556, term69556.getClass(), "typeOfThis", null);
        setField(term69556, term69556.getClass(), "source", null);
        setField(term69556, term69556.getClass(), "implementedInterfaces", null);
        setField(term69556, term69556.getClass(), "extendedInterfaces", null);
        setField(term69556, term69556.getClass(), "subTypes", null);
        setField(term69556, term69556.getClass(), "templateTypeName", null);
        setField(term69556, term69556.getClass(), "className", null);
        setField(term69556, term69556.getClass(), "properties", null);
        setBooleanField(term69556, term69556.getClass(), "nativeType", false);
        setField(term69556, term69556.getClass(), "implicitPrototypeFallback", null);
        setField(term69557, term69557.getClass(), "call", null);
        setField(term69557, term69557.getClass(), "prototype", term69556);
        setField(term69558, term69558.getClass(), "name", "prototype");
        setField(term69558, term69558.getClass(), "type", term69556);
        setBooleanField(term69558, term69558.getClass(), "inferred", true);
        setField(term69557, term69557.getClass(), "prototypeSlot", term69558);
        setField(term69557, term69557.getClass(), "kind", null);
        setField(term69557, term69557.getClass(), "typeOfThis", null);
        setField(term69557, term69557.getClass(), "source", null);
        setField(term69557, term69557.getClass(), "implementedInterfaces", null);
        setField(term69557, term69557.getClass(), "extendedInterfaces", null);
        setField(term69557, term69557.getClass(), "subTypes", null);
        setField(term69557, term69557.getClass(), "templateTypeName", null);
        setField(term69557, term69557.getClass(), "className", null);
        setField(term69557, term69557.getClass(), "properties", null);
        setBooleanField(term69557, term69557.getClass(), "nativeType", false);
        setField(term69557, term69557.getClass(), "implicitPrototypeFallback", null);
        setField(term69557, term69557.getClass(), "ownerFunction", null);
        setBooleanField(term69557, term69557.getClass(), "prettyPrint", false);
        setBooleanField(term69557, term69557.getClass(), "visited", false);
        setField(term69557, term69557.getClass(), "docInfo", null);
        setBooleanField(term69557, term69557.getClass(), "unknown", true);
        setBooleanField(term69557, term69557.getClass(), "resolved", false);
        setField(term69557, term69557.getClass(), "resolveResult", null);
        setField(term69557, term69557.getClass(), "registry", null);
        setField(term69556, term69556.getClass(), "ownerFunction", term69557);
        setBooleanField(term69556, term69556.getClass(), "prettyPrint", false);
        setBooleanField(term69556, term69556.getClass(), "visited", false);
        setField(term69556, term69556.getClass(), "docInfo", null);
        setBooleanField(term69556, term69556.getClass(), "unknown", true);
        setBooleanField(term69556, term69556.getClass(), "resolved", false);
        setField(term69556, term69556.getClass(), "resolveResult", null);
        setField(term69556, term69556.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Object[] args = new Object[1];
        args[0] = term69255;
        callMethod(klass, "setPrototypeBasedOn", argTypes, term69155, args);
        assertTrue(recursiveEquals(term69155, term69551));
        assertTrue(recursiveEquals(term69255, term69556));
    }

};


