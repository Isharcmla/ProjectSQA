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

public class NamedType_getTypedefType_106686040235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72958;
     Object term73054;
     Object term73180;
     Object term73181;
     Object term73157;

    public NamedType_getTypedefType_106686040235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72958 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        term73054 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        Object term73148 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term73054, term73054.getClass(), "type", term73148);
        term73180 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term73180, term73180.getClass(), "reference", null);
        setField(term73180, term73180.getClass(), "sourceName", null);
        setIntField(term73180, term73180.getClass(), "lineno", 0);
        setIntField(term73180, term73180.getClass(), "charno", 0);
        setField(term73180, term73180.getClass(), "validator", null);
        setField(term73180, term73180.getClass(), "propertyContinuations", null);
        setField(term73180, term73180.getClass(), "referencedType", null);
        setField(term73180, term73180.getClass(), "referencedObjType", null);
        setBooleanField(term73180, term73180.getClass(), "visited", false);
        setField(term73180, term73180.getClass(), "docInfo", null);
        setBooleanField(term73180, term73180.getClass(), "unknown", false);
        setBooleanField(term73180, term73180.getClass(), "resolved", false);
        setField(term73180, term73180.getClass(), "resolveResult", null);
        setField(term73180, term73180.getClass(), "templateKeys", null);
        setField(term73180, term73180.getClass(), "templatizedTypes", null);
        setBooleanField(term73180, term73180.getClass(), "inTemplatedCheckVisit", false);
        setField(term73180, term73180.getClass(), "registry", null);
        term73181 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        Object term73182 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term73181, term73181.getClass(), "name", null);
        setField(term73182, term73182.getClass(), "reference", null);
        setField(term73182, term73182.getClass(), "sourceName", null);
        setIntField(term73182, term73182.getClass(), "lineno", 0);
        setIntField(term73182, term73182.getClass(), "charno", 0);
        setField(term73182, term73182.getClass(), "validator", null);
        setField(term73182, term73182.getClass(), "propertyContinuations", null);
        setField(term73182, term73182.getClass(), "referencedType", null);
        setField(term73182, term73182.getClass(), "referencedObjType", null);
        setBooleanField(term73182, term73182.getClass(), "visited", false);
        setField(term73182, term73182.getClass(), "docInfo", null);
        setBooleanField(term73182, term73182.getClass(), "unknown", false);
        setBooleanField(term73182, term73182.getClass(), "resolved", false);
        setField(term73182, term73182.getClass(), "resolveResult", null);
        setField(term73182, term73182.getClass(), "templateKeys", null);
        setField(term73182, term73182.getClass(), "templatizedTypes", null);
        setBooleanField(term73182, term73182.getClass(), "inTemplatedCheckVisit", false);
        setField(term73182, term73182.getClass(), "registry", null);
        setField(term73181, term73181.getClass(), "type", term73182);
        setBooleanField(term73181, term73181.getClass(), "inferred", false);
        term73157 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        setField(term73157, term73157.getClass(), "reference", null);
        setField(term73157, term73157.getClass(), "sourceName", null);
        setIntField(term73157, term73157.getClass(), "lineno", 0);
        setIntField(term73157, term73157.getClass(), "charno", 0);
        setField(term73157, term73157.getClass(), "validator", null);
        setField(term73157, term73157.getClass(), "propertyContinuations", null);
        setField(term73157, term73157.getClass(), "referencedType", null);
        setField(term73157, term73157.getClass(), "referencedObjType", null);
        setBooleanField(term73157, term73157.getClass(), "visited", false);
        setField(term73157, term73157.getClass(), "docInfo", null);
        setBooleanField(term73157, term73157.getClass(), "unknown", false);
        setBooleanField(term73157, term73157.getClass(), "resolved", false);
        setField(term73157, term73157.getClass(), "resolveResult", null);
        setField(term73157, term73157.getClass(), "templateKeys", null);
        setField(term73157, term73157.getClass(), "templatizedTypes", null);
        setBooleanField(term73157, term73157.getClass(), "inTemplatedCheckVisit", false);
        setField(term73157, term73157.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.NamedType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.rhino.ErrorReporter");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.StaticSlot");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term73054;
        args[2] = null;
        Object retValue = callMethod(klass, "getTypedefType", argTypes, term72958, args);
        assertTrue(recursiveEquals(term72958, term73180));
        assertTrue(recursiveEquals(term73054, null));
        assertTrue(recursiveEquals(retValue, term73157));
    }

};


