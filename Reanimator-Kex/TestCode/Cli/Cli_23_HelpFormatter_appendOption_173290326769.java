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

public class HelpFormatter_appendOption_173290326769 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25197;
     Object term25201;

    public HelpFormatter_appendOption_173290326769() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25197 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term25197, term25197.getClass(), "defaultWidth", 0);
        setIntField(term25197, term25197.getClass(), "defaultLeftPad", 0);
        setIntField(term25197, term25197.getClass(), "defaultDescPad", 0);
        setField(term25197, term25197.getClass(), "defaultSyntaxPrefix", null);
        setField(term25197, term25197.getClass(), "defaultNewLine", null);
        setField(term25197, term25197.getClass(), "defaultOptPrefix", null);
        setField(term25197, term25197.getClass(), "defaultLongOptPrefix", null);
        setField(term25197, term25197.getClass(), "defaultArgName", null);
        setField(term25197, term25197.getClass(), "optionComparator", null);
        term25201 = new Boolean(false);
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
        args[2] = term25201;
        callMethod(klass, "appendOption", argTypes, term25197, args);
    }

};


