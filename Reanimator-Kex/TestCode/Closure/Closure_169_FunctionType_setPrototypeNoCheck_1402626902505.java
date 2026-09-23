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

public class FunctionType_setPrototypeNoCheck_1402626902505 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term468080;
     Object term468650;
     Object term470855;
     Object term470863;

    public FunctionType_setPrototypeNoCheck_1402626902505() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term470873 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term470872 = ((Class) term470873).getDeclaredField((String) "ORDINARY");
        ((Field) term470872).setAccessible(true);
        Object enum768 = ((Field) term470872).get((Object) null);
        term468080 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term468194 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term468294 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term468398 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term468294, term468294.getClass(), "ownerFunction", term468398);
        setField(term468194, term468194.getClass(), "type", term468294);
        setField(term468080, term468080.getClass(), "prototypeSlot", term468194);
        setField(term468080, term468080.getClass(), "source", null);
        setField(term468080, term468080.getClass(), "kind", enum768);
        setBooleanField(term468080, term468080.getClass(), "unknown", false);
        setField(term468080, term468080.getClass(), "subTypes", null);
        setBooleanField(term468080, term468080.getClass(), "nativeType", false);
        term468650 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term468650, term468650.getClass(), "ownerFunction", null);
        setBooleanField(term468650, term468650.getClass(), "unknown", false);
        setField(term468650, term468650.getClass(), "subTypes", null);
        setBooleanField(term468650, term468650.getClass(), "nativeType", true);
        Class<? extends Object> term471173 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term471172 = ((Class) term471173).getDeclaredField((String) "ORDINARY");
        ((Field) term471172).setAccessible(true);
        Object enum769 = ((Field) term471172).get((Object) null);
        term470855 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term470856 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term470859 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        setField(term470855, term470855.getClass(), "call", null);
        setField(term470856, term470856.getClass(), "name", "prototype");
        setField(term470859, term470859.getClass(), "call", null);
        setField(term470859, term470859.getClass(), "prototypeSlot", null);
        setField(term470859, term470859.getClass(), "kind", null);
        setField(term470859, term470859.getClass(), "propAccess", null);
        setField(term470859, term470859.getClass(), "typeOfThis", null);
        setField(term470859, term470859.getClass(), "source", null);
        setField(term470859, term470859.getClass(), "implementedInterfaces", null);
        setField(term470859, term470859.getClass(), "extendedInterfaces", null);
        setField(term470859, term470859.getClass(), "subTypes", null);
        setField(term470859, term470859.getClass(), "templateTypeNames", null);
        setField(term470859, term470859.getClass(), "className", null);
        setField(term470859, term470859.getClass(), "properties", null);
        setBooleanField(term470859, term470859.getClass(), "nativeType", true);
        setField(term470859, term470859.getClass(), "implicitPrototypeFallback", null);
        setField(term470859, term470859.getClass(), "ownerFunction", term470855);
        setBooleanField(term470859, term470859.getClass(), "prettyPrint", false);
        setBooleanField(term470859, term470859.getClass(), "visited", false);
        setField(term470859, term470859.getClass(), "docInfo", null);
        setBooleanField(term470859, term470859.getClass(), "unknown", true);
        setBooleanField(term470859, term470859.getClass(), "resolved", false);
        setField(term470859, term470859.getClass(), "resolveResult", null);
        setBooleanField(term470859, term470859.getClass(), "inTemplatedCheckVisit", false);
        setField(term470859, term470859.getClass(), "registry", null);
        setField(term470856, term470856.getClass(), "type", term470859);
        setBooleanField(term470856, term470856.getClass(), "inferred", true);
        setField(term470856, term470856.getClass(), "propertyNode", null);
        setField(term470856, term470856.getClass(), "docInfo", null);
        setField(term470855, term470855.getClass(), "prototypeSlot", term470856);
        setField(term470855, term470855.getClass(), "kind", enum769);
        setField(term470855, term470855.getClass(), "propAccess", null);
        setField(term470855, term470855.getClass(), "typeOfThis", null);
        setField(term470855, term470855.getClass(), "source", null);
        setField(term470855, term470855.getClass(), "implementedInterfaces", null);
        setField(term470855, term470855.getClass(), "extendedInterfaces", null);
        setField(term470855, term470855.getClass(), "subTypes", null);
        setField(term470855, term470855.getClass(), "templateTypeNames", null);
        setField(term470855, term470855.getClass(), "className", null);
        setField(term470855, term470855.getClass(), "properties", null);
        setBooleanField(term470855, term470855.getClass(), "nativeType", false);
        setField(term470855, term470855.getClass(), "implicitPrototypeFallback", null);
        setField(term470855, term470855.getClass(), "ownerFunction", null);
        setBooleanField(term470855, term470855.getClass(), "prettyPrint", false);
        setBooleanField(term470855, term470855.getClass(), "visited", false);
        setField(term470855, term470855.getClass(), "docInfo", null);
        setBooleanField(term470855, term470855.getClass(), "unknown", true);
        setBooleanField(term470855, term470855.getClass(), "resolved", false);
        setField(term470855, term470855.getClass(), "resolveResult", null);
        setBooleanField(term470855, term470855.getClass(), "inTemplatedCheckVisit", false);
        setField(term470855, term470855.getClass(), "registry", null);
        Class<? extends Object> term471473 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term471472 = ((Class) term471473).getDeclaredField((String) "ORDINARY");
        ((Field) term471472).setAccessible(true);
        Object enum770 = ((Field) term471472).get((Object) null);
        term470863 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoResolvedType"));
        Object term470864 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoObjectType"));
        Object term470865 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setField(term470863, term470863.getClass(), "call", null);
        setField(term470863, term470863.getClass(), "prototypeSlot", null);
        setField(term470863, term470863.getClass(), "kind", null);
        setField(term470863, term470863.getClass(), "propAccess", null);
        setField(term470863, term470863.getClass(), "typeOfThis", null);
        setField(term470863, term470863.getClass(), "source", null);
        setField(term470863, term470863.getClass(), "implementedInterfaces", null);
        setField(term470863, term470863.getClass(), "extendedInterfaces", null);
        setField(term470863, term470863.getClass(), "subTypes", null);
        setField(term470863, term470863.getClass(), "templateTypeNames", null);
        setField(term470863, term470863.getClass(), "className", null);
        setField(term470863, term470863.getClass(), "properties", null);
        setBooleanField(term470863, term470863.getClass(), "nativeType", true);
        setField(term470863, term470863.getClass(), "implicitPrototypeFallback", null);
        setField(term470864, term470864.getClass(), "call", null);
        setField(term470865, term470865.getClass(), "name", "prototype");
        setField(term470865, term470865.getClass(), "type", term470863);
        setBooleanField(term470865, term470865.getClass(), "inferred", true);
        setField(term470865, term470865.getClass(), "propertyNode", null);
        setField(term470865, term470865.getClass(), "docInfo", null);
        setField(term470864, term470864.getClass(), "prototypeSlot", term470865);
        setField(term470864, term470864.getClass(), "kind", enum770);
        setField(term470864, term470864.getClass(), "propAccess", null);
        setField(term470864, term470864.getClass(), "typeOfThis", null);
        setField(term470864, term470864.getClass(), "source", null);
        setField(term470864, term470864.getClass(), "implementedInterfaces", null);
        setField(term470864, term470864.getClass(), "extendedInterfaces", null);
        setField(term470864, term470864.getClass(), "subTypes", null);
        setField(term470864, term470864.getClass(), "templateTypeNames", null);
        setField(term470864, term470864.getClass(), "className", null);
        setField(term470864, term470864.getClass(), "properties", null);
        setBooleanField(term470864, term470864.getClass(), "nativeType", false);
        setField(term470864, term470864.getClass(), "implicitPrototypeFallback", null);
        setField(term470864, term470864.getClass(), "ownerFunction", null);
        setBooleanField(term470864, term470864.getClass(), "prettyPrint", false);
        setBooleanField(term470864, term470864.getClass(), "visited", false);
        setField(term470864, term470864.getClass(), "docInfo", null);
        setBooleanField(term470864, term470864.getClass(), "unknown", true);
        setBooleanField(term470864, term470864.getClass(), "resolved", false);
        setField(term470864, term470864.getClass(), "resolveResult", null);
        setBooleanField(term470864, term470864.getClass(), "inTemplatedCheckVisit", false);
        setField(term470864, term470864.getClass(), "registry", null);
        setField(term470863, term470863.getClass(), "ownerFunction", term470864);
        setBooleanField(term470863, term470863.getClass(), "prettyPrint", false);
        setBooleanField(term470863, term470863.getClass(), "visited", false);
        setField(term470863, term470863.getClass(), "docInfo", null);
        setBooleanField(term470863, term470863.getClass(), "unknown", true);
        setBooleanField(term470863, term470863.getClass(), "resolved", false);
        setField(term470863, term470863.getClass(), "resolveResult", null);
        setBooleanField(term470863, term470863.getClass(), "inTemplatedCheckVisit", false);
        setField(term470863, term470863.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term468650;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototypeNoCheck", argTypes, term468080, args);
        assertTrue(recursiveEquals(term468080, term470855));
        assertTrue(recursiveEquals(term468650, term470863));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


