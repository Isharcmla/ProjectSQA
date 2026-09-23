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

public class JSType_isEquivalent_1737835225190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25254;
     Object term25464;
     Object term25465;

    public JSType_isEquivalent_1737835225190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25254 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        term25464 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term25464, term25464.getClass(), "name", null);
        setField(term25464, term25464.getClass(), "referencedType", null);
        setBooleanField(term25464, term25464.getClass(), "visited", false);
        setField(term25464, term25464.getClass(), "docInfo", null);
        setBooleanField(term25464, term25464.getClass(), "unknown", false);
        setBooleanField(term25464, term25464.getClass(), "resolved", false);
        setField(term25464, term25464.getClass(), "resolveResult", null);
        setField(term25464, term25464.getClass(), "registry", null);
        term25465 = newInstance(Class.forName("com.google.javascript.rhino.jstype.TemplateType"));
        setField(term25465, term25465.getClass(), "name", null);
        setField(term25465, term25465.getClass(), "referencedType", null);
        setBooleanField(term25465, term25465.getClass(), "visited", false);
        setField(term25465, term25465.getClass(), "docInfo", null);
        setBooleanField(term25465, term25465.getClass(), "unknown", false);
        setBooleanField(term25465, term25465.getClass(), "resolved", false);
        setField(term25465, term25465.getClass(), "resolveResult", null);
        setField(term25465, term25465.getClass(), "registry", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        argTypes[1] = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Object[] args = new Object[2];
        args[0] = term25254;
        args[1] = term25254;
        Object retValue = callMethod(klass, "isEquivalent", argTypes, null, args);
        assertTrue(recursiveEquals(term25254, term25464));
        assertTrue(recursiveEquals(term25254, term25465));
        assertTrue(recursiveEquals(retValue, true));
    }

};


