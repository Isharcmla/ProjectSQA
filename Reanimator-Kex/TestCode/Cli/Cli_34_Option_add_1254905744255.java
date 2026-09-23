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
import java.lang.Object;

public class Option_add_1254905744255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55298;
     Object term55373;

    public Option_add_1254905744255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term55350 = new ArrayList();
        term55298 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term55298, term55298.getClass(), "numberOfArgs", 0);
        setBooleanField(term55298, term55298.getClass(), "optionalArg", true);
        setField(term55298, term55298.getClass(), "values", term55350);
        ArrayList term55374 = new ArrayList();
        ((ArrayList) term55374).add((Object)null);
        term55373 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term55373, term55373.getClass(), "opt", null);
        setField(term55373, term55373.getClass(), "longOpt", null);
        setField(term55373, term55373.getClass(), "argName", null);
        setField(term55373, term55373.getClass(), "description", null);
        setBooleanField(term55373, term55373.getClass(), "required", false);
        setBooleanField(term55373, term55373.getClass(), "optionalArg", true);
        setIntField(term55373, term55373.getClass(), "numberOfArgs", 0);
        setField(term55373, term55373.getClass(), "type", null);
        setField(term55373, term55373.getClass(), "values", term55374);
        setCharField(term55373, term55373.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term55298, args);
        assertTrue(recursiveEquals(term55298, term55373));
    }

};


