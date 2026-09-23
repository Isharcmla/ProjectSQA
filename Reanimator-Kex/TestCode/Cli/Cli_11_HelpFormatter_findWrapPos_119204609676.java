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

public class HelpFormatter_findWrapPos_119204609676 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25914;
     Object term25918;
     Object term25920;

    public HelpFormatter_findWrapPos_119204609676() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25914 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term25914, term25914.getClass(), "defaultWidth", 0);
        setIntField(term25914, term25914.getClass(), "defaultLeftPad", 0);
        setIntField(term25914, term25914.getClass(), "defaultDescPad", 0);
        setField(term25914, term25914.getClass(), "defaultSyntaxPrefix", null);
        setField(term25914, term25914.getClass(), "defaultNewLine", null);
        setField(term25914, term25914.getClass(), "defaultOptPrefix", null);
        setField(term25914, term25914.getClass(), "defaultLongOptPrefix", null);
        setField(term25914, term25914.getClass(), "defaultArgName", null);
        setField(term25914, term25914.getClass(), "optionComparator", null);
        term25918 = new Integer(0);
        term25920 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term25918;
        args[2] = term25920;
        callMethod(klass, "findWrapPos", argTypes, term25914, args);
    }

};


