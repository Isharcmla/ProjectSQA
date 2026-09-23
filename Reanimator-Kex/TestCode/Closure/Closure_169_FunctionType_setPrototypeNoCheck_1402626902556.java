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

public class FunctionType_setPrototypeNoCheck_1402626902556 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term532403;
     Object term532973;
     Object term533550;
     Object term533560;

    public FunctionType_setPrototypeNoCheck_1402626902556() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term533572 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term533571 = ((Class) term533572).getDeclaredField((String) "ORDINARY");
        ((Field) term533571).setAccessible(true);
        Object enum873 = ((Field) term533571).get((Object) null);
        term532403 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term532517 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term532621 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term532721 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term532621, term532621.getClass(), "ownerFunction", term532721);
        setField(term532517, term532517.getClass(), "type", term532621);
        setField(term532403, term532403.getClass(), "prototypeSlot", term532517);
        setField(term532403, term532403.getClass(), "source", null);
        setField(term532403, term532403.getClass(), "kind", enum873);
        setBooleanField(term532403, term532403.getClass(), "unknown", false);
        setField(term532403, term532403.getClass(), "subTypes", null);
        setBooleanField(term532403, term532403.getClass(), "nativeType", false);
        ArrayList term533025 = new ArrayList();
        term532973 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term532973, term532973.getClass(), "ownerFunction", null);
        setBooleanField(term532973, term532973.getClass(), "unknown", false);
        setField(term532973, term532973.getClass(), "subTypes", term533025);
        ArrayList term533555 = new ArrayList();
        Class<? extends Object> term533872 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term533871 = ((Class) term533872).getDeclaredField((String) "ORDINARY");
        ((Field) term533871).setAccessible(true);
        Object enum874 = ((Field) term533871).get((Object) null);
        term533550 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term533551 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term533554 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term533550, term533550.getClass(), "call", null);
        setField(term533551, term533551.getClass(), "name", "prototype");
        setField(term533554, term533554.getClass(), "call", null);
        setField(term533554, term533554.getClass(), "prototypeSlot", null);
        setField(term533554, term533554.getClass(), "kind", null);
        setField(term533554, term533554.getClass(), "propAccess", null);
        setField(term533554, term533554.getClass(), "typeOfThis", null);
        setField(term533554, term533554.getClass(), "source", null);
        setField(term533554, term533554.getClass(), "implementedInterfaces", null);
        setField(term533554, term533554.getClass(), "extendedInterfaces", null);
        setField(term533554, term533554.getClass(), "subTypes", term533555);
        setField(term533554, term533554.getClass(), "templateTypeNames", null);
        setField(term533554, term533554.getClass(), "className", null);
        setField(term533554, term533554.getClass(), "properties", null);
        setBooleanField(term533554, term533554.getClass(), "nativeType", false);
        setField(term533554, term533554.getClass(), "implicitPrototypeFallback", null);
        setField(term533554, term533554.getClass(), "ownerFunction", term533550);
        setBooleanField(term533554, term533554.getClass(), "prettyPrint", false);
        setBooleanField(term533554, term533554.getClass(), "visited", false);
        setField(term533554, term533554.getClass(), "docInfo", null);
        setBooleanField(term533554, term533554.getClass(), "unknown", true);
        setBooleanField(term533554, term533554.getClass(), "resolved", false);
        setField(term533554, term533554.getClass(), "resolveResult", null);
        setBooleanField(term533554, term533554.getClass(), "inTemplatedCheckVisit", false);
        setField(term533554, term533554.getClass(), "registry", null);
        setField(term533551, term533551.getClass(), "type", term533554);
        setBooleanField(term533551, term533551.getClass(), "inferred", true);
        setField(term533551, term533551.getClass(), "propertyNode", null);
        setField(term533551, term533551.getClass(), "docInfo", null);
        setField(term533550, term533550.getClass(), "prototypeSlot", term533551);
        setField(term533550, term533550.getClass(), "kind", enum874);
        setField(term533550, term533550.getClass(), "propAccess", null);
        setField(term533550, term533550.getClass(), "typeOfThis", null);
        setField(term533550, term533550.getClass(), "source", null);
        setField(term533550, term533550.getClass(), "implementedInterfaces", null);
        setField(term533550, term533550.getClass(), "extendedInterfaces", null);
        setField(term533550, term533550.getClass(), "subTypes", null);
        setField(term533550, term533550.getClass(), "templateTypeNames", null);
        setField(term533550, term533550.getClass(), "className", null);
        setField(term533550, term533550.getClass(), "properties", null);
        setBooleanField(term533550, term533550.getClass(), "nativeType", false);
        setField(term533550, term533550.getClass(), "implicitPrototypeFallback", null);
        setField(term533550, term533550.getClass(), "ownerFunction", null);
        setBooleanField(term533550, term533550.getClass(), "prettyPrint", false);
        setBooleanField(term533550, term533550.getClass(), "visited", false);
        setField(term533550, term533550.getClass(), "docInfo", null);
        setBooleanField(term533550, term533550.getClass(), "unknown", true);
        setBooleanField(term533550, term533550.getClass(), "resolved", false);
        setField(term533550, term533550.getClass(), "resolveResult", null);
        setBooleanField(term533550, term533550.getClass(), "inTemplatedCheckVisit", false);
        setField(term533550, term533550.getClass(), "registry", null);
        ArrayList term533561 = new ArrayList();
        Class<? extends Object> term534172 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term534171 = ((Class) term534172).getDeclaredField((String) "ORDINARY");
        ((Field) term534171).setAccessible(true);
        Object enum875 = ((Field) term534171).get((Object) null);
        term533560 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term533563 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term533564 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term533560, term533560.getClass(), "call", null);
        setField(term533560, term533560.getClass(), "prototypeSlot", null);
        setField(term533560, term533560.getClass(), "kind", null);
        setField(term533560, term533560.getClass(), "propAccess", null);
        setField(term533560, term533560.getClass(), "typeOfThis", null);
        setField(term533560, term533560.getClass(), "source", null);
        setField(term533560, term533560.getClass(), "implementedInterfaces", null);
        setField(term533560, term533560.getClass(), "extendedInterfaces", null);
        setField(term533560, term533560.getClass(), "subTypes", term533561);
        setField(term533560, term533560.getClass(), "templateTypeNames", null);
        setField(term533560, term533560.getClass(), "className", null);
        setField(term533560, term533560.getClass(), "properties", null);
        setBooleanField(term533560, term533560.getClass(), "nativeType", false);
        setField(term533560, term533560.getClass(), "implicitPrototypeFallback", null);
        setField(term533563, term533563.getClass(), "call", null);
        setField(term533564, term533564.getClass(), "name", "prototype");
        setField(term533564, term533564.getClass(), "type", term533560);
        setBooleanField(term533564, term533564.getClass(), "inferred", true);
        setField(term533564, term533564.getClass(), "propertyNode", null);
        setField(term533564, term533564.getClass(), "docInfo", null);
        setField(term533563, term533563.getClass(), "prototypeSlot", term533564);
        setField(term533563, term533563.getClass(), "kind", enum875);
        setField(term533563, term533563.getClass(), "propAccess", null);
        setField(term533563, term533563.getClass(), "typeOfThis", null);
        setField(term533563, term533563.getClass(), "source", null);
        setField(term533563, term533563.getClass(), "implementedInterfaces", null);
        setField(term533563, term533563.getClass(), "extendedInterfaces", null);
        setField(term533563, term533563.getClass(), "subTypes", null);
        setField(term533563, term533563.getClass(), "templateTypeNames", null);
        setField(term533563, term533563.getClass(), "className", null);
        setField(term533563, term533563.getClass(), "properties", null);
        setBooleanField(term533563, term533563.getClass(), "nativeType", false);
        setField(term533563, term533563.getClass(), "implicitPrototypeFallback", null);
        setField(term533563, term533563.getClass(), "ownerFunction", null);
        setBooleanField(term533563, term533563.getClass(), "prettyPrint", false);
        setBooleanField(term533563, term533563.getClass(), "visited", false);
        setField(term533563, term533563.getClass(), "docInfo", null);
        setBooleanField(term533563, term533563.getClass(), "unknown", true);
        setBooleanField(term533563, term533563.getClass(), "resolved", false);
        setField(term533563, term533563.getClass(), "resolveResult", null);
        setBooleanField(term533563, term533563.getClass(), "inTemplatedCheckVisit", false);
        setField(term533563, term533563.getClass(), "registry", null);
        setField(term533560, term533560.getClass(), "ownerFunction", term533563);
        setBooleanField(term533560, term533560.getClass(), "prettyPrint", false);
        setBooleanField(term533560, term533560.getClass(), "visited", false);
        setField(term533560, term533560.getClass(), "docInfo", null);
        setBooleanField(term533560, term533560.getClass(), "unknown", true);
        setBooleanField(term533560, term533560.getClass(), "resolved", false);
        setField(term533560, term533560.getClass(), "resolveResult", null);
        setBooleanField(term533560, term533560.getClass(), "inTemplatedCheckVisit", false);
        setField(term533560, term533560.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term532973;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototypeNoCheck", argTypes, term532403, args);
        assertTrue(recursiveEquals(term532403, term533550));
        assertTrue(recursiveEquals(term532973, term533560));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


