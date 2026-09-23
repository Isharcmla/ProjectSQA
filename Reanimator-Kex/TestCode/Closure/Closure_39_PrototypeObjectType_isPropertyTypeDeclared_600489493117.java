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

public class PrototypeObjectType_isPropertyTypeDeclared_600489493117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16352;
     Object term41202;

    public PrototypeObjectType_isPropertyTypeDeclared_600489493117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term16400 = new HashMap();
        term16352 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term16604 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term16352, term16352.getClass(), "properties", term16400);
        setField(term16352, term16352.getClass(), "implicitPrototypeFallback", term16604);
        HashMap term41203 = new HashMap();
        term41202 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term41204 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term41202, term41202.getClass(), "className", null);
        setField(term41202, term41202.getClass(), "properties", term41203);
        setBooleanField(term41202, term41202.getClass(), "nativeType", false);
        setField(term41204, term41204.getClass(), "name", null);
        setField(term41204, term41204.getClass(), "referencedType", null);
        setField(term41204, term41204.getClass(), "referencedObjType", null);
        setBooleanField(term41204, term41204.getClass(), "visited", false);
        setField(term41204, term41204.getClass(), "docInfo", null);
        setBooleanField(term41204, term41204.getClass(), "unknown", false);
        setBooleanField(term41204, term41204.getClass(), "resolved", false);
        setField(term41204, term41204.getClass(), "resolveResult", null);
        setField(term41204, term41204.getClass(), "registry", null);
        setField(term41202, term41202.getClass(), "implicitPrototypeFallback", term41204);
        setField(term41202, term41202.getClass(), "ownerFunction", null);
        setBooleanField(term41202, term41202.getClass(), "prettyPrint", false);
        setBooleanField(term41202, term41202.getClass(), "visited", false);
        setField(term41202, term41202.getClass(), "docInfo", null);
        setBooleanField(term41202, term41202.getClass(), "unknown", false);
        setBooleanField(term41202, term41202.getClass(), "resolved", false);
        setField(term41202, term41202.getClass(), "resolveResult", null);
        setField(term41202, term41202.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "isPropertyTypeDeclared", argTypes, term16352, args);
        assertTrue(recursiveEquals(term16352, term41202));
        assertTrue(recursiveEquals(retValue, false));
    }

};


