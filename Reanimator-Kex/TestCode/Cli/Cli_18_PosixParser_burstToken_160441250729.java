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

public class PosixParser_burstToken_160441250729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9142;

    public PosixParser_burstToken_160441250729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term9256 = new HashMap();
        HashMap term9408 = new HashMap();
        term9142 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term9208 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        Object term9576 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setField(term9208, term9208.getClass(), "shortOpts", term9256);
        setField(term9208, term9208.getClass(), "longOpts", term9408);
        setField(term9142, term9142.getClass(), "options", term9208);
        setIntField(term9576, term9576.getClass(), "numberOfArgs", -2);
        setField(term9142, term9142.getClass(), "currentOption", term9576);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "                                                                 ";
        args[1] = true;
        try {
            callMethod(klass, "burstToken", argTypes, term9142, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


