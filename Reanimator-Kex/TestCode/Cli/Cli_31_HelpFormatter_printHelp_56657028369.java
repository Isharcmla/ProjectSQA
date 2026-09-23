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

public class HelpFormatter_printHelp_56657028369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25890;
     Object term25894;
     Object term25896;
     Object term25898;

    public HelpFormatter_printHelp_56657028369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25890 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term25890, term25890.getClass(), "defaultWidth", 0);
        setIntField(term25890, term25890.getClass(), "defaultLeftPad", 0);
        setIntField(term25890, term25890.getClass(), "defaultDescPad", 0);
        setField(term25890, term25890.getClass(), "defaultSyntaxPrefix", null);
        setField(term25890, term25890.getClass(), "defaultNewLine", null);
        setField(term25890, term25890.getClass(), "defaultOptPrefix", null);
        setField(term25890, term25890.getClass(), "defaultLongOptPrefix", null);
        setField(term25890, term25890.getClass(), "longOptSeparator", null);
        setField(term25890, term25890.getClass(), "defaultArgName", null);
        setField(term25890, term25890.getClass(), "optionComparator", null);
        term25894 = new Integer(0);
        term25896 = new Integer(0);
        term25898 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[8];
        argTypes[0] = Class.forName("java.io.PrintWriter");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = Class.forName("org.apache.commons.cli.Options");
        argTypes[5] = int.class;
        argTypes[6] = int.class;
        argTypes[7] = Class.forName("java.lang.String");
        Object[] args = new Object[8];
        args[0] = null;
        args[1] = term25894;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = term25896;
        args[6] = term25898;
        args[7] = null;
        callMethod(klass, "printHelp", argTypes, term25890, args);
    }

};


