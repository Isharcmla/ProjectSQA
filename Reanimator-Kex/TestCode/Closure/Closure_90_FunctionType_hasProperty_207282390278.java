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

public class FunctionType_hasProperty_207282390278 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9841;

    public FunctionType_hasProperty_207282390278() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38839 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term38838 = ((Class) term38839).getDeclaredField((String) "ORDINARY");
        ((Field) term38838).setAccessible(true);
        Object enum102 = ((Field) term38838).get((Object) null);
        term9841 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term9842 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term9843 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9845 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9847 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9850 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9853 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9856 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9860 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9863 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term9866 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term9872 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term9843, term9843.getClass(), "type", 1743683601);
        setIntField(term9845, term9845.getClass(), "type", -936895502);
        setIntField(term9847, term9847.getClass(), "type", 0);
        setField(term9847, term9847.getClass(), "next", null);
        setField(term9847, term9847.getClass(), "first", null);
        setField(term9847, term9847.getClass(), "last", null);
        setField(term9847, term9847.getClass(), "propListHead", null);
        setIntField(term9847, term9847.getClass(), "sourcePosition", 0);
        setField(term9847, term9847.getClass(), "jsType", null);
        setField(term9847, term9847.getClass(), "parent", null);
        setField(term9845, term9845.getClass(), "next", term9847);
        setIntField(term9850, term9850.getClass(), "type", 0);
        setField(term9850, term9850.getClass(), "next", null);
        setField(term9850, term9850.getClass(), "first", null);
        setField(term9850, term9850.getClass(), "last", null);
        setField(term9850, term9850.getClass(), "propListHead", null);
        setIntField(term9850, term9850.getClass(), "sourcePosition", 0);
        setField(term9850, term9850.getClass(), "jsType", null);
        setField(term9850, term9850.getClass(), "parent", null);
        setField(term9845, term9845.getClass(), "first", term9850);
        setIntField(term9853, term9853.getClass(), "type", 0);
        setField(term9853, term9853.getClass(), "next", null);
        setField(term9853, term9853.getClass(), "first", null);
        setField(term9853, term9853.getClass(), "last", null);
        setField(term9853, term9853.getClass(), "propListHead", null);
        setIntField(term9853, term9853.getClass(), "sourcePosition", 0);
        setField(term9853, term9853.getClass(), "jsType", null);
        setField(term9853, term9853.getClass(), "parent", null);
        setField(term9845, term9845.getClass(), "last", term9853);
        setField(term9856, term9856.getClass(), "next", null);
        setIntField(term9856, term9856.getClass(), "type", 0);
        setIntField(term9856, term9856.getClass(), "intValue", 0);
        setField(term9856, term9856.getClass(), "objectValue", null);
        setField(term9845, term9845.getClass(), "propListHead", term9856);
        setIntField(term9845, term9845.getClass(), "sourcePosition", -129547140);
        setField(term9845, term9845.getClass(), "jsType", null);
        setField(term9845, term9845.getClass(), "parent", null);
        setField(term9843, term9843.getClass(), "next", term9845);
        setIntField(term9860, term9860.getClass(), "type", 0);
        setField(term9860, term9860.getClass(), "next", null);
        setField(term9860, term9860.getClass(), "first", null);
        setField(term9860, term9860.getClass(), "last", null);
        setField(term9860, term9860.getClass(), "propListHead", null);
        setIntField(term9860, term9860.getClass(), "sourcePosition", 0);
        setField(term9860, term9860.getClass(), "jsType", null);
        setField(term9860, term9860.getClass(), "parent", null);
        setField(term9843, term9843.getClass(), "first", term9860);
        setIntField(term9863, term9863.getClass(), "type", 0);
        setField(term9863, term9863.getClass(), "next", null);
        setField(term9863, term9863.getClass(), "first", null);
        setField(term9863, term9863.getClass(), "last", null);
        setField(term9863, term9863.getClass(), "propListHead", null);
        setIntField(term9863, term9863.getClass(), "sourcePosition", 0);
        setField(term9863, term9863.getClass(), "jsType", null);
        setField(term9863, term9863.getClass(), "parent", null);
        setField(term9843, term9843.getClass(), "last", term9863);
        setField(term9866, term9866.getClass(), "next", null);
        setIntField(term9866, term9866.getClass(), "type", 0);
        setIntField(term9866, term9866.getClass(), "intValue", 0);
        setField(term9866, term9866.getClass(), "objectValue", null);
        setField(term9843, term9843.getClass(), "propListHead", term9866);
        setIntField(term9843, term9843.getClass(), "sourcePosition", 199287428);
        setField(term9843, term9843.getClass(), "jsType", null);
        setField(term9843, term9843.getClass(), "parent", null);
        setField(term9842, term9842.getClass(), "parameters", term9843);
        setField(term9842, term9842.getClass(), "returnType", null);
        setBooleanField(term9842, term9842.getClass(), "returnTypeInferred", false);
        setBooleanField(term9842, term9842.getClass(), "resolved", false);
        setField(term9842, term9842.getClass(), "resolveResult", null);
        setField(term9842, term9842.getClass(), "registry", null);
        setField(term9841, term9841.getClass(), "call", term9842);
        setField(term9872, term9872.getClass(), "ownerFunction", null);
        setField(term9872, term9872.getClass(), "className", null);
        setField(term9872, term9872.getClass(), "properties", null);
        setBooleanField(term9872, term9872.getClass(), "nativeType", false);
        setField(term9872, term9872.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term9872, term9872.getClass(), "prettyPrint", false);
        setBooleanField(term9872, term9872.getClass(), "visited", false);
        setField(term9872, term9872.getClass(), "docInfo", null);
        setBooleanField(term9872, term9872.getClass(), "unknown", false);
        setBooleanField(term9872, term9872.getClass(), "resolved", false);
        setField(term9872, term9872.getClass(), "resolveResult", null);
        setField(term9872, term9872.getClass(), "registry", null);
        setField(term9841, term9841.getClass(), "prototype", term9872);
        setField(term9841, term9841.getClass(), "kind", enum102);
        setField(term9841, term9841.getClass(), "typeOfThis", null);
        setField(term9841, term9841.getClass(), "source", null);
        setField(term9841, term9841.getClass(), "implementedInterfaces", null);
        setField(term9841, term9841.getClass(), "subTypes", null);
        setField(term9841, term9841.getClass(), "templateTypeName", null);
        setField(term9841, term9841.getClass(), "className", null);
        setField(term9841, term9841.getClass(), "properties", null);
        setBooleanField(term9841, term9841.getClass(), "nativeType", false);
        setField(term9841, term9841.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term9841, term9841.getClass(), "prettyPrint", false);
        setBooleanField(term9841, term9841.getClass(), "visited", false);
        setField(term9841, term9841.getClass(), "docInfo", null);
        setBooleanField(term9841, term9841.getClass(), "unknown", false);
        setBooleanField(term9841, term9841.getClass(), "resolved", false);
        setField(term9841, term9841.getClass(), "resolveResult", null);
        setField(term9841, term9841.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "fztQhjqwdP";
        try {
            callMethod(klass, "hasProperty", argTypes, term9841, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


