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

public class HelpFormatter_init_195263855237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5452;

    public HelpFormatter_init_195263855237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5452 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term5452, term5452.getClass(), "defaultWidth", 74);
        setIntField(term5452, term5452.getClass(), "defaultLeftPad", 1);
        setIntField(term5452, term5452.getClass(), "defaultDescPad", 3);
        setField(term5452, term5452.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term5452, term5452.getClass(), "defaultNewLine", "\n");
        setField(term5452, term5452.getClass(), "defaultOptPrefix", "-");
        setField(term5452, term5452.getClass(), "defaultLongOptPrefix", "--");
        setField(term5452, term5452.getClass(), "defaultArgName", "arg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5452));
    }

};


