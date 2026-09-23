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

public class Option_getKey_1185522764111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15071;
     Object term15096;

    public Option_getKey_1185522764111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15071 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term15071, term15071.getClass(), "opt", null);
        term15096 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term15096, term15096.getClass(), "opt", null);
        setField(term15096, term15096.getClass(), "longOpt", null);
        setField(term15096, term15096.getClass(), "argName", null);
        setField(term15096, term15096.getClass(), "description", null);
        setBooleanField(term15096, term15096.getClass(), "required", false);
        setBooleanField(term15096, term15096.getClass(), "optionalArg", false);
        setIntField(term15096, term15096.getClass(), "numberOfArgs", 0);
        setField(term15096, term15096.getClass(), "type", null);
        setField(term15096, term15096.getClass(), "values", null);
        setCharField(term15096, term15096.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getKey", argTypes, term15071, args);
        assertTrue(recursiveEquals(term15071, term15096));
        assertTrue(recursiveEquals(retValue, null));
    }

};


