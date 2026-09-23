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
     Object term8519;

    public PosixParser_burstToken_160441250721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8633 = new HashMap();
        HashMap term8785 = new HashMap();
        term8519 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term8585 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term8585, term8585.getClass(), "shortOpts", term8633);
        setField(term8585, term8585.getClass(), "longOpts", term8785);
        setField(term8519, term8519.getClass(), "options", term8585);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "  ";
        args[1] = false;
        try {
            callMethod(klass, "burstToken", argTypes, term8519, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


