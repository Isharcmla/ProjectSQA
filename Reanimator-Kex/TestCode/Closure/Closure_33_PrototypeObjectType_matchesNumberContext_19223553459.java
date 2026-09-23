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

public class PrototypeObjectType_matchesNumberContext_19223553459 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1829;
     Object term6982;

    public PrototypeObjectType_matchesNumberContext_19223553459() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term1842 = new HashMap();
        term1829 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term1854 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term1862 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term1829, term1829.getClass(), "className", "RbVQXSpxXy");
        setField(term1829, term1829.getClass(), "properties", term1842);
        setBooleanField(term1829, term1829.getClass(), "nativeType", true);
        setField(term1829, term1829.getClass(), "implicitPrototypeFallback", null);
        setField(term1854, term1854.getClass(), "call", null);
        setField(term1854, term1854.getClass(), "prototypeSlot", null);
        setField(term1854, term1854.getClass(), "kind", null);
        setField(term1854, term1854.getClass(), "typeOfThis", null);
        setField(term1854, term1854.getClass(), "source", null);
        setField(term1854, term1854.getClass(), "implementedInterfaces", null);
        setField(term1854, term1854.getClass(), "extendedInterfaces", null);
        setField(term1854, term1854.getClass(), "subTypes", null);
        setField(term1854, term1854.getClass(), "templateTypeName", null);
        setField(term1854, term1854.getClass(), "className", null);
        setField(term1854, term1854.getClass(), "properties", null);
        setBooleanField(term1854, term1854.getClass(), "nativeType", false);
        setField(term1854, term1854.getClass(), "implicitPrototypeFallback", null);
        setField(term1854, term1854.getClass(), "ownerFunction", null);
        setBooleanField(term1854, term1854.getClass(), "prettyPrint", false);
        setBooleanField(term1854, term1854.getClass(), "visited", false);
        setField(term1854, term1854.getClass(), "docInfo", null);
        setBooleanField(term1854, term1854.getClass(), "unknown", false);
        setBooleanField(term1854, term1854.getClass(), "resolved", false);
        setField(term1854, term1854.getClass(), "resolveResult", null);
        setField(term1854, term1854.getClass(), "registry", null);
        setField(term1829, term1829.getClass(), "ownerFunction", term1854);
        setBooleanField(term1829, term1829.getClass(), "prettyPrint", false);
        setBooleanField(term1829, term1829.getClass(), "visited", false);
        setField(term1862, term1862.getClass(), "info", null);
        setField(term1862, term1862.getClass(), "documentation", null);
        setField(term1862, term1862.getClass(), "associatedNode", null);
        setField(term1862, term1862.getClass(), "visibility", null);
        setIntField(term1862, term1862.getClass(), "bitset", 0);
        setField(term1862, term1862.getClass(), "type", null);
        setField(term1862, term1862.getClass(), "thisType", null);
        setBooleanField(term1862, term1862.getClass(), "includeDocumentation", false);
        setField(term1829, term1829.getClass(), "docInfo", term1862);
        setBooleanField(term1829, term1829.getClass(), "unknown", false);
        setBooleanField(term1829, term1829.getClass(), "resolved", true);
        setField(term1829, term1829.getClass(), "resolveResult", null);
        setField(term1829, term1829.getClass(), "registry", null);
        HashMap term6985 = new HashMap();
        term6982 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term6986 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        Object term6987 = newInstance(Class.forName("com.google.javascript.rhino.JSDocInfo"));
        setField(term6982, term6982.getClass(), "className", "RbVQXSpxXy");
        setField(term6982, term6982.getClass(), "properties", term6985);
        setBooleanField(term6982, term6982.getClass(), "nativeType", true);
        setField(term6982, term6982.getClass(), "implicitPrototypeFallback", null);
        setField(term6986, term6986.getClass(), "call", null);
        setField(term6986, term6986.getClass(), "prototypeSlot", null);
        setField(term6986, term6986.getClass(), "kind", null);
        setField(term6986, term6986.getClass(), "typeOfThis", null);
        setField(term6986, term6986.getClass(), "source", null);
        setField(term6986, term6986.getClass(), "implementedInterfaces", null);
        setField(term6986, term6986.getClass(), "extendedInterfaces", null);
        setField(term6986, term6986.getClass(), "subTypes", null);
        setField(term6986, term6986.getClass(), "templateTypeName", null);
        setField(term6986, term6986.getClass(), "className", null);
        setField(term6986, term6986.getClass(), "properties", null);
        setBooleanField(term6986, term6986.getClass(), "nativeType", false);
        setField(term6986, term6986.getClass(), "implicitPrototypeFallback", null);
        setField(term6986, term6986.getClass(), "ownerFunction", null);
        setBooleanField(term6986, term6986.getClass(), "prettyPrint", false);
        setBooleanField(term6986, term6986.getClass(), "visited", false);
        setField(term6986, term6986.getClass(), "docInfo", null);
        setBooleanField(term6986, term6986.getClass(), "unknown", false);
        setBooleanField(term6986, term6986.getClass(), "resolved", false);
        setField(term6986, term6986.getClass(), "resolveResult", null);
        setField(term6986, term6986.getClass(), "registry", null);
        setField(term6982, term6982.getClass(), "ownerFunction", term6986);
        setBooleanField(term6982, term6982.getClass(), "prettyPrint", false);
        setBooleanField(term6982, term6982.getClass(), "visited", false);
        setField(term6987, term6987.getClass(), "info", null);
        setField(term6987, term6987.getClass(), "documentation", null);
        setField(term6987, term6987.getClass(), "associatedNode", null);
        setField(term6987, term6987.getClass(), "visibility", null);
        setIntField(term6987, term6987.getClass(), "bitset", 0);
        setField(term6987, term6987.getClass(), "type", null);
        setField(term6987, term6987.getClass(), "thisType", null);
        setBooleanField(term6987, term6987.getClass(), "includeDocumentation", false);
        setField(term6982, term6982.getClass(), "docInfo", term6987);
        setBooleanField(term6982, term6982.getClass(), "unknown", false);
        setBooleanField(term6982, term6982.getClass(), "resolved", true);
        setField(term6982, term6982.getClass(), "resolveResult", null);
        setField(term6982, term6982.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "matchesNumberContext", argTypes, term1829, args);
        assertTrue(recursiveEquals(term1829, term6982));
        assertTrue(recursiveEquals(retValue, false));
    }

};


