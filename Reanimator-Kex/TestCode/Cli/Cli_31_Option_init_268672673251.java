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

public class Option_init_268672673251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44713;

    public Option_init_268672673251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term44644 = new ArrayList();
        Object term44592 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term44592, term44592.getClass(), "argName", null);
        setIntField(term44592, term44592.getClass(), "numberOfArgs", 0);
        setField(term44592, term44592.getClass(), "values", term44644);
        ArrayList term44718 = new ArrayList();
        term44713 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term44713, term44713.getClass(), "opt", "C");
        setField(term44713, term44713.getClass(), "longOpt", null);
        setField(term44713, term44713.getClass(), "argName", "arg");
        setField(term44713, term44713.getClass(), "description", null);
        setBooleanField(term44713, term44713.getClass(), "required", false);
        setBooleanField(term44713, term44713.getClass(), "optionalArg", false);
        setIntField(term44713, term44713.getClass(), "numberOfArgs", -1);
        setField(term44713, term44713.getClass(), "type", null);
        setField(term44713, term44713.getClass(), "values", term44718);
        setCharField(term44713, term44713.getClass(), "valuesep", (char) 0);
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
        args[0] = "C";
        args[1] = null;
        args[2] = false;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term44713));
    }

};


