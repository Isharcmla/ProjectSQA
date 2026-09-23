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

public class PosixParser_gobble_93728277019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3465;
     Object term3517;

    public PosixParser_gobble_93728277019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3465 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term3465, term3465.getClass(), "eatTheRest", true);
        term3517 = newInstance(Class.forName("java.util.Enumeration$1"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term3517;
        try {
            callMethod(klass, "gobble", argTypes, term3465, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


