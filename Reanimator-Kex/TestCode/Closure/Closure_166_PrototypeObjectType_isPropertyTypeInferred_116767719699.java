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

public class PrototypeObjectType_isPropertyTypeInferred_116767719699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13426;
     Object term14036;

    public PrototypeObjectType_isPropertyTypeInferred_116767719699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term13474 = new HashMap();
        term13426 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term13678 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term13426, term13426.getClass(), "properties", term13474);
        setField(term13426, term13426.getClass(), "implicitPrototypeFallback", term13678);
        HashMap term14037 = new HashMap();
        term14036 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term14038 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term14036, term14036.getClass(), "className", null);
        setField(term14036, term14036.getClass(), "properties", term14037);
        setBooleanField(term14036, term14036.getClass(), "nativeType", false);
        setField(term14038, term14038.getClass(), "name", null);
        setField(term14038, term14038.getClass(), "referencedType", null);
        setField(term14038, term14038.getClass(), "referencedObjType", null);
        setBooleanField(term14038, term14038.getClass(), "visited", false);
        setField(term14038, term14038.getClass(), "docInfo", null);
        setBooleanField(term14038, term14038.getClass(), "unknown", false);
        setBooleanField(term14038, term14038.getClass(), "resolved", false);
        setField(term14038, term14038.getClass(), "resolveResult", null);
        setBooleanField(term14038, term14038.getClass(), "inTemplatedCheckVisit", false);
        setField(term14038, term14038.getClass(), "registry", null);
        setField(term14036, term14036.getClass(), "implicitPrototypeFallback", term14038);
        setField(term14036, term14036.getClass(), "ownerFunction", null);
        setBooleanField(term14036, term14036.getClass(), "prettyPrint", false);
        setBooleanField(term14036, term14036.getClass(), "visited", false);
        setField(term14036, term14036.getClass(), "docInfo", null);
        setBooleanField(term14036, term14036.getClass(), "unknown", false);
        setBooleanField(term14036, term14036.getClass(), "resolved", false);
        setField(term14036, term14036.getClass(), "resolveResult", null);
        setBooleanField(term14036, term14036.getClass(), "inTemplatedCheckVisit", false);
        setField(term14036, term14036.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "isPropertyTypeInferred", argTypes, term13426, args);
        assertTrue(recursiveEquals(term13426, term14036));
        assertTrue(recursiveEquals(retValue, false));
    }

};


