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
import java.lang.Boolean;

public class HelpFormatter_appendOption_173290326773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26537;
     Object term26541;

    public HelpFormatter_appendOption_173290326773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26537 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term26537, term26537.getClass(), "defaultWidth", 0);
        setIntField(term26537, term26537.getClass(), "defaultLeftPad", 0);
        setIntField(term26537, term26537.getClass(), "defaultDescPad", 0);
        setField(term26537, term26537.getClass(), "defaultSyntaxPrefix", null);
        setField(term26537, term26537.getClass(), "defaultNewLine", null);
        setField(term26537, term26537.getClass(), "defaultOptPrefix", null);
        setField(term26537, term26537.getClass(), "defaultLongOptPrefix", null);
        setField(term26537, term26537.getClass(), "longOptSeparator", null);
        setField(term26537, term26537.getClass(), "defaultArgName", null);
        setField(term26537, term26537.getClass(), "optionComparator", null);
        term26541 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("org.apache.commons.cli.Option");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term26541;
        callMethod(klass, "appendOption", argTypes, term26537, args);
    }

};


