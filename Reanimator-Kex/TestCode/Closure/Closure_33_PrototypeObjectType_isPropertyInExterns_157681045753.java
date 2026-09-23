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
import java.util.HashMap;
import java.lang.Object;

public class PrototypeObjectType_isPropertyInExterns_157681045753 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term795;
     Object term6408;

    public PrototypeObjectType_isPropertyInExterns_157681045753() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term808 = new HashMap();
        term795 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term820 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term828 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term795, term795.getClass(), "className", "OJJtVNPyKZ");
        setField(term795, term795.getClass(), "properties", term808);
        setBooleanField(term795, term795.getClass(), "nativeType", false);
        setField(term795, term795.getClass(), "implicitPrototypeFallback", null);
        setField(term820, term820.getClass(), "call", null);
        setField(term820, term820.getClass(), "prototypeSlot", null);
        setField(term820, term820.getClass(), "kind", null);
        setField(term820, term820.getClass(), "typeOfThis", null);
        setField(term820, term820.getClass(), "source", null);
        setField(term820, term820.getClass(), "implementedInterfaces", null);
        setField(term820, term820.getClass(), "extendedInterfaces", null);
        setField(term820, term820.getClass(), "subTypes", null);
        setField(term820, term820.getClass(), "templateTypeName", null);
        setField(term820, term820.getClass(), "className", null);
        setField(term820, term820.getClass(), "properties", null);
        setBooleanField(term820, term820.getClass(), "nativeType", false);
        setField(term820, term820.getClass(), "implicitPrototypeFallback", null);
        setField(term820, term820.getClass(), "ownerFunction", null);
        setBooleanField(term820, term820.getClass(), "prettyPrint", false);
        setBooleanField(term820, term820.getClass(), "visited", false);
        setField(term820, term820.getClass(), "docInfo", null);
        setBooleanField(term820, term820.getClass(), "unknown", false);
        setBooleanField(term820, term820.getClass(), "resolved", false);
        setField(term820, term820.getClass(), "resolveResult", null);
        setField(term820, term820.getClass(), "registry", null);
        setField(term795, term795.getClass(), "ownerFunction", term820);
        setBooleanField(term795, term795.getClass(), "prettyPrint", false);
        setBooleanField(term795, term795.getClass(), "visited", true);
        setField(term828, term828.getClass(), "info", null);
        setField(term828, term828.getClass(), "documentation", null);
        setField(term828, term828.getClass(), "associatedNode", null);
        setField(term828, term828.getClass(), "visibility", null);
        setIntField(term828, term828.getClass(), "bitset", 0);
        setField(term828, term828.getClass(), "type", null);
        setField(term828, term828.getClass(), "thisType", null);
        setBooleanField(term828, term828.getClass(), "includeDocumentation", false);
        setField(term795, term795.getClass(), "docInfo", term828);
        setBooleanField(term795, term795.getClass(), "unknown", false);
        setBooleanField(term795, term795.getClass(), "resolved", false);
        setField(term795, term795.getClass(), "resolveResult", null);
        setField(term795, term795.getClass(), "registry", null);
        HashMap term6411 = new HashMap();
        term6408 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term6412 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term6413 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term6408, term6408.getClass(), "className", "OJJtVNPyKZ");
        setField(term6408, term6408.getClass(), "properties", term6411);
        setBooleanField(term6408, term6408.getClass(), "nativeType", false);
        setField(term6408, term6408.getClass(), "implicitPrototypeFallback", null);
        setField(term6412, term6412.getClass(), "call", null);
        setField(term6412, term6412.getClass(), "prototypeSlot", null);
        setField(term6412, term6412.getClass(), "kind", null);
        setField(term6412, term6412.getClass(), "typeOfThis", null);
        setField(term6412, term6412.getClass(), "source", null);
        setField(term6412, term6412.getClass(), "implementedInterfaces", null);
        setField(term6412, term6412.getClass(), "extendedInterfaces", null);
        setField(term6412, term6412.getClass(), "subTypes", null);
        setField(term6412, term6412.getClass(), "templateTypeName", null);
        setField(term6412, term6412.getClass(), "className", null);
        setField(term6412, term6412.getClass(), "properties", null);
        setBooleanField(term6412, term6412.getClass(), "nativeType", false);
        setField(term6412, term6412.getClass(), "implicitPrototypeFallback", null);
        setField(term6412, term6412.getClass(), "ownerFunction", null);
        setBooleanField(term6412, term6412.getClass(), "prettyPrint", false);
        setBooleanField(term6412, term6412.getClass(), "visited", false);
        setField(term6412, term6412.getClass(), "docInfo", null);
        setBooleanField(term6412, term6412.getClass(), "unknown", false);
        setBooleanField(term6412, term6412.getClass(), "resolved", false);
        setField(term6412, term6412.getClass(), "resolveResult", null);
        setField(term6412, term6412.getClass(), "registry", null);
        setField(term6408, term6408.getClass(), "ownerFunction", term6412);
        setBooleanField(term6408, term6408.getClass(), "prettyPrint", false);
        setBooleanField(term6408, term6408.getClass(), "visited", true);
        setField(term6413, term6413.getClass(), "info", null);
        setField(term6413, term6413.getClass(), "documentation", null);
        setField(term6413, term6413.getClass(), "associatedNode", null);
        setField(term6413, term6413.getClass(), "visibility", null);
        setIntField(term6413, term6413.getClass(), "bitset", 0);
        setField(term6413, term6413.getClass(), "type", null);
        setField(term6413, term6413.getClass(), "thisType", null);
        setBooleanField(term6413, term6413.getClass(), "includeDocumentation", false);
        setField(term6408, term6408.getClass(), "docInfo", term6413);
        setBooleanField(term6408, term6408.getClass(), "unknown", false);
        setBooleanField(term6408, term6408.getClass(), "resolved", false);
        setField(term6408, term6408.getClass(), "resolveResult", null);
        setField(term6408, term6408.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EYtfuJaxiM";
        callMethod(klass, "isPropertyInExterns", argTypes, term795, args);
        assertTrue(recursiveEquals(term795, term6408));
    }

};


