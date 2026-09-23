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

public class NamedType_getTypedefType_106686040305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103087;
     Object term103335;

    public NamedType_getTypedefType_106686040305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term103239 = new HashSet();
        term103087 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        Object term103191 = newInstance(Class.forName("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setBooleanField(term103191, term103191.getClass(), "lastGeneration", true);
        setField(term103191, term103191.getClass(), "forwardDeclaredTypes", term103239);
        setField(term103087, term103087.getClass(), "registry", term103191);
        setField(term103087, term103087.getClass(), "reference", null);
        term103335 = newInstance(Class.forName("com.google.javascript.rhino.jstype.SimpleSlot"));
        setField(term103335, term103335.getClass(), "type", null);
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
        args[1] = term103335;
        args[2] = null;
        try {
            callMethod(klass, "getTypedefType", argTypes, term103087, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


