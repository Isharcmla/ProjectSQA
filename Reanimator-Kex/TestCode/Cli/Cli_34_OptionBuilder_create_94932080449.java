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

public class OptionBuilder_create_94932080449 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6772;

    public OptionBuilder_create_94932080449() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        setField(null, Class.forName("org.apache.commons.cli.OptionBuilder"), "description", "");
        ArrayList term6782 = new ArrayList();
        term6772 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term6772, term6772.getClass(), "opt", " \b");
        setField(term6772, term6772.getClass(), "longOpt", null);
        setField(term6772, term6772.getClass(), "argName", null);
        setField(term6772, term6772.getClass(), "description", "");
        setBooleanField(term6772, term6772.getClass(), "required", false);
        setBooleanField(term6772, term6772.getClass(), "optionalArg", false);
        setIntField(term6772, term6772.getClass(), "numberOfArgs", -1);
        setField(term6772, term6772.getClass(), "type", null);
        setField(term6772, term6772.getClass(), "values", term6782);
        setCharField(term6772, term6772.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = (char) 2048;
        Object retValue = callMethod(klass, "create", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term6772));
    }

};


