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

public class FunctionType_setPrototypeNoCheck_1402626902469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term429269;
     Object term429835;
     Object term430412;
     Object term430422;

    public FunctionType_setPrototypeNoCheck_1402626902469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term430434 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term430433 = ((Class) term430434).getDeclaredField((String) "ORDINARY");
        ((Field) term430433).setAccessible(true);
        Object enum708 = ((Field) term430433).get((Object) null);
        term429269 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term429383 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term429483 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term429583 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term429483, term429483.getClass(), "ownerFunction", term429583);
        setField(term429383, term429383.getClass(), "type", term429483);
        setField(term429269, term429269.getClass(), "prototypeSlot", term429383);
        setField(term429269, term429269.getClass(), "source", null);
        setField(term429269, term429269.getClass(), "kind", enum708);
        setBooleanField(term429269, term429269.getClass(), "unknown", false);
        setField(term429269, term429269.getClass(), "subTypes", null);
        setBooleanField(term429269, term429269.getClass(), "nativeType", false);
        ArrayList term429887 = new ArrayList();
        term429835 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term429835, term429835.getClass(), "ownerFunction", null);
        setBooleanField(term429835, term429835.getClass(), "unknown", false);
        setField(term429835, term429835.getClass(), "subTypes", term429887);
        ArrayList term430417 = new ArrayList();
        Class<? extends Object> term430734 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term430733 = ((Class) term430734).getDeclaredField((String) "ORDINARY");
        ((Field) term430733).setAccessible(true);
        Object enum709 = ((Field) term430733).get((Object) null);
        term430412 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term430413 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term430416 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term430412, term430412.getClass(), "call", null);
        setField(term430413, term430413.getClass(), "name", "prototype");
        setField(term430416, term430416.getClass(), "call", null);
        setField(term430416, term430416.getClass(), "prototypeSlot", null);
        setField(term430416, term430416.getClass(), "kind", null);
        setField(term430416, term430416.getClass(), "propAccess", null);
        setField(term430416, term430416.getClass(), "typeOfThis", null);
        setField(term430416, term430416.getClass(), "source", null);
        setField(term430416, term430416.getClass(), "implementedInterfaces", null);
        setField(term430416, term430416.getClass(), "extendedInterfaces", null);
        setField(term430416, term430416.getClass(), "subTypes", term430417);
        setField(term430416, term430416.getClass(), "templateTypeNames", null);
        setField(term430416, term430416.getClass(), "className", null);
        setField(term430416, term430416.getClass(), "properties", null);
        setBooleanField(term430416, term430416.getClass(), "nativeType", false);
        setField(term430416, term430416.getClass(), "implicitPrototypeFallback", null);
        setField(term430416, term430416.getClass(), "ownerFunction", term430412);
        setBooleanField(term430416, term430416.getClass(), "prettyPrint", false);
        setBooleanField(term430416, term430416.getClass(), "visited", false);
        setField(term430416, term430416.getClass(), "docInfo", null);
        setBooleanField(term430416, term430416.getClass(), "unknown", true);
        setBooleanField(term430416, term430416.getClass(), "resolved", false);
        setField(term430416, term430416.getClass(), "resolveResult", null);
        setBooleanField(term430416, term430416.getClass(), "inTemplatedCheckVisit", false);
        setField(term430416, term430416.getClass(), "registry", null);
        setField(term430413, term430413.getClass(), "type", term430416);
        setBooleanField(term430413, term430413.getClass(), "inferred", true);
        setField(term430413, term430413.getClass(), "propertyNode", null);
        setField(term430413, term430413.getClass(), "docInfo", null);
        setField(term430412, term430412.getClass(), "prototypeSlot", term430413);
        setField(term430412, term430412.getClass(), "kind", enum709);
        setField(term430412, term430412.getClass(), "propAccess", null);
        setField(term430412, term430412.getClass(), "typeOfThis", null);
        setField(term430412, term430412.getClass(), "source", null);
        setField(term430412, term430412.getClass(), "implementedInterfaces", null);
        setField(term430412, term430412.getClass(), "extendedInterfaces", null);
        setField(term430412, term430412.getClass(), "subTypes", null);
        setField(term430412, term430412.getClass(), "templateTypeNames", null);
        setField(term430412, term430412.getClass(), "className", null);
        setField(term430412, term430412.getClass(), "properties", null);
        setBooleanField(term430412, term430412.getClass(), "nativeType", false);
        setField(term430412, term430412.getClass(), "implicitPrototypeFallback", null);
        setField(term430412, term430412.getClass(), "ownerFunction", null);
        setBooleanField(term430412, term430412.getClass(), "prettyPrint", false);
        setBooleanField(term430412, term430412.getClass(), "visited", false);
        setField(term430412, term430412.getClass(), "docInfo", null);
        setBooleanField(term430412, term430412.getClass(), "unknown", true);
        setBooleanField(term430412, term430412.getClass(), "resolved", false);
        setField(term430412, term430412.getClass(), "resolveResult", null);
        setBooleanField(term430412, term430412.getClass(), "inTemplatedCheckVisit", false);
        setField(term430412, term430412.getClass(), "registry", null);
        ArrayList term430423 = new ArrayList();
        Class<? extends Object> term431034 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term431033 = ((Class) term431034).getDeclaredField((String) "ORDINARY");
        ((Field) term431033).setAccessible(true);
        Object enum710 = ((Field) term431033).get((Object) null);
        term430422 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term430425 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term430426 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term430422, term430422.getClass(), "call", null);
        setField(term430422, term430422.getClass(), "prototypeSlot", null);
        setField(term430422, term430422.getClass(), "kind", null);
        setField(term430422, term430422.getClass(), "propAccess", null);
        setField(term430422, term430422.getClass(), "typeOfThis", null);
        setField(term430422, term430422.getClass(), "source", null);
        setField(term430422, term430422.getClass(), "implementedInterfaces", null);
        setField(term430422, term430422.getClass(), "extendedInterfaces", null);
        setField(term430422, term430422.getClass(), "subTypes", term430423);
        setField(term430422, term430422.getClass(), "templateTypeNames", null);
        setField(term430422, term430422.getClass(), "className", null);
        setField(term430422, term430422.getClass(), "properties", null);
        setBooleanField(term430422, term430422.getClass(), "nativeType", false);
        setField(term430422, term430422.getClass(), "implicitPrototypeFallback", null);
        setField(term430425, term430425.getClass(), "call", null);
        setField(term430426, term430426.getClass(), "name", "prototype");
        setField(term430426, term430426.getClass(), "type", term430422);
        setBooleanField(term430426, term430426.getClass(), "inferred", true);
        setField(term430426, term430426.getClass(), "propertyNode", null);
        setField(term430426, term430426.getClass(), "docInfo", null);
        setField(term430425, term430425.getClass(), "prototypeSlot", term430426);
        setField(term430425, term430425.getClass(), "kind", enum710);
        setField(term430425, term430425.getClass(), "propAccess", null);
        setField(term430425, term430425.getClass(), "typeOfThis", null);
        setField(term430425, term430425.getClass(), "source", null);
        setField(term430425, term430425.getClass(), "implementedInterfaces", null);
        setField(term430425, term430425.getClass(), "extendedInterfaces", null);
        setField(term430425, term430425.getClass(), "subTypes", null);
        setField(term430425, term430425.getClass(), "templateTypeNames", null);
        setField(term430425, term430425.getClass(), "className", null);
        setField(term430425, term430425.getClass(), "properties", null);
        setBooleanField(term430425, term430425.getClass(), "nativeType", false);
        setField(term430425, term430425.getClass(), "implicitPrototypeFallback", null);
        setField(term430425, term430425.getClass(), "ownerFunction", null);
        setBooleanField(term430425, term430425.getClass(), "prettyPrint", false);
        setBooleanField(term430425, term430425.getClass(), "visited", false);
        setField(term430425, term430425.getClass(), "docInfo", null);
        setBooleanField(term430425, term430425.getClass(), "unknown", true);
        setBooleanField(term430425, term430425.getClass(), "resolved", false);
        setField(term430425, term430425.getClass(), "resolveResult", null);
        setBooleanField(term430425, term430425.getClass(), "inTemplatedCheckVisit", false);
        setField(term430425, term430425.getClass(), "registry", null);
        setField(term430422, term430422.getClass(), "ownerFunction", term430425);
        setBooleanField(term430422, term430422.getClass(), "prettyPrint", false);
        setBooleanField(term430422, term430422.getClass(), "visited", false);
        setField(term430422, term430422.getClass(), "docInfo", null);
        setBooleanField(term430422, term430422.getClass(), "unknown", true);
        setBooleanField(term430422, term430422.getClass(), "resolved", false);
        setField(term430422, term430422.getClass(), "resolveResult", null);
        setBooleanField(term430422, term430422.getClass(), "inTemplatedCheckVisit", false);
        setField(term430422, term430422.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term429835;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototypeNoCheck", argTypes, term429269, args);
        assertTrue(recursiveEquals(term429269, term430412));
        assertTrue(recursiveEquals(term429835, term430422));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


