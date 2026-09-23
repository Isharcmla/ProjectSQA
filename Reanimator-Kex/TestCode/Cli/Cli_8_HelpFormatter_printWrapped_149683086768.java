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

public class HelpFormatter_printWrapped_149683086768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25108;
     Object term25112;
     Object term25114;

    public HelpFormatter_printWrapped_149683086768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25108 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term25108, term25108.getClass(), "defaultWidth", 0);
        setIntField(term25108, term25108.getClass(), "defaultLeftPad", 0);
        setIntField(term25108, term25108.getClass(), "defaultDescPad", 0);
        setField(term25108, term25108.getClass(), "defaultSyntaxPrefix", null);
        setField(term25108, term25108.getClass(), "defaultNewLine", null);
        setField(term25108, term25108.getClass(), "defaultOptPrefix", null);
        setField(term25108, term25108.getClass(), "defaultLongOptPrefix", null);
        setField(term25108, term25108.getClass(), "defaultArgName", null);
        term25112 = new Integer(0);
        term25114 = new Integer(0);
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
        args[1] = term25112;
        args[2] = term25114;
        args[3] = null;
        callMethod(klass, "printWrapped", argTypes, term25108, args);
    }

};


