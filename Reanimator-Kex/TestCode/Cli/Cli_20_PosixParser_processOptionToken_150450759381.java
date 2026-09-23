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

public class PosixParser_processOptionToken_150450759381 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40146;

    public PosixParser_processOptionToken_150450759381() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term40260 = new HashMap();
        HashMap term40412 = new HashMap();
        term40146 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term40212 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term40212, term40212.getClass(), "shortOpts", term40260);
        setField(term40212, term40212.getClass(), "longOpts", term40412);
        setField(term40146, term40146.getClass(), "options", term40212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = false;
        try {
            callMethod(klass, "processOptionToken", argTypes, term40146, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


