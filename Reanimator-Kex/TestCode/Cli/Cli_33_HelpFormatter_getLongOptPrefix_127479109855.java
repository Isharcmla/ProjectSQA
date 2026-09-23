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

public class HelpFormatter_getLongOptPrefix_127479109855 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term706;
     Object term7208;

    public HelpFormatter_getLongOptPrefix_127479109855() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term706 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term737 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term706, term706.getClass(), "defaultWidth", 74);
        setIntField(term706, term706.getClass(), "defaultLeftPad", 1);
        setIntField(term706, term706.getClass(), "defaultDescPad", 3);
        setField(term706, term706.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term706, term706.getClass(), "defaultNewLine", "\n");
        setField(term706, term706.getClass(), "defaultOptPrefix", "-");
        setField(term706, term706.getClass(), "defaultLongOptPrefix", "--");
        setField(term706, term706.getClass(), "longOptSeparator", " ");
        setField(term706, term706.getClass(), "defaultArgName", "arg");
        setField(term706, term706.getClass(), "optionComparator", term737);
        term7208 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term7221 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term7208, term7208.getClass(), "defaultWidth", 74);
        setIntField(term7208, term7208.getClass(), "defaultLeftPad", 1);
        setIntField(term7208, term7208.getClass(), "defaultDescPad", 3);
        setField(term7208, term7208.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term7208, term7208.getClass(), "defaultNewLine", "\n");
        setField(term7208, term7208.getClass(), "defaultOptPrefix", "-");
        setField(term7208, term7208.getClass(), "defaultLongOptPrefix", "--");
        setField(term7208, term7208.getClass(), "longOptSeparator", " ");
        setField(term7208, term7208.getClass(), "defaultArgName", "arg");
        setField(term7208, term7208.getClass(), "optionComparator", term7221);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLongOptPrefix", argTypes, term706, args);
        assertTrue(recursiveEquals(term706, term7208));
        assertTrue(recursiveEquals(retValue, "--"));
    }

};


