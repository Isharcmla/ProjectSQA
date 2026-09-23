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
import java.util.LinkedHashMap;

public class DefaultParser_parse_1057713382110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term375279;
     Object term375447;
     Object term374950;

    public DefaultParser_parse_1057713382110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term375279 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term375343 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term375279, term375279.getClass(), "options", null);
        setBooleanField(term375279, term375279.getClass(), "stopAtNonOption", false);
        setBooleanField(term375279, term375279.getClass(), "skipParsing", false);
        setField(term375279, term375279.getClass(), "currentOption", term375343);
        setField(term375279, term375279.getClass(), "expectedOpts", null);
        setField(term375279, term375279.getClass(), "cmd", null);
        setField(term375279, term375279.getClass(), "currentToken", "");
        ArrayList term375499 = new ArrayList();
        LinkedHashMap term375559 = new LinkedHashMap();
        term375447 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term375447, term375447.getClass(), "requiredOpts", term375499);
        setField(term375447, term375447.getClass(), "optionGroups", term375559);
        term374950 = (Object[]) newArray("java.lang.String", 8);
        setElement(term374950, 0, "");
        setElement(term374950, 1, "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.cli.Options");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term375447;
        args[1] = term374950;
        args[2] = false;
        try {
            callMethod(klass, "parse", argTypes, term375279, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


