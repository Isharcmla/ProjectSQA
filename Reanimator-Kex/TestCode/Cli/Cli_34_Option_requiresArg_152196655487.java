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

public class Option_requiresArg_152196655487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4226;
     Object term12430;

    public Option_requiresArg_152196655487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4278 = new ArrayList();
        term4226 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term4226, term4226.getClass(), "opt", "cudZvLMQon");
        setField(term4226, term4226.getClass(), "longOpt", "lihXWlGDxk");
        setField(term4226, term4226.getClass(), "argName", "JmcmxoGhIK");
        setField(term4226, term4226.getClass(), "description", "jXzmYyrnnT");
        setBooleanField(term4226, term4226.getClass(), "required", true);
        setBooleanField(term4226, term4226.getClass(), "optionalArg", false);
        setIntField(term4226, term4226.getClass(), "numberOfArgs", -602026508);
        setField(term4226, term4226.getClass(), "type", null);
        setField(term4226, term4226.getClass(), "values", term4278);
        setCharField(term4226, term4226.getClass(), "valuesep", 'J');
        ArrayList term12439 = new ArrayList();
        term12430 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term12430, term12430.getClass(), "opt", "cudZvLMQon");
        setField(term12430, term12430.getClass(), "longOpt", "lihXWlGDxk");
        setField(term12430, term12430.getClass(), "argName", "JmcmxoGhIK");
        setField(term12430, term12430.getClass(), "description", "jXzmYyrnnT");
        setBooleanField(term12430, term12430.getClass(), "required", true);
        setBooleanField(term12430, term12430.getClass(), "optionalArg", false);
        setIntField(term12430, term12430.getClass(), "numberOfArgs", -602026508);
        setField(term12430, term12430.getClass(), "type", null);
        setField(term12430, term12430.getClass(), "values", term12439);
        setCharField(term12430, term12430.getClass(), "valuesep", 'J');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "requiresArg", argTypes, term4226, args);
        assertTrue(recursiveEquals(term4226, term12430));
        assertTrue(recursiveEquals(retValue, false));
    }

};


