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

public class RecordType_isEquivalentTo_948167372196 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64830;
     Object term64928;
     Object term65235;
     Object term65236;

    public RecordType_isEquivalentTo_948167372196() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64830 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term64928 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term65026 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term65150 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term65026, term65026.getClass(), "referencedType", term65150);
        setField(term64928, term64928.getClass(), "referencedType", term65026);
        term65235 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term65235, term65235.getClass(), "properties", null);
        setBooleanField(term65235, term65235.getClass(), "isFrozen", false);
        setField(term65235, term65235.getClass(), "className", null);
        setField(term65235, term65235.getClass(), "properties", null);
        setBooleanField(term65235, term65235.getClass(), "nativeType", false);
        setField(term65235, term65235.getClass(), "implicitPrototypeFallback", null);
        setField(term65235, term65235.getClass(), "ownerFunction", null);
        setBooleanField(term65235, term65235.getClass(), "prettyPrint", false);
        setBooleanField(term65235, term65235.getClass(), "visited", false);
        setField(term65235, term65235.getClass(), "docInfo", null);
        setBooleanField(term65235, term65235.getClass(), "unknown", false);
        setBooleanField(term65235, term65235.getClass(), "resolved", false);
        setField(term65235, term65235.getClass(), "resolveResult", null);
        setField(term65235, term65235.getClass(), "registry", null);
        term65236 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term65237 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term65238 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnresolvedTypeExpression"));
        setField(term65236, term65236.getClass(), "indexType", null);
        setField(term65237, term65237.getClass(), "indexType", null);
        setField(term65238, term65238.getClass(), "typeExpr", null);
        setField(term65238, term65238.getClass(), "sourceName", null);
        setBooleanField(term65238, term65238.getClass(), "isChecked", false);
        setBooleanField(term65238, term65238.getClass(), "visited", false);
        setField(term65238, term65238.getClass(), "docInfo", null);
        setBooleanField(term65238, term65238.getClass(), "unknown", false);
        setBooleanField(term65238, term65238.getClass(), "resolved", false);
        setField(term65238, term65238.getClass(), "resolveResult", null);
        setField(term65238, term65238.getClass(), "registry", null);
        setField(term65237, term65237.getClass(), "referencedType", term65238);
        setField(term65237, term65237.getClass(), "referencedObjType", null);
        setBooleanField(term65237, term65237.getClass(), "visited", false);
        setField(term65237, term65237.getClass(), "docInfo", null);
        setBooleanField(term65237, term65237.getClass(), "unknown", false);
        setBooleanField(term65237, term65237.getClass(), "resolved", false);
        setField(term65237, term65237.getClass(), "resolveResult", null);
        setField(term65237, term65237.getClass(), "registry", null);
        setField(term65236, term65236.getClass(), "referencedType", term65237);
        setField(term65236, term65236.getClass(), "referencedObjType", null);
        setBooleanField(term65236, term65236.getClass(), "visited", false);
        setField(term65236, term65236.getClass(), "docInfo", null);
        setBooleanField(term65236, term65236.getClass(), "unknown", false);
        setBooleanField(term65236, term65236.getClass(), "resolved", false);
        setField(term65236, term65236.getClass(), "resolveResult", null);
        setField(term65236, term65236.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term64928;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term64830, args);
        assertTrue(recursiveEquals(term64830, term65235));
        assertTrue(recursiveEquals(term64928, term65236));
        assertTrue(recursiveEquals(retValue, false));
    }

};


