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

public class HelpFormatter_renderOptions_151238125469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25116;
     Object term25120;
     Object term25122;
     Object term25124;

    public HelpFormatter_renderOptions_151238125469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25116 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term25116, term25116.getClass(), "defaultWidth", 0);
        setIntField(term25116, term25116.getClass(), "defaultLeftPad", 0);
        setIntField(term25116, term25116.getClass(), "defaultDescPad", 0);
        setField(term25116, term25116.getClass(), "defaultSyntaxPrefix", null);
        setField(term25116, term25116.getClass(), "defaultNewLine", null);
        setField(term25116, term25116.getClass(), "defaultOptPrefix", null);
        setField(term25116, term25116.getClass(), "defaultLongOptPrefix", null);
        setField(term25116, term25116.getClass(), "defaultArgName", null);
        term25120 = new Integer(0);
        term25122 = new Integer(0);
        term25124 = new Integer(0);
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
        args[1] = term25120;
        args[2] = null;
        args[3] = term25122;
        args[4] = term25124;
        callMethod(klass, "renderOptions", argTypes, term25116, args);
    }

};


