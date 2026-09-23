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

public class HelpFormatter_getLongOptPrefix_127479109851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term641;
     Object term6604;

    public HelpFormatter_getLongOptPrefix_127479109851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term641 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term641, term641.getClass(), "defaultWidth", 74);
        setIntField(term641, term641.getClass(), "defaultLeftPad", 1);
        setIntField(term641, term641.getClass(), "defaultDescPad", 3);
        setField(term641, term641.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term641, term641.getClass(), "defaultNewLine", "\n");
        setField(term641, term641.getClass(), "defaultOptPrefix", "-");
        setField(term641, term641.getClass(), "defaultLongOptPrefix", "--");
        setField(term641, term641.getClass(), "defaultArgName", "arg");
        term6604 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term6604, term6604.getClass(), "defaultWidth", 74);
        setIntField(term6604, term6604.getClass(), "defaultLeftPad", 1);
        setIntField(term6604, term6604.getClass(), "defaultDescPad", 3);
        setField(term6604, term6604.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6604, term6604.getClass(), "defaultNewLine", "\n");
        setField(term6604, term6604.getClass(), "defaultOptPrefix", "-");
        setField(term6604, term6604.getClass(), "defaultLongOptPrefix", "--");
        setField(term6604, term6604.getClass(), "defaultArgName", "arg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLongOptPrefix", argTypes, term641, args);
        assertTrue(recursiveEquals(term641, term6604));
        assertTrue(recursiveEquals(retValue, "--"));
    }

};


