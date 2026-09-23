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

public class HelpFormatter_findWrapPos_119204609671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25134;
     Object term25138;
     Object term25140;

    public HelpFormatter_findWrapPos_119204609671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25134 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term25134, term25134.getClass(), "defaultWidth", 0);
        setIntField(term25134, term25134.getClass(), "defaultLeftPad", 0);
        setIntField(term25134, term25134.getClass(), "defaultDescPad", 0);
        setField(term25134, term25134.getClass(), "defaultSyntaxPrefix", null);
        setField(term25134, term25134.getClass(), "defaultNewLine", null);
        setField(term25134, term25134.getClass(), "defaultOptPrefix", null);
        setField(term25134, term25134.getClass(), "defaultLongOptPrefix", null);
        setField(term25134, term25134.getClass(), "defaultArgName", null);
        term25138 = new Integer(0);
        term25140 = new Integer(0);
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
        args[1] = term25138;
        args[2] = term25140;
        callMethod(klass, "findWrapPos", argTypes, term25134, args);
    }

};


