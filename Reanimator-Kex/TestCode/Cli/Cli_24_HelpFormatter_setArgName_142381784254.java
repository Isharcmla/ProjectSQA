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

public class HelpFormatter_setArgName_142381784254 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term697;
     Object term6887;

    public HelpFormatter_setArgName_142381784254() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term697 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term725 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term697, term697.getClass(), "defaultWidth", 74);
        setIntField(term697, term697.getClass(), "defaultLeftPad", 1);
        setIntField(term697, term697.getClass(), "defaultDescPad", 3);
        setField(term697, term697.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term697, term697.getClass(), "defaultNewLine", "\n");
        setField(term697, term697.getClass(), "defaultOptPrefix", "-");
        setField(term697, term697.getClass(), "defaultLongOptPrefix", "--");
        setField(term697, term697.getClass(), "defaultArgName", "arg");
        setField(term697, term697.getClass(), "optionComparator", term725);
        term6887 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term6898 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term6887, term6887.getClass(), "defaultWidth", 74);
        setIntField(term6887, term6887.getClass(), "defaultLeftPad", 1);
        setIntField(term6887, term6887.getClass(), "defaultDescPad", 3);
        setField(term6887, term6887.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6887, term6887.getClass(), "defaultNewLine", "\n");
        setField(term6887, term6887.getClass(), "defaultOptPrefix", "-");
        setField(term6887, term6887.getClass(), "defaultLongOptPrefix", "--");
        setField(term6887, term6887.getClass(), "defaultArgName", "jJCZpVmanW");
        setField(term6887, term6887.getClass(), "optionComparator", term6898);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jJCZpVmanW";
        callMethod(klass, "setArgName", argTypes, term697, args);
        assertTrue(recursiveEquals(term697, term6887));
    }

};


