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

public class PosixParser_burstToken_160441250721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4378;

    public PosixParser_burstToken_160441250721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4492 = new HashMap();
        HashMap term4644 = new HashMap();
        term4378 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term4444 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term4444, term4444.getClass(), "shortOpts", term4492);
        setField(term4444, term4444.getClass(), "longOpts", term4644);
        setField(term4378, term4378.getClass(), "options", term4444);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ";
        args[1] = true;
        try {
            callMethod(klass, "burstToken", argTypes, term4378, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


