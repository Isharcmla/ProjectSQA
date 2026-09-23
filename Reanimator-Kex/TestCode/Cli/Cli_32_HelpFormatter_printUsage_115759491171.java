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

public class HelpFormatter_printUsage_115759491171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26527;
     Object term26531;

    public HelpFormatter_printUsage_115759491171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26527 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term26527, term26527.getClass(), "defaultWidth", 0);
        setIntField(term26527, term26527.getClass(), "defaultLeftPad", 0);
        setIntField(term26527, term26527.getClass(), "defaultDescPad", 0);
        setField(term26527, term26527.getClass(), "defaultSyntaxPrefix", null);
        setField(term26527, term26527.getClass(), "defaultNewLine", null);
        setField(term26527, term26527.getClass(), "defaultOptPrefix", null);
        setField(term26527, term26527.getClass(), "defaultLongOptPrefix", null);
        setField(term26527, term26527.getClass(), "longOptSeparator", null);
        setField(term26527, term26527.getClass(), "defaultArgName", null);
        setField(term26527, term26527.getClass(), "optionComparator", null);
        term26531 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.PrintWriter");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("org.apache.commons.cli.Options");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term26531;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "printUsage", argTypes, term26527, args);
    }

};


