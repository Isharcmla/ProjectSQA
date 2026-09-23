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

public class PrototypeObjectType_unboxesTo_2571505661 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1995;
     Object term7677;

    public PrototypeObjectType_unboxesTo_2571505661() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2008 = new HashMap();
        term1995 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2020 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2028 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term1995, term1995.getClass(), "className", "DhjNLmRMCu");
        setField(term1995, term1995.getClass(), "properties", term2008);
        setBooleanField(term1995, term1995.getClass(), "nativeType", true);
        setField(term1995, term1995.getClass(), "implicitPrototypeFallback", null);
        setField(term2020, term2020.getClass(), "call", null);
        setField(term2020, term2020.getClass(), "prototypeSlot", null);
        setField(term2020, term2020.getClass(), "kind", null);
        setField(term2020, term2020.getClass(), "typeOfThis", null);
        setField(term2020, term2020.getClass(), "source", null);
        setField(term2020, term2020.getClass(), "implementedInterfaces", null);
        setField(term2020, term2020.getClass(), "extendedInterfaces", null);
        setField(term2020, term2020.getClass(), "subTypes", null);
        setField(term2020, term2020.getClass(), "templateTypeName", null);
        setField(term2020, term2020.getClass(), "className", null);
        setField(term2020, term2020.getClass(), "properties", null);
        setBooleanField(term2020, term2020.getClass(), "nativeType", false);
        setField(term2020, term2020.getClass(), "implicitPrototypeFallback", null);
        setField(term2020, term2020.getClass(), "ownerFunction", null);
        setBooleanField(term2020, term2020.getClass(), "prettyPrint", false);
        setBooleanField(term2020, term2020.getClass(), "visited", false);
        setField(term2020, term2020.getClass(), "docInfo", null);
        setBooleanField(term2020, term2020.getClass(), "unknown", false);
        setBooleanField(term2020, term2020.getClass(), "resolved", false);
        setField(term2020, term2020.getClass(), "resolveResult", null);
        setField(term2020, term2020.getClass(), "registry", null);
        setField(term1995, term1995.getClass(), "ownerFunction", term2020);
        setBooleanField(term1995, term1995.getClass(), "prettyPrint", false);
        setBooleanField(term1995, term1995.getClass(), "visited", false);
        setField(term2028, term2028.getClass(), "info", null);
        setField(term2028, term2028.getClass(), "documentation", null);
        setField(term2028, term2028.getClass(), "associatedNode", null);
        setField(term2028, term2028.getClass(), "visibility", null);
        setIntField(term2028, term2028.getClass(), "bitset", 0);
        setField(term2028, term2028.getClass(), "type", null);
        setField(term2028, term2028.getClass(), "thisType", null);
        setBooleanField(term2028, term2028.getClass(), "includeDocumentation", false);
        setField(term1995, term1995.getClass(), "docInfo", term2028);
        setBooleanField(term1995, term1995.getClass(), "unknown", true);
        setBooleanField(term1995, term1995.getClass(), "resolved", false);
        setField(term1995, term1995.getClass(), "resolveResult", null);
        setField(term1995, term1995.getClass(), "registry", null);
        HashMap term7680 = new HashMap();
        term7677 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term7681 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term7682 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term7677, term7677.getClass(), "className", "DhjNLmRMCu");
        setField(term7677, term7677.getClass(), "properties", term7680);
        setBooleanField(term7677, term7677.getClass(), "nativeType", true);
        setField(term7677, term7677.getClass(), "implicitPrototypeFallback", null);
        setField(term7681, term7681.getClass(), "call", null);
        setField(term7681, term7681.getClass(), "prototypeSlot", null);
        setField(term7681, term7681.getClass(), "kind", null);
        setField(term7681, term7681.getClass(), "typeOfThis", null);
        setField(term7681, term7681.getClass(), "source", null);
        setField(term7681, term7681.getClass(), "implementedInterfaces", null);
        setField(term7681, term7681.getClass(), "extendedInterfaces", null);
        setField(term7681, term7681.getClass(), "subTypes", null);
        setField(term7681, term7681.getClass(), "templateTypeName", null);
        setField(term7681, term7681.getClass(), "className", null);
        setField(term7681, term7681.getClass(), "properties", null);
        setBooleanField(term7681, term7681.getClass(), "nativeType", false);
        setField(term7681, term7681.getClass(), "implicitPrototypeFallback", null);
        setField(term7681, term7681.getClass(), "ownerFunction", null);
        setBooleanField(term7681, term7681.getClass(), "prettyPrint", false);
        setBooleanField(term7681, term7681.getClass(), "visited", false);
        setField(term7681, term7681.getClass(), "docInfo", null);
        setBooleanField(term7681, term7681.getClass(), "unknown", false);
        setBooleanField(term7681, term7681.getClass(), "resolved", false);
        setField(term7681, term7681.getClass(), "resolveResult", null);
        setField(term7681, term7681.getClass(), "registry", null);
        setField(term7677, term7677.getClass(), "ownerFunction", term7681);
        setBooleanField(term7677, term7677.getClass(), "prettyPrint", false);
        setBooleanField(term7677, term7677.getClass(), "visited", false);
        setField(term7682, term7682.getClass(), "info", null);
        setField(term7682, term7682.getClass(), "documentation", null);
        setField(term7682, term7682.getClass(), "associatedNode", null);
        setField(term7682, term7682.getClass(), "visibility", null);
        setIntField(term7682, term7682.getClass(), "bitset", 0);
        setField(term7682, term7682.getClass(), "type", null);
        setField(term7682, term7682.getClass(), "thisType", null);
        setBooleanField(term7682, term7682.getClass(), "includeDocumentation", false);
        setField(term7677, term7677.getClass(), "docInfo", term7682);
        setBooleanField(term7677, term7677.getClass(), "unknown", true);
        setBooleanField(term7677, term7677.getClass(), "resolved", false);
        setField(term7677, term7677.getClass(), "resolveResult", null);
        setField(term7677, term7677.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "unboxesTo", argTypes, term1995, args);
        assertTrue(recursiveEquals(term1995, term7677));
        assertTrue(recursiveEquals(retValue, null));
    }

};


