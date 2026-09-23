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

public class HelpFormatter_printOptions_199678283575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26549;
     Object term26553;
     Object term26555;
     Object term26557;

    public HelpFormatter_printOptions_199678283575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26549 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term26549, term26549.getClass(), "defaultWidth", 0);
        setIntField(term26549, term26549.getClass(), "defaultLeftPad", 0);
        setIntField(term26549, term26549.getClass(), "defaultDescPad", 0);
        setField(term26549, term26549.getClass(), "defaultSyntaxPrefix", null);
        setField(term26549, term26549.getClass(), "defaultNewLine", null);
        setField(term26549, term26549.getClass(), "defaultOptPrefix", null);
        setField(term26549, term26549.getClass(), "defaultLongOptPrefix", null);
        setField(term26549, term26549.getClass(), "longOptSeparator", null);
        setField(term26549, term26549.getClass(), "defaultArgName", null);
        setField(term26549, term26549.getClass(), "optionComparator", null);
        term26553 = new Integer(0);
        term26555 = new Integer(0);
        term26557 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.io.PrintWriter");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.apache.commons.cli.Options");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term26553;
        args[2] = null;
        args[3] = term26555;
        args[4] = term26557;
        callMethod(klass, "printOptions", argTypes, term26549, args);
    }

};


