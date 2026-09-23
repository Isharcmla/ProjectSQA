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

public class Option_hasArg_142394540257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1153;
     Object term6559;

    public Option_hasArg_142394540257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1205 = new ArrayList();
        term1153 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term1153, term1153.getClass(), "opt", "xLbjWUgOIL");
        setField(term1153, term1153.getClass(), "longOpt", "jDtqGUpnZN");
        setField(term1153, term1153.getClass(), "argName", "nGKItKLYNC");
        setField(term1153, term1153.getClass(), "description", "UiUYnPrcCi");
        setBooleanField(term1153, term1153.getClass(), "required", true);
        setBooleanField(term1153, term1153.getClass(), "optionalArg", true);
        setIntField(term1153, term1153.getClass(), "numberOfArgs", 1725571209);
        setField(term1153, term1153.getClass(), "type", null);
        setField(term1153, term1153.getClass(), "values", term1205);
        setCharField(term1153, term1153.getClass(), "valuesep", 's');
        ArrayList term6568 = new ArrayList();
        term6559 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term6559, term6559.getClass(), "opt", "xLbjWUgOIL");
        setField(term6559, term6559.getClass(), "longOpt", "jDtqGUpnZN");
        setField(term6559, term6559.getClass(), "argName", "nGKItKLYNC");
        setField(term6559, term6559.getClass(), "description", "UiUYnPrcCi");
        setBooleanField(term6559, term6559.getClass(), "required", true);
        setBooleanField(term6559, term6559.getClass(), "optionalArg", true);
        setIntField(term6559, term6559.getClass(), "numberOfArgs", 1725571209);
        setField(term6559, term6559.getClass(), "type", null);
        setField(term6559, term6559.getClass(), "values", term6568);
        setCharField(term6559, term6559.getClass(), "valuesep", 's');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasArg", argTypes, term1153, args);
        assertTrue(recursiveEquals(term1153, term6559));
        assertTrue(recursiveEquals(retValue, true));
    }

};


