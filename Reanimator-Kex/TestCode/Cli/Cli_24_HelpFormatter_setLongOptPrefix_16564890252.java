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

public class HelpFormatter_setLongOptPrefix_16564890252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term589;
     Object term6694;

    public HelpFormatter_setLongOptPrefix_16564890252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term589 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term617 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term589, term589.getClass(), "defaultWidth", 74);
        setIntField(term589, term589.getClass(), "defaultLeftPad", 1);
        setIntField(term589, term589.getClass(), "defaultDescPad", 3);
        setField(term589, term589.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term589, term589.getClass(), "defaultNewLine", "\n");
        setField(term589, term589.getClass(), "defaultOptPrefix", "-");
        setField(term589, term589.getClass(), "defaultLongOptPrefix", "--");
        setField(term589, term589.getClass(), "defaultArgName", "arg");
        setField(term589, term589.getClass(), "optionComparator", term617);
        term6694 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term6705 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term6694, term6694.getClass(), "defaultWidth", 74);
        setIntField(term6694, term6694.getClass(), "defaultLeftPad", 1);
        setIntField(term6694, term6694.getClass(), "defaultDescPad", 3);
        setField(term6694, term6694.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6694, term6694.getClass(), "defaultNewLine", "\n");
        setField(term6694, term6694.getClass(), "defaultOptPrefix", "-");
        setField(term6694, term6694.getClass(), "defaultLongOptPrefix", "xxtlPwDYFs");
        setField(term6694, term6694.getClass(), "defaultArgName", "arg");
        setField(term6694, term6694.getClass(), "optionComparator", term6705);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xxtlPwDYFs";
        callMethod(klass, "setLongOptPrefix", argTypes, term589, args);
        assertTrue(recursiveEquals(term589, term6694));
    }

};


