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
import java.lang.Boolean;

public class HelpFormatter_printHelp_80470078970 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34646;
     Object term34650;
     Object term34652;
     Object term34654;
     Object term34656;

    public HelpFormatter_printHelp_80470078970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34646 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term34646, term34646.getClass(), "defaultWidth", 0);
        setIntField(term34646, term34646.getClass(), "defaultLeftPad", 0);
        setIntField(term34646, term34646.getClass(), "defaultDescPad", 0);
        setField(term34646, term34646.getClass(), "defaultSyntaxPrefix", null);
        setField(term34646, term34646.getClass(), "defaultNewLine", null);
        setField(term34646, term34646.getClass(), "defaultOptPrefix", null);
        setField(term34646, term34646.getClass(), "defaultLongOptPrefix", null);
        setField(term34646, term34646.getClass(), "longOptSeparator", null);
        setField(term34646, term34646.getClass(), "defaultArgName", null);
        setField(term34646, term34646.getClass(), "optionComparator", null);
        term34650 = new Integer(0);
        term34652 = new Integer(0);
        term34654 = new Integer(0);
        term34656 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[9];
        argTypes[0] = Class.forName("java.io.PrintWriter");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("org.apache.commons.cli.Options");
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = Class.forName("java.lang.String");
        argTypes[8] = boolean.class;
        Object[] args = new Object[9];
        args[0] = null;
        args[1] = term34650;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = term34652;
        args[6] = term34654;
        args[7] = null;
        args[8] = term34656;
        callMethod(klass, "printHelp", argTypes, term34646, args);
    }

};


