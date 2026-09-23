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

public class FunctionType_getLeastSupertype_41885088683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11757;

    public FunctionType_getLeastSupertype_41885088683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41998 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term41997 = ((Class) term41998).getDeclaredField((String) "ORDINARY");
        ((Field) term41997).setAccessible(true);
        Object enum108 = ((Field) term41997).get((Object) null);
        term11757 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term11758 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term11759 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11761 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11763 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11766 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11769 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11772 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11776 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11779 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11782 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11788 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term11759, term11759.getClass(), "type", -1694747156);
        setIntField(term11761, term11761.getClass(), "type", 954660603);
        setIntField(term11763, term11763.getClass(), "type", 0);
        setField(term11763, term11763.getClass(), "next", null);
        setField(term11763, term11763.getClass(), "first", null);
        setField(term11763, term11763.getClass(), "last", null);
        setField(term11763, term11763.getClass(), "propListHead", null);
        setIntField(term11763, term11763.getClass(), "sourcePosition", 0);
        setField(term11763, term11763.getClass(), "jsType", null);
        setField(term11763, term11763.getClass(), "parent", null);
        setField(term11761, term11761.getClass(), "next", term11763);
        setIntField(term11766, term11766.getClass(), "type", 0);
        setField(term11766, term11766.getClass(), "next", null);
        setField(term11766, term11766.getClass(), "first", null);
        setField(term11766, term11766.getClass(), "last", null);
        setField(term11766, term11766.getClass(), "propListHead", null);
        setIntField(term11766, term11766.getClass(), "sourcePosition", 0);
        setField(term11766, term11766.getClass(), "jsType", null);
        setField(term11766, term11766.getClass(), "parent", null);
        setField(term11761, term11761.getClass(), "first", term11766);
        setIntField(term11769, term11769.getClass(), "type", 0);
        setField(term11769, term11769.getClass(), "next", null);
        setField(term11769, term11769.getClass(), "first", null);
        setField(term11769, term11769.getClass(), "last", null);
        setField(term11769, term11769.getClass(), "propListHead", null);
        setIntField(term11769, term11769.getClass(), "sourcePosition", 0);
        setField(term11769, term11769.getClass(), "jsType", null);
        setField(term11769, term11769.getClass(), "parent", null);
        setField(term11761, term11761.getClass(), "last", term11769);
        setField(term11772, term11772.getClass(), "next", null);
        setIntField(term11772, term11772.getClass(), "type", 0);
        setIntField(term11772, term11772.getClass(), "intValue", 0);
        setField(term11772, term11772.getClass(), "objectValue", null);
        setField(term11761, term11761.getClass(), "propListHead", term11772);
        setIntField(term11761, term11761.getClass(), "sourcePosition", -1351605385);
        setField(term11761, term11761.getClass(), "jsType", null);
        setField(term11761, term11761.getClass(), "parent", null);
        setField(term11759, term11759.getClass(), "next", term11761);
        setIntField(term11776, term11776.getClass(), "type", 0);
        setField(term11776, term11776.getClass(), "next", null);
        setField(term11776, term11776.getClass(), "first", null);
        setField(term11776, term11776.getClass(), "last", null);
        setField(term11776, term11776.getClass(), "propListHead", null);
        setIntField(term11776, term11776.getClass(), "sourcePosition", 0);
        setField(term11776, term11776.getClass(), "jsType", null);
        setField(term11776, term11776.getClass(), "parent", null);
        setField(term11759, term11759.getClass(), "first", term11776);
        setIntField(term11779, term11779.getClass(), "type", 0);
        setField(term11779, term11779.getClass(), "next", null);
        setField(term11779, term11779.getClass(), "first", null);
        setField(term11779, term11779.getClass(), "last", null);
        setField(term11779, term11779.getClass(), "propListHead", null);
        setIntField(term11779, term11779.getClass(), "sourcePosition", 0);
        setField(term11779, term11779.getClass(), "jsType", null);
        setField(term11779, term11779.getClass(), "parent", null);
        setField(term11759, term11759.getClass(), "last", term11779);
        setField(term11782, term11782.getClass(), "next", null);
        setIntField(term11782, term11782.getClass(), "type", 0);
        setIntField(term11782, term11782.getClass(), "intValue", 0);
        setField(term11782, term11782.getClass(), "objectValue", null);
        setField(term11759, term11759.getClass(), "propListHead", term11782);
        setIntField(term11759, term11759.getClass(), "sourcePosition", 278355793);
        setField(term11759, term11759.getClass(), "jsType", null);
        setField(term11759, term11759.getClass(), "parent", null);
        setField(term11758, term11758.getClass(), "parameters", term11759);
        setField(term11758, term11758.getClass(), "returnType", null);
        setBooleanField(term11758, term11758.getClass(), "returnTypeInferred", false);
        setBooleanField(term11758, term11758.getClass(), "resolved", false);
        setField(term11758, term11758.getClass(), "resolveResult", null);
        setField(term11758, term11758.getClass(), "registry", null);
        setField(term11757, term11757.getClass(), "call", term11758);
        setField(term11788, term11788.getClass(), "ownerFunction", null);
        setField(term11788, term11788.getClass(), "className", null);
        setField(term11788, term11788.getClass(), "properties", null);
        setField(term11788, term11788.getClass(), "implicitPrototype", null);
        setBooleanField(term11788, term11788.getClass(), "nativeType", false);
        setBooleanField(term11788, term11788.getClass(), "prettyPrint", false);
        setBooleanField(term11788, term11788.getClass(), "visited", false);
        setField(term11788, term11788.getClass(), "docInfo", null);
        setBooleanField(term11788, term11788.getClass(), "unknown", false);
        setBooleanField(term11788, term11788.getClass(), "resolved", false);
        setField(term11788, term11788.getClass(), "resolveResult", null);
        setField(term11788, term11788.getClass(), "registry", null);
        setField(term11757, term11757.getClass(), "prototype", term11788);
        setField(term11757, term11757.getClass(), "kind", enum108);
        setField(term11757, term11757.getClass(), "typeOfThis", null);
        setField(term11757, term11757.getClass(), "source", null);
        setField(term11757, term11757.getClass(), "implementedInterfaces", null);
        setField(term11757, term11757.getClass(), "subTypes", null);
        setField(term11757, term11757.getClass(), "templateTypeName", null);
        setField(term11757, term11757.getClass(), "className", null);
        setField(term11757, term11757.getClass(), "properties", null);
        setField(term11757, term11757.getClass(), "implicitPrototype", null);
        setBooleanField(term11757, term11757.getClass(), "nativeType", false);
        setBooleanField(term11757, term11757.getClass(), "prettyPrint", false);
        setBooleanField(term11757, term11757.getClass(), "visited", false);
        setField(term11757, term11757.getClass(), "docInfo", null);
        setBooleanField(term11757, term11757.getClass(), "unknown", false);
        setBooleanField(term11757, term11757.getClass(), "resolved", false);
        setField(term11757, term11757.getClass(), "resolveResult", null);
        setField(term11757, term11757.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "getLeastSupertype", argTypes, term11757, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


