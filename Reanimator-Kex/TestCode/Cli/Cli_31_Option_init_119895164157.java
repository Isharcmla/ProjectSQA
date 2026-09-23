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

public class Option_init_119895164157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22361;

    public Option_init_119895164157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term22277 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term22277, term22277.getClass(), "argName", "");
        setIntField(term22277, term22277.getClass(), "numberOfArgs", 0);
        setField(term22277, term22277.getClass(), "values", null);
        ArrayList term22364 = new ArrayList();
        term22361 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term22361, term22361.getClass(), "opt", null);
        setField(term22361, term22361.getClass(), "longOpt", null);
        setField(term22361, term22361.getClass(), "argName", "arg");
        setField(term22361, term22361.getClass(), "description", null);
        setBooleanField(term22361, term22361.getClass(), "required", false);
        setBooleanField(term22361, term22361.getClass(), "optionalArg", false);
        setIntField(term22361, term22361.getClass(), "numberOfArgs", -1);
        setField(term22361, term22361.getClass(), "type", null);
        setField(term22361, term22361.getClass(), "values", term22364);
        setCharField(term22361, term22361.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term22361));
    }

};


