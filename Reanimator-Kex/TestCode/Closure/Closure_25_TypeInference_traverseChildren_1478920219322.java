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

public class TypeInference_traverseChildren_1478920219322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term785537;
     Object term785607;

    public TypeInference_traverseChildren_1478920219322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term785537 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term785607 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term785677 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term785747 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term785817 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term785887 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term785957 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term786027 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term786097 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term786167 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term786237 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term786307 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term786377 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term786447 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term786517 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term786587 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term786657 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term786727 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term786797 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term786867 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term786937 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term787007 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term787077 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term787147 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term787217 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term787287 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term787357 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term787427 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term787497 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term787567 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setIntField(term785677, term785677.getClass(), "type", 18);
        setIntField(term785747, term785747.getClass(), "type", 18);
        setIntField(term785817, term785817.getClass(), "type", 18);
        setIntField(term785887, term785887.getClass(), "type", 18);
        setIntField(term785957, term785957.getClass(), "type", 18);
        setIntField(term786027, term786027.getClass(), "type", 18);
        setIntField(term786097, term786097.getClass(), "type", 18);
        setIntField(term786167, term786167.getClass(), "type", 18);
        setIntField(term786237, term786237.getClass(), "type", 18);
        setIntField(term786307, term786307.getClass(), "type", 18);
        setIntField(term786377, term786377.getClass(), "type", 18);
        setIntField(term786447, term786447.getClass(), "type", 18);
        setIntField(term786517, term786517.getClass(), "type", 18);
        setIntField(term786587, term786587.getClass(), "type", 18);
        setIntField(term786657, term786657.getClass(), "type", 18);
        setIntField(term786727, term786727.getClass(), "type", 18);
        setIntField(term786797, term786797.getClass(), "type", 18);
        setIntField(term786867, term786867.getClass(), "type", 18);
        setIntField(term786937, term786937.getClass(), "type", 18);
        setIntField(term787007, term787007.getClass(), "type", 18);
        setIntField(term787077, term787077.getClass(), "type", 18);
        setIntField(term787147, term787147.getClass(), "type", 18);
        setIntField(term787217, term787217.getClass(), "type", 18);
        setIntField(term787287, term787287.getClass(), "type", 18);
        setIntField(term787357, term787357.getClass(), "type", 18);
        setIntField(term787427, term787427.getClass(), "type", 18);
        setIntField(term787497, term787497.getClass(), "type", 18);
        setIntField(term787567, term787567.getClass(), "type", 8);
        setField(term787497, term787497.getClass(), "first", term787567);
        setField(term787427, term787427.getClass(), "first", term787497);
        setField(term787357, term787357.getClass(), "first", term787427);
        setField(term787287, term787287.getClass(), "first", term787357);
        setField(term787217, term787217.getClass(), "first", term787287);
        setField(term787147, term787147.getClass(), "first", term787217);
        setField(term787077, term787077.getClass(), "first", term787147);
        setField(term787007, term787007.getClass(), "first", term787077);
        setField(term786937, term786937.getClass(), "first", term787007);
        setField(term786867, term786867.getClass(), "first", term786937);
        setField(term786797, term786797.getClass(), "first", term786867);
        setField(term786727, term786727.getClass(), "first", term786797);
        setField(term786657, term786657.getClass(), "first", term786727);
        setField(term786587, term786587.getClass(), "first", term786657);
        setField(term786517, term786517.getClass(), "first", term786587);
        setField(term786447, term786447.getClass(), "first", term786517);
        setField(term786377, term786377.getClass(), "first", term786447);
        setField(term786307, term786307.getClass(), "first", term786377);
        setField(term786237, term786237.getClass(), "first", term786307);
        setField(term786167, term786167.getClass(), "first", term786237);
        setField(term786097, term786097.getClass(), "first", term786167);
        setField(term786027, term786027.getClass(), "first", term786097);
        setField(term785957, term785957.getClass(), "first", term786027);
        setField(term785887, term785887.getClass(), "first", term785957);
        setField(term785817, term785817.getClass(), "first", term785887);
        setField(term785747, term785747.getClass(), "first", term785817);
        setField(term785677, term785677.getClass(), "first", term785747);
        setField(term785607, term785607.getClass(), "first", term785677);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term785607;
        args[1] = null;
        try {
            callMethod(klass, "traverseChildren", argTypes, term785537, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


