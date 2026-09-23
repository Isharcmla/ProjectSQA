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
import java.util.LinkedHashMap;

public class DefaultParser_handleShortAndLongOption_1958556656107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term372478;

    public DefaultParser_handleShortAndLongOption_1958556656107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term372604 = new LinkedHashMap();
        LinkedHashMap term372768 = new LinkedHashMap();
        term372478 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term372544 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term372544, term372544.getClass(), "shortOpts", term372604);
        setField(term372544, term372544.getClass(), "longOpts", term372768);
        setField(term372478, term372478.getClass(), "options", term372544);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "      ";
        try {
            callMethod(klass, "handleShortAndLongOption", argTypes, term372478, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


