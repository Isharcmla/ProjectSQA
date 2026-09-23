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

public class FunctionType_getLeastSupertype_41885088683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11704;

    public FunctionType_getLeastSupertype_41885088683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41686 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term41685 = ((Class) term41686).getDeclaredField((String) "ORDINARY");
        ((Field) term41685).setAccessible(true);
        Object enum107 = ((Field) term41685).get((Object) null);
        term11704 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term11705 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term11706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11708 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11710 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11713 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11716 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11719 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11723 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11726 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11729 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11735 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term11706, term11706.getClass(), "type", -1694747156);
        setIntField(term11708, term11708.getClass(), "type", 954660603);
        setIntField(term11710, term11710.getClass(), "type", 0);
        setField(term11710, term11710.getClass(), "next", null);
        setField(term11710, term11710.getClass(), "first", null);
        setField(term11710, term11710.getClass(), "last", null);
        setField(term11710, term11710.getClass(), "propListHead", null);
        setIntField(term11710, term11710.getClass(), "sourcePosition", 0);
        setField(term11710, term11710.getClass(), "jsType", null);
        setField(term11710, term11710.getClass(), "parent", null);
        setField(term11708, term11708.getClass(), "next", term11710);
        setIntField(term11713, term11713.getClass(), "type", 0);
        setField(term11713, term11713.getClass(), "next", null);
        setField(term11713, term11713.getClass(), "first", null);
        setField(term11713, term11713.getClass(), "last", null);
        setField(term11713, term11713.getClass(), "propListHead", null);
        setIntField(term11713, term11713.getClass(), "sourcePosition", 0);
        setField(term11713, term11713.getClass(), "jsType", null);
        setField(term11713, term11713.getClass(), "parent", null);
        setField(term11708, term11708.getClass(), "first", term11713);
        setIntField(term11716, term11716.getClass(), "type", 0);
        setField(term11716, term11716.getClass(), "next", null);
        setField(term11716, term11716.getClass(), "first", null);
        setField(term11716, term11716.getClass(), "last", null);
        setField(term11716, term11716.getClass(), "propListHead", null);
        setIntField(term11716, term11716.getClass(), "sourcePosition", 0);
        setField(term11716, term11716.getClass(), "jsType", null);
        setField(term11716, term11716.getClass(), "parent", null);
        setField(term11708, term11708.getClass(), "last", term11716);
        setField(term11719, term11719.getClass(), "next", null);
        setIntField(term11719, term11719.getClass(), "type", 0);
        setIntField(term11719, term11719.getClass(), "intValue", 0);
        setField(term11719, term11719.getClass(), "objectValue", null);
        setField(term11708, term11708.getClass(), "propListHead", term11719);
        setIntField(term11708, term11708.getClass(), "sourcePosition", -1351605385);
        setField(term11708, term11708.getClass(), "jsType", null);
        setField(term11708, term11708.getClass(), "parent", null);
        setField(term11706, term11706.getClass(), "next", term11708);
        setIntField(term11723, term11723.getClass(), "type", 0);
        setField(term11723, term11723.getClass(), "next", null);
        setField(term11723, term11723.getClass(), "first", null);
        setField(term11723, term11723.getClass(), "last", null);
        setField(term11723, term11723.getClass(), "propListHead", null);
        setIntField(term11723, term11723.getClass(), "sourcePosition", 0);
        setField(term11723, term11723.getClass(), "jsType", null);
        setField(term11723, term11723.getClass(), "parent", null);
        setField(term11706, term11706.getClass(), "first", term11723);
        setIntField(term11726, term11726.getClass(), "type", 0);
        setField(term11726, term11726.getClass(), "next", null);
        setField(term11726, term11726.getClass(), "first", null);
        setField(term11726, term11726.getClass(), "last", null);
        setField(term11726, term11726.getClass(), "propListHead", null);
        setIntField(term11726, term11726.getClass(), "sourcePosition", 0);
        setField(term11726, term11726.getClass(), "jsType", null);
        setField(term11726, term11726.getClass(), "parent", null);
        setField(term11706, term11706.getClass(), "last", term11726);
        setField(term11729, term11729.getClass(), "next", null);
        setIntField(term11729, term11729.getClass(), "type", 0);
        setIntField(term11729, term11729.getClass(), "intValue", 0);
        setField(term11729, term11729.getClass(), "objectValue", null);
        setField(term11706, term11706.getClass(), "propListHead", term11729);
        setIntField(term11706, term11706.getClass(), "sourcePosition", 278355793);
        setField(term11706, term11706.getClass(), "jsType", null);
        setField(term11706, term11706.getClass(), "parent", null);
        setField(term11705, term11705.getClass(), "parameters", term11706);
        setField(term11705, term11705.getClass(), "returnType", null);
        setBooleanField(term11705, term11705.getClass(), "returnTypeInferred", false);
        setBooleanField(term11705, term11705.getClass(), "resolved", false);
        setField(term11705, term11705.getClass(), "resolveResult", null);
        setField(term11705, term11705.getClass(), "registry", null);
        setField(term11704, term11704.getClass(), "call", term11705);
        setField(term11735, term11735.getClass(), "ownerFunction", null);
        setField(term11735, term11735.getClass(), "className", null);
        setField(term11735, term11735.getClass(), "properties", null);
        setBooleanField(term11735, term11735.getClass(), "nativeType", false);
        setField(term11735, term11735.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term11735, term11735.getClass(), "prettyPrint", false);
        setBooleanField(term11735, term11735.getClass(), "visited", false);
        setField(term11735, term11735.getClass(), "docInfo", null);
        setBooleanField(term11735, term11735.getClass(), "unknown", false);
        setBooleanField(term11735, term11735.getClass(), "resolved", false);
        setField(term11735, term11735.getClass(), "resolveResult", null);
        setField(term11735, term11735.getClass(), "registry", null);
        setField(term11704, term11704.getClass(), "prototype", term11735);
        setField(term11704, term11704.getClass(), "kind", enum107);
        setField(term11704, term11704.getClass(), "typeOfThis", null);
        setField(term11704, term11704.getClass(), "source", null);
        setField(term11704, term11704.getClass(), "implementedInterfaces", null);
        setField(term11704, term11704.getClass(), "subTypes", null);
        setField(term11704, term11704.getClass(), "templateTypeName", null);
        setField(term11704, term11704.getClass(), "className", null);
        setField(term11704, term11704.getClass(), "properties", null);
        setBooleanField(term11704, term11704.getClass(), "nativeType", false);
        setField(term11704, term11704.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term11704, term11704.getClass(), "prettyPrint", false);
        setBooleanField(term11704, term11704.getClass(), "visited", false);
        setField(term11704, term11704.getClass(), "docInfo", null);
        setBooleanField(term11704, term11704.getClass(), "unknown", false);
        setBooleanField(term11704, term11704.getClass(), "resolved", false);
        setField(term11704, term11704.getClass(), "resolveResult", null);
        setField(term11704, term11704.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term11704, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


