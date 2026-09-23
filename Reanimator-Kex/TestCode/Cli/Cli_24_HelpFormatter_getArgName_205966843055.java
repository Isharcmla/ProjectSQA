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

public class HelpFormatter_getArgName_205966843055 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term762;
     Object term6990;

    public HelpFormatter_getArgName_205966843055() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term762 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term790 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term762, term762.getClass(), "defaultWidth", 74);
        setIntField(term762, term762.getClass(), "defaultLeftPad", 1);
        setIntField(term762, term762.getClass(), "defaultDescPad", 3);
        setField(term762, term762.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term762, term762.getClass(), "defaultNewLine", "\n");
        setField(term762, term762.getClass(), "defaultOptPrefix", "-");
        setField(term762, term762.getClass(), "defaultLongOptPrefix", "--");
        setField(term762, term762.getClass(), "defaultArgName", "arg");
        setField(term762, term762.getClass(), "optionComparator", term790);
        term6990 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term7001 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term6990, term6990.getClass(), "defaultWidth", 74);
        setIntField(term6990, term6990.getClass(), "defaultLeftPad", 1);
        setIntField(term6990, term6990.getClass(), "defaultDescPad", 3);
        setField(term6990, term6990.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6990, term6990.getClass(), "defaultNewLine", "\n");
        setField(term6990, term6990.getClass(), "defaultOptPrefix", "-");
        setField(term6990, term6990.getClass(), "defaultLongOptPrefix", "--");
        setField(term6990, term6990.getClass(), "defaultArgName", "arg");
        setField(term6990, term6990.getClass(), "optionComparator", term7001);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getArgName", argTypes, term762, args);
        assertTrue(recursiveEquals(term762, term6990));
        assertTrue(recursiveEquals(retValue, "arg"));
    }

};


