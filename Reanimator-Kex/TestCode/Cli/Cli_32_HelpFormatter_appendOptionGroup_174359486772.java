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

public class HelpFormatter_appendOptionGroup_174359486772 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26533;

    public HelpFormatter_appendOptionGroup_174359486772() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26533 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term26533, term26533.getClass(), "defaultWidth", 0);
        setIntField(term26533, term26533.getClass(), "defaultLeftPad", 0);
        setIntField(term26533, term26533.getClass(), "defaultDescPad", 0);
        setField(term26533, term26533.getClass(), "defaultSyntaxPrefix", null);
        setField(term26533, term26533.getClass(), "defaultNewLine", null);
        setField(term26533, term26533.getClass(), "defaultOptPrefix", null);
        setField(term26533, term26533.getClass(), "defaultLongOptPrefix", null);
        setField(term26533, term26533.getClass(), "longOptSeparator", null);
        setField(term26533, term26533.getClass(), "defaultArgName", null);
        setField(term26533, term26533.getClass(), "optionComparator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("org.apache.commons.cli.OptionGroup");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "appendOptionGroup", argTypes, term26533, args);
    }

};


