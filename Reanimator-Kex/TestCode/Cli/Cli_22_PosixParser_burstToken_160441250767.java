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

public class PosixParser_burstToken_160441250767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18783;

    public PosixParser_burstToken_160441250767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term18897 = new HashMap();
        HashMap term19049 = new HashMap();
        term18783 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term18849 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term18849, term18849.getClass(), "shortOpts", term18897);
        setField(term18849, term18849.getClass(), "longOpts", term19049);
        setField(term18783, term18783.getClass(), "options", term18849);
        setField(term18783, term18783.getClass(), "tokens", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010\u0010";
        args[1] = false;
        try {
            callMethod(klass, "burstToken", argTypes, term18783, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


