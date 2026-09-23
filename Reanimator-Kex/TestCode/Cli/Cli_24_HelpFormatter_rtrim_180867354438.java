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

public class HelpFormatter_rtrim_180867354438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5522;

    public HelpFormatter_rtrim_180867354438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5522 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term5550 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term5522, term5522.getClass(), "defaultWidth", 74);
        setIntField(term5522, term5522.getClass(), "defaultLeftPad", 1);
        setIntField(term5522, term5522.getClass(), "defaultDescPad", 3);
        setField(term5522, term5522.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term5522, term5522.getClass(), "defaultNewLine", "\n");
        setField(term5522, term5522.getClass(), "defaultOptPrefix", "-");
        setField(term5522, term5522.getClass(), "defaultLongOptPrefix", "--");
        setField(term5522, term5522.getClass(), "defaultArgName", "arg");
        setField(term5522, term5522.getClass(), "optionComparator", term5550);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "onpbIeEKoi";
        callMethod(klass, "rtrim", argTypes, term5522, args);
    }

};


