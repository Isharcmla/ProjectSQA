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

public class DefaultParser_init_18173576124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4659;

    public DefaultParser_init_18173576124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4659 = newInstance(Class.forName("org.apache.commons.cli.DefaultParser"));
        setField(term4659, term4659.getClass(), "cmd", null);
        setField(term4659, term4659.getClass(), "options", null);
        setBooleanField(term4659, term4659.getClass(), "stopAtNonOption", false);
        setField(term4659, term4659.getClass(), "currentToken", null);
        setField(term4659, term4659.getClass(), "currentOption", null);
        setBooleanField(term4659, term4659.getClass(), "skipParsing", false);
        setField(term4659, term4659.getClass(), "expectedOpts", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.DefaultParser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term4659));
    }

};


