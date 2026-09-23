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

public class PrototypeObjectType_matchesNumberContext_19223553460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1837;
     Object term7138;

    public PrototypeObjectType_matchesNumberContext_19223553460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1850 = new HashMap();
        term1837 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term1862 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1871 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term1837, term1837.getClass(), "className", "jXzmYyrnnT");
        setField(term1837, term1837.getClass(), "properties", term1850);
        setBooleanField(term1837, term1837.getClass(), "nativeType", true);
        setField(term1837, term1837.getClass(), "implicitPrototypeFallback", null);
        setField(term1862, term1862.getClass(), "call", null);
        setField(term1862, term1862.getClass(), "prototypeSlot", null);
        setField(term1862, term1862.getClass(), "kind", null);
        setField(term1862, term1862.getClass(), "typeOfThis", null);
        setField(term1862, term1862.getClass(), "source", null);
        setField(term1862, term1862.getClass(), "implementedInterfaces", null);
        setField(term1862, term1862.getClass(), "extendedInterfaces", null);
        setField(term1862, term1862.getClass(), "subTypes", null);
        setField(term1862, term1862.getClass(), "templateTypeNames", null);
        setField(term1862, term1862.getClass(), "className", null);
        setField(term1862, term1862.getClass(), "properties", null);
        setBooleanField(term1862, term1862.getClass(), "nativeType", false);
        setField(term1862, term1862.getClass(), "implicitPrototypeFallback", null);
        setField(term1862, term1862.getClass(), "ownerFunction", null);
        setBooleanField(term1862, term1862.getClass(), "prettyPrint", false);
        setBooleanField(term1862, term1862.getClass(), "visited", false);
        setField(term1862, term1862.getClass(), "docInfo", null);
        setBooleanField(term1862, term1862.getClass(), "unknown", false);
        setBooleanField(term1862, term1862.getClass(), "resolved", false);
        setField(term1862, term1862.getClass(), "resolveResult", null);
        setBooleanField(term1862, term1862.getClass(), "inTemplatedCheckVisit", false);
        setField(term1862, term1862.getClass(), "registry", null);
        setField(term1837, term1837.getClass(), "ownerFunction", term1862);
        setBooleanField(term1837, term1837.getClass(), "prettyPrint", false);
        setBooleanField(term1837, term1837.getClass(), "visited", false);
        setField(term1871, term1871.getClass(), "info", null);
        setField(term1871, term1871.getClass(), "documentation", null);
        setField(term1871, term1871.getClass(), "associatedNode", null);
        setField(term1871, term1871.getClass(), "visibility", null);
        setIntField(term1871, term1871.getClass(), "bitset", 0);
        setField(term1871, term1871.getClass(), "type", null);
        setField(term1871, term1871.getClass(), "thisType", null);
        setBooleanField(term1871, term1871.getClass(), "includeDocumentation", false);
        setField(term1837, term1837.getClass(), "docInfo", term1871);
        setBooleanField(term1837, term1837.getClass(), "unknown", false);
        setBooleanField(term1837, term1837.getClass(), "resolved", true);
        setField(term1837, term1837.getClass(), "resolveResult", null);
        setBooleanField(term1837, term1837.getClass(), "inTemplatedCheckVisit", false);
        setField(term1837, term1837.getClass(), "registry", null);
        HashMap term7141 = new HashMap();
        term7138 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term7142 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term7143 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term7138, term7138.getClass(), "className", "jXzmYyrnnT");
        setField(term7138, term7138.getClass(), "properties", term7141);
        setBooleanField(term7138, term7138.getClass(), "nativeType", true);
        setField(term7138, term7138.getClass(), "implicitPrototypeFallback", null);
        setField(term7142, term7142.getClass(), "call", null);
        setField(term7142, term7142.getClass(), "prototypeSlot", null);
        setField(term7142, term7142.getClass(), "kind", null);
        setField(term7142, term7142.getClass(), "typeOfThis", null);
        setField(term7142, term7142.getClass(), "source", null);
        setField(term7142, term7142.getClass(), "implementedInterfaces", null);
        setField(term7142, term7142.getClass(), "extendedInterfaces", null);
        setField(term7142, term7142.getClass(), "subTypes", null);
        setField(term7142, term7142.getClass(), "templateTypeNames", null);
        setField(term7142, term7142.getClass(), "className", null);
        setField(term7142, term7142.getClass(), "properties", null);
        setBooleanField(term7142, term7142.getClass(), "nativeType", false);
        setField(term7142, term7142.getClass(), "implicitPrototypeFallback", null);
        setField(term7142, term7142.getClass(), "ownerFunction", null);
        setBooleanField(term7142, term7142.getClass(), "prettyPrint", false);
        setBooleanField(term7142, term7142.getClass(), "visited", false);
        setField(term7142, term7142.getClass(), "docInfo", null);
        setBooleanField(term7142, term7142.getClass(), "unknown", false);
        setBooleanField(term7142, term7142.getClass(), "resolved", false);
        setField(term7142, term7142.getClass(), "resolveResult", null);
        setBooleanField(term7142, term7142.getClass(), "inTemplatedCheckVisit", false);
        setField(term7142, term7142.getClass(), "registry", null);
        setField(term7138, term7138.getClass(), "ownerFunction", term7142);
        setBooleanField(term7138, term7138.getClass(), "prettyPrint", false);
        setBooleanField(term7138, term7138.getClass(), "visited", false);
        setField(term7143, term7143.getClass(), "info", null);
        setField(term7143, term7143.getClass(), "documentation", null);
        setField(term7143, term7143.getClass(), "associatedNode", null);
        setField(term7143, term7143.getClass(), "visibility", null);
        setIntField(term7143, term7143.getClass(), "bitset", 0);
        setField(term7143, term7143.getClass(), "type", null);
        setField(term7143, term7143.getClass(), "thisType", null);
        setBooleanField(term7143, term7143.getClass(), "includeDocumentation", false);
        setField(term7138, term7138.getClass(), "docInfo", term7143);
        setBooleanField(term7138, term7138.getClass(), "unknown", false);
        setBooleanField(term7138, term7138.getClass(), "resolved", true);
        setField(term7138, term7138.getClass(), "resolveResult", null);
        setBooleanField(term7138, term7138.getClass(), "inTemplatedCheckVisit", false);
        setField(term7138, term7138.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesNumberContext", argTypes, term1837, args);
        assertTrue(recursiveEquals(term1837, term7138));
        assertTrue(recursiveEquals(retValue, false));
    }

};


