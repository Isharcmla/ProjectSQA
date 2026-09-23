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

public class HelpFormatter_setArgName_142381784252 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term683;
     Object term6692;

    public HelpFormatter_setArgName_142381784252() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term683 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term683, term683.getClass(), "defaultWidth", 74);
        setIntField(term683, term683.getClass(), "defaultLeftPad", 1);
        setIntField(term683, term683.getClass(), "defaultDescPad", 3);
        setField(term683, term683.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term683, term683.getClass(), "defaultNewLine", "\n");
        setField(term683, term683.getClass(), "defaultOptPrefix", "-");
        setField(term683, term683.getClass(), "defaultLongOptPrefix", "--");
        setField(term683, term683.getClass(), "defaultArgName", "arg");
        term6692 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term6692, term6692.getClass(), "defaultWidth", 74);
        setIntField(term6692, term6692.getClass(), "defaultLeftPad", 1);
        setIntField(term6692, term6692.getClass(), "defaultDescPad", 3);
        setField(term6692, term6692.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6692, term6692.getClass(), "defaultNewLine", "\n");
        setField(term6692, term6692.getClass(), "defaultOptPrefix", "-");
        setField(term6692, term6692.getClass(), "defaultLongOptPrefix", "--");
        setField(term6692, term6692.getClass(), "defaultArgName", "jJCZpVmanW");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "jJCZpVmanW";
        callMethod(klass, "setArgName", argTypes, term683, args);
        assertTrue(recursiveEquals(term683, term6692));
    }

};


