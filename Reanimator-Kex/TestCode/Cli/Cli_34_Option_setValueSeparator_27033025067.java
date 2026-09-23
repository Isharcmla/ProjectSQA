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
import java.lang.Character;

public class Option_setValueSeparator_27033025067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2171;
     Object term2228;
     Object term8163;

    public Option_setValueSeparator_27033025067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2223 = new ArrayList();
        term2171 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term2171, term2171.getClass(), "opt", "swZVeJAxjt");
        setField(term2171, term2171.getClass(), "longOpt", "xOcJIiQQDu");
        setField(term2171, term2171.getClass(), "argName", "GVizqqzXpy");
        setField(term2171, term2171.getClass(), "description", "JqXGgAhZPl");
        setBooleanField(term2171, term2171.getClass(), "required", false);
        setBooleanField(term2171, term2171.getClass(), "optionalArg", true);
        setIntField(term2171, term2171.getClass(), "numberOfArgs", -6029667);
        setField(term2171, term2171.getClass(), "type", null);
        setField(term2171, term2171.getClass(), "values", term2223);
        setCharField(term2171, term2171.getClass(), "valuesep", 'M');
        term2228 = new Character('u');
        ArrayList term8172 = new ArrayList();
        term8163 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term8163, term8163.getClass(), "opt", "swZVeJAxjt");
        setField(term8163, term8163.getClass(), "longOpt", "xOcJIiQQDu");
        setField(term8163, term8163.getClass(), "argName", "GVizqqzXpy");
        setField(term8163, term8163.getClass(), "description", "JqXGgAhZPl");
        setBooleanField(term8163, term8163.getClass(), "required", false);
        setBooleanField(term8163, term8163.getClass(), "optionalArg", true);
        setIntField(term8163, term8163.getClass(), "numberOfArgs", -6029667);
        setField(term8163, term8163.getClass(), "type", null);
        setField(term8163, term8163.getClass(), "values", term8172);
        setCharField(term8163, term8163.getClass(), "valuesep", 'u');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term2228;
        callMethod(klass, "setValueSeparator", argTypes, term2171, args);
        assertTrue(recursiveEquals(term2171, term8163));
        assertTrue(recursiveEquals(term2228, 'u'));
    }

};


