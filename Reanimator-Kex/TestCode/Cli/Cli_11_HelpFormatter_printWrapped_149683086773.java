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

public class HelpFormatter_printWrapped_149683086773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25888;
     Object term25892;
     Object term25894;

    public HelpFormatter_printWrapped_149683086773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25888 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term25888, term25888.getClass(), "defaultWidth", 0);
        setIntField(term25888, term25888.getClass(), "defaultLeftPad", 0);
        setIntField(term25888, term25888.getClass(), "defaultDescPad", 0);
        setField(term25888, term25888.getClass(), "defaultSyntaxPrefix", null);
        setField(term25888, term25888.getClass(), "defaultNewLine", null);
        setField(term25888, term25888.getClass(), "defaultOptPrefix", null);
        setField(term25888, term25888.getClass(), "defaultLongOptPrefix", null);
        setField(term25888, term25888.getClass(), "defaultArgName", null);
        setField(term25888, term25888.getClass(), "optionComparator", null);
        term25892 = new Integer(0);
        term25894 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.PrintWriter");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term25892;
        args[2] = term25894;
        args[3] = null;
        callMethod(klass, "printWrapped", argTypes, term25888, args);
    }

};


