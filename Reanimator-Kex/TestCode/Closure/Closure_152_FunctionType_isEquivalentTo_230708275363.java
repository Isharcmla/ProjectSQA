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

public class FunctionType_isEquivalentTo_230708275363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255163;
     Object term255825;
     Object term257075;
     Object term257080;

    public FunctionType_isEquivalentTo_230708275363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term257090 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term257089 = ((Class) term257090).getDeclaredField((String) "ORDINARY");
        ((Field) term257089).setAccessible(true);
        Object enum447 = ((Field) term257089).get((Object) null);
        term255163 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term255715 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term255163, term255163.getClass(), "kind", enum447);
        setField(term255715, term255715.getClass(), "kind", enum447);
        setField(term255163, term255163.getClass(), "typeOfThis", term255715);
        Class<? extends Object> term257381 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term257380 = ((Class) term257381).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term257380).setAccessible(true);
        Object enum448 = ((Field) term257380).get((Object) null);
        Class<? extends Object> term257681 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term257680 = ((Class) term257681).getDeclaredField((String) "INTERFACE");
        ((Field) term257680).setAccessible(true);
        Object enum449 = ((Field) term257680).get((Object) null);
        term255825 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term256007 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term255825, term255825.getClass(), "kind", enum448);
        setField(term256007, term256007.getClass(), "kind", enum449);
        setField(term255825, term255825.getClass(), "typeOfThis", term256007);
        Class<? extends Object> term257975 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term257974 = ((Class) term257975).getDeclaredField((String) "INTERFACE");
        ((Field) term257974).setAccessible(true);
        Object enum450 = ((Field) term257974).get((Object) null);
        term257075 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term257079 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term257075, term257075.getClass(), "call", null);
        setField(term257075, term257075.getClass(), "prototype", null);
        setField(term257075, term257075.getClass(), "kind", enum450);
        setField(term257079, term257079.getClass(), "this$0", null);
        setField(term257079, term257079.getClass(), "call", null);
        setField(term257079, term257079.getClass(), "prototype", null);
        setField(term257079, term257079.getClass(), "kind", enum450);
        setField(term257079, term257079.getClass(), "typeOfThis", null);
        setField(term257079, term257079.getClass(), "source", null);
        setField(term257079, term257079.getClass(), "implementedInterfaces", null);
        setField(term257079, term257079.getClass(), "subTypes", null);
        setField(term257079, term257079.getClass(), "templateTypeName", null);
        setField(term257079, term257079.getClass(), "className", null);
        setField(term257079, term257079.getClass(), "properties", null);
        setBooleanField(term257079, term257079.getClass(), "nativeType", false);
        setField(term257079, term257079.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term257079, term257079.getClass(), "prettyPrint", false);
        setBooleanField(term257079, term257079.getClass(), "visited", false);
        setField(term257079, term257079.getClass(), "docInfo", null);
        setBooleanField(term257079, term257079.getClass(), "unknown", false);
        setBooleanField(term257079, term257079.getClass(), "resolved", false);
        setField(term257079, term257079.getClass(), "resolveResult", null);
        setField(term257079, term257079.getClass(), "registry", null);
        setField(term257075, term257075.getClass(), "typeOfThis", term257079);
        setField(term257075, term257075.getClass(), "source", null);
        setField(term257075, term257075.getClass(), "implementedInterfaces", null);
        setField(term257075, term257075.getClass(), "subTypes", null);
        setField(term257075, term257075.getClass(), "templateTypeName", null);
        setField(term257075, term257075.getClass(), "className", null);
        setField(term257075, term257075.getClass(), "properties", null);
        setBooleanField(term257075, term257075.getClass(), "nativeType", false);
        setField(term257075, term257075.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term257075, term257075.getClass(), "prettyPrint", false);
        setBooleanField(term257075, term257075.getClass(), "visited", false);
        setField(term257075, term257075.getClass(), "docInfo", null);
        setBooleanField(term257075, term257075.getClass(), "unknown", false);
        setBooleanField(term257075, term257075.getClass(), "resolved", false);
        setField(term257075, term257075.getClass(), "resolveResult", null);
        setField(term257075, term257075.getClass(), "registry", null);
        Class<? extends Object> term258269 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term258268 = ((Class) term258269).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term258268).setAccessible(true);
        Object enum451 = ((Field) term258268).get((Object) null);
        Class<? extends Object> term258569 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term258568 = ((Class) term258569).getDeclaredField((String) "INTERFACE");
        ((Field) term258568).setAccessible(true);
        Object enum452 = ((Field) term258568).get((Object) null);
        term257080 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term257084 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term257080, term257080.getClass(), "call", null);
        setField(term257080, term257080.getClass(), "prototype", null);
        setField(term257080, term257080.getClass(), "kind", enum451);
        setField(term257084, term257084.getClass(), "this$0", null);
        setField(term257084, term257084.getClass(), "call", null);
        setField(term257084, term257084.getClass(), "prototype", null);
        setField(term257084, term257084.getClass(), "kind", enum452);
        setField(term257084, term257084.getClass(), "typeOfThis", null);
        setField(term257084, term257084.getClass(), "source", null);
        setField(term257084, term257084.getClass(), "implementedInterfaces", null);
        setField(term257084, term257084.getClass(), "subTypes", null);
        setField(term257084, term257084.getClass(), "templateTypeName", null);
        setField(term257084, term257084.getClass(), "className", null);
        setField(term257084, term257084.getClass(), "properties", null);
        setBooleanField(term257084, term257084.getClass(), "nativeType", false);
        setField(term257084, term257084.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term257084, term257084.getClass(), "prettyPrint", false);
        setBooleanField(term257084, term257084.getClass(), "visited", false);
        setField(term257084, term257084.getClass(), "docInfo", null);
        setBooleanField(term257084, term257084.getClass(), "unknown", false);
        setBooleanField(term257084, term257084.getClass(), "resolved", false);
        setField(term257084, term257084.getClass(), "resolveResult", null);
        setField(term257084, term257084.getClass(), "registry", null);
        setField(term257080, term257080.getClass(), "typeOfThis", term257084);
        setField(term257080, term257080.getClass(), "source", null);
        setField(term257080, term257080.getClass(), "implementedInterfaces", null);
        setField(term257080, term257080.getClass(), "subTypes", null);
        setField(term257080, term257080.getClass(), "templateTypeName", null);
        setField(term257080, term257080.getClass(), "className", null);
        setField(term257080, term257080.getClass(), "properties", null);
        setBooleanField(term257080, term257080.getClass(), "nativeType", false);
        setField(term257080, term257080.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term257080, term257080.getClass(), "prettyPrint", false);
        setBooleanField(term257080, term257080.getClass(), "visited", false);
        setField(term257080, term257080.getClass(), "docInfo", null);
        setBooleanField(term257080, term257080.getClass(), "unknown", false);
        setBooleanField(term257080, term257080.getClass(), "resolved", false);
        setField(term257080, term257080.getClass(), "resolveResult", null);
        setField(term257080, term257080.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term255825;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term255163, args);
        assertTrue(recursiveEquals(term255163, term257075));
        assertTrue(recursiveEquals(term255825, term257080));
        assertTrue(recursiveEquals(retValue, false));
    }

};


