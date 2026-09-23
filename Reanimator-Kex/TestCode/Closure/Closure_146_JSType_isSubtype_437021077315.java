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

public class JSType_isSubtype_437021077315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63265;
     Object term63371;
     Object term63584;
     Object term63586;

    public JSType_isSubtype_437021077315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63265 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        term63371 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term63477 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setBooleanField(term63477, term63477.getClass(), "unknown", false);
        setField(term63371, term63371.getClass(), "referencedType", term63477);
        term63584 = newInstance(Class.forName("com.google.javascript.rhino.jstype.ProxyObjectType"));
        Object term63585 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(term63585, term63585.getClass(), "primitiveType", null);
        setField(term63585, term63585.getClass(), "primitiveObjectType", null);
        setField(term63585, term63585.getClass(), "name", null);
        setBooleanField(term63585, term63585.getClass(), "visited", false);
        setField(term63585, term63585.getClass(), "docInfo", null);
        setBooleanField(term63585, term63585.getClass(), "unknown", false);
        setBooleanField(term63585, term63585.getClass(), "resolved", false);
        setField(term63585, term63585.getClass(), "resolveResult", null);
        setField(term63585, term63585.getClass(), "registry", null);
        setField(term63584, term63584.getClass(), "referencedType", term63585);
        setBooleanField(term63584, term63584.getClass(), "visited", false);
        setField(term63584, term63584.getClass(), "docInfo", null);
        setBooleanField(term63584, term63584.getClass(), "unknown", false);
        setBooleanField(term63584, term63584.getClass(), "resolved", false);
        setField(term63584, term63584.getClass(), "resolveResult", null);
        setField(term63584, term63584.getClass(), "registry", null);
        term63586 = newInstance(Class.forName("com.google.javascript.rhino.jstype.UnknownType"));
        setBooleanField(term63586, term63586.getClass(), "isChecked", false);
        setBooleanField(term63586, term63586.getClass(), "visited", false);
        setField(term63586, term63586.getClass(), "docInfo", null);
        setBooleanField(term63586, term63586.getClass(), "unknown", false);
        setBooleanField(term63586, term63586.getClass(), "resolved", false);
        setField(term63586, term63586.getClass(), "resolveResult", null);
        setField(term63586, term63586.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term63265;
        args[1] = term63371;
        Object retValue = callMethod(klass, "isSubtype", argTypes, null, args);
        assertTrue(recursiveEquals(term63265, term63584));
        assertTrue(recursiveEquals(term63371, term63586));
        assertTrue(recursiveEquals(retValue, false));
    }

};


