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

public class HelpFormatter_getLongOptSeparator_16559573357 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term822;
     Object term7417;

    public HelpFormatter_getLongOptSeparator_16559573357() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term822 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term853 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term822, term822.getClass(), "defaultWidth", 74);
        setIntField(term822, term822.getClass(), "defaultLeftPad", 1);
        setIntField(term822, term822.getClass(), "defaultDescPad", 3);
        setField(term822, term822.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term822, term822.getClass(), "defaultNewLine", "\n");
        setField(term822, term822.getClass(), "defaultOptPrefix", "-");
        setField(term822, term822.getClass(), "defaultLongOptPrefix", "--");
        setField(term822, term822.getClass(), "longOptSeparator", " ");
        setField(term822, term822.getClass(), "defaultArgName", "arg");
        setField(term822, term822.getClass(), "optionComparator", term853);
        term7417 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term7430 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term7417, term7417.getClass(), "defaultWidth", 74);
        setIntField(term7417, term7417.getClass(), "defaultLeftPad", 1);
        setIntField(term7417, term7417.getClass(), "defaultDescPad", 3);
        setField(term7417, term7417.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term7417, term7417.getClass(), "defaultNewLine", "\n");
        setField(term7417, term7417.getClass(), "defaultOptPrefix", "-");
        setField(term7417, term7417.getClass(), "defaultLongOptPrefix", "--");
        setField(term7417, term7417.getClass(), "longOptSeparator", " ");
        setField(term7417, term7417.getClass(), "defaultArgName", "arg");
        setField(term7417, term7417.getClass(), "optionComparator", term7430);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLongOptSeparator", argTypes, term822, args);
        assertTrue(recursiveEquals(term822, term7417));
        assertTrue(recursiveEquals(retValue, " "));
    }

};


