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
import java.util.ArrayList;

public class Option_init_11989516444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4425;

    public Option_init_11989516444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4430 = new ArrayList();
        term4425 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term4425, term4425.getClass(), "opt", "PAEBtnZtTD");
        setField(term4425, term4425.getClass(), "longOpt", null);
        setField(term4425, term4425.getClass(), "argName", null);
        setField(term4425, term4425.getClass(), "description", "sjlJAEtRrb");
        setBooleanField(term4425, term4425.getClass(), "required", false);
        setBooleanField(term4425, term4425.getClass(), "optionalArg", false);
        setIntField(term4425, term4425.getClass(), "numberOfArgs", -1);
        setField(term4425, term4425.getClass(), "type", null);
        setField(term4425, term4425.getClass(), "values", term4430);
        setCharField(term4425, term4425.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "PAEBtnZtTD";
        args[1] = "sjlJAEtRrb";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4425));
    }

};


