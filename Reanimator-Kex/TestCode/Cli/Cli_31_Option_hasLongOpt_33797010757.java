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

public class Option_hasLongOpt_33797010757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1066;
     Object term6653;

    public Option_hasLongOpt_33797010757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1119 = new ArrayList();
        term1066 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term1118 = newInstance(Class.forName("java.lang.Object"));
        setField(term1066, term1066.getClass(), "opt", "BndsHwAFMv");
        setField(term1066, term1066.getClass(), "longOpt", "GzFkzHGYFt");
        setField(term1066, term1066.getClass(), "argName", "tShwQLRGNe");
        setField(term1066, term1066.getClass(), "description", "LvtrsXUliU");
        setBooleanField(term1066, term1066.getClass(), "required", true);
        setBooleanField(term1066, term1066.getClass(), "optionalArg", true);
        setIntField(term1066, term1066.getClass(), "numberOfArgs", -1339778481);
        setField(term1066, term1066.getClass(), "type", term1118);
        setField(term1066, term1066.getClass(), "values", term1119);
        setCharField(term1066, term1066.getClass(), "valuesep", 'D');
        ArrayList term6663 = new ArrayList();
        term6653 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term6662 = newInstance(Class.forName("java.lang.Object"));
        setField(term6653, term6653.getClass(), "opt", "BndsHwAFMv");
        setField(term6653, term6653.getClass(), "longOpt", "GzFkzHGYFt");
        setField(term6653, term6653.getClass(), "argName", "tShwQLRGNe");
        setField(term6653, term6653.getClass(), "description", "LvtrsXUliU");
        setBooleanField(term6653, term6653.getClass(), "required", true);
        setBooleanField(term6653, term6653.getClass(), "optionalArg", true);
        setIntField(term6653, term6653.getClass(), "numberOfArgs", -1339778481);
        setField(term6653, term6653.getClass(), "type", term6662);
        setField(term6653, term6653.getClass(), "values", term6663);
        setCharField(term6653, term6653.getClass(), "valuesep", 'D');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hasLongOpt", argTypes, term1066, args);
        assertTrue(recursiveEquals(term1066, term6653));
        assertTrue(recursiveEquals(retValue, true));
    }

};


