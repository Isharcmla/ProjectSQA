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
import java.lang.Object;

public class HelpFormatter_init_195263855241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5931;

    public HelpFormatter_init_195263855241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5931 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term5944 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term5931, term5931.getClass(), "defaultWidth", 74);
        setIntField(term5931, term5931.getClass(), "defaultLeftPad", 1);
        setIntField(term5931, term5931.getClass(), "defaultDescPad", 3);
        setField(term5931, term5931.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term5931, term5931.getClass(), "defaultNewLine", "\n");
        setField(term5931, term5931.getClass(), "defaultOptPrefix", "-");
        setField(term5931, term5931.getClass(), "defaultLongOptPrefix", "--");
        setField(term5931, term5931.getClass(), "longOptSeparator", " ");
        setField(term5931, term5931.getClass(), "defaultArgName", "arg");
        setField(term5931, term5931.getClass(), "optionComparator", term5944);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term5931));
    }

};


