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

public class HelpFormatter_getArgName_205966843053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term747;
     Object term6793;

    public HelpFormatter_getArgName_205966843053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term747 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term747, term747.getClass(), "defaultWidth", 74);
        setIntField(term747, term747.getClass(), "defaultLeftPad", 1);
        setIntField(term747, term747.getClass(), "defaultDescPad", 3);
        setField(term747, term747.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term747, term747.getClass(), "defaultNewLine", "\n");
        setField(term747, term747.getClass(), "defaultOptPrefix", "-");
        setField(term747, term747.getClass(), "defaultLongOptPrefix", "--");
        setField(term747, term747.getClass(), "defaultArgName", "arg");
        term6793 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term6793, term6793.getClass(), "defaultWidth", 74);
        setIntField(term6793, term6793.getClass(), "defaultLeftPad", 1);
        setIntField(term6793, term6793.getClass(), "defaultDescPad", 3);
        setField(term6793, term6793.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6793, term6793.getClass(), "defaultNewLine", "\n");
        setField(term6793, term6793.getClass(), "defaultOptPrefix", "-");
        setField(term6793, term6793.getClass(), "defaultLongOptPrefix", "--");
        setField(term6793, term6793.getClass(), "defaultArgName", "arg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getArgName", argTypes, term747, args);
        assertTrue(recursiveEquals(term747, term6793));
        assertTrue(recursiveEquals(retValue, "arg"));
    }

};


