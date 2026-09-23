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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.LinkedList;

public class FunctionType_setImplementedInterfaces_1966858440104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19708;
     Object term19766;

    public FunctionType_setImplementedInterfaces_1966858440104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term85944 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term85943 = ((Class) term85944).getDeclaredField((String) "INTERFACE");
        ((Field) term85943).setAccessible(true);
        Object enum246 = ((Field) term85943).get((Object) null);
        Class<? extends Object> term86238 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term86237 = ((Class) term86238).getDeclaredField((String) "DICT");
        ((Field) term86237).setAccessible(true);
        Object enum247 = ((Field) term86237).get((Object) null);
        term19708 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term19709 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term19710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19714 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19717 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19729 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term19737 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term19710, term19710.getClass(), "type", -1351605385);
        setIntField(term19712, term19712.getClass(), "type", 278355793);
        setIntField(term19714, term19714.getClass(), "type", -310648604);
        setField(term19714, term19714.getClass(), "next", null);
        setField(term19714, term19714.getClass(), "first", null);
        setField(term19714, term19714.getClass(), "last", null);
        setField(term19714, term19714.getClass(), "propListHead", null);
        setIntField(term19714, term19714.getClass(), "sourcePosition", 0);
        setField(term19714, term19714.getClass(), "jsType", null);
        setField(term19714, term19714.getClass(), "parent", null);
        setField(term19712, term19712.getClass(), "next", term19714);
        setIntField(term19717, term19717.getClass(), "type", 0);
        setField(term19717, term19717.getClass(), "next", null);
        setField(term19717, term19717.getClass(), "first", null);
        setField(term19717, term19717.getClass(), "last", null);
        setField(term19717, term19717.getClass(), "propListHead", null);
        setIntField(term19717, term19717.getClass(), "sourcePosition", 0);
        setField(term19717, term19717.getClass(), "jsType", null);
        setField(term19717, term19717.getClass(), "parent", null);
        setField(term19712, term19712.getClass(), "first", term19717);
        setIntField(term19720, term19720.getClass(), "type", -1697741155);
        setField(term19720, term19720.getClass(), "next", null);
        setField(term19720, term19720.getClass(), "first", term19717);
        setField(term19720, term19720.getClass(), "last", term19720);
        setField(term19720, term19720.getClass(), "propListHead", null);
        setIntField(term19720, term19720.getClass(), "sourcePosition", 0);
        setField(term19720, term19720.getClass(), "jsType", null);
        setField(term19720, term19720.getClass(), "parent", null);
        setField(term19712, term19712.getClass(), "last", term19720);
        setField(term19712, term19712.getClass(), "propListHead", null);
        setIntField(term19712, term19712.getClass(), "sourcePosition", 0);
        setField(term19712, term19712.getClass(), "jsType", null);
        setField(term19712, term19712.getClass(), "parent", null);
        setField(term19710, term19710.getClass(), "next", term19712);
        setIntField(term19724, term19724.getClass(), "type", 993388358);
        setIntField(term19726, term19726.getClass(), "type", -765191335);
        setField(term19726, term19726.getClass(), "next", term19720);
        setField(term19726, term19726.getClass(), "first", null);
        setField(term19726, term19726.getClass(), "last", term19710);
        setField(term19726, term19726.getClass(), "propListHead", null);
        setIntField(term19726, term19726.getClass(), "sourcePosition", 0);
        setField(term19726, term19726.getClass(), "jsType", null);
        setField(term19726, term19726.getClass(), "parent", null);
        setField(term19724, term19724.getClass(), "next", term19726);
        setField(term19724, term19724.getClass(), "first", term19724);
        setIntField(term19729, term19729.getClass(), "type", -648200466);
        setField(term19729, term19729.getClass(), "next", null);
        setField(term19729, term19729.getClass(), "first", term19717);
        setField(term19729, term19729.getClass(), "last", term19720);
        setField(term19729, term19729.getClass(), "propListHead", null);
        setIntField(term19729, term19729.getClass(), "sourcePosition", 0);
        setField(term19729, term19729.getClass(), "jsType", null);
        setField(term19729, term19729.getClass(), "parent", null);
        setField(term19724, term19724.getClass(), "last", term19729);
        setField(term19724, term19724.getClass(), "propListHead", null);
        setIntField(term19724, term19724.getClass(), "sourcePosition", 0);
        setField(term19724, term19724.getClass(), "jsType", null);
        setField(term19724, term19724.getClass(), "parent", null);
        setField(term19710, term19710.getClass(), "first", term19724);
        setField(term19710, term19710.getClass(), "last", term19714);
        setField(term19710, term19710.getClass(), "propListHead", null);
        setIntField(term19710, term19710.getClass(), "sourcePosition", 0);
        setField(term19710, term19710.getClass(), "jsType", null);
        setField(term19710, term19710.getClass(), "parent", null);
        setField(term19709, term19709.getClass(), "parameters", term19710);
        setField(term19709, term19709.getClass(), "returnType", null);
        setBooleanField(term19709, term19709.getClass(), "returnTypeInferred", false);
        setBooleanField(term19709, term19709.getClass(), "resolved", false);
        setField(term19709, term19709.getClass(), "resolveResult", null);
        setBooleanField(term19709, term19709.getClass(), "inTemplatedCheckVisit", false);
        setField(term19709, term19709.getClass(), "registry", null);
        setField(term19708, term19708.getClass(), "call", term19709);
        setField(term19737, term19737.getClass(), "name", null);
        setField(term19737, term19737.getClass(), "type", null);
        setBooleanField(term19737, term19737.getClass(), "inferred", false);
        setField(term19737, term19737.getClass(), "propertyNode", null);
        setField(term19737, term19737.getClass(), "docInfo", null);
        setField(term19708, term19708.getClass(), "prototypeSlot", term19737);
        setField(term19708, term19708.getClass(), "kind", enum246);
        setField(term19708, term19708.getClass(), "propAccess", enum247);
        setField(term19708, term19708.getClass(), "typeOfThis", null);
        setField(term19708, term19708.getClass(), "source", null);
        setField(term19708, term19708.getClass(), "implementedInterfaces", null);
        setField(term19708, term19708.getClass(), "extendedInterfaces", null);
        setField(term19708, term19708.getClass(), "subTypes", null);
        setField(term19708, term19708.getClass(), "templateTypeNames", null);
        setField(term19708, term19708.getClass(), "className", null);
        setField(term19708, term19708.getClass(), "properties", null);
        setBooleanField(term19708, term19708.getClass(), "nativeType", false);
        setField(term19708, term19708.getClass(), "implicitPrototypeFallback", null);
        setField(term19708, term19708.getClass(), "ownerFunction", null);
        setBooleanField(term19708, term19708.getClass(), "prettyPrint", false);
        setBooleanField(term19708, term19708.getClass(), "visited", false);
        setField(term19708, term19708.getClass(), "docInfo", null);
        setBooleanField(term19708, term19708.getClass(), "unknown", false);
        setBooleanField(term19708, term19708.getClass(), "resolved", false);
        setField(term19708, term19708.getClass(), "resolveResult", null);
        setBooleanField(term19708, term19708.getClass(), "inTemplatedCheckVisit", false);
        setField(term19708, term19708.getClass(), "registry", null);
        term19766 = new LinkedList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.List");
        Object[] args = new Object[1];
        args[0] = term19766;
        try {
            callMethod(klass, "setImplementedInterfaces", argTypes, term19708, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


