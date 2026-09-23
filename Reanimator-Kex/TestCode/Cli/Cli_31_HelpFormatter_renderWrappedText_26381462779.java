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
import java.lang.Integer;

public class HelpFormatter_renderWrappedText_26381462779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25968;
     Object term25972;
     Object term25974;

    public HelpFormatter_renderWrappedText_26381462779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25968 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term25968, term25968.getClass(), "defaultWidth", 0);
        setIntField(term25968, term25968.getClass(), "defaultLeftPad", 0);
        setIntField(term25968, term25968.getClass(), "defaultDescPad", 0);
        setField(term25968, term25968.getClass(), "defaultSyntaxPrefix", null);
        setField(term25968, term25968.getClass(), "defaultNewLine", null);
        setField(term25968, term25968.getClass(), "defaultOptPrefix", null);
        setField(term25968, term25968.getClass(), "defaultLongOptPrefix", null);
        setField(term25968, term25968.getClass(), "longOptSeparator", null);
        setField(term25968, term25968.getClass(), "defaultArgName", null);
        setField(term25968, term25968.getClass(), "optionComparator", null);
        term25972 = new Integer(0);
        term25974 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term25972;
        args[2] = term25974;
        args[3] = null;
        callMethod(klass, "renderWrappedText", argTypes, term25968, args);
    }

};


