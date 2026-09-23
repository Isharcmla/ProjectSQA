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

public class HelpFormatter_setLongOptPrefix_16564890250 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term577;
     Object term6503;

    public HelpFormatter_setLongOptPrefix_16564890250() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term577 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term577, term577.getClass(), "defaultWidth", 74);
        setIntField(term577, term577.getClass(), "defaultLeftPad", 1);
        setIntField(term577, term577.getClass(), "defaultDescPad", 3);
        setField(term577, term577.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term577, term577.getClass(), "defaultNewLine", "\n");
        setField(term577, term577.getClass(), "defaultOptPrefix", "-");
        setField(term577, term577.getClass(), "defaultLongOptPrefix", "--");
        setField(term577, term577.getClass(), "defaultArgName", "arg");
        term6503 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term6503, term6503.getClass(), "defaultWidth", 74);
        setIntField(term6503, term6503.getClass(), "defaultLeftPad", 1);
        setIntField(term6503, term6503.getClass(), "defaultDescPad", 3);
        setField(term6503, term6503.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6503, term6503.getClass(), "defaultNewLine", "\n");
        setField(term6503, term6503.getClass(), "defaultOptPrefix", "-");
        setField(term6503, term6503.getClass(), "defaultLongOptPrefix", "xxtlPwDYFs");
        setField(term6503, term6503.getClass(), "defaultArgName", "arg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xxtlPwDYFs";
        callMethod(klass, "setLongOptPrefix", argTypes, term577, args);
        assertTrue(recursiveEquals(term577, term6503));
    }

};


