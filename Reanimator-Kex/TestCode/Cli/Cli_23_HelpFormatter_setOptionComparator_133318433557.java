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

public class HelpFormatter_setOptionComparator_133318433557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term848;
     Object term7133;

    public HelpFormatter_setOptionComparator_133318433557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term848 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term876 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term848, term848.getClass(), "defaultWidth", 74);
        setIntField(term848, term848.getClass(), "defaultLeftPad", 1);
        setIntField(term848, term848.getClass(), "defaultDescPad", 3);
        setField(term848, term848.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term848, term848.getClass(), "defaultNewLine", "\n");
        setField(term848, term848.getClass(), "defaultOptPrefix", "-");
        setField(term848, term848.getClass(), "defaultLongOptPrefix", "--");
        setField(term848, term848.getClass(), "defaultArgName", "arg");
        setField(term848, term848.getClass(), "optionComparator", term876);
        term7133 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term7144 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term7133, term7133.getClass(), "defaultWidth", 74);
        setIntField(term7133, term7133.getClass(), "defaultLeftPad", 1);
        setIntField(term7133, term7133.getClass(), "defaultDescPad", 3);
        setField(term7133, term7133.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term7133, term7133.getClass(), "defaultNewLine", "\n");
        setField(term7133, term7133.getClass(), "defaultOptPrefix", "-");
        setField(term7133, term7133.getClass(), "defaultLongOptPrefix", "--");
        setField(term7133, term7133.getClass(), "defaultArgName", "arg");
        setField(term7133, term7133.getClass(), "optionComparator", term7144);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Comparator");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setOptionComparator", argTypes, term848, args);
        assertTrue(recursiveEquals(term848, term7133));
    }

};


