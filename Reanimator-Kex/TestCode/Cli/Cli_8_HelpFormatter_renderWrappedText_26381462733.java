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

public class HelpFormatter_renderWrappedText_26381462733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5122;
     Object term5150;
     Object term5182;
     Object term5184;

    public HelpFormatter_renderWrappedText_26381462733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5122 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term5122, term5122.getClass(), "defaultWidth", 74);
        setIntField(term5122, term5122.getClass(), "defaultLeftPad", 1);
        setIntField(term5122, term5122.getClass(), "defaultDescPad", 3);
        setField(term5122, term5122.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term5122, term5122.getClass(), "defaultNewLine", "\n");
        setField(term5122, term5122.getClass(), "defaultOptPrefix", "-");
        setField(term5122, term5122.getClass(), "defaultLongOptPrefix", "--");
        setField(term5122, term5122.getClass(), "defaultArgName", "arg");
        term5150 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term5163 = (byte[]) newByteArray(16);
        setField(term5150, term5150.getClass(), "toStringCache", "UiUYnPrcCi");
        setField(term5150, term5150.getClass(), "value", term5163);
        setByteField(term5150, term5150.getClass(), "coder", (byte) 75);
        setIntField(term5150, term5150.getClass(), "count", 1962444399);
        term5182 = new Integer(767834723);
        term5184 = new Integer(-602026508);
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
        args[0] = term5150;
        args[1] = term5182;
        args[2] = term5184;
        args[3] = "UoYtihxVaS";
        callMethod(klass, "renderWrappedText", argTypes, term5122, args);
    }

};


