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

public class HelpFormatter_printOptions_199678283566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25092;
     Object term25096;
     Object term25098;
     Object term25100;

    public HelpFormatter_printOptions_199678283566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25092 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term25092, term25092.getClass(), "defaultWidth", 0);
        setIntField(term25092, term25092.getClass(), "defaultLeftPad", 0);
        setIntField(term25092, term25092.getClass(), "defaultDescPad", 0);
        setField(term25092, term25092.getClass(), "defaultSyntaxPrefix", null);
        setField(term25092, term25092.getClass(), "defaultNewLine", null);
        setField(term25092, term25092.getClass(), "defaultOptPrefix", null);
        setField(term25092, term25092.getClass(), "defaultLongOptPrefix", null);
        setField(term25092, term25092.getClass(), "defaultArgName", null);
        term25096 = new Integer(0);
        term25098 = new Integer(0);
        term25100 = new Integer(0);
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
        args[1] = term25096;
        args[2] = null;
        args[3] = term25098;
        args[4] = term25100;
        callMethod(klass, "printOptions", argTypes, term25092, args);
    }

};


