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
import static org.apache.commons.cli.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.cli.EqualityUtils.*;

public class PosixParser_gobble_93728277053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29476;
     Object term29480;

    public PosixParser_gobble_93728277053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29476 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setBooleanField(term29476, term29476.getClass(), "eatTheRest", false);
        term29480 = newInstance(Class.forName("org.apache.commons.cli.PosixParser"));
        setField(term29480, term29480.getClass(), "tokens", null);
        setBooleanField(term29480, term29480.getClass(), "eatTheRest", false);
        setField(term29480, term29480.getClass(), "currentOption", null);
        setField(term29480, term29480.getClass(), "options", null);
        setField(term29480, term29480.getClass(), "cmd", null);
        setField(term29480, term29480.getClass(), "requiredOptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.PosixParser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Iterator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "gobble", argTypes, term29476, args);
        assertTrue(recursiveEquals(term29476, term29480));
    }

};


