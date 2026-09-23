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

public class Option_init_268672673231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38326;

    public Option_init_268672673231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38228 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term38228, term38228.getClass(), "argName", null);
        setIntField(term38228, term38228.getClass(), "numberOfArgs", 0);
        setField(term38228, term38228.getClass(), "values", null);
        setField(term38228, term38228.getClass(), "opt", null);
        setField(term38228, term38228.getClass(), "longOpt", "");
        ArrayList term38331 = new ArrayList();
        term38326 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term38326, term38326.getClass(), "opt", null);
        setField(term38326, term38326.getClass(), "longOpt", "");
        setField(term38326, term38326.getClass(), "argName", "arg");
        setField(term38326, term38326.getClass(), "description", null);
        setBooleanField(term38326, term38326.getClass(), "required", false);
        setBooleanField(term38326, term38326.getClass(), "optionalArg", false);
        setIntField(term38326, term38326.getClass(), "numberOfArgs", 1);
        setField(term38326, term38326.getClass(), "type", null);
        setField(term38326, term38326.getClass(), "values", term38331);
        setCharField(term38326, term38326.getClass(), "valuesep", (char) 0);
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
        args[0] = null;
        args[1] = "";
        args[2] = true;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term38326));
    }

};


