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

public class HelpFormatter_printOptions_199678283571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25164;
     Object term25168;
     Object term25170;
     Object term25172;

    public HelpFormatter_printOptions_199678283571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25164 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        setIntField(term25164, term25164.getClass(), "defaultWidth", 0);
        setIntField(term25164, term25164.getClass(), "defaultLeftPad", 0);
        setIntField(term25164, term25164.getClass(), "defaultDescPad", 0);
        setField(term25164, term25164.getClass(), "defaultSyntaxPrefix", null);
        setField(term25164, term25164.getClass(), "defaultNewLine", null);
        setField(term25164, term25164.getClass(), "defaultOptPrefix", null);
        setField(term25164, term25164.getClass(), "defaultLongOptPrefix", null);
        setField(term25164, term25164.getClass(), "defaultArgName", null);
        setField(term25164, term25164.getClass(), "optionComparator", null);
        term25168 = new Integer(0);
        term25170 = new Integer(0);
        term25172 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.io.PrintWriter");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.apache.commons.cli.Options");
        argTypes[3] = int.class;
        argTypes[4] = int.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term25168;
        args[2] = null;
        args[3] = term25170;
        args[4] = term25172;
        callMethod(klass, "printOptions", argTypes, term25164, args);
    }

};


