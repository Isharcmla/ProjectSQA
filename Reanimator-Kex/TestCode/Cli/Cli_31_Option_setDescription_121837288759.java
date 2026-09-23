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

public class Option_setDescription_121837288759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1360;
     Object term6988;

    public Option_setDescription_121837288759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1413 = new ArrayList();
        term1360 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term1412 = newInstance(Class.forName("java.lang.Object"));
        setField(term1360, term1360.getClass(), "opt", "ffYhPOzlUs");
        setField(term1360, term1360.getClass(), "longOpt", "MLqYREekMl");
        setField(term1360, term1360.getClass(), "argName", "ytSBIKXogI");
        setField(term1360, term1360.getClass(), "description", "nHXjMycHlU");
        setBooleanField(term1360, term1360.getClass(), "required", false);
        setBooleanField(term1360, term1360.getClass(), "optionalArg", true);
        setIntField(term1360, term1360.getClass(), "numberOfArgs", 1134449235);
        setField(term1360, term1360.getClass(), "type", term1412);
        setField(term1360, term1360.getClass(), "values", term1413);
        setCharField(term1360, term1360.getClass(), "valuesep", 'l');
        ArrayList term6998 = new ArrayList();
        term6988 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term6997 = newInstance(Class.forName("java.lang.Object"));
        setField(term6988, term6988.getClass(), "opt", "ffYhPOzlUs");
        setField(term6988, term6988.getClass(), "longOpt", "MLqYREekMl");
        setField(term6988, term6988.getClass(), "argName", "ytSBIKXogI");
        setField(term6988, term6988.getClass(), "description", "ieCtQFdkii");
        setBooleanField(term6988, term6988.getClass(), "required", false);
        setBooleanField(term6988, term6988.getClass(), "optionalArg", true);
        setIntField(term6988, term6988.getClass(), "numberOfArgs", 1134449235);
        setField(term6988, term6988.getClass(), "type", term6997);
        setField(term6988, term6988.getClass(), "values", term6998);
        setCharField(term6988, term6988.getClass(), "valuesep", 'l');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ieCtQFdkii";
        callMethod(klass, "setDescription", argTypes, term1360, args);
        assertTrue(recursiveEquals(term1360, term6988));
    }

};


