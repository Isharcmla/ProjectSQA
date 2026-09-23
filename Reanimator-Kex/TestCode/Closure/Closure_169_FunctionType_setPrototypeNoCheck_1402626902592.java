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

public class FunctionType_setPrototypeNoCheck_1402626902592 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term565719;
     Object term566189;
     Object term566766;
     Object term566773;

    public FunctionType_setPrototypeNoCheck_1402626902592() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term566782 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term566781 = ((Class) term566782).getDeclaredField((String) "ORDINARY");
        ((Field) term566781).setAccessible(true);
        Object enum925 = ((Field) term566781).get((Object) null);
        term565719 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term565833 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term565937 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term565937, term565937.getClass(), "ownerFunction", null);
        setField(term565833, term565833.getClass(), "type", term565937);
        setField(term565719, term565719.getClass(), "prototypeSlot", term565833);
        setField(term565719, term565719.getClass(), "source", null);
        setField(term565719, term565719.getClass(), "kind", enum925);
        setBooleanField(term565719, term565719.getClass(), "unknown", false);
        setField(term565719, term565719.getClass(), "subTypes", null);
        setBooleanField(term565719, term565719.getClass(), "nativeType", false);
        term566189 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term566189, term566189.getClass(), "ownerFunction", null);
        setBooleanField(term566189, term566189.getClass(), "unknown", false);
        setField(term566189, term566189.getClass(), "subTypes", null);
        setBooleanField(term566189, term566189.getClass(), "nativeType", false);
        setField(term566189, term566189.getClass(), "kind", enum925);
        setField(term566189, term566189.getClass(), "prototypeSlot", null);
        Class<? extends Object> term567082 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term567081 = ((Class) term567082).getDeclaredField((String) "INTERFACE");
        ((Field) term567081).setAccessible(true);
        Object enum926 = ((Field) term567081).get((Object) null);
        term566766 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term566767 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term566770 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term566766, term566766.getClass(), "call", null);
        setField(term566767, term566767.getClass(), "name", "prototype");
        setField(term566770, term566770.getClass(), "call", null);
        setField(term566770, term566770.getClass(), "prototypeSlot", null);
        setField(term566770, term566770.getClass(), "kind", enum926);
        setField(term566770, term566770.getClass(), "propAccess", null);
        setField(term566770, term566770.getClass(), "typeOfThis", null);
        setField(term566770, term566770.getClass(), "source", null);
        setField(term566770, term566770.getClass(), "implementedInterfaces", null);
        setField(term566770, term566770.getClass(), "extendedInterfaces", null);
        setField(term566770, term566770.getClass(), "subTypes", null);
        setField(term566770, term566770.getClass(), "templateTypeNames", null);
        setField(term566770, term566770.getClass(), "className", null);
        setField(term566770, term566770.getClass(), "properties", null);
        setBooleanField(term566770, term566770.getClass(), "nativeType", false);
        setField(term566770, term566770.getClass(), "implicitPrototypeFallback", null);
        setField(term566770, term566770.getClass(), "ownerFunction", term566766);
        setBooleanField(term566770, term566770.getClass(), "prettyPrint", false);
        setBooleanField(term566770, term566770.getClass(), "visited", false);
        setField(term566770, term566770.getClass(), "docInfo", null);
        setBooleanField(term566770, term566770.getClass(), "unknown", true);
        setBooleanField(term566770, term566770.getClass(), "resolved", false);
        setField(term566770, term566770.getClass(), "resolveResult", null);
        setBooleanField(term566770, term566770.getClass(), "inTemplatedCheckVisit", false);
        setField(term566770, term566770.getClass(), "registry", null);
        setField(term566767, term566767.getClass(), "type", term566770);
        setBooleanField(term566767, term566767.getClass(), "inferred", true);
        setField(term566767, term566767.getClass(), "propertyNode", null);
        setField(term566767, term566767.getClass(), "docInfo", null);
        setField(term566766, term566766.getClass(), "prototypeSlot", term566767);
        setField(term566766, term566766.getClass(), "kind", enum926);
        setField(term566766, term566766.getClass(), "propAccess", null);
        setField(term566766, term566766.getClass(), "typeOfThis", null);
        setField(term566766, term566766.getClass(), "source", null);
        setField(term566766, term566766.getClass(), "implementedInterfaces", null);
        setField(term566766, term566766.getClass(), "extendedInterfaces", null);
        setField(term566766, term566766.getClass(), "subTypes", null);
        setField(term566766, term566766.getClass(), "templateTypeNames", null);
        setField(term566766, term566766.getClass(), "className", null);
        setField(term566766, term566766.getClass(), "properties", null);
        setBooleanField(term566766, term566766.getClass(), "nativeType", false);
        setField(term566766, term566766.getClass(), "implicitPrototypeFallback", null);
        setField(term566766, term566766.getClass(), "ownerFunction", null);
        setBooleanField(term566766, term566766.getClass(), "prettyPrint", false);
        setBooleanField(term566766, term566766.getClass(), "visited", false);
        setField(term566766, term566766.getClass(), "docInfo", null);
        setBooleanField(term566766, term566766.getClass(), "unknown", true);
        setBooleanField(term566766, term566766.getClass(), "resolved", false);
        setField(term566766, term566766.getClass(), "resolveResult", null);
        setBooleanField(term566766, term566766.getClass(), "inTemplatedCheckVisit", false);
        setField(term566766, term566766.getClass(), "registry", null);
        Class<? extends Object> term567376 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term567375 = ((Class) term567376).getDeclaredField((String) "INTERFACE");
        ((Field) term567375).setAccessible(true);
        Object enum927 = ((Field) term567375).get((Object) null);
        term566773 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term566776 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term566777 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term566773, term566773.getClass(), "call", null);
        setField(term566773, term566773.getClass(), "prototypeSlot", null);
        setField(term566773, term566773.getClass(), "kind", enum927);
        setField(term566773, term566773.getClass(), "propAccess", null);
        setField(term566773, term566773.getClass(), "typeOfThis", null);
        setField(term566773, term566773.getClass(), "source", null);
        setField(term566773, term566773.getClass(), "implementedInterfaces", null);
        setField(term566773, term566773.getClass(), "extendedInterfaces", null);
        setField(term566773, term566773.getClass(), "subTypes", null);
        setField(term566773, term566773.getClass(), "templateTypeNames", null);
        setField(term566773, term566773.getClass(), "className", null);
        setField(term566773, term566773.getClass(), "properties", null);
        setBooleanField(term566773, term566773.getClass(), "nativeType", false);
        setField(term566773, term566773.getClass(), "implicitPrototypeFallback", null);
        setField(term566776, term566776.getClass(), "call", null);
        setField(term566777, term566777.getClass(), "name", "prototype");
        setField(term566777, term566777.getClass(), "type", term566773);
        setBooleanField(term566777, term566777.getClass(), "inferred", true);
        setField(term566777, term566777.getClass(), "propertyNode", null);
        setField(term566777, term566777.getClass(), "docInfo", null);
        setField(term566776, term566776.getClass(), "prototypeSlot", term566777);
        setField(term566776, term566776.getClass(), "kind", enum927);
        setField(term566776, term566776.getClass(), "propAccess", null);
        setField(term566776, term566776.getClass(), "typeOfThis", null);
        setField(term566776, term566776.getClass(), "source", null);
        setField(term566776, term566776.getClass(), "implementedInterfaces", null);
        setField(term566776, term566776.getClass(), "extendedInterfaces", null);
        setField(term566776, term566776.getClass(), "subTypes", null);
        setField(term566776, term566776.getClass(), "templateTypeNames", null);
        setField(term566776, term566776.getClass(), "className", null);
        setField(term566776, term566776.getClass(), "properties", null);
        setBooleanField(term566776, term566776.getClass(), "nativeType", false);
        setField(term566776, term566776.getClass(), "implicitPrototypeFallback", null);
        setField(term566776, term566776.getClass(), "ownerFunction", null);
        setBooleanField(term566776, term566776.getClass(), "prettyPrint", false);
        setBooleanField(term566776, term566776.getClass(), "visited", false);
        setField(term566776, term566776.getClass(), "docInfo", null);
        setBooleanField(term566776, term566776.getClass(), "unknown", true);
        setBooleanField(term566776, term566776.getClass(), "resolved", false);
        setField(term566776, term566776.getClass(), "resolveResult", null);
        setBooleanField(term566776, term566776.getClass(), "inTemplatedCheckVisit", false);
        setField(term566776, term566776.getClass(), "registry", null);
        setField(term566773, term566773.getClass(), "ownerFunction", term566776);
        setBooleanField(term566773, term566773.getClass(), "prettyPrint", false);
        setBooleanField(term566773, term566773.getClass(), "visited", false);
        setField(term566773, term566773.getClass(), "docInfo", null);
        setBooleanField(term566773, term566773.getClass(), "unknown", true);
        setBooleanField(term566773, term566773.getClass(), "resolved", false);
        setField(term566773, term566773.getClass(), "resolveResult", null);
        setBooleanField(term566773, term566773.getClass(), "inTemplatedCheckVisit", false);
        setField(term566773, term566773.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term566189;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototypeNoCheck", argTypes, term565719, args);
        assertTrue(recursiveEquals(term565719, term566766));
        assertTrue(recursiveEquals(term566189, term566773));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


