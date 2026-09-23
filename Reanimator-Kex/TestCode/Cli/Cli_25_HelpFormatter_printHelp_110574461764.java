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
import java.lang.Boolean;

public class HelpFormatter_printHelp_110574461764 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25112;
     Object term25116;
     Object term25118;

    public HelpFormatter_printHelp_110574461764() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25112 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term25112, term25112.getClass(), "defaultWidth", 0);
        setIntField(term25112, term25112.getClass(), "defaultLeftPad", 0);
        setIntField(term25112, term25112.getClass(), "defaultDescPad", 0);
        setField(term25112, term25112.getClass(), "defaultSyntaxPrefix", null);
        setField(term25112, term25112.getClass(), "defaultNewLine", null);
        setField(term25112, term25112.getClass(), "defaultOptPrefix", null);
        setField(term25112, term25112.getClass(), "defaultLongOptPrefix", null);
        setField(term25112, term25112.getClass(), "defaultArgName", null);
        setField(term25112, term25112.getClass(), "optionComparator", null);
        term25116 = new Integer(0);
        term25118 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("org.apache.commons.cli.Options");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = boolean.class;
        Object[] args = new Object[6];
        args[0] = term25116;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = term25118;
        callMethod(klass, "printHelp", argTypes, term25112, args);
    }

};


