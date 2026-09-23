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

public class HelpFormatter_setSyntaxPrefix_73264359446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265;
     Object term6107;

    public HelpFormatter_setSyntaxPrefix_73264359446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term265 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term293 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term265, term265.getClass(), "defaultWidth", 74);
        setIntField(term265, term265.getClass(), "defaultLeftPad", 1);
        setIntField(term265, term265.getClass(), "defaultDescPad", 3);
        setField(term265, term265.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term265, term265.getClass(), "defaultNewLine", "\n");
        setField(term265, term265.getClass(), "defaultOptPrefix", "-");
        setField(term265, term265.getClass(), "defaultLongOptPrefix", "--");
        setField(term265, term265.getClass(), "defaultArgName", "arg");
        setField(term265, term265.getClass(), "optionComparator", term293);
        term6107 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term6118 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term6107, term6107.getClass(), "defaultWidth", 74);
        setIntField(term6107, term6107.getClass(), "defaultLeftPad", 1);
        setIntField(term6107, term6107.getClass(), "defaultDescPad", 3);
        setField(term6107, term6107.getClass(), "defaultSyntaxPrefix", "PAEBtnZtTD");
        setField(term6107, term6107.getClass(), "defaultNewLine", "\n");
        setField(term6107, term6107.getClass(), "defaultOptPrefix", "-");
        setField(term6107, term6107.getClass(), "defaultLongOptPrefix", "--");
        setField(term6107, term6107.getClass(), "defaultArgName", "arg");
        setField(term6107, term6107.getClass(), "optionComparator", term6118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        callMethod(klass, "setSyntaxPrefix", argTypes, term265, args);
        assertTrue(recursiveEquals(term265, term6107));
    }

};


