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

public class HelpFormatter_printHelp_115627892765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26481;

    public HelpFormatter_printHelp_115627892765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26481 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term26481, term26481.getClass(), "defaultWidth", 0);
        setIntField(term26481, term26481.getClass(), "defaultLeftPad", 0);
        setIntField(term26481, term26481.getClass(), "defaultDescPad", 0);
        setField(term26481, term26481.getClass(), "defaultSyntaxPrefix", null);
        setField(term26481, term26481.getClass(), "defaultNewLine", null);
        setField(term26481, term26481.getClass(), "defaultOptPrefix", null);
        setField(term26481, term26481.getClass(), "defaultLongOptPrefix", null);
        setField(term26481, term26481.getClass(), "longOptSeparator", null);
        setField(term26481, term26481.getClass(), "defaultArgName", null);
        setField(term26481, term26481.getClass(), "optionComparator", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.apache.commons.cli.Options");
        argTypes[3] = Class.forName("java.lang.String");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "printHelp", argTypes, term26481, args);
    }

};


