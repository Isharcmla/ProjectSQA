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

public class HelpFormatter_getOptPrefix_190454114253 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term590;
     Object term7001;

    public HelpFormatter_getOptPrefix_190454114253() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term590 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term621 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term590, term590.getClass(), "defaultWidth", 74);
        setIntField(term590, term590.getClass(), "defaultLeftPad", 1);
        setIntField(term590, term590.getClass(), "defaultDescPad", 3);
        setField(term590, term590.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term590, term590.getClass(), "defaultNewLine", "\n");
        setField(term590, term590.getClass(), "defaultOptPrefix", "-");
        setField(term590, term590.getClass(), "defaultLongOptPrefix", "--");
        setField(term590, term590.getClass(), "longOptSeparator", " ");
        setField(term590, term590.getClass(), "defaultArgName", "arg");
        setField(term590, term590.getClass(), "optionComparator", term621);
        term7001 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term7014 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term7001, term7001.getClass(), "defaultWidth", 74);
        setIntField(term7001, term7001.getClass(), "defaultLeftPad", 1);
        setIntField(term7001, term7001.getClass(), "defaultDescPad", 3);
        setField(term7001, term7001.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term7001, term7001.getClass(), "defaultNewLine", "\n");
        setField(term7001, term7001.getClass(), "defaultOptPrefix", "-");
        setField(term7001, term7001.getClass(), "defaultLongOptPrefix", "--");
        setField(term7001, term7001.getClass(), "longOptSeparator", " ");
        setField(term7001, term7001.getClass(), "defaultArgName", "arg");
        setField(term7001, term7001.getClass(), "optionComparator", term7014);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOptPrefix", argTypes, term590, args);
        assertTrue(recursiveEquals(term590, term7001));
        assertTrue(recursiveEquals(retValue, "-"));
    }

};


