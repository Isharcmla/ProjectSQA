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

public class Option_add_125490574473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2799;
     Object term9736;

    public Option_add_125490574473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2851 = new ArrayList();
        term2799 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term2799, term2799.getClass(), "opt", "iNwOJRBEjp");
        setField(term2799, term2799.getClass(), "longOpt", "XylxrMBraH");
        setField(term2799, term2799.getClass(), "argName", "pORebkoRdD");
        setField(term2799, term2799.getClass(), "description", "mXGCWJDOqA");
        setBooleanField(term2799, term2799.getClass(), "required", false);
        setBooleanField(term2799, term2799.getClass(), "optionalArg", true);
        setIntField(term2799, term2799.getClass(), "numberOfArgs", 865208305);
        setField(term2799, term2799.getClass(), "type", null);
        setField(term2799, term2799.getClass(), "values", term2851);
        setCharField(term2799, term2799.getClass(), "valuesep", 'g');
        ArrayList term9745 = new ArrayList();
        ((ArrayList) term9745).add("dpNsDgfPso");
        term9736 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term9736, term9736.getClass(), "opt", "iNwOJRBEjp");
        setField(term9736, term9736.getClass(), "longOpt", "XylxrMBraH");
        setField(term9736, term9736.getClass(), "argName", "pORebkoRdD");
        setField(term9736, term9736.getClass(), "description", "mXGCWJDOqA");
        setBooleanField(term9736, term9736.getClass(), "required", false);
        setBooleanField(term9736, term9736.getClass(), "optionalArg", true);
        setIntField(term9736, term9736.getClass(), "numberOfArgs", 865208305);
        setField(term9736, term9736.getClass(), "type", null);
        setField(term9736, term9736.getClass(), "values", term9745);
        setCharField(term9736, term9736.getClass(), "valuesep", 'g');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "dpNsDgfPso";
        callMethod(klass, "add", argTypes, term2799, args);
        assertTrue(recursiveEquals(term2799, term9736));
    }

};


