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

public class Option_getValuesList_122326151878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3330;
     Object term10577;
     Object term10520;

    public Option_getValuesList_122326151878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3382 = new ArrayList();
        term3330 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term3330, term3330.getClass(), "opt", "PznxWXsZME");
        setField(term3330, term3330.getClass(), "longOpt", "ZzIujlwVsw");
        setField(term3330, term3330.getClass(), "argName", "LWyEaeIyAo");
        setField(term3330, term3330.getClass(), "description", "yVMkkQhvmN");
        setBooleanField(term3330, term3330.getClass(), "required", true);
        setBooleanField(term3330, term3330.getClass(), "optionalArg", true);
        setIntField(term3330, term3330.getClass(), "numberOfArgs", -226514366);
        setField(term3330, term3330.getClass(), "type", null);
        setField(term3330, term3330.getClass(), "values", term3382);
        setCharField(term3330, term3330.getClass(), "valuesep", 't');
        ArrayList term10586 = new ArrayList();
        term10577 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term10577, term10577.getClass(), "opt", "PznxWXsZME");
        setField(term10577, term10577.getClass(), "longOpt", "ZzIujlwVsw");
        setField(term10577, term10577.getClass(), "argName", "LWyEaeIyAo");
        setField(term10577, term10577.getClass(), "description", "yVMkkQhvmN");
        setBooleanField(term10577, term10577.getClass(), "required", true);
        setBooleanField(term10577, term10577.getClass(), "optionalArg", true);
        setIntField(term10577, term10577.getClass(), "numberOfArgs", -226514366);
        setField(term10577, term10577.getClass(), "type", null);
        setField(term10577, term10577.getClass(), "values", term10586);
        setCharField(term10577, term10577.getClass(), "valuesep", 't');
        term10520 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValuesList", argTypes, term3330, args);
        assertTrue(recursiveEquals(term3330, term10577));
        assertTrue(recursiveEquals(retValue, term10520));
    }

};


