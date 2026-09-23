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

public class FunctionType_toString_199218226593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15634;

    public FunctionType_toString_199218226593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term49788 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term49787 = ((Class) term49788).getDeclaredField((String) "ORDINARY");
        ((Field) term49787).setAccessible(true);
        Object enum127 = ((Field) term49787).get((Object) null);
        term15634 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term15635 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term15636 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15638 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15640 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15643 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15646 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15649 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15653 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term15659 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term15665 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term15636, term15636.getClass(), "type", -1792504217);
        setIntField(term15638, term15638.getClass(), "type", 510162332);
        setIntField(term15640, term15640.getClass(), "type", 0);
        setField(term15640, term15640.getClass(), "next", null);
        setField(term15640, term15640.getClass(), "first", null);
        setField(term15640, term15640.getClass(), "last", null);
        setField(term15640, term15640.getClass(), "propListHead", null);
        setIntField(term15640, term15640.getClass(), "sourcePosition", 0);
        setField(term15640, term15640.getClass(), "jsType", null);
        setField(term15640, term15640.getClass(), "parent", null);
        setField(term15638, term15638.getClass(), "next", term15640);
        setIntField(term15643, term15643.getClass(), "type", 0);
        setField(term15643, term15643.getClass(), "next", null);
        setField(term15643, term15643.getClass(), "first", null);
        setField(term15643, term15643.getClass(), "last", null);
        setField(term15643, term15643.getClass(), "propListHead", null);
        setIntField(term15643, term15643.getClass(), "sourcePosition", 0);
        setField(term15643, term15643.getClass(), "jsType", null);
        setField(term15643, term15643.getClass(), "parent", null);
        setField(term15638, term15638.getClass(), "first", term15643);
        setIntField(term15646, term15646.getClass(), "type", 0);
        setField(term15646, term15646.getClass(), "next", null);
        setField(term15646, term15646.getClass(), "first", null);
        setField(term15646, term15646.getClass(), "last", null);
        setField(term15646, term15646.getClass(), "propListHead", null);
        setIntField(term15646, term15646.getClass(), "sourcePosition", 0);
        setField(term15646, term15646.getClass(), "jsType", null);
        setField(term15646, term15646.getClass(), "parent", null);
        setField(term15638, term15638.getClass(), "last", term15646);
        setField(term15649, term15649.getClass(), "next", null);
        setIntField(term15649, term15649.getClass(), "type", 0);
        setIntField(term15649, term15649.getClass(), "intValue", 0);
        setField(term15649, term15649.getClass(), "objectValue", null);
        setField(term15638, term15638.getClass(), "propListHead", term15649);
        setIntField(term15638, term15638.getClass(), "sourcePosition", 888506903);
        setField(term15638, term15638.getClass(), "jsType", null);
        setField(term15638, term15638.getClass(), "parent", null);
        setField(term15636, term15636.getClass(), "next", term15638);
        setIntField(term15653, term15653.getClass(), "type", 0);
        setField(term15653, term15653.getClass(), "next", null);
        setField(term15653, term15653.getClass(), "first", null);
        setField(term15653, term15653.getClass(), "last", null);
        setField(term15653, term15653.getClass(), "propListHead", null);
        setIntField(term15653, term15653.getClass(), "sourcePosition", 0);
        setField(term15653, term15653.getClass(), "jsType", null);
        setField(term15653, term15653.getClass(), "parent", null);
        setField(term15636, term15636.getClass(), "first", term15653);
        setIntField(term15656, term15656.getClass(), "type", 0);
        setField(term15656, term15656.getClass(), "next", null);
        setField(term15656, term15656.getClass(), "first", null);
        setField(term15656, term15656.getClass(), "last", null);
        setField(term15656, term15656.getClass(), "propListHead", null);
        setIntField(term15656, term15656.getClass(), "sourcePosition", 0);
        setField(term15656, term15656.getClass(), "jsType", null);
        setField(term15656, term15656.getClass(), "parent", null);
        setField(term15636, term15636.getClass(), "last", term15656);
        setField(term15659, term15659.getClass(), "next", null);
        setIntField(term15659, term15659.getClass(), "type", 0);
        setIntField(term15659, term15659.getClass(), "intValue", 0);
        setField(term15659, term15659.getClass(), "objectValue", null);
        setField(term15636, term15636.getClass(), "propListHead", term15659);
        setIntField(term15636, term15636.getClass(), "sourcePosition", 200252898);
        setField(term15636, term15636.getClass(), "jsType", null);
        setField(term15636, term15636.getClass(), "parent", null);
        setField(term15635, term15635.getClass(), "parameters", term15636);
        setField(term15635, term15635.getClass(), "returnType", null);
        setBooleanField(term15635, term15635.getClass(), "returnTypeInferred", false);
        setBooleanField(term15635, term15635.getClass(), "resolved", false);
        setField(term15635, term15635.getClass(), "resolveResult", null);
        setField(term15635, term15635.getClass(), "registry", null);
        setField(term15634, term15634.getClass(), "call", term15635);
        setField(term15665, term15665.getClass(), "ownerFunction", null);
        setField(term15665, term15665.getClass(), "className", null);
        setField(term15665, term15665.getClass(), "properties", null);
        setField(term15665, term15665.getClass(), "implicitPrototype", null);
        setBooleanField(term15665, term15665.getClass(), "nativeType", false);
        setBooleanField(term15665, term15665.getClass(), "prettyPrint", false);
        setBooleanField(term15665, term15665.getClass(), "visited", false);
        setField(term15665, term15665.getClass(), "docInfo", null);
        setBooleanField(term15665, term15665.getClass(), "unknown", false);
        setBooleanField(term15665, term15665.getClass(), "resolved", false);
        setField(term15665, term15665.getClass(), "resolveResult", null);
        setField(term15665, term15665.getClass(), "registry", null);
        setField(term15634, term15634.getClass(), "prototype", term15665);
        setField(term15634, term15634.getClass(), "kind", enum127);
        setField(term15634, term15634.getClass(), "typeOfThis", null);
        setField(term15634, term15634.getClass(), "source", null);
        setField(term15634, term15634.getClass(), "implementedInterfaces", null);
        setField(term15634, term15634.getClass(), "subTypes", null);
        setField(term15634, term15634.getClass(), "templateTypeName", null);
        setField(term15634, term15634.getClass(), "className", null);
        setField(term15634, term15634.getClass(), "properties", null);
        setField(term15634, term15634.getClass(), "implicitPrototype", null);
        setBooleanField(term15634, term15634.getClass(), "nativeType", false);
        setBooleanField(term15634, term15634.getClass(), "prettyPrint", false);
        setBooleanField(term15634, term15634.getClass(), "visited", false);
        setField(term15634, term15634.getClass(), "docInfo", null);
        setBooleanField(term15634, term15634.getClass(), "unknown", false);
        setBooleanField(term15634, term15634.getClass(), "resolved", false);
        setField(term15634, term15634.getClass(), "resolveResult", null);
        setField(term15634, term15634.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term15634, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


