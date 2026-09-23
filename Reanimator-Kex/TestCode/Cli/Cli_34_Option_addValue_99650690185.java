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
import java.lang.UnsupportedOperationException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;

public class Option_addValue_99650690185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4010;

    public Option_addValue_99650690185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4062 = new ArrayList();
        term4010 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term4010, term4010.getClass(), "opt", "smnHEqRFRx");
        setField(term4010, term4010.getClass(), "longOpt", "XYtryyobou");
        setField(term4010, term4010.getClass(), "argName", "OYbzXylRWW");
        setField(term4010, term4010.getClass(), "description", "DSNsTGYXDF");
        setBooleanField(term4010, term4010.getClass(), "required", false);
        setBooleanField(term4010, term4010.getClass(), "optionalArg", false);
        setIntField(term4010, term4010.getClass(), "numberOfArgs", 1962444399);
        setField(term4010, term4010.getClass(), "type", null);
        setField(term4010, term4010.getClass(), "values", term4062);
        setCharField(term4010, term4010.getClass(), "valuesep", 's');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Option");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sQvGcVjdEx";
        try {
            callMethod(klass, "addValue", argTypes, term4010, args);
            assertTrue(false);
        }
        catch (UnsupportedOperationException e) {
        }

    }

};


