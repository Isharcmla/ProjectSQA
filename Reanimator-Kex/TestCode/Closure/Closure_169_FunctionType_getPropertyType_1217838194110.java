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

public class FunctionType_getPropertyType_1217838194110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23703;

    public FunctionType_getPropertyType_1217838194110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term93454 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term93453 = ((Class) term93454).getDeclaredField((String) "CONSTRUCTOR");
        ((Field) term93453).setAccessible(true);
        Object enum266 = ((Field) term93453).get((Object) null);
        Class<? extends Object> term93754 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$PropAccess");
        Field term93753 = ((Class) term93754).getDeclaredField((String) "STRUCT");
        ((Field) term93753).setAccessible(true);
        Object enum267 = ((Field) term93753).get((Object) null);
        term23703 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term23704 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term23705 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23709 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23712 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23715 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23719 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23724 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term23732 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ObjectType$Property"));
        setIntField(term23705, term23705.getClass(), "type", 1242676024);
        setIntField(term23707, term23707.getClass(), "type", -1865023308);
        setIntField(term23709, term23709.getClass(), "type", 1698510819);
        setField(term23709, term23709.getClass(), "next", null);
        setField(term23709, term23709.getClass(), "first", null);
        setField(term23709, term23709.getClass(), "last", null);
        setField(term23709, term23709.getClass(), "propListHead", null);
        setIntField(term23709, term23709.getClass(), "sourcePosition", 0);
        setField(term23709, term23709.getClass(), "jsType", null);
        setField(term23709, term23709.getClass(), "parent", null);
        setField(term23707, term23707.getClass(), "next", term23709);
        setIntField(term23712, term23712.getClass(), "type", 0);
        setField(term23712, term23712.getClass(), "next", null);
        setField(term23712, term23712.getClass(), "first", null);
        setField(term23712, term23712.getClass(), "last", null);
        setField(term23712, term23712.getClass(), "propListHead", null);
        setIntField(term23712, term23712.getClass(), "sourcePosition", 0);
        setField(term23712, term23712.getClass(), "jsType", null);
        setField(term23712, term23712.getClass(), "parent", null);
        setField(term23707, term23707.getClass(), "first", term23712);
        setIntField(term23715, term23715.getClass(), "type", 1559605714);
        setField(term23715, term23715.getClass(), "next", null);
        setField(term23715, term23715.getClass(), "first", term23712);
        setField(term23715, term23715.getClass(), "last", term23715);
        setField(term23715, term23715.getClass(), "propListHead", null);
        setIntField(term23715, term23715.getClass(), "sourcePosition", 0);
        setField(term23715, term23715.getClass(), "jsType", null);
        setField(term23715, term23715.getClass(), "parent", null);
        setField(term23707, term23707.getClass(), "last", term23715);
        setField(term23707, term23707.getClass(), "propListHead", null);
        setIntField(term23707, term23707.getClass(), "sourcePosition", 0);
        setField(term23707, term23707.getClass(), "jsType", null);
        setField(term23707, term23707.getClass(), "parent", null);
        setField(term23705, term23705.getClass(), "next", term23707);
        setIntField(term23719, term23719.getClass(), "type", 794568325);
        setIntField(term23721, term23721.getClass(), "type", -434468428);
        setField(term23721, term23721.getClass(), "next", term23715);
        setField(term23721, term23721.getClass(), "first", null);
        setField(term23721, term23721.getClass(), "last", term23705);
        setField(term23721, term23721.getClass(), "propListHead", null);
        setIntField(term23721, term23721.getClass(), "sourcePosition", 0);
        setField(term23721, term23721.getClass(), "jsType", null);
        setField(term23721, term23721.getClass(), "parent", null);
        setField(term23719, term23719.getClass(), "next", term23721);
        setField(term23719, term23719.getClass(), "first", term23719);
        setIntField(term23724, term23724.getClass(), "type", -1553893255);
        setField(term23724, term23724.getClass(), "next", null);
        setField(term23724, term23724.getClass(), "first", term23712);
        setField(term23724, term23724.getClass(), "last", term23715);
        setField(term23724, term23724.getClass(), "propListHead", null);
        setIntField(term23724, term23724.getClass(), "sourcePosition", 0);
        setField(term23724, term23724.getClass(), "jsType", null);
        setField(term23724, term23724.getClass(), "parent", null);
        setField(term23719, term23719.getClass(), "last", term23724);
        setField(term23719, term23719.getClass(), "propListHead", null);
        setIntField(term23719, term23719.getClass(), "sourcePosition", 0);
        setField(term23719, term23719.getClass(), "jsType", null);
        setField(term23719, term23719.getClass(), "parent", null);
        setField(term23705, term23705.getClass(), "first", term23719);
        setField(term23705, term23705.getClass(), "last", term23709);
        setField(term23705, term23705.getClass(), "propListHead", null);
        setIntField(term23705, term23705.getClass(), "sourcePosition", 0);
        setField(term23705, term23705.getClass(), "jsType", null);
        setField(term23705, term23705.getClass(), "parent", null);
        setField(term23704, term23704.getClass(), "parameters", term23705);
        setField(term23704, term23704.getClass(), "returnType", null);
        setBooleanField(term23704, term23704.getClass(), "returnTypeInferred", false);
        setBooleanField(term23704, term23704.getClass(), "resolved", false);
        setField(term23704, term23704.getClass(), "resolveResult", null);
        setBooleanField(term23704, term23704.getClass(), "inTemplatedCheckVisit", false);
        setField(term23704, term23704.getClass(), "registry", null);
        setField(term23703, term23703.getClass(), "call", term23704);
        setField(term23732, term23732.getClass(), "name", null);
        setField(term23732, term23732.getClass(), "type", null);
        setBooleanField(term23732, term23732.getClass(), "inferred", false);
        setField(term23732, term23732.getClass(), "propertyNode", null);
        setField(term23732, term23732.getClass(), "docInfo", null);
        setField(term23703, term23703.getClass(), "prototypeSlot", term23732);
        setField(term23703, term23703.getClass(), "kind", enum266);
        setField(term23703, term23703.getClass(), "propAccess", enum267);
        setField(term23703, term23703.getClass(), "typeOfThis", null);
        setField(term23703, term23703.getClass(), "source", null);
        setField(term23703, term23703.getClass(), "implementedInterfaces", null);
        setField(term23703, term23703.getClass(), "extendedInterfaces", null);
        setField(term23703, term23703.getClass(), "subTypes", null);
        setField(term23703, term23703.getClass(), "templateTypeNames", null);
        setField(term23703, term23703.getClass(), "className", null);
        setField(term23703, term23703.getClass(), "properties", null);
        setBooleanField(term23703, term23703.getClass(), "nativeType", false);
        setField(term23703, term23703.getClass(), "implicitPrototypeFallback", null);
        setField(term23703, term23703.getClass(), "ownerFunction", null);
        setBooleanField(term23703, term23703.getClass(), "prettyPrint", false);
        setBooleanField(term23703, term23703.getClass(), "visited", false);
        setField(term23703, term23703.getClass(), "docInfo", null);
        setBooleanField(term23703, term23703.getClass(), "unknown", false);
        setBooleanField(term23703, term23703.getClass(), "resolved", false);
        setField(term23703, term23703.getClass(), "resolveResult", null);
        setBooleanField(term23703, term23703.getClass(), "inTemplatedCheckVisit", false);
        setField(term23703, term23703.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZfdXfCCFDf";
        try {
            callMethod(klass, "getPropertyType", argTypes, term23703, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


