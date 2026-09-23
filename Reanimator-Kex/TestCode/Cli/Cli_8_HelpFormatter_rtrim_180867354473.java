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

public class HelpFormatter_rtrim_180867354473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25148;

    public HelpFormatter_rtrim_180867354473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25148 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term25148, term25148.getClass(), "defaultWidth", 0);
        setIntField(term25148, term25148.getClass(), "defaultLeftPad", 0);
        setIntField(term25148, term25148.getClass(), "defaultDescPad", 0);
        setField(term25148, term25148.getClass(), "defaultSyntaxPrefix", null);
        setField(term25148, term25148.getClass(), "defaultNewLine", null);
        setField(term25148, term25148.getClass(), "defaultOptPrefix", null);
        setField(term25148, term25148.getClass(), "defaultLongOptPrefix", null);
        setField(term25148, term25148.getClass(), "defaultArgName", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "rtrim", argTypes, term25148, args);
    }

};


