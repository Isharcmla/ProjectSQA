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

public class HelpFormatter_getWidth_127858542643 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50;
     Object term6070;

    public HelpFormatter_getWidth_127858542643() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term81 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term50, term50.getClass(), "defaultWidth", 74);
        setIntField(term50, term50.getClass(), "defaultLeftPad", 1);
        setIntField(term50, term50.getClass(), "defaultDescPad", 3);
        setField(term50, term50.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term50, term50.getClass(), "defaultNewLine", "\n");
        setField(term50, term50.getClass(), "defaultOptPrefix", "-");
        setField(term50, term50.getClass(), "defaultLongOptPrefix", "--");
        setField(term50, term50.getClass(), "longOptSeparator", " ");
        setField(term50, term50.getClass(), "defaultArgName", "arg");
        setField(term50, term50.getClass(), "optionComparator", term81);
        term6070 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term6083 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term6070, term6070.getClass(), "defaultWidth", 74);
        setIntField(term6070, term6070.getClass(), "defaultLeftPad", 1);
        setIntField(term6070, term6070.getClass(), "defaultDescPad", 3);
        setField(term6070, term6070.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6070, term6070.getClass(), "defaultNewLine", "\n");
        setField(term6070, term6070.getClass(), "defaultOptPrefix", "-");
        setField(term6070, term6070.getClass(), "defaultLongOptPrefix", "--");
        setField(term6070, term6070.getClass(), "longOptSeparator", " ");
        setField(term6070, term6070.getClass(), "defaultArgName", "arg");
        setField(term6070, term6070.getClass(), "optionComparator", term6083);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getWidth", argTypes, term50, args);
        assertTrue(recursiveEquals(term50, term6070));
        assertTrue(recursiveEquals(retValue, 74));
    }

};


