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

public class DefaultParser_handleShortAndLongOption_1958556656116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379244;

    public DefaultParser_handleShortAndLongOption_1958556656116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term379370 = new LinkedHashMap();
        LinkedHashMap term379534 = new LinkedHashMap();
        term379244 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term379310 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term379310, term379310.getClass(), "shortOpts", term379370);
        setField(term379310, term379310.getClass(), "longOpts", term379534);
        setField(term379244, term379244.getClass(), "options", term379310);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "         ";
        try {
            callMethod(klass, "handleShortAndLongOption", argTypes, term379244, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


