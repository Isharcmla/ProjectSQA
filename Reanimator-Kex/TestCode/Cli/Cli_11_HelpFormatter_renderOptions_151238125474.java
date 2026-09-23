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

public class HelpFormatter_renderOptions_151238125474 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25896;
     Object term25900;
     Object term25902;
     Object term25904;

    public HelpFormatter_renderOptions_151238125474() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25896 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term25896, term25896.getClass(), "defaultWidth", 0);
        setIntField(term25896, term25896.getClass(), "defaultLeftPad", 0);
        setIntField(term25896, term25896.getClass(), "defaultDescPad", 0);
        setField(term25896, term25896.getClass(), "defaultSyntaxPrefix", null);
        setField(term25896, term25896.getClass(), "defaultNewLine", null);
        setField(term25896, term25896.getClass(), "defaultOptPrefix", null);
        setField(term25896, term25896.getClass(), "defaultLongOptPrefix", null);
        setField(term25896, term25896.getClass(), "defaultArgName", null);
        setField(term25896, term25896.getClass(), "optionComparator", null);
        term25900 = new Integer(0);
        term25902 = new Integer(0);
        term25904 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.apache.commons.cli.Options");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term25900;
        args[2] = null;
        args[3] = term25902;
        args[4] = term25904;
        callMethod(klass, "renderOptions", argTypes, term25896, args);
    }

};


