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

public class Option_hasArgName_135679606964 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1878;
     Object term7713;

    public Option_hasArgName_135679606964() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1930 = new ArrayList();
        term1878 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term1878, term1878.getClass(), "opt", "OWKQODBLzb");
        setField(term1878, term1878.getClass(), "longOpt", "wGmYcqUkgE");
        setField(term1878, term1878.getClass(), "argName", "idgaQsnJpQ");
        setField(term1878, term1878.getClass(), "description", "VgZnGoIFwQ");
        setBooleanField(term1878, term1878.getClass(), "required", true);
        setBooleanField(term1878, term1878.getClass(), "optionalArg", false);
        setIntField(term1878, term1878.getClass(), "numberOfArgs", -1456670397);
        setField(term1878, term1878.getClass(), "type", null);
        setField(term1878, term1878.getClass(), "values", term1930);
        setCharField(term1878, term1878.getClass(), "valuesep", 'R');
        ArrayList term7722 = new ArrayList();
        term7713 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term7713, term7713.getClass(), "opt", "OWKQODBLzb");
        setField(term7713, term7713.getClass(), "longOpt", "wGmYcqUkgE");
        setField(term7713, term7713.getClass(), "argName", "idgaQsnJpQ");
        setField(term7713, term7713.getClass(), "description", "VgZnGoIFwQ");
        setBooleanField(term7713, term7713.getClass(), "required", true);
        setBooleanField(term7713, term7713.getClass(), "optionalArg", false);
        setIntField(term7713, term7713.getClass(), "numberOfArgs", -1456670397);
        setField(term7713, term7713.getClass(), "type", null);
        setField(term7713, term7713.getClass(), "values", term7722);
        setCharField(term7713, term7713.getClass(), "valuesep", 'R');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasArgName", argTypes, term1878, args);
        assertTrue(recursiveEquals(term1878, term7713));
        assertTrue(recursiveEquals(retValue, true));
    }

};


