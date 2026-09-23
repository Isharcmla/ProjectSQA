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
import java.lang.Object;

public class HelpFormatter_rtrim_180867354440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5829;

    public HelpFormatter_rtrim_180867354440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5829 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term5860 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term5829, term5829.getClass(), "defaultWidth", 74);
        setIntField(term5829, term5829.getClass(), "defaultLeftPad", 1);
        setIntField(term5829, term5829.getClass(), "defaultDescPad", 3);
        setField(term5829, term5829.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term5829, term5829.getClass(), "defaultNewLine", "\n");
        setField(term5829, term5829.getClass(), "defaultOptPrefix", "-");
        setField(term5829, term5829.getClass(), "defaultLongOptPrefix", "--");
        setField(term5829, term5829.getClass(), "longOptSeparator", " ");
        setField(term5829, term5829.getClass(), "defaultArgName", "arg");
        setField(term5829, term5829.getClass(), "optionComparator", term5860);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "YRHGsAkhxb";
        callMethod(klass, "rtrim", argTypes, term5829, args);
    }

};


