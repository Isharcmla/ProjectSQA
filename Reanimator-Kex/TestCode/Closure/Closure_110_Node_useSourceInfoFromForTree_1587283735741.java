package com.google.javascript.rhino;

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
import static com.google.javascript.rhino.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Node_useSourceInfoFromForTree_1587283735741 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74997;
     Object term75449;

    public Node_useSourceInfoFromForTree_1587283735741() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74997 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75067 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75137 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75207 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75277 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        Object term75379 = newInstance(Class.forName("com.google.javascript.rhino.Node$IntPropListItem"));
        setField(term74997, term74997.getClass(), "propListHead", null);
        setIntField(term74997, term74997.getClass(), "sourcePosition", 0);
        setField(term75067, term75067.getClass(), "propListHead", null);
        setIntField(term75067, term75067.getClass(), "sourcePosition", 0);
        setField(term75137, term75137.getClass(), "propListHead", null);
        setIntField(term75137, term75137.getClass(), "sourcePosition", 0);
        setField(term75137, term75137.getClass(), "first", null);
        setField(term75137, term75137.getClass(), "next", null);
        setField(term75067, term75067.getClass(), "first", term75137);
        setField(term75207, term75207.getClass(), "propListHead", null);
        setIntField(term75207, term75207.getClass(), "sourcePosition", 0);
        setField(term75207, term75207.getClass(), "first", null);
        setField(term75277, term75277.getClass(), "propListHead", term75379);
        setField(term75207, term75207.getClass(), "next", term75277);
        setField(term75067, term75067.getClass(), "next", term75207);
        setField(term74997, term74997.getClass(), "first", term75067);
        term75449 = newInstance(Class.forName("com.google.javascript.rhino.Node"));
        setField(term75449, term75449.getClass(), "propListHead", null);
        setIntField(term75449, term75449.getClass(), "sourcePosition", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.javascript.rhino.Node");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("com.google.javascript.rhino.Node");
        Object[] args = new Object[1];
        args[0] = term75449;
        callMethod(klass, "useSourceInfoFromForTree", argTypes, term74997, args);
    }

};


