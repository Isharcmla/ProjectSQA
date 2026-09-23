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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FunctionType_getExtendedInterfacesCount_38575760490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9577;

    public FunctionType_getExtendedInterfacesCount_38575760490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40511 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term40510 = ((Class) term40511).getDeclaredField((String) "ORDINARY");
        ((Field) term40510).setAccessible(true);
        Object enum105 = ((Field) term40510).get((Object) null);
        term9577 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term9578 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term9579 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9586 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9589 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9593 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9596 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9602 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term9608 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setIntField(term9579, term9579.getClass(), "type", 1593461795);
        setIntField(term9581, term9581.getClass(), "type", 199287428);
        setIntField(term9583, term9583.getClass(), "type", 0);
        setField(term9583, term9583.getClass(), "next", null);
        setField(term9583, term9583.getClass(), "first", null);
        setField(term9583, term9583.getClass(), "last", null);
        setField(term9583, term9583.getClass(), "propListHead", null);
        setIntField(term9583, term9583.getClass(), "sourcePosition", 0);
        setField(term9583, term9583.getClass(), "jsType", null);
        setField(term9583, term9583.getClass(), "parent", null);
        setField(term9581, term9581.getClass(), "next", term9583);
        setIntField(term9586, term9586.getClass(), "type", 0);
        setField(term9586, term9586.getClass(), "next", null);
        setField(term9586, term9586.getClass(), "first", null);
        setField(term9586, term9586.getClass(), "last", null);
        setField(term9586, term9586.getClass(), "propListHead", null);
        setIntField(term9586, term9586.getClass(), "sourcePosition", 0);
        setField(term9586, term9586.getClass(), "jsType", null);
        setField(term9586, term9586.getClass(), "parent", null);
        setField(term9581, term9581.getClass(), "first", term9586);
        setIntField(term9589, term9589.getClass(), "type", 0);
        setField(term9589, term9589.getClass(), "next", null);
        setField(term9589, term9589.getClass(), "first", null);
        setField(term9589, term9589.getClass(), "last", null);
        setField(term9589, term9589.getClass(), "propListHead", null);
        setIntField(term9589, term9589.getClass(), "sourcePosition", 0);
        setField(term9589, term9589.getClass(), "jsType", null);
        setField(term9589, term9589.getClass(), "parent", null);
        setField(term9581, term9581.getClass(), "last", term9589);
        setField(term9581, term9581.getClass(), "propListHead", null);
        setIntField(term9581, term9581.getClass(), "sourcePosition", 0);
        setField(term9581, term9581.getClass(), "jsType", null);
        setField(term9581, term9581.getClass(), "parent", null);
        setField(term9579, term9579.getClass(), "next", term9581);
        setIntField(term9593, term9593.getClass(), "type", 0);
        setField(term9593, term9593.getClass(), "next", null);
        setField(term9593, term9593.getClass(), "first", null);
        setField(term9593, term9593.getClass(), "last", null);
        setField(term9593, term9593.getClass(), "propListHead", null);
        setIntField(term9593, term9593.getClass(), "sourcePosition", 0);
        setField(term9593, term9593.getClass(), "jsType", null);
        setField(term9593, term9593.getClass(), "parent", null);
        setField(term9579, term9579.getClass(), "first", term9593);
        setIntField(term9596, term9596.getClass(), "type", 0);
        setField(term9596, term9596.getClass(), "next", null);
        setField(term9596, term9596.getClass(), "first", null);
        setField(term9596, term9596.getClass(), "last", null);
        setField(term9596, term9596.getClass(), "propListHead", null);
        setIntField(term9596, term9596.getClass(), "sourcePosition", 0);
        setField(term9596, term9596.getClass(), "jsType", null);
        setField(term9596, term9596.getClass(), "parent", null);
        setField(term9579, term9579.getClass(), "last", term9596);
        setField(term9579, term9579.getClass(), "propListHead", null);
        setIntField(term9579, term9579.getClass(), "sourcePosition", 0);
        setField(term9579, term9579.getClass(), "jsType", null);
        setField(term9579, term9579.getClass(), "parent", null);
        setField(term9578, term9578.getClass(), "parameters", term9579);
        setField(term9578, term9578.getClass(), "returnType", null);
        setBooleanField(term9578, term9578.getClass(), "returnTypeInferred", false);
        setBooleanField(term9578, term9578.getClass(), "resolved", false);
        setField(term9578, term9578.getClass(), "resolveResult", null);
        setField(term9578, term9578.getClass(), "registry", null);
        setField(term9577, term9577.getClass(), "call", term9578);
        setField(term9602, term9602.getClass(), "className", null);
        setField(term9602, term9602.getClass(), "properties", null);
        setBooleanField(term9602, term9602.getClass(), "nativeType", false);
        setField(term9602, term9602.getClass(), "implicitPrototypeFallback", null);
        setField(term9602, term9602.getClass(), "ownerFunction", null);
        setBooleanField(term9602, term9602.getClass(), "prettyPrint", false);
        setBooleanField(term9602, term9602.getClass(), "visited", false);
        setField(term9602, term9602.getClass(), "docInfo", null);
        setBooleanField(term9602, term9602.getClass(), "unknown", false);
        setBooleanField(term9602, term9602.getClass(), "resolved", false);
        setField(term9602, term9602.getClass(), "resolveResult", null);
        setField(term9602, term9602.getClass(), "registry", null);
        setField(term9577, term9577.getClass(), "prototype", term9602);
        setField(term9608, term9608.getClass(), "name", null);
        setField(term9608, term9608.getClass(), "type", null);
        setBooleanField(term9608, term9608.getClass(), "inferred", false);
        setField(term9577, term9577.getClass(), "prototypeSlot", term9608);
        setField(term9577, term9577.getClass(), "kind", enum105);
        setField(term9577, term9577.getClass(), "typeOfThis", null);
        setField(term9577, term9577.getClass(), "source", null);
        setField(term9577, term9577.getClass(), "implementedInterfaces", null);
        setField(term9577, term9577.getClass(), "extendedInterfaces", null);
        setField(term9577, term9577.getClass(), "subTypes", null);
        setField(term9577, term9577.getClass(), "templateTypeName", null);
        setField(term9577, term9577.getClass(), "className", null);
        setField(term9577, term9577.getClass(), "properties", null);
        setBooleanField(term9577, term9577.getClass(), "nativeType", false);
        setField(term9577, term9577.getClass(), "implicitPrototypeFallback", null);
        setField(term9577, term9577.getClass(), "ownerFunction", null);
        setBooleanField(term9577, term9577.getClass(), "prettyPrint", false);
        setBooleanField(term9577, term9577.getClass(), "visited", false);
        setField(term9577, term9577.getClass(), "docInfo", null);
        setBooleanField(term9577, term9577.getClass(), "unknown", false);
        setBooleanField(term9577, term9577.getClass(), "resolved", false);
        setField(term9577, term9577.getClass(), "resolveResult", null);
        setField(term9577, term9577.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getExtendedInterfacesCount", argTypes, term9577, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


