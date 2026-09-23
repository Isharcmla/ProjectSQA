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

public class Option_toString_1002693327162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24687;
     Object term24851;

    public Option_toString_1002693327162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24687 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term24687, term24687.getClass(), "opt", null);
        setField(term24687, term24687.getClass(), "longOpt", "");
        setIntField(term24687, term24687.getClass(), "numberOfArgs", -2147483646);
        term24851 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term24851, term24851.getClass(), "opt", null);
        setField(term24851, term24851.getClass(), "longOpt", "");
        setField(term24851, term24851.getClass(), "argName", null);
        setField(term24851, term24851.getClass(), "description", null);
        setBooleanField(term24851, term24851.getClass(), "required", false);
        setBooleanField(term24851, term24851.getClass(), "optionalArg", false);
        setIntField(term24851, term24851.getClass(), "numberOfArgs", -2147483646);
        setField(term24851, term24851.getClass(), "type", null);
        setField(term24851, term24851.getClass(), "values", null);
        setCharField(term24851, term24851.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term24687, args);
        assertTrue(recursiveEquals(term24687, term24851));
        assertTrue(recursiveEquals(retValue, "[ option: null   :: null ]"));
    }

};


