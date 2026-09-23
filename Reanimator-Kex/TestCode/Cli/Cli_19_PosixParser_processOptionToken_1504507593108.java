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

public class PosixParser_processOptionToken_1504507593108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51220;

    public PosixParser_processOptionToken_1504507593108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51220 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term51286 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term51286, term51286.getClass(), "shortOpts", null);
        setField(term51220, term51220.getClass(), "options", term51286);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ";
        args[1] = false;
        try {
            callMethod(klass, "processOptionToken", argTypes, term51220, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


