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

public class PeepholeSubstituteAlternateSyntax_isPure_1883932826232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56441;
     Object term56511;

    public PeepholeSubstituteAlternateSyntax_isPure_1883932826232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56441 = newInstance(Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax"));
        term56511 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56581 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56651 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term56721 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term56511, term56511.getClass(), "type", 96);
        setIntField(term56581, term56581.getClass(), "type", 2);
        setIntField(term56651, term56651.getClass(), "type", 1);
        setField(term56651, term56651.getClass(), "first", null);
        setField(term56651, term56651.getClass(), "next", null);
        setField(term56581, term56581.getClass(), "first", term56651);
        setIntField(term56721, term56721.getClass(), "type", 0);
        setField(term56721, term56721.getClass(), "first", null);
        setField(term56721, term56721.getClass(), "next", null);
        setField(term56581, term56581.getClass(), "next", term56721);
        setField(term56511, term56511.getClass(), "first", term56581);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.PeepholeSubstituteAlternateSyntax");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term56511;
        callMethod(klass, "isPure", argTypes, term56441, args);
    }

};


