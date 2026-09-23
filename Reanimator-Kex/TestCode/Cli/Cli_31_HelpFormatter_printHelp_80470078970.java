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
     Object term25900;
     Object term25904;
     Object term25906;
     Object term25908;
     Object term25910;

    public HelpFormatter_printHelp_80470078970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25900 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term25900, term25900.getClass(), "defaultWidth", 0);
        setIntField(term25900, term25900.getClass(), "defaultLeftPad", 0);
        setIntField(term25900, term25900.getClass(), "defaultDescPad", 0);
        setField(term25900, term25900.getClass(), "defaultSyntaxPrefix", null);
        setField(term25900, term25900.getClass(), "defaultNewLine", null);
        setField(term25900, term25900.getClass(), "defaultOptPrefix", null);
        setField(term25900, term25900.getClass(), "defaultLongOptPrefix", null);
        setField(term25900, term25900.getClass(), "longOptSeparator", null);
        setField(term25900, term25900.getClass(), "defaultArgName", null);
        setField(term25900, term25900.getClass(), "optionComparator", null);
        term25904 = new Integer(0);
        term25906 = new Integer(0);
        term25908 = new Integer(0);
        term25910 = new Boolean(false);
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
        args[1] = term25904;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = term25906;
        args[6] = term25908;
        args[7] = null;
        args[8] = term25910;
        callMethod(klass, "printHelp", argTypes, term25900, args);
    }

};


