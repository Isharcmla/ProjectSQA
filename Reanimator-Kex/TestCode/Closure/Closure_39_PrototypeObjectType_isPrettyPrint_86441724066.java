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

public class PrototypeObjectType_isPrettyPrint_86441724066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2239;
     Object term8011;

    public PrototypeObjectType_isPrettyPrint_86441724066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term2252 = new HashMap();
        term2239 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term2264 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term2272 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term2239, term2239.getClass(), "className", "FwPbDZcHmB");
        setField(term2239, term2239.getClass(), "properties", term2252);
        setBooleanField(term2239, term2239.getClass(), "nativeType", false);
        setField(term2239, term2239.getClass(), "implicitPrototypeFallback", null);
        setField(term2264, term2264.getClass(), "call", null);
        setField(term2264, term2264.getClass(), "prototypeSlot", null);
        setField(term2264, term2264.getClass(), "kind", null);
        setField(term2264, term2264.getClass(), "typeOfThis", null);
        setField(term2264, term2264.getClass(), "source", null);
        setField(term2264, term2264.getClass(), "implementedInterfaces", null);
        setField(term2264, term2264.getClass(), "extendedInterfaces", null);
        setField(term2264, term2264.getClass(), "subTypes", null);
        setField(term2264, term2264.getClass(), "templateTypeName", null);
        setField(term2264, term2264.getClass(), "className", null);
        setField(term2264, term2264.getClass(), "properties", null);
        setBooleanField(term2264, term2264.getClass(), "nativeType", false);
        setField(term2264, term2264.getClass(), "implicitPrototypeFallback", null);
        setField(term2264, term2264.getClass(), "ownerFunction", null);
        setBooleanField(term2264, term2264.getClass(), "prettyPrint", false);
        setBooleanField(term2264, term2264.getClass(), "visited", false);
        setField(term2264, term2264.getClass(), "docInfo", null);
        setBooleanField(term2264, term2264.getClass(), "unknown", false);
        setBooleanField(term2264, term2264.getClass(), "resolved", false);
        setField(term2264, term2264.getClass(), "resolveResult", null);
        setField(term2264, term2264.getClass(), "registry", null);
        setField(term2239, term2239.getClass(), "ownerFunction", term2264);
        setBooleanField(term2239, term2239.getClass(), "prettyPrint", false);
        setBooleanField(term2239, term2239.getClass(), "visited", true);
        setField(term2272, term2272.getClass(), "info", null);
        setField(term2272, term2272.getClass(), "documentation", null);
        setField(term2272, term2272.getClass(), "associatedNode", null);
        setField(term2272, term2272.getClass(), "visibility", null);
        setIntField(term2272, term2272.getClass(), "bitset", 0);
        setField(term2272, term2272.getClass(), "type", null);
        setField(term2272, term2272.getClass(), "thisType", null);
        setBooleanField(term2272, term2272.getClass(), "includeDocumentation", false);
        setField(term2239, term2239.getClass(), "docInfo", term2272);
        setBooleanField(term2239, term2239.getClass(), "unknown", true);
        setBooleanField(term2239, term2239.getClass(), "resolved", false);
        setField(term2239, term2239.getClass(), "resolveResult", null);
        setField(term2239, term2239.getClass(), "registry", null);
        HashMap term8014 = new HashMap();
        term8011 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term8015 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term8016 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term8011, term8011.getClass(), "className", "FwPbDZcHmB");
        setField(term8011, term8011.getClass(), "properties", term8014);
        setBooleanField(term8011, term8011.getClass(), "nativeType", false);
        setField(term8011, term8011.getClass(), "implicitPrototypeFallback", null);
        setField(term8015, term8015.getClass(), "call", null);
        setField(term8015, term8015.getClass(), "prototypeSlot", null);
        setField(term8015, term8015.getClass(), "kind", null);
        setField(term8015, term8015.getClass(), "typeOfThis", null);
        setField(term8015, term8015.getClass(), "source", null);
        setField(term8015, term8015.getClass(), "implementedInterfaces", null);
        setField(term8015, term8015.getClass(), "extendedInterfaces", null);
        setField(term8015, term8015.getClass(), "subTypes", null);
        setField(term8015, term8015.getClass(), "templateTypeName", null);
        setField(term8015, term8015.getClass(), "className", null);
        setField(term8015, term8015.getClass(), "properties", null);
        setBooleanField(term8015, term8015.getClass(), "nativeType", false);
        setField(term8015, term8015.getClass(), "implicitPrototypeFallback", null);
        setField(term8015, term8015.getClass(), "ownerFunction", null);
        setBooleanField(term8015, term8015.getClass(), "prettyPrint", false);
        setBooleanField(term8015, term8015.getClass(), "visited", false);
        setField(term8015, term8015.getClass(), "docInfo", null);
        setBooleanField(term8015, term8015.getClass(), "unknown", false);
        setBooleanField(term8015, term8015.getClass(), "resolved", false);
        setField(term8015, term8015.getClass(), "resolveResult", null);
        setField(term8015, term8015.getClass(), "registry", null);
        setField(term8011, term8011.getClass(), "ownerFunction", term8015);
        setBooleanField(term8011, term8011.getClass(), "prettyPrint", false);
        setBooleanField(term8011, term8011.getClass(), "visited", true);
        setField(term8016, term8016.getClass(), "info", null);
        setField(term8016, term8016.getClass(), "documentation", null);
        setField(term8016, term8016.getClass(), "associatedNode", null);
        setField(term8016, term8016.getClass(), "visibility", null);
        setIntField(term8016, term8016.getClass(), "bitset", 0);
        setField(term8016, term8016.getClass(), "type", null);
        setField(term8016, term8016.getClass(), "thisType", null);
        setBooleanField(term8016, term8016.getClass(), "includeDocumentation", false);
        setField(term8011, term8011.getClass(), "docInfo", term8016);
        setBooleanField(term8011, term8011.getClass(), "unknown", true);
        setBooleanField(term8011, term8011.getClass(), "resolved", false);
        setField(term8011, term8011.getClass(), "resolveResult", null);
        setField(term8011, term8011.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isPrettyPrint", argTypes, term2239, args);
        assertTrue(recursiveEquals(term2239, term8011));
    }

};


