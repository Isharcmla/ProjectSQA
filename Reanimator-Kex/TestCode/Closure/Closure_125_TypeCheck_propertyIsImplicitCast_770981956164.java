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

public class TypeCheck_propertyIsImplicitCast_770981956164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38345;
     Object term39159;

    public TypeCheck_propertyIsImplicitCast_770981956164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38345 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        term39159 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term39159, term39159.getClass(), "name", null);
        setField(term39159, term39159.getClass(), "referencedType", null);
        setField(term39159, term39159.getClass(), "referencedObjType", null);
        setBooleanField(term39159, term39159.getClass(), "visited", false);
        setField(term39159, term39159.getClass(), "docInfo", null);
        setBooleanField(term39159, term39159.getClass(), "unknown", false);
        setBooleanField(term39159, term39159.getClass(), "resolved", false);
        setField(term39159, term39159.getClass(), "resolveResult", null);
        setField(term39159, term39159.getClass(), "templateTypeMap", null);
        setBooleanField(term39159, term39159.getClass(), "inTemplatedCheckVisit", false);
        setField(term39159, term39159.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term38345;
        args[1] = null;
        Object retValue = callMethod(klass, "propertyIsImplicitCast", argTypes, null, args);
        assertTrue(recursiveEquals(term38345, null));
        assertTrue(recursiveEquals(retValue, false));
    }

};


