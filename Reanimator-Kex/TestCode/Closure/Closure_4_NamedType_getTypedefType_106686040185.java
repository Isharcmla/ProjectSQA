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
import java.lang.NullPointerException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.HashSet;

public class NamedType_getTypedefType_106686040185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45391;
     Object term45657;

    public NamedType_getTypedefType_106686040185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term45543 = new HashSet();
        term45391 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term45495 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term45495, term45495.getClass(), "lastGeneration", true);
        setField(term45495, term45495.getClass(), "forwardDeclaredTypes", term45543);
        setField(term45391, term45391.getClass(), "registry", term45495);
        setField(term45391, term45391.getClass(), "reference", null);
        term45657 = newInstance(Class.forName("com.google.javascript.jscomp.TightenTypes$ConcreteSlot"));
        setField(term45657, term45657.getClass(), "type", null);
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
        args[1] = term45657;
        args[2] = null;
        try {
            callMethod(klass, "getTypedefType", argTypes, term45391, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


