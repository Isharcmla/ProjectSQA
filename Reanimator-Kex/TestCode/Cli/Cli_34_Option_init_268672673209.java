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

public class Option_init_268672673209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38712;

    public Option_init_268672673209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term38647 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term38647, term38647.getClass(), "numberOfArgs", 0);
        setField(term38647, term38647.getClass(), "values", null);
        ArrayList term38715 = new ArrayList();
        term38712 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term38712, term38712.getClass(), "opt", "?");
        setField(term38712, term38712.getClass(), "longOpt", null);
        setField(term38712, term38712.getClass(), "argName", null);
        setField(term38712, term38712.getClass(), "description", null);
        setBooleanField(term38712, term38712.getClass(), "required", false);
        setBooleanField(term38712, term38712.getClass(), "optionalArg", false);
        setIntField(term38712, term38712.getClass(), "numberOfArgs", -1);
        setField(term38712, term38712.getClass(), "type", null);
        setField(term38712, term38712.getClass(), "values", term38715);
        setCharField(term38712, term38712.getClass(), "valuesep", (char) 0);
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
        args[0] = "?";
        args[1] = null;
        args[2] = false;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term38712));
    }

};


