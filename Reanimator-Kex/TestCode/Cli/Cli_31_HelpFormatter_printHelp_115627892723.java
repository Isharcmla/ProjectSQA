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

public class HelpFormatter_printHelp_115627892723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1259;
     Object term1315;

    public HelpFormatter_printHelp_115627892723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1259 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term1290 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term1259, term1259.getClass(), "defaultWidth", 74);
        setIntField(term1259, term1259.getClass(), "defaultLeftPad", 1);
        setIntField(term1259, term1259.getClass(), "defaultDescPad", 3);
        setField(term1259, term1259.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term1259, term1259.getClass(), "defaultNewLine", "\n");
        setField(term1259, term1259.getClass(), "defaultOptPrefix", "-");
        setField(term1259, term1259.getClass(), "defaultLongOptPrefix", "--");
        setField(term1259, term1259.getClass(), "longOptSeparator", " ");
        setField(term1259, term1259.getClass(), "defaultArgName", "arg");
        setField(term1259, term1259.getClass(), "optionComparator", term1290);
        HashMap term1316 = new HashMap();
        HashMap term1321 = new HashMap();
        ArrayList term1326 = new ArrayList();
        HashMap term1330 = new HashMap();
        term1315 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term1315, term1315.getClass(), "shortOpts", term1316);
        setField(term1315, term1315.getClass(), "longOpts", term1321);
        setField(term1315, term1315.getClass(), "requiredOpts", term1326);
        setField(term1315, term1315.getClass(), "optionGroups", term1330);
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
        args[0] = "hRNSzYYIrc";
        args[1] = "RMFIsYGgne";
        args[2] = term1315;
        args[3] = "NRdvgJlhkX";
        callMethod(klass, "printHelp", argTypes, term1259, args);
    }

};


