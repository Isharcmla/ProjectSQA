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

public class RecordType_isEquivalentTo_948167372195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64038;
     Object term64136;
     Object term65192;
     Object term65193;

    public RecordType_isEquivalentTo_948167372195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64038 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term64136 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term64234 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term64322 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term64234, term64234.getClass(), "referencedType", term64322);
        setField(term64136, term64136.getClass(), "referencedType", term64234);
        term65192 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term65192, term65192.getClass(), "properties", null);
        setBooleanField(term65192, term65192.getClass(), "isFrozen", false);
        setField(term65192, term65192.getClass(), "className", null);
        setField(term65192, term65192.getClass(), "properties", null);
        setBooleanField(term65192, term65192.getClass(), "nativeType", false);
        setField(term65192, term65192.getClass(), "implicitPrototypeFallback", null);
        setField(term65192, term65192.getClass(), "ownerFunction", null);
        setBooleanField(term65192, term65192.getClass(), "prettyPrint", false);
        setBooleanField(term65192, term65192.getClass(), "visited", false);
        setField(term65192, term65192.getClass(), "docInfo", null);
        setBooleanField(term65192, term65192.getClass(), "unknown", false);
        setBooleanField(term65192, term65192.getClass(), "resolved", false);
        setField(term65192, term65192.getClass(), "resolveResult", null);
        setField(term65192, term65192.getClass(), "registry", null);
        term65193 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term65194 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term65195 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NoType"));
        setField(term65193, term65193.getClass(), "indexType", null);
        setField(term65194, term65194.getClass(), "indexType", null);
        setField(term65195, term65195.getClass(), "call", null);
        setField(term65195, term65195.getClass(), "prototypeSlot", null);
        setField(term65195, term65195.getClass(), "kind", null);
        setField(term65195, term65195.getClass(), "typeOfThis", null);
        setField(term65195, term65195.getClass(), "source", null);
        setField(term65195, term65195.getClass(), "implementedInterfaces", null);
        setField(term65195, term65195.getClass(), "extendedInterfaces", null);
        setField(term65195, term65195.getClass(), "subTypes", null);
        setField(term65195, term65195.getClass(), "templateTypeName", null);
        setField(term65195, term65195.getClass(), "className", null);
        setField(term65195, term65195.getClass(), "properties", null);
        setBooleanField(term65195, term65195.getClass(), "nativeType", false);
        setField(term65195, term65195.getClass(), "implicitPrototypeFallback", null);
        setField(term65195, term65195.getClass(), "ownerFunction", null);
        setBooleanField(term65195, term65195.getClass(), "prettyPrint", false);
        setBooleanField(term65195, term65195.getClass(), "visited", false);
        setField(term65195, term65195.getClass(), "docInfo", null);
        setBooleanField(term65195, term65195.getClass(), "unknown", false);
        setBooleanField(term65195, term65195.getClass(), "resolved", false);
        setField(term65195, term65195.getClass(), "resolveResult", null);
        setField(term65195, term65195.getClass(), "registry", null);
        setField(term65194, term65194.getClass(), "referencedType", term65195);
        setField(term65194, term65194.getClass(), "referencedObjType", null);
        setBooleanField(term65194, term65194.getClass(), "visited", false);
        setField(term65194, term65194.getClass(), "docInfo", null);
        setBooleanField(term65194, term65194.getClass(), "unknown", false);
        setBooleanField(term65194, term65194.getClass(), "resolved", false);
        setField(term65194, term65194.getClass(), "resolveResult", null);
        setField(term65194, term65194.getClass(), "registry", null);
        setField(term65193, term65193.getClass(), "referencedType", term65194);
        setField(term65193, term65193.getClass(), "referencedObjType", null);
        setBooleanField(term65193, term65193.getClass(), "visited", false);
        setField(term65193, term65193.getClass(), "docInfo", null);
        setBooleanField(term65193, term65193.getClass(), "unknown", false);
        setBooleanField(term65193, term65193.getClass(), "resolved", false);
        setField(term65193, term65193.getClass(), "resolveResult", null);
        setField(term65193, term65193.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term64136;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term64038, args);
        assertTrue(recursiveEquals(term64038, term65192));
        assertTrue(recursiveEquals(term64136, term65193));
        assertTrue(recursiveEquals(retValue, false));
    }

};


