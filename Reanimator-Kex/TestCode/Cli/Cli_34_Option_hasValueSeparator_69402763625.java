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
import java.util.ArrayList;

public class Option_hasValueSeparator_69402763625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2367;

    public Option_hasValueSeparator_69402763625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2419 = new ArrayList();
        term2367 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term2367, term2367.getClass(), "opt", "XPKmummaqg");
        setField(term2367, term2367.getClass(), "longOpt", "BKLfkLiZTH");
        setField(term2367, term2367.getClass(), "argName", "SPpkrGcPRr");
        setField(term2367, term2367.getClass(), "description", "sEccwbJKYE");
        setBooleanField(term2367, term2367.getClass(), "required", false);
        setBooleanField(term2367, term2367.getClass(), "optionalArg", true);
        setIntField(term2367, term2367.getClass(), "numberOfArgs", -117576464);
        setField(term2367, term2367.getClass(), "type", null);
        setField(term2367, term2367.getClass(), "values", term2419);
        setCharField(term2367, term2367.getClass(), "valuesep", 'c');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasValueSeparator", argTypes, term2367, args);
    }

};


