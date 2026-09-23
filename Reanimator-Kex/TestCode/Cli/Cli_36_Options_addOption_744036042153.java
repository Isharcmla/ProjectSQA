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

public class Options_addOption_744036042153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44753;
     Object term44865;
     Object term44927;
     Object term44933;
     Object term44917;

    public Options_addOption_744036042153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term44801 = new HashMap();
        term44753 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term44753, term44753.getClass(), "shortOpts", term44801);
        term44865 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term44865, term44865.getClass(), "opt", "");
        setField(term44865, term44865.getClass(), "longOpt", null);
        setBooleanField(term44865, term44865.getClass(), "required", false);
        HashMap term44928 = new HashMap();
        term44927 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term44927, term44927.getClass(), "shortOpts", term44928);
        setField(term44927, term44927.getClass(), "longOpts", null);
        setField(term44927, term44927.getClass(), "requiredOpts", null);
        setField(term44927, term44927.getClass(), "optionGroups", null);
        term44933 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term44933, term44933.getClass(), "opt", null);
        setField(term44933, term44933.getClass(), "longOpt", null);
        setField(term44933, term44933.getClass(), "argName", null);
        setField(term44933, term44933.getClass(), "description", null);
        setBooleanField(term44933, term44933.getClass(), "required", false);
        setBooleanField(term44933, term44933.getClass(), "optionalArg", false);
        setIntField(term44933, term44933.getClass(), "numberOfArgs", 0);
        setField(term44933, term44933.getClass(), "type", null);
        setField(term44933, term44933.getClass(), "values", null);
        setCharField(term44933, term44933.getClass(), "valuesep", (char) 0);
        HashMap term44918 = new HashMap();
        term44917 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term44917, term44917.getClass(), "shortOpts", term44918);
        setField(term44917, term44917.getClass(), "longOpts", null);
        setField(term44917, term44917.getClass(), "requiredOpts", null);
        setField(term44917, term44917.getClass(), "optionGroups", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Options");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term44865;
        Object retValue = callMethod(klass, "addOption", argTypes, term44753, args);
        assertTrue(recursiveEquals(term44753, term44927));
        assertTrue(recursiveEquals(term44865, term44933));
        assertTrue(recursiveEquals(retValue, term44917));
    }

};


