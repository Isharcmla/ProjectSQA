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

public class HelpFormatter_renderWrappedText_26381462770 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25126;
     Object term25130;
     Object term25132;

    public HelpFormatter_renderWrappedText_26381462770() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25126 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term25126, term25126.getClass(), "defaultWidth", 0);
        setIntField(term25126, term25126.getClass(), "defaultLeftPad", 0);
        setIntField(term25126, term25126.getClass(), "defaultDescPad", 0);
        setField(term25126, term25126.getClass(), "defaultSyntaxPrefix", null);
        setField(term25126, term25126.getClass(), "defaultNewLine", null);
        setField(term25126, term25126.getClass(), "defaultOptPrefix", null);
        setField(term25126, term25126.getClass(), "defaultLongOptPrefix", null);
        setField(term25126, term25126.getClass(), "defaultArgName", null);
        term25130 = new Integer(0);
        term25132 = new Integer(0);
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
        args[1] = term25130;
        args[2] = term25132;
        args[3] = null;
        callMethod(klass, "renderWrappedText", argTypes, term25126, args);
    }

};


