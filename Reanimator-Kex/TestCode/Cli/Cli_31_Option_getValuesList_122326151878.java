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

public class Option_getValuesList_122326151878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3362;
     Object term10706;
     Object term10648;

    public Option_getValuesList_122326151878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3415 = new ArrayList();
        term3362 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term3414 = newInstance(Class.forName("java.lang.Object"));
        setField(term3362, term3362.getClass(), "opt", "PznxWXsZME");
        setField(term3362, term3362.getClass(), "longOpt", "ZzIujlwVsw");
        setField(term3362, term3362.getClass(), "argName", "LWyEaeIyAo");
        setField(term3362, term3362.getClass(), "description", "yVMkkQhvmN");
        setBooleanField(term3362, term3362.getClass(), "required", true);
        setBooleanField(term3362, term3362.getClass(), "optionalArg", true);
        setIntField(term3362, term3362.getClass(), "numberOfArgs", -226514366);
        setField(term3362, term3362.getClass(), "type", term3414);
        setField(term3362, term3362.getClass(), "values", term3415);
        setCharField(term3362, term3362.getClass(), "valuesep", 't');
        ArrayList term10716 = new ArrayList();
        term10706 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term10715 = newInstance(Class.forName("java.lang.Object"));
        setField(term10706, term10706.getClass(), "opt", "PznxWXsZME");
        setField(term10706, term10706.getClass(), "longOpt", "ZzIujlwVsw");
        setField(term10706, term10706.getClass(), "argName", "LWyEaeIyAo");
        setField(term10706, term10706.getClass(), "description", "yVMkkQhvmN");
        setBooleanField(term10706, term10706.getClass(), "required", true);
        setBooleanField(term10706, term10706.getClass(), "optionalArg", true);
        setIntField(term10706, term10706.getClass(), "numberOfArgs", -226514366);
        setField(term10706, term10706.getClass(), "type", term10715);
        setField(term10706, term10706.getClass(), "values", term10716);
        setCharField(term10706, term10706.getClass(), "valuesep", 't');
        term10648 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getValuesList", argTypes, term3362, args);
        assertTrue(recursiveEquals(term3362, term10706));
        assertTrue(recursiveEquals(retValue, term10648));
    }

};


