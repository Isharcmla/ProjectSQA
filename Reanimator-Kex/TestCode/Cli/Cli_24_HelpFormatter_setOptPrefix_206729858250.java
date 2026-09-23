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

public class HelpFormatter_setOptPrefix_206729858250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term481;
     Object term6501;

    public HelpFormatter_setOptPrefix_206729858250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term481 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term509 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term481, term481.getClass(), "defaultWidth", 74);
        setIntField(term481, term481.getClass(), "defaultLeftPad", 1);
        setIntField(term481, term481.getClass(), "defaultDescPad", 3);
        setField(term481, term481.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term481, term481.getClass(), "defaultNewLine", "\n");
        setField(term481, term481.getClass(), "defaultOptPrefix", "-");
        setField(term481, term481.getClass(), "defaultLongOptPrefix", "--");
        setField(term481, term481.getClass(), "defaultArgName", "arg");
        setField(term481, term481.getClass(), "optionComparator", term509);
        term6501 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term6512 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term6501, term6501.getClass(), "defaultWidth", 74);
        setIntField(term6501, term6501.getClass(), "defaultLeftPad", 1);
        setIntField(term6501, term6501.getClass(), "defaultDescPad", 3);
        setField(term6501, term6501.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6501, term6501.getClass(), "defaultNewLine", "\n");
        setField(term6501, term6501.getClass(), "defaultOptPrefix", "MuLcgQHgqz");
        setField(term6501, term6501.getClass(), "defaultLongOptPrefix", "--");
        setField(term6501, term6501.getClass(), "defaultArgName", "arg");
        setField(term6501, term6501.getClass(), "optionComparator", term6512);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "MuLcgQHgqz";
        callMethod(klass, "setOptPrefix", argTypes, term481, args);
        assertTrue(recursiveEquals(term481, term6501));
    }

};


