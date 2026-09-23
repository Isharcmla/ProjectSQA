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
import java.lang.Boolean;

public class HelpFormatter_appendOption_173290326764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25080;
     Object term25084;

    public HelpFormatter_appendOption_173290326764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25080 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term25080, term25080.getClass(), "defaultWidth", 0);
        setIntField(term25080, term25080.getClass(), "defaultLeftPad", 0);
        setIntField(term25080, term25080.getClass(), "defaultDescPad", 0);
        setField(term25080, term25080.getClass(), "defaultSyntaxPrefix", null);
        setField(term25080, term25080.getClass(), "defaultNewLine", null);
        setField(term25080, term25080.getClass(), "defaultOptPrefix", null);
        setField(term25080, term25080.getClass(), "defaultLongOptPrefix", null);
        setField(term25080, term25080.getClass(), "defaultArgName", null);
        term25084 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuffer");
        argTypes[1] = Class.forName("org.apache.commons.cli.Option");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term25084;
        callMethod(klass, "appendOption", argTypes, term25080, args);
    }

};


