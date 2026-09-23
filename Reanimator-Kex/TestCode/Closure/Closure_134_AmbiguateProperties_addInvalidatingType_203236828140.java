package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.google.javascript.jscomp.EqualityUtils.*;
import java.util.HashSet;

public class AmbiguateProperties_addInvalidatingType_203236828140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7935;
     Object term8079;
     Object term187065;
     Object term187066;

    public AmbiguateProperties_addInvalidatingType_203236828140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term7983 = new HashSet();
        term7935 = newInstance(Class.forName("com.google.javascript.jscomp.AmbiguateProperties"));
        setField(term7935, term7935.getClass(), "invalidatingTypes", term7983);
        term8079 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term187065 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term187065, term187065.getClass(), "properties", null);
        setBooleanField(term187065, term187065.getClass(), "isFrozen", false);
        setField(term187065, term187065.getClass(), "className", null);
        setField(term187065, term187065.getClass(), "implicitPrototype", null);
        setBooleanField(term187065, term187065.getClass(), "nativeType", false);
        setBooleanField(term187065, term187065.getClass(), "visited", false);
        setField(term187065, term187065.getClass(), "docInfo", null);
        setBooleanField(term187065, term187065.getClass(), "unknown", false);
        setField(term187065, term187065.getClass(), "registry", null);
        term187066 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term187066, term187066.getClass(), "properties", null);
        setBooleanField(term187066, term187066.getClass(), "isFrozen", false);
        setField(term187066, term187066.getClass(), "className", null);
        setField(term187066, term187066.getClass(), "implicitPrototype", null);
        setBooleanField(term187066, term187066.getClass(), "nativeType", false);
        setBooleanField(term187066, term187066.getClass(), "visited", false);
        setField(term187066, term187066.getClass(), "docInfo", null);
        setBooleanField(term187066, term187066.getClass(), "unknown", false);
        setField(term187066, term187066.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term8079;
        callMethod(klass, "addInvalidatingType", argTypes, term7935, args);
        assertTrue(recursiveEquals(term7935, term187065));
        assertTrue(recursiveEquals(term8079, term187066));
    }

};


