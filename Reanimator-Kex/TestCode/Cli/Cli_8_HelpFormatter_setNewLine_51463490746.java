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

public class HelpFormatter_setNewLine_51463490746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365;
     Object term6124;

    public HelpFormatter_setNewLine_51463490746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term365 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term365, term365.getClass(), "defaultWidth", 74);
        setIntField(term365, term365.getClass(), "defaultLeftPad", 1);
        setIntField(term365, term365.getClass(), "defaultDescPad", 3);
        setField(term365, term365.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term365, term365.getClass(), "defaultNewLine", "\n");
        setField(term365, term365.getClass(), "defaultOptPrefix", "-");
        setField(term365, term365.getClass(), "defaultLongOptPrefix", "--");
        setField(term365, term365.getClass(), "defaultArgName", "arg");
        term6124 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term6124, term6124.getClass(), "defaultWidth", 74);
        setIntField(term6124, term6124.getClass(), "defaultLeftPad", 1);
        setIntField(term6124, term6124.getClass(), "defaultDescPad", 3);
        setField(term6124, term6124.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6124, term6124.getClass(), "defaultNewLine", "sjlJAEtRrb");
        setField(term6124, term6124.getClass(), "defaultOptPrefix", "-");
        setField(term6124, term6124.getClass(), "defaultLongOptPrefix", "--");
        setField(term6124, term6124.getClass(), "defaultArgName", "arg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "sjlJAEtRrb";
        callMethod(klass, "setNewLine", argTypes, term365, args);
        assertTrue(recursiveEquals(term365, term6124));
    }

};


