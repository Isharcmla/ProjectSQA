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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Character;

public class Option_setValueSeparator_27033025067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2192;
     Object term2250;
     Object term8277;

    public Option_setValueSeparator_27033025067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2245 = new ArrayList();
        term2192 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term2244 = newInstance(Class.forName("java.lang.Object"));
        setField(term2192, term2192.getClass(), "opt", "swZVeJAxjt");
        setField(term2192, term2192.getClass(), "longOpt", "xOcJIiQQDu");
        setField(term2192, term2192.getClass(), "argName", "GVizqqzXpy");
        setField(term2192, term2192.getClass(), "description", "JqXGgAhZPl");
        setBooleanField(term2192, term2192.getClass(), "required", false);
        setBooleanField(term2192, term2192.getClass(), "optionalArg", true);
        setIntField(term2192, term2192.getClass(), "numberOfArgs", -6029667);
        setField(term2192, term2192.getClass(), "type", term2244);
        setField(term2192, term2192.getClass(), "values", term2245);
        setCharField(term2192, term2192.getClass(), "valuesep", 'M');
        term2250 = new Character('u');
        ArrayList term8287 = new ArrayList();
        term8277 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term8286 = newInstance(Class.forName("java.lang.Object"));
        setField(term8277, term8277.getClass(), "opt", "swZVeJAxjt");
        setField(term8277, term8277.getClass(), "longOpt", "xOcJIiQQDu");
        setField(term8277, term8277.getClass(), "argName", "GVizqqzXpy");
        setField(term8277, term8277.getClass(), "description", "JqXGgAhZPl");
        setBooleanField(term8277, term8277.getClass(), "required", false);
        setBooleanField(term8277, term8277.getClass(), "optionalArg", true);
        setIntField(term8277, term8277.getClass(), "numberOfArgs", -6029667);
        setField(term8277, term8277.getClass(), "type", term8286);
        setField(term8277, term8277.getClass(), "values", term8287);
        setCharField(term8277, term8277.getClass(), "valuesep", 'u');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term2250;
        callMethod(klass, "setValueSeparator", argTypes, term2192, args);
        assertTrue(recursiveEquals(term2192, term8277));
        assertTrue(recursiveEquals(term2250, 'u'));
    }

};


