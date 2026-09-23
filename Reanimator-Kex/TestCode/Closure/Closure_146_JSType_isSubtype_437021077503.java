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

public class JSType_isSubtype_437021077503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138528;
     Object term138752;
     Object term138908;
     Object term138910;

    public JSType_isSubtype_437021077503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138528 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term138646 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term138528, term138528.getClass(), "referencedType", term138646);
        term138752 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term138848 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setBooleanField(term138848, term138848.getClass(), "unknown", false);
        setField(term138752, term138752.getClass(), "referencedType", term138848);
        term138908 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term138909 = newInstance(Class.forName("com.google.javascript.rhino.jstype.RecordType"));
        setField(term138909, term138909.getClass(), "properties", null);
        setBooleanField(term138909, term138909.getClass(), "isFrozen", false);
        setField(term138909, term138909.getClass(), "className", null);
        setField(term138909, term138909.getClass(), "implicitPrototype", null);
        setBooleanField(term138909, term138909.getClass(), "nativeType", false);
        setBooleanField(term138909, term138909.getClass(), "prettyPrint", false);
        setBooleanField(term138909, term138909.getClass(), "visited", false);
        setField(term138909, term138909.getClass(), "docInfo", null);
        setBooleanField(term138909, term138909.getClass(), "unknown", false);
        setBooleanField(term138909, term138909.getClass(), "resolved", false);
        setField(term138909, term138909.getClass(), "resolveResult", null);
        setField(term138909, term138909.getClass(), "registry", null);
        setField(term138908, term138908.getClass(), "referencedType", term138909);
        setBooleanField(term138908, term138908.getClass(), "visited", false);
        setField(term138908, term138908.getClass(), "docInfo", null);
        setBooleanField(term138908, term138908.getClass(), "unknown", false);
        setBooleanField(term138908, term138908.getClass(), "resolved", false);
        setField(term138908, term138908.getClass(), "resolveResult", null);
        setField(term138908, term138908.getClass(), "registry", null);
        term138910 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term138911 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term138911, term138911.getClass(), "ownerFunction", null);
        setField(term138911, term138911.getClass(), "className", null);
        setField(term138911, term138911.getClass(), "properties", null);
        setField(term138911, term138911.getClass(), "implicitPrototype", null);
        setBooleanField(term138911, term138911.getClass(), "nativeType", false);
        setBooleanField(term138911, term138911.getClass(), "prettyPrint", false);
        setBooleanField(term138911, term138911.getClass(), "visited", false);
        setField(term138911, term138911.getClass(), "docInfo", null);
        setBooleanField(term138911, term138911.getClass(), "unknown", false);
        setBooleanField(term138911, term138911.getClass(), "resolved", false);
        setField(term138911, term138911.getClass(), "resolveResult", null);
        setField(term138911, term138911.getClass(), "registry", null);
        setField(term138910, term138910.getClass(), "referencedType", term138911);
        setBooleanField(term138910, term138910.getClass(), "visited", false);
        setField(term138910, term138910.getClass(), "docInfo", null);
        setBooleanField(term138910, term138910.getClass(), "unknown", false);
        setBooleanField(term138910, term138910.getClass(), "resolved", false);
        setField(term138910, term138910.getClass(), "resolveResult", null);
        setField(term138910, term138910.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term138528;
        args[1] = term138752;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term138528, term138908));
        assertTrue(recursiveEquals(term138752, term138910));
        assertTrue(recursiveEquals(retValue, false));
    }

};


