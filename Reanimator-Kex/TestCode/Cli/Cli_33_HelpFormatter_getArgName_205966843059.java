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
import java.lang.Object;

public class HelpFormatter_getArgName_205966843059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term938;
     Object term7622;

    public HelpFormatter_getArgName_205966843059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term938 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term969 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term938, term938.getClass(), "defaultWidth", 74);
        setIntField(term938, term938.getClass(), "defaultLeftPad", 1);
        setIntField(term938, term938.getClass(), "defaultDescPad", 3);
        setField(term938, term938.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term938, term938.getClass(), "defaultNewLine", "\n");
        setField(term938, term938.getClass(), "defaultOptPrefix", "-");
        setField(term938, term938.getClass(), "defaultLongOptPrefix", "--");
        setField(term938, term938.getClass(), "longOptSeparator", " ");
        setField(term938, term938.getClass(), "defaultArgName", "arg");
        setField(term938, term938.getClass(), "optionComparator", term969);
        term7622 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term7635 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term7622, term7622.getClass(), "defaultWidth", 74);
        setIntField(term7622, term7622.getClass(), "defaultLeftPad", 1);
        setIntField(term7622, term7622.getClass(), "defaultDescPad", 3);
        setField(term7622, term7622.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term7622, term7622.getClass(), "defaultNewLine", "\n");
        setField(term7622, term7622.getClass(), "defaultOptPrefix", "-");
        setField(term7622, term7622.getClass(), "defaultLongOptPrefix", "--");
        setField(term7622, term7622.getClass(), "longOptSeparator", " ");
        setField(term7622, term7622.getClass(), "defaultArgName", "arg");
        setField(term7622, term7622.getClass(), "optionComparator", term7635);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getArgName", argTypes, term938, args);
        assertTrue(recursiveEquals(term938, term7622));
        assertTrue(recursiveEquals(retValue, "arg"));
    }

};


