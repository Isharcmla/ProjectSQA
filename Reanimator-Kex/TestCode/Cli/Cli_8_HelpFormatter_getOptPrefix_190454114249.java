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

public class HelpFormatter_getOptPrefix_190454114249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term535;
     Object term6415;

    public HelpFormatter_getOptPrefix_190454114249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term535 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term535, term535.getClass(), "defaultWidth", 74);
        setIntField(term535, term535.getClass(), "defaultLeftPad", 1);
        setIntField(term535, term535.getClass(), "defaultDescPad", 3);
        setField(term535, term535.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term535, term535.getClass(), "defaultNewLine", "\n");
        setField(term535, term535.getClass(), "defaultOptPrefix", "-");
        setField(term535, term535.getClass(), "defaultLongOptPrefix", "--");
        setField(term535, term535.getClass(), "defaultArgName", "arg");
        term6415 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term6415, term6415.getClass(), "defaultWidth", 74);
        setIntField(term6415, term6415.getClass(), "defaultLeftPad", 1);
        setIntField(term6415, term6415.getClass(), "defaultDescPad", 3);
        setField(term6415, term6415.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6415, term6415.getClass(), "defaultNewLine", "\n");
        setField(term6415, term6415.getClass(), "defaultOptPrefix", "-");
        setField(term6415, term6415.getClass(), "defaultLongOptPrefix", "--");
        setField(term6415, term6415.getClass(), "defaultArgName", "arg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOptPrefix", argTypes, term535, args);
        assertTrue(recursiveEquals(term535, term6415));
        assertTrue(recursiveEquals(retValue, "-"));
    }

};


