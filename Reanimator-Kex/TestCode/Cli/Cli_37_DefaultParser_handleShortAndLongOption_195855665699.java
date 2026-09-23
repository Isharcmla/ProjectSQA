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

public class DefaultParser_handleShortAndLongOption_195855665699 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term366887;

    public DefaultParser_handleShortAndLongOption_195855665699() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term367013 = new LinkedHashMap();
        LinkedHashMap term367177 = new LinkedHashMap();
        term366887 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term366953 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term366953, term366953.getClass(), "shortOpts", term367013);
        setField(term366953, term366953.getClass(), "longOpts", term367177);
        setField(term366887, term366887.getClass(), "options", term366953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "     ";
        try {
            callMethod(klass, "handleShortAndLongOption", argTypes, term366887, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


