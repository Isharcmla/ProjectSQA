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

public class HelpFormatter_setArgName_142381784257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term869;
     Object term7469;

    public HelpFormatter_setArgName_142381784257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term869 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term900 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term869, term869.getClass(), "defaultWidth", 74);
        setIntField(term869, term869.getClass(), "defaultLeftPad", 1);
        setIntField(term869, term869.getClass(), "defaultDescPad", 3);
        setField(term869, term869.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term869, term869.getClass(), "defaultNewLine", "\n");
        setField(term869, term869.getClass(), "defaultOptPrefix", "-");
        setField(term869, term869.getClass(), "defaultLongOptPrefix", "--");
        setField(term869, term869.getClass(), "longOptSeparator", " ");
        setField(term869, term869.getClass(), "defaultArgName", "arg");
        setField(term869, term869.getClass(), "optionComparator", term900);
        term7469 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term7494 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term7469, term7469.getClass(), "defaultWidth", 74);
        setIntField(term7469, term7469.getClass(), "defaultLeftPad", 1);
        setIntField(term7469, term7469.getClass(), "defaultDescPad", 3);
        setField(term7469, term7469.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term7469, term7469.getClass(), "defaultNewLine", "\n");
        setField(term7469, term7469.getClass(), "defaultOptPrefix", "-");
        setField(term7469, term7469.getClass(), "defaultLongOptPrefix", "--");
        setField(term7469, term7469.getClass(), "longOptSeparator", " ");
        setField(term7469, term7469.getClass(), "defaultArgName", "EGtDIRbSSb");
        setField(term7469, term7469.getClass(), "optionComparator", term7494);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "EGtDIRbSSb";
        callMethod(klass, "setArgName", argTypes, term869, args);
        assertTrue(recursiveEquals(term869, term7469));
    }

};


