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

public class HelpFormatter_getWidth_127858542639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;
     Object term5574;

    public HelpFormatter_getWidth_127858542639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term45, term45.getClass(), "defaultWidth", 74);
        setIntField(term45, term45.getClass(), "defaultLeftPad", 1);
        setIntField(term45, term45.getClass(), "defaultDescPad", 3);
        setField(term45, term45.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term45, term45.getClass(), "defaultNewLine", "\n");
        setField(term45, term45.getClass(), "defaultOptPrefix", "-");
        setField(term45, term45.getClass(), "defaultLongOptPrefix", "--");
        setField(term45, term45.getClass(), "defaultArgName", "arg");
        term5574 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term5574, term5574.getClass(), "defaultWidth", 74);
        setIntField(term5574, term5574.getClass(), "defaultLeftPad", 1);
        setIntField(term5574, term5574.getClass(), "defaultDescPad", 3);
        setField(term5574, term5574.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term5574, term5574.getClass(), "defaultNewLine", "\n");
        setField(term5574, term5574.getClass(), "defaultOptPrefix", "-");
        setField(term5574, term5574.getClass(), "defaultLongOptPrefix", "--");
        setField(term5574, term5574.getClass(), "defaultArgName", "arg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getWidth", argTypes, term45, args);
        assertTrue(recursiveEquals(term45, term5574));
        assertTrue(recursiveEquals(retValue, 74));
    }

};


