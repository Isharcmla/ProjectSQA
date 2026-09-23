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

public class NamedType_finishPropertyContinuations_167806891293 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91722;
     Object term143728;

    public NamedType_finishPropertyContinuations_167806891293() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term91722 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term91822 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term91928 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setBooleanField(term91822, term91822.getClass(), "unknown", true);
        setField(term91822, term91822.getClass(), "implicitPrototypeFallback", term91928);
        setField(term91722, term91722.getClass(), "referencedObjType", term91822);
        term143728 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term143729 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term143730 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term143728, term143728.getClass(), "reference", null);
        setField(term143728, term143728.getClass(), "sourceName", null);
        setIntField(term143728, term143728.getClass(), "lineno", 0);
        setIntField(term143728, term143728.getClass(), "charno", 0);
        setField(term143728, term143728.getClass(), "validator", null);
        setField(term143728, term143728.getClass(), "propertyContinuations", null);
        setField(term143728, term143728.getClass(), "referencedType", null);
        setField(term143729, term143729.getClass(), "call", null);
        setField(term143729, term143729.getClass(), "prototypeSlot", null);
        setField(term143729, term143729.getClass(), "kind", null);
        setField(term143729, term143729.getClass(), "propAccess", null);
        setField(term143729, term143729.getClass(), "typeOfThis", null);
        setField(term143729, term143729.getClass(), "source", null);
        setField(term143729, term143729.getClass(), "implementedInterfaces", null);
        setField(term143729, term143729.getClass(), "extendedInterfaces", null);
        setField(term143729, term143729.getClass(), "subTypes", null);
        setField(term143729, term143729.getClass(), "className", null);
        setField(term143729, term143729.getClass(), "properties", null);
        setBooleanField(term143729, term143729.getClass(), "nativeType", false);
        setField(term143730, term143730.getClass(), "primitiveType", null);
        setField(term143730, term143730.getClass(), "primitiveObjectType", null);
        setField(term143730, term143730.getClass(), "name", null);
        setBooleanField(term143730, term143730.getClass(), "visited", false);
        setField(term143730, term143730.getClass(), "docInfo", null);
        setBooleanField(term143730, term143730.getClass(), "unknown", false);
        setBooleanField(term143730, term143730.getClass(), "resolved", false);
        setField(term143730, term143730.getClass(), "resolveResult", null);
        setField(term143730, term143730.getClass(), "templateKeys", null);
        setField(term143730, term143730.getClass(), "templatizedTypes", null);
        setBooleanField(term143730, term143730.getClass(), "inTemplatedCheckVisit", false);
        setField(term143730, term143730.getClass(), "registry", null);
        setField(term143729, term143729.getClass(), "implicitPrototypeFallback", term143730);
        setField(term143729, term143729.getClass(), "ownerFunction", null);
        setBooleanField(term143729, term143729.getClass(), "prettyPrint", false);
        setBooleanField(term143729, term143729.getClass(), "visited", false);
        setField(term143729, term143729.getClass(), "docInfo", null);
        setBooleanField(term143729, term143729.getClass(), "unknown", false);
        setBooleanField(term143729, term143729.getClass(), "resolved", false);
        setField(term143729, term143729.getClass(), "resolveResult", null);
        setField(term143729, term143729.getClass(), "templateKeys", null);
        setField(term143729, term143729.getClass(), "templatizedTypes", null);
        setBooleanField(term143729, term143729.getClass(), "inTemplatedCheckVisit", false);
        setField(term143729, term143729.getClass(), "registry", null);
        setField(term143728, term143728.getClass(), "referencedObjType", term143729);
        setBooleanField(term143728, term143728.getClass(), "visited", false);
        setField(term143728, term143728.getClass(), "docInfo", null);
        setBooleanField(term143728, term143728.getClass(), "unknown", false);
        setBooleanField(term143728, term143728.getClass(), "resolved", false);
        setField(term143728, term143728.getClass(), "resolveResult", null);
        setField(term143728, term143728.getClass(), "templateKeys", null);
        setField(term143728, term143728.getClass(), "templatizedTypes", null);
        setBooleanField(term143728, term143728.getClass(), "inTemplatedCheckVisit", false);
        setField(term143728, term143728.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "finishPropertyContinuations", argTypes, term91722, args);
        assertTrue(recursiveEquals(term91722, term143728));
    }

};


