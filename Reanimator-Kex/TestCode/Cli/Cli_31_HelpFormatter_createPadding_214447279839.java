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
import java.lang.Object;
import java.lang.Integer;

public class HelpFormatter_createPadding_214447279839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5780;
     Object term5812;

    public HelpFormatter_createPadding_214447279839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5780 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term5811 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term5780, term5780.getClass(), "defaultWidth", 74);
        setIntField(term5780, term5780.getClass(), "defaultLeftPad", 1);
        setIntField(term5780, term5780.getClass(), "defaultDescPad", 3);
        setField(term5780, term5780.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term5780, term5780.getClass(), "defaultNewLine", "\n");
        setField(term5780, term5780.getClass(), "defaultOptPrefix", "-");
        setField(term5780, term5780.getClass(), "defaultLongOptPrefix", "--");
        setField(term5780, term5780.getClass(), "longOptSeparator", " ");
        setField(term5780, term5780.getClass(), "defaultArgName", "arg");
        setField(term5780, term5780.getClass(), "optionComparator", term5811);
        term5812 = new Integer(-817164822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5812;
        callMethod(klass, "createPadding", argTypes, term5780, args);
    }

};


