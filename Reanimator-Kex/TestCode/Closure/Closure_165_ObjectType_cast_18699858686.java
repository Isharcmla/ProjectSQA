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

public class ObjectType_cast_18699858686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11901;
     Object term12049;
     Object term12043;

    public ObjectType_cast_18699858686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11901 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        term12049 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term12049, term12049.getClass(), "reference", null);
        setField(term12049, term12049.getClass(), "sourceName", null);
        setIntField(term12049, term12049.getClass(), "lineno", 0);
        setIntField(term12049, term12049.getClass(), "charno", 0);
        setField(term12049, term12049.getClass(), "validator", null);
        setField(term12049, term12049.getClass(), "propertyContinuations", null);
        setField(term12049, term12049.getClass(), "referencedType", null);
        setField(term12049, term12049.getClass(), "referencedObjType", null);
        setBooleanField(term12049, term12049.getClass(), "visited", false);
        setField(term12049, term12049.getClass(), "docInfo", null);
        setBooleanField(term12049, term12049.getClass(), "unknown", false);
        setBooleanField(term12049, term12049.getClass(), "resolved", false);
        setField(term12049, term12049.getClass(), "resolveResult", null);
        setField(term12049, term12049.getClass(), "registry", null);
        term12043 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term12043, term12043.getClass(), "reference", null);
        setField(term12043, term12043.getClass(), "sourceName", null);
        setIntField(term12043, term12043.getClass(), "lineno", 0);
        setIntField(term12043, term12043.getClass(), "charno", 0);
        setField(term12043, term12043.getClass(), "validator", null);
        setField(term12043, term12043.getClass(), "propertyContinuations", null);
        setField(term12043, term12043.getClass(), "referencedType", null);
        setField(term12043, term12043.getClass(), "referencedObjType", null);
        setBooleanField(term12043, term12043.getClass(), "visited", false);
        setField(term12043, term12043.getClass(), "docInfo", null);
        setBooleanField(term12043, term12043.getClass(), "unknown", false);
        setBooleanField(term12043, term12043.getClass(), "resolved", false);
        setField(term12043, term12043.getClass(), "resolveResult", null);
        setField(term12043, term12043.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[1];
        args[0] = term11901;
        Object retValue = callMethod(klass, "cast", argTypes, null, args);
        assertTrue(recursiveEquals(term11901, term12049));
        assertTrue(recursiveEquals(retValue, term12043));
    }

};


