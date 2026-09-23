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

public class HelpFormatter_printUsage_115759491162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25070;
     Object term25074;

    public HelpFormatter_printUsage_115759491162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25070 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term25070, term25070.getClass(), "defaultWidth", 0);
        setIntField(term25070, term25070.getClass(), "defaultLeftPad", 0);
        setIntField(term25070, term25070.getClass(), "defaultDescPad", 0);
        setField(term25070, term25070.getClass(), "defaultSyntaxPrefix", null);
        setField(term25070, term25070.getClass(), "defaultNewLine", null);
        setField(term25070, term25070.getClass(), "defaultOptPrefix", null);
        setField(term25070, term25070.getClass(), "defaultLongOptPrefix", null);
        setField(term25070, term25070.getClass(), "defaultArgName", null);
        term25074 = new Integer(0);
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
        args[1] = term25074;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "printUsage", argTypes, term25070, args);
    }

};


