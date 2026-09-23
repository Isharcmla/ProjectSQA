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
     Object term26515;
     Object term26519;
     Object term26521;
     Object term26523;
     Object term26525;

    public HelpFormatter_printHelp_80470078970() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26515 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term26515, term26515.getClass(), "defaultWidth", 0);
        setIntField(term26515, term26515.getClass(), "defaultLeftPad", 0);
        setIntField(term26515, term26515.getClass(), "defaultDescPad", 0);
        setField(term26515, term26515.getClass(), "defaultSyntaxPrefix", null);
        setField(term26515, term26515.getClass(), "defaultNewLine", null);
        setField(term26515, term26515.getClass(), "defaultOptPrefix", null);
        setField(term26515, term26515.getClass(), "defaultLongOptPrefix", null);
        setField(term26515, term26515.getClass(), "longOptSeparator", null);
        setField(term26515, term26515.getClass(), "defaultArgName", null);
        setField(term26515, term26515.getClass(), "optionComparator", null);
        term26519 = new Integer(0);
        term26521 = new Integer(0);
        term26523 = new Integer(0);
        term26525 = new Boolean(false);
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
        args[1] = term26519;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = term26521;
        args[6] = term26523;
        args[7] = null;
        args[8] = term26525;
        callMethod(klass, "printHelp", argTypes, term26515, args);
    }

};


