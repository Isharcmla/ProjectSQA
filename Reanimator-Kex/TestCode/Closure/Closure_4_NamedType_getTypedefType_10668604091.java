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
import java.lang.ClassCastException;
import static com.google.javascript.rhino.jstype.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class NamedType_getTypedefType_10668604091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16929;
     Object term17043;

    public NamedType_getTypedefType_10668604091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16929 = newInstance(Class.forName("com.google.javascript.rhino.jstype.NamedType"));
        term17043 = newInstance(Class.forName("com.google.javascript.jscomp.TightenTypes$ConcreteSlot"));
        Object term17165 = newInstance(Class.forName("com.google.javascript.jscomp.ConcreteType$ConcreteNoneType"));
        setField(term17043, term17043.getClass(), "type", term17165);
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
        args[1] = term17043;
        args[2] = null;
        try {
            callMethod(klass, "getTypedefType", argTypes, term16929, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


