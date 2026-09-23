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
import java.lang.Integer;

public class HelpFormatter_setDescPadding_143291028246 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term193;
     Object term225;
     Object term6301;

    public HelpFormatter_setDescPadding_143291028246() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term193 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term224 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term193, term193.getClass(), "defaultWidth", 74);
        setIntField(term193, term193.getClass(), "defaultLeftPad", 1);
        setIntField(term193, term193.getClass(), "defaultDescPad", 3);
        setField(term193, term193.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term193, term193.getClass(), "defaultNewLine", "\n");
        setField(term193, term193.getClass(), "defaultOptPrefix", "-");
        setField(term193, term193.getClass(), "defaultLongOptPrefix", "--");
        setField(term193, term193.getClass(), "longOptSeparator", " ");
        setField(term193, term193.getClass(), "defaultArgName", "arg");
        setField(term193, term193.getClass(), "optionComparator", term224);
        term225 = new Integer(1484323161);
        term6301 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term6314 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term6301, term6301.getClass(), "defaultWidth", 74);
        setIntField(term6301, term6301.getClass(), "defaultLeftPad", 1);
        setIntField(term6301, term6301.getClass(), "defaultDescPad", 1484323161);
        setField(term6301, term6301.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6301, term6301.getClass(), "defaultNewLine", "\n");
        setField(term6301, term6301.getClass(), "defaultOptPrefix", "-");
        setField(term6301, term6301.getClass(), "defaultLongOptPrefix", "--");
        setField(term6301, term6301.getClass(), "longOptSeparator", " ");
        setField(term6301, term6301.getClass(), "defaultArgName", "arg");
        setField(term6301, term6301.getClass(), "optionComparator", term6314);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term225;
        callMethod(klass, "setDescPadding", argTypes, term193, args);
        assertTrue(recursiveEquals(term193, term6301));
        assertTrue(recursiveEquals(term225, 1484323161));
    }

};


