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

public class NodeUtil_constructorCallHasSideEffects_1705978240193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term675;

    public NodeUtil_constructorCallHasSideEffects_1705978240193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term675 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term679 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term681 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term683 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term690 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term692 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term675, term675.getClass(), "type", -75206835);
        setIntField(term677, term677.getClass(), "type", -1618206977);
        setIntField(term679, term679.getClass(), "type", -1747406163);
        setIntField(term681, term681.getClass(), "type", 388157121);
        setIntField(term683, term683.getClass(), "type", 1684998508);
        setField(term683, term683.getClass(), "next", null);
        setField(term683, term683.getClass(), "first", null);
        setField(term683, term683.getClass(), "last", null);
        setField(term683, term683.getClass(), "propListHead", null);
        setIntField(term683, term683.getClass(), "sourcePosition", 0);
        setField(term683, term683.getClass(), "jsType", null);
        setField(term683, term683.getClass(), "parent", null);
        setField(term681, term681.getClass(), "next", term683);
        setIntField(term686, term686.getClass(), "type", -1476644457);
        setField(term686, term686.getClass(), "next", null);
        setField(term686, term686.getClass(), "first", null);
        setField(term686, term686.getClass(), "last", term683);
        setField(term686, term686.getClass(), "propListHead", null);
        setIntField(term686, term686.getClass(), "sourcePosition", 0);
        setField(term686, term686.getClass(), "jsType", null);
        setField(term686, term686.getClass(), "parent", null);
        setField(term681, term681.getClass(), "first", term686);
        setField(term681, term681.getClass(), "last", term679);
        setField(term681, term681.getClass(), "propListHead", null);
        setIntField(term681, term681.getClass(), "sourcePosition", 0);
        setField(term681, term681.getClass(), "jsType", null);
        setField(term681, term681.getClass(), "parent", null);
        setField(term679, term679.getClass(), "next", term681);
        setField(term679, term679.getClass(), "first", term683);
        setIntField(term690, term690.getClass(), "type", -1146679443);
        setIntField(term692, term692.getClass(), "type", -860131894);
        setField(term692, term692.getClass(), "next", null);
        setField(term692, term692.getClass(), "first", term686);
        setField(term692, term692.getClass(), "last", term681);
        setField(term692, term692.getClass(), "propListHead", null);
        setIntField(term692, term692.getClass(), "sourcePosition", 0);
        setField(term692, term692.getClass(), "jsType", null);
        setField(term692, term692.getClass(), "parent", null);
        setField(term690, term690.getClass(), "next", term692);
        setField(term690, term690.getClass(), "first", term677);
        setField(term690, term690.getClass(), "last", term677);
        setField(term690, term690.getClass(), "propListHead", null);
        setIntField(term690, term690.getClass(), "sourcePosition", 0);
        setField(term690, term690.getClass(), "jsType", null);
        setField(term690, term690.getClass(), "parent", null);
        setField(term679, term679.getClass(), "last", term690);
        setField(term679, term679.getClass(), "propListHead", null);
        setIntField(term679, term679.getClass(), "sourcePosition", 0);
        setField(term679, term679.getClass(), "jsType", null);
        setField(term679, term679.getClass(), "parent", null);
        setField(term677, term677.getClass(), "next", term679);
        setIntField(term697, term697.getClass(), "type", -1022990421);
        setField(term697, term697.getClass(), "next", term690);
        setField(term697, term697.getClass(), "first", term692);
        setField(term697, term697.getClass(), "last", term675);
        setField(term697, term697.getClass(), "propListHead", null);
        setIntField(term697, term697.getClass(), "sourcePosition", 0);
        setField(term697, term697.getClass(), "jsType", null);
        setField(term697, term697.getClass(), "parent", null);
        setField(term677, term677.getClass(), "first", term697);
        setField(term677, term677.getClass(), "last", term697);
        setField(term677, term677.getClass(), "propListHead", null);
        setIntField(term677, term677.getClass(), "sourcePosition", 0);
        setField(term677, term677.getClass(), "jsType", null);
        setField(term677, term677.getClass(), "parent", null);
        setField(term675, term675.getClass(), "next", term677);
        setField(term675, term675.getClass(), "first", term681);
        setField(term675, term675.getClass(), "last", term683);
        setField(term675, term675.getClass(), "propListHead", null);
        setIntField(term675, term675.getClass(), "sourcePosition", 0);
        setField(term675, term675.getClass(), "jsType", null);
        setField(term675, term675.getClass(), "parent", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.NodeUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.AbstractCompiler");
        Object[] args = new Object[2];
        args[0] = term675;
        args[1] = null;
        try {
            callMethod(klass, "constructorCallHasSideEffects", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalStateException e) {
        }

    }

};


