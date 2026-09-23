package com.google.javascript.jscomp;

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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeCheck_visit_8595247841320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term398637;
     Object term398707;

    public TypeCheck_visit_8595247841320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term398637 = newInstance(Class.forName("com.google.javascript.jscomp.TypeCheck"));
        term398707 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term398777 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term398891 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term398961 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term399067 = newInstance(Class.forName("com.google.javascript.rhino.jstype.EnumElementType"));
        setIntField(term398707, term398707.getClass(), "type", 17);
        setField(term398777, term398777.getClass(), "jsType", term398891);
        setField(term398707, term398707.getClass(), "first", term398777);
        setField(term398961, term398961.getClass(), "jsType", term399067);
        setField(term398707, term398707.getClass(), "last", term398961);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term398707;
        args[2] = null;
        try {
            callMethod(klass, "visit", argTypes, term398637, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


