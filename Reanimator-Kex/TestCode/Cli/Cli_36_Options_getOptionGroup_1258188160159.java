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
import java.util.HashMap;

public class Options_getOptionGroup_1258188160159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45731;
     Object term45843;
     Object term45856;
     Object term45858;

    public Options_getOptionGroup_1258188160159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term45779 = new HashMap();
        term45731 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term45731, term45731.getClass(), "optionGroups", term45779);
        term45843 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term45843, term45843.getClass(), "opt", null);
        setField(term45843, term45843.getClass(), "longOpt", null);
        HashMap term45857 = new HashMap();
        term45856 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term45856, term45856.getClass(), "shortOpts", null);
        setField(term45856, term45856.getClass(), "longOpts", null);
        setField(term45856, term45856.getClass(), "requiredOpts", null);
        setField(term45856, term45856.getClass(), "optionGroups", term45857);
        term45858 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term45858, term45858.getClass(), "opt", null);
        setField(term45858, term45858.getClass(), "longOpt", null);
        setField(term45858, term45858.getClass(), "argName", null);
        setField(term45858, term45858.getClass(), "description", null);
        setBooleanField(term45858, term45858.getClass(), "required", false);
        setBooleanField(term45858, term45858.getClass(), "optionalArg", false);
        setIntField(term45858, term45858.getClass(), "numberOfArgs", 0);
        setField(term45858, term45858.getClass(), "type", null);
        setField(term45858, term45858.getClass(), "values", null);
        setCharField(term45858, term45858.getClass(), "valuesep", (char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term45843;
        Object retValue = callMethod(klass, "getOptionGroup", argTypes, term45731, args);
        assertTrue(recursiveEquals(term45731, term45856));
        assertTrue(recursiveEquals(term45843, term45858));
        assertTrue(recursiveEquals(retValue, null));
    }

};


