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

public class Option_requiresArg_152196655487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4267;
     Object term12628;

    public Option_requiresArg_152196655487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4320 = new ArrayList();
        term4267 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term4319 = newInstance(Class.forName("java.lang.Object"));
        setField(term4267, term4267.getClass(), "opt", "cudZvLMQon");
        setField(term4267, term4267.getClass(), "longOpt", "lihXWlGDxk");
        setField(term4267, term4267.getClass(), "argName", "JmcmxoGhIK");
        setField(term4267, term4267.getClass(), "description", "jXzmYyrnnT");
        setBooleanField(term4267, term4267.getClass(), "required", true);
        setBooleanField(term4267, term4267.getClass(), "optionalArg", false);
        setIntField(term4267, term4267.getClass(), "numberOfArgs", -602026508);
        setField(term4267, term4267.getClass(), "type", term4319);
        setField(term4267, term4267.getClass(), "values", term4320);
        setCharField(term4267, term4267.getClass(), "valuesep", 'J');
        ArrayList term12638 = new ArrayList();
        term12628 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term12637 = newInstance(Class.forName("java.lang.Object"));
        setField(term12628, term12628.getClass(), "opt", "cudZvLMQon");
        setField(term12628, term12628.getClass(), "longOpt", "lihXWlGDxk");
        setField(term12628, term12628.getClass(), "argName", "JmcmxoGhIK");
        setField(term12628, term12628.getClass(), "description", "jXzmYyrnnT");
        setBooleanField(term12628, term12628.getClass(), "required", true);
        setBooleanField(term12628, term12628.getClass(), "optionalArg", false);
        setIntField(term12628, term12628.getClass(), "numberOfArgs", -602026508);
        setField(term12628, term12628.getClass(), "type", term12637);
        setField(term12628, term12628.getClass(), "values", term12638);
        setCharField(term12628, term12628.getClass(), "valuesep", 'J');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "requiresArg", argTypes, term4267, args);
        assertTrue(recursiveEquals(term4267, term12628));
        assertTrue(recursiveEquals(retValue, false));
    }

};


