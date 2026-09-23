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

public class HelpFormatter_getLeftPadding_88745013445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term146;
     Object term6224;

    public HelpFormatter_getLeftPadding_88745013445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term146 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term177 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term146, term146.getClass(), "defaultWidth", 74);
        setIntField(term146, term146.getClass(), "defaultLeftPad", 1);
        setIntField(term146, term146.getClass(), "defaultDescPad", 3);
        setField(term146, term146.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term146, term146.getClass(), "defaultNewLine", "\n");
        setField(term146, term146.getClass(), "defaultOptPrefix", "-");
        setField(term146, term146.getClass(), "defaultLongOptPrefix", "--");
        setField(term146, term146.getClass(), "longOptSeparator", " ");
        setField(term146, term146.getClass(), "defaultArgName", "arg");
        setField(term146, term146.getClass(), "optionComparator", term177);
        term6224 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term6237 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term6224, term6224.getClass(), "defaultWidth", 74);
        setIntField(term6224, term6224.getClass(), "defaultLeftPad", 1);
        setIntField(term6224, term6224.getClass(), "defaultDescPad", 3);
        setField(term6224, term6224.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6224, term6224.getClass(), "defaultNewLine", "\n");
        setField(term6224, term6224.getClass(), "defaultOptPrefix", "-");
        setField(term6224, term6224.getClass(), "defaultLongOptPrefix", "--");
        setField(term6224, term6224.getClass(), "longOptSeparator", " ");
        setField(term6224, term6224.getClass(), "defaultArgName", "arg");
        setField(term6224, term6224.getClass(), "optionComparator", term6237);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLeftPadding", argTypes, term146, args);
        assertTrue(recursiveEquals(term146, term6224));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


