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

public class HelpFormatter_renderWrappedText_26381462737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5576;
     Object term5608;
     Object term5640;
     Object term5642;

    public HelpFormatter_renderWrappedText_26381462737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5576 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term5607 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term5576, term5576.getClass(), "defaultWidth", 74);
        setIntField(term5576, term5576.getClass(), "defaultLeftPad", 1);
        setIntField(term5576, term5576.getClass(), "defaultDescPad", 3);
        setField(term5576, term5576.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term5576, term5576.getClass(), "defaultNewLine", "\n");
        setField(term5576, term5576.getClass(), "defaultOptPrefix", "-");
        setField(term5576, term5576.getClass(), "defaultLongOptPrefix", "--");
        setField(term5576, term5576.getClass(), "longOptSeparator", " ");
        setField(term5576, term5576.getClass(), "defaultArgName", "arg");
        setField(term5576, term5576.getClass(), "optionComparator", term5607);
        term5608 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term5621 = (byte[]) newByteArray(16);
        setField(term5608, term5608.getClass(), "toStringCache", "UoYtihxVaS");
        setField(term5608, term5608.getClass(), "value", term5621);
        setByteField(term5608, term5608.getClass(), "coder", (byte) 75);
        setIntField(term5608, term5608.getClass(), "count", 1962444399);
        term5640 = new Integer(767834723);
        term5642 = new Integer(-602026508);
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
        args[0] = term5608;
        args[1] = term5640;
        args[2] = term5642;
        args[3] = "JDswTTCZHV";
        callMethod(klass, "renderWrappedText", argTypes, term5576, args);
    }

};


