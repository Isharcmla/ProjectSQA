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

public class NamedType_finishPropertyContinuations_167806891155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33222;
     Object term35520;

    public NamedType_finishPropertyContinuations_167806891155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33222 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term33322 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setBooleanField(term33322, term33322.getClass(), "unknown", true);
        setField(term33222, term33222.getClass(), "referencedObjType", term33322);
        term35520 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term35521 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionType"));
        setField(term35520, term35520.getClass(), "reference", null);
        setField(term35520, term35520.getClass(), "sourceName", null);
        setIntField(term35520, term35520.getClass(), "lineno", 0);
        setIntField(term35520, term35520.getClass(), "charno", 0);
        setField(term35520, term35520.getClass(), "validator", null);
        setField(term35520, term35520.getClass(), "propertyContinuations", null);
        setField(term35520, term35520.getClass(), "referencedType", null);
        setField(term35521, term35521.getClass(), "call", null);
        setField(term35521, term35521.getClass(), "prototypeSlot", null);
        setField(term35521, term35521.getClass(), "kind", null);
        setField(term35521, term35521.getClass(), "propAccess", null);
        setField(term35521, term35521.getClass(), "typeOfThis", null);
        setField(term35521, term35521.getClass(), "source", null);
        setField(term35521, term35521.getClass(), "implementedInterfaces", null);
        setField(term35521, term35521.getClass(), "extendedInterfaces", null);
        setField(term35521, term35521.getClass(), "subTypes", null);
        setField(term35521, term35521.getClass(), "className", null);
        setField(term35521, term35521.getClass(), "properties", null);
        setBooleanField(term35521, term35521.getClass(), "nativeType", false);
        setField(term35521, term35521.getClass(), "implicitPrototypeFallback", null);
        setField(term35521, term35521.getClass(), "ownerFunction", null);
        setBooleanField(term35521, term35521.getClass(), "prettyPrint", false);
        setBooleanField(term35521, term35521.getClass(), "visited", false);
        setField(term35521, term35521.getClass(), "docInfo", null);
        setBooleanField(term35521, term35521.getClass(), "unknown", false);
        setBooleanField(term35521, term35521.getClass(), "resolved", false);
        setField(term35521, term35521.getClass(), "resolveResult", null);
        setField(term35521, term35521.getClass(), "templateKeys", null);
        setField(term35521, term35521.getClass(), "templatizedTypes", null);
        setBooleanField(term35521, term35521.getClass(), "inTemplatedCheckVisit", false);
        setField(term35521, term35521.getClass(), "registry", null);
        setField(term35520, term35520.getClass(), "referencedObjType", term35521);
        setBooleanField(term35520, term35520.getClass(), "visited", false);
        setField(term35520, term35520.getClass(), "docInfo", null);
        setBooleanField(term35520, term35520.getClass(), "unknown", false);
        setBooleanField(term35520, term35520.getClass(), "resolved", false);
        setField(term35520, term35520.getClass(), "resolveResult", null);
        setField(term35520, term35520.getClass(), "templateKeys", null);
        setField(term35520, term35520.getClass(), "templatizedTypes", null);
        setBooleanField(term35520, term35520.getClass(), "inTemplatedCheckVisit", false);
        setField(term35520, term35520.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "finishPropertyContinuations", argTypes, term33222, args);
        assertTrue(recursiveEquals(term33222, term35520));
    }

};


