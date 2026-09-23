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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FunctionType_addRelatedInterfaces_784954428101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17718;
     Object term17774;

    public FunctionType_addRelatedInterfaces_784954428101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term82440 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term82439 = ((Class) term82440).getDeclaredField((String) "ORDINARY");
        ((Field) term82439).setAccessible(true);
        Object enum236 = ((Field) term82439).get((Object) null);
        Class<? extends Object> term82731 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term82730 = ((Class) term82731).getDeclaredField((String) "ANY");
        ((Field) term82730).setAccessible(true);
        Object enum237 = ((Field) term82730).get((Object) null);
        term17718 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term17719 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term17720 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17722 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17730 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17734 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17736 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17739 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term17747 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term17720, term17720.getClass(), "type", -1464172784);
        setIntField(term17722, term17722.getClass(), "type", 32185364);
        setIntField(term17724, term17724.getClass(), "type", 1768204942);
        setField(term17724, term17724.getClass(), "next", null);
        setField(term17724, term17724.getClass(), "first", null);
        setField(term17724, term17724.getClass(), "last", null);
        setField(term17724, term17724.getClass(), "propListHead", null);
        setIntField(term17724, term17724.getClass(), "sourcePosition", 0);
        setField(term17724, term17724.getClass(), "jsType", null);
        setField(term17724, term17724.getClass(), "parent", null);
        setField(term17722, term17722.getClass(), "next", term17724);
        setIntField(term17727, term17727.getClass(), "type", 0);
        setField(term17727, term17727.getClass(), "next", null);
        setField(term17727, term17727.getClass(), "first", null);
        setField(term17727, term17727.getClass(), "last", null);
        setField(term17727, term17727.getClass(), "propListHead", null);
        setIntField(term17727, term17727.getClass(), "sourcePosition", 0);
        setField(term17727, term17727.getClass(), "jsType", null);
        setField(term17727, term17727.getClass(), "parent", null);
        setField(term17722, term17722.getClass(), "first", term17727);
        setIntField(term17730, term17730.getClass(), "type", -1015274146);
        setField(term17730, term17730.getClass(), "next", null);
        setField(term17730, term17730.getClass(), "first", term17727);
        setField(term17730, term17730.getClass(), "last", term17730);
        setField(term17730, term17730.getClass(), "propListHead", null);
        setIntField(term17730, term17730.getClass(), "sourcePosition", 0);
        setField(term17730, term17730.getClass(), "jsType", null);
        setField(term17730, term17730.getClass(), "parent", null);
        setField(term17722, term17722.getClass(), "last", term17730);
        setField(term17722, term17722.getClass(), "propListHead", null);
        setIntField(term17722, term17722.getClass(), "sourcePosition", 0);
        setField(term17722, term17722.getClass(), "jsType", null);
        setField(term17722, term17722.getClass(), "parent", null);
        setField(term17720, term17720.getClass(), "next", term17722);
        setIntField(term17734, term17734.getClass(), "type", -310528004);
        setIntField(term17736, term17736.getClass(), "type", -634976996);
        setField(term17736, term17736.getClass(), "next", term17730);
        setField(term17736, term17736.getClass(), "first", null);
        setField(term17736, term17736.getClass(), "last", term17720);
        setField(term17736, term17736.getClass(), "propListHead", null);
        setIntField(term17736, term17736.getClass(), "sourcePosition", 0);
        setField(term17736, term17736.getClass(), "jsType", null);
        setField(term17736, term17736.getClass(), "parent", null);
        setField(term17734, term17734.getClass(), "next", term17736);
        setField(term17734, term17734.getClass(), "first", term17734);
        setIntField(term17739, term17739.getClass(), "type", 1252951645);
        setField(term17739, term17739.getClass(), "next", null);
        setField(term17739, term17739.getClass(), "first", term17727);
        setField(term17739, term17739.getClass(), "last", term17730);
        setField(term17739, term17739.getClass(), "propListHead", null);
        setIntField(term17739, term17739.getClass(), "sourcePosition", 0);
        setField(term17739, term17739.getClass(), "jsType", null);
        setField(term17739, term17739.getClass(), "parent", null);
        setField(term17734, term17734.getClass(), "last", term17739);
        setField(term17734, term17734.getClass(), "propListHead", null);
        setIntField(term17734, term17734.getClass(), "sourcePosition", 0);
        setField(term17734, term17734.getClass(), "jsType", null);
        setField(term17734, term17734.getClass(), "parent", null);
        setField(term17720, term17720.getClass(), "first", term17734);
        setField(term17720, term17720.getClass(), "last", term17724);
        setField(term17720, term17720.getClass(), "propListHead", null);
        setIntField(term17720, term17720.getClass(), "sourcePosition", 0);
        setField(term17720, term17720.getClass(), "jsType", null);
        setField(term17720, term17720.getClass(), "parent", null);
        setField(term17719, term17719.getClass(), "parameters", term17720);
        setField(term17719, term17719.getClass(), "returnType", null);
        setBooleanField(term17719, term17719.getClass(), "returnTypeInferred", false);
        setBooleanField(term17719, term17719.getClass(), "resolved", false);
        setField(term17719, term17719.getClass(), "resolveResult", null);
        setBooleanField(term17719, term17719.getClass(), "inTemplatedCheckVisit", false);
        setField(term17719, term17719.getClass(), "registry", null);
        setField(term17718, term17718.getClass(), "call", term17719);
        setField(term17747, term17747.getClass(), "name", null);
        setField(term17747, term17747.getClass(), "type", null);
        setBooleanField(term17747, term17747.getClass(), "inferred", false);
        setField(term17747, term17747.getClass(), "propertyNode", null);
        setField(term17747, term17747.getClass(), "docInfo", null);
        setField(term17718, term17718.getClass(), "prototypeSlot", term17747);
        setField(term17718, term17718.getClass(), "kind", enum236);
        setField(term17718, term17718.getClass(), "propAccess", enum237);
        setField(term17718, term17718.getClass(), "typeOfThis", null);
        setField(term17718, term17718.getClass(), "source", null);
        setField(term17718, term17718.getClass(), "implementedInterfaces", null);
        setField(term17718, term17718.getClass(), "extendedInterfaces", null);
        setField(term17718, term17718.getClass(), "subTypes", null);
        setField(term17718, term17718.getClass(), "templateTypeNames", null);
        setField(term17718, term17718.getClass(), "className", null);
        setField(term17718, term17718.getClass(), "properties", null);
        setBooleanField(term17718, term17718.getClass(), "nativeType", false);
        setField(term17718, term17718.getClass(), "implicitPrototypeFallback", null);
        setField(term17718, term17718.getClass(), "ownerFunction", null);
        setBooleanField(term17718, term17718.getClass(), "prettyPrint", false);
        setBooleanField(term17718, term17718.getClass(), "visited", false);
        setField(term17718, term17718.getClass(), "docInfo", null);
        setBooleanField(term17718, term17718.getClass(), "unknown", false);
        setBooleanField(term17718, term17718.getClass(), "resolved", false);
        setField(term17718, term17718.getClass(), "resolveResult", null);
        setBooleanField(term17718, term17718.getClass(), "inTemplatedCheckVisit", false);
        setField(term17718, term17718.getClass(), "registry", null);
        HashMap term17775 = new HashMap();
        Set<Object> term83036 =  ((Map) term17775).keySet();
        term17774 = new HashSet((Collection<? extends Object>) term83036);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.util.Set");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term17774;
        try {
            callMethod(klass, "addRelatedInterfaces", argTypes, term17718, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


