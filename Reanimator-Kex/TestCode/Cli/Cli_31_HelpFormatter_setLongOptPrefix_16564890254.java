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

public class HelpFormatter_setLongOptPrefix_16564890254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term637;
     Object term7098;

    public HelpFormatter_setLongOptPrefix_16564890254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term637 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term668 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term637, term637.getClass(), "defaultWidth", 74);
        setIntField(term637, term637.getClass(), "defaultLeftPad", 1);
        setIntField(term637, term637.getClass(), "defaultDescPad", 3);
        setField(term637, term637.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term637, term637.getClass(), "defaultNewLine", "\n");
        setField(term637, term637.getClass(), "defaultOptPrefix", "-");
        setField(term637, term637.getClass(), "defaultLongOptPrefix", "--");
        setField(term637, term637.getClass(), "longOptSeparator", " ");
        setField(term637, term637.getClass(), "defaultArgName", "arg");
        setField(term637, term637.getClass(), "optionComparator", term668);
        term7098 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term7111 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term7098, term7098.getClass(), "defaultWidth", 74);
        setIntField(term7098, term7098.getClass(), "defaultLeftPad", 1);
        setIntField(term7098, term7098.getClass(), "defaultDescPad", 3);
        setField(term7098, term7098.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term7098, term7098.getClass(), "defaultNewLine", "\n");
        setField(term7098, term7098.getClass(), "defaultOptPrefix", "-");
        setField(term7098, term7098.getClass(), "defaultLongOptPrefix", "xxtlPwDYFs");
        setField(term7098, term7098.getClass(), "longOptSeparator", " ");
        setField(term7098, term7098.getClass(), "defaultArgName", "arg");
        setField(term7098, term7098.getClass(), "optionComparator", term7111);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xxtlPwDYFs";
        callMethod(klass, "setLongOptPrefix", argTypes, term637, args);
        assertTrue(recursiveEquals(term637, term7098));
    }

};


