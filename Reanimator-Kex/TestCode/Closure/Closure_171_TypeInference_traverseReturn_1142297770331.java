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

public class TypeInference_traverseReturn_1142297770331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term750259;
     Object term750329;

    public TypeInference_traverseReturn_1142297770331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term750259 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term750329 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term750399 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term750469 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term750539 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term750609 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term750679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term750749 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term750819 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term750889 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term750399, term750399.getClass(), "type", 92);
        setIntField(term750469, term750469.getClass(), "type", 92);
        setIntField(term750539, term750539.getClass(), "type", 92);
        setIntField(term750609, term750609.getClass(), "type", 92);
        setIntField(term750679, term750679.getClass(), "type", 92);
        setIntField(term750749, term750749.getClass(), "type", 92);
        setIntField(term750819, term750819.getClass(), "type", 92);
        setIntField(term750889, term750889.getClass(), "type", 119);
        setField(term750819, term750819.getClass(), "first", term750889);
        setField(term750749, term750749.getClass(), "first", term750819);
        setField(term750679, term750679.getClass(), "first", term750749);
        setField(term750609, term750609.getClass(), "first", term750679);
        setField(term750539, term750539.getClass(), "first", term750609);
        setField(term750469, term750469.getClass(), "first", term750539);
        setField(term750399, term750399.getClass(), "first", term750469);
        setField(term750329, term750329.getClass(), "first", term750399);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term750329;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term750259, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


