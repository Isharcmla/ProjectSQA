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

public class OptionGroup_setSelected_82295806127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3803;
     Object term3905;
     Object term4224;
     Object term4227;

    public OptionGroup_setSelected_82295806127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3803 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term3803, term3803.getClass(), "selected", "");
        term3905 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term3905, term3905.getClass(), "opt", "");
        term4224 = newInstance(Class.forName("org.apache.commons.cli.OptionGroup"));
        setField(term4224, term4224.getClass(), "optionMap", null);
        setField(term4224, term4224.getClass(), "selected", "");
        setBooleanField(term4224, term4224.getClass(), "required", false);
        term4227 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term4227, term4227.getClass(), "opt", "");
        setField(term4227, term4227.getClass(), "longOpt", null);
        setField(term4227, term4227.getClass(), "argName", null);
        setField(term4227, term4227.getClass(), "description", null);
        setBooleanField(term4227, term4227.getClass(), "required", false);
        setBooleanField(term4227, term4227.getClass(), "optionalArg", false);
        setIntField(term4227, term4227.getClass(), "numberOfArgs", 0);
        setField(term4227, term4227.getClass(), "type", null);
        setField(term4227, term4227.getClass(), "values", null);
        setCharField(term4227, term4227.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionGroup");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term3905;
        callMethod(klass, "setSelected", argTypes, term3803, args);
        assertTrue(recursiveEquals(term3803, term4224));
        assertTrue(recursiveEquals(term3905, term4227));
    }

};


