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

public class HelpFormatter_printHelp_61872843525 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1527;
     Object term1559;
     Object term1585;

    public HelpFormatter_printHelp_61872843525() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1527 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter"));
        Object term1558 = newInstance(Class.forName("org.apache.commons.cli.HelpFormatter$OptionComparator"));
        setIntField(term1527, term1527.getClass(), "defaultWidth", 74);
        setIntField(term1527, term1527.getClass(), "defaultLeftPad", 1);
        setIntField(term1527, term1527.getClass(), "defaultDescPad", 3);
        setField(term1527, term1527.getClass(), "defaultSyntaxPrefix", "usage: ");
        setField(term1527, term1527.getClass(), "defaultNewLine", "\n");
        setField(term1527, term1527.getClass(), "defaultOptPrefix", "-");
        setField(term1527, term1527.getClass(), "defaultLongOptPrefix", "--");
        setField(term1527, term1527.getClass(), "longOptSeparator", " ");
        setField(term1527, term1527.getClass(), "defaultArgName", "arg");
        setField(term1527, term1527.getClass(), "optionComparator", term1558);
        term1559 = new Integer(391863371);
        HashMap term1586 = new HashMap();
        HashMap term1591 = new HashMap();
        ArrayList term1596 = new ArrayList();
        HashMap term1600 = new HashMap();
        term1585 = newInstance(Class.forName("org.apache.commons.cli.Options"));
        setField(term1585, term1585.getClass(), "shortOpts", term1586);
        setField(term1585, term1585.getClass(), "longOpts", term1591);
        setField(term1585, term1585.getClass(), "requiredOpts", term1596);
        setField(term1585, term1585.getClass(), "optionGroups", term1600);
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
        args[0] = term1559;
        args[1] = "oVcInYnLWB";
        args[2] = "aJlieCFVtF";
        args[3] = term1585;
        args[4] = "ZiaGIbnzTs";
        callMethod(klass, "printHelp", argTypes, term1527, args);
    }

};


