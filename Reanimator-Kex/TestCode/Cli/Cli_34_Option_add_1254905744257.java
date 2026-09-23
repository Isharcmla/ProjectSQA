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

public class Option_add_1254905744257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55465;
     Object term55534;

    public Option_add_1254905744257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term55517 = new ArrayList();
        term55465 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term55465, term55465.getClass(), "numberOfArgs", -2);
        setField(term55465, term55465.getClass(), "values", term55517);
        ArrayList term55535 = new ArrayList();
        ((ArrayList) term55535).add((Object)null);
        term55534 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term55534, term55534.getClass(), "opt", null);
        setField(term55534, term55534.getClass(), "longOpt", null);
        setField(term55534, term55534.getClass(), "argName", null);
        setField(term55534, term55534.getClass(), "description", null);
        setBooleanField(term55534, term55534.getClass(), "required", false);
        setBooleanField(term55534, term55534.getClass(), "optionalArg", false);
        setIntField(term55534, term55534.getClass(), "numberOfArgs", -2);
        setField(term55534, term55534.getClass(), "type", null);
        setField(term55534, term55534.getClass(), "values", term55535);
        setCharField(term55534, term55534.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term55465, args);
        assertTrue(recursiveEquals(term55465, term55534));
    }

};


