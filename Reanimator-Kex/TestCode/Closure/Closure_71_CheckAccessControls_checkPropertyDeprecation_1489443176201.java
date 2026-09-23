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
import java.lang.UnsupportedOperationException;
import static com.google.javascript.jscomp.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CheckAccessControls_checkPropertyDeprecation_1489443176201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55645;
     Object term55731;
     Object term56087;

    public CheckAccessControls_checkPropertyDeprecation_1489443176201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55645 = newInstance(Class.forName("com.google.javascript.jscomp.CheckAccessControls"));
        term55731 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term55817 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        Object term55931 = newInstance(Class.forName("com.google.javascript.rhino.jstype.PrototypeObjectType"));
        Object term56001 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term55817, term55817.getClass(), "jsType", term55931);
        setField(term55731, term55731.getClass(), "first", term55817);
        setField(term55731, term55731.getClass(), "last", term56001);
        term56087 = newInstance(Class.forName("com.google.javascript.rhino.FunctionNode"));
        setIntField(term56087, term56087.getClass(), "type", -31);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[2] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term55731;
        args[2] = term56087;
        try {
            callMethod(klass, "checkPropertyDeprecation", argTypes, term55645, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


