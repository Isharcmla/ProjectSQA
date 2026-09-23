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
import java.lang.String;
import java.util.ArrayList;

public class FunctionType_setPrototypeNoCheck_1402626902572 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term550631;
     Object term551203;
     Object term551780;
     Object term551790;

    public FunctionType_setPrototypeNoCheck_1402626902572() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term551802 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term551801 = ((Class) term551802).getDeclaredField((String) "ORDINARY");
        ((Field) term551801).setAccessible(true);
        Object enum901 = ((Field) term551801).get((Object) null);
        term550631 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term550745 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term550845 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term550945 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term550845, term550845.getClass(), "ownerFunction", term550945);
        setField(term550745, term550745.getClass(), "type", term550845);
        setField(term550631, term550631.getClass(), "prototypeSlot", term550745);
        setField(term550631, term550631.getClass(), "source", null);
        setField(term550631, term550631.getClass(), "kind", enum901);
        setBooleanField(term550631, term550631.getClass(), "unknown", false);
        setField(term550631, term550631.getClass(), "subTypes", null);
        setBooleanField(term550631, term550631.getClass(), "nativeType", false);
        ArrayList term551255 = new ArrayList();
        term551203 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term551203, term551203.getClass(), "ownerFunction", null);
        setBooleanField(term551203, term551203.getClass(), "unknown", false);
        setField(term551203, term551203.getClass(), "subTypes", term551255);
        ArrayList term551785 = new ArrayList();
        Class<? extends Object> term552102 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term552101 = ((Class) term552102).getDeclaredField((String) "ORDINARY");
        ((Field) term552101).setAccessible(true);
        Object enum902 = ((Field) term552101).get((Object) null);
        term551780 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term551781 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term551784 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term551780, term551780.getClass(), "call", null);
        setField(term551781, term551781.getClass(), "name", "prototype");
        setField(term551784, term551784.getClass(), "call", null);
        setField(term551784, term551784.getClass(), "prototypeSlot", null);
        setField(term551784, term551784.getClass(), "kind", null);
        setField(term551784, term551784.getClass(), "propAccess", null);
        setField(term551784, term551784.getClass(), "typeOfThis", null);
        setField(term551784, term551784.getClass(), "source", null);
        setField(term551784, term551784.getClass(), "implementedInterfaces", null);
        setField(term551784, term551784.getClass(), "extendedInterfaces", null);
        setField(term551784, term551784.getClass(), "subTypes", term551785);
        setField(term551784, term551784.getClass(), "templateTypeNames", null);
        setField(term551784, term551784.getClass(), "className", null);
        setField(term551784, term551784.getClass(), "properties", null);
        setBooleanField(term551784, term551784.getClass(), "nativeType", false);
        setField(term551784, term551784.getClass(), "implicitPrototypeFallback", null);
        setField(term551784, term551784.getClass(), "ownerFunction", term551780);
        setBooleanField(term551784, term551784.getClass(), "prettyPrint", false);
        setBooleanField(term551784, term551784.getClass(), "visited", false);
        setField(term551784, term551784.getClass(), "docInfo", null);
        setBooleanField(term551784, term551784.getClass(), "unknown", true);
        setBooleanField(term551784, term551784.getClass(), "resolved", false);
        setField(term551784, term551784.getClass(), "resolveResult", null);
        setBooleanField(term551784, term551784.getClass(), "inTemplatedCheckVisit", false);
        setField(term551784, term551784.getClass(), "registry", null);
        setField(term551781, term551781.getClass(), "type", term551784);
        setBooleanField(term551781, term551781.getClass(), "inferred", true);
        setField(term551781, term551781.getClass(), "propertyNode", null);
        setField(term551781, term551781.getClass(), "docInfo", null);
        setField(term551780, term551780.getClass(), "prototypeSlot", term551781);
        setField(term551780, term551780.getClass(), "kind", enum902);
        setField(term551780, term551780.getClass(), "propAccess", null);
        setField(term551780, term551780.getClass(), "typeOfThis", null);
        setField(term551780, term551780.getClass(), "source", null);
        setField(term551780, term551780.getClass(), "implementedInterfaces", null);
        setField(term551780, term551780.getClass(), "extendedInterfaces", null);
        setField(term551780, term551780.getClass(), "subTypes", null);
        setField(term551780, term551780.getClass(), "templateTypeNames", null);
        setField(term551780, term551780.getClass(), "className", null);
        setField(term551780, term551780.getClass(), "properties", null);
        setBooleanField(term551780, term551780.getClass(), "nativeType", false);
        setField(term551780, term551780.getClass(), "implicitPrototypeFallback", null);
        setField(term551780, term551780.getClass(), "ownerFunction", null);
        setBooleanField(term551780, term551780.getClass(), "prettyPrint", false);
        setBooleanField(term551780, term551780.getClass(), "visited", false);
        setField(term551780, term551780.getClass(), "docInfo", null);
        setBooleanField(term551780, term551780.getClass(), "unknown", true);
        setBooleanField(term551780, term551780.getClass(), "resolved", false);
        setField(term551780, term551780.getClass(), "resolveResult", null);
        setBooleanField(term551780, term551780.getClass(), "inTemplatedCheckVisit", false);
        setField(term551780, term551780.getClass(), "registry", null);
        ArrayList term551791 = new ArrayList();
        Class<? extends Object> term552402 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term552401 = ((Class) term552402).getDeclaredField((String) "ORDINARY");
        ((Field) term552401).setAccessible(true);
        Object enum903 = ((Field) term552401).get((Object) null);
        term551790 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term551793 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term551794 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term551790, term551790.getClass(), "call", null);
        setField(term551790, term551790.getClass(), "prototypeSlot", null);
        setField(term551790, term551790.getClass(), "kind", null);
        setField(term551790, term551790.getClass(), "propAccess", null);
        setField(term551790, term551790.getClass(), "typeOfThis", null);
        setField(term551790, term551790.getClass(), "source", null);
        setField(term551790, term551790.getClass(), "implementedInterfaces", null);
        setField(term551790, term551790.getClass(), "extendedInterfaces", null);
        setField(term551790, term551790.getClass(), "subTypes", term551791);
        setField(term551790, term551790.getClass(), "templateTypeNames", null);
        setField(term551790, term551790.getClass(), "className", null);
        setField(term551790, term551790.getClass(), "properties", null);
        setBooleanField(term551790, term551790.getClass(), "nativeType", false);
        setField(term551790, term551790.getClass(), "implicitPrototypeFallback", null);
        setField(term551793, term551793.getClass(), "call", null);
        setField(term551794, term551794.getClass(), "name", "prototype");
        setField(term551794, term551794.getClass(), "type", term551790);
        setBooleanField(term551794, term551794.getClass(), "inferred", true);
        setField(term551794, term551794.getClass(), "propertyNode", null);
        setField(term551794, term551794.getClass(), "docInfo", null);
        setField(term551793, term551793.getClass(), "prototypeSlot", term551794);
        setField(term551793, term551793.getClass(), "kind", enum903);
        setField(term551793, term551793.getClass(), "propAccess", null);
        setField(term551793, term551793.getClass(), "typeOfThis", null);
        setField(term551793, term551793.getClass(), "source", null);
        setField(term551793, term551793.getClass(), "implementedInterfaces", null);
        setField(term551793, term551793.getClass(), "extendedInterfaces", null);
        setField(term551793, term551793.getClass(), "subTypes", null);
        setField(term551793, term551793.getClass(), "templateTypeNames", null);
        setField(term551793, term551793.getClass(), "className", null);
        setField(term551793, term551793.getClass(), "properties", null);
        setBooleanField(term551793, term551793.getClass(), "nativeType", false);
        setField(term551793, term551793.getClass(), "implicitPrototypeFallback", null);
        setField(term551793, term551793.getClass(), "ownerFunction", null);
        setBooleanField(term551793, term551793.getClass(), "prettyPrint", false);
        setBooleanField(term551793, term551793.getClass(), "visited", false);
        setField(term551793, term551793.getClass(), "docInfo", null);
        setBooleanField(term551793, term551793.getClass(), "unknown", true);
        setBooleanField(term551793, term551793.getClass(), "resolved", false);
        setField(term551793, term551793.getClass(), "resolveResult", null);
        setBooleanField(term551793, term551793.getClass(), "inTemplatedCheckVisit", false);
        setField(term551793, term551793.getClass(), "registry", null);
        setField(term551790, term551790.getClass(), "ownerFunction", term551793);
        setBooleanField(term551790, term551790.getClass(), "prettyPrint", false);
        setBooleanField(term551790, term551790.getClass(), "visited", false);
        setField(term551790, term551790.getClass(), "docInfo", null);
        setBooleanField(term551790, term551790.getClass(), "unknown", true);
        setBooleanField(term551790, term551790.getClass(), "resolved", false);
        setField(term551790, term551790.getClass(), "resolveResult", null);
        setBooleanField(term551790, term551790.getClass(), "inTemplatedCheckVisit", false);
        setField(term551790, term551790.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term551203;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototypeNoCheck", argTypes, term550631, args);
        assertTrue(recursiveEquals(term550631, term551780));
        assertTrue(recursiveEquals(term551203, term551790));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


