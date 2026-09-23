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
     Object term4344;

    public PosixParser_burstToken_160441250721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term4458 = new HashMap();
        HashMap term4610 = new HashMap();
        term4344 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term4410 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term4778 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term4410, term4410.getClass(), "shortOpts", term4458);
        setField(term4410, term4410.getClass(), "longOpts", term4610);
        setField(term4344, term4344.getClass(), "options", term4410);
        setIntField(term4778, term4778.getClass(), "numberOfArgs", 1);
        setField(term4344, term4344.getClass(), "currentOption", term4778);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "        ";
        args[1] = true;
        try {
            callMethod(klass, "burstToken", argTypes, term4344, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


