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
import java.lang.Object;

public class Option_getValues_104491653235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46001;
     Object term46120;
     Object term46113;

    public Option_getValues_104491653235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term46053 = new ArrayList();
        ((ArrayList) term46053).add("byte");
        term46001 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term46001, term46001.getClass(), "values", term46053);
        ArrayList term46121 = new ArrayList();
        ((ArrayList) term46121).add("byte");
        term46120 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term46120, term46120.getClass(), "opt", null);
        setField(term46120, term46120.getClass(), "longOpt", null);
        setField(term46120, term46120.getClass(), "argName", null);
        setField(term46120, term46120.getClass(), "description", null);
        setBooleanField(term46120, term46120.getClass(), "required", false);
        setBooleanField(term46120, term46120.getClass(), "optionalArg", false);
        setIntField(term46120, term46120.getClass(), "numberOfArgs", 0);
        setField(term46120, term46120.getClass(), "type", null);
        setField(term46120, term46120.getClass(), "values", term46121);
        setCharField(term46120, term46120.getClass(), "valuesep", (char) 0);
        term46113 = (Object[]) newArray("java.lang.String", 1);
        setElement(term46113, 0, "byte");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValues", argTypes, term46001, args);
        assertTrue(recursiveEquals(term46001, term46120));
        assertTrue(recursiveEquals(retValue, term46113));
    }

};


