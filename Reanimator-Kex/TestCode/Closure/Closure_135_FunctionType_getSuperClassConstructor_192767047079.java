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
import java.lang.IllegalArgumentException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class FunctionType_getSuperClassConstructor_192767047079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11684;

    public FunctionType_getSuperClassConstructor_192767047079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term40682 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term40681 = ((Class) term40682).getDeclaredField((String) "ORDINARY");
        ((Field) term40681).setAccessible(true);
        Object enum100 = ((Field) term40681).get((Object) null);
        term11684 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term11685 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term11686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11688 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11693 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11696 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11699 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11703 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11706 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term11709 = newInstance(Class.forName("com.google.javascript.rhino.Node$PropListItem"));
        Object term11714 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setIntField(term11686, term11686.getClass(), "type", -1553893255);
        setIntField(term11688, term11688.getClass(), "type", 1559605714);
        setIntField(term11690, term11690.getClass(), "type", 0);
        setField(term11690, term11690.getClass(), "next", null);
        setField(term11690, term11690.getClass(), "first", null);
        setField(term11690, term11690.getClass(), "last", null);
        setField(term11690, term11690.getClass(), "propListHead", null);
        setIntField(term11690, term11690.getClass(), "sourcePosition", 0);
        setField(term11690, term11690.getClass(), "jsType", null);
        setField(term11690, term11690.getClass(), "parent", null);
        setField(term11688, term11688.getClass(), "next", term11690);
        setIntField(term11693, term11693.getClass(), "type", 0);
        setField(term11693, term11693.getClass(), "next", null);
        setField(term11693, term11693.getClass(), "first", null);
        setField(term11693, term11693.getClass(), "last", null);
        setField(term11693, term11693.getClass(), "propListHead", null);
        setIntField(term11693, term11693.getClass(), "sourcePosition", 0);
        setField(term11693, term11693.getClass(), "jsType", null);
        setField(term11693, term11693.getClass(), "parent", null);
        setField(term11688, term11688.getClass(), "first", term11693);
        setIntField(term11696, term11696.getClass(), "type", 0);
        setField(term11696, term11696.getClass(), "next", null);
        setField(term11696, term11696.getClass(), "first", null);
        setField(term11696, term11696.getClass(), "last", null);
        setField(term11696, term11696.getClass(), "propListHead", null);
        setIntField(term11696, term11696.getClass(), "sourcePosition", 0);
        setField(term11696, term11696.getClass(), "jsType", null);
        setField(term11696, term11696.getClass(), "parent", null);
        setField(term11688, term11688.getClass(), "last", term11696);
        setField(term11699, term11699.getClass(), "next", null);
        setIntField(term11699, term11699.getClass(), "type", 0);
        setIntField(term11699, term11699.getClass(), "intValue", 0);
        setField(term11699, term11699.getClass(), "objectValue", null);
        setField(term11688, term11688.getClass(), "propListHead", term11699);
        setIntField(term11688, term11688.getClass(), "sourcePosition", 1146601902);
        setField(term11688, term11688.getClass(), "jsType", null);
        setField(term11688, term11688.getClass(), "parent", null);
        setField(term11686, term11686.getClass(), "next", term11688);
        setIntField(term11703, term11703.getClass(), "type", 0);
        setField(term11703, term11703.getClass(), "next", null);
        setField(term11703, term11703.getClass(), "first", null);
        setField(term11703, term11703.getClass(), "last", null);
        setField(term11703, term11703.getClass(), "propListHead", null);
        setIntField(term11703, term11703.getClass(), "sourcePosition", 0);
        setField(term11703, term11703.getClass(), "jsType", null);
        setField(term11703, term11703.getClass(), "parent", null);
        setField(term11686, term11686.getClass(), "first", term11703);
        setIntField(term11706, term11706.getClass(), "type", 0);
        setField(term11706, term11706.getClass(), "next", null);
        setField(term11706, term11706.getClass(), "first", null);
        setField(term11706, term11706.getClass(), "last", null);
        setField(term11706, term11706.getClass(), "propListHead", null);
        setIntField(term11706, term11706.getClass(), "sourcePosition", 0);
        setField(term11706, term11706.getClass(), "jsType", null);
        setField(term11706, term11706.getClass(), "parent", null);
        setField(term11686, term11686.getClass(), "last", term11706);
        setField(term11709, term11709.getClass(), "next", null);
        setIntField(term11709, term11709.getClass(), "type", 0);
        setIntField(term11709, term11709.getClass(), "intValue", 0);
        setField(term11709, term11709.getClass(), "objectValue", null);
        setField(term11686, term11686.getClass(), "propListHead", term11709);
        setIntField(term11686, term11686.getClass(), "sourcePosition", -1938881385);
        setField(term11686, term11686.getClass(), "jsType", null);
        setField(term11686, term11686.getClass(), "parent", null);
        setField(term11685, term11685.getClass(), "parameters", term11686);
        setField(term11685, term11685.getClass(), "returnType", null);
        setBooleanField(term11685, term11685.getClass(), "resolved", false);
        setField(term11685, term11685.getClass(), "resolveResult", null);
        setField(term11685, term11685.getClass(), "registry", null);
        setField(term11684, term11684.getClass(), "call", term11685);
        setField(term11714, term11714.getClass(), "ownerFunction", null);
        setField(term11714, term11714.getClass(), "className", null);
        setField(term11714, term11714.getClass(), "properties", null);
        setField(term11714, term11714.getClass(), "implicitPrototype", null);
        setBooleanField(term11714, term11714.getClass(), "nativeType", false);
        setBooleanField(term11714, term11714.getClass(), "visited", false);
        setField(term11714, term11714.getClass(), "docInfo", null);
        setBooleanField(term11714, term11714.getClass(), "unknown", false);
        setBooleanField(term11714, term11714.getClass(), "resolved", false);
        setField(term11714, term11714.getClass(), "resolveResult", null);
        setField(term11714, term11714.getClass(), "registry", null);
        setField(term11684, term11684.getClass(), "prototype", term11714);
        setField(term11684, term11684.getClass(), "kind", enum100);
        setField(term11684, term11684.getClass(), "typeOfThis", null);
        setField(term11684, term11684.getClass(), "source", null);
        setField(term11684, term11684.getClass(), "implementedInterfaces", null);
        setField(term11684, term11684.getClass(), "subTypes", null);
        setField(term11684, term11684.getClass(), "templateTypeName", null);
        setField(term11684, term11684.getClass(), "className", null);
        setField(term11684, term11684.getClass(), "properties", null);
        setField(term11684, term11684.getClass(), "implicitPrototype", null);
        setBooleanField(term11684, term11684.getClass(), "nativeType", false);
        setBooleanField(term11684, term11684.getClass(), "visited", false);
        setField(term11684, term11684.getClass(), "docInfo", null);
        setBooleanField(term11684, term11684.getClass(), "unknown", false);
        setBooleanField(term11684, term11684.getClass(), "resolved", false);
        setField(term11684, term11684.getClass(), "resolveResult", null);
        setField(term11684, term11684.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getSuperClassConstructor", argTypes, term11684, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


