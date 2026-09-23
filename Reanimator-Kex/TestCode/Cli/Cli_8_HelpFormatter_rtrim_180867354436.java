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

public class HelpFormatter_rtrim_180867354436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5360;

    public HelpFormatter_rtrim_180867354436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5360 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term5360, term5360.getClass(), "defaultWidth", 74);
        setIntField(term5360, term5360.getClass(), "defaultLeftPad", 1);
        setIntField(term5360, term5360.getClass(), "defaultDescPad", 3);
        setField(term5360, term5360.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term5360, term5360.getClass(), "defaultNewLine", "\n");
        setField(term5360, term5360.getClass(), "defaultOptPrefix", "-");
        setField(term5360, term5360.getClass(), "defaultLongOptPrefix", "--");
        setField(term5360, term5360.getClass(), "defaultArgName", "arg");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "onpbIeEKoi";
        callMethod(klass, "rtrim", argTypes, term5360, args);
    }

};


