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

public class JSType_isSubtype_437021077291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53863;
     Object term53981;
     Object term54002;
     Object term54003;

    public JSType_isSubtype_437021077291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53863 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        term53981 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setBooleanField(term53981, term53981.getClass(), "unknown", false);
        term54002 = newInstance(Class.forName("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(term54002, term54002.getClass(), "ownerFunction", null);
        setField(term54002, term54002.getClass(), "className", null);
        setField(term54002, term54002.getClass(), "properties", null);
        setBooleanField(term54002, term54002.getClass(), "nativeType", false);
        setField(term54002, term54002.getClass(), "implicitPrototypeFallback", null);
        setBooleanField(term54002, term54002.getClass(), "prettyPrint", false);
        setBooleanField(term54002, term54002.getClass(), "visited", false);
        setField(term54002, term54002.getClass(), "docInfo", null);
        setBooleanField(term54002, term54002.getClass(), "unknown", false);
        setBooleanField(term54002, term54002.getClass(), "resolved", false);
        setField(term54002, term54002.getClass(), "resolveResult", null);
        setField(term54002, term54002.getClass(), "registry", null);
        term54003 = newInstance(Class.forName("com.google.javascript.rhino.jstype.AllType"));
        setBooleanField(term54003, term54003.getClass(), "resolved", false);
        setField(term54003, term54003.getClass(), "resolveResult", null);
        setField(term54003, term54003.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term53863;
        args[1] = term53981;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term53863, term54002));
        assertTrue(recursiveEquals(term53981, term54003));
        assertTrue(recursiveEquals(retValue, false));
    }

};


