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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FunctionType_isSubtype_2101002158165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36604;

    public FunctionType_isSubtype_2101002158165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term191869 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term191868 = ((Class) term191869).getDeclaredField((String) "INTERFACE");
        ((Field) term191868).setAccessible(true);
        Object enum339 = ((Field) term191868).get((Object) null);
        Class<? extends Object> term192163 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term192162 = ((Class) term192163).getDeclaredField((String) "DICT");
        ((Field) term192162).setAccessible(true);
        Object enum340 = ((Field) term192162).get((Object) null);
        term36604 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term36605 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term36606 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36608 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36610 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36613 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36620 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36622 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36625 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term36633 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term36606, term36606.getClass(), "type", 895255351);
        setIntField(term36608, term36608.getClass(), "type", -1317044799);
        setIntField(term36610, term36610.getClass(), "type", -1428063820);
        setField(term36610, term36610.getClass(), "next", null);
        setField(term36610, term36610.getClass(), "first", null);
        setField(term36610, term36610.getClass(), "last", null);
        setField(term36610, term36610.getClass(), "propListHead", null);
        setIntField(term36610, term36610.getClass(), "sourcePosition", 0);
        setField(term36610, term36610.getClass(), "jsType", null);
        setField(term36610, term36610.getClass(), "parent", null);
        setField(term36608, term36608.getClass(), "next", term36610);
        setIntField(term36613, term36613.getClass(), "type", 0);
        setField(term36613, term36613.getClass(), "next", null);
        setField(term36613, term36613.getClass(), "first", null);
        setField(term36613, term36613.getClass(), "last", null);
        setField(term36613, term36613.getClass(), "propListHead", null);
        setIntField(term36613, term36613.getClass(), "sourcePosition", 0);
        setField(term36613, term36613.getClass(), "jsType", null);
        setField(term36613, term36613.getClass(), "parent", null);
        setField(term36608, term36608.getClass(), "first", term36613);
        setIntField(term36616, term36616.getClass(), "type", -687282231);
        setField(term36616, term36616.getClass(), "next", null);
        setField(term36616, term36616.getClass(), "first", term36613);
        setField(term36616, term36616.getClass(), "last", term36616);
        setField(term36616, term36616.getClass(), "propListHead", null);
        setIntField(term36616, term36616.getClass(), "sourcePosition", 0);
        setField(term36616, term36616.getClass(), "jsType", null);
        setField(term36616, term36616.getClass(), "parent", null);
        setField(term36608, term36608.getClass(), "last", term36616);
        setField(term36608, term36608.getClass(), "propListHead", null);
        setIntField(term36608, term36608.getClass(), "sourcePosition", 0);
        setField(term36608, term36608.getClass(), "jsType", null);
        setField(term36608, term36608.getClass(), "parent", null);
        setField(term36606, term36606.getClass(), "next", term36608);
        setIntField(term36620, term36620.getClass(), "type", -1220630391);
        setIntField(term36622, term36622.getClass(), "type", -995822131);
        setField(term36622, term36622.getClass(), "next", term36616);
        setField(term36622, term36622.getClass(), "first", null);
        setField(term36622, term36622.getClass(), "last", term36606);
        setField(term36622, term36622.getClass(), "propListHead", null);
        setIntField(term36622, term36622.getClass(), "sourcePosition", 0);
        setField(term36622, term36622.getClass(), "jsType", null);
        setField(term36622, term36622.getClass(), "parent", null);
        setField(term36620, term36620.getClass(), "next", term36622);
        setField(term36620, term36620.getClass(), "first", term36620);
        setIntField(term36625, term36625.getClass(), "type", -1271375703);
        setField(term36625, term36625.getClass(), "next", null);
        setField(term36625, term36625.getClass(), "first", term36613);
        setField(term36625, term36625.getClass(), "last", term36616);
        setField(term36625, term36625.getClass(), "propListHead", null);
        setIntField(term36625, term36625.getClass(), "sourcePosition", 0);
        setField(term36625, term36625.getClass(), "jsType", null);
        setField(term36625, term36625.getClass(), "parent", null);
        setField(term36620, term36620.getClass(), "last", term36625);
        setField(term36620, term36620.getClass(), "propListHead", null);
        setIntField(term36620, term36620.getClass(), "sourcePosition", 0);
        setField(term36620, term36620.getClass(), "jsType", null);
        setField(term36620, term36620.getClass(), "parent", null);
        setField(term36606, term36606.getClass(), "first", term36620);
        setField(term36606, term36606.getClass(), "last", term36610);
        setField(term36606, term36606.getClass(), "propListHead", null);
        setIntField(term36606, term36606.getClass(), "sourcePosition", 0);
        setField(term36606, term36606.getClass(), "jsType", null);
        setField(term36606, term36606.getClass(), "parent", null);
        setField(term36605, term36605.getClass(), "parameters", term36606);
        setField(term36605, term36605.getClass(), "returnType", null);
        setBooleanField(term36605, term36605.getClass(), "returnTypeInferred", false);
        setBooleanField(term36605, term36605.getClass(), "resolved", false);
        setField(term36605, term36605.getClass(), "resolveResult", null);
        setBooleanField(term36605, term36605.getClass(), "inTemplatedCheckVisit", false);
        setField(term36605, term36605.getClass(), "registry", null);
        setField(term36604, term36604.getClass(), "call", term36605);
        setField(term36633, term36633.getClass(), "name", null);
        setField(term36633, term36633.getClass(), "type", null);
        setBooleanField(term36633, term36633.getClass(), "inferred", false);
        setField(term36633, term36633.getClass(), "propertyNode", null);
        setField(term36633, term36633.getClass(), "docInfo", null);
        setField(term36604, term36604.getClass(), "prototypeSlot", term36633);
        setField(term36604, term36604.getClass(), "kind", enum339);
        setField(term36604, term36604.getClass(), "propAccess", enum340);
        setField(term36604, term36604.getClass(), "typeOfThis", null);
        setField(term36604, term36604.getClass(), "source", null);
        setField(term36604, term36604.getClass(), "implementedInterfaces", null);
        setField(term36604, term36604.getClass(), "extendedInterfaces", null);
        setField(term36604, term36604.getClass(), "subTypes", null);
        setField(term36604, term36604.getClass(), "templateTypeNames", null);
        setField(term36604, term36604.getClass(), "className", null);
        setField(term36604, term36604.getClass(), "properties", null);
        setBooleanField(term36604, term36604.getClass(), "nativeType", false);
        setField(term36604, term36604.getClass(), "implicitPrototypeFallback", null);
        setField(term36604, term36604.getClass(), "ownerFunction", null);
        setBooleanField(term36604, term36604.getClass(), "prettyPrint", false);
        setBooleanField(term36604, term36604.getClass(), "visited", false);
        setField(term36604, term36604.getClass(), "docInfo", null);
        setBooleanField(term36604, term36604.getClass(), "unknown", false);
        setBooleanField(term36604, term36604.getClass(), "resolved", false);
        setField(term36604, term36604.getClass(), "resolveResult", null);
        setBooleanField(term36604, term36604.getClass(), "inTemplatedCheckVisit", false);
        setField(term36604, term36604.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "isSubtype", argTypes, term36604, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


