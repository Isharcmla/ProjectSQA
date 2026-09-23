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

public class HelpFormatter_setSyntaxPrefix_73264359444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term259;
     Object term5928;

    public HelpFormatter_setSyntaxPrefix_73264359444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term259 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term259, term259.getClass(), "defaultWidth", 74);
        setIntField(term259, term259.getClass(), "defaultLeftPad", 1);
        setIntField(term259, term259.getClass(), "defaultDescPad", 3);
        setField(term259, term259.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term259, term259.getClass(), "defaultNewLine", "\n");
        setField(term259, term259.getClass(), "defaultOptPrefix", "-");
        setField(term259, term259.getClass(), "defaultLongOptPrefix", "--");
        setField(term259, term259.getClass(), "defaultArgName", "arg");
        term5928 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term5928, term5928.getClass(), "defaultWidth", 74);
        setIntField(term5928, term5928.getClass(), "defaultLeftPad", 1);
        setIntField(term5928, term5928.getClass(), "defaultDescPad", 3);
        setField(term5928, term5928.getClass(), "defaultSyntaxPrefix", "PAEBtnZtTD");
        setField(term5928, term5928.getClass(), "defaultNewLine", "\n");
        setField(term5928, term5928.getClass(), "defaultOptPrefix", "-");
        setField(term5928, term5928.getClass(), "defaultLongOptPrefix", "--");
        setField(term5928, term5928.getClass(), "defaultArgName", "arg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        callMethod(klass, "setSyntaxPrefix", argTypes, term259, args);
        assertTrue(recursiveEquals(term259, term5928));
    }

};


