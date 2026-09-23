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

public class PosixParser_gobble_93728277045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26773;
     Object term26829;

    public PosixParser_gobble_93728277045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26773 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term26773, term26773.getClass(), "eatTheRest", true);
        term26829 = newInstance(Class.forName("java.util.ServiceLoader$3"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term26829;
        try {
            callMethod(klass, "gobble", argTypes, term26773, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


