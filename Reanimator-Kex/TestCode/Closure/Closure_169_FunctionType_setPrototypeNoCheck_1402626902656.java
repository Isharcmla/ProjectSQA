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

public class FunctionType_setPrototypeNoCheck_1402626902656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term638228;
     Object term638698;
     Object term641575;
     Object term641583;

    public FunctionType_setPrototypeNoCheck_1402626902656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term641593 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term641592 = ((Class) term641593).getDeclaredField((String) "ORDINARY");
        ((Field) term641592).setAccessible(true);
        Object enum1050 = ((Field) term641592).get((Object) null);
        term638228 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term638342 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term638446 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term638446, term638446.getClass(), "ownerFunction", null);
        setField(term638342, term638342.getClass(), "type", term638446);
        setField(term638228, term638228.getClass(), "prototypeSlot", term638342);
        setField(term638228, term638228.getClass(), "source", null);
        setField(term638228, term638228.getClass(), "kind", enum1050);
        setBooleanField(term638228, term638228.getClass(), "unknown", false);
        setField(term638228, term638228.getClass(), "subTypes", null);
        setBooleanField(term638228, term638228.getClass(), "nativeType", false);
        term638698 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term638698, term638698.getClass(), "ownerFunction", null);
        setBooleanField(term638698, term638698.getClass(), "unknown", false);
        setField(term638698, term638698.getClass(), "subTypes", null);
        setBooleanField(term638698, term638698.getClass(), "nativeType", true);
        Class<? extends Object> term641893 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term641892 = ((Class) term641893).getDeclaredField((String) "ORDINARY");
        ((Field) term641892).setAccessible(true);
        Object enum1051 = ((Field) term641892).get((Object) null);
        term641575 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term641576 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term641579 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term641575, term641575.getClass(), "call", null);
        setField(term641576, term641576.getClass(), "name", "prototype");
        setField(term641579, term641579.getClass(), "call", null);
        setField(term641579, term641579.getClass(), "prototypeSlot", null);
        setField(term641579, term641579.getClass(), "kind", null);
        setField(term641579, term641579.getClass(), "propAccess", null);
        setField(term641579, term641579.getClass(), "typeOfThis", null);
        setField(term641579, term641579.getClass(), "source", null);
        setField(term641579, term641579.getClass(), "implementedInterfaces", null);
        setField(term641579, term641579.getClass(), "extendedInterfaces", null);
        setField(term641579, term641579.getClass(), "subTypes", null);
        setField(term641579, term641579.getClass(), "templateTypeNames", null);
        setField(term641579, term641579.getClass(), "className", null);
        setField(term641579, term641579.getClass(), "properties", null);
        setBooleanField(term641579, term641579.getClass(), "nativeType", true);
        setField(term641579, term641579.getClass(), "implicitPrototypeFallback", null);
        setField(term641579, term641579.getClass(), "ownerFunction", term641575);
        setBooleanField(term641579, term641579.getClass(), "prettyPrint", false);
        setBooleanField(term641579, term641579.getClass(), "visited", false);
        setField(term641579, term641579.getClass(), "docInfo", null);
        setBooleanField(term641579, term641579.getClass(), "unknown", true);
        setBooleanField(term641579, term641579.getClass(), "resolved", false);
        setField(term641579, term641579.getClass(), "resolveResult", null);
        setBooleanField(term641579, term641579.getClass(), "inTemplatedCheckVisit", false);
        setField(term641579, term641579.getClass(), "registry", null);
        setField(term641576, term641576.getClass(), "type", term641579);
        setBooleanField(term641576, term641576.getClass(), "inferred", true);
        setField(term641576, term641576.getClass(), "propertyNode", null);
        setField(term641576, term641576.getClass(), "docInfo", null);
        setField(term641575, term641575.getClass(), "prototypeSlot", term641576);
        setField(term641575, term641575.getClass(), "kind", enum1051);
        setField(term641575, term641575.getClass(), "propAccess", null);
        setField(term641575, term641575.getClass(), "typeOfThis", null);
        setField(term641575, term641575.getClass(), "source", null);
        setField(term641575, term641575.getClass(), "implementedInterfaces", null);
        setField(term641575, term641575.getClass(), "extendedInterfaces", null);
        setField(term641575, term641575.getClass(), "subTypes", null);
        setField(term641575, term641575.getClass(), "templateTypeNames", null);
        setField(term641575, term641575.getClass(), "className", null);
        setField(term641575, term641575.getClass(), "properties", null);
        setBooleanField(term641575, term641575.getClass(), "nativeType", false);
        setField(term641575, term641575.getClass(), "implicitPrototypeFallback", null);
        setField(term641575, term641575.getClass(), "ownerFunction", null);
        setBooleanField(term641575, term641575.getClass(), "prettyPrint", false);
        setBooleanField(term641575, term641575.getClass(), "visited", false);
        setField(term641575, term641575.getClass(), "docInfo", null);
        setBooleanField(term641575, term641575.getClass(), "unknown", true);
        setBooleanField(term641575, term641575.getClass(), "resolved", false);
        setField(term641575, term641575.getClass(), "resolveResult", null);
        setBooleanField(term641575, term641575.getClass(), "inTemplatedCheckVisit", false);
        setField(term641575, term641575.getClass(), "registry", null);
        Class<? extends Object> term642193 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term642192 = ((Class) term642193).getDeclaredField((String) "ORDINARY");
        ((Field) term642192).setAccessible(true);
        Object enum1052 = ((Field) term642192).get((Object) null);
        term641583 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term641584 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term641585 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term641583, term641583.getClass(), "call", null);
        setField(term641583, term641583.getClass(), "prototypeSlot", null);
        setField(term641583, term641583.getClass(), "kind", null);
        setField(term641583, term641583.getClass(), "propAccess", null);
        setField(term641583, term641583.getClass(), "typeOfThis", null);
        setField(term641583, term641583.getClass(), "source", null);
        setField(term641583, term641583.getClass(), "implementedInterfaces", null);
        setField(term641583, term641583.getClass(), "extendedInterfaces", null);
        setField(term641583, term641583.getClass(), "subTypes", null);
        setField(term641583, term641583.getClass(), "templateTypeNames", null);
        setField(term641583, term641583.getClass(), "className", null);
        setField(term641583, term641583.getClass(), "properties", null);
        setBooleanField(term641583, term641583.getClass(), "nativeType", true);
        setField(term641583, term641583.getClass(), "implicitPrototypeFallback", null);
        setField(term641584, term641584.getClass(), "call", null);
        setField(term641585, term641585.getClass(), "name", "prototype");
        setField(term641585, term641585.getClass(), "type", term641583);
        setBooleanField(term641585, term641585.getClass(), "inferred", true);
        setField(term641585, term641585.getClass(), "propertyNode", null);
        setField(term641585, term641585.getClass(), "docInfo", null);
        setField(term641584, term641584.getClass(), "prototypeSlot", term641585);
        setField(term641584, term641584.getClass(), "kind", enum1052);
        setField(term641584, term641584.getClass(), "propAccess", null);
        setField(term641584, term641584.getClass(), "typeOfThis", null);
        setField(term641584, term641584.getClass(), "source", null);
        setField(term641584, term641584.getClass(), "implementedInterfaces", null);
        setField(term641584, term641584.getClass(), "extendedInterfaces", null);
        setField(term641584, term641584.getClass(), "subTypes", null);
        setField(term641584, term641584.getClass(), "templateTypeNames", null);
        setField(term641584, term641584.getClass(), "className", null);
        setField(term641584, term641584.getClass(), "properties", null);
        setBooleanField(term641584, term641584.getClass(), "nativeType", false);
        setField(term641584, term641584.getClass(), "implicitPrototypeFallback", null);
        setField(term641584, term641584.getClass(), "ownerFunction", null);
        setBooleanField(term641584, term641584.getClass(), "prettyPrint", false);
        setBooleanField(term641584, term641584.getClass(), "visited", false);
        setField(term641584, term641584.getClass(), "docInfo", null);
        setBooleanField(term641584, term641584.getClass(), "unknown", true);
        setBooleanField(term641584, term641584.getClass(), "resolved", false);
        setField(term641584, term641584.getClass(), "resolveResult", null);
        setBooleanField(term641584, term641584.getClass(), "inTemplatedCheckVisit", false);
        setField(term641584, term641584.getClass(), "registry", null);
        setField(term641583, term641583.getClass(), "ownerFunction", term641584);
        setBooleanField(term641583, term641583.getClass(), "prettyPrint", false);
        setBooleanField(term641583, term641583.getClass(), "visited", false);
        setField(term641583, term641583.getClass(), "docInfo", null);
        setBooleanField(term641583, term641583.getClass(), "unknown", true);
        setBooleanField(term641583, term641583.getClass(), "resolved", false);
        setField(term641583, term641583.getClass(), "resolveResult", null);
        setBooleanField(term641583, term641583.getClass(), "inTemplatedCheckVisit", false);
        setField(term641583, term641583.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term638698;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototypeNoCheck", argTypes, term638228, args);
        assertTrue(recursiveEquals(term638228, term641575));
        assertTrue(recursiveEquals(term638698, term641583));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


