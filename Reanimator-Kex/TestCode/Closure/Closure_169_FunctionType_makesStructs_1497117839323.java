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

public class FunctionType_makesStructs_1497117839323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term295511;
     Object term296472;

    public FunctionType_makesStructs_1497117839323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term296481 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term296480 = ((Class) term296481).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term296480).setAccessible(true);
        Object enum521 = ((Field) term296480).get((Object) null);
        Class<? extends Object> term296781 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term296780 = ((Class) term296781).getDeclaredField((String) "STRUCT");
        ((Field) term296780).setAccessible(true);
        Object enum522 = ((Field) term296780).get((Object) null);
        term295511 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term295511, term295511.getClass(), "kind", enum521);
        setField(term295511, term295511.getClass(), "propAccess", enum522);
        Class<? extends Object> term297096 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term297095 = ((Class) term297096).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term297095).setAccessible(true);
        Object enum523 = ((Field) term297095).get((Object) null);
        Class<? extends Object> term297396 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term297395 = ((Class) term297396).getDeclaredField((String) "STRUCT");
        ((Field) term297395).setAccessible(true);
        Object enum524 = ((Field) term297395).get((Object) null);
        term296472 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term296472, term296472.getClass(), "call", null);
        setField(term296472, term296472.getClass(), "prototypeSlot", null);
        setField(term296472, term296472.getClass(), "kind", enum523);
        setField(term296472, term296472.getClass(), "propAccess", enum524);
        setField(term296472, term296472.getClass(), "typeOfThis", null);
        setField(term296472, term296472.getClass(), "source", null);
        setField(term296472, term296472.getClass(), "implementedInterfaces", null);
        setField(term296472, term296472.getClass(), "extendedInterfaces", null);
        setField(term296472, term296472.getClass(), "subTypes", null);
        setField(term296472, term296472.getClass(), "templateTypeNames", null);
        setField(term296472, term296472.getClass(), "className", null);
        setField(term296472, term296472.getClass(), "properties", null);
        setBooleanField(term296472, term296472.getClass(), "nativeType", false);
        setField(term296472, term296472.getClass(), "implicitPrototypeFallback", null);
        setField(term296472, term296472.getClass(), "ownerFunction", null);
        setBooleanField(term296472, term296472.getClass(), "prettyPrint", false);
        setBooleanField(term296472, term296472.getClass(), "visited", false);
        setField(term296472, term296472.getClass(), "docInfo", null);
        setBooleanField(term296472, term296472.getClass(), "unknown", false);
        setBooleanField(term296472, term296472.getClass(), "resolved", false);
        setField(term296472, term296472.getClass(), "resolveResult", null);
        setBooleanField(term296472, term296472.getClass(), "inTemplatedCheckVisit", false);
        setField(term296472, term296472.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "makesStructs", argTypes, term295511, args);
        assertTrue(recursiveEquals(term295511, term296472));
        assertTrue(recursiveEquals(retValue, true));
    }

};


