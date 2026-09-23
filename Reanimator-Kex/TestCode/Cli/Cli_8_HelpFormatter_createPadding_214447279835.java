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

public class HelpFormatter_createPadding_214447279835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5316;
     Object term5344;

    public HelpFormatter_createPadding_214447279835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5316 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term5316, term5316.getClass(), "defaultWidth", 74);
        setIntField(term5316, term5316.getClass(), "defaultLeftPad", 1);
        setIntField(term5316, term5316.getClass(), "defaultDescPad", 3);
        setField(term5316, term5316.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term5316, term5316.getClass(), "defaultNewLine", "\n");
        setField(term5316, term5316.getClass(), "defaultOptPrefix", "-");
        setField(term5316, term5316.getClass(), "defaultLongOptPrefix", "--");
        setField(term5316, term5316.getClass(), "defaultArgName", "arg");
        term5344 = new Integer(-817164822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term5344;
        callMethod(klass, "createPadding", argTypes, term5316, args);
    }

};


