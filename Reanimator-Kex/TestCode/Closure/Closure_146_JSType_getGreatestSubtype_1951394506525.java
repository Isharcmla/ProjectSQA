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

public class JSType_getGreatestSubtype_1951394506525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144644;
     Object term144860;
     Object term144996;
     Object term144998;
     Object term144945;

    public JSType_getGreatestSubtype_1951394506525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144644 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term144919 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setBooleanField(term144919, term144919.getClass(), "unknown", false);
        setField(term144644, term144644.getClass(), "referencedType", term144919);
        term144860 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        setField(term144860, term144860.getClass(), "referencedType", term144919);
        term144996 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term144997 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term144996, term144996.getClass(), "indexType", null);
        setField(term144997, term144997.getClass(), "ownerFunction", null);
        setField(term144997, term144997.getClass(), "className", null);
        setField(term144997, term144997.getClass(), "properties", null);
        setField(term144997, term144997.getClass(), "implicitPrototype", null);
        setBooleanField(term144997, term144997.getClass(), "nativeType", false);
        setBooleanField(term144997, term144997.getClass(), "prettyPrint", false);
        setBooleanField(term144997, term144997.getClass(), "visited", false);
        setField(term144997, term144997.getClass(), "docInfo", null);
        setBooleanField(term144997, term144997.getClass(), "unknown", false);
        setBooleanField(term144997, term144997.getClass(), "resolved", false);
        setField(term144997, term144997.getClass(), "resolveResult", null);
        setField(term144997, term144997.getClass(), "registry", null);
        setField(term144996, term144996.getClass(), "referencedType", term144997);
        setBooleanField(term144996, term144996.getClass(), "visited", false);
        setField(term144996, term144996.getClass(), "docInfo", null);
        setBooleanField(term144996, term144996.getClass(), "unknown", false);
        setBooleanField(term144996, term144996.getClass(), "resolved", false);
        setField(term144996, term144996.getClass(), "resolveResult", null);
        setField(term144996, term144996.getClass(), "registry", null);
        term144998 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term144999 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term144998, term144998.getClass(), "indexType", null);
        setField(term144999, term144999.getClass(), "ownerFunction", null);
        setField(term144999, term144999.getClass(), "className", null);
        setField(term144999, term144999.getClass(), "properties", null);
        setField(term144999, term144999.getClass(), "implicitPrototype", null);
        setBooleanField(term144999, term144999.getClass(), "nativeType", false);
        setBooleanField(term144999, term144999.getClass(), "prettyPrint", false);
        setBooleanField(term144999, term144999.getClass(), "visited", false);
        setField(term144999, term144999.getClass(), "docInfo", null);
        setBooleanField(term144999, term144999.getClass(), "unknown", false);
        setBooleanField(term144999, term144999.getClass(), "resolved", false);
        setField(term144999, term144999.getClass(), "resolveResult", null);
        setField(term144999, term144999.getClass(), "registry", null);
        setField(term144998, term144998.getClass(), "referencedType", term144999);
        setBooleanField(term144998, term144998.getClass(), "visited", false);
        setField(term144998, term144998.getClass(), "docInfo", null);
        setBooleanField(term144998, term144998.getClass(), "unknown", false);
        setBooleanField(term144998, term144998.getClass(), "resolved", false);
        setField(term144998, term144998.getClass(), "resolveResult", null);
        setField(term144998, term144998.getClass(), "registry", null);
        term144945 = newInstance(Class.forName("com.google.javascript.rhino.jstype.IndexedType"));
        Object term144922 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term144945, term144945.getClass(), "indexType", null);
        setField(term144922, term144922.getClass(), "ownerFunction", null);
        setField(term144922, term144922.getClass(), "className", null);
        setField(term144922, term144922.getClass(), "properties", null);
        setField(term144922, term144922.getClass(), "implicitPrototype", null);
        setBooleanField(term144922, term144922.getClass(), "nativeType", false);
        setBooleanField(term144922, term144922.getClass(), "prettyPrint", false);
        setBooleanField(term144922, term144922.getClass(), "visited", false);
        setField(term144922, term144922.getClass(), "docInfo", null);
        setBooleanField(term144922, term144922.getClass(), "unknown", false);
        setBooleanField(term144922, term144922.getClass(), "resolved", false);
        setField(term144922, term144922.getClass(), "resolveResult", null);
        setField(term144922, term144922.getClass(), "registry", null);
        setField(term144945, term144945.getClass(), "referencedType", term144922);
        setBooleanField(term144945, term144945.getClass(), "visited", false);
        setField(term144945, term144945.getClass(), "docInfo", null);
        setBooleanField(term144945, term144945.getClass(), "unknown", false);
        setBooleanField(term144945, term144945.getClass(), "resolved", false);
        setField(term144945, term144945.getClass(), "resolveResult", null);
        setField(term144945, term144945.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term144644;
        args[1] = term144860;
        Object retValue = callMethod(klass, "getGreatestSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term144644, term144996));
        assertTrue(recursiveEquals(term144860, term144998));
        assertTrue(recursiveEquals(retValue, term144945));
    }

};


