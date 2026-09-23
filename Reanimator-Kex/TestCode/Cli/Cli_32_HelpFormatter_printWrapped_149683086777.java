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

public class HelpFormatter_printWrapped_149683086777 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26565;
     Object term26569;
     Object term26571;

    public HelpFormatter_printWrapped_149683086777() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26565 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term26565, term26565.getClass(), "defaultWidth", 0);
        setIntField(term26565, term26565.getClass(), "defaultLeftPad", 0);
        setIntField(term26565, term26565.getClass(), "defaultDescPad", 0);
        setField(term26565, term26565.getClass(), "defaultSyntaxPrefix", null);
        setField(term26565, term26565.getClass(), "defaultNewLine", null);
        setField(term26565, term26565.getClass(), "defaultOptPrefix", null);
        setField(term26565, term26565.getClass(), "defaultLongOptPrefix", null);
        setField(term26565, term26565.getClass(), "longOptSeparator", null);
        setField(term26565, term26565.getClass(), "defaultArgName", null);
        setField(term26565, term26565.getClass(), "optionComparator", null);
        term26569 = new Integer(0);
        term26571 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.PrintWriter");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term26569;
        args[2] = term26571;
        args[3] = null;
        callMethod(klass, "printWrapped", argTypes, term26565, args);
    }

};


