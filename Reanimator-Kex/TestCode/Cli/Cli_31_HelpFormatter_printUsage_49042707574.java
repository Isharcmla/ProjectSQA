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
     Object term25928;
     Object term25932;

    public HelpFormatter_printUsage_49042707574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25928 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term25928, term25928.getClass(), "defaultWidth", 0);
        setIntField(term25928, term25928.getClass(), "defaultLeftPad", 0);
        setIntField(term25928, term25928.getClass(), "defaultDescPad", 0);
        setField(term25928, term25928.getClass(), "defaultSyntaxPrefix", null);
        setField(term25928, term25928.getClass(), "defaultNewLine", null);
        setField(term25928, term25928.getClass(), "defaultOptPrefix", null);
        setField(term25928, term25928.getClass(), "defaultLongOptPrefix", null);
        setField(term25928, term25928.getClass(), "longOptSeparator", null);
        setField(term25928, term25928.getClass(), "defaultArgName", null);
        setField(term25928, term25928.getClass(), "optionComparator", null);
        term25932 = new Integer(0);
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
        args[1] = term25932;
        args[2] = null;
        callMethod(klass, "printUsage", argTypes, term25928, args);
    }

};


