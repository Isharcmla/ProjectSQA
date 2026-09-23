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
import java.util.HashMap;

public class DefaultParser_handleShortAndLongOption_195855665659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55028;

    public DefaultParser_handleShortAndLongOption_195855665659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term55142 = new HashMap();
        HashMap term55294 = new HashMap();
        term55028 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term55094 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term55094, term55094.getClass(), "shortOpts", term55142);
        setField(term55094, term55094.getClass(), "longOpts", term55294);
        setField(term55028, term55028.getClass(), "options", term55094);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "       ";
        try {
            callMethod(klass, "handleShortAndLongOption", argTypes, term55028, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


