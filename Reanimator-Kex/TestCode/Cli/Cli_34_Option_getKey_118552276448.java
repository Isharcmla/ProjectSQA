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

public class Option_getKey_118552276448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term256;
     Object term5132;

    public Option_getKey_118552276448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term308 = new ArrayList();
        term256 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term256, term256.getClass(), "opt", "uuaPigETmJ");
        setField(term256, term256.getClass(), "longOpt", "MxlszYVzRf");
        setField(term256, term256.getClass(), "argName", "LQFpaHEwXR");
        setField(term256, term256.getClass(), "description", "oVcInYnLWB");
        setBooleanField(term256, term256.getClass(), "required", true);
        setBooleanField(term256, term256.getClass(), "optionalArg", true);
        setIntField(term256, term256.getClass(), "numberOfArgs", 1162663216);
        setField(term256, term256.getClass(), "type", null);
        setField(term256, term256.getClass(), "values", term308);
        setCharField(term256, term256.getClass(), "valuesep", 'A');
        ArrayList term5141 = new ArrayList();
        term5132 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term5132, term5132.getClass(), "opt", "uuaPigETmJ");
        setField(term5132, term5132.getClass(), "longOpt", "MxlszYVzRf");
        setField(term5132, term5132.getClass(), "argName", "LQFpaHEwXR");
        setField(term5132, term5132.getClass(), "description", "oVcInYnLWB");
        setBooleanField(term5132, term5132.getClass(), "required", true);
        setBooleanField(term5132, term5132.getClass(), "optionalArg", true);
        setIntField(term5132, term5132.getClass(), "numberOfArgs", 1162663216);
        setField(term5132, term5132.getClass(), "type", null);
        setField(term5132, term5132.getClass(), "values", term5141);
        setCharField(term5132, term5132.getClass(), "valuesep", 'A');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getKey", argTypes, term256, args);
        assertTrue(recursiveEquals(term256, term5132));
        assertTrue(recursiveEquals(retValue, "uuaPigETmJ"));
    }

};


