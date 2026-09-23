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

public class HelpFormatter_getLeftPadding_88745013443 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134;
     Object term5883;

    public HelpFormatter_getLeftPadding_88745013443() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term162 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term134, term134.getClass(), "defaultWidth", 74);
        setIntField(term134, term134.getClass(), "defaultLeftPad", 1);
        setIntField(term134, term134.getClass(), "defaultDescPad", 3);
        setField(term134, term134.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term134, term134.getClass(), "defaultNewLine", "\n");
        setField(term134, term134.getClass(), "defaultOptPrefix", "-");
        setField(term134, term134.getClass(), "defaultLongOptPrefix", "--");
        setField(term134, term134.getClass(), "defaultArgName", "arg");
        setField(term134, term134.getClass(), "optionComparator", term162);
        term5883 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term5894 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term5883, term5883.getClass(), "defaultWidth", 74);
        setIntField(term5883, term5883.getClass(), "defaultLeftPad", 1);
        setIntField(term5883, term5883.getClass(), "defaultDescPad", 3);
        setField(term5883, term5883.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term5883, term5883.getClass(), "defaultNewLine", "\n");
        setField(term5883, term5883.getClass(), "defaultOptPrefix", "-");
        setField(term5883, term5883.getClass(), "defaultLongOptPrefix", "--");
        setField(term5883, term5883.getClass(), "defaultArgName", "arg");
        setField(term5883, term5883.getClass(), "optionComparator", term5894);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLeftPadding", argTypes, term134, args);
        assertTrue(recursiveEquals(term134, term5883));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


