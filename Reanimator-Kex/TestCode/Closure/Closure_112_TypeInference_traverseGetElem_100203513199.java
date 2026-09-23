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

public class TypeInference_traverseGetElem_100203513199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99137;
     Object term99207;

    public TypeInference_traverseGetElem_100203513199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99137 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term99207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99347 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99417 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99487 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99557 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99627 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99697 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99767 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99837 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99907 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term99977 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100047 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100117 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100187 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100257 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100327 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100397 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100467 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100537 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term100747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term99277, term99277.getClass(), "type", 98);
        setField(term99347, term99347.getClass(), "next", null);
        setIntField(term99347, term99347.getClass(), "type", 98);
        setField(term99417, term99417.getClass(), "next", null);
        setIntField(term99417, term99417.getClass(), "type", 98);
        setField(term99487, term99487.getClass(), "next", null);
        setIntField(term99487, term99487.getClass(), "type", 98);
        setField(term99557, term99557.getClass(), "next", null);
        setIntField(term99557, term99557.getClass(), "type", 98);
        setField(term99627, term99627.getClass(), "next", null);
        setIntField(term99627, term99627.getClass(), "type", 98);
        setField(term99697, term99697.getClass(), "next", null);
        setIntField(term99697, term99697.getClass(), "type", 98);
        setField(term99767, term99767.getClass(), "next", null);
        setIntField(term99767, term99767.getClass(), "type", 98);
        setField(term99837, term99837.getClass(), "next", null);
        setIntField(term99837, term99837.getClass(), "type", 98);
        setField(term99907, term99907.getClass(), "next", null);
        setIntField(term99907, term99907.getClass(), "type", 98);
        setField(term99977, term99977.getClass(), "next", null);
        setIntField(term99977, term99977.getClass(), "type", 98);
        setField(term100047, term100047.getClass(), "next", null);
        setIntField(term100047, term100047.getClass(), "type", 98);
        setField(term100117, term100117.getClass(), "next", null);
        setIntField(term100117, term100117.getClass(), "type", 98);
        setField(term100187, term100187.getClass(), "next", null);
        setIntField(term100187, term100187.getClass(), "type", 98);
        setField(term100257, term100257.getClass(), "next", null);
        setIntField(term100257, term100257.getClass(), "type", 98);
        setField(term100327, term100327.getClass(), "next", null);
        setIntField(term100327, term100327.getClass(), "type", 98);
        setField(term100397, term100397.getClass(), "next", null);
        setIntField(term100397, term100397.getClass(), "type", 98);
        setField(term100467, term100467.getClass(), "next", null);
        setIntField(term100467, term100467.getClass(), "type", 98);
        setField(term100537, term100537.getClass(), "next", null);
        setIntField(term100537, term100537.getClass(), "type", 98);
        setField(term100607, term100607.getClass(), "next", null);
        setIntField(term100607, term100607.getClass(), "type", 98);
        setField(term100677, term100677.getClass(), "next", null);
        setIntField(term100677, term100677.getClass(), "type", 98);
        setField(term100747, term100747.getClass(), "next", null);
        setIntField(term100747, term100747.getClass(), "type", 81);
        setField(term100677, term100677.getClass(), "first", term100747);
        setField(term100677, term100677.getClass(), "last", null);
        setField(term100607, term100607.getClass(), "first", term100677);
        setField(term100607, term100607.getClass(), "last", null);
        setField(term100537, term100537.getClass(), "first", term100607);
        setField(term100537, term100537.getClass(), "last", null);
        setField(term100467, term100467.getClass(), "first", term100537);
        setField(term100467, term100467.getClass(), "last", null);
        setField(term100397, term100397.getClass(), "first", term100467);
        setField(term100397, term100397.getClass(), "last", null);
        setField(term100327, term100327.getClass(), "first", term100397);
        setField(term100327, term100327.getClass(), "last", null);
        setField(term100257, term100257.getClass(), "first", term100327);
        setField(term100257, term100257.getClass(), "last", null);
        setField(term100187, term100187.getClass(), "first", term100257);
        setField(term100187, term100187.getClass(), "last", null);
        setField(term100117, term100117.getClass(), "first", term100187);
        setField(term100117, term100117.getClass(), "last", null);
        setField(term100047, term100047.getClass(), "first", term100117);
        setField(term100047, term100047.getClass(), "last", null);
        setField(term99977, term99977.getClass(), "first", term100047);
        setField(term99977, term99977.getClass(), "last", null);
        setField(term99907, term99907.getClass(), "first", term99977);
        setField(term99907, term99907.getClass(), "last", null);
        setField(term99837, term99837.getClass(), "first", term99907);
        setField(term99837, term99837.getClass(), "last", null);
        setField(term99767, term99767.getClass(), "first", term99837);
        setField(term99767, term99767.getClass(), "last", null);
        setField(term99697, term99697.getClass(), "first", term99767);
        setField(term99697, term99697.getClass(), "last", null);
        setField(term99627, term99627.getClass(), "first", term99697);
        setField(term99627, term99627.getClass(), "last", null);
        setField(term99557, term99557.getClass(), "first", term99627);
        setField(term99557, term99557.getClass(), "last", null);
        setField(term99487, term99487.getClass(), "first", term99557);
        setField(term99487, term99487.getClass(), "last", null);
        setField(term99417, term99417.getClass(), "first", term99487);
        setField(term99417, term99417.getClass(), "last", null);
        setField(term99347, term99347.getClass(), "first", term99417);
        setField(term99347, term99347.getClass(), "last", null);
        setField(term99277, term99277.getClass(), "first", term99347);
        setField(term99277, term99277.getClass(), "last", null);
        setField(term99207, term99207.getClass(), "first", term99277);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term99207;
        args[1] = null;
        try {
            callMethod(klass, "traverseGetElem", argTypes, term99137, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


