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

public class Option_hasArg_142394540256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1164;
     Object term6500;

    public Option_hasArg_142394540256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1217 = new ArrayList();
        term1164 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term1216 = newInstance(Class.forName("java.lang.Object"));
        setField(term1164, term1164.getClass(), "opt", "xLbjWUgOIL");
        setField(term1164, term1164.getClass(), "longOpt", "jDtqGUpnZN");
        setField(term1164, term1164.getClass(), "argName", "nGKItKLYNC");
        setField(term1164, term1164.getClass(), "description", "UiUYnPrcCi");
        setBooleanField(term1164, term1164.getClass(), "required", true);
        setBooleanField(term1164, term1164.getClass(), "optionalArg", true);
        setIntField(term1164, term1164.getClass(), "numberOfArgs", 1725571209);
        setField(term1164, term1164.getClass(), "type", term1216);
        setField(term1164, term1164.getClass(), "values", term1217);
        setCharField(term1164, term1164.getClass(), "valuesep", 's');
        ArrayList term6510 = new ArrayList();
        term6500 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term6509 = newInstance(Class.forName("java.lang.Object"));
        setField(term6500, term6500.getClass(), "opt", "xLbjWUgOIL");
        setField(term6500, term6500.getClass(), "longOpt", "jDtqGUpnZN");
        setField(term6500, term6500.getClass(), "argName", "nGKItKLYNC");
        setField(term6500, term6500.getClass(), "description", "UiUYnPrcCi");
        setBooleanField(term6500, term6500.getClass(), "required", true);
        setBooleanField(term6500, term6500.getClass(), "optionalArg", true);
        setIntField(term6500, term6500.getClass(), "numberOfArgs", 1725571209);
        setField(term6500, term6500.getClass(), "type", term6509);
        setField(term6500, term6500.getClass(), "values", term6510);
        setCharField(term6500, term6500.getClass(), "valuesep", 's');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasArg", argTypes, term1164, args);
        assertTrue(recursiveEquals(term1164, term6500));
        assertTrue(recursiveEquals(retValue, true));
    }

};


