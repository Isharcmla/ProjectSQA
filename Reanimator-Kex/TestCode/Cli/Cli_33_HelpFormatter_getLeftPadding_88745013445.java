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
     Object term6249;

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
        term6249 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term6269 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term6249, term6249.getClass(), "defaultWidth", 74);
        setIntField(term6249, term6249.getClass(), "defaultLeftPad", 1);
        setIntField(term6249, term6249.getClass(), "defaultDescPad", 3);
        setField(term6249, term6249.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6249, term6249.getClass(), "defaultNewLine", "\n");
        setField(term6249, term6249.getClass(), "defaultOptPrefix", "-");
        setField(term6249, term6249.getClass(), "defaultLongOptPrefix", "--");
        setField(term6249, term6249.getClass(), "longOptSeparator", " ");
        setField(term6249, term6249.getClass(), "defaultArgName", "arg");
        setField(term6249, term6249.getClass(), "optionComparator", term6269);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLeftPadding", argTypes, term146, args);
        assertTrue(recursiveEquals(term146, term6249));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


