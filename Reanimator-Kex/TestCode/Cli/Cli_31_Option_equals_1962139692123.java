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

public class Option_equals_1962139692123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16585;
     Object term16653;
     Object term16687;
     Object term16688;

    public Option_equals_1962139692123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16585 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        term16653 = newInstance(Class.forName("java.util.stream.LongPipeline$4"));
        term16687 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term16687, term16687.getClass(), "opt", null);
        setField(term16687, term16687.getClass(), "longOpt", null);
        setField(term16687, term16687.getClass(), "argName", null);
        setField(term16687, term16687.getClass(), "description", null);
        setBooleanField(term16687, term16687.getClass(), "required", false);
        setBooleanField(term16687, term16687.getClass(), "optionalArg", false);
        setIntField(term16687, term16687.getClass(), "numberOfArgs", 0);
        setField(term16687, term16687.getClass(), "type", null);
        setField(term16687, term16687.getClass(), "values", null);
        setCharField(term16687, term16687.getClass(), "valuesep", (char) 0);
        term16688 = newInstance(Class.forName("java.util.stream.LongPipeline$4"));
        setField(term16688, term16688.getClass(), "val$mapper", null);
        setField(term16688, term16688.getClass(), "this$0", null);
        setField(term16688, term16688.getClass(), "sourceStage", null);
        setField(term16688, term16688.getClass(), "previousStage", null);
        setIntField(term16688, term16688.getClass(), "sourceOrOpFlags", 0);
        setField(term16688, term16688.getClass(), "nextStage", null);
        setIntField(term16688, term16688.getClass(), "depth", 0);
        setIntField(term16688, term16688.getClass(), "combinedFlags", 0);
        setField(term16688, term16688.getClass(), "sourceSpliterator", null);
        setField(term16688, term16688.getClass(), "sourceSupplier", null);
        setBooleanField(term16688, term16688.getClass(), "linkedOrConsumed", false);
        setBooleanField(term16688, term16688.getClass(), "sourceAnyStateful", false);
        setField(term16688, term16688.getClass(), "sourceCloseAction", null);
        setBooleanField(term16688, term16688.getClass(), "parallel", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term16653;
        Object retValue = callMethod(klass, "equals", argTypes, term16585, args);
        assertTrue(recursiveEquals(term16585, term16687));
        assertTrue(recursiveEquals(term16653, term16688));
        assertTrue(recursiveEquals(retValue, false));
    }

};


