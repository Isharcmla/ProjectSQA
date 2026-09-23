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

public class Option_add_1254905744249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44394;
     Object term44463;

    public Option_add_1254905744249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term44446 = new ArrayList();
        term44394 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term44394, term44394.getClass(), "numberOfArgs", -2);
        setField(term44394, term44394.getClass(), "values", term44446);
        ArrayList term44464 = new ArrayList();
        ((ArrayList) term44464).add((Object)null);
        term44463 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term44463, term44463.getClass(), "opt", null);
        setField(term44463, term44463.getClass(), "longOpt", null);
        setField(term44463, term44463.getClass(), "argName", null);
        setField(term44463, term44463.getClass(), "description", null);
        setBooleanField(term44463, term44463.getClass(), "required", false);
        setBooleanField(term44463, term44463.getClass(), "optionalArg", false);
        setIntField(term44463, term44463.getClass(), "numberOfArgs", -2);
        setField(term44463, term44463.getClass(), "type", null);
        setField(term44463, term44463.getClass(), "values", term44464);
        setCharField(term44463, term44463.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "add", argTypes, term44394, args);
        assertTrue(recursiveEquals(term44394, term44463));
    }

};


