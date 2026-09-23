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

public class FunctionType_hasUnknownSupertype_259494629361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256954;
     Object term257739;

    public FunctionType_hasUnknownSupertype_259494629361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term257747 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term257746 = ((Class) term257747).getDeclaredField((String) "INTERFACE");
        ((Field) term257746).setAccessible(true);
        Object enum446 = ((Field) term257746).get((Object) null);
        term256954 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term257220 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term257338 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term256954, term256954.getClass(), "kind", enum446);
        setBooleanField(term256954, term256954.getClass(), "unknown", false);
        setField(term257220, term257220.getClass(), "implicitPrototypeFallback", term257338);
        setField(term256954, term256954.getClass(), "prototype", term257220);
        Class<? extends Object> term258041 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term258040 = ((Class) term258041).getDeclaredField((String) "INTERFACE");
        ((Field) term258040).setAccessible(true);
        Object enum447 = ((Field) term258040).get((Object) null);
        term257739 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term257740 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        Object term257741 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term257739, term257739.getClass(), "call", null);
        setField(term257740, term257740.getClass(), "ownerFunction", null);
        setField(term257740, term257740.getClass(), "className", null);
        setField(term257740, term257740.getClass(), "properties", null);
        setBooleanField(term257740, term257740.getClass(), "nativeType", false);
        setField(term257741, term257741.getClass(), "ownerFunction", null);
        setField(term257741, term257741.getClass(), "className", null);
        setField(term257741, term257741.getClass(), "properties", null);
        setBooleanField(term257741, term257741.getClass(), "nativeType", false);
        setField(term257741, term257741.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term257741, term257741.getClass(), "prettyPrint", false);
        setBooleanField(term257741, term257741.getClass(), "visited", false);
        setField(term257741, term257741.getClass(), "docInfo", null);
        setBooleanField(term257741, term257741.getClass(), "unknown", false);
        setBooleanField(term257741, term257741.getClass(), "resolved", false);
        setField(term257741, term257741.getClass(), "resolveResult", null);
        setField(term257741, term257741.getClass(), "registry", null);
        setField(term257740, term257740.getClass(), "implicitPrototypeFallback", term257741);
        setBooleanField(term257740, term257740.getClass(), "prettyPrint", false);
        setBooleanField(term257740, term257740.getClass(), "visited", false);
        setField(term257740, term257740.getClass(), "docInfo", null);
        setBooleanField(term257740, term257740.getClass(), "unknown", false);
        setBooleanField(term257740, term257740.getClass(), "resolved", false);
        setField(term257740, term257740.getClass(), "resolveResult", null);
        setField(term257740, term257740.getClass(), "registry", null);
        setField(term257739, term257739.getClass(), "prototype", term257740);
        setField(term257739, term257739.getClass(), "kind", enum447);
        setField(term257739, term257739.getClass(), "typeOfThis", null);
        setField(term257739, term257739.getClass(), "source", null);
        setField(term257739, term257739.getClass(), "implementedInterfaces", null);
        setField(term257739, term257739.getClass(), "subTypes", null);
        setField(term257739, term257739.getClass(), "templateTypeName", null);
        setField(term257739, term257739.getClass(), "className", null);
        setField(term257739, term257739.getClass(), "properties", null);
        setBooleanField(term257739, term257739.getClass(), "nativeType", false);
        setField(term257739, term257739.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term257739, term257739.getClass(), "prettyPrint", false);
        setBooleanField(term257739, term257739.getClass(), "visited", false);
        setField(term257739, term257739.getClass(), "docInfo", null);
        setBooleanField(term257739, term257739.getClass(), "unknown", false);
        setBooleanField(term257739, term257739.getClass(), "resolved", false);
        setField(term257739, term257739.getClass(), "resolveResult", null);
        setField(term257739, term257739.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasUnknownSupertype", argTypes, term256954, args);
        assertTrue(recursiveEquals(term256954, term257739));
        assertTrue(recursiveEquals(retValue, false));
    }

};


