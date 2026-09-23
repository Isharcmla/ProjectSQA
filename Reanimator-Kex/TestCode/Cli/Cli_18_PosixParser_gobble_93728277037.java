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

public class PosixParser_gobble_93728277037 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10927;
     Object term10983;

    public PosixParser_gobble_93728277037() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10927 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term10927, term10927.getClass(), "eatTheRest", true);
        term10983 = newInstance(Class.forName("java.util.Arrays$ArrayItr"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = term10983;
        try {
            callMethod(klass, "gobble", argTypes, term10927, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


