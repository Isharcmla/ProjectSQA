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

public class TypeInference_traverseReturn_1142297770414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1086801;
     Object term1086871;

    public TypeInference_traverseReturn_1142297770414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1086801 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term1086871 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1086941 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1087011 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1087081 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1087151 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1087221 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1087291 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1087361 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1087431 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1087501 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1087571 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1087641 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1087711 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term1087781 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term1086941, term1086941.getClass(), "type", 92);
        setIntField(term1087011, term1087011.getClass(), "type", 92);
        setIntField(term1087081, term1087081.getClass(), "type", 92);
        setIntField(term1087151, term1087151.getClass(), "type", 92);
        setIntField(term1087221, term1087221.getClass(), "type", 92);
        setIntField(term1087291, term1087291.getClass(), "type", 92);
        setIntField(term1087361, term1087361.getClass(), "type", 92);
        setIntField(term1087431, term1087431.getClass(), "type", 92);
        setIntField(term1087501, term1087501.getClass(), "type", 92);
        setIntField(term1087571, term1087571.getClass(), "type", 92);
        setIntField(term1087641, term1087641.getClass(), "type", 92);
        setIntField(term1087711, term1087711.getClass(), "type", 92);
        setIntField(term1087781, term1087781.getClass(), "type", 46);
        setField(term1087711, term1087711.getClass(), "first", term1087781);
        setField(term1087641, term1087641.getClass(), "first", term1087711);
        setField(term1087571, term1087571.getClass(), "first", term1087641);
        setField(term1087501, term1087501.getClass(), "first", term1087571);
        setField(term1087431, term1087431.getClass(), "first", term1087501);
        setField(term1087361, term1087361.getClass(), "first", term1087431);
        setField(term1087291, term1087291.getClass(), "first", term1087361);
        setField(term1087221, term1087221.getClass(), "first", term1087291);
        setField(term1087151, term1087151.getClass(), "first", term1087221);
        setField(term1087081, term1087081.getClass(), "first", term1087151);
        setField(term1087011, term1087011.getClass(), "first", term1087081);
        setField(term1086941, term1086941.getClass(), "first", term1087011);
        setField(term1086871, term1086871.getClass(), "first", term1086941);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term1086871;
        args[1] = null;
        try {
            callMethod(klass, "traverseReturn", argTypes, term1086801, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


