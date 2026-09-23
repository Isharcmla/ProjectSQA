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

public class Option_init_268672673259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55863;

    public Option_init_268672673259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term55719 = new ArrayList();
        Object term55667 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term55667, term55667.getClass(), "numberOfArgs", 0);
        setField(term55667, term55667.getClass(), "values", term55719);
        setField(term55667, term55667.getClass(), "opt", "");
        setField(term55667, term55667.getClass(), "longOpt", null);
        ArrayList term55868 = new ArrayList();
        term55863 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term55863, term55863.getClass(), "opt", "p");
        setField(term55863, term55863.getClass(), "longOpt", "");
        setField(term55863, term55863.getClass(), "argName", null);
        setField(term55863, term55863.getClass(), "description", null);
        setBooleanField(term55863, term55863.getClass(), "required", false);
        setBooleanField(term55863, term55863.getClass(), "optionalArg", false);
        setIntField(term55863, term55863.getClass(), "numberOfArgs", 1);
        setField(term55863, term55863.getClass(), "type", null);
        setField(term55863, term55863.getClass(), "values", term55868);
        setCharField(term55863, term55863.getClass(), "valuesep", (char) 0);
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
        args[0] = "p";
        args[1] = "";
        args[2] = true;
        args[3] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term55863));
    }

};


