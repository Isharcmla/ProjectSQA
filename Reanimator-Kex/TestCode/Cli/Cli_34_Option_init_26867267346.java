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
import java.lang.Boolean;
import java.util.ArrayList;

public class Option_init_26867267346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115;
     Object term4795;

    public Option_init_26867267346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115 = new Boolean(false);
        ArrayList term4802 = new ArrayList();
        term4795 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term4795, term4795.getClass(), "opt", "jJCZpVmanW");
        setField(term4795, term4795.getClass(), "longOpt", "EGtDIRbSSb");
        setField(term4795, term4795.getClass(), "argName", null);
        setField(term4795, term4795.getClass(), "description", "SzjVpOQTyS");
        setBooleanField(term4795, term4795.getClass(), "required", false);
        setBooleanField(term4795, term4795.getClass(), "optionalArg", false);
        setIntField(term4795, term4795.getClass(), "numberOfArgs", -1);
        setField(term4795, term4795.getClass(), "type", null);
        setField(term4795, term4795.getClass(), "values", term4802);
        setCharField(term4795, term4795.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = "jJCZpVmanW";
        args[1] = "EGtDIRbSSb";
        args[2] = term115;
        args[3] = "SzjVpOQTyS";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4795));
        assertTrue(recursiveEquals(term115, false));
    }

};


