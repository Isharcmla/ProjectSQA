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

public class HelpFormatter_getOptionComparator_163888940160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term985;
     Object term7702;
     Object term7670;

    public HelpFormatter_getOptionComparator_163888940160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term985 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term1016 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term985, term985.getClass(), "defaultWidth", 74);
        setIntField(term985, term985.getClass(), "defaultLeftPad", 1);
        setIntField(term985, term985.getClass(), "defaultDescPad", 3);
        setField(term985, term985.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term985, term985.getClass(), "defaultNewLine", "\n");
        setField(term985, term985.getClass(), "defaultOptPrefix", "-");
        setField(term985, term985.getClass(), "defaultLongOptPrefix", "--");
        setField(term985, term985.getClass(), "longOptSeparator", " ");
        setField(term985, term985.getClass(), "defaultArgName", "arg");
        setField(term985, term985.getClass(), "optionComparator", term1016);
        term7702 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term7715 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term7702, term7702.getClass(), "defaultWidth", 74);
        setIntField(term7702, term7702.getClass(), "defaultLeftPad", 1);
        setIntField(term7702, term7702.getClass(), "defaultDescPad", 3);
        setField(term7702, term7702.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term7702, term7702.getClass(), "defaultNewLine", "\n");
        setField(term7702, term7702.getClass(), "defaultOptPrefix", "-");
        setField(term7702, term7702.getClass(), "defaultLongOptPrefix", "--");
        setField(term7702, term7702.getClass(), "longOptSeparator", " ");
        setField(term7702, term7702.getClass(), "defaultArgName", "arg");
        setField(term7702, term7702.getClass(), "optionComparator", term7715);
        term7670 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOptionComparator", argTypes, term985, args);
        assertTrue(recursiveEquals(term985, term7702));
        assertTrue(recursiveEquals(retValue, term7670));
    }

};


