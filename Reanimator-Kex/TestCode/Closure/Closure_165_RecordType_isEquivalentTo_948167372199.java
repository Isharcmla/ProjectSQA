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

public class RecordType_isEquivalentTo_948167372199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65352;
     Object term65450;
     Object term66090;
     Object term66091;

    public RecordType_isEquivalentTo_948167372199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65352 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term65450 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term65548 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term65644 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setField(term65548, term65548.getClass(), "referencedType", term65644);
        setField(term65450, term65450.getClass(), "referencedType", term65548);
        term66090 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term66090, term66090.getClass(), "properties", null);
        setBooleanField(term66090, term66090.getClass(), "isFrozen", false);
        setField(term66090, term66090.getClass(), "className", null);
        setField(term66090, term66090.getClass(), "properties", null);
        setBooleanField(term66090, term66090.getClass(), "nativeType", false);
        setField(term66090, term66090.getClass(), "implicitPrototypeFallback", null);
        setField(term66090, term66090.getClass(), "ownerFunction", null);
        setBooleanField(term66090, term66090.getClass(), "prettyPrint", false);
        setBooleanField(term66090, term66090.getClass(), "visited", false);
        setField(term66090, term66090.getClass(), "docInfo", null);
        setBooleanField(term66090, term66090.getClass(), "unknown", false);
        setBooleanField(term66090, term66090.getClass(), "resolved", false);
        setField(term66090, term66090.getClass(), "resolveResult", null);
        setField(term66090, term66090.getClass(), "registry", null);
        term66091 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term66092 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term66093 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NumberType"));
        setField(term66091, term66091.getClass(), "indexType", null);
        setField(term66092, term66092.getClass(), "indexType", null);
        setBooleanField(term66093, term66093.getClass(), "resolved", false);
        setField(term66093, term66093.getClass(), "resolveResult", null);
        setField(term66093, term66093.getClass(), "registry", null);
        setField(term66092, term66092.getClass(), "referencedType", term66093);
        setField(term66092, term66092.getClass(), "referencedObjType", null);
        setBooleanField(term66092, term66092.getClass(), "visited", false);
        setField(term66092, term66092.getClass(), "docInfo", null);
        setBooleanField(term66092, term66092.getClass(), "unknown", false);
        setBooleanField(term66092, term66092.getClass(), "resolved", false);
        setField(term66092, term66092.getClass(), "resolveResult", null);
        setField(term66092, term66092.getClass(), "registry", null);
        setField(term66091, term66091.getClass(), "referencedType", term66092);
        setField(term66091, term66091.getClass(), "referencedObjType", null);
        setBooleanField(term66091, term66091.getClass(), "visited", false);
        setField(term66091, term66091.getClass(), "docInfo", null);
        setBooleanField(term66091, term66091.getClass(), "unknown", false);
        setBooleanField(term66091, term66091.getClass(), "resolved", false);
        setField(term66091, term66091.getClass(), "resolveResult", null);
        setField(term66091, term66091.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term65450;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term65352, args);
        assertTrue(recursiveEquals(term65352, term66090));
        assertTrue(recursiveEquals(term65450, term66091));
        assertTrue(recursiveEquals(retValue, false));
    }

};


