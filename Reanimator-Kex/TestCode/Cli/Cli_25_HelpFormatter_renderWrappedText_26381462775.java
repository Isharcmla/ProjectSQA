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

public class HelpFormatter_renderWrappedText_26381462775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25198;
     Object term25202;
     Object term25204;

    public HelpFormatter_renderWrappedText_26381462775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25198 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term25198, term25198.getClass(), "defaultWidth", 0);
        setIntField(term25198, term25198.getClass(), "defaultLeftPad", 0);
        setIntField(term25198, term25198.getClass(), "defaultDescPad", 0);
        setField(term25198, term25198.getClass(), "defaultSyntaxPrefix", null);
        setField(term25198, term25198.getClass(), "defaultNewLine", null);
        setField(term25198, term25198.getClass(), "defaultOptPrefix", null);
        setField(term25198, term25198.getClass(), "defaultLongOptPrefix", null);
        setField(term25198, term25198.getClass(), "defaultArgName", null);
        setField(term25198, term25198.getClass(), "optionComparator", null);
        term25202 = new Integer(0);
        term25204 = new Integer(0);
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
        args[1] = term25202;
        args[2] = term25204;
        args[3] = null;
        callMethod(klass, "renderWrappedText", argTypes, term25198, args);
    }

};


