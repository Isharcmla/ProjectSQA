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

public class OptionGroup_setSelected_82295806139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7988;
     Object term8052;
     Object term8107;
     Object term8110;

    public OptionGroup_setSelected_82295806139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7988 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term7988, term7988.getClass(), "selected", null);
        term8052 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term8052, term8052.getClass(), "opt", "");
        term8107 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term8107, term8107.getClass(), "optionMap", null);
        setField(term8107, term8107.getClass(), "selected", "");
        setBooleanField(term8107, term8107.getClass(), "required", false);
        term8110 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term8110, term8110.getClass(), "opt", "");
        setField(term8110, term8110.getClass(), "longOpt", null);
        setField(term8110, term8110.getClass(), "argName", null);
        setField(term8110, term8110.getClass(), "description", null);
        setBooleanField(term8110, term8110.getClass(), "required", false);
        setBooleanField(term8110, term8110.getClass(), "optionalArg", false);
        setIntField(term8110, term8110.getClass(), "numberOfArgs", 0);
        setField(term8110, term8110.getClass(), "type", null);
        setField(term8110, term8110.getClass(), "values", null);
        setCharField(term8110, term8110.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term8052;
        callMethod(klass, "setSelected", argTypes, term7988, args);
        assertTrue(recursiveEquals(term7988, term8107));
        assertTrue(recursiveEquals(term8052, term8110));
    }

};


