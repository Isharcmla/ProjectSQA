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
import java.util.HashMap;
import java.util.ArrayList;
import java.lang.Boolean;

public class HelpFormatter_printHelp_29639799124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1392;
     Object term1448;
     Object term1480;

    public HelpFormatter_printHelp_29639799124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1392 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term1423 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term1392, term1392.getClass(), "defaultWidth", 74);
        setIntField(term1392, term1392.getClass(), "defaultLeftPad", 1);
        setIntField(term1392, term1392.getClass(), "defaultDescPad", 3);
        setField(term1392, term1392.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term1392, term1392.getClass(), "defaultNewLine", "\n");
        setField(term1392, term1392.getClass(), "defaultOptPrefix", "-");
        setField(term1392, term1392.getClass(), "defaultLongOptPrefix", "--");
        setField(term1392, term1392.getClass(), "longOptSeparator", " ");
        setField(term1392, term1392.getClass(), "defaultArgName", "arg");
        setField(term1392, term1392.getClass(), "optionComparator", term1423);
        HashMap term1449 = new HashMap();
        HashMap term1454 = new HashMap();
        ArrayList term1459 = new ArrayList();
        HashMap term1463 = new HashMap();
        term1448 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term1448, term1448.getClass(), "shortOpts", term1449);
        setField(term1448, term1448.getClass(), "longOpts", term1454);
        setField(term1448, term1448.getClass(), "requiredOpts", term1459);
        setField(term1448, term1448.getClass(), "optionGroups", term1463);
        term1480 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.apache.commons.cli.Options");
        argTypes[3] = Class.forName("java.lang.String");
        argTypes[4] = boolean.class;
        Object[] args = new Object[5];
        args[0] = "uuaPigETmJ";
        args[1] = "MxlszYVzRf";
        args[2] = term1448;
        args[3] = "LQFpaHEwXR";
        args[4] = term1480;
        callMethod(klass, "printHelp", argTypes, term1392, args);
    }

};


