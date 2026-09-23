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

public class HelpFormatter_printHelp_29639799162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25808;
     Object term25812;

    public HelpFormatter_printHelp_29639799162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25808 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term25808, term25808.getClass(), "defaultWidth", 0);
        setIntField(term25808, term25808.getClass(), "defaultLeftPad", 0);
        setIntField(term25808, term25808.getClass(), "defaultDescPad", 0);
        setField(term25808, term25808.getClass(), "defaultSyntaxPrefix", null);
        setField(term25808, term25808.getClass(), "defaultNewLine", null);
        setField(term25808, term25808.getClass(), "defaultOptPrefix", null);
        setField(term25808, term25808.getClass(), "defaultLongOptPrefix", null);
        setField(term25808, term25808.getClass(), "defaultArgName", null);
        setField(term25808, term25808.getClass(), "optionComparator", null);
        term25812 = new Boolean(false);
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
        args[4] = term25812;
        callMethod(klass, "printHelp", argTypes, term25808, args);
    }

};


