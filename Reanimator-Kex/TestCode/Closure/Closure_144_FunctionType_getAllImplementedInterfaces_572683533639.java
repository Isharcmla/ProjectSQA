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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;

public class FunctionType_getAllImplementedInterfaces_572683533639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term637031;
     Object term637839;
     Object term637833;

    public FunctionType_getAllImplementedInterfaces_572683533639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term637848 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term637847 = ((Class) term637848).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term637847).setAccessible(true);
        Object enum1147 = ((Field) term637847).get((Object) null);
        ArrayList term637437 = new ArrayList();
        term637031 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term637297 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term637385 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term637031, term637031.getClass(), "kind", enum1147);
        setField(term637297, term637297.getClass(), "implicitPrototype", term637385);
        setField(term637031, term637031.getClass(), "prototype", term637297);
        setField(term637031, term637031.getClass(), "implementedInterfaces", term637437);
        Class<? extends Object> term638148 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term638147 = ((Class) term638148).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term638147).setAccessible(true);
        Object enum1148 = ((Field) term638147).get((Object) null);
        ArrayList term637845 = new ArrayList();
        term637839 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term637840 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term637841 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term637839, term637839.getClass(), "call", null);
        setField(term637840, term637840.getClass(), "ownerFunction", null);
        setField(term637840, term637840.getClass(), "className", null);
        setField(term637840, term637840.getClass(), "properties", null);
        setField(term637841, term637841.getClass(), "leastSupertypeVisitor", null);
        setField(term637841, term637841.getClass(), "greatestSubtypeVisitor", null);
        setField(term637841, term637841.getClass(), "call", null);
        setField(term637841, term637841.getClass(), "prototype", null);
        setField(term637841, term637841.getClass(), "kind", null);
        setField(term637841, term637841.getClass(), "typeOfThis", null);
        setField(term637841, term637841.getClass(), "source", null);
        setField(term637841, term637841.getClass(), "implementedInterfaces", null);
        setField(term637841, term637841.getClass(), "subTypes", null);
        setField(term637841, term637841.getClass(), "templateTypeName", null);
        setField(term637841, term637841.getClass(), "className", null);
        setField(term637841, term637841.getClass(), "properties", null);
        setField(term637841, term637841.getClass(), "implicitPrototype", null);
        setBooleanField(term637841, term637841.getClass(), "nativeType", false);
        setBooleanField(term637841, term637841.getClass(), "prettyPrint", false);
        setBooleanField(term637841, term637841.getClass(), "visited", false);
        setField(term637841, term637841.getClass(), "docInfo", null);
        setBooleanField(term637841, term637841.getClass(), "unknown", false);
        setBooleanField(term637841, term637841.getClass(), "resolved", false);
        setField(term637841, term637841.getClass(), "resolveResult", null);
        setField(term637841, term637841.getClass(), "registry", null);
        setField(term637840, term637840.getClass(), "implicitPrototype", term637841);
        setBooleanField(term637840, term637840.getClass(), "nativeType", false);
        setBooleanField(term637840, term637840.getClass(), "prettyPrint", false);
        setBooleanField(term637840, term637840.getClass(), "visited", false);
        setField(term637840, term637840.getClass(), "docInfo", null);
        setBooleanField(term637840, term637840.getClass(), "unknown", false);
        setBooleanField(term637840, term637840.getClass(), "resolved", false);
        setField(term637840, term637840.getClass(), "resolveResult", null);
        setField(term637840, term637840.getClass(), "registry", null);
        setField(term637839, term637839.getClass(), "prototype", term637840);
        setField(term637839, term637839.getClass(), "kind", enum1148);
        setField(term637839, term637839.getClass(), "typeOfThis", null);
        setField(term637839, term637839.getClass(), "source", null);
        setField(term637839, term637839.getClass(), "implementedInterfaces", term637845);
        setField(term637839, term637839.getClass(), "subTypes", null);
        setField(term637839, term637839.getClass(), "templateTypeName", null);
        setField(term637839, term637839.getClass(), "className", null);
        setField(term637839, term637839.getClass(), "properties", null);
        setField(term637839, term637839.getClass(), "implicitPrototype", null);
        setBooleanField(term637839, term637839.getClass(), "nativeType", false);
        setBooleanField(term637839, term637839.getClass(), "prettyPrint", false);
        setBooleanField(term637839, term637839.getClass(), "visited", false);
        setField(term637839, term637839.getClass(), "docInfo", null);
        setBooleanField(term637839, term637839.getClass(), "unknown", false);
        setBooleanField(term637839, term637839.getClass(), "resolved", false);
        setField(term637839, term637839.getClass(), "resolveResult", null);
        setField(term637839, term637839.getClass(), "registry", null);
        HashMap term637834 = new HashMap();
        Set<Object> term638447 =  ((Map) term637834).keySet();
        term637833 = new HashSet((Collection<? extends Object>) term638447);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAllImplementedInterfaces", argTypes, term637031, args);
        assertTrue(recursiveEquals(term637031, term637839));
        assertTrue(recursiveEquals(retValue, term637833));
    }

};


