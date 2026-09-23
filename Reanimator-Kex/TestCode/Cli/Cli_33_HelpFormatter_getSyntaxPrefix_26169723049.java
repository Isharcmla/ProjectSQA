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

public class HelpFormatter_getSyntaxPrefix_26169723049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358;
     Object term6579;

    public HelpFormatter_getSyntaxPrefix_26169723049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term358 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term389 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term358, term358.getClass(), "defaultWidth", 74);
        setIntField(term358, term358.getClass(), "defaultLeftPad", 1);
        setIntField(term358, term358.getClass(), "defaultDescPad", 3);
        setField(term358, term358.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term358, term358.getClass(), "defaultNewLine", "\n");
        setField(term358, term358.getClass(), "defaultOptPrefix", "-");
        setField(term358, term358.getClass(), "defaultLongOptPrefix", "--");
        setField(term358, term358.getClass(), "longOptSeparator", " ");
        setField(term358, term358.getClass(), "defaultArgName", "arg");
        setField(term358, term358.getClass(), "optionComparator", term389);
        term6579 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term6592 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term6579, term6579.getClass(), "defaultWidth", 74);
        setIntField(term6579, term6579.getClass(), "defaultLeftPad", 1);
        setIntField(term6579, term6579.getClass(), "defaultDescPad", 3);
        setField(term6579, term6579.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6579, term6579.getClass(), "defaultNewLine", "\n");
        setField(term6579, term6579.getClass(), "defaultOptPrefix", "-");
        setField(term6579, term6579.getClass(), "defaultLongOptPrefix", "--");
        setField(term6579, term6579.getClass(), "longOptSeparator", " ");
        setField(term6579, term6579.getClass(), "defaultArgName", "arg");
        setField(term6579, term6579.getClass(), "optionComparator", term6592);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSyntaxPrefix", argTypes, term358, args);
        assertTrue(recursiveEquals(term358, term6579));
        assertTrue(recursiveEquals(retValue, "usage: "));
    }

};


