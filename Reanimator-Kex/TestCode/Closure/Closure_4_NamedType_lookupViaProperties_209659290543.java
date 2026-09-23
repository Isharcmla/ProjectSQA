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

public class NamedType_lookupViaProperties_209659290543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8607;
     Object term8671;

    public NamedType_lookupViaProperties_209659290543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8607 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term8607, term8607.getClass(), "reference", "");
        term8671 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term8671, term8671.getClass(), "reference", "");
        setField(term8671, term8671.getClass(), "sourceName", null);
        setIntField(term8671, term8671.getClass(), "lineno", 0);
        setIntField(term8671, term8671.getClass(), "charno", 0);
        setField(term8671, term8671.getClass(), "validator", null);
        setField(term8671, term8671.getClass(), "propertyContinuations", null);
        setField(term8671, term8671.getClass(), "referencedType", null);
        setField(term8671, term8671.getClass(), "referencedObjType", null);
        setBooleanField(term8671, term8671.getClass(), "visited", false);
        setField(term8671, term8671.getClass(), "docInfo", null);
        setBooleanField(term8671, term8671.getClass(), "unknown", false);
        setBooleanField(term8671, term8671.getClass(), "resolved", false);
        setField(term8671, term8671.getClass(), "resolveResult", null);
        setField(term8671, term8671.getClass(), "templateKeys", null);
        setField(term8671, term8671.getClass(), "templatizedTypes", null);
        setBooleanField(term8671, term8671.getClass(), "inTemplatedCheckVisit", false);
        setField(term8671, term8671.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticScope");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object retValue = callMethod(klass, "lookupViaProperties", argTypes, term8607, args);
        assertTrue(recursiveEquals(term8607, term8671));
        assertTrue(recursiveEquals(retValue, null));
    }

};


