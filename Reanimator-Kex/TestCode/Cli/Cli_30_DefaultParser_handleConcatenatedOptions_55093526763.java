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

public class DefaultParser_handleConcatenatedOptions_55093526763 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term335497;

    public DefaultParser_handleConcatenatedOptions_55093526763() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term335611 = new HashMap();
        HashMap term335763 = new HashMap();
        term335497 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        Object term335563 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term335563, term335563.getClass(), "shortOpts", term335611);
        setField(term335563, term335563.getClass(), "longOpts", term335763);
        setField(term335497, term335497.getClass(), "options", term335563);
        setBooleanField(term335497, term335497.getClass(), "stopAtNonOption", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                ";
        try {
            callMethod(klass, "handleConcatenatedOptions", argTypes, term335497, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


