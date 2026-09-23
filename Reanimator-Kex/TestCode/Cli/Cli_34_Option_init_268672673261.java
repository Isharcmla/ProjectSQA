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

public class Option_init_268672673261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56153;

    public Option_init_268672673261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term56007 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term56007, term56007.getClass(), "numberOfArgs", 0);
        setField(term56007, term56007.getClass(), "values", null);
        setField(term56007, term56007.getClass(), "opt", "");
        setField(term56007, term56007.getClass(), "longOpt", null);
        ArrayList term56158 = new ArrayList();
        term56153 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term56153, term56153.getClass(), "opt", "@");
        setField(term56153, term56153.getClass(), "longOpt", "");
        setField(term56153, term56153.getClass(), "argName", null);
        setField(term56153, term56153.getClass(), "description", null);
        setBooleanField(term56153, term56153.getClass(), "required", false);
        setBooleanField(term56153, term56153.getClass(), "optionalArg", false);
        setIntField(term56153, term56153.getClass(), "numberOfArgs", 1);
        setField(term56153, term56153.getClass(), "type", null);
        setField(term56153, term56153.getClass(), "values", term56158);
        setCharField(term56153, term56153.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = "@";
        args[1] = "";
        args[2] = true;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term56153));
    }

};


