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

public class NamedType_getTypedefType_106686040217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62734;
     Object term62980;

    public NamedType_getTypedefType_106686040217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term62886 = new HashSet();
        term62734 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term62838 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term62838, term62838.getClass(), "lastGeneration", true);
        setField(term62838, term62838.getClass(), "forwardDeclaredTypes", term62886);
        setField(term62734, term62734.getClass(), "registry", term62838);
        setField(term62734, term62734.getClass(), "reference", null);
        term62980 = newInstance(Class.forName("com.google.javascript.jscomp.Scope$Arguments"));
        setField(term62980, term62980.getClass(), "type", null);
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
        args[1] = term62980;
        args[2] = null;
        try {
            callMethod(klass, "getTypedefType", argTypes, term62734, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


