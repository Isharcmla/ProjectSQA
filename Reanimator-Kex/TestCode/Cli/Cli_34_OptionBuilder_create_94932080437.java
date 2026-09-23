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
import java.lang.Character;
import java.util.ArrayList;

public class OptionBuilder_create_94932080437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77;
     Object term326;

    public OptionBuilder_create_94932080437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77 = new Character('A');
        ArrayList term369 = new ArrayList();
        term326 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term326, term326.getClass(), "opt", "A");
        setField(term326, term326.getClass(), "longOpt", "PAEBtnZtTD");
        setField(term326, term326.getClass(), "argName", "sjlJAEtRrb");
        setField(term326, term326.getClass(), "description", "MuLcgQHgqz");
        setBooleanField(term326, term326.getClass(), "required", false);
        setBooleanField(term326, term326.getClass(), "optionalArg", true);
        setIntField(term326, term326.getClass(), "numberOfArgs", 1162663216);
        setField(term326, term326.getClass(), "type", null);
        setField(term326, term326.getClass(), "values", term369);
        setCharField(term326, term326.getClass(), "valuesep", (char) 61);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term77;
        Object retValue = callMethod(klass, "create", argTypes, null, args);
        assertTrue(recursiveEquals(term77, 'A'));
        assertTrue(recursiveEquals(retValue, term326));
    }

};


