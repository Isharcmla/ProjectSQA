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

public class HelpFormatter_printHelp_110574461768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25882;
     Object term25886;
     Object term25888;

    public HelpFormatter_printHelp_110574461768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25882 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term25882, term25882.getClass(), "defaultWidth", 0);
        setIntField(term25882, term25882.getClass(), "defaultLeftPad", 0);
        setIntField(term25882, term25882.getClass(), "defaultDescPad", 0);
        setField(term25882, term25882.getClass(), "defaultSyntaxPrefix", null);
        setField(term25882, term25882.getClass(), "defaultNewLine", null);
        setField(term25882, term25882.getClass(), "defaultOptPrefix", null);
        setField(term25882, term25882.getClass(), "defaultLongOptPrefix", null);
        setField(term25882, term25882.getClass(), "longOptSeparator", null);
        setField(term25882, term25882.getClass(), "defaultArgName", null);
        setField(term25882, term25882.getClass(), "optionComparator", null);
        term25886 = new Integer(0);
        term25888 = new Boolean(false);
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
        args[0] = term25886;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        args[4] = null;
        args[5] = term25888;
        callMethod(klass, "printHelp", argTypes, term25882, args);
    }

};


