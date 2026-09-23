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

public class RecordType_isEquivalentTo_94816737256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8606;
     Object term8704;
     Object term8876;
     Object term8877;

    public RecordType_isEquivalentTo_94816737256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8606 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        term8704 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        term8876 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term8876, term8876.getClass(), "properties", null);
        setBooleanField(term8876, term8876.getClass(), "isFrozen", false);
        setField(term8876, term8876.getClass(), "className", null);
        setField(term8876, term8876.getClass(), "properties", null);
        setBooleanField(term8876, term8876.getClass(), "nativeType", false);
        setField(term8876, term8876.getClass(), "implicitPrototypeFallback", null);
        setField(term8876, term8876.getClass(), "ownerFunction", null);
        setBooleanField(term8876, term8876.getClass(), "prettyPrint", false);
        setBooleanField(term8876, term8876.getClass(), "visited", false);
        setField(term8876, term8876.getClass(), "docInfo", null);
        setBooleanField(term8876, term8876.getClass(), "unknown", false);
        setBooleanField(term8876, term8876.getClass(), "resolved", false);
        setField(term8876, term8876.getClass(), "resolveResult", null);
        setField(term8876, term8876.getClass(), "registry", null);
        term8877 = newInstance(Class.forName("com.google.javascript.rhino.jstype.BooleanType"));
        setBooleanField(term8877, term8877.getClass(), "resolved", false);
        setField(term8877, term8877.getClass(), "resolveResult", null);
        setField(term8877, term8877.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.RecordType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term8704;
        Object retValue = callMethod(klass, "isEquivalentTo", argTypes, term8606, args);
        assertTrue(recursiveEquals(term8606, term8876));
        assertTrue(recursiveEquals(term8704, term8877));
        assertTrue(recursiveEquals(retValue, false));
    }

};


