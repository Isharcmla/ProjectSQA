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

public class Option_hasLongOpt_337970107113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15185;
     Object term15193;

    public Option_hasLongOpt_337970107113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15185 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term15185, term15185.getClass(), "longOpt", null);
        term15193 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term15193, term15193.getClass(), "opt", null);
        setField(term15193, term15193.getClass(), "longOpt", null);
        setField(term15193, term15193.getClass(), "argName", null);
        setField(term15193, term15193.getClass(), "description", null);
        setBooleanField(term15193, term15193.getClass(), "required", false);
        setBooleanField(term15193, term15193.getClass(), "optionalArg", false);
        setIntField(term15193, term15193.getClass(), "numberOfArgs", 0);
        setField(term15193, term15193.getClass(), "type", null);
        setField(term15193, term15193.getClass(), "values", null);
        setCharField(term15193, term15193.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasLongOpt", argTypes, term15185, args);
        assertTrue(recursiveEquals(term15185, term15193));
        assertTrue(recursiveEquals(retValue, false));
    }

};


