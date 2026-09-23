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

public class HelpFormatter_renderWrappedText_26381462735 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5281;
     Object term5310;
     Object term5342;
     Object term5344;

    public HelpFormatter_renderWrappedText_26381462735() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5281 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term5309 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term5281, term5281.getClass(), "defaultWidth", 74);
        setIntField(term5281, term5281.getClass(), "defaultLeftPad", 1);
        setIntField(term5281, term5281.getClass(), "defaultDescPad", 3);
        setField(term5281, term5281.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term5281, term5281.getClass(), "defaultNewLine", "\n");
        setField(term5281, term5281.getClass(), "defaultOptPrefix", "-");
        setField(term5281, term5281.getClass(), "defaultLongOptPrefix", "--");
        setField(term5281, term5281.getClass(), "defaultArgName", "arg");
        setField(term5281, term5281.getClass(), "optionComparator", term5309);
        term5310 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term5323 = (byte[]) newByteArray(16);
        setField(term5310, term5310.getClass(), "toStringCache", "UiUYnPrcCi");
        setField(term5310, term5310.getClass(), "value", term5323);
        setByteField(term5310, term5310.getClass(), "coder", (byte) 75);
        setIntField(term5310, term5310.getClass(), "count", 1962444399);
        term5342 = new Integer(767834723);
        term5344 = new Integer(-602026508);
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
        args[0] = term5310;
        args[1] = term5342;
        args[2] = term5344;
        args[3] = "UoYtihxVaS";
        callMethod(klass, "renderWrappedText", argTypes, term5281, args);
    }

};


