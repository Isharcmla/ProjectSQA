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

public class HelpFormatter_getNewLine_29684611747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term429;
     Object term6225;

    public HelpFormatter_getNewLine_29684611747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term429 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term429, term429.getClass(), "defaultWidth", 74);
        setIntField(term429, term429.getClass(), "defaultLeftPad", 1);
        setIntField(term429, term429.getClass(), "defaultDescPad", 3);
        setField(term429, term429.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term429, term429.getClass(), "defaultNewLine", "\n");
        setField(term429, term429.getClass(), "defaultOptPrefix", "-");
        setField(term429, term429.getClass(), "defaultLongOptPrefix", "--");
        setField(term429, term429.getClass(), "defaultArgName", "arg");
        term6225 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term6225, term6225.getClass(), "defaultWidth", 74);
        setIntField(term6225, term6225.getClass(), "defaultLeftPad", 1);
        setIntField(term6225, term6225.getClass(), "defaultDescPad", 3);
        setField(term6225, term6225.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6225, term6225.getClass(), "defaultNewLine", "\n");
        setField(term6225, term6225.getClass(), "defaultOptPrefix", "-");
        setField(term6225, term6225.getClass(), "defaultLongOptPrefix", "--");
        setField(term6225, term6225.getClass(), "defaultArgName", "arg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNewLine", argTypes, term429, args);
        assertTrue(recursiveEquals(term429, term6225));
        assertTrue(recursiveEquals(retValue, "\n"));
    }

};


