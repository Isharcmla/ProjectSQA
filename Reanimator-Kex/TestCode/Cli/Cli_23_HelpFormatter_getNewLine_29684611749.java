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

public class HelpFormatter_getNewLine_29684611749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term438;
     Object term6410;

    public HelpFormatter_getNewLine_29684611749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term438 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term466 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term438, term438.getClass(), "defaultWidth", 74);
        setIntField(term438, term438.getClass(), "defaultLeftPad", 1);
        setIntField(term438, term438.getClass(), "defaultDescPad", 3);
        setField(term438, term438.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term438, term438.getClass(), "defaultNewLine", "\n");
        setField(term438, term438.getClass(), "defaultOptPrefix", "-");
        setField(term438, term438.getClass(), "defaultLongOptPrefix", "--");
        setField(term438, term438.getClass(), "defaultArgName", "arg");
        setField(term438, term438.getClass(), "optionComparator", term466);
        term6410 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term6421 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term6410, term6410.getClass(), "defaultWidth", 74);
        setIntField(term6410, term6410.getClass(), "defaultLeftPad", 1);
        setIntField(term6410, term6410.getClass(), "defaultDescPad", 3);
        setField(term6410, term6410.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6410, term6410.getClass(), "defaultNewLine", "\n");
        setField(term6410, term6410.getClass(), "defaultOptPrefix", "-");
        setField(term6410, term6410.getClass(), "defaultLongOptPrefix", "--");
        setField(term6410, term6410.getClass(), "defaultArgName", "arg");
        setField(term6410, term6410.getClass(), "optionComparator", term6421);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNewLine", argTypes, term438, args);
        assertTrue(recursiveEquals(term438, term6410));
        assertTrue(recursiveEquals(retValue, "\n"));
    }

};


