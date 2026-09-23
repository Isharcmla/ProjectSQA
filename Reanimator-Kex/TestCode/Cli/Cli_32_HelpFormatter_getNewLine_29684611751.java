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

public class HelpFormatter_getNewLine_29684611751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term474;
     Object term6793;

    public HelpFormatter_getNewLine_29684611751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term474 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term505 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term474, term474.getClass(), "defaultWidth", 74);
        setIntField(term474, term474.getClass(), "defaultLeftPad", 1);
        setIntField(term474, term474.getClass(), "defaultDescPad", 3);
        setField(term474, term474.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term474, term474.getClass(), "defaultNewLine", "\n");
        setField(term474, term474.getClass(), "defaultOptPrefix", "-");
        setField(term474, term474.getClass(), "defaultLongOptPrefix", "--");
        setField(term474, term474.getClass(), "longOptSeparator", " ");
        setField(term474, term474.getClass(), "defaultArgName", "arg");
        setField(term474, term474.getClass(), "optionComparator", term505);
        term6793 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term6806 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term6793, term6793.getClass(), "defaultWidth", 74);
        setIntField(term6793, term6793.getClass(), "defaultLeftPad", 1);
        setIntField(term6793, term6793.getClass(), "defaultDescPad", 3);
        setField(term6793, term6793.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6793, term6793.getClass(), "defaultNewLine", "\n");
        setField(term6793, term6793.getClass(), "defaultOptPrefix", "-");
        setField(term6793, term6793.getClass(), "defaultLongOptPrefix", "--");
        setField(term6793, term6793.getClass(), "longOptSeparator", " ");
        setField(term6793, term6793.getClass(), "defaultArgName", "arg");
        setField(term6793, term6793.getClass(), "optionComparator", term6806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNewLine", argTypes, term474, args);
        assertTrue(recursiveEquals(term474, term6793));
        assertTrue(recursiveEquals(retValue, "\n"));
    }

};


