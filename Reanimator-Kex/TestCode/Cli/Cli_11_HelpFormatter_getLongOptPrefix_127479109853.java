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

public class HelpFormatter_getLongOptPrefix_127479109853 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term654;
     Object term6797;

    public HelpFormatter_getLongOptPrefix_127479109853() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term654 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term682 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term654, term654.getClass(), "defaultWidth", 74);
        setIntField(term654, term654.getClass(), "defaultLeftPad", 1);
        setIntField(term654, term654.getClass(), "defaultDescPad", 3);
        setField(term654, term654.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term654, term654.getClass(), "defaultNewLine", "\n");
        setField(term654, term654.getClass(), "defaultOptPrefix", "-");
        setField(term654, term654.getClass(), "defaultLongOptPrefix", "--");
        setField(term654, term654.getClass(), "defaultArgName", "arg");
        setField(term654, term654.getClass(), "optionComparator", term682);
        term6797 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term6808 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term6797, term6797.getClass(), "defaultWidth", 74);
        setIntField(term6797, term6797.getClass(), "defaultLeftPad", 1);
        setIntField(term6797, term6797.getClass(), "defaultDescPad", 3);
        setField(term6797, term6797.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6797, term6797.getClass(), "defaultNewLine", "\n");
        setField(term6797, term6797.getClass(), "defaultOptPrefix", "-");
        setField(term6797, term6797.getClass(), "defaultLongOptPrefix", "--");
        setField(term6797, term6797.getClass(), "defaultArgName", "arg");
        setField(term6797, term6797.getClass(), "optionComparator", term6808);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLongOptPrefix", argTypes, term654, args);
        assertTrue(recursiveEquals(term654, term6797));
        assertTrue(recursiveEquals(retValue, "--"));
    }

};


