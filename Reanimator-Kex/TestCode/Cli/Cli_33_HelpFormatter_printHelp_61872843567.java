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

public class HelpFormatter_printHelp_61872843567 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34622;
     Object term34626;

    public HelpFormatter_printHelp_61872843567() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34622 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term34622, term34622.getClass(), "defaultWidth", 0);
        setIntField(term34622, term34622.getClass(), "defaultLeftPad", 0);
        setIntField(term34622, term34622.getClass(), "defaultDescPad", 0);
        setField(term34622, term34622.getClass(), "defaultSyntaxPrefix", null);
        setField(term34622, term34622.getClass(), "defaultNewLine", null);
        setField(term34622, term34622.getClass(), "defaultOptPrefix", null);
        setField(term34622, term34622.getClass(), "defaultLongOptPrefix", null);
        setField(term34622, term34622.getClass(), "longOptSeparator", null);
        setField(term34622, term34622.getClass(), "defaultArgName", null);
        setField(term34622, term34622.getClass(), "optionComparator", null);
        term34626 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("org.apache.commons.cli.Options");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term34626;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        callMethod(klass, "printHelp", argTypes, term34622, args);
    }

};


