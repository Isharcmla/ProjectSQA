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

public class PosixParser_process_1684650039115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56022;

    public PosixParser_process_1684650039115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56022 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        Object term56086 = newInstance(Class.forName("org.apache.commons.cli.Option"));
        setIntField(term56086, term56086.getClass(), "numberOfArgs", 1);
        setField(term56022, term56022.getClass(), "currentOption", term56086);
        setField(term56022, term56022.getClass(), "tokens", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "process", argTypes, term56022, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


