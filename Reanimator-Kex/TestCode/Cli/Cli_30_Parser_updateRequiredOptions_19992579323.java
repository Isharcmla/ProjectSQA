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
import java.lang.NullPointerException;
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Parser_updateRequiredOptions_19992579323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term698;

    public Parser_updateRequiredOptions_19992579323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term751 = new ArrayList();
        term698 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        Object term750 = newInstance(Class.forName("java.lang.Object"));
        setField(term698, term698.getClass(), "opt", "eZFUvlxvGV");
        setField(term698, term698.getClass(), "longOpt", "BYqFIqCKAV");
        setField(term698, term698.getClass(), "argName", "vrQLuWIDJX");
        setField(term698, term698.getClass(), "description", "flxyYxBRtu");
        setBooleanField(term698, term698.getClass(), "required", true);
        setBooleanField(term698, term698.getClass(), "optionalArg", true);
        setIntField(term698, term698.getClass(), "numberOfArgs", 1162663216);
        setField(term698, term698.getClass(), "type", term750);
        setField(term698, term698.getClass(), "values", term751);
        setCharField(term698, term698.getClass(), "valuesep", 'A');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.Parser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.cli.Option");
        Object[] args = new Object[1];
        args[0] = term698;
        try {
            callMethod(klass, "updateRequiredOptions", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


