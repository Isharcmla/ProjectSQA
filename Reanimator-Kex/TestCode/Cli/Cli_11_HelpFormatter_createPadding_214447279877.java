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
import java.lang.Integer;

public class HelpFormatter_createPadding_214447279877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25922;
     Object term25926;

    public HelpFormatter_createPadding_214447279877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25922 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term25922, term25922.getClass(), "defaultWidth", 0);
        setIntField(term25922, term25922.getClass(), "defaultLeftPad", 0);
        setIntField(term25922, term25922.getClass(), "defaultDescPad", 0);
        setField(term25922, term25922.getClass(), "defaultSyntaxPrefix", null);
        setField(term25922, term25922.getClass(), "defaultNewLine", null);
        setField(term25922, term25922.getClass(), "defaultOptPrefix", null);
        setField(term25922, term25922.getClass(), "defaultLongOptPrefix", null);
        setField(term25922, term25922.getClass(), "defaultArgName", null);
        setField(term25922, term25922.getClass(), "optionComparator", null);
        term25926 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term25926;
        callMethod(klass, "createPadding", argTypes, term25922, args);
    }

};


