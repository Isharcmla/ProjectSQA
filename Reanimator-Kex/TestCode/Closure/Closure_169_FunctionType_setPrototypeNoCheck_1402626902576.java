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

public class FunctionType_setPrototypeNoCheck_1402626902576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term555631;
     Object term556105;
     Object term556596;
     Object term556604;

    public FunctionType_setPrototypeNoCheck_1402626902576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term556614 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term556613 = ((Class) term556614).getDeclaredField((String) "ORDINARY");
        ((Field) term556613).setAccessible(true);
        Object enum909 = ((Field) term556613).get((Object) null);
        term555631 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term555745 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term555853 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term555853, term555853.getClass(), "ownerFunction", null);
        setField(term555745, term555745.getClass(), "type", term555853);
        setField(term555631, term555631.getClass(), "prototypeSlot", term555745);
        setField(term555631, term555631.getClass(), "source", null);
        setField(term555631, term555631.getClass(), "kind", enum909);
        setBooleanField(term555631, term555631.getClass(), "unknown", false);
        setField(term555631, term555631.getClass(), "subTypes", null);
        setBooleanField(term555631, term555631.getClass(), "nativeType", false);
        term556105 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term556105, term556105.getClass(), "ownerFunction", null);
        setBooleanField(term556105, term556105.getClass(), "unknown", false);
        setField(term556105, term556105.getClass(), "subTypes", null);
        setBooleanField(term556105, term556105.getClass(), "nativeType", true);
        Class<? extends Object> term556914 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term556913 = ((Class) term556914).getDeclaredField((String) "ORDINARY");
        ((Field) term556913).setAccessible(true);
        Object enum910 = ((Field) term556913).get((Object) null);
        term556596 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term556597 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term556600 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term556596, term556596.getClass(), "call", null);
        setField(term556597, term556597.getClass(), "name", "prototype");
        setField(term556600, term556600.getClass(), "call", null);
        setField(term556600, term556600.getClass(), "prototypeSlot", null);
        setField(term556600, term556600.getClass(), "kind", null);
        setField(term556600, term556600.getClass(), "propAccess", null);
        setField(term556600, term556600.getClass(), "typeOfThis", null);
        setField(term556600, term556600.getClass(), "source", null);
        setField(term556600, term556600.getClass(), "implementedInterfaces", null);
        setField(term556600, term556600.getClass(), "extendedInterfaces", null);
        setField(term556600, term556600.getClass(), "subTypes", null);
        setField(term556600, term556600.getClass(), "templateTypeNames", null);
        setField(term556600, term556600.getClass(), "className", null);
        setField(term556600, term556600.getClass(), "properties", null);
        setBooleanField(term556600, term556600.getClass(), "nativeType", true);
        setField(term556600, term556600.getClass(), "implicitPrototypeFallback", null);
        setField(term556600, term556600.getClass(), "ownerFunction", term556596);
        setBooleanField(term556600, term556600.getClass(), "prettyPrint", false);
        setBooleanField(term556600, term556600.getClass(), "visited", false);
        setField(term556600, term556600.getClass(), "docInfo", null);
        setBooleanField(term556600, term556600.getClass(), "unknown", true);
        setBooleanField(term556600, term556600.getClass(), "resolved", false);
        setField(term556600, term556600.getClass(), "resolveResult", null);
        setBooleanField(term556600, term556600.getClass(), "inTemplatedCheckVisit", false);
        setField(term556600, term556600.getClass(), "registry", null);
        setField(term556597, term556597.getClass(), "type", term556600);
        setBooleanField(term556597, term556597.getClass(), "inferred", true);
        setField(term556597, term556597.getClass(), "propertyNode", null);
        setField(term556597, term556597.getClass(), "docInfo", null);
        setField(term556596, term556596.getClass(), "prototypeSlot", term556597);
        setField(term556596, term556596.getClass(), "kind", enum910);
        setField(term556596, term556596.getClass(), "propAccess", null);
        setField(term556596, term556596.getClass(), "typeOfThis", null);
        setField(term556596, term556596.getClass(), "source", null);
        setField(term556596, term556596.getClass(), "implementedInterfaces", null);
        setField(term556596, term556596.getClass(), "extendedInterfaces", null);
        setField(term556596, term556596.getClass(), "subTypes", null);
        setField(term556596, term556596.getClass(), "templateTypeNames", null);
        setField(term556596, term556596.getClass(), "className", null);
        setField(term556596, term556596.getClass(), "properties", null);
        setBooleanField(term556596, term556596.getClass(), "nativeType", false);
        setField(term556596, term556596.getClass(), "implicitPrototypeFallback", null);
        setField(term556596, term556596.getClass(), "ownerFunction", null);
        setBooleanField(term556596, term556596.getClass(), "prettyPrint", false);
        setBooleanField(term556596, term556596.getClass(), "visited", false);
        setField(term556596, term556596.getClass(), "docInfo", null);
        setBooleanField(term556596, term556596.getClass(), "unknown", true);
        setBooleanField(term556596, term556596.getClass(), "resolved", false);
        setField(term556596, term556596.getClass(), "resolveResult", null);
        setBooleanField(term556596, term556596.getClass(), "inTemplatedCheckVisit", false);
        setField(term556596, term556596.getClass(), "registry", null);
        Class<? extends Object> term557214 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term557213 = ((Class) term557214).getDeclaredField((String) "ORDINARY");
        ((Field) term557213).setAccessible(true);
        Object enum911 = ((Field) term557213).get((Object) null);
        term556604 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term556605 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term556606 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term556604, term556604.getClass(), "call", null);
        setField(term556604, term556604.getClass(), "prototypeSlot", null);
        setField(term556604, term556604.getClass(), "kind", null);
        setField(term556604, term556604.getClass(), "propAccess", null);
        setField(term556604, term556604.getClass(), "typeOfThis", null);
        setField(term556604, term556604.getClass(), "source", null);
        setField(term556604, term556604.getClass(), "implementedInterfaces", null);
        setField(term556604, term556604.getClass(), "extendedInterfaces", null);
        setField(term556604, term556604.getClass(), "subTypes", null);
        setField(term556604, term556604.getClass(), "templateTypeNames", null);
        setField(term556604, term556604.getClass(), "className", null);
        setField(term556604, term556604.getClass(), "properties", null);
        setBooleanField(term556604, term556604.getClass(), "nativeType", true);
        setField(term556604, term556604.getClass(), "implicitPrototypeFallback", null);
        setField(term556605, term556605.getClass(), "call", null);
        setField(term556606, term556606.getClass(), "name", "prototype");
        setField(term556606, term556606.getClass(), "type", term556604);
        setBooleanField(term556606, term556606.getClass(), "inferred", true);
        setField(term556606, term556606.getClass(), "propertyNode", null);
        setField(term556606, term556606.getClass(), "docInfo", null);
        setField(term556605, term556605.getClass(), "prototypeSlot", term556606);
        setField(term556605, term556605.getClass(), "kind", enum911);
        setField(term556605, term556605.getClass(), "propAccess", null);
        setField(term556605, term556605.getClass(), "typeOfThis", null);
        setField(term556605, term556605.getClass(), "source", null);
        setField(term556605, term556605.getClass(), "implementedInterfaces", null);
        setField(term556605, term556605.getClass(), "extendedInterfaces", null);
        setField(term556605, term556605.getClass(), "subTypes", null);
        setField(term556605, term556605.getClass(), "templateTypeNames", null);
        setField(term556605, term556605.getClass(), "className", null);
        setField(term556605, term556605.getClass(), "properties", null);
        setBooleanField(term556605, term556605.getClass(), "nativeType", false);
        setField(term556605, term556605.getClass(), "implicitPrototypeFallback", null);
        setField(term556605, term556605.getClass(), "ownerFunction", null);
        setBooleanField(term556605, term556605.getClass(), "prettyPrint", false);
        setBooleanField(term556605, term556605.getClass(), "visited", false);
        setField(term556605, term556605.getClass(), "docInfo", null);
        setBooleanField(term556605, term556605.getClass(), "unknown", true);
        setBooleanField(term556605, term556605.getClass(), "resolved", false);
        setField(term556605, term556605.getClass(), "resolveResult", null);
        setBooleanField(term556605, term556605.getClass(), "inTemplatedCheckVisit", false);
        setField(term556605, term556605.getClass(), "registry", null);
        setField(term556604, term556604.getClass(), "ownerFunction", term556605);
        setBooleanField(term556604, term556604.getClass(), "prettyPrint", false);
        setBooleanField(term556604, term556604.getClass(), "visited", false);
        setField(term556604, term556604.getClass(), "docInfo", null);
        setBooleanField(term556604, term556604.getClass(), "unknown", true);
        setBooleanField(term556604, term556604.getClass(), "resolved", false);
        setField(term556604, term556604.getClass(), "resolveResult", null);
        setBooleanField(term556604, term556604.getClass(), "inTemplatedCheckVisit", false);
        setField(term556604, term556604.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term556105;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototypeNoCheck", argTypes, term555631, args);
        assertTrue(recursiveEquals(term555631, term556596));
        assertTrue(recursiveEquals(term556105, term556604));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


