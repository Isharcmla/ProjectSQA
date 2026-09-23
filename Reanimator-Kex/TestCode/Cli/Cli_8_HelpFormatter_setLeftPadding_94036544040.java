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
import java.lang.Integer;

public class HelpFormatter_setLeftPadding_94036544040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87;
     Object term115;
     Object term5642;

    public HelpFormatter_setLeftPadding_94036544040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term87, term87.getClass(), "defaultWidth", 74);
        setIntField(term87, term87.getClass(), "defaultLeftPad", 1);
        setIntField(term87, term87.getClass(), "defaultDescPad", 3);
        setField(term87, term87.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term87, term87.getClass(), "defaultNewLine", "\n");
        setField(term87, term87.getClass(), "defaultOptPrefix", "-");
        setField(term87, term87.getClass(), "defaultLongOptPrefix", "--");
        setField(term87, term87.getClass(), "defaultArgName", "arg");
        term115 = new Integer(1162663216);
        term5642 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term5642, term5642.getClass(), "defaultWidth", 74);
        setIntField(term5642, term5642.getClass(), "defaultLeftPad", 1162663216);
        setIntField(term5642, term5642.getClass(), "defaultDescPad", 3);
        setField(term5642, term5642.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term5642, term5642.getClass(), "defaultNewLine", "\n");
        setField(term5642, term5642.getClass(), "defaultOptPrefix", "-");
        setField(term5642, term5642.getClass(), "defaultLongOptPrefix", "--");
        setField(term5642, term5642.getClass(), "defaultArgName", "arg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term115;
        callMethod(klass, "setLeftPadding", argTypes, term87, args);
        assertTrue(recursiveEquals(term87, term5642));
        assertTrue(recursiveEquals(term115, 1162663216));
    }

};


