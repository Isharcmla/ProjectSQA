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
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;

public class FunctionType_setPrototype_192348490882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6736;
     Object term6786;

    public FunctionType_setPrototype_192348490882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34743 = Class.forName((String) "com.google.javascript.rhino.jstype.FunctionType$Kind");
        Field term34742 = ((Class) term34743).getDeclaredField((String) "ORDINARY");
        ((Field) term34742).setAccessible(true);
        Object enum91 = ((Field) term34742).get((Object) null);
        term6736 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term6737 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ArrowType"));
        Object term6738 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6740 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6742 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6745 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6748 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6752 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6755 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term6761 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term6767 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setIntField(term6738, term6738.getClass(), "type", -1410220680);
        setIntField(term6740, term6740.getClass(), "type", -1667990367);
        setIntField(term6742, term6742.getClass(), "type", 0);
        setField(term6742, term6742.getClass(), "next", null);
        setField(term6742, term6742.getClass(), "first", null);
        setField(term6742, term6742.getClass(), "last", null);
        setField(term6742, term6742.getClass(), "propListHead", null);
        setIntField(term6742, term6742.getClass(), "sourcePosition", 0);
        setField(term6742, term6742.getClass(), "jsType", null);
        setField(term6742, term6742.getClass(), "parent", null);
        setField(term6740, term6740.getClass(), "next", term6742);
        setIntField(term6745, term6745.getClass(), "type", 0);
        setField(term6745, term6745.getClass(), "next", null);
        setField(term6745, term6745.getClass(), "first", null);
        setField(term6745, term6745.getClass(), "last", null);
        setField(term6745, term6745.getClass(), "propListHead", null);
        setIntField(term6745, term6745.getClass(), "sourcePosition", 0);
        setField(term6745, term6745.getClass(), "jsType", null);
        setField(term6745, term6745.getClass(), "parent", null);
        setField(term6740, term6740.getClass(), "first", term6745);
        setIntField(term6748, term6748.getClass(), "type", 0);
        setField(term6748, term6748.getClass(), "next", null);
        setField(term6748, term6748.getClass(), "first", null);
        setField(term6748, term6748.getClass(), "last", null);
        setField(term6748, term6748.getClass(), "propListHead", null);
        setIntField(term6748, term6748.getClass(), "sourcePosition", 0);
        setField(term6748, term6748.getClass(), "jsType", null);
        setField(term6748, term6748.getClass(), "parent", null);
        setField(term6740, term6740.getClass(), "last", term6748);
        setField(term6740, term6740.getClass(), "propListHead", null);
        setIntField(term6740, term6740.getClass(), "sourcePosition", 0);
        setField(term6740, term6740.getClass(), "jsType", null);
        setField(term6740, term6740.getClass(), "parent", null);
        setField(term6738, term6738.getClass(), "next", term6740);
        setIntField(term6752, term6752.getClass(), "type", 0);
        setField(term6752, term6752.getClass(), "next", null);
        setField(term6752, term6752.getClass(), "first", null);
        setField(term6752, term6752.getClass(), "last", null);
        setField(term6752, term6752.getClass(), "propListHead", null);
        setIntField(term6752, term6752.getClass(), "sourcePosition", 0);
        setField(term6752, term6752.getClass(), "jsType", null);
        setField(term6752, term6752.getClass(), "parent", null);
        setField(term6738, term6738.getClass(), "first", term6752);
        setIntField(term6755, term6755.getClass(), "type", 0);
        setField(term6755, term6755.getClass(), "next", null);
        setField(term6755, term6755.getClass(), "first", null);
        setField(term6755, term6755.getClass(), "last", null);
        setField(term6755, term6755.getClass(), "propListHead", null);
        setIntField(term6755, term6755.getClass(), "sourcePosition", 0);
        setField(term6755, term6755.getClass(), "jsType", null);
        setField(term6755, term6755.getClass(), "parent", null);
        setField(term6738, term6738.getClass(), "last", term6755);
        setField(term6738, term6738.getClass(), "propListHead", null);
        setIntField(term6738, term6738.getClass(), "sourcePosition", 0);
        setField(term6738, term6738.getClass(), "jsType", null);
        setField(term6738, term6738.getClass(), "parent", null);
        setField(term6737, term6737.getClass(), "parameters", term6738);
        setField(term6737, term6737.getClass(), "returnType", null);
        setBooleanField(term6737, term6737.getClass(), "returnTypeInferred", false);
        setBooleanField(term6737, term6737.getClass(), "resolved", false);
        setField(term6737, term6737.getClass(), "resolveResult", null);
        setField(term6737, term6737.getClass(), "registry", null);
        setField(term6736, term6736.getClass(), "call", term6737);
        setField(term6761, term6761.getClass(), "className", null);
        setField(term6761, term6761.getClass(), "properties", null);
        setBooleanField(term6761, term6761.getClass(), "nativeType", false);
        setField(term6761, term6761.getClass(), "implicitPrototypeFallback", null);
        setField(term6761, term6761.getClass(), "ownerFunction", null);
        setBooleanField(term6761, term6761.getClass(), "prettyPrint", false);
        setBooleanField(term6761, term6761.getClass(), "visited", false);
        setField(term6761, term6761.getClass(), "docInfo", null);
        setBooleanField(term6761, term6761.getClass(), "unknown", false);
        setBooleanField(term6761, term6761.getClass(), "resolved", false);
        setField(term6761, term6761.getClass(), "resolveResult", null);
        setField(term6761, term6761.getClass(), "registry", null);
        setField(term6736, term6736.getClass(), "prototype", term6761);
        setField(term6767, term6767.getClass(), "name", null);
        setField(term6767, term6767.getClass(), "type", null);
        setBooleanField(term6767, term6767.getClass(), "inferred", false);
        setField(term6736, term6736.getClass(), "prototypeSlot", term6767);
        setField(term6736, term6736.getClass(), "kind", enum91);
        setField(term6736, term6736.getClass(), "typeOfThis", null);
        setField(term6736, term6736.getClass(), "source", null);
        setField(term6736, term6736.getClass(), "implementedInterfaces", null);
        setField(term6736, term6736.getClass(), "extendedInterfaces", null);
        setField(term6736, term6736.getClass(), "subTypes", null);
        setField(term6736, term6736.getClass(), "templateTypeName", null);
        setField(term6736, term6736.getClass(), "className", null);
        setField(term6736, term6736.getClass(), "properties", null);
        setBooleanField(term6736, term6736.getClass(), "nativeType", false);
        setField(term6736, term6736.getClass(), "implicitPrototypeFallback", null);
        setField(term6736, term6736.getClass(), "ownerFunction", null);
        setBooleanField(term6736, term6736.getClass(), "prettyPrint", false);
        setBooleanField(term6736, term6736.getClass(), "visited", false);
        setField(term6736, term6736.getClass(), "docInfo", null);
        setBooleanField(term6736, term6736.getClass(), "unknown", false);
        setBooleanField(term6736, term6736.getClass(), "resolved", false);
        setField(term6736, term6736.getClass(), "resolveResult", null);
        setField(term6736, term6736.getClass(), "registry", null);
        HashMap term6799 = new HashMap();
        term6786 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term6811 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term6819 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term6786, term6786.getClass(), "className", "MwwjNtdOFT");
        setField(term6786, term6786.getClass(), "properties", term6799);
        setBooleanField(term6786, term6786.getClass(), "nativeType", true);
        setField(term6786, term6786.getClass(), "implicitPrototypeFallback", null);
        setField(term6811, term6811.getClass(), "call", null);
        setField(term6811, term6811.getClass(), "prototype", null);
        setField(term6811, term6811.getClass(), "prototypeSlot", null);
        setField(term6811, term6811.getClass(), "kind", null);
        setField(term6811, term6811.getClass(), "typeOfThis", null);
        setField(term6811, term6811.getClass(), "source", null);
        setField(term6811, term6811.getClass(), "implementedInterfaces", null);
        setField(term6811, term6811.getClass(), "extendedInterfaces", null);
        setField(term6811, term6811.getClass(), "subTypes", null);
        setField(term6811, term6811.getClass(), "templateTypeName", null);
        setField(term6811, term6811.getClass(), "className", null);
        setField(term6811, term6811.getClass(), "properties", null);
        setBooleanField(term6811, term6811.getClass(), "nativeType", false);
        setField(term6811, term6811.getClass(), "implicitPrototypeFallback", null);
        setField(term6811, term6811.getClass(), "ownerFunction", null);
        setBooleanField(term6811, term6811.getClass(), "prettyPrint", false);
        setBooleanField(term6811, term6811.getClass(), "visited", false);
        setField(term6811, term6811.getClass(), "docInfo", null);
        setBooleanField(term6811, term6811.getClass(), "unknown", false);
        setBooleanField(term6811, term6811.getClass(), "resolved", false);
        setField(term6811, term6811.getClass(), "resolveResult", null);
        setField(term6811, term6811.getClass(), "registry", null);
        setField(term6786, term6786.getClass(), "ownerFunction", term6811);
        setBooleanField(term6786, term6786.getClass(), "prettyPrint", true);
        setBooleanField(term6786, term6786.getClass(), "visited", true);
        setField(term6819, term6819.getClass(), "info", null);
        setField(term6819, term6819.getClass(), "documentation", null);
        setField(term6819, term6819.getClass(), "associatedNode", null);
        setField(term6819, term6819.getClass(), "visibility", null);
        setIntField(term6819, term6819.getClass(), "bitset", 0);
        setField(term6819, term6819.getClass(), "type", null);
        setField(term6819, term6819.getClass(), "thisType", null);
        setBooleanField(term6819, term6819.getClass(), "includeDocumentation", false);
        setField(term6786, term6786.getClass(), "docInfo", term6819);
        setBooleanField(term6786, term6786.getClass(), "unknown", true);
        setBooleanField(term6786, term6786.getClass(), "resolved", false);
        setField(term6786, term6786.getClass(), "resolveResult", null);
        setField(term6786, term6786.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Object[] args = new Object[1];
        args[0] = term6786;
        try {
            callMethod(klass, "setPrototype", argTypes, term6736, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


