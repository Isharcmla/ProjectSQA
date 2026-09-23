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
import java.lang.Object;
import java.lang.String;

public class FunctionType_getInstanceType_194048756389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15561;

    public FunctionType_getInstanceType_194048756389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term48761 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term48760 = ((Class) term48761).getDeclaredField((String) "ORDINARY");
        ((Field) term48760).setAccessible(true);
        Object enum119 = ((Field) term48760).get((Object) null);
        term15561 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term15562 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term15563 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15565 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15570 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15573 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15576 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15580 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15583 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15586 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15591 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term15563, term15563.getClass(), "type", -222941705);
        setIntField(term15565, term15565.getClass(), "type", -197820800);
        setIntField(term15567, term15567.getClass(), "type", 0);
        setField(term15567, term15567.getClass(), "next", null);
        setField(term15567, term15567.getClass(), "first", null);
        setField(term15567, term15567.getClass(), "last", null);
        setField(term15567, term15567.getClass(), "propListHead", null);
        setIntField(term15567, term15567.getClass(), "sourcePosition", 0);
        setField(term15567, term15567.getClass(), "jsType", null);
        setField(term15567, term15567.getClass(), "parent", null);
        setField(term15565, term15565.getClass(), "next", term15567);
        setIntField(term15570, term15570.getClass(), "type", 0);
        setField(term15570, term15570.getClass(), "next", null);
        setField(term15570, term15570.getClass(), "first", null);
        setField(term15570, term15570.getClass(), "last", null);
        setField(term15570, term15570.getClass(), "propListHead", null);
        setIntField(term15570, term15570.getClass(), "sourcePosition", 0);
        setField(term15570, term15570.getClass(), "jsType", null);
        setField(term15570, term15570.getClass(), "parent", null);
        setField(term15565, term15565.getClass(), "first", term15570);
        setIntField(term15573, term15573.getClass(), "type", 0);
        setField(term15573, term15573.getClass(), "next", null);
        setField(term15573, term15573.getClass(), "first", null);
        setField(term15573, term15573.getClass(), "last", null);
        setField(term15573, term15573.getClass(), "propListHead", null);
        setIntField(term15573, term15573.getClass(), "sourcePosition", 0);
        setField(term15573, term15573.getClass(), "jsType", null);
        setField(term15573, term15573.getClass(), "parent", null);
        setField(term15565, term15565.getClass(), "last", term15573);
        setField(term15576, term15576.getClass(), "next", null);
        setIntField(term15576, term15576.getClass(), "type", 0);
        setIntField(term15576, term15576.getClass(), "intValue", 0);
        setField(term15576, term15576.getClass(), "objectValue", null);
        setField(term15565, term15565.getClass(), "propListHead", term15576);
        setIntField(term15565, term15565.getClass(), "sourcePosition", 723812297);
        setField(term15565, term15565.getClass(), "jsType", null);
        setField(term15565, term15565.getClass(), "parent", null);
        setField(term15563, term15563.getClass(), "next", term15565);
        setIntField(term15580, term15580.getClass(), "type", 0);
        setField(term15580, term15580.getClass(), "next", null);
        setField(term15580, term15580.getClass(), "first", null);
        setField(term15580, term15580.getClass(), "last", null);
        setField(term15580, term15580.getClass(), "propListHead", null);
        setIntField(term15580, term15580.getClass(), "sourcePosition", 0);
        setField(term15580, term15580.getClass(), "jsType", null);
        setField(term15580, term15580.getClass(), "parent", null);
        setField(term15563, term15563.getClass(), "first", term15580);
        setIntField(term15583, term15583.getClass(), "type", 0);
        setField(term15583, term15583.getClass(), "next", null);
        setField(term15583, term15583.getClass(), "first", null);
        setField(term15583, term15583.getClass(), "last", null);
        setField(term15583, term15583.getClass(), "propListHead", null);
        setIntField(term15583, term15583.getClass(), "sourcePosition", 0);
        setField(term15583, term15583.getClass(), "jsType", null);
        setField(term15583, term15583.getClass(), "parent", null);
        setField(term15563, term15563.getClass(), "last", term15583);
        setField(term15586, term15586.getClass(), "next", null);
        setIntField(term15586, term15586.getClass(), "type", 0);
        setIntField(term15586, term15586.getClass(), "intValue", 0);
        setField(term15586, term15586.getClass(), "objectValue", null);
        setField(term15563, term15563.getClass(), "propListHead", term15586);
        setIntField(term15563, term15563.getClass(), "sourcePosition", 1639448749);
        setField(term15563, term15563.getClass(), "jsType", null);
        setField(term15563, term15563.getClass(), "parent", null);
        setField(term15562, term15562.getClass(), "parameters", term15563);
        setField(term15562, term15562.getClass(), "returnType", null);
        setBooleanField(term15562, term15562.getClass(), "resolved", false);
        setField(term15562, term15562.getClass(), "resolveResult", null);
        setField(term15562, term15562.getClass(), "registry", null);
        setField(term15561, term15561.getClass(), "call", term15562);
        setField(term15591, term15591.getClass(), "ownerFunction", null);
        setField(term15591, term15591.getClass(), "className", null);
        setField(term15591, term15591.getClass(), "properties", null);
        setField(term15591, term15591.getClass(), "implicitPrototype", null);
        setBooleanField(term15591, term15591.getClass(), "nativeType", false);
        setBooleanField(term15591, term15591.getClass(), "visited", false);
        setField(term15591, term15591.getClass(), "docInfo", null);
        setBooleanField(term15591, term15591.getClass(), "unknown", false);
        setBooleanField(term15591, term15591.getClass(), "resolved", false);
        setField(term15591, term15591.getClass(), "resolveResult", null);
        setField(term15591, term15591.getClass(), "registry", null);
        setField(term15561, term15561.getClass(), "prototype", term15591);
        setField(term15561, term15561.getClass(), "kind", enum119);
        setField(term15561, term15561.getClass(), "typeOfThis", null);
        setField(term15561, term15561.getClass(), "source", null);
        setField(term15561, term15561.getClass(), "implementedInterfaces", null);
        setField(term15561, term15561.getClass(), "subTypes", null);
        setField(term15561, term15561.getClass(), "templateTypeName", null);
        setField(term15561, term15561.getClass(), "className", null);
        setField(term15561, term15561.getClass(), "properties", null);
        setField(term15561, term15561.getClass(), "implicitPrototype", null);
        setBooleanField(term15561, term15561.getClass(), "nativeType", false);
        setBooleanField(term15561, term15561.getClass(), "visited", false);
        setField(term15561, term15561.getClass(), "docInfo", null);
        setBooleanField(term15561, term15561.getClass(), "unknown", false);
        setBooleanField(term15561, term15561.getClass(), "resolved", false);
        setField(term15561, term15561.getClass(), "resolveResult", null);
        setField(term15561, term15561.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getInstanceType", argTypes, term15561, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


