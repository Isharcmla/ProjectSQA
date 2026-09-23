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

public class Option_init_18650044245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44032;

    public Option_init_18650044245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term43885 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term43885, term43885.getClass(), "argName", null);
        setIntField(term43885, term43885.getClass(), "numberOfArgs", 0);
        setField(term43885, term43885.getClass(), "values", null);
        setField(term43885, term43885.getClass(), "opt", "");
        setField(term43885, term43885.getClass(), "longOpt", "");
        ArrayList term44037 = new ArrayList();
        term44032 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term44032, term44032.getClass(), "opt", "@");
        setField(term44032, term44032.getClass(), "longOpt", null);
        setField(term44032, term44032.getClass(), "argName", "arg");
        setField(term44032, term44032.getClass(), "description", null);
        setBooleanField(term44032, term44032.getClass(), "required", false);
        setBooleanField(term44032, term44032.getClass(), "optionalArg", false);
        setIntField(term44032, term44032.getClass(), "numberOfArgs", 1);
        setField(term44032, term44032.getClass(), "type", null);
        setField(term44032, term44032.getClass(), "values", term44037);
        setCharField(term44032, term44032.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = "@";
        args[1] = true;
        args[2] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term44032));
    }

};


