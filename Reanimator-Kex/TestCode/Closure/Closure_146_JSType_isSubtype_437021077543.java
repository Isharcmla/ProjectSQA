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

public class JSType_isSubtype_437021077543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149393;
     Object term149607;
     Object term149752;
     Object term149754;

    public JSType_isSubtype_437021077543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149393 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term149501 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term149393, term149393.getClass(), "referencedType", term149501);
        term149607 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term149703 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setBooleanField(term149703, term149703.getClass(), "unknown", false);
        setField(term149607, term149607.getClass(), "referencedType", term149703);
        term149752 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term149753 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term149753, term149753.getClass(), "properties", null);
        setBooleanField(term149753, term149753.getClass(), "isFrozen", false);
        setField(term149753, term149753.getClass(), "className", null);
        setField(term149753, term149753.getClass(), "implicitPrototype", null);
        setBooleanField(term149753, term149753.getClass(), "nativeType", false);
        setBooleanField(term149753, term149753.getClass(), "prettyPrint", false);
        setBooleanField(term149753, term149753.getClass(), "visited", false);
        setField(term149753, term149753.getClass(), "docInfo", null);
        setBooleanField(term149753, term149753.getClass(), "unknown", false);
        setBooleanField(term149753, term149753.getClass(), "resolved", false);
        setField(term149753, term149753.getClass(), "resolveResult", null);
        setField(term149753, term149753.getClass(), "registry", null);
        setField(term149752, term149752.getClass(), "referencedType", term149753);
        setBooleanField(term149752, term149752.getClass(), "visited", false);
        setField(term149752, term149752.getClass(), "docInfo", null);
        setBooleanField(term149752, term149752.getClass(), "unknown", false);
        setBooleanField(term149752, term149752.getClass(), "resolved", false);
        setField(term149752, term149752.getClass(), "resolveResult", null);
        setField(term149752, term149752.getClass(), "registry", null);
        term149754 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term149755 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(term149755, term149755.getClass(), "this$0", null);
        setField(term149755, term149755.getClass(), "call", null);
        setField(term149755, term149755.getClass(), "prototype", null);
        setField(term149755, term149755.getClass(), "kind", null);
        setField(term149755, term149755.getClass(), "typeOfThis", null);
        setField(term149755, term149755.getClass(), "source", null);
        setField(term149755, term149755.getClass(), "implementedInterfaces", null);
        setField(term149755, term149755.getClass(), "subTypes", null);
        setField(term149755, term149755.getClass(), "templateTypeName", null);
        setField(term149755, term149755.getClass(), "className", null);
        setField(term149755, term149755.getClass(), "properties", null);
        setField(term149755, term149755.getClass(), "implicitPrototype", null);
        setBooleanField(term149755, term149755.getClass(), "nativeType", false);
        setBooleanField(term149755, term149755.getClass(), "prettyPrint", false);
        setBooleanField(term149755, term149755.getClass(), "visited", false);
        setField(term149755, term149755.getClass(), "docInfo", null);
        setBooleanField(term149755, term149755.getClass(), "unknown", false);
        setBooleanField(term149755, term149755.getClass(), "resolved", false);
        setField(term149755, term149755.getClass(), "resolveResult", null);
        setField(term149755, term149755.getClass(), "registry", null);
        setField(term149754, term149754.getClass(), "referencedType", term149755);
        setBooleanField(term149754, term149754.getClass(), "visited", false);
        setField(term149754, term149754.getClass(), "docInfo", null);
        setBooleanField(term149754, term149754.getClass(), "unknown", false);
        setBooleanField(term149754, term149754.getClass(), "resolved", false);
        setField(term149754, term149754.getClass(), "resolveResult", null);
        setField(term149754, term149754.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term149393;
        args[1] = term149607;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term149393, term149752));
        assertTrue(recursiveEquals(term149607, term149754));
        assertTrue(recursiveEquals(retValue, false));
    }

};


