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

public class HelpFormatter_setWidth_107594938042 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term33;
     Object term5993;

    public HelpFormatter_setWidth_107594938042() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term32 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term1, term1.getClass(), "defaultWidth", 74);
        setIntField(term1, term1.getClass(), "defaultLeftPad", 1);
        setIntField(term1, term1.getClass(), "defaultDescPad", 3);
        setField(term1, term1.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term1, term1.getClass(), "defaultNewLine", "\n");
        setField(term1, term1.getClass(), "defaultOptPrefix", "-");
        setField(term1, term1.getClass(), "defaultLongOptPrefix", "--");
        setField(term1, term1.getClass(), "longOptSeparator", " ");
        setField(term1, term1.getClass(), "defaultArgName", "arg");
        setField(term1, term1.getClass(), "optionComparator", term32);
        term33 = new Integer(568599855);
        term5993 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term6006 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term5993, term5993.getClass(), "defaultWidth", 568599855);
        setIntField(term5993, term5993.getClass(), "defaultLeftPad", 1);
        setIntField(term5993, term5993.getClass(), "defaultDescPad", 3);
        setField(term5993, term5993.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term5993, term5993.getClass(), "defaultNewLine", "\n");
        setField(term5993, term5993.getClass(), "defaultOptPrefix", "-");
        setField(term5993, term5993.getClass(), "defaultLongOptPrefix", "--");
        setField(term5993, term5993.getClass(), "longOptSeparator", " ");
        setField(term5993, term5993.getClass(), "defaultArgName", "arg");
        setField(term5993, term5993.getClass(), "optionComparator", term6006);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term33;
        callMethod(klass, "setWidth", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term5993));
        assertTrue(recursiveEquals(term33, 568599855));
    }

};


