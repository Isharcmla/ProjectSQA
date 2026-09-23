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

public class HelpFormatter_printUsage_49042707570 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25158;
     Object term25162;

    public HelpFormatter_printUsage_49042707570() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25158 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term25158, term25158.getClass(), "defaultWidth", 0);
        setIntField(term25158, term25158.getClass(), "defaultLeftPad", 0);
        setIntField(term25158, term25158.getClass(), "defaultDescPad", 0);
        setField(term25158, term25158.getClass(), "defaultSyntaxPrefix", null);
        setField(term25158, term25158.getClass(), "defaultNewLine", null);
        setField(term25158, term25158.getClass(), "defaultOptPrefix", null);
        setField(term25158, term25158.getClass(), "defaultLongOptPrefix", null);
        setField(term25158, term25158.getClass(), "defaultArgName", null);
        setField(term25158, term25158.getClass(), "optionComparator", null);
        term25162 = new Integer(0);
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
        args[1] = term25162;
        args[2] = null;
        callMethod(klass, "printUsage", argTypes, term25158, args);
    }

};


