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
import java.util.HashSet;
import java.util.HashMap;
import java.lang.Object;

public class AmbiguateProperties_process_91500793149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189460;
     Object term189926;
     Object term190066;

    public AmbiguateProperties_process_91500793149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashSet term189508 = new HashSet();
        HashSet term189656 = new HashSet();
        HashMap term189752 = new HashMap();
        term189460 = newInstance(Class.forName("com.google.javascript.jscomp.AmbiguateProperties"));
        setField(term189460, term189460.getClass(), "compiler", null);
        setField(term189460, term189460.getClass(), "externedNames", term189508);
        setField(term189460, term189460.getClass(), "quotedNames", term189656);
        setField(term189460, term189460.getClass(), "propertyMap", term189752);
        term189926 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term189996 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term189926, term189926.getClass(), "type", 0);
        setField(term189996, term189996.getClass(), "next", null);
        setIntField(term189996, term189996.getClass(), "type", 0);
        setField(term189996, term189996.getClass(), "first", null);
        setField(term189926, term189926.getClass(), "first", term189996);
        term190066 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term190136 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term190066, term190066.getClass(), "type", 0);
        setField(term190136, term190136.getClass(), "next", null);
        setIntField(term190136, term190136.getClass(), "type", 0);
        setField(term190136, term190136.getClass(), "first", null);
        setField(term190066, term190066.getClass(), "first", term190136);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.AmbiguateProperties");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[2];
        args[0] = term189926;
        args[1] = term190066;
        try {
            callMethod(klass, "process", argTypes, term189460, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


