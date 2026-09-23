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
import java.lang.Boolean;

public class Option_setRequired_194114341361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1563;
     Object term1620;
     Object term7210;

    public Option_setRequired_194114341361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1615 = new ArrayList();
        term1563 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term1563, term1563.getClass(), "opt", "uWHnvSvaPl");
        setField(term1563, term1563.getClass(), "longOpt", "kBdSllIBVz");
        setField(term1563, term1563.getClass(), "argName", "TJmVBGfTML");
        setField(term1563, term1563.getClass(), "description", "tPlsykYBqO");
        setBooleanField(term1563, term1563.getClass(), "required", true);
        setBooleanField(term1563, term1563.getClass(), "optionalArg", true);
        setIntField(term1563, term1563.getClass(), "numberOfArgs", 1585847225);
        setField(term1563, term1563.getClass(), "type", null);
        setField(term1563, term1563.getClass(), "values", term1615);
        setCharField(term1563, term1563.getClass(), "valuesep", 'A');
        term1620 = new Boolean(true);
        ArrayList term7219 = new ArrayList();
        term7210 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term7210, term7210.getClass(), "opt", "uWHnvSvaPl");
        setField(term7210, term7210.getClass(), "longOpt", "kBdSllIBVz");
        setField(term7210, term7210.getClass(), "argName", "TJmVBGfTML");
        setField(term7210, term7210.getClass(), "description", "tPlsykYBqO");
        setBooleanField(term7210, term7210.getClass(), "required", true);
        setBooleanField(term7210, term7210.getClass(), "optionalArg", true);
        setIntField(term7210, term7210.getClass(), "numberOfArgs", 1585847225);
        setField(term7210, term7210.getClass(), "type", null);
        setField(term7210, term7210.getClass(), "values", term7219);
        setCharField(term7210, term7210.getClass(), "valuesep", 'A');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term1620;
        callMethod(klass, "setRequired", argTypes, term1563, args);
        assertTrue(recursiveEquals(term1563, term7210));
        assertTrue(recursiveEquals(term1620, true));
    }

};


