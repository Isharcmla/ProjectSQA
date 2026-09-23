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

public class OptionBuilder_create_94931987443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term942;

    public OptionBuilder_create_94931987443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        setField(null, Class.forName("org.apache.commons.cli.OptionBuilder"), "longopt", "");
        ArrayList term953 = new ArrayList();
        term942 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term942, term942.getClass(), "opt", null);
        setField(term942, term942.getClass(), "longOpt", "");
        setField(term942, term942.getClass(), "argName", "arg");
        setField(term942, term942.getClass(), "description", null);
        setBooleanField(term942, term942.getClass(), "required", false);
        setBooleanField(term942, term942.getClass(), "optionalArg", false);
        setIntField(term942, term942.getClass(), "numberOfArgs", 1);
        setField(term942, term942.getClass(), "type", null);
        setField(term942, term942.getClass(), "values", term953);
        setCharField(term942, term942.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "create", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term942));
    }

};


