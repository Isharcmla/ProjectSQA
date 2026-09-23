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

public class HelpFormatter_setNewLine_51463490748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term373;
     Object term6307;

    public HelpFormatter_setNewLine_51463490748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term373 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term401 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term373, term373.getClass(), "defaultWidth", 74);
        setIntField(term373, term373.getClass(), "defaultLeftPad", 1);
        setIntField(term373, term373.getClass(), "defaultDescPad", 3);
        setField(term373, term373.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term373, term373.getClass(), "defaultNewLine", "\n");
        setField(term373, term373.getClass(), "defaultOptPrefix", "-");
        setField(term373, term373.getClass(), "defaultLongOptPrefix", "--");
        setField(term373, term373.getClass(), "defaultArgName", "arg");
        setField(term373, term373.getClass(), "optionComparator", term401);
        term6307 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term6318 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term6307, term6307.getClass(), "defaultWidth", 74);
        setIntField(term6307, term6307.getClass(), "defaultLeftPad", 1);
        setIntField(term6307, term6307.getClass(), "defaultDescPad", 3);
        setField(term6307, term6307.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6307, term6307.getClass(), "defaultNewLine", "sjlJAEtRrb");
        setField(term6307, term6307.getClass(), "defaultOptPrefix", "-");
        setField(term6307, term6307.getClass(), "defaultLongOptPrefix", "--");
        setField(term6307, term6307.getClass(), "defaultArgName", "arg");
        setField(term6307, term6307.getClass(), "optionComparator", term6318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sjlJAEtRrb";
        callMethod(klass, "setNewLine", argTypes, term373, args);
        assertTrue(recursiveEquals(term373, term6307));
    }

};


