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
import java.lang.IllegalArgumentException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FunctionType_hasUnknownSupertype_25949462980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12026;

    public FunctionType_hasUnknownSupertype_25949462980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41587 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term41586 = ((Class) term41587).getDeclaredField((String) "ORDINARY");
        ((Field) term41586).setAccessible(true);
        Object enum102 = ((Field) term41586).get((Object) null);
        term12026 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term12027 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term12028 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12030 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12032 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12035 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12038 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12041 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12045 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12048 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term12051 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term12056 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term12028, term12028.getClass(), "type", -350454594);
        setIntField(term12030, term12030.getClass(), "type", 1390820006);
        setIntField(term12032, term12032.getClass(), "type", 0);
        setField(term12032, term12032.getClass(), "next", null);
        setField(term12032, term12032.getClass(), "first", null);
        setField(term12032, term12032.getClass(), "last", null);
        setField(term12032, term12032.getClass(), "propListHead", null);
        setIntField(term12032, term12032.getClass(), "sourcePosition", 0);
        setField(term12032, term12032.getClass(), "jsType", null);
        setField(term12032, term12032.getClass(), "parent", null);
        setField(term12030, term12030.getClass(), "next", term12032);
        setIntField(term12035, term12035.getClass(), "type", 0);
        setField(term12035, term12035.getClass(), "next", null);
        setField(term12035, term12035.getClass(), "first", null);
        setField(term12035, term12035.getClass(), "last", null);
        setField(term12035, term12035.getClass(), "propListHead", null);
        setIntField(term12035, term12035.getClass(), "sourcePosition", 0);
        setField(term12035, term12035.getClass(), "jsType", null);
        setField(term12035, term12035.getClass(), "parent", null);
        setField(term12030, term12030.getClass(), "first", term12035);
        setIntField(term12038, term12038.getClass(), "type", 0);
        setField(term12038, term12038.getClass(), "next", null);
        setField(term12038, term12038.getClass(), "first", null);
        setField(term12038, term12038.getClass(), "last", null);
        setField(term12038, term12038.getClass(), "propListHead", null);
        setIntField(term12038, term12038.getClass(), "sourcePosition", 0);
        setField(term12038, term12038.getClass(), "jsType", null);
        setField(term12038, term12038.getClass(), "parent", null);
        setField(term12030, term12030.getClass(), "last", term12038);
        setField(term12041, term12041.getClass(), "next", null);
        setIntField(term12041, term12041.getClass(), "type", 0);
        setIntField(term12041, term12041.getClass(), "intValue", 0);
        setField(term12041, term12041.getClass(), "objectValue", null);
        setField(term12030, term12030.getClass(), "propListHead", term12041);
        setIntField(term12030, term12030.getClass(), "sourcePosition", -828982065);
        setField(term12030, term12030.getClass(), "jsType", null);
        setField(term12030, term12030.getClass(), "parent", null);
        setField(term12028, term12028.getClass(), "next", term12030);
        setIntField(term12045, term12045.getClass(), "type", 0);
        setField(term12045, term12045.getClass(), "next", null);
        setField(term12045, term12045.getClass(), "first", null);
        setField(term12045, term12045.getClass(), "last", null);
        setField(term12045, term12045.getClass(), "propListHead", null);
        setIntField(term12045, term12045.getClass(), "sourcePosition", 0);
        setField(term12045, term12045.getClass(), "jsType", null);
        setField(term12045, term12045.getClass(), "parent", null);
        setField(term12028, term12028.getClass(), "first", term12045);
        setIntField(term12048, term12048.getClass(), "type", 0);
        setField(term12048, term12048.getClass(), "next", null);
        setField(term12048, term12048.getClass(), "first", null);
        setField(term12048, term12048.getClass(), "last", null);
        setField(term12048, term12048.getClass(), "propListHead", null);
        setIntField(term12048, term12048.getClass(), "sourcePosition", 0);
        setField(term12048, term12048.getClass(), "jsType", null);
        setField(term12048, term12048.getClass(), "parent", null);
        setField(term12028, term12028.getClass(), "last", term12048);
        setField(term12051, term12051.getClass(), "next", null);
        setIntField(term12051, term12051.getClass(), "type", 0);
        setIntField(term12051, term12051.getClass(), "intValue", 0);
        setField(term12051, term12051.getClass(), "objectValue", null);
        setField(term12028, term12028.getClass(), "propListHead", term12051);
        setIntField(term12028, term12028.getClass(), "sourcePosition", 1221443226);
        setField(term12028, term12028.getClass(), "jsType", null);
        setField(term12028, term12028.getClass(), "parent", null);
        setField(term12027, term12027.getClass(), "parameters", term12028);
        setField(term12027, term12027.getClass(), "returnType", null);
        setBooleanField(term12027, term12027.getClass(), "resolved", false);
        setField(term12027, term12027.getClass(), "resolveResult", null);
        setField(term12027, term12027.getClass(), "registry", null);
        setField(term12026, term12026.getClass(), "call", term12027);
        setField(term12056, term12056.getClass(), "ownerFunction", null);
        setField(term12056, term12056.getClass(), "className", null);
        setField(term12056, term12056.getClass(), "properties", null);
        setField(term12056, term12056.getClass(), "implicitPrototype", null);
        setBooleanField(term12056, term12056.getClass(), "nativeType", false);
        setBooleanField(term12056, term12056.getClass(), "visited", false);
        setField(term12056, term12056.getClass(), "docInfo", null);
        setBooleanField(term12056, term12056.getClass(), "unknown", false);
        setBooleanField(term12056, term12056.getClass(), "resolved", false);
        setField(term12056, term12056.getClass(), "resolveResult", null);
        setField(term12056, term12056.getClass(), "registry", null);
        setField(term12026, term12026.getClass(), "prototype", term12056);
        setField(term12026, term12026.getClass(), "kind", enum102);
        setField(term12026, term12026.getClass(), "typeOfThis", null);
        setField(term12026, term12026.getClass(), "source", null);
        setField(term12026, term12026.getClass(), "implementedInterfaces", null);
        setField(term12026, term12026.getClass(), "subTypes", null);
        setField(term12026, term12026.getClass(), "templateTypeName", null);
        setField(term12026, term12026.getClass(), "className", null);
        setField(term12026, term12026.getClass(), "properties", null);
        setField(term12026, term12026.getClass(), "implicitPrototype", null);
        setBooleanField(term12026, term12026.getClass(), "nativeType", false);
        setBooleanField(term12026, term12026.getClass(), "visited", false);
        setField(term12026, term12026.getClass(), "docInfo", null);
        setBooleanField(term12026, term12026.getClass(), "unknown", false);
        setBooleanField(term12026, term12026.getClass(), "resolved", false);
        setField(term12026, term12026.getClass(), "resolveResult", null);
        setField(term12026, term12026.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "hasUnknownSupertype", argTypes, term12026, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


