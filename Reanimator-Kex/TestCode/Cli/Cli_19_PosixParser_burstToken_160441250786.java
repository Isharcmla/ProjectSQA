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

public class PosixParser_burstToken_160441250786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42645;

    public PosixParser_burstToken_160441250786() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term42759 = new HashMap();
        term42645 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term42711 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term42711, term42711.getClass(), "shortOpts", term42759);
        setField(term42711, term42711.getClass(), "longOpts", null);
        setField(term42645, term42645.getClass(), "options", term42711);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "\b \b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b\b";
        args[1] = false;
        try {
            callMethod(klass, "burstToken", argTypes, term42645, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


