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
import static org.apache.commons.cli.EqualityUtils.*;

public class HelpFormatter_getSyntaxPrefix_26169723045 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term323;
     Object term6029;

    public HelpFormatter_getSyntaxPrefix_26169723045() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term323 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term323, term323.getClass(), "defaultWidth", 74);
        setIntField(term323, term323.getClass(), "defaultLeftPad", 1);
        setIntField(term323, term323.getClass(), "defaultDescPad", 3);
        setField(term323, term323.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term323, term323.getClass(), "defaultNewLine", "\n");
        setField(term323, term323.getClass(), "defaultOptPrefix", "-");
        setField(term323, term323.getClass(), "defaultLongOptPrefix", "--");
        setField(term323, term323.getClass(), "defaultArgName", "arg");
        term6029 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term6029, term6029.getClass(), "defaultWidth", 74);
        setIntField(term6029, term6029.getClass(), "defaultLeftPad", 1);
        setIntField(term6029, term6029.getClass(), "defaultDescPad", 3);
        setField(term6029, term6029.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6029, term6029.getClass(), "defaultNewLine", "\n");
        setField(term6029, term6029.getClass(), "defaultOptPrefix", "-");
        setField(term6029, term6029.getClass(), "defaultLongOptPrefix", "--");
        setField(term6029, term6029.getClass(), "defaultArgName", "arg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSyntaxPrefix", argTypes, term323, args);
        assertTrue(recursiveEquals(term323, term6029));
        assertTrue(recursiveEquals(retValue, "usage: "));
    }

};


