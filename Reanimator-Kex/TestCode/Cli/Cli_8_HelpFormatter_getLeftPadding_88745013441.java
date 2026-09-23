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

public class HelpFormatter_getLeftPadding_88745013441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term131;
     Object term5710;

    public HelpFormatter_getLeftPadding_88745013441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term131 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term131, term131.getClass(), "defaultWidth", 74);
        setIntField(term131, term131.getClass(), "defaultLeftPad", 1);
        setIntField(term131, term131.getClass(), "defaultDescPad", 3);
        setField(term131, term131.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term131, term131.getClass(), "defaultNewLine", "\n");
        setField(term131, term131.getClass(), "defaultOptPrefix", "-");
        setField(term131, term131.getClass(), "defaultLongOptPrefix", "--");
        setField(term131, term131.getClass(), "defaultArgName", "arg");
        term5710 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term5710, term5710.getClass(), "defaultWidth", 74);
        setIntField(term5710, term5710.getClass(), "defaultLeftPad", 1);
        setIntField(term5710, term5710.getClass(), "defaultDescPad", 3);
        setField(term5710, term5710.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term5710, term5710.getClass(), "defaultNewLine", "\n");
        setField(term5710, term5710.getClass(), "defaultOptPrefix", "-");
        setField(term5710, term5710.getClass(), "defaultLongOptPrefix", "--");
        setField(term5710, term5710.getClass(), "defaultArgName", "arg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLeftPadding", argTypes, term131, args);
        assertTrue(recursiveEquals(term131, term5710));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


