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

public class HelpFormatter_printHelp_29639799166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25870;
     Object term25874;

    public HelpFormatter_printHelp_29639799166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25870 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term25870, term25870.getClass(), "defaultWidth", 0);
        setIntField(term25870, term25870.getClass(), "defaultLeftPad", 0);
        setIntField(term25870, term25870.getClass(), "defaultDescPad", 0);
        setField(term25870, term25870.getClass(), "defaultSyntaxPrefix", null);
        setField(term25870, term25870.getClass(), "defaultNewLine", null);
        setField(term25870, term25870.getClass(), "defaultOptPrefix", null);
        setField(term25870, term25870.getClass(), "defaultLongOptPrefix", null);
        setField(term25870, term25870.getClass(), "longOptSeparator", null);
        setField(term25870, term25870.getClass(), "defaultArgName", null);
        setField(term25870, term25870.getClass(), "optionComparator", null);
        term25874 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.apache.commons.cli.Options");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = term25874;
        callMethod(klass, "printHelp", argTypes, term25870, args);
    }

};


