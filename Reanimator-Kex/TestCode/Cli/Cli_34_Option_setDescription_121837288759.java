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

public class Option_setDescription_121837288759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1347;
     Object term6890;

    public Option_setDescription_121837288759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1399 = new ArrayList();
        term1347 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term1347, term1347.getClass(), "opt", "ffYhPOzlUs");
        setField(term1347, term1347.getClass(), "longOpt", "MLqYREekMl");
        setField(term1347, term1347.getClass(), "argName", "ytSBIKXogI");
        setField(term1347, term1347.getClass(), "description", "nHXjMycHlU");
        setBooleanField(term1347, term1347.getClass(), "required", false);
        setBooleanField(term1347, term1347.getClass(), "optionalArg", true);
        setIntField(term1347, term1347.getClass(), "numberOfArgs", 1134449235);
        setField(term1347, term1347.getClass(), "type", null);
        setField(term1347, term1347.getClass(), "values", term1399);
        setCharField(term1347, term1347.getClass(), "valuesep", 'l');
        ArrayList term6899 = new ArrayList();
        term6890 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term6890, term6890.getClass(), "opt", "ffYhPOzlUs");
        setField(term6890, term6890.getClass(), "longOpt", "MLqYREekMl");
        setField(term6890, term6890.getClass(), "argName", "ytSBIKXogI");
        setField(term6890, term6890.getClass(), "description", "ieCtQFdkii");
        setBooleanField(term6890, term6890.getClass(), "required", false);
        setBooleanField(term6890, term6890.getClass(), "optionalArg", true);
        setIntField(term6890, term6890.getClass(), "numberOfArgs", 1134449235);
        setField(term6890, term6890.getClass(), "type", null);
        setField(term6890, term6890.getClass(), "values", term6899);
        setCharField(term6890, term6890.getClass(), "valuesep", 'l');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ieCtQFdkii";
        callMethod(klass, "setDescription", argTypes, term1347, args);
        assertTrue(recursiveEquals(term1347, term6890));
    }

};


