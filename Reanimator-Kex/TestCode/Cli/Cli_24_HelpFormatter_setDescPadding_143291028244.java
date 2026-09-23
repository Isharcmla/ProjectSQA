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

public class HelpFormatter_setDescPadding_143291028244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177;
     Object term206;
     Object term5953;

    public HelpFormatter_setDescPadding_143291028244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term205 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term177, term177.getClass(), "defaultWidth", 74);
        setIntField(term177, term177.getClass(), "defaultLeftPad", 1);
        setIntField(term177, term177.getClass(), "defaultDescPad", 3);
        setField(term177, term177.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term177, term177.getClass(), "defaultNewLine", "\n");
        setField(term177, term177.getClass(), "defaultOptPrefix", "-");
        setField(term177, term177.getClass(), "defaultLongOptPrefix", "--");
        setField(term177, term177.getClass(), "defaultArgName", "arg");
        setField(term177, term177.getClass(), "optionComparator", term205);
        term206 = new Integer(1484323161);
        term5953 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term5964 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term5953, term5953.getClass(), "defaultWidth", 74);
        setIntField(term5953, term5953.getClass(), "defaultLeftPad", 1);
        setIntField(term5953, term5953.getClass(), "defaultDescPad", 1484323161);
        setField(term5953, term5953.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term5953, term5953.getClass(), "defaultNewLine", "\n");
        setField(term5953, term5953.getClass(), "defaultOptPrefix", "-");
        setField(term5953, term5953.getClass(), "defaultLongOptPrefix", "--");
        setField(term5953, term5953.getClass(), "defaultArgName", "arg");
        setField(term5953, term5953.getClass(), "optionComparator", term5964);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term206;
        callMethod(klass, "setDescPadding", argTypes, term177, args);
        assertTrue(recursiveEquals(term177, term5953));
        assertTrue(recursiveEquals(term206, 1484323161));
    }

};


