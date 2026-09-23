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

public class OptionGroup_setSelected_82295806143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8723;
     Object term8825;
     Object term8884;
     Object term8887;

    public OptionGroup_setSelected_82295806143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8723 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term8723, term8723.getClass(), "selected", "");
        term8825 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term8825, term8825.getClass(), "opt", null);
        setField(term8825, term8825.getClass(), "longOpt", "");
        term8884 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term8884, term8884.getClass(), "optionMap", null);
        setField(term8884, term8884.getClass(), "selected", "");
        setBooleanField(term8884, term8884.getClass(), "required", false);
        term8887 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term8887, term8887.getClass(), "opt", null);
        setField(term8887, term8887.getClass(), "longOpt", "");
        setField(term8887, term8887.getClass(), "argName", null);
        setField(term8887, term8887.getClass(), "description", null);
        setBooleanField(term8887, term8887.getClass(), "required", false);
        setBooleanField(term8887, term8887.getClass(), "optionalArg", false);
        setIntField(term8887, term8887.getClass(), "numberOfArgs", 0);
        setField(term8887, term8887.getClass(), "type", null);
        setField(term8887, term8887.getClass(), "values", null);
        setCharField(term8887, term8887.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term8825;
        callMethod(klass, "setSelected", argTypes, term8723, args);
        assertTrue(recursiveEquals(term8723, term8884));
        assertTrue(recursiveEquals(term8825, term8887));
    }

};


