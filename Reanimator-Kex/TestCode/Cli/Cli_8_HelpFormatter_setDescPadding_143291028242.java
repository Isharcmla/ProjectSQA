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
import java.lang.Integer;

public class HelpFormatter_setDescPadding_143291028242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173;
     Object term201;
     Object term5778;

    public HelpFormatter_setDescPadding_143291028242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term173, term173.getClass(), "defaultWidth", 74);
        setIntField(term173, term173.getClass(), "defaultLeftPad", 1);
        setIntField(term173, term173.getClass(), "defaultDescPad", 3);
        setField(term173, term173.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term173, term173.getClass(), "defaultNewLine", "\n");
        setField(term173, term173.getClass(), "defaultOptPrefix", "-");
        setField(term173, term173.getClass(), "defaultLongOptPrefix", "--");
        setField(term173, term173.getClass(), "defaultArgName", "arg");
        term201 = new Integer(1484323161);
        term5778 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term5778, term5778.getClass(), "defaultWidth", 74);
        setIntField(term5778, term5778.getClass(), "defaultLeftPad", 1);
        setIntField(term5778, term5778.getClass(), "defaultDescPad", 1484323161);
        setField(term5778, term5778.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term5778, term5778.getClass(), "defaultNewLine", "\n");
        setField(term5778, term5778.getClass(), "defaultOptPrefix", "-");
        setField(term5778, term5778.getClass(), "defaultLongOptPrefix", "--");
        setField(term5778, term5778.getClass(), "defaultArgName", "arg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term201;
        callMethod(klass, "setDescPadding", argTypes, term173, args);
        assertTrue(recursiveEquals(term173, term5778));
        assertTrue(recursiveEquals(term201, 1484323161));
    }

};


