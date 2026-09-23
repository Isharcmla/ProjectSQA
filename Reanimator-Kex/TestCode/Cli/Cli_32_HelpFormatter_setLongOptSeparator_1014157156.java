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

public class HelpFormatter_setLongOptSeparator_1014157156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term753;
     Object term7307;

    public HelpFormatter_setLongOptSeparator_1014157156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term753 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term784 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term753, term753.getClass(), "defaultWidth", 74);
        setIntField(term753, term753.getClass(), "defaultLeftPad", 1);
        setIntField(term753, term753.getClass(), "defaultDescPad", 3);
        setField(term753, term753.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term753, term753.getClass(), "defaultNewLine", "\n");
        setField(term753, term753.getClass(), "defaultOptPrefix", "-");
        setField(term753, term753.getClass(), "defaultLongOptPrefix", "--");
        setField(term753, term753.getClass(), "longOptSeparator", " ");
        setField(term753, term753.getClass(), "defaultArgName", "arg");
        setField(term753, term753.getClass(), "optionComparator", term784);
        term7307 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term7320 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term7307, term7307.getClass(), "defaultWidth", 74);
        setIntField(term7307, term7307.getClass(), "defaultLeftPad", 1);
        setIntField(term7307, term7307.getClass(), "defaultDescPad", 3);
        setField(term7307, term7307.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term7307, term7307.getClass(), "defaultNewLine", "\n");
        setField(term7307, term7307.getClass(), "defaultOptPrefix", "-");
        setField(term7307, term7307.getClass(), "defaultLongOptPrefix", "--");
        setField(term7307, term7307.getClass(), "longOptSeparator", "jJCZpVmanW");
        setField(term7307, term7307.getClass(), "defaultArgName", "arg");
        setField(term7307, term7307.getClass(), "optionComparator", term7320);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jJCZpVmanW";
        callMethod(klass, "setLongOptSeparator", argTypes, term753, args);
        assertTrue(recursiveEquals(term753, term7307));
    }

};


