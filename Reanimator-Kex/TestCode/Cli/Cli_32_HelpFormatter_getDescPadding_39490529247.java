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

public class HelpFormatter_getDescPadding_39490529247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242;
     Object term6378;

    public HelpFormatter_getDescPadding_39490529247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term273 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term242, term242.getClass(), "defaultWidth", 74);
        setIntField(term242, term242.getClass(), "defaultLeftPad", 1);
        setIntField(term242, term242.getClass(), "defaultDescPad", 3);
        setField(term242, term242.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term242, term242.getClass(), "defaultNewLine", "\n");
        setField(term242, term242.getClass(), "defaultOptPrefix", "-");
        setField(term242, term242.getClass(), "defaultLongOptPrefix", "--");
        setField(term242, term242.getClass(), "longOptSeparator", " ");
        setField(term242, term242.getClass(), "defaultArgName", "arg");
        setField(term242, term242.getClass(), "optionComparator", term273);
        term6378 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term6391 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term6378, term6378.getClass(), "defaultWidth", 74);
        setIntField(term6378, term6378.getClass(), "defaultLeftPad", 1);
        setIntField(term6378, term6378.getClass(), "defaultDescPad", 3);
        setField(term6378, term6378.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6378, term6378.getClass(), "defaultNewLine", "\n");
        setField(term6378, term6378.getClass(), "defaultOptPrefix", "-");
        setField(term6378, term6378.getClass(), "defaultLongOptPrefix", "--");
        setField(term6378, term6378.getClass(), "longOptSeparator", " ");
        setField(term6378, term6378.getClass(), "defaultArgName", "arg");
        setField(term6378, term6378.getClass(), "optionComparator", term6391);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDescPadding", argTypes, term242, args);
        assertTrue(recursiveEquals(term242, term6378));
        assertTrue(recursiveEquals(retValue, 3));
    }

};


