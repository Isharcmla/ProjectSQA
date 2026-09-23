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

public class HelpFormatter_printUsage_115759491171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34658;
     Object term34662;

    public HelpFormatter_printUsage_115759491171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34658 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term34658, term34658.getClass(), "defaultWidth", 0);
        setIntField(term34658, term34658.getClass(), "defaultLeftPad", 0);
        setIntField(term34658, term34658.getClass(), "defaultDescPad", 0);
        setField(term34658, term34658.getClass(), "defaultSyntaxPrefix", null);
        setField(term34658, term34658.getClass(), "defaultNewLine", null);
        setField(term34658, term34658.getClass(), "defaultOptPrefix", null);
        setField(term34658, term34658.getClass(), "defaultLongOptPrefix", null);
        setField(term34658, term34658.getClass(), "longOptSeparator", null);
        setField(term34658, term34658.getClass(), "defaultArgName", null);
        setField(term34658, term34658.getClass(), "optionComparator", null);
        term34662 = new Integer(0);
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
        args[1] = term34662;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "printUsage", argTypes, term34658, args);
    }

};


