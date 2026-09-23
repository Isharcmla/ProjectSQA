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

public class Option_toString_1002693327291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51862;
     Object term51952;

    public Option_toString_1002693327291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51862 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term51862, term51862.getClass(), "opt", null);
        setField(term51862, term51862.getClass(), "longOpt", "");
        setIntField(term51862, term51862.getClass(), "numberOfArgs", -2147483646);
        setField(term51862, term51862.getClass(), "description", null);
        setField(term51862, term51862.getClass(), "type", "");
        term51952 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term51952, term51952.getClass(), "opt", null);
        setField(term51952, term51952.getClass(), "longOpt", "");
        setField(term51952, term51952.getClass(), "argName", null);
        setField(term51952, term51952.getClass(), "description", null);
        setBooleanField(term51952, term51952.getClass(), "required", false);
        setBooleanField(term51952, term51952.getClass(), "optionalArg", false);
        setIntField(term51952, term51952.getClass(), "numberOfArgs", -2147483646);
        setField(term51952, term51952.getClass(), "type", "");
        setField(term51952, term51952.getClass(), "values", null);
        setCharField(term51952, term51952.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term51862, args);
        assertTrue(recursiveEquals(term51862, term51952));
        assertTrue(recursiveEquals(retValue, "[ option: null   :: null ::  ]"));
    }

};


