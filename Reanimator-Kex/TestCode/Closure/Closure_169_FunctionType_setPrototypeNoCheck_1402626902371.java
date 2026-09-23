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

public class FunctionType_setPrototypeNoCheck_1402626902371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term338614;
     Object term338980;
     Object term339505;
     Object term339513;

    public FunctionType_setPrototypeNoCheck_1402626902371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term339523 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term339522 = ((Class) term339523).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term339522).setAccessible(true);
        Object enum585 = ((Field) term339522).get((Object) null);
        term338614 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term338728 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term338728, term338728.getClass(), "type", null);
        setField(term338614, term338614.getClass(), "prototypeSlot", term338728);
        setField(term338614, term338614.getClass(), "source", null);
        setField(term338614, term338614.getClass(), "kind", enum585);
        term338980 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term338980, term338980.getClass(), "ownerFunction", null);
        Class<? extends Object> term339832 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term339831 = ((Class) term339832).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term339831).setAccessible(true);
        Object enum586 = ((Field) term339831).get((Object) null);
        term339505 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term339506 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term339509 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term339505, term339505.getClass(), "call", null);
        setField(term339506, term339506.getClass(), "name", "prototype");
        setField(term339509, term339509.getClass(), "call", null);
        setField(term339509, term339509.getClass(), "prototypeSlot", null);
        setField(term339509, term339509.getClass(), "kind", null);
        setField(term339509, term339509.getClass(), "propAccess", null);
        setField(term339509, term339509.getClass(), "typeOfThis", null);
        setField(term339509, term339509.getClass(), "source", null);
        setField(term339509, term339509.getClass(), "implementedInterfaces", null);
        setField(term339509, term339509.getClass(), "extendedInterfaces", null);
        setField(term339509, term339509.getClass(), "subTypes", null);
        setField(term339509, term339509.getClass(), "templateTypeNames", null);
        setField(term339509, term339509.getClass(), "className", null);
        setField(term339509, term339509.getClass(), "properties", null);
        setBooleanField(term339509, term339509.getClass(), "nativeType", false);
        setField(term339509, term339509.getClass(), "implicitPrototypeFallback", null);
        setField(term339509, term339509.getClass(), "ownerFunction", term339505);
        setBooleanField(term339509, term339509.getClass(), "prettyPrint", false);
        setBooleanField(term339509, term339509.getClass(), "visited", false);
        setField(term339509, term339509.getClass(), "docInfo", null);
        setBooleanField(term339509, term339509.getClass(), "unknown", false);
        setBooleanField(term339509, term339509.getClass(), "resolved", false);
        setField(term339509, term339509.getClass(), "resolveResult", null);
        setBooleanField(term339509, term339509.getClass(), "inTemplatedCheckVisit", false);
        setField(term339509, term339509.getClass(), "registry", null);
        setField(term339506, term339506.getClass(), "type", term339509);
        setBooleanField(term339506, term339506.getClass(), "inferred", true);
        setField(term339506, term339506.getClass(), "propertyNode", null);
        setField(term339506, term339506.getClass(), "docInfo", null);
        setField(term339505, term339505.getClass(), "prototypeSlot", term339506);
        setField(term339505, term339505.getClass(), "kind", enum586);
        setField(term339505, term339505.getClass(), "propAccess", null);
        setField(term339505, term339505.getClass(), "typeOfThis", null);
        setField(term339505, term339505.getClass(), "source", null);
        setField(term339505, term339505.getClass(), "implementedInterfaces", null);
        setField(term339505, term339505.getClass(), "extendedInterfaces", null);
        setField(term339505, term339505.getClass(), "subTypes", null);
        setField(term339505, term339505.getClass(), "templateTypeNames", null);
        setField(term339505, term339505.getClass(), "className", null);
        setField(term339505, term339505.getClass(), "properties", null);
        setBooleanField(term339505, term339505.getClass(), "nativeType", false);
        setField(term339505, term339505.getClass(), "implicitPrototypeFallback", null);
        setField(term339505, term339505.getClass(), "ownerFunction", null);
        setBooleanField(term339505, term339505.getClass(), "prettyPrint", false);
        setBooleanField(term339505, term339505.getClass(), "visited", false);
        setField(term339505, term339505.getClass(), "docInfo", null);
        setBooleanField(term339505, term339505.getClass(), "unknown", false);
        setBooleanField(term339505, term339505.getClass(), "resolved", false);
        setField(term339505, term339505.getClass(), "resolveResult", null);
        setBooleanField(term339505, term339505.getClass(), "inTemplatedCheckVisit", false);
        setField(term339505, term339505.getClass(), "registry", null);
        Class<? extends Object> term340141 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term340140 = ((Class) term340141).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term340140).setAccessible(true);
        Object enum587 = ((Field) term340140).get((Object) null);
        term339513 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term339514 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term339515 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term339513, term339513.getClass(), "call", null);
        setField(term339513, term339513.getClass(), "prototypeSlot", null);
        setField(term339513, term339513.getClass(), "kind", null);
        setField(term339513, term339513.getClass(), "propAccess", null);
        setField(term339513, term339513.getClass(), "typeOfThis", null);
        setField(term339513, term339513.getClass(), "source", null);
        setField(term339513, term339513.getClass(), "implementedInterfaces", null);
        setField(term339513, term339513.getClass(), "extendedInterfaces", null);
        setField(term339513, term339513.getClass(), "subTypes", null);
        setField(term339513, term339513.getClass(), "templateTypeNames", null);
        setField(term339513, term339513.getClass(), "className", null);
        setField(term339513, term339513.getClass(), "properties", null);
        setBooleanField(term339513, term339513.getClass(), "nativeType", false);
        setField(term339513, term339513.getClass(), "implicitPrototypeFallback", null);
        setField(term339514, term339514.getClass(), "call", null);
        setField(term339515, term339515.getClass(), "name", "prototype");
        setField(term339515, term339515.getClass(), "type", term339513);
        setBooleanField(term339515, term339515.getClass(), "inferred", true);
        setField(term339515, term339515.getClass(), "propertyNode", null);
        setField(term339515, term339515.getClass(), "docInfo", null);
        setField(term339514, term339514.getClass(), "prototypeSlot", term339515);
        setField(term339514, term339514.getClass(), "kind", enum587);
        setField(term339514, term339514.getClass(), "propAccess", null);
        setField(term339514, term339514.getClass(), "typeOfThis", null);
        setField(term339514, term339514.getClass(), "source", null);
        setField(term339514, term339514.getClass(), "implementedInterfaces", null);
        setField(term339514, term339514.getClass(), "extendedInterfaces", null);
        setField(term339514, term339514.getClass(), "subTypes", null);
        setField(term339514, term339514.getClass(), "templateTypeNames", null);
        setField(term339514, term339514.getClass(), "className", null);
        setField(term339514, term339514.getClass(), "properties", null);
        setBooleanField(term339514, term339514.getClass(), "nativeType", false);
        setField(term339514, term339514.getClass(), "implicitPrototypeFallback", null);
        setField(term339514, term339514.getClass(), "ownerFunction", null);
        setBooleanField(term339514, term339514.getClass(), "prettyPrint", false);
        setBooleanField(term339514, term339514.getClass(), "visited", false);
        setField(term339514, term339514.getClass(), "docInfo", null);
        setBooleanField(term339514, term339514.getClass(), "unknown", false);
        setBooleanField(term339514, term339514.getClass(), "resolved", false);
        setField(term339514, term339514.getClass(), "resolveResult", null);
        setBooleanField(term339514, term339514.getClass(), "inTemplatedCheckVisit", false);
        setField(term339514, term339514.getClass(), "registry", null);
        setField(term339513, term339513.getClass(), "ownerFunction", term339514);
        setBooleanField(term339513, term339513.getClass(), "prettyPrint", false);
        setBooleanField(term339513, term339513.getClass(), "visited", false);
        setField(term339513, term339513.getClass(), "docInfo", null);
        setBooleanField(term339513, term339513.getClass(), "unknown", false);
        setBooleanField(term339513, term339513.getClass(), "resolved", false);
        setField(term339513, term339513.getClass(), "resolveResult", null);
        setBooleanField(term339513, term339513.getClass(), "inTemplatedCheckVisit", false);
        setField(term339513, term339513.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term338980;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototypeNoCheck", argTypes, term338614, args);
        assertTrue(recursiveEquals(term338614, term339505));
        assertTrue(recursiveEquals(term338980, term339513));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


