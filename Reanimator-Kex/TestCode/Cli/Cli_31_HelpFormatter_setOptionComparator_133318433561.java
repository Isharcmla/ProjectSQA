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

public class HelpFormatter_setOptionComparator_133318433561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1032;
     Object term7780;

    public HelpFormatter_setOptionComparator_133318433561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1032 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term1063 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term1032, term1032.getClass(), "defaultWidth", 74);
        setIntField(term1032, term1032.getClass(), "defaultLeftPad", 1);
        setIntField(term1032, term1032.getClass(), "defaultDescPad", 3);
        setField(term1032, term1032.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term1032, term1032.getClass(), "defaultNewLine", "\n");
        setField(term1032, term1032.getClass(), "defaultOptPrefix", "-");
        setField(term1032, term1032.getClass(), "defaultLongOptPrefix", "--");
        setField(term1032, term1032.getClass(), "longOptSeparator", " ");
        setField(term1032, term1032.getClass(), "defaultArgName", "arg");
        setField(term1032, term1032.getClass(), "optionComparator", term1063);
        term7780 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term7793 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term7780, term7780.getClass(), "defaultWidth", 74);
        setIntField(term7780, term7780.getClass(), "defaultLeftPad", 1);
        setIntField(term7780, term7780.getClass(), "defaultDescPad", 3);
        setField(term7780, term7780.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term7780, term7780.getClass(), "defaultNewLine", "\n");
        setField(term7780, term7780.getClass(), "defaultOptPrefix", "-");
        setField(term7780, term7780.getClass(), "defaultLongOptPrefix", "--");
        setField(term7780, term7780.getClass(), "longOptSeparator", " ");
        setField(term7780, term7780.getClass(), "defaultArgName", "arg");
        setField(term7780, term7780.getClass(), "optionComparator", term7793);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setOptionComparator", argTypes, term1032, args);
        assertTrue(recursiveEquals(term1032, term7780));
    }

};


