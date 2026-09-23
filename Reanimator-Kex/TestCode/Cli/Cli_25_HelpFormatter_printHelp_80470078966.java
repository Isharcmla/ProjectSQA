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

public class HelpFormatter_printHelp_80470078966 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25130;
     Object term25134;
     Object term25136;
     Object term25138;
     Object term25140;

    public HelpFormatter_printHelp_80470078966() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25130 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term25130, term25130.getClass(), "defaultWidth", 0);
        setIntField(term25130, term25130.getClass(), "defaultLeftPad", 0);
        setIntField(term25130, term25130.getClass(), "defaultDescPad", 0);
        setField(term25130, term25130.getClass(), "defaultSyntaxPrefix", null);
        setField(term25130, term25130.getClass(), "defaultNewLine", null);
        setField(term25130, term25130.getClass(), "defaultOptPrefix", null);
        setField(term25130, term25130.getClass(), "defaultLongOptPrefix", null);
        setField(term25130, term25130.getClass(), "defaultArgName", null);
        setField(term25130, term25130.getClass(), "optionComparator", null);
        term25134 = new Integer(0);
        term25136 = new Integer(0);
        term25138 = new Integer(0);
        term25140 = new Boolean(false);
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
        args[1] = term25134;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = term25136;
        args[6] = term25138;
        args[7] = null;
        args[8] = term25140;
        callMethod(klass, "printHelp", argTypes, term25130, args);
    }

};


