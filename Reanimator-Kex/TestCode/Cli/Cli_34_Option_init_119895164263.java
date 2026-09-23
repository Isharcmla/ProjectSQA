package org.apache.commons.cli;

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
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.cli.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;

public class Option_init_119895164263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56368;

    public Option_init_119895164263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term56303 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term56303, term56303.getClass(), "numberOfArgs", 0);
        setField(term56303, term56303.getClass(), "values", null);
        ArrayList term56371 = new ArrayList();
        term56368 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term56368, term56368.getClass(), "opt", "?");
        setField(term56368, term56368.getClass(), "longOpt", null);
        setField(term56368, term56368.getClass(), "argName", null);
        setField(term56368, term56368.getClass(), "description", null);
        setBooleanField(term56368, term56368.getClass(), "required", false);
        setBooleanField(term56368, term56368.getClass(), "optionalArg", false);
        setIntField(term56368, term56368.getClass(), "numberOfArgs", -1);
        setField(term56368, term56368.getClass(), "type", null);
        setField(term56368, term56368.getClass(), "values", term56371);
        setCharField(term56368, term56368.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "?";
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term56368));
    }

};


