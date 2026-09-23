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

public class Option_equals_1962139692133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18282;
     Object term18350;
     Object term18367;
     Object term18368;

    public Option_equals_1962139692133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18282 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        term18350 = newInstance(Class.forName("java.util.stream.LongPipeline$7"));
        term18367 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term18367, term18367.getClass(), "opt", null);
        setField(term18367, term18367.getClass(), "longOpt", null);
        setField(term18367, term18367.getClass(), "argName", null);
        setField(term18367, term18367.getClass(), "description", null);
        setBooleanField(term18367, term18367.getClass(), "required", false);
        setBooleanField(term18367, term18367.getClass(), "optionalArg", false);
        setIntField(term18367, term18367.getClass(), "numberOfArgs", 0);
        setField(term18367, term18367.getClass(), "type", null);
        setField(term18367, term18367.getClass(), "values", null);
        setCharField(term18367, term18367.getClass(), "valuesep", (char) 0);
        term18368 = newInstance(Class.forName("java.util.stream.LongPipeline$7"));
        setField(term18368, term18368.getClass(), "this$0", null);
        setField(term18368, term18368.getClass(), "sourceStage", null);
        setField(term18368, term18368.getClass(), "previousStage", null);
        setIntField(term18368, term18368.getClass(), "sourceOrOpFlags", 0);
        setField(term18368, term18368.getClass(), "nextStage", null);
        setIntField(term18368, term18368.getClass(), "depth", 0);
        setIntField(term18368, term18368.getClass(), "combinedFlags", 0);
        setField(term18368, term18368.getClass(), "sourceSpliterator", null);
        setField(term18368, term18368.getClass(), "sourceSupplier", null);
        setBooleanField(term18368, term18368.getClass(), "linkedOrConsumed", false);
        setBooleanField(term18368, term18368.getClass(), "sourceAnyStateful", false);
        setField(term18368, term18368.getClass(), "sourceCloseAction", null);
        setBooleanField(term18368, term18368.getClass(), "parallel", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term18350;
        Object retValue = callMethod(klass, "equals", argTypes, term18282, args);
        assertTrue(recursiveEquals(term18282, term18367));
        assertTrue(recursiveEquals(term18350, term18368));
        assertTrue(recursiveEquals(retValue, false));
    }

};


