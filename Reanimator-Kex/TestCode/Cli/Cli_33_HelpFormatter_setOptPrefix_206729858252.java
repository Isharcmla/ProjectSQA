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

public class HelpFormatter_setOptPrefix_206729858252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term521;
     Object term6891;

    public HelpFormatter_setOptPrefix_206729858252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term521 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term552 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term521, term521.getClass(), "defaultWidth", 74);
        setIntField(term521, term521.getClass(), "defaultLeftPad", 1);
        setIntField(term521, term521.getClass(), "defaultDescPad", 3);
        setField(term521, term521.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term521, term521.getClass(), "defaultNewLine", "\n");
        setField(term521, term521.getClass(), "defaultOptPrefix", "-");
        setField(term521, term521.getClass(), "defaultLongOptPrefix", "--");
        setField(term521, term521.getClass(), "longOptSeparator", " ");
        setField(term521, term521.getClass(), "defaultArgName", "arg");
        setField(term521, term521.getClass(), "optionComparator", term552);
        term6891 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term6904 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term6891, term6891.getClass(), "defaultWidth", 74);
        setIntField(term6891, term6891.getClass(), "defaultLeftPad", 1);
        setIntField(term6891, term6891.getClass(), "defaultDescPad", 3);
        setField(term6891, term6891.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6891, term6891.getClass(), "defaultNewLine", "\n");
        setField(term6891, term6891.getClass(), "defaultOptPrefix", "MuLcgQHgqz");
        setField(term6891, term6891.getClass(), "defaultLongOptPrefix", "--");
        setField(term6891, term6891.getClass(), "longOptSeparator", " ");
        setField(term6891, term6891.getClass(), "defaultArgName", "arg");
        setField(term6891, term6891.getClass(), "optionComparator", term6904);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MuLcgQHgqz";
        callMethod(klass, "setOptPrefix", argTypes, term521, args);
        assertTrue(recursiveEquals(term521, term6891));
    }

};


