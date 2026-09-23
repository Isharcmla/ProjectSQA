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

public class FunctionType_setPrototype_1144423633333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term304839;
     Object term305203;
     Object term305763;
     Object term305772;

    public FunctionType_setPrototype_1144423633333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term305783 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term305782 = ((Class) term305783).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term305782).setAccessible(true);
        Object enum539 = ((Field) term305782).get((Object) null);
        term304839 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term305093 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term304839, term304839.getClass(), "kind", enum539);
        setField(term304839, term304839.getClass(), "typeOfThis", term305093);
        setField(term304839, term304839.getClass(), "prototypeSlot", null);
        setField(term304839, term304839.getClass(), "source", null);
        term305203 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        setField(term305203, term305203.getClass(), "ownerFunction", null);
        Class<? extends Object> term306092 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term306091 = ((Class) term306092).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term306091).setAccessible(true);
        Object enum540 = ((Field) term306091).get((Object) null);
        term305763 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term305764 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term305767 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term305771 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term305763, term305763.getClass(), "call", null);
        setField(term305764, term305764.getClass(), "name", "prototype");
        setField(term305767, term305767.getClass(), "call", null);
        setField(term305767, term305767.getClass(), "prototypeSlot", null);
        setField(term305767, term305767.getClass(), "kind", null);
        setField(term305767, term305767.getClass(), "propAccess", null);
        setField(term305767, term305767.getClass(), "typeOfThis", null);
        setField(term305767, term305767.getClass(), "source", null);
        setField(term305767, term305767.getClass(), "implementedInterfaces", null);
        setField(term305767, term305767.getClass(), "extendedInterfaces", null);
        setField(term305767, term305767.getClass(), "subTypes", null);
        setField(term305767, term305767.getClass(), "templateTypeNames", null);
        setField(term305767, term305767.getClass(), "className", null);
        setField(term305767, term305767.getClass(), "properties", null);
        setBooleanField(term305767, term305767.getClass(), "nativeType", false);
        setField(term305767, term305767.getClass(), "implicitPrototypeFallback", null);
        setField(term305767, term305767.getClass(), "ownerFunction", term305763);
        setBooleanField(term305767, term305767.getClass(), "prettyPrint", false);
        setBooleanField(term305767, term305767.getClass(), "visited", false);
        setField(term305767, term305767.getClass(), "docInfo", null);
        setBooleanField(term305767, term305767.getClass(), "unknown", false);
        setBooleanField(term305767, term305767.getClass(), "resolved", false);
        setField(term305767, term305767.getClass(), "resolveResult", null);
        setBooleanField(term305767, term305767.getClass(), "inTemplatedCheckVisit", false);
        setField(term305767, term305767.getClass(), "registry", null);
        setField(term305764, term305764.getClass(), "type", term305767);
        setBooleanField(term305764, term305764.getClass(), "inferred", true);
        setField(term305764, term305764.getClass(), "propertyNode", null);
        setField(term305764, term305764.getClass(), "docInfo", null);
        setField(term305763, term305763.getClass(), "prototypeSlot", term305764);
        setField(term305763, term305763.getClass(), "kind", enum540);
        setField(term305763, term305763.getClass(), "propAccess", null);
        setField(term305771, term305771.getClass(), "primitiveType", null);
        setField(term305771, term305771.getClass(), "primitiveObjectType", null);
        setField(term305771, term305771.getClass(), "name", null);
        setBooleanField(term305771, term305771.getClass(), "visited", false);
        setField(term305771, term305771.getClass(), "docInfo", null);
        setBooleanField(term305771, term305771.getClass(), "unknown", false);
        setBooleanField(term305771, term305771.getClass(), "resolved", false);
        setField(term305771, term305771.getClass(), "resolveResult", null);
        setBooleanField(term305771, term305771.getClass(), "inTemplatedCheckVisit", false);
        setField(term305771, term305771.getClass(), "registry", null);
        setField(term305763, term305763.getClass(), "typeOfThis", term305771);
        setField(term305763, term305763.getClass(), "source", null);
        setField(term305763, term305763.getClass(), "implementedInterfaces", null);
        setField(term305763, term305763.getClass(), "extendedInterfaces", null);
        setField(term305763, term305763.getClass(), "subTypes", null);
        setField(term305763, term305763.getClass(), "templateTypeNames", null);
        setField(term305763, term305763.getClass(), "className", null);
        setField(term305763, term305763.getClass(), "properties", null);
        setBooleanField(term305763, term305763.getClass(), "nativeType", false);
        setField(term305763, term305763.getClass(), "implicitPrototypeFallback", null);
        setField(term305763, term305763.getClass(), "ownerFunction", null);
        setBooleanField(term305763, term305763.getClass(), "prettyPrint", false);
        setBooleanField(term305763, term305763.getClass(), "visited", false);
        setField(term305763, term305763.getClass(), "docInfo", null);
        setBooleanField(term305763, term305763.getClass(), "unknown", false);
        setBooleanField(term305763, term305763.getClass(), "resolved", false);
        setField(term305763, term305763.getClass(), "resolveResult", null);
        setBooleanField(term305763, term305763.getClass(), "inTemplatedCheckVisit", false);
        setField(term305763, term305763.getClass(), "registry", null);
        Class<? extends Object> term306401 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term306400 = ((Class) term306401).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term306400).setAccessible(true);
        Object enum541 = ((Field) term306400).get((Object) null);
        term305772 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ErrorFunctionType"));
        Object term305773 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term305774 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        Object term305780 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term305772, term305772.getClass(), "call", null);
        setField(term305772, term305772.getClass(), "prototypeSlot", null);
        setField(term305772, term305772.getClass(), "kind", null);
        setField(term305772, term305772.getClass(), "propAccess", null);
        setField(term305772, term305772.getClass(), "typeOfThis", null);
        setField(term305772, term305772.getClass(), "source", null);
        setField(term305772, term305772.getClass(), "implementedInterfaces", null);
        setField(term305772, term305772.getClass(), "extendedInterfaces", null);
        setField(term305772, term305772.getClass(), "subTypes", null);
        setField(term305772, term305772.getClass(), "templateTypeNames", null);
        setField(term305772, term305772.getClass(), "className", null);
        setField(term305772, term305772.getClass(), "properties", null);
        setBooleanField(term305772, term305772.getClass(), "nativeType", false);
        setField(term305772, term305772.getClass(), "implicitPrototypeFallback", null);
        setField(term305773, term305773.getClass(), "call", null);
        setField(term305774, term305774.getClass(), "name", "prototype");
        setField(term305774, term305774.getClass(), "type", term305772);
        setBooleanField(term305774, term305774.getClass(), "inferred", true);
        setField(term305774, term305774.getClass(), "propertyNode", null);
        setField(term305774, term305774.getClass(), "docInfo", null);
        setField(term305773, term305773.getClass(), "prototypeSlot", term305774);
        setField(term305773, term305773.getClass(), "kind", enum541);
        setField(term305773, term305773.getClass(), "propAccess", null);
        setField(term305780, term305780.getClass(), "primitiveType", null);
        setField(term305780, term305780.getClass(), "primitiveObjectType", null);
        setField(term305780, term305780.getClass(), "name", null);
        setBooleanField(term305780, term305780.getClass(), "visited", false);
        setField(term305780, term305780.getClass(), "docInfo", null);
        setBooleanField(term305780, term305780.getClass(), "unknown", false);
        setBooleanField(term305780, term305780.getClass(), "resolved", false);
        setField(term305780, term305780.getClass(), "resolveResult", null);
        setBooleanField(term305780, term305780.getClass(), "inTemplatedCheckVisit", false);
        setField(term305780, term305780.getClass(), "registry", null);
        setField(term305773, term305773.getClass(), "typeOfThis", term305780);
        setField(term305773, term305773.getClass(), "source", null);
        setField(term305773, term305773.getClass(), "implementedInterfaces", null);
        setField(term305773, term305773.getClass(), "extendedInterfaces", null);
        setField(term305773, term305773.getClass(), "subTypes", null);
        setField(term305773, term305773.getClass(), "templateTypeNames", null);
        setField(term305773, term305773.getClass(), "className", null);
        setField(term305773, term305773.getClass(), "properties", null);
        setBooleanField(term305773, term305773.getClass(), "nativeType", false);
        setField(term305773, term305773.getClass(), "implicitPrototypeFallback", null);
        setField(term305773, term305773.getClass(), "ownerFunction", null);
        setBooleanField(term305773, term305773.getClass(), "prettyPrint", false);
        setBooleanField(term305773, term305773.getClass(), "visited", false);
        setField(term305773, term305773.getClass(), "docInfo", null);
        setBooleanField(term305773, term305773.getClass(), "unknown", false);
        setBooleanField(term305773, term305773.getClass(), "resolved", false);
        setField(term305773, term305773.getClass(), "resolveResult", null);
        setBooleanField(term305773, term305773.getClass(), "inTemplatedCheckVisit", false);
        setField(term305773, term305773.getClass(), "registry", null);
        setField(term305772, term305772.getClass(), "ownerFunction", term305773);
        setBooleanField(term305772, term305772.getClass(), "prettyPrint", false);
        setBooleanField(term305772, term305772.getClass(), "visited", false);
        setField(term305772, term305772.getClass(), "docInfo", null);
        setBooleanField(term305772, term305772.getClass(), "unknown", false);
        setBooleanField(term305772, term305772.getClass(), "resolved", false);
        setField(term305772, term305772.getClass(), "resolveResult", null);
        setBooleanField(term305772, term305772.getClass(), "inTemplatedCheckVisit", false);
        setField(term305772, term305772.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term305203;
        args[1] = null;
        Object retValue = callMethod(klass, "setPrototype", argTypes, term304839, args);
        assertTrue(recursiveEquals(term304839, term305763));
        assertTrue(recursiveEquals(term305203, term305772));
        assertTrue(recursiveEquals(retValue, true));
    }

};


