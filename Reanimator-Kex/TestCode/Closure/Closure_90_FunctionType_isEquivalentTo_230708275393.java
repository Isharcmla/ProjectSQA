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

public class FunctionType_isEquivalentTo_230708275393 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294537;
     Object term295199;
     Object term296068;
     Object term296076;

    public FunctionType_isEquivalentTo_230708275393() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term296083 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term296082 = ((Class) term296083).getDeclaredField((String) "INTERFACE");
        ((Field) term296082).setAccessible(true);
        Object enum513 = ((Field) term296082).get((Object) null);
        Class<? extends Object> term296377 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term296376 = ((Class) term296377).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term296376).setAccessible(true);
        Object enum514 = ((Field) term296376).get((Object) null);
        term294537 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term295089 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term294537, term294537.getClass(), "kind", enum513);
        setField(term295089, term295089.getClass(), "kind", enum514);
        setField(term294537, term294537.getClass(), "typeOfThis", term295089);
        term295199 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term295381 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term295199, term295199.getClass(), "kind", enum514);
        setField(term295199, term295199.getClass(), "typeOfThis", term295381);
        Class<? extends Object> term296677 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term296676 = ((Class) term296677).getDeclaredField((String) "INTERFACE");
        ((Field) term296676).setAccessible(true);
        Object enum515 = ((Field) term296676).get((Object) null);
        Class<? extends Object> term296971 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term296970 = ((Class) term296971).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term296970).setAccessible(true);
        Object enum516 = ((Field) term296970).get((Object) null);
        term296068 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term296072 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term296068, term296068.getClass(), "call", null);
        setField(term296068, term296068.getClass(), "prototype", null);
        setField(term296068, term296068.getClass(), "kind", enum515);
        setField(term296072, term296072.getClass(), "this$0", null);
        setField(term296072, term296072.getClass(), "call", null);
        setField(term296072, term296072.getClass(), "prototype", null);
        setField(term296072, term296072.getClass(), "kind", enum516);
        setField(term296072, term296072.getClass(), "typeOfThis", null);
        setField(term296072, term296072.getClass(), "source", null);
        setField(term296072, term296072.getClass(), "implementedInterfaces", null);
        setField(term296072, term296072.getClass(), "subTypes", null);
        setField(term296072, term296072.getClass(), "templateTypeName", null);
        setField(term296072, term296072.getClass(), "className", null);
        setField(term296072, term296072.getClass(), "properties", null);
        setBooleanField(term296072, term296072.getClass(), "nativeType", false);
        setField(term296072, term296072.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term296072, term296072.getClass(), "prettyPrint", false);
        setBooleanField(term296072, term296072.getClass(), "visited", false);
        setField(term296072, term296072.getClass(), "docInfo", null);
        setBooleanField(term296072, term296072.getClass(), "unknown", false);
        setBooleanField(term296072, term296072.getClass(), "resolved", false);
        setField(term296072, term296072.getClass(), "resolveResult", null);
        setField(term296072, term296072.getClass(), "registry", null);
        setField(term296068, term296068.getClass(), "typeOfThis", term296072);
        setField(term296068, term296068.getClass(), "source", null);
        setField(term296068, term296068.getClass(), "implementedInterfaces", null);
        setField(term296068, term296068.getClass(), "subTypes", null);
        setField(term296068, term296068.getClass(), "templateTypeName", null);
        setField(term296068, term296068.getClass(), "className", null);
        setField(term296068, term296068.getClass(), "properties", null);
        setBooleanField(term296068, term296068.getClass(), "nativeType", false);
        setField(term296068, term296068.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term296068, term296068.getClass(), "prettyPrint", false);
        setBooleanField(term296068, term296068.getClass(), "visited", false);
        setField(term296068, term296068.getClass(), "docInfo", null);
        setBooleanField(term296068, term296068.getClass(), "unknown", false);
        setBooleanField(term296068, term296068.getClass(), "resolved", false);
        setField(term296068, term296068.getClass(), "resolveResult", null);
        setField(term296068, term296068.getClass(), "registry", null);
        Class<? extends Object> term297271 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term297270 = ((Class) term297271).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term297270).setAccessible(true);
        Object enum517 = ((Field) term297270).get((Object) null);
        term296076 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term296080 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term296076, term296076.getClass(), "call", null);
        setField(term296076, term296076.getClass(), "prototype", null);
        setField(term296076, term296076.getClass(), "kind", enum517);
        setField(term296080, term296080.getClass(), "this$0", null);
        setField(term296080, term296080.getClass(), "call", null);
        setField(term296080, term296080.getClass(), "prototype", null);
        setField(term296080, term296080.getClass(), "kind", null);
        setField(term296080, term296080.getClass(), "typeOfThis", null);
        setField(term296080, term296080.getClass(), "source", null);
        setField(term296080, term296080.getClass(), "implementedInterfaces", null);
        setField(term296080, term296080.getClass(), "subTypes", null);
        setField(term296080, term296080.getClass(), "templateTypeName", null);
        setField(term296080, term296080.getClass(), "className", null);
        setField(term296080, term296080.getClass(), "properties", null);
        setBooleanField(term296080, term296080.getClass(), "nativeType", false);
        setField(term296080, term296080.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term296080, term296080.getClass(), "prettyPrint", false);
        setBooleanField(term296080, term296080.getClass(), "visited", false);
        setField(term296080, term296080.getClass(), "docInfo", null);
        setBooleanField(term296080, term296080.getClass(), "unknown", false);
        setBooleanField(term296080, term296080.getClass(), "resolved", false);
        setField(term296080, term296080.getClass(), "resolveResult", null);
        setField(term296080, term296080.getClass(), "registry", null);
        setField(term296076, term296076.getClass(), "typeOfThis", term296080);
        setField(term296076, term296076.getClass(), "source", null);
        setField(term296076, term296076.getClass(), "implementedInterfaces", null);
        setField(term296076, term296076.getClass(), "subTypes", null);
        setField(term296076, term296076.getClass(), "templateTypeName", null);
        setField(term296076, term296076.getClass(), "className", null);
        setField(term296076, term296076.getClass(), "properties", null);
        setBooleanField(term296076, term296076.getClass(), "nativeType", false);
        setField(term296076, term296076.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term296076, term296076.getClass(), "prettyPrint", false);
        setBooleanField(term296076, term296076.getClass(), "visited", false);
        setField(term296076, term296076.getClass(), "docInfo", null);
        setBooleanField(term296076, term296076.getClass(), "unknown", false);
        setBooleanField(term296076, term296076.getClass(), "resolved", false);
        setField(term296076, term296076.getClass(), "resolveResult", null);
        setField(term296076, term296076.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term295199;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term294537, args);
        assertTrue(recursiveEquals(term294537, term296068));
        assertTrue(recursiveEquals(term295199, term296076));
        assertTrue(recursiveEquals(retValue, false));
    }

};


