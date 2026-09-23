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

public class HelpFormatter_printUsage_49042707574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26543;
     Object term26547;

    public HelpFormatter_printUsage_49042707574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26543 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term26543, term26543.getClass(), "defaultWidth", 0);
        setIntField(term26543, term26543.getClass(), "defaultLeftPad", 0);
        setIntField(term26543, term26543.getClass(), "defaultDescPad", 0);
        setField(term26543, term26543.getClass(), "defaultSyntaxPrefix", null);
        setField(term26543, term26543.getClass(), "defaultNewLine", null);
        setField(term26543, term26543.getClass(), "defaultOptPrefix", null);
        setField(term26543, term26543.getClass(), "defaultLongOptPrefix", null);
        setField(term26543, term26543.getClass(), "longOptSeparator", null);
        setField(term26543, term26543.getClass(), "defaultArgName", null);
        setField(term26543, term26543.getClass(), "optionComparator", null);
        term26547 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.io.PrintWriter");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term26547;
        args[2] = null;
        callMethod(klass, "printUsage", argTypes, term26543, args);
    }

};


