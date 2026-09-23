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

public class FunctionType_resolveInternal_5807426107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20654;

    public FunctionType_resolveInternal_5807426107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term59476 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term59475 = ((Class) term59476).getDeclaredField((String) "ORDINARY");
        ((Field) term59475).setAccessible(true);
        Object enum151 = ((Field) term59475).get((Object) null);
        term20654 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term20655 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term20656 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20658 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20660 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20663 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20666 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20669 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term20673 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20676 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term20679 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term20685 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term20656, term20656.getClass(), "type", 520504102);
        setIntField(term20658, term20658.getClass(), "type", 1895143076);
        setIntField(term20660, term20660.getClass(), "type", 0);
        setField(term20660, term20660.getClass(), "next", null);
        setField(term20660, term20660.getClass(), "first", null);
        setField(term20660, term20660.getClass(), "last", null);
        setField(term20660, term20660.getClass(), "propListHead", null);
        setIntField(term20660, term20660.getClass(), "sourcePosition", 0);
        setField(term20660, term20660.getClass(), "jsType", null);
        setField(term20660, term20660.getClass(), "parent", null);
        setField(term20658, term20658.getClass(), "next", term20660);
        setIntField(term20663, term20663.getClass(), "type", 0);
        setField(term20663, term20663.getClass(), "next", null);
        setField(term20663, term20663.getClass(), "first", null);
        setField(term20663, term20663.getClass(), "last", null);
        setField(term20663, term20663.getClass(), "propListHead", null);
        setIntField(term20663, term20663.getClass(), "sourcePosition", 0);
        setField(term20663, term20663.getClass(), "jsType", null);
        setField(term20663, term20663.getClass(), "parent", null);
        setField(term20658, term20658.getClass(), "first", term20663);
        setIntField(term20666, term20666.getClass(), "type", 0);
        setField(term20666, term20666.getClass(), "next", null);
        setField(term20666, term20666.getClass(), "first", null);
        setField(term20666, term20666.getClass(), "last", null);
        setField(term20666, term20666.getClass(), "propListHead", null);
        setIntField(term20666, term20666.getClass(), "sourcePosition", 0);
        setField(term20666, term20666.getClass(), "jsType", null);
        setField(term20666, term20666.getClass(), "parent", null);
        setField(term20658, term20658.getClass(), "last", term20666);
        setField(term20669, term20669.getClass(), "next", null);
        setIntField(term20669, term20669.getClass(), "type", 0);
        setIntField(term20669, term20669.getClass(), "intValue", 0);
        setField(term20669, term20669.getClass(), "objectValue", null);
        setField(term20658, term20658.getClass(), "propListHead", term20669);
        setIntField(term20658, term20658.getClass(), "sourcePosition", 1981860404);
        setField(term20658, term20658.getClass(), "jsType", null);
        setField(term20658, term20658.getClass(), "parent", null);
        setField(term20656, term20656.getClass(), "next", term20658);
        setIntField(term20673, term20673.getClass(), "type", 0);
        setField(term20673, term20673.getClass(), "next", null);
        setField(term20673, term20673.getClass(), "first", null);
        setField(term20673, term20673.getClass(), "last", null);
        setField(term20673, term20673.getClass(), "propListHead", null);
        setIntField(term20673, term20673.getClass(), "sourcePosition", 0);
        setField(term20673, term20673.getClass(), "jsType", null);
        setField(term20673, term20673.getClass(), "parent", null);
        setField(term20656, term20656.getClass(), "first", term20673);
        setIntField(term20676, term20676.getClass(), "type", 0);
        setField(term20676, term20676.getClass(), "next", null);
        setField(term20676, term20676.getClass(), "first", null);
        setField(term20676, term20676.getClass(), "last", null);
        setField(term20676, term20676.getClass(), "propListHead", null);
        setIntField(term20676, term20676.getClass(), "sourcePosition", 0);
        setField(term20676, term20676.getClass(), "jsType", null);
        setField(term20676, term20676.getClass(), "parent", null);
        setField(term20656, term20656.getClass(), "last", term20676);
        setField(term20679, term20679.getClass(), "next", null);
        setIntField(term20679, term20679.getClass(), "type", 0);
        setIntField(term20679, term20679.getClass(), "intValue", 0);
        setField(term20679, term20679.getClass(), "objectValue", null);
        setField(term20656, term20656.getClass(), "propListHead", term20679);
        setIntField(term20656, term20656.getClass(), "sourcePosition", 732174235);
        setField(term20656, term20656.getClass(), "jsType", null);
        setField(term20656, term20656.getClass(), "parent", null);
        setField(term20655, term20655.getClass(), "parameters", term20656);
        setField(term20655, term20655.getClass(), "returnType", null);
        setBooleanField(term20655, term20655.getClass(), "returnTypeInferred", false);
        setBooleanField(term20655, term20655.getClass(), "resolved", false);
        setField(term20655, term20655.getClass(), "resolveResult", null);
        setField(term20655, term20655.getClass(), "registry", null);
        setField(term20654, term20654.getClass(), "call", term20655);
        setField(term20685, term20685.getClass(), "ownerFunction", null);
        setField(term20685, term20685.getClass(), "className", null);
        setField(term20685, term20685.getClass(), "properties", null);
        setBooleanField(term20685, term20685.getClass(), "nativeType", false);
        setField(term20685, term20685.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term20685, term20685.getClass(), "prettyPrint", false);
        setBooleanField(term20685, term20685.getClass(), "visited", false);
        setField(term20685, term20685.getClass(), "docInfo", null);
        setBooleanField(term20685, term20685.getClass(), "unknown", false);
        setBooleanField(term20685, term20685.getClass(), "resolved", false);
        setField(term20685, term20685.getClass(), "resolveResult", null);
        setField(term20685, term20685.getClass(), "registry", null);
        setField(term20654, term20654.getClass(), "prototype", term20685);
        setField(term20654, term20654.getClass(), "kind", enum151);
        setField(term20654, term20654.getClass(), "typeOfThis", null);
        setField(term20654, term20654.getClass(), "source", null);
        setField(term20654, term20654.getClass(), "implementedInterfaces", null);
        setField(term20654, term20654.getClass(), "subTypes", null);
        setField(term20654, term20654.getClass(), "templateTypeName", null);
        setField(term20654, term20654.getClass(), "className", null);
        setField(term20654, term20654.getClass(), "properties", null);
        setBooleanField(term20654, term20654.getClass(), "nativeType", false);
        setField(term20654, term20654.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term20654, term20654.getClass(), "prettyPrint", false);
        setBooleanField(term20654, term20654.getClass(), "visited", false);
        setField(term20654, term20654.getClass(), "docInfo", null);
        setBooleanField(term20654, term20654.getClass(), "unknown", false);
        setBooleanField(term20654, term20654.getClass(), "resolved", false);
        setField(term20654, term20654.getClass(), "resolveResult", null);
        setField(term20654, term20654.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "resolveInternal", argTypes, term20654, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


