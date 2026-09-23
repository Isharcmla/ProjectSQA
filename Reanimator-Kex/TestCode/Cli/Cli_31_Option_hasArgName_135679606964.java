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

public class Option_hasArgName_135679606964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1896;
     Object term7881;

    public Option_hasArgName_135679606964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1949 = new ArrayList();
        term1896 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term1948 = newInstance(Class.forName("java.lang.Object"));
        setField(term1896, term1896.getClass(), "opt", "OWKQODBLzb");
        setField(term1896, term1896.getClass(), "longOpt", "wGmYcqUkgE");
        setField(term1896, term1896.getClass(), "argName", "idgaQsnJpQ");
        setField(term1896, term1896.getClass(), "description", "VgZnGoIFwQ");
        setBooleanField(term1896, term1896.getClass(), "required", true);
        setBooleanField(term1896, term1896.getClass(), "optionalArg", false);
        setIntField(term1896, term1896.getClass(), "numberOfArgs", -1456670397);
        setField(term1896, term1896.getClass(), "type", term1948);
        setField(term1896, term1896.getClass(), "values", term1949);
        setCharField(term1896, term1896.getClass(), "valuesep", 'R');
        ArrayList term7891 = new ArrayList();
        term7881 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term7890 = newInstance(Class.forName("java.lang.Object"));
        setField(term7881, term7881.getClass(), "opt", "OWKQODBLzb");
        setField(term7881, term7881.getClass(), "longOpt", "wGmYcqUkgE");
        setField(term7881, term7881.getClass(), "argName", "idgaQsnJpQ");
        setField(term7881, term7881.getClass(), "description", "VgZnGoIFwQ");
        setBooleanField(term7881, term7881.getClass(), "required", true);
        setBooleanField(term7881, term7881.getClass(), "optionalArg", false);
        setIntField(term7881, term7881.getClass(), "numberOfArgs", -1456670397);
        setField(term7881, term7881.getClass(), "type", term7890);
        setField(term7881, term7881.getClass(), "values", term7891);
        setCharField(term7881, term7881.getClass(), "valuesep", 'R');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasArgName", argTypes, term1896, args);
        assertTrue(recursiveEquals(term1896, term7881));
        assertTrue(recursiveEquals(retValue, true));
    }

};


