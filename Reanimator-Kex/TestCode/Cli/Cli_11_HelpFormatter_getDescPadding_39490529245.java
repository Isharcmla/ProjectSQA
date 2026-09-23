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

public class HelpFormatter_getDescPadding_39490529245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222;
     Object term6023;

    public HelpFormatter_getDescPadding_39490529245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term222 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term250 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term222, term222.getClass(), "defaultWidth", 74);
        setIntField(term222, term222.getClass(), "defaultLeftPad", 1);
        setIntField(term222, term222.getClass(), "defaultDescPad", 3);
        setField(term222, term222.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term222, term222.getClass(), "defaultNewLine", "\n");
        setField(term222, term222.getClass(), "defaultOptPrefix", "-");
        setField(term222, term222.getClass(), "defaultLongOptPrefix", "--");
        setField(term222, term222.getClass(), "defaultArgName", "arg");
        setField(term222, term222.getClass(), "optionComparator", term250);
        term6023 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term6034 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term6023, term6023.getClass(), "defaultWidth", 74);
        setIntField(term6023, term6023.getClass(), "defaultLeftPad", 1);
        setIntField(term6023, term6023.getClass(), "defaultDescPad", 3);
        setField(term6023, term6023.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6023, term6023.getClass(), "defaultNewLine", "\n");
        setField(term6023, term6023.getClass(), "defaultOptPrefix", "-");
        setField(term6023, term6023.getClass(), "defaultLongOptPrefix", "--");
        setField(term6023, term6023.getClass(), "defaultArgName", "arg");
        setField(term6023, term6023.getClass(), "optionComparator", term6034);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDescPadding", argTypes, term222, args);
        assertTrue(recursiveEquals(term222, term6023));
        assertTrue(recursiveEquals(retValue, 3));
    }

};


