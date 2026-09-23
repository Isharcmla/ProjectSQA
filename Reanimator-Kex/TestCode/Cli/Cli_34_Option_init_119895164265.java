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

public class Option_init_119895164265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56566;

    public Option_init_119895164265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term56500 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term56500, term56500.getClass(), "numberOfArgs", 0);
        setField(term56500, term56500.getClass(), "values", null);
        ArrayList term56569 = new ArrayList();
        term56566 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term56566, term56566.getClass(), "opt", "@");
        setField(term56566, term56566.getClass(), "longOpt", null);
        setField(term56566, term56566.getClass(), "argName", null);
        setField(term56566, term56566.getClass(), "description", null);
        setBooleanField(term56566, term56566.getClass(), "required", false);
        setBooleanField(term56566, term56566.getClass(), "optionalArg", false);
        setIntField(term56566, term56566.getClass(), "numberOfArgs", -1);
        setField(term56566, term56566.getClass(), "type", null);
        setField(term56566, term56566.getClass(), "values", term56569);
        setCharField(term56566, term56566.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "@";
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term56566));
    }

};


