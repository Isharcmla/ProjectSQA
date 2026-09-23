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

public class HelpFormatter_setSyntaxPrefix_73264359448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289;
     Object term6469;

    public HelpFormatter_setSyntaxPrefix_73264359448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term320 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term289, term289.getClass(), "defaultWidth", 74);
        setIntField(term289, term289.getClass(), "defaultLeftPad", 1);
        setIntField(term289, term289.getClass(), "defaultDescPad", 3);
        setField(term289, term289.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term289, term289.getClass(), "defaultNewLine", "\n");
        setField(term289, term289.getClass(), "defaultOptPrefix", "-");
        setField(term289, term289.getClass(), "defaultLongOptPrefix", "--");
        setField(term289, term289.getClass(), "longOptSeparator", " ");
        setField(term289, term289.getClass(), "defaultArgName", "arg");
        setField(term289, term289.getClass(), "optionComparator", term320);
        term6469 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term6482 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term6469, term6469.getClass(), "defaultWidth", 74);
        setIntField(term6469, term6469.getClass(), "defaultLeftPad", 1);
        setIntField(term6469, term6469.getClass(), "defaultDescPad", 3);
        setField(term6469, term6469.getClass(), "defaultSyntaxPrefix", "PAEBtnZtTD");
        setField(term6469, term6469.getClass(), "defaultNewLine", "\n");
        setField(term6469, term6469.getClass(), "defaultOptPrefix", "-");
        setField(term6469, term6469.getClass(), "defaultLongOptPrefix", "--");
        setField(term6469, term6469.getClass(), "longOptSeparator", " ");
        setField(term6469, term6469.getClass(), "defaultArgName", "arg");
        setField(term6469, term6469.getClass(), "optionComparator", term6482);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        callMethod(klass, "setSyntaxPrefix", argTypes, term289, args);
        assertTrue(recursiveEquals(term289, term6469));
    }

};


