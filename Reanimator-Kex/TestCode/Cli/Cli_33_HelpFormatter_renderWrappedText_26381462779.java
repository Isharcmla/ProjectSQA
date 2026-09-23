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
     Object term34714;
     Object term34718;
     Object term34720;

    public HelpFormatter_renderWrappedText_26381462779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34714 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term34714, term34714.getClass(), "defaultWidth", 0);
        setIntField(term34714, term34714.getClass(), "defaultLeftPad", 0);
        setIntField(term34714, term34714.getClass(), "defaultDescPad", 0);
        setField(term34714, term34714.getClass(), "defaultSyntaxPrefix", null);
        setField(term34714, term34714.getClass(), "defaultNewLine", null);
        setField(term34714, term34714.getClass(), "defaultOptPrefix", null);
        setField(term34714, term34714.getClass(), "defaultLongOptPrefix", null);
        setField(term34714, term34714.getClass(), "longOptSeparator", null);
        setField(term34714, term34714.getClass(), "defaultArgName", null);
        setField(term34714, term34714.getClass(), "optionComparator", null);
        term34718 = new Integer(0);
        term34720 = new Integer(0);
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
        args[1] = term34718;
        args[2] = term34720;
        args[3] = null;
        callMethod(klass, "renderWrappedText", argTypes, term34714, args);
    }

};


