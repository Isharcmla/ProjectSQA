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
import java.lang.Boolean;

public class FunctionType_supAndInfHelper_160397710485 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12394;
     Object term12451;

    public FunctionType_supAndInfHelper_160397710485() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term43657 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term43656 = ((Class) term43657).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term43656).setAccessible(true);
        Object enum111 = ((Field) term43656).get((Object) null);
        term12394 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term12395 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term12396 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12398 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12400 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12403 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12409 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12413 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12416 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12419 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12425 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term12396, term12396.getClass(), "type", -220791533);
        setIntField(term12398, term12398.getClass(), "type", 1074848808);
        setIntField(term12400, term12400.getClass(), "type", 0);
        setField(term12400, term12400.getClass(), "next", null);
        setField(term12400, term12400.getClass(), "first", null);
        setField(term12400, term12400.getClass(), "last", null);
        setField(term12400, term12400.getClass(), "propListHead", null);
        setIntField(term12400, term12400.getClass(), "sourcePosition", 0);
        setField(term12400, term12400.getClass(), "jsType", null);
        setField(term12400, term12400.getClass(), "parent", null);
        setField(term12398, term12398.getClass(), "next", term12400);
        setIntField(term12403, term12403.getClass(), "type", 0);
        setField(term12403, term12403.getClass(), "next", null);
        setField(term12403, term12403.getClass(), "first", null);
        setField(term12403, term12403.getClass(), "last", null);
        setField(term12403, term12403.getClass(), "propListHead", null);
        setIntField(term12403, term12403.getClass(), "sourcePosition", 0);
        setField(term12403, term12403.getClass(), "jsType", null);
        setField(term12403, term12403.getClass(), "parent", null);
        setField(term12398, term12398.getClass(), "first", term12403);
        setIntField(term12406, term12406.getClass(), "type", 0);
        setField(term12406, term12406.getClass(), "next", null);
        setField(term12406, term12406.getClass(), "first", null);
        setField(term12406, term12406.getClass(), "last", null);
        setField(term12406, term12406.getClass(), "propListHead", null);
        setIntField(term12406, term12406.getClass(), "sourcePosition", 0);
        setField(term12406, term12406.getClass(), "jsType", null);
        setField(term12406, term12406.getClass(), "parent", null);
        setField(term12398, term12398.getClass(), "last", term12406);
        setField(term12409, term12409.getClass(), "next", null);
        setIntField(term12409, term12409.getClass(), "type", 0);
        setIntField(term12409, term12409.getClass(), "intValue", 0);
        setField(term12409, term12409.getClass(), "objectValue", null);
        setField(term12398, term12398.getClass(), "propListHead", term12409);
        setIntField(term12398, term12398.getClass(), "sourcePosition", -146054762);
        setField(term12398, term12398.getClass(), "jsType", null);
        setField(term12398, term12398.getClass(), "parent", null);
        setField(term12396, term12396.getClass(), "next", term12398);
        setIntField(term12413, term12413.getClass(), "type", 0);
        setField(term12413, term12413.getClass(), "next", null);
        setField(term12413, term12413.getClass(), "first", null);
        setField(term12413, term12413.getClass(), "last", null);
        setField(term12413, term12413.getClass(), "propListHead", null);
        setIntField(term12413, term12413.getClass(), "sourcePosition", 0);
        setField(term12413, term12413.getClass(), "jsType", null);
        setField(term12413, term12413.getClass(), "parent", null);
        setField(term12396, term12396.getClass(), "first", term12413);
        setIntField(term12416, term12416.getClass(), "type", 0);
        setField(term12416, term12416.getClass(), "next", null);
        setField(term12416, term12416.getClass(), "first", null);
        setField(term12416, term12416.getClass(), "last", null);
        setField(term12416, term12416.getClass(), "propListHead", null);
        setIntField(term12416, term12416.getClass(), "sourcePosition", 0);
        setField(term12416, term12416.getClass(), "jsType", null);
        setField(term12416, term12416.getClass(), "parent", null);
        setField(term12396, term12396.getClass(), "last", term12416);
        setField(term12419, term12419.getClass(), "next", null);
        setIntField(term12419, term12419.getClass(), "type", 0);
        setIntField(term12419, term12419.getClass(), "intValue", 0);
        setField(term12419, term12419.getClass(), "objectValue", null);
        setField(term12396, term12396.getClass(), "propListHead", term12419);
        setIntField(term12396, term12396.getClass(), "sourcePosition", 798043553);
        setField(term12396, term12396.getClass(), "jsType", null);
        setField(term12396, term12396.getClass(), "parent", null);
        setField(term12395, term12395.getClass(), "parameters", term12396);
        setField(term12395, term12395.getClass(), "returnType", null);
        setBooleanField(term12395, term12395.getClass(), "returnTypeInferred", false);
        setBooleanField(term12395, term12395.getClass(), "resolved", false);
        setField(term12395, term12395.getClass(), "resolveResult", null);
        setField(term12395, term12395.getClass(), "registry", null);
        setField(term12394, term12394.getClass(), "call", term12395);
        setField(term12425, term12425.getClass(), "ownerFunction", null);
        setField(term12425, term12425.getClass(), "className", null);
        setField(term12425, term12425.getClass(), "properties", null);
        setBooleanField(term12425, term12425.getClass(), "nativeType", false);
        setField(term12425, term12425.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term12425, term12425.getClass(), "prettyPrint", false);
        setBooleanField(term12425, term12425.getClass(), "visited", false);
        setField(term12425, term12425.getClass(), "docInfo", null);
        setBooleanField(term12425, term12425.getClass(), "unknown", false);
        setBooleanField(term12425, term12425.getClass(), "resolved", false);
        setField(term12425, term12425.getClass(), "resolveResult", null);
        setField(term12425, term12425.getClass(), "registry", null);
        setField(term12394, term12394.getClass(), "prototype", term12425);
        setField(term12394, term12394.getClass(), "kind", enum111);
        setField(term12394, term12394.getClass(), "typeOfThis", null);
        setField(term12394, term12394.getClass(), "source", null);
        setField(term12394, term12394.getClass(), "implementedInterfaces", null);
        setField(term12394, term12394.getClass(), "subTypes", null);
        setField(term12394, term12394.getClass(), "templateTypeName", null);
        setField(term12394, term12394.getClass(), "className", null);
        setField(term12394, term12394.getClass(), "properties", null);
        setBooleanField(term12394, term12394.getClass(), "nativeType", false);
        setField(term12394, term12394.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term12394, term12394.getClass(), "prettyPrint", false);
        setBooleanField(term12394, term12394.getClass(), "visited", false);
        setField(term12394, term12394.getClass(), "docInfo", null);
        setBooleanField(term12394, term12394.getClass(), "unknown", false);
        setBooleanField(term12394, term12394.getClass(), "resolved", false);
        setField(term12394, term12394.getClass(), "resolveResult", null);
        setField(term12394, term12394.getClass(), "registry", null);
        term12451 = new Boolean(true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term12451;
        try {
            callMethod(klass, "supAndInfHelper", argTypes, term12394, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


