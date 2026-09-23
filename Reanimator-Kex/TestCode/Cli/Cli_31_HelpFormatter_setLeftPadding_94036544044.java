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
import java.lang.Integer;

public class HelpFormatter_setLeftPadding_94036544044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97;
     Object term129;
     Object term6147;

    public HelpFormatter_setLeftPadding_94036544044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term128 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term97, term97.getClass(), "defaultWidth", 74);
        setIntField(term97, term97.getClass(), "defaultLeftPad", 1);
        setIntField(term97, term97.getClass(), "defaultDescPad", 3);
        setField(term97, term97.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term97, term97.getClass(), "defaultNewLine", "\n");
        setField(term97, term97.getClass(), "defaultOptPrefix", "-");
        setField(term97, term97.getClass(), "defaultLongOptPrefix", "--");
        setField(term97, term97.getClass(), "longOptSeparator", " ");
        setField(term97, term97.getClass(), "defaultArgName", "arg");
        setField(term97, term97.getClass(), "optionComparator", term128);
        term129 = new Integer(1162663216);
        term6147 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term6160 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term6147, term6147.getClass(), "defaultWidth", 74);
        setIntField(term6147, term6147.getClass(), "defaultLeftPad", 1162663216);
        setIntField(term6147, term6147.getClass(), "defaultDescPad", 3);
        setField(term6147, term6147.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term6147, term6147.getClass(), "defaultNewLine", "\n");
        setField(term6147, term6147.getClass(), "defaultOptPrefix", "-");
        setField(term6147, term6147.getClass(), "defaultLongOptPrefix", "--");
        setField(term6147, term6147.getClass(), "longOptSeparator", " ");
        setField(term6147, term6147.getClass(), "defaultArgName", "arg");
        setField(term6147, term6147.getClass(), "optionComparator", term6160);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term129;
        callMethod(klass, "setLeftPadding", argTypes, term97, args);
        assertTrue(recursiveEquals(term97, term6147));
        assertTrue(recursiveEquals(term129, 1162663216));
    }

};


