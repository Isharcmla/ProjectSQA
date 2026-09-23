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

public class TypeInference_traverseAdd_838817955355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term683846;
     Object term683916;

    public TypeInference_traverseAdd_838817955355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term683846 = newInstance(Class.forName("com.google.javascript.jscomp.TypeInference"));
        term683916 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term683986 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term684056 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term684126 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term684196 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term684266 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term684336 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term684406 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term684476 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term684546 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term684616 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term684686 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term684756 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term684826 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term684896 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term684966 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term685036 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term685106 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term685176 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term685246 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term685316 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term683986, term683986.getClass(), "next", term684056);
        setIntField(term683986, term683986.getClass(), "type", 14);
        setIntField(term684126, term684126.getClass(), "type", 14);
        setIntField(term684196, term684196.getClass(), "type", 14);
        setIntField(term684266, term684266.getClass(), "type", 14);
        setIntField(term684336, term684336.getClass(), "type", 14);
        setIntField(term684406, term684406.getClass(), "type", 14);
        setIntField(term684476, term684476.getClass(), "type", 14);
        setIntField(term684546, term684546.getClass(), "type", 14);
        setIntField(term684616, term684616.getClass(), "type", 14);
        setIntField(term684686, term684686.getClass(), "type", 14);
        setIntField(term684756, term684756.getClass(), "type", 14);
        setIntField(term684826, term684826.getClass(), "type", 14);
        setIntField(term684896, term684896.getClass(), "type", 14);
        setIntField(term684966, term684966.getClass(), "type", 14);
        setIntField(term685036, term685036.getClass(), "type", 14);
        setIntField(term685106, term685106.getClass(), "type", 14);
        setIntField(term685176, term685176.getClass(), "type", 14);
        setIntField(term685246, term685246.getClass(), "type", 14);
        setIntField(term685316, term685316.getClass(), "type", 41);
        setField(term685246, term685246.getClass(), "first", term685316);
        setField(term685176, term685176.getClass(), "first", term685246);
        setField(term685106, term685106.getClass(), "first", term685176);
        setField(term685036, term685036.getClass(), "first", term685106);
        setField(term684966, term684966.getClass(), "first", term685036);
        setField(term684896, term684896.getClass(), "first", term684966);
        setField(term684826, term684826.getClass(), "first", term684896);
        setField(term684756, term684756.getClass(), "first", term684826);
        setField(term684686, term684686.getClass(), "first", term684756);
        setField(term684616, term684616.getClass(), "first", term684686);
        setField(term684546, term684546.getClass(), "first", term684616);
        setField(term684476, term684476.getClass(), "first", term684546);
        setField(term684406, term684406.getClass(), "first", term684476);
        setField(term684336, term684336.getClass(), "first", term684406);
        setField(term684266, term684266.getClass(), "first", term684336);
        setField(term684196, term684196.getClass(), "first", term684266);
        setField(term684126, term684126.getClass(), "first", term684196);
        setField(term683986, term683986.getClass(), "first", term684126);
        setField(term683916, term683916.getClass(), "first", term683986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        argTypes[1] = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Object[] args = new Object[2];
        args[0] = term683916;
        args[1] = null;
        try {
            callMethod(klass, "traverseAdd", argTypes, term683846, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


