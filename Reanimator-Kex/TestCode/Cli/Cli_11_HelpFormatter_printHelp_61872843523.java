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
import java.lang.Integer;
import java.util.HashMap;
import java.util.ArrayList;

public class HelpFormatter_printHelp_61872843523 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1323;
     Object term1352;
     Object term1378;

    public HelpFormatter_printHelp_61872843523() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1323 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term1351 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term1323, term1323.getClass(), "defaultWidth", 74);
        setIntField(term1323, term1323.getClass(), "defaultLeftPad", 1);
        setIntField(term1323, term1323.getClass(), "defaultDescPad", 3);
        setField(term1323, term1323.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term1323, term1323.getClass(), "defaultNewLine", "\n");
        setField(term1323, term1323.getClass(), "defaultOptPrefix", "-");
        setField(term1323, term1323.getClass(), "defaultLongOptPrefix", "--");
        setField(term1323, term1323.getClass(), "defaultArgName", "arg");
        setField(term1323, term1323.getClass(), "optionComparator", term1351);
        term1352 = new Integer(391863371);
        HashMap term1379 = new HashMap();
        HashMap term1384 = new HashMap();
        ArrayList term1389 = new ArrayList();
        HashMap term1393 = new HashMap();
        term1378 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term1378, term1378.getClass(), "shortOpts", term1379);
        setField(term1378, term1378.getClass(), "longOpts", term1384);
        setField(term1378, term1378.getClass(), "requiredOpts", term1389);
        setField(term1378, term1378.getClass(), "optionGroups", term1393);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.cli.HelpFormatter");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("org.apache.commons.cli.Options");
        argTypes[4] = Class.forName("java.lang.String");
        Object[] args = new Object[5];
        args[0] = term1352;
        args[1] = "LQFpaHEwXR";
        args[2] = "oVcInYnLWB";
        args[3] = term1378;
        args[4] = "aJlieCFVtF";
        callMethod(klass, "printHelp", argTypes, term1323, args);
    }

};


