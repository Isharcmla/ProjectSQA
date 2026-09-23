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

public class HelpFormatter_setOptPrefix_206729858248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471;
     Object term6314;

    public HelpFormatter_setOptPrefix_206729858248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term471 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term471, term471.getClass(), "defaultWidth", 74);
        setIntField(term471, term471.getClass(), "defaultLeftPad", 1);
        setIntField(term471, term471.getClass(), "defaultDescPad", 3);
        setField(term471, term471.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term471, term471.getClass(), "defaultNewLine", "\n");
        setField(term471, term471.getClass(), "defaultOptPrefix", "-");
        setField(term471, term471.getClass(), "defaultLongOptPrefix", "--");
        setField(term471, term471.getClass(), "defaultArgName", "arg");
        term6314 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term6314, term6314.getClass(), "defaultWidth", 74);
        setIntField(term6314, term6314.getClass(), "defaultLeftPad", 1);
        setIntField(term6314, term6314.getClass(), "defaultDescPad", 3);
        setField(term6314, term6314.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6314, term6314.getClass(), "defaultNewLine", "\n");
        setField(term6314, term6314.getClass(), "defaultOptPrefix", "MuLcgQHgqz");
        setField(term6314, term6314.getClass(), "defaultLongOptPrefix", "--");
        setField(term6314, term6314.getClass(), "defaultArgName", "arg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MuLcgQHgqz";
        callMethod(klass, "setOptPrefix", argTypes, term471, args);
        assertTrue(recursiveEquals(term471, term6314));
    }

};


