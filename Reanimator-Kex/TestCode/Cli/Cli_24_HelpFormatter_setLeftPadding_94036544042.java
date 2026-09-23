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

public class HelpFormatter_setLeftPadding_94036544042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89;
     Object term118;
     Object term5813;

    public HelpFormatter_setLeftPadding_94036544042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term117 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term89, term89.getClass(), "defaultWidth", 74);
        setIntField(term89, term89.getClass(), "defaultLeftPad", 1);
        setIntField(term89, term89.getClass(), "defaultDescPad", 3);
        setField(term89, term89.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term89, term89.getClass(), "defaultNewLine", "\n");
        setField(term89, term89.getClass(), "defaultOptPrefix", "-");
        setField(term89, term89.getClass(), "defaultLongOptPrefix", "--");
        setField(term89, term89.getClass(), "defaultArgName", "arg");
        setField(term89, term89.getClass(), "optionComparator", term117);
        term118 = new Integer(1162663216);
        term5813 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term5824 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term5813, term5813.getClass(), "defaultWidth", 74);
        setIntField(term5813, term5813.getClass(), "defaultLeftPad", 1162663216);
        setIntField(term5813, term5813.getClass(), "defaultDescPad", 3);
        setField(term5813, term5813.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term5813, term5813.getClass(), "defaultNewLine", "\n");
        setField(term5813, term5813.getClass(), "defaultOptPrefix", "-");
        setField(term5813, term5813.getClass(), "defaultLongOptPrefix", "--");
        setField(term5813, term5813.getClass(), "defaultArgName", "arg");
        setField(term5813, term5813.getClass(), "optionComparator", term5824);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term118;
        callMethod(klass, "setLeftPadding", argTypes, term89, args);
        assertTrue(recursiveEquals(term89, term5813));
        assertTrue(recursiveEquals(term118, 1162663216));
    }

};


