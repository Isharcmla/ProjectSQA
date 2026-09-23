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

public class HelpFormatter_getOptionComparator_163888940156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term805;
     Object term7062;
     Object term7033;

    public HelpFormatter_getOptionComparator_163888940156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term805 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term833 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term805, term805.getClass(), "defaultWidth", 74);
        setIntField(term805, term805.getClass(), "defaultLeftPad", 1);
        setIntField(term805, term805.getClass(), "defaultDescPad", 3);
        setField(term805, term805.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term805, term805.getClass(), "defaultNewLine", "\n");
        setField(term805, term805.getClass(), "defaultOptPrefix", "-");
        setField(term805, term805.getClass(), "defaultLongOptPrefix", "--");
        setField(term805, term805.getClass(), "defaultArgName", "arg");
        setField(term805, term805.getClass(), "optionComparator", term833);
        term7062 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term7073 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term7062, term7062.getClass(), "defaultWidth", 74);
        setIntField(term7062, term7062.getClass(), "defaultLeftPad", 1);
        setIntField(term7062, term7062.getClass(), "defaultDescPad", 3);
        setField(term7062, term7062.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term7062, term7062.getClass(), "defaultNewLine", "\n");
        setField(term7062, term7062.getClass(), "defaultOptPrefix", "-");
        setField(term7062, term7062.getClass(), "defaultLongOptPrefix", "--");
        setField(term7062, term7062.getClass(), "defaultArgName", "arg");
        setField(term7062, term7062.getClass(), "optionComparator", term7073);
        term7033 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOptionComparator", argTypes, term805, args);
        assertTrue(recursiveEquals(term805, term7062));
        assertTrue(recursiveEquals(retValue, term7033));
    }

};


