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

public class Option_hashCode_1513453017237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40942;
     Object term40991;

    public Option_hashCode_1513453017237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40942 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term40942, term40942.getClass(), "opt", null);
        setField(term40942, term40942.getClass(), "longOpt", "");
        term40991 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term40991, term40991.getClass(), "opt", null);
        setField(term40991, term40991.getClass(), "longOpt", "");
        setField(term40991, term40991.getClass(), "argName", null);
        setField(term40991, term40991.getClass(), "description", null);
        setBooleanField(term40991, term40991.getClass(), "required", false);
        setBooleanField(term40991, term40991.getClass(), "optionalArg", false);
        setIntField(term40991, term40991.getClass(), "numberOfArgs", 0);
        setField(term40991, term40991.getClass(), "type", null);
        setField(term40991, term40991.getClass(), "values", null);
        setCharField(term40991, term40991.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term40942, args);
        assertTrue(recursiveEquals(term40942, term40991));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


