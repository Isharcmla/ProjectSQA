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
import java.lang.Object;
import java.util.ArrayList;

public class OptionBuilder_create_94932080437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78;
     Object term331;

    public OptionBuilder_create_94932080437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78 = new Character('A');
        ArrayList term375 = new ArrayList();
        term331 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term374 = newInstance(Class.forName("java.lang.Object"));
        setField(term331, term331.getClass(), "opt", "A");
        setField(term331, term331.getClass(), "longOpt", "PAEBtnZtTD");
        setField(term331, term331.getClass(), "argName", "sjlJAEtRrb");
        setField(term331, term331.getClass(), "description", "MuLcgQHgqz");
        setBooleanField(term331, term331.getClass(), "required", false);
        setBooleanField(term331, term331.getClass(), "optionalArg", true);
        setIntField(term331, term331.getClass(), "numberOfArgs", 1162663216);
        setField(term331, term331.getClass(), "type", term374);
        setField(term331, term331.getClass(), "values", term375);
        setCharField(term331, term331.getClass(), "valuesep", (char) 61);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.OptionBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term78;
        Object retValue = callMethod(klass, "create", argTypes, null, args);
        assertTrue(recursiveEquals(term78, 'A'));
        assertTrue(recursiveEquals(retValue, term331));
    }

};


