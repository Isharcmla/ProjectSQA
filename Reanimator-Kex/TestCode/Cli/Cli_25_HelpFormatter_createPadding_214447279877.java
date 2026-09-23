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

public class HelpFormatter_createPadding_214447279877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25214;
     Object term25218;

    public HelpFormatter_createPadding_214447279877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25214 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term25214, term25214.getClass(), "defaultWidth", 0);
        setIntField(term25214, term25214.getClass(), "defaultLeftPad", 0);
        setIntField(term25214, term25214.getClass(), "defaultDescPad", 0);
        setField(term25214, term25214.getClass(), "defaultSyntaxPrefix", null);
        setField(term25214, term25214.getClass(), "defaultNewLine", null);
        setField(term25214, term25214.getClass(), "defaultOptPrefix", null);
        setField(term25214, term25214.getClass(), "defaultLongOptPrefix", null);
        setField(term25214, term25214.getClass(), "defaultArgName", null);
        setField(term25214, term25214.getClass(), "optionComparator", null);
        term25218 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term25218;
        callMethod(klass, "createPadding", argTypes, term25214, args);
    }

};


