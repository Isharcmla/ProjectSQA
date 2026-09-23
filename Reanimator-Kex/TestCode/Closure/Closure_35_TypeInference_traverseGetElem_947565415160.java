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

public class TypeInference_traverseGetElem_947565415160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49829;
     Object term49899;

    public TypeInference_traverseGetElem_947565415160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49829 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term49899 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term49969 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term50039 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term49969, term49969.getClass(), "type", -1792504217);
        setField(term49969, term49969.getClass(), "propListHead", null);
        setIntField(term50039, term50039.getClass(), "type", 77);
        setField(term49969, term49969.getClass(), "next", term50039);
        setField(term49899, term49899.getClass(), "first", term49969);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term49899;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term49829, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


