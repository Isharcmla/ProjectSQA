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
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class TypeInference_traverseAssign_157422923137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75867;
     Object term75937;

    public TypeInference_traverseAssign_157422923137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75867 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term75937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term76077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term76007, term76007.getClass(), "type", 130);
        setField(term75937, term75937.getClass(), "first", term76007);
        setField(term75937, term75937.getClass(), "last", term76077);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.FlowScope");
        Object[] args = new Object[2];
        args[0] = term75937;
        args[1] = null;
        callMethod(klass, "traverseAssign", argTypes, term75867, args);
    }

};


